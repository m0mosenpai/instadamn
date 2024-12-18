package com.facebook.video.cache.igdatasource;

import X.AbstractC002300n;
import X.AbstractC12990ll;
import X.AbstractC16960so;
import X.AbstractC58317Pt9;
import X.AnonymousClass001;
import X.C14360o3;
import X.C1Ef;
import X.C222816h;
import X.C23781El;
import X.C2BC;
import X.C46842Cx;
import X.C4B8;
import X.C4C2;
import X.C4C3;
import X.C4C6;
import X.C4C7;
import X.C4J4;
import X.C4J5;
import X.C4J7;
import X.C4J8;
import X.C92304Bk;
import X.C92384Bt;
import X.C93214Fx;
import X.InterfaceC222916i;
import X.InterfaceC46822Cv;
import X.InterfaceC92344Bp;
import X.InterfaceC92374Bs;
import X.MSV;
import android.net.Uri;
import android.util.Log;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes2.dex */
public final class IgHttpDataSource implements InterfaceC92344Bp, InterfaceC92374Bs {
    public static final String TAG = "IgHttpDataSource";
    public static final String VIDEO_ID = "video_id";
    public long bytesToRead;
    public long bytesToSkip;
    public C4C7 dataSpec;
    public final AtomicReference dynamicPlayerSettingsRef;
    public InputStream inputStream;
    public boolean isOpened;
    public final AtomicReference networkAwareSettings;
    public final HeroPlayerSetting playerSetting;
    public C4J8 rangeResponse;
    public final Map requestProperties;
    public C4J5 requestToken;
    public int responseCode;
    public final AbstractC12990ll session;
    public C2BC transferListener;
    public long ttfB;
    public final InterfaceC222916i uriParser;
    public final C92304Bk videoMetaData;
    public final InterfaceC46822Cv videoRequestPendingStore;
    public static final C92384Bt Companion = new Object();
    public static final AtomicInteger transactionId = new AtomicInteger();

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.2Cx] */
    public IgHttpDataSource(C2BC c2bc, int i, HeroPlayerSetting heroPlayerSetting, AtomicReference atomicReference, C92304Bk c92304Bk, AtomicReference atomicReference2, AbstractC12990ll abstractC12990ll) {
        C46842Cx c46842Cx;
        InterfaceC46822Cv interfaceC46822Cv;
        C14360o3.A0B(heroPlayerSetting, 3);
        C14360o3.A0B(atomicReference, 4);
        C14360o3.A0B(c92304Bk, 5);
        C14360o3.A0B(atomicReference2, 6);
        this.transferListener = c2bc;
        this.playerSetting = heroPlayerSetting;
        this.dynamicPlayerSettingsRef = atomicReference;
        this.videoMetaData = c92304Bk;
        this.networkAwareSettings = atomicReference2;
        this.session = abstractC12990ll;
        C222816h c222816h = C222816h.A06;
        C14360o3.A08(c222816h);
        this.uriParser = c222816h;
        this.requestProperties = new LinkedHashMap();
        synchronized (C46842Cx.A02) {
            C46842Cx c46842Cx2 = C46842Cx.A01;
            c46842Cx = c46842Cx2;
            if (c46842Cx2 == null) {
                ?? obj = new Object();
                C46842Cx.A01 = obj;
                c46842Cx = obj;
            }
        }
        if (c46842Cx != null) {
            interfaceC46822Cv = c46842Cx.A00;
        } else {
            interfaceC46822Cv = null;
        }
        this.videoRequestPendingStore = interfaceC46822Cv;
    }

    private final synchronized void closeDownloaderConnectionQuietly() {
        C4J8 c4j8 = this.rangeResponse;
        if (c4j8 != null) {
            try {
                try {
                    try {
                        ((C4J7) c4j8).A03.A00();
                        c4j8.close();
                    } catch (RuntimeException e) {
                        Log.e(TAG, String.format("Unexpected error while disconnecting", new Object[0]), e);
                    }
                } catch (IOException e2) {
                    Log.e(TAG, String.format("Unexpected error while disconnecting", new Object[0]), e2);
                }
                this.rangeResponse = null;
            } catch (Throwable th) {
                this.rangeResponse = null;
                throw th;
            }
        } else {
            C4J5 c4j5 = this.requestToken;
            if (c4j5 != null) {
                c4j5.cancel();
                C4J4 c4j4 = (C4J4) c4j5;
                if (c4j4.A03) {
                    c4j4.A00.AIH();
                }
            }
        }
        this.requestToken = null;
    }

    @Override // X.InterfaceC92354Bq
    public void addTransferListener(C2BC c2bc) {
        C14360o3.A0B(c2bc, 0);
        this.transferListener = c2bc;
    }

    @Override // X.InterfaceC92354Bq
    public synchronized void cancel() {
        C4J8 c4j8 = this.rangeResponse;
        if (c4j8 != null) {
            ((C4J7) c4j8).A03.A00();
        }
    }

    @Override // X.InterfaceC92344Bp
    public synchronized void changeHttpPriority(byte b, boolean z) {
        C1Ef c1Ef;
        boolean z2 = false;
        if (b == C4C3.A02.A00.A00) {
            z2 = true;
        }
        C4J5 c4j5 = this.requestToken;
        if (c4j5 != null) {
            if (z2) {
                c1Ef = C1Ef.OnScreen;
            } else {
                c1Ef = C1Ef.OffScreen;
            }
            c4j5.FAL(c1Ef);
        }
        InterfaceC46822Cv interfaceC46822Cv = this.videoRequestPendingStore;
        if (interfaceC46822Cv != null) {
            String str = this.videoMetaData.A07;
            C14360o3.A07(str);
            interfaceC46822Cv.FBX(str, z2);
        }
    }

    public void changePriority(int i) {
    }

    public void clearRequestProperty(String str) {
        C14360o3.A0B(str, 0);
        synchronized (this.requestProperties) {
            this.requestProperties.remove(str);
        }
    }

    public int getNumUriRedirects() {
        return -1;
    }

    @Override // X.InterfaceC92344Bp, X.InterfaceC92354Bq
    public synchronized Map getResponseHeaders() {
        LinkedHashMap linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        C4J8 c4j8 = this.rangeResponse;
        if (c4j8 != null) {
            linkedHashMap.put("up-ttfb", AbstractC16960so.A1N(String.valueOf(this.ttfB)));
            List list = ((C4J7) c4j8).A01.A04;
            for (C23781El c23781El : (C23781El[]) list.toArray(new C23781El[list.size()])) {
                String str = c23781El.A00;
                C14360o3.A0A(str);
                if (!AbstractC002300n.A0h(str, "x-fb-video-livetrace-", false) || this.playerSetting.A2o) {
                    List singletonList = Collections.singletonList(c23781El.A01);
                    C14360o3.A07(singletonList);
                    linkedHashMap.put(str, singletonList);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7 A[LOOP:0: B:40:0x00d1->B:42:0x00d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0164 A[Catch: RuntimeException -> 0x0202, IOException -> 0x0226, TryCatch #5 {IOException -> 0x0226, RuntimeException -> 0x0202, blocks: (B:57:0x013f, B:59:0x0164, B:60:0x016a, B:61:0x0172, B:64:0x0175, B:112:0x0200, B:113:0x0201, B:63:0x0173), top: B:56:0x013f, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.InterfaceC92344Bp, X.InterfaceC92354Bq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long open(X.C4C7 r34) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.cache.igdatasource.IgHttpDataSource.open(X.4C7):long");
    }

    @Override // X.InterfaceC92344Bp, X.InterfaceC92364Br
    public int read(byte[] bArr, int i, int i2) {
        long j;
        int min;
        long j2;
        C14360o3.A0B(bArr, 0);
        synchronized (this) {
            if (this.dataSpec == null && this.inputStream == null) {
                String A00 = AbstractC58317Pt9.A00(547);
                Map emptyMap = Collections.emptyMap();
                Uri parse = Uri.parse("");
                C4B8.A02(parse);
                C4C7 c4c7 = C4C7.A0B;
                throw new C93214Fx(new C4C7(parse, new C4C6(), null, emptyMap, null, 1, 0, 0L, 0L, -1L), A00, 2);
            }
            j = this.bytesToSkip;
            this.bytesToSkip = 0L;
            long j3 = this.bytesToRead;
            if (j3 == -1) {
                min = Math.min(i2, Integer.MAX_VALUE);
            } else {
                min = (int) Math.min(j3, i2);
            }
        }
        int i3 = 0;
        if (this.inputStream != null) {
            while (j > 0) {
                try {
                    InputStream inputStream = this.inputStream;
                    if (inputStream != null) {
                        j2 = inputStream.skip(j);
                    } else {
                        j2 = 0;
                    }
                    j -= j2;
                } catch (IOException e) {
                    Log.e(TAG, String.format("Exception occurs when read data from inputSteam in read", new Object[0]), e);
                    closeDownloaderConnectionQuietly();
                    C4C7 c4c72 = this.dataSpec;
                    if (c4c72 != null) {
                        throw new C93214Fx(c4c72, e, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 2);
                    }
                } catch (RuntimeException e2) {
                    Log.e(TAG, String.format("RuntimeException occurs when try to get InputStream", new Object[0]), e2);
                    cancel();
                    closeDownloaderConnectionQuietly();
                    if (this.dataSpec != null) {
                        throw new C93214Fx(this.dataSpec, AnonymousClass001.A0R("RuntimeException: ", e2.getMessage()), 2);
                    }
                }
            }
            if (min == 0) {
                i3 = -1;
            } else {
                InputStream inputStream2 = this.inputStream;
                if (inputStream2 != null) {
                    i3 = inputStream2.read(bArr, i, min);
                }
                synchronized (this) {
                    long j4 = this.bytesToRead;
                    if (j4 != -1) {
                        this.bytesToRead = j4 - i3;
                    }
                }
            }
            C2BC c2bc = this.transferListener;
            if (c2bc != null) {
                C4C7 c4c73 = this.dataSpec;
                C4C7 c4c74 = C4C7.A0B;
                if (c4c73 == null) {
                    c4c73 = C4C7.A0B;
                }
                c2bc.D15(this, c4c73, i3, true);
                return i3;
            }
        }
        return i3;
    }

    public void setRequestProperty(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        synchronized (this.requestProperties) {
            this.requestProperties.put(str, str2);
        }
    }

    public synchronized void setVideoAsPlaying() {
    }

    private final void putAllTaParamsInHeader(Map map, C4C7 c4c7) {
        C4C6 c4c6 = c4c7.A07;
        map.put(AbstractC58317Pt9.A00(387), String.valueOf(c4c6.A0A));
        map.put("video_start_ms", String.valueOf(c4c6.A08));
        map.put(MSV.A00(604), String.valueOf(c4c6.A07));
        map.put("bufferDurationMs", String.valueOf(c4c6.A00));
        C4C2 c4c2 = c4c6.A0I;
        if (c4c2 != null) {
            map.put("video_is_prefetch", String.valueOf(c4c2.A02));
        }
    }

    private final boolean shouldLowerPriorityForLongBufferedPlayback(C4C7 c4c7) {
        int i = this.playerSetting.A08;
        if (i > 0 && c4c7.A07.A00 > i) {
            return true;
        }
        return false;
    }

    public void clearAllRequestProperties() {
        synchronized (this.requestProperties) {
            this.requestProperties.clear();
        }
    }

    @Override // X.InterfaceC92344Bp, X.InterfaceC92354Bq
    public void close() {
        C2BC c2bc;
        boolean z = this.isOpened;
        synchronized (this) {
            this.dataSpec = null;
            this.bytesToSkip = 0L;
            this.bytesToRead = 0L;
            this.ttfB = 0L;
            this.isOpened = false;
        }
        InputStream inputStream = this.inputStream;
        try {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    Log.e(TAG, String.format("Exceptions occurs when close current inputSteam", new Object[0]), e);
                } catch (RuntimeException e2) {
                    Log.e(TAG, String.format("Exceptions occurs when close current inputSteam", new Object[0]), e2);
                }
                this.inputStream = null;
            }
            closeDownloaderConnectionQuietly();
            if (z && (c2bc = this.transferListener) != null) {
                C4C7 c4c7 = this.dataSpec;
                C4C7 c4c72 = C4C7.A0B;
                if (c4c7 == null) {
                    c4c7 = C4C7.A0B;
                }
                c2bc.Dv9(this, c4c7, true);
            }
        } catch (Throwable th) {
            this.inputStream = null;
            closeDownloaderConnectionQuietly();
            throw th;
        }
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    @Override // X.InterfaceC92354Bq
    public Uri getUri() {
        C4C7 c4c7 = this.dataSpec;
        if (c4c7 != null) {
            return c4c7.A06;
        }
        return null;
    }

    public static final boolean isValidUri(String str) {
        if (Uri.parse(str).getAuthority() == null) {
            return false;
        }
        return true;
    }

    public void abortDataSource() {
        closeDownloaderConnectionQuietly();
    }
}
