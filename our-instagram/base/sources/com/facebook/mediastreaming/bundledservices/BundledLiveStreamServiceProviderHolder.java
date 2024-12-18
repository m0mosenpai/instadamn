package com.facebook.mediastreaming.bundledservices;

import X.C09170dP;
import X.C14360o3;
import X.C53682NoX;
import com.facebook.mediastreaming.client.livestreaming.config.LiveStreamingConfig;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;
import com.facebook.mediastreaming.opt.dvr.DvrConfig;
import com.facebook.mediastreaming.opt.muxer.CodecMuxerFactory;
import com.facebook.mediastreaming.opt.muxer.TempFileCreator;

/* loaded from: classes9.dex */
public final class BundledLiveStreamServiceProviderHolder extends ServiceProviderHolder {
    public static final C53682NoX Companion = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.mediastreaming.opt.muxer.CodecMuxerFactory, java.lang.Object] */
    public BundledLiveStreamServiceProviderHolder(LiveStreamingConfig liveStreamingConfig, DvrConfig dvrConfig, TempFileCreator tempFileCreator) {
        C14360o3.A0B(liveStreamingConfig, 1);
        initHybrid(liveStreamingConfig, dvrConfig, tempFileCreator, new Object());
    }

    private final native void initHybrid(LiveStreamingConfig liveStreamingConfig, DvrConfig dvrConfig, TempFileCreator tempFileCreator, CodecMuxerFactory codecMuxerFactory);

    public final native LiveStreamSessionProbe getSessionProbe();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.NoX] */
    static {
        C09170dP.A0C("mediastreaming-bundledservices");
    }
}
