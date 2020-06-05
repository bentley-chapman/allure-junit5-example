package io.qameta.junit5;

import io.qameta.allure.listener.StepLifecycleListener;
import io.qameta.allure.model.StepResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class AllureListener implements StepLifecycleListener {

    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void beforeStepStart(StepResult result) {
        LOGGER.fatal("Starting step: {}", result.getName());
    }

}
