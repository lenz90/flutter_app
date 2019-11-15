package com.example.flutter_app;

import android.os.Bundle;

import java.util.Map;

import io.flutter.app.FlutterActivity;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.GeneratedPluginRegistrant;


public class MainActivity extends FlutterActivity {
    private static final String CHANNEL = "com.flutter.epic/epic";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GeneratedPluginRegistrant.registerWith(this);

        new MethodChannel(getFlutterView(), CHANNEL)
                .setMethodCallHandler(new MethodChannel.MethodCallHandler() {
                  @Override
                  public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                      final Map<String, Object> args = methodCall.arguments();
                      if (methodCall.method.equals("Printy")) {
                          String val1 = (String) args.get("val1");
                          if(val1.equals("1")) {
                              result.success("Yay");
                          } else {
                              result.success("NAy");
                          }

                      }
                  }
              }
        );
    }
}