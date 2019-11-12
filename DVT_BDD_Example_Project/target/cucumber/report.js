$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Unit-Tests/DVT_BDD/Features/BDD_Feature_Files/NPW_EasiPlus_Quote_PreDEV.feature");
formatter.feature({
  "line": 1,
  "name": "EasiPlus Quote",
  "description": "",
  "id": "easiplus-quote",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "1- Navigate and Validate EasiPlus Quote",
  "description": "",
  "id": "easiplus-quote;1--navigate-and-validate-easiplus-quote",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I have navigated to EasiPlus Quote PreDEV",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "EasiPlus Quote PreDEV Page loads",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "click Select Cover Me and My Direct Family",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Who do you want to cover Header Loads",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "select Myself from the Select Who You Want to Cover dropdown",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#When entering an \u003cInvalidAge\u003e"
    },
    {
      "line": 10,
      "value": "#Then the Premium amount remains \"R0\" and an Error message is displayed"
    }
  ],
  "line": 11,
  "name": "entering a \u003cValidAge\u003e and  selecting the \u003cCoverAmount\u003e from the slider",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "\u003cPremium\u003e amount is calculated",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "clicking Add To Cover",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "\u003cPremium\u003e is added to Quote Summary",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "clicking the Dropdown icon",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the Quote Summary is minimized or maximized",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 17,
      "value": "#When clicking the Buy Online button"
    },
    {
      "line": 18,
      "value": "#Then the User is redirected to the EasiPlus Application"
    }
  ],
  "line": 20,
  "name": "",
  "description": "",
  "id": "easiplus-quote;1--navigate-and-validate-easiplus-quote;",
  "rows": [
    {
      "cells": [
        "ValidAge",
        "CoverAmount",
        "Premium",
        "InvalidAge"
      ],
      "line": 21,
      "id": "easiplus-quote;1--navigate-and-validate-easiplus-quote;;1"
    },
    {
      "cells": [
        "\"27\"",
        "\"R25000\"",
        "\"R80\"",
        "\"12\""
      ],
      "line": 22,
      "id": "easiplus-quote;1--navigate-and-validate-easiplus-quote;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8023849000,
  "status": "passed"
});
formatter.before({
  "duration": 8060500,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "1- Navigate and Validate EasiPlus Quote",
  "description": "",
  "id": "easiplus-quote;1--navigate-and-validate-easiplus-quote;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I have navigated to EasiPlus Quote PreDEV",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "EasiPlus Quote PreDEV Page loads",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "click Select Cover Me and My Direct Family",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Who do you want to cover Header Loads",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "select Myself from the Select Who You Want to Cover dropdown",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#When entering an \u003cInvalidAge\u003e"
    },
    {
      "line": 10,
      "value": "#Then the Premium amount remains \"R0\" and an Error message is displayed"
    }
  ],
  "line": 11,
  "name": "entering a \"27\" and  selecting the \"R25000\" from the slider",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "\"R80\" amount is calculated",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "clicking Add To Cover",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "\"R80\" is added to Quote Summary",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "clicking the Dropdown icon",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the Quote Summary is minimized or maximized",
  "keyword": "Then "
});
formatter.match({
  "location": "NPW_Step_Definitions.i_have_navigated_to_EasiPlus_Quote_PreDEV()"
});
formatter.result({
  "duration": 12507953300,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.easiplus_Quote_PreDEV_Page_loads()"
});
formatter.result({
  "duration": 445532300,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.click_Select_Cover_Me_and_My_Direct_Family()"
});
formatter.result({
  "duration": 1104970900,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.who_do_you_want_to_cover_Header_Loads()"
});
formatter.result({
  "duration": 341108800,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.select_Myself_from_the_Select_Who_You_Want_to_Cover_dropdown()"
});
formatter.result({
  "duration": 887664200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "27",
      "offset": 12
    },
    {
      "val": "R25000",
      "offset": 36
    }
  ],
  "location": "NPW_Step_Definitions.entering_a_and_selecting_the_from_the_slider(String,String)"
});
formatter.result({
  "duration": 1100740900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "R80",
      "offset": 1
    }
  ],
  "location": "NPW_Step_Definitions.amount_is_calculated(String)"
});
formatter.result({
  "duration": 1676086900,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.clicking_Add_To_Cover()"
});
formatter.result({
  "duration": 985690600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "R80",
      "offset": 1
    }
  ],
  "location": "NPW_Step_Definitions.is_added_to_Quote_Summary(String)"
});
formatter.result({
  "duration": 1712358300,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.clicking_the_Dropdown_icon()"
});
formatter.result({
  "duration": 607838600,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.the_Quote_Summary_is_minimized_or_maximized()"
});
formatter.result({
  "duration": 38400,
  "status": "passed"
});
formatter.after({
  "duration": 801233300,
  "status": "passed"
});
formatter.after({
  "duration": 55000,
  "status": "passed"
});
});