package X;

import android.os.Handler;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.audiograph.CameraAudioManager;

/* loaded from: classes4.dex */
public final class AVG implements InterfaceC25222BDw {
    public CameraAudioManager A00;

    @Override // X.InterfaceC25222BDw
    public final int fillAudioBuffer(C73493YFw c73493YFw) {
        return 0;
    }

    @Override // X.InterfaceC25222BDw
    public final String getDebugInfo() {
        return "";
    }

    @Override // X.InterfaceC25222BDw
    public final void onReceivedAudioMixingMode(int i) {
        if (i != 4 && i != 5) {
            return;
        }
        this.A00.setState(0);
    }

    @Override // X.InterfaceC25222BDw
    public final String snapshot() {
        return null;
    }

    @Override // X.InterfaceC25222BDw
    public final void updateOutputRouteState(int i) {
        this.A00.setSpeakers(i == 1);
    }

    @Override // X.InterfaceC25222BDw
    public final int createFbaProcessingGraph(int i, int i2, C175937s8 c175937s8) {
        this.A00.mCallback = c175937s8;
        return 0;
    }

    @Override // X.InterfaceC25222BDw
    public final int createManualProcessingGraph(int i, int i2, C175937s8 c175937s8) {
        throw AbstractC166987dD.A18("Audio State Machine does not use manual processing graph");
    }

    @Override // X.InterfaceC25222BDw
    public final AudioGraphClientProvider getAudioGraphClientProvider() {
        return this.A00.getAudioGraphClientProvider();
    }

    @Override // X.InterfaceC25222BDw
    public final boolean isSubgraphInserted() {
        return false;
    }

    @Override // X.InterfaceC25222BDw
    public final int pause() {
        this.A00.setState(0);
        return 0;
    }

    @Override // X.InterfaceC25222BDw
    public final void release() {
        CameraAudioManager cameraAudioManager = this.A00;
        if (cameraAudioManager.mDestroyed.compareAndSet(false, true)) {
            cameraAudioManager.mHybridData.resetNative();
            cameraAudioManager.mHybridData = null;
        }
    }

    @Override // X.InterfaceC25222BDw
    public final int resume() {
        return 0;
    }

    @Override // X.InterfaceC25222BDw
    public final void startInput(InterfaceC176157sY interfaceC176157sY, Handler handler) {
        Integer num;
        CameraAudioManager cameraAudioManager = this.A00;
        if (cameraAudioManager.getState() == 0) {
            num = C05F.A0C;
        } else {
            if (cameraAudioManager.getState() == 1) {
                num = C05F.A0N;
            }
            interfaceC176157sY.onSuccess();
        }
        cameraAudioManager.setState(num.intValue());
        interfaceC176157sY.onSuccess();
    }

    @Override // X.InterfaceC25222BDw
    public final void stopInput(InterfaceC176157sY interfaceC176157sY, Handler handler) {
        this.A00.setState(0);
        interfaceC176157sY.onSuccess();
    }

    public AVG() {
        CameraAudioManager cameraAudioManager = new CameraAudioManager(0.0f);
        this.A00 = cameraAudioManager;
        cameraAudioManager.getSampleRate();
    }

    @Override // X.InterfaceC25222BDw
    public final void prepareRecorder(C177547uo c177547uo, InterfaceC176077sQ interfaceC176077sQ, Handler handler, InterfaceC176157sY interfaceC176157sY, Handler handler2) {
        interfaceC176157sY.onSuccess();
    }
}
