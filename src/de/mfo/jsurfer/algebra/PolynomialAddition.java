/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package de.mfo.jsurfer.algebra;

/**
 *
 * @author Christian Stussak <christian at knorf.de>
 */
public class PolynomialAddition implements PolynomialOperation
{
    public PolynomialOperation firstOperand;
    public PolynomialOperation secondOperand;

    public PolynomialAddition( PolynomialOperation firstOperand, PolynomialOperation secondOperand )
    {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
    
    public < RETURN_TYPE, PARAM_TYPE > RETURN_TYPE accept( Visitor< RETURN_TYPE, PARAM_TYPE > visitor, PARAM_TYPE arg )
    {
        return visitor.visit( this, arg );
    }    
}