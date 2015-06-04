package algorithm;
class FlightInfo {
  String from;

  String to;

  int distance;

  boolean skip; // used in backtracking

  FlightInfo(String f, String t, int d) {
    from = f;
    to = t;
    distance = d;
    skip = false;
  }
}