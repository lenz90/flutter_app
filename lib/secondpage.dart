import 'package:flutter/material.dart';

class SecondPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return Scaffold(
        appBar: AppBar(
            title: Text("La segunda página es icreible")
        ),
        body: Center(
          child: RaisedButton(
              onPressed: () {
                Navigator.pop(context);
              },
              child: Text("Regresar")
          ),
        )
    );
  }
}
