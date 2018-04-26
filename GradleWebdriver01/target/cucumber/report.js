$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "launch google",
  "description": "",
  "id": "launch-google",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "launch-google;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "i go to google",
  "keyword": "Given "
});
formatter.match({
  "location": "FirstAttemptTest.i_go_to_google()"
});
formatter.result({
  "duration": 19074382310,
  "status": "passed"
});
});