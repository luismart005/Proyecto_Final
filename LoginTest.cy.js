describe('LoginTest', () => {
  it('loginExitoso', () => {
    cy.visit('https://www.ejemplo.com/login');
    cy.get('#usuario').type('admin');
    cy.get('#password').type('1234');
    cy.get('#btnLogin').click();
    cy.get('.dashboard').click();
    expect(mensajeBienvenida).to.equal('Bienvenido');
  });
});
