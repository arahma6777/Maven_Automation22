/// <reference types="cypress" />
describe('Orthopedics Supplies and Services', function() {
    let explicitTimeout = 7000
    it('Navigates to Cardinal Health and click on Orthopedic Services and click on download the infographic',() =>{
cy.visit('https://www.cardinalhealth.com/en.html');
cy.xpath('//*[@data-title="Services"]',{timeout:explicitTimeout}).click();
cy.xpath('//*[text()="Ambulatory Surgery Center"]',{timeout:explicitTimeout}).click();
cy.xpath('//*[text()="Orthopedic Supplies and Services"]',{timeout:explicitTimeout}).click();
cy.xpath('//*[text()="Download the infographic"]',{timeout:explicitTimeout}).click();

    })
})
