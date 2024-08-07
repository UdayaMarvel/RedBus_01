Feature: BusBooking

Background: Application Launch
Given Launch the application "https://www.redbus.in"

@Sanity
Scenario Outline: Book a bus in RedBus application
When User enters the value in from place "<FromPlace>"
And User enters the value in to place "<ToPlace>"
And User clicks on date
And User selects a date in the Date Dropdown
And User clicks on search button
And Validate the buses displayed as per given value

Examples:
|FromPlace					|ToPlace							|
|Chennai						|Tiruchchirapali			|


