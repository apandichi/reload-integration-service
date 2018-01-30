package reload.integration.service

import grails.transaction.Transactional
import groovy.util.logging.Slf4j

@Slf4j
class RealIntegrationService {

    def serviceMethod() {
        log.info('Calling REAL integration service method')
        return "REAL"
    }
}
