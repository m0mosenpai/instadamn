package com.facebook.rsys.callmanager.gen;

import com.facebook.rsys.audiomixerholder.gen.AudioMixerHolder;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy;
import com.facebook.rsys.execution.gen.TaskExecutor;

/* loaded from: classes9.dex */
public abstract class CallManagerClient {
    public abstract AudioMixerHolder getAudioMixerHolder();

    public abstract AudioModule getAudioModule();

    public abstract EnvironmentVariablesProxy getEnvironmentVariables();

    public abstract TaskExecutor getTaskExecutor();
}
