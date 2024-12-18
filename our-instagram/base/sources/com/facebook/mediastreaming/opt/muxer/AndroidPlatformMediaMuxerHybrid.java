package com.facebook.mediastreaming.opt.muxer;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.C05F;
import X.C09170dP;
import X.C0K8;
import X.C14360o3;
import X.C18C;
import X.C72446Xdq;
import X.C72447Xdr;
import X.C72448Xds;
import X.C72555XgS;
import X.C72757XmY;
import X.C73315Y4h;
import X.EnumC53246Ngk;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.opt.common.StreamingHybridClassBase;
import java.io.File;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class AndroidPlatformMediaMuxerHybrid extends StreamingHybridClassBase {
    public static final C72555XgS Companion = new Object();
    public C73315Y4h impl;

    public final void muxAudioData(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j, MediaFormat mediaFormat) {
        AbstractC25229BEm.A1I(byteBuffer, 0, mediaFormat);
        C73315Y4h c73315Y4h = this.impl;
        if (c73315Y4h != null) {
            c73315Y4h.A03(mediaFormat, C05F.A00, byteBuffer, i, i2, i3, i4, j);
        }
    }

    public final void muxVideoData(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j, MediaFormat mediaFormat) {
        AbstractC25229BEm.A1I(byteBuffer, 0, mediaFormat);
        C73315Y4h c73315Y4h = this.impl;
        if (c73315Y4h != null) {
            c73315Y4h.A03(mediaFormat, C05F.A01, byteBuffer, i, i2, i3, i4, j);
        }
    }

    public native void requestRestartVideoEncoder();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.XgS, java.lang.Object] */
    static {
        C09170dP.A0C("mediastreaming");
    }

    public final void cleanOutputFile() {
        C73315Y4h c73315Y4h = this.impl;
        if (c73315Y4h != null) {
            File file = c73315Y4h.A0F;
            if (file != null) {
                file.delete();
            }
            c73315Y4h.A0F = null;
        }
    }

    public final int getMuxState() {
        C73315Y4h c73315Y4h = this.impl;
        if (c73315Y4h != null) {
            switch (c73315Y4h.A0H.intValue()) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                default:
                    return 0;
            }
        }
        throw AbstractC166997dE.A0g();
    }

    public final File getOutputFile() {
        File file;
        C73315Y4h c73315Y4h = this.impl;
        if (c73315Y4h != null) {
            if (c73315Y4h.A0F == null || ((file = c73315Y4h.A0F) != null && file.length() == 0)) {
                C0K8.A03(C73315Y4h.class, "DVR file is not available or not created");
                return null;
            }
            return c73315Y4h.A0F;
        }
        return null;
    }

    public void onFailed(String str, Throwable th) {
        EnumC53246Ngk enumC53246Ngk;
        if (th instanceof C72447Xdr) {
            enumC53246Ngk = EnumC53246Ngk.DvrNoEnoughDiskSpaceError;
        } else if (th instanceof C72448Xds) {
            enumC53246Ngk = EnumC53246Ngk.DvrExceedMaxSizeError;
        } else if (th instanceof C72446Xdq) {
            enumC53246Ngk = EnumC53246Ngk.DvrBigAVGapError;
        } else {
            enumC53246Ngk = EnumC53246Ngk.MuxerError;
        }
        fireError(enumC53246Ngk, str, th);
    }

    public final void prepare(boolean z, int i, int i2, int i3) {
        C73315Y4h c73315Y4h = this.impl;
        if (c73315Y4h != null) {
            c73315Y4h.A02 = i;
            c73315Y4h.A03 = i2;
            c73315Y4h.A00 = i3;
            try {
                if (c73315Y4h.A0F == null) {
                    c73315Y4h.A0F = c73315Y4h.A0D.createTempFile("video_transcode", ".mp4", z);
                }
            } catch (Exception e) {
                C73315Y4h.A01(c73315Y4h, e);
            }
            if (c73315Y4h.A0F != null) {
                C73315Y4h.A00(c73315Y4h);
                c73315Y4h.A0H = C05F.A01;
                boolean z2 = !c73315Y4h.A0K;
                Exception exc = c73315Y4h.A0G;
                if (!z2) {
                    c73315Y4h.A0B.onFailed("Failed to prepare muxer", exc);
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A18("Unable to create output file.");
        }
    }

    public final void stop() {
        Integer num;
        C73315Y4h c73315Y4h = this.impl;
        if (c73315Y4h != null) {
            synchronized (c73315Y4h) {
                if (c73315Y4h.A0J) {
                    try {
                        C72757XmY c72757XmY = c73315Y4h.A0C;
                        MediaMuxer mediaMuxer = c72757XmY.A02;
                        if (mediaMuxer != null) {
                            mediaMuxer.stop();
                            MediaMuxer mediaMuxer2 = c72757XmY.A02;
                            if (mediaMuxer2 != null) {
                                mediaMuxer2.release();
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } catch (Exception e) {
                        C73315Y4h.A01(c73315Y4h, e);
                        C0K8.A05(C73315Y4h.class, "LiveStreamMux Error stopping muxer ", e);
                    }
                } else {
                    C0K8.A03(C73315Y4h.class, "LiveStreamMux Never started muxer...Nothing to stop ");
                }
                if (!c73315Y4h.A0K) {
                    num = C05F.A0Y;
                } else if (c73315Y4h.A0G instanceof C72447Xdr) {
                    num = C05F.A0C;
                } else {
                    num = C05F.A0N;
                }
                c73315Y4h.A0H = num;
                c73315Y4h.A0I = false;
                c73315Y4h.A0M = false;
                c73315Y4h.A0J = false;
            }
        }
    }

    public final void configure(TempFileCreator tempFileCreator, CodecMuxerFactory codecMuxerFactory) {
        AbstractC167017dG.A1N(tempFileCreator, codecMuxerFactory);
        C18C.A0F(AbstractC25229BEm.A1Z(this.impl));
        C72757XmY createMuxer = codecMuxerFactory.createMuxer();
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C14360o3.A07(awakeTimeSinceBootClock);
        this.impl = new C73315Y4h(awakeTimeSinceBootClock, this, createMuxer, tempFileCreator);
    }

    public AndroidPlatformMediaMuxerHybrid(HybridData hybridData) {
        super(hybridData);
    }
}
