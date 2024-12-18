package X;

import android.os.Handler;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;

/* renamed from: X.BDw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC25222BDw {
    int createFbaProcessingGraph(int i, int i2, C175937s8 c175937s8);

    int createManualProcessingGraph(int i, int i2, C175937s8 c175937s8);

    int fillAudioBuffer(C73493YFw c73493YFw);

    AudioGraphClientProvider getAudioGraphClientProvider();

    String getDebugInfo();

    boolean isSubgraphInserted();

    void onReceivedAudioMixingMode(int i);

    int pause();

    void prepareRecorder(C177547uo c177547uo, InterfaceC176077sQ interfaceC176077sQ, Handler handler, InterfaceC176157sY interfaceC176157sY, Handler handler2);

    void release();

    int resume();

    String snapshot();

    void startInput(InterfaceC176157sY interfaceC176157sY, Handler handler);

    void stopInput(InterfaceC176157sY interfaceC176157sY, Handler handler);

    void updateOutputRouteState(int i);
}
