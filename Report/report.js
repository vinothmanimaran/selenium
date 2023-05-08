$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/fbregistration.feature");
formatter.feature({
  "name": "To validate the account creation of fb application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature2"
    }
  ]
});
formatter.scenario({
  "name": "To create new account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "To launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "fbRegistration.to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch url of fb application",
  "keyword": "When "
});
formatter.match({
  "location": "fbRegistration.to_launch_url_of_fb_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the create new account button",
  "keyword": "And "
});
formatter.match({
  "location": "fbRegistration.to_click_the_create_new_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass firstname in firstname text box",
  "rows": [
    {
      "cells": [
        "firstname1",
        "vinoth"
      ]
    },
    {
      "cells": [
        "firstbname2",
        "sam"
      ]
    },
    {
      "cells": [
        "firstname3",
        "vijay"
      ]
    },
    {
      "cells": [
        "firstname4",
        "priya"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "fbRegistration.to_pass_firstname_in_firstname_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass secondname in secondname text box",
  "keyword": "And "
});
formatter.match({
  "location": "fbRegistration.to_pass_secondname_in_secondname_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass mobileno or email in email text box",
  "rows": [
    {
      "cells": [
        "password1",
        "password2",
        "password3"
      ]
    },
    {
      "cells": [
        "5136531216",
        "ssdvfbtv",
        "58731641"
      ]
    },
    {
      "cells": [
        "efsdv56",
        "cds6562",
        "95312465"
      ]
    },
    {
      "cells": [
        "ec298652",
        "cdsdcc",
        "65262653"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "fbRegistration.to_pass_mobileno_or_email_in_email_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To create new password using new password text box",
  "keyword": "And "
});
formatter.match({
  "location": "fbRegistration.to_create_new_password_using_new_password_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TO close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "fbRegistration.to_close_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
});