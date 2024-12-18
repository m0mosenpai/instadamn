package com.facebook.mediastreaming.client.livestreaming;

import X.AbstractC25229BEm;
import X.C09170dP;
import X.C14360o3;
import X.C53684NoZ;
import X.C55691OoI;
import X.C62686SMa;
import X.C64078Syu;
import android.os.Handler;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient;
import com.facebook.mediastreaming.client.livestreaming.config.LiveStreamingConfig;
import com.facebook.mediastreaming.opt.source.event.AndroidEventMessageInputSource;
import com.facebook.mediastreaming.opt.source.video.AndroidVideoInput;
import com.facebook.mediastreaming.opt.transport.SSLFactoryHolder;
import com.facebook.mediastreaming.opt.transport.TraceEventObserverHolder;
import com.facebook.mediastreaming.opt.transport.TransportCallbacks;
import com.facebook.mediastreaming.opt.transport.TransportSinkFactoryHolder;
import java.util.List;

/* loaded from: classes9.dex */
public final class LiveStreamingClientImpl implements LiveStreamingClient {
    public static final C53684NoZ Companion = new Object();
    public final HybridData mHybridData;
    public final C64078Syu sessionCallbacksDelegate;
    public final C55691OoI transportCallbacksDelegate;

    public LiveStreamingClientImpl(LiveStreamingConfig liveStreamingConfig, AndroidVideoInput androidVideoInput, List list, AndroidEventMessageInputSource androidEventMessageInputSource, LiveStreamingClient.LiveStreamingSessionCallbacks liveStreamingSessionCallbacks, Handler handler, TransportCallbacks transportCallbacks, TransportSinkFactoryHolder transportSinkFactoryHolder, SSLFactoryHolder sSLFactoryHolder, List list2, C62686SMa c62686SMa, TraceEventObserverHolder traceEventObserverHolder) {
        AbstractC25229BEm.A1I(androidVideoInput, 2, handler);
        C14360o3.A0B(sSLFactoryHolder, 9);
        C64078Syu c64078Syu = new C64078Syu(handler, liveStreamingSessionCallbacks, c62686SMa);
        this.sessionCallbacksDelegate = c64078Syu;
        C55691OoI c55691OoI = new C55691OoI(handler, transportCallbacks);
        this.transportCallbacksDelegate = c55691OoI;
        this.mHybridData = initHybrid(liveStreamingConfig, c64078Syu, androidVideoInput, list, androidEventMessageInputSource, c55691OoI, null, sSLFactoryHolder, list2, null);
    }

    public static final native HybridData initHybrid(LiveStreamingConfig liveStreamingConfig, LiveStreamingClient.LiveStreamingSessionCallbacks liveStreamingSessionCallbacks, AndroidVideoInput androidVideoInput, List list, AndroidEventMessageInputSource androidEventMessageInputSource, TransportCallbacks transportCallbacks, TransportSinkFactoryHolder transportSinkFactoryHolder, SSLFactoryHolder sSLFactoryHolder, List list2, TraceEventObserverHolder traceEventObserverHolder);

    @Override // com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient
    public native void pause(boolean z);

    public native void resume();

    public native void setAudioEnhancementPreLivePlayback(boolean z);

    public native void setAudioEnhancementPreLivePlaybackRewind();

    public native void setAudioEnhancementPreLiveRecording(boolean z);

    public native void setAudioEnhancementPreLiveRecordingReset();

    @Override // com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient
    public native void start();

    @Override // com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient
    public native void stop(boolean z);

    @Override // com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient
    public native void updateAspectRatio(float f);

    public native void updateAudioEnhancementEngine(boolean z, boolean z2);

    public native void updateConfig(LiveStreamingConfig liveStreamingConfig);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.NoZ] */
    static {
        C09170dP.A0C("mediastreaming");
    }
}
