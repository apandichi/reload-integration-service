package reload.integration.service

import groovy.util.logging.Slf4j

@Slf4j
class FakeIntegrationService {

    def serviceMethod() {
        log.info('Calling FAKE integration service method')
        return "FAKE"
    }
}
