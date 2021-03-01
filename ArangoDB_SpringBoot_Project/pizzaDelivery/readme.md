Below is the syntax for running the test and creating the report.

$ artillery run -o <report_name> <test_file>.yml

The command -o <report_name> will generate the report after completion of the test.
This report will be generated in json file.
So we must convert it into the html format in order to see it in the browser.

So, below is the command to convert above generated report to html

$ artillery report <report_name>

