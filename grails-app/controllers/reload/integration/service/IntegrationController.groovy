package reload.integration.service

import groovy.util.logging.Slf4j

@Slf4j
class IntegrationController {

    def realIntegrationService

    def index() {
        def result = realIntegrationService.serviceMethod()
        render(text: result)
    }
}
