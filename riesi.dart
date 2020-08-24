import 'dart:io';

void main() {
  stdout.writeln("Riesi: False");
  stdout.writeln("Riesi? ");
  String riesi = stdin.readLineSync();
  if (riesi == "y") {
    stdout.writeln("Riesi: True");
  } else {
    stdout.writeln("Riesi: False");
  }
}
