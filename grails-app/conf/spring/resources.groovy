import grails.util.Environment
import reload.integration.service.FakeIntegrationService
import reload.integration.service.RealIntegrationService

// Place your Spring DSL code here
beans = {
	Environment.executeForCurrentEnvironment {
		development {
			realIntegrationService(FakeIntegrationService) {}
		}

		production {
			realIntegrationService(RealIntegrationService) {}
		}
	}
}
