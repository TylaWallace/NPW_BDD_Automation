$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Unit-Tests/DVT_BDD/Features/BDD_Feature_Files/NPW_EasiPlus_App.feature");
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
  "line": 9,
  "name": "entering a \u003cValidAge\u003e and  selecting the \u003cCoverAmount\u003e from the slider",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "\u003cPremium\u003e amount is calculated",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "clicking Add To Cover",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "\u003cSumPremium\u003e is added to Quote Summary",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "clicking the Dropdown icon",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the Quote Summary is minimized or maximized",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "clicking the Buy Online button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the User is redirected to the EasiPlus Application",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "EPA Personal Details Page Loads",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Select a Title \u003cTitle\u003e for Personal Details",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "enter FirstName \u003cFirstName\u003e for Personal Details",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "enter Surname \u003cSurname\u003e for Personal Details",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "enter ID \u003cID\u003e for Personal Details",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "enter ContactNo \u003cContactNo\u003e for Personal Details",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "enter Email \u003cEmail\u003e for Personal Details",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "click continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "EPA Residential Address Page Loads",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "enter Street Number \u003cStreetNo\u003e for Residential Address",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "enter Street Name \u003cStreetName\u003e for Residential Address",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "enter Suburb \u003cSuburb\u003e for Residential Address",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "enter City \u003cCity\u003e for Residential Address",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "enter PostalCode \u003cPostalCode\u003e for Residential Address",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "click continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Family Member Details Page Load",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Add a Parent Dependant \u003cParentDependent\u003e \u003cTitle\u003e \u003cDependentFirstName\u003e \u003cSurname\u003e \u003cDependentDOB\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "click continue button",
  "keyword": "Then "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "easiplus-quote;1--navigate-and-validate-easiplus-quote;",
  "rows": [
    {
      "cells": [
        "ValidAge",
        "CoverAmount",
        "Premium",
        "InvalidAge",
        "SumPremium",
        "Title",
        "FirstName",
        "Surname",
        "ID",
        "ContactNo",
        "Email",
        "StreetNo",
        "StreetName",
        "Suburb",
        "City",
        "PostalCode",
        "ParentDependent",
        "DependentFirstName",
        "DependentDOB"
      ],
      "line": 38,
      "id": "easiplus-quote;1--navigate-and-validate-easiplus-quote;;1"
    },
    {
      "cells": [
        "\"27\"",
        "\"R25000\"",
        "\"R 80\"",
        "\"12\"",
        "\"R80\"",
        "\"Mrs\"",
        "\"Testy-Lee!\"",
        "\"NpwA\u0027uto\"",
        "\"2709064800083\"",
        "\"0711110011\"",
        "\"TestyLeeIsATest@testemail.com\"",
        "\"14\"",
        "\"Test Street\"",
        "\"Bronx\"",
        "\"Cape Town\"",
        "\"7800\"",
        "\"Mother\"",
        "\"Mama-Testy!\"",
        "\"09/06/1974\""
      ],
      "line": 39,
      "id": "easiplus-quote;1--navigate-and-validate-easiplus-quote;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7644367000,
  "status": "passed"
});
formatter.before({
  "duration": 9795100,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
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
  "line": 9,
  "name": "entering a \"27\" and  selecting the \"R25000\" from the slider",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "\"R 80\" amount is calculated",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "clicking Add To Cover",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "\"R80\" is added to Quote Summary",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "clicking the Dropdown icon",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the Quote Summary is minimized or maximized",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "clicking the Buy Online button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the User is redirected to the EasiPlus Application",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "EPA Personal Details Page Loads",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Select a Title \"Mrs\" for Personal Details",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "enter FirstName \"Testy-Lee!\" for Personal Details",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "enter Surname \"NpwA\u0027uto\" for Personal Details",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "enter ID \"2709064800083\" for Personal Details",
  "matchedColumns": [
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "enter ContactNo \"0711110011\" for Personal Details",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "enter Email \"TestyLeeIsATest@testemail.com\" for Personal Details",
  "matchedColumns": [
    10
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "click continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "EPA Residential Address Page Loads",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "enter Street Number \"14\" for Residential Address",
  "matchedColumns": [
    11
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "enter Street Name \"Test Street\" for Residential Address",
  "matchedColumns": [
    12
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "enter Suburb \"Bronx\" for Residential Address",
  "matchedColumns": [
    13
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "enter City \"Cape Town\" for Residential Address",
  "matchedColumns": [
    14
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "enter PostalCode \"7800\" for Residential Address",
  "matchedColumns": [
    15
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "click continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Family Member Details Page Load",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Add a Parent Dependant \"Mother\" \"Mrs\" \"Mama-Testy!\" \"NpwA\u0027uto\" \"09/06/1974\"",
  "matchedColumns": [
    16,
    17,
    18,
    5,
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "click continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "NPW_Step_Definitions.i_have_navigated_to_EasiPlus_Quote_PreDEV()"
});
formatter.result({
  "duration": 16119029600,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.easiplus_Quote_PreDEV_Page_loads()"
});
formatter.result({
  "duration": 364221400,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.click_Select_Cover_Me_and_My_Direct_Family()"
});
formatter.result({
  "duration": 1407142200,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.who_do_you_want_to_cover_Header_Loads()"
});
formatter.result({
  "duration": 370168300,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.select_Myself_from_the_Select_Who_You_Want_to_Cover_dropdown()"
});
formatter.result({
  "duration": 658024100,
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
  "duration": 930241600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "R 80",
      "offset": 1
    }
  ],
  "location": "NPW_Step_Definitions.amount_is_calculated(String)"
});
formatter.result({
  "duration": 1458766800,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.clicking_Add_To_Cover()"
});
formatter.result({
  "duration": 783889500,
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
  "duration": 1493255400,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.clicking_the_Dropdown_icon()"
});
formatter.result({
  "duration": 448325900,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.the_Quote_Summary_is_minimized_or_maximized()"
});
formatter.result({
  "duration": 24000,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.clicking_the_Buy_Online_button()"
});
formatter.result({
  "duration": 471511600,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.the_User_is_redirected_to_the_EasiPlus_Application()"
});
formatter.result({
  "duration": 903222200,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.click_continue_button()"
});
formatter.result({
  "duration": 468145700,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.epa_Personal_Details_Page_Loads()"
});
formatter.result({
  "duration": 909126200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mrs",
      "offset": 16
    }
  ],
  "location": "NPW_Step_Definitions.select_a_Title_for_Personal_Details(String)"
});
formatter.result({
  "duration": 630197200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testy-Lee!",
      "offset": 17
    }
  ],
  "location": "NPW_Step_Definitions.enter_FirstName_for_Personal_Details(String)"
});
formatter.result({
  "duration": 715994500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NpwA\u0027uto",
      "offset": 15
    }
  ],
  "location": "NPW_Step_Definitions.enter_Surname_for_Personal_Details(String)"
});
formatter.result({
  "duration": 743810400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2709064800083",
      "offset": 10
    }
  ],
  "location": "NPW_Step_Definitions.enter_ID_for_Personal_Details(String)"
});
formatter.result({
  "duration": 769752000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0711110011",
      "offset": 17
    }
  ],
  "location": "NPW_Step_Definitions.enter_ContactNo_for_Personal_Details(String)"
});
formatter.result({
  "duration": 680240700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestyLeeIsATest@testemail.com",
      "offset": 13
    }
  ],
  "location": "NPW_Step_Definitions.enter_Email_for_Personal_Details(String)"
});
formatter.result({
  "duration": 767244800,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.click_continue_button()"
});
formatter.result({
  "duration": 440590700,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.epa_Residential_Address_Page_Loads()"
});
formatter.result({
  "duration": 896832200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "14",
      "offset": 21
    }
  ],
  "location": "NPW_Step_Definitions.enter_Street_Number_for_Residential_Address(String)"
});
formatter.result({
  "duration": 682570800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Street",
      "offset": 19
    }
  ],
  "location": "NPW_Step_Definitions.enter_Street_Name_for_Residential_Address(String)"
});
formatter.result({
  "duration": 734155000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bronx",
      "offset": 14
    }
  ],
  "location": "NPW_Step_Definitions.enter_Suburb_for_Residential_Address(String)"
});
formatter.result({
  "duration": 642356000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cape Town",
      "offset": 12
    }
  ],
  "location": "NPW_Step_Definitions.enter_City_for_Residential_Address(String)"
});
formatter.result({
  "duration": 696160500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7800",
      "offset": 18
    }
  ],
  "location": "NPW_Step_Definitions.enter_PostalCode_for_Residential_Address(String)"
});
formatter.result({
  "duration": 699467000,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.click_continue_button()"
});
formatter.result({
  "duration": 446542300,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.family_Member_Details_Page_Load()"
});
formatter.result({
  "duration": 990268800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mother",
      "offset": 24
    },
    {
      "val": "Mrs",
      "offset": 33
    },
    {
      "val": "Mama-Testy!",
      "offset": 39
    },
    {
      "val": "NpwA\u0027uto",
      "offset": 53
    },
    {
      "val": "09/06/1974",
      "offset": 64
    }
  ],
  "location": "NPW_Step_Definitions.add_a_Parent_Dependant(String,String,String,String,String)"
});
formatter.result({
  "duration": 3179120700,
  "status": "passed"
});
formatter.match({
  "location": "NPW_Step_Definitions.click_continue_button()"
});
formatter.result({
  "duration": 451701800,
  "status": "passed"
});
formatter.after({
  "duration": 1301024200,
  "status": "passed"
});
formatter.after({
  "duration": 87400,
  "status": "passed"
});
});