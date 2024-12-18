package com.facebook.mediastreaming.opt.dvr;

import X.C09170dP;
import X.C53690Nof;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;
import com.facebook.mediastreaming.opt.muxer.CodecMuxerFactory;
import com.facebook.mediastreaming.opt.muxer.TempFileCreator;
import java.io.File;

/* loaded from: classes9.dex */
public final class DvrManagerServiceProviderHolder extends ServiceProviderHolder {
    public static final C53690Nof Companion = new Object();

    private final native void initHybrid(DvrConfig dvrConfig, TempFileCreator tempFileCreator, CodecMuxerFactory codecMuxerFactory);

    public final native File getDvrOutputFile();

    public final native int getMuxState();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Nof, java.lang.Object] */
    static {
        C09170dP.A0C("mediastreaming-dvr");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DvrManagerServiceProviderHolder(DvrConfig dvrConfig, TempFileCreator tempFileCreator, CodecMuxerFactory codecMuxerFactory) {
        initHybrid(dvrConfig, tempFileCreator, codecMuxerFactory == null ? new Object() : codecMuxerFactory);
    }

    public DvrManagerServiceProviderHolder(DvrConfig dvrConfig, TempFileCreator tempFileCreator) {
        this(dvrConfig, tempFileCreator, null);
    }
}
