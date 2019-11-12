Feature: EasiPlus Quote

  Scenario Outline: 1- Navigate and Validate EasiPlus Quote
    Given I have navigated to EasiPlus Quote
     When EasiPlus Quote Page loads
     Then click Get Quote
     When naviagted to Packages Page
     Then select Myself from the Select Who You Want to Cover dropdown
     When clicking the Remove button
     Then the section is Removed
     Then select Myself from the Select Who You Want to Cover dropdown
     When clicking the Dropdown icon
     Then the section is minimized or maximized
     When entering an <InvalidAge>
     Then the Premium amount remains "R0" and an Error message is displayed
     When entering a <ValidAge> and  selecting the <Cover> from the slider
     Then <Premium> amount is calculated
     When entering a <NewValidAge>
     Then a <NewPremium> is calculated
     Then Verify the <NewPremium> Banner
  #When clicking the Buy Online button
  #Then the User is redirected to the EasiPlus Application
  
    Examples: 
      | ValidAge | Cover     | Premium | InvalidAge | NewValidAge | NewPremium | 
      | 27       | "R30 000" | "R96"   | 12         | 62          | "R152"     | 


  Scenario Outline: 1- Navigate and Validate EasiPlus Quote
    Given I have navigated to EasiPlus Quote
     When EasiPlus Quote Page loads
     Then click Apply Now
     When naviagted to Packages Section
     Then select Me & My Direct Family cover
     When clicking the Clear All button
     Then the section is Removed
     Then select Myself from the Select Who You Want to Cover dropdown
     When clicking the Dropdown icon
     Then the Quote Summary is minimized or maximized
     Then choose who you want to cover from dropdown
     When entering an <InvalidAge>
     Then the Premium amount remains "R0" and an Error message is displayed
     When entering a <ValidAge> and  selecting the <CoverAmount> from the slider
     Then <Premium> amount is calculated
     When entering a <NewValidAge>
     Then a <NewPremium> is calculated
     Then Verify the <NewPremium> Quote Summary
  #When clicking the Buy Online button
  #Then the User is redirected to the EasiPlus Application
  
    Examples: 
      | ValidAge | CoverAmount     | Premium | InvalidAge | NewValidAge | NewPremium | 
      | 27       | "R30 000"       | "R96"   | 12         | 62          | "R152"     | 