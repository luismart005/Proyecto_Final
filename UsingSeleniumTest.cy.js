describe('UsingSeleniumTest', () => {
  it('eightComponents', () => {
    cy.visit('https://www.selenium.dev/selenium/web/web-form.html');
    expect(cy.title()).to.equal('Web form');
    cy.get('[name="my-text"]').type('Selenium');
    cy.get('button').click();
    expect(cy.get('#message').invoke('text')).to.equal('Received!');
  });
});
