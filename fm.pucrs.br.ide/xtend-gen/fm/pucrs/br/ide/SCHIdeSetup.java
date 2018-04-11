/**
 * generated by Xtext 2.12.0
 */
package fm.pucrs.br.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fm.pucrs.br.SCHRuntimeModule;
import fm.pucrs.br.SCHStandaloneSetup;
import fm.pucrs.br.ide.SCHIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class SCHIdeSetup extends SCHStandaloneSetup {
  @Override
  public Injector createInjector() {
    SCHRuntimeModule _sCHRuntimeModule = new SCHRuntimeModule();
    SCHIdeModule _sCHIdeModule = new SCHIdeModule();
    return Guice.createInjector(Modules2.mixin(_sCHRuntimeModule, _sCHIdeModule));
  }
}