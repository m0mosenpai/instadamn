package X;

import com.facebook.rsys.audiomixerholder.gen.AudioMixerHolder;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.callmanager.gen.CallManagerClient;
import com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy;
import com.facebook.rsys.execution.gen.TaskExecutor;

/* renamed from: X.Myy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52004Myy extends CallManagerClient {
    public final /* synthetic */ C55207OeK A00;

    @Override // com.facebook.rsys.callmanager.gen.CallManagerClient
    public final AudioMixerHolder getAudioMixerHolder() {
        return null;
    }

    @Override // com.facebook.rsys.callmanager.gen.CallManagerClient
    public final TaskExecutor getTaskExecutor() {
        return null;
    }

    public C52004Myy(C55207OeK c55207OeK) {
        this.A00 = c55207OeK;
    }

    @Override // com.facebook.rsys.callmanager.gen.CallManagerClient
    public final AudioModule getAudioModule() {
        return this.A00.A0F.A01;
    }

    @Override // com.facebook.rsys.callmanager.gen.CallManagerClient
    public final EnvironmentVariablesProxy getEnvironmentVariables() {
        return this.A00.A0K;
    }
}
