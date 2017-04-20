package converterassigment

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(ConverterController)
class ConverterControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Binary test return binary"() {
        given:
        def test = new ConverterController()
        when:
        test.binarytest("10")
        then:
        response.text == '1010'
    } 
    
    void "Hex test return hex"() {
        given:
        def test = new ConverterController()
        when:
        test.hextest("300")
        then:
        response.text == '12c'
    } 
    
    void "Binary test string return error 400 "() {
        given:
        def test = new ConverterController()
        when:
        test.binarytest("string test")
        then:
        response.text == 'error 400'
         
    } 
    
    void "Hex test string return error 400 "() {
        given:
        def test = new ConverterController()
        when:
        test.binarytest("string test")
        then:
        response.text == 'error 400'
         
    } 
    
}
