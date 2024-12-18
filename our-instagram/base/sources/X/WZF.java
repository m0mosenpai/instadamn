package X;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseArray;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes11.dex */
public final class WZF implements InterfaceC58201Pr7, Handler.Callback {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public Handler A0E;
    public XC9 A0F;
    public X9S A0G;
    public C70129W5q A0H;
    public AbstractC66037TyZ A0I;
    public C1125456i A0J;
    public C55070OaQ A0K;
    public C70168WEk A0L;
    public C69409Vmt A0M;
    public InterfaceC71893X9a A0N;
    public InterfaceC71894X9b A0O;
    public C69489VoC A0P;
    public XCA A0Q;
    public C54386O1s A0R;
    public String A0S;
    public String A0T;
    public List A0U;
    public ScheduledExecutorService A0V;
    public ScheduledFuture A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public final Context A0a;
    public final ConditionVariable A0b;
    public final Handler.Callback A0c;
    public final Handler A0d;
    public final HandlerThread A0e;
    public final XC1 A0f;
    public final C58647PzK A0g;
    public final W1m A0h;
    public final X9T A0i;
    public final InterfaceC58019Po5 A0j;
    public final X9V A0k;
    public final InterfaceC58105PpU A0l;
    public final InterfaceC71972XDf A0m;
    public final C69522Vql A0n;
    public final ACM A0o;
    public final C69587Vrq A0p;
    public final InterfaceC71895X9c A0q;
    public final WD1 A0r;
    public final File A0s;
    public final String A0t;
    public final String A0u;
    public final Thread.UncaughtExceptionHandler A0v;
    public final boolean A0w;
    public final boolean A0x;
    public volatile WGV A0y;
    public volatile EnumC222789sJ A0z;
    public volatile boolean A10;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.Tyj, java.lang.Object] */
    private void A01() {
        A08(this, "cleanupCodecState", new Object[0]);
        ?? obj = new Object();
        try {
            A08(this, "cleanupVideoEncoderSafely", new Object[0]);
            C69409Vmt c69409Vmt = this.A0M;
            if (c69409Vmt != null) {
                Iterator A15 = AbstractC166997dE.A15(c69409Vmt.A07);
                while (A15.hasNext()) {
                    AbstractC65702TsY.A0L(A15).AVe();
                }
                this.A0M = null;
            }
        } catch (Throwable th) {
            C66046Tyj.A00(obj, th);
            VN1.A00("cleanupVideoEncoderSafely", th);
        }
        this.A0Q = null;
        this.A0M = null;
        if (this.A0y != null) {
            try {
                this.A0y.A0A();
            } catch (Throwable th2) {
                A08(this, "cleanupCodecState: mMultipleTrackCoordinatorRealtime.releasePlayer Exception=%s", th2);
                C66046Tyj.A00(obj, th2);
                VN1.A00("cleanup", th2);
            }
        }
        this.A0y = null;
        try {
            obj.A01();
        } catch (Throwable th3) {
            A08(this, "cleanupCodecState: context Exception=%s", th3);
            A09(this, th3);
        }
    }

    private void A03() {
        A08(this, "onPlaybackStopped", new Object[0]);
        long j = this.A0C;
        if (j > 0) {
            this.A09 += System.currentTimeMillis() - j;
            this.A0C = 0L;
        }
        this.A08 = 0L;
    }

    @Override // X.InterfaceC58201Pr7
    public final void APT() {
        this.A0Y = true;
    }

    @Override // X.InterfaceC58201Pr7
    public final void E4S() {
        A08(this, "play", new Object[0]);
        A0G(VDF.PLAY, null, 0L);
    }

    @Override // X.InterfaceC58201Pr7
    public final void ET1(String str) {
        this.A0T = null;
    }

    @Override // X.InterfaceC58201Pr7
    public final void FCk(C1125456i c1125456i, String str) {
        A08(this, "updateTrim", new Object[0]);
        A0G(VDF.UPDATE_TRIM, new Object[]{str, c1125456i}, 0L);
    }

    @Override // X.InterfaceC58201Pr7
    public final void pause() {
        A08(this, "pause", new Object[0]);
        if (this.A0L != null) {
            A08(this, "maybeCancelReverse mMediaCompositionNormalizationUtil.cancel", new Object[0]);
            this.A0L.A04();
        }
        A06(VDF.PLAY);
        A06(VDF.DO_WORK);
        A0G(VDF.PAUSE, null, 0L);
    }

    @Override // X.InterfaceC58201Pr7
    public final void release() {
        A08(this, "release", new Object[0]);
        StringBuilder sb = new StringBuilder();
        sb.append("removeAllMessages: ");
        A08(this, AbstractC166997dE.A0v(VDF.values(), sb), new Object[0]);
        for (VDF vdf : VDF.values()) {
            A06(vdf);
        }
        WGV wgv = this.A0y;
        if (wgv != null) {
            A08(this, "release multipleTrackCoordinatorRealtime.cancel", new Object[0]);
            wgv.A0b = true;
            U7W u7w = wgv.A0M.A0B;
            if (u7w.A0D()) {
                AbstractC66043Tyf.A00("MultipleTrackCoordinatorRealtime", "cancel: mDemuxDecodeWrapperManager.cancel", new Object[0]);
                W4J w4j = wgv.A0K;
                AbstractC66043Tyf.A00("DemuxDecodeWrapperManager", "cancel", new Object[0]);
                for (EnumC1125356h enumC1125356h : EnumC1125356h.values()) {
                    SparseArray sparseArray = (SparseArray) w4j.A01.get(enumC1125356h);
                    if (sparseArray != null) {
                        int size = sparseArray.size();
                        for (int i = 0; i < size; i++) {
                            ((InterfaceC71998XEm) sparseArray.valueAt(i)).cancel();
                        }
                    }
                }
            }
            if (u7w.A09()) {
                Iterator A15 = AbstractC166997dE.A15(wgv.A0L.A07);
                while (A15.hasNext()) {
                    InterfaceC72002XEq interfaceC72002XEq = AbstractC65702TsY.A0L(A15).A00;
                    if (interfaceC72002XEq != null) {
                        interfaceC72002XEq.cancel();
                    }
                }
            }
        }
        if (this.A0L != null) {
            A08(this, "maybeCancelReverse mMediaCompositionNormalizationUtil.cancel", new Object[0]);
            this.A0L.A04();
        }
        HandlerThread handlerThread = this.A0e;
        if (handlerThread != null && this.A0P.A0B.A0E()) {
            handlerThread.interrupt();
        }
        if (this.A0x) {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
            this.A0V = newScheduledThreadPool;
            this.A0W = newScheduledThreadPool.schedule(new RunnableC71268Wqx(this), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, TimeUnit.MILLISECONDS);
        }
        A0G(VDF.RELEASE, null, 0L);
        this.A0b.block(this.A0P.A0B.A05());
        if (!this.A0Z && !this.A0P.A0B.A0T()) {
            A08(this, "release timed out", new Object[0]);
            A09(this, new TimeoutException("release timed out"));
        }
    }

    public WZF(Context context, XC1 xc1, XC9 xc9, C58647PzK c58647PzK, X9S x9s, X9T x9t, InterfaceC58019Po5 interfaceC58019Po5, X9V x9v, InterfaceC58105PpU interfaceC58105PpU, InterfaceC71972XDf interfaceC71972XDf, ACM acm, C69464Vnn c69464Vnn, InterfaceC71895X9c interfaceC71895X9c, File file, String str, String str2, Map map) {
        Looper mainLooper;
        String str3 = str2;
        WDI wdi = new WDI();
        wdi.A0C = c69464Vnn.A05;
        wdi.A0A = c69464Vnn.A04;
        wdi.A01 = c69464Vnn.A01;
        wdi.A0B = c69464Vnn.A03;
        wdi.A0O = c69464Vnn.A0D;
        wdi.A03 = c69464Vnn.A02;
        wdi.A0G = c69464Vnn.A08;
        W3N w3n = new W3N();
        w3n.A06 = wdi;
        w3n.A08 = c69464Vnn.A09;
        w3n.A07 = c69464Vnn.A07;
        w3n.A0B = c69464Vnn.A0C;
        w3n.A0N = c69464Vnn.A0E;
        w3n.A0G = c69464Vnn.A00;
        w3n.A09 = c69464Vnn.A0A;
        VN4 vn4 = c69464Vnn.A0B;
        if (vn4 != null) {
            w3n.A0A = vn4;
        }
        C69489VoC c69489VoC = new C69489VoC(w3n);
        this.A0K = null;
        this.A0b = new ConditionVariable();
        this.A0V = null;
        this.A0W = null;
        this.A0I = null;
        this.A0Y = false;
        this.A00 = 1.0f;
        this.A02 = 0;
        this.A0p = new C69587Vrq();
        this.A07 = 0L;
        this.A0r = WD1.create(10.0d, new C67783Uy8());
        this.A0z = EnumC222789sJ.UNPREPARED;
        C55342Oh7 c55342Oh7 = new C55342Oh7(this, 2);
        this.A0c = c55342Oh7;
        C71647Wxu c71647Wxu = new C71647Wxu(this, 2);
        this.A0v = c71647Wxu;
        this.A0n = new C69522Vql(this);
        this.A0a = context;
        this.A0t = str;
        this.A0o = acm;
        this.A0j = interfaceC58019Po5;
        this.A0q = interfaceC71895X9c;
        this.A0P = c69489VoC;
        this.A0k = x9v;
        this.A0l = interfaceC58105PpU;
        this.A0g = c58647PzK;
        this.A0s = file;
        this.A0m = interfaceC71972XDf;
        this.A0i = x9t;
        this.A0f = xc1;
        this.A0F = xc9;
        this.A0G = x9s;
        str3 = (str2 == null || !c69489VoC.A0B.A0O()) ? AbstractC166997dE.A0n() : str3;
        this.A0u = str3;
        this.A0h = new W1m(xc1, str, str3, map);
        this.A0U = new ArrayList();
        if (Looper.myLooper() != null) {
            mainLooper = Looper.myLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.A0E = new Handler(mainLooper, c55342Oh7);
        HandlerThread handlerThread = new HandlerThread("mediacomposition-player", -16);
        AbstractC09770fa.A00(handlerThread);
        this.A0e = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        this.A0d = new HandlerC66051Tyo(this, looper, c71647Wxu);
        U7W u7w = c69489VoC.A0B;
        this.A0w = u7w.A0C();
        this.A0x = u7w.A0M();
        A08(this, "logPlayerCreated", new Object[0]);
        W1m.A00(this.A0h, "media_player_created", new HashMap());
    }

    public static HashMap A00(WZF wzf) {
        int i;
        HashMap hashMap = new HashMap();
        hashMap.put("current_position_ms", Long.toString(TimeUnit.NANOSECONDS.toMillis(wzf.Aui())));
        hashMap.put(AbstractC111324zv.A00(4229), wzf.A0z.toString());
        C69587Vrq c69587Vrq = wzf.A0p;
        if (c69587Vrq.A00 == -1) {
            i = 0;
        } else {
            i = (int) (c69587Vrq.A02 / ((((r1 + 10) - c69587Vrq.A01) % 10) + 1));
        }
        hashMap.put("avg_media_composition_update_time_ms", Integer.toString(i));
        hashMap.put("overall_audio_volume", Float.toString(wzf.A00));
        hashMap.put("number_of_video_segments", Integer.toString(wzf.A04));
        hashMap.put("number_of_audio_segments", Integer.toString(wzf.A01));
        hashMap.put("number_of_mixed_segments", Integer.toString(wzf.A03));
        String str = wzf.A0S;
        if (str != null) {
            hashMap.put("applied_effect_id", str);
        }
        hashMap.put("number_of_frames_dropped", Integer.toString(wzf.A02));
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r2 == r4) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02() {
        /*
            r14 = this;
            X.9sJ r1 = r14.A0z
            X.9sJ r0 = X.EnumC222789sJ.PLAYING
            if (r1 != r0) goto L64
            X.56i r0 = r14.A0J
            r0.getClass()
            X.WGV r0 = r14.A0y
            r0.getClass()
            X.56i r0 = r14.A0J
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r4 = r0.A02(r8)
            X.WGV r0 = r14.A0y
            r7 = 0
            long r2 = r0.A07(r4, r7)
            X.TyZ r6 = r14.A0I
            if (r6 == 0) goto L3a
            X.WGV r11 = r14.A0y
            long r0 = r11.A0a
            r12 = 0
            int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r9 != 0) goto L7e
            r0 = 0
        L2e:
            double r0 = (double) r0
            X.WGV r9 = r14.A0y
            long r9 = r9.A0Z
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r6.A00(r9, r0)
        L3a:
            X.56i r1 = r14.A0J
            X.VoC r0 = r14.A0P
            X.U7W r0 = r0.A0B
            boolean r0 = r0.A1P()
            boolean r0 = r1.A06(r8, r2, r0)
            if (r0 == 0) goto L4f
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L50
        L4f:
            r0 = 1
        L50:
            X.VDF r3 = X.VDF.DO_WORK
            r14.A06(r3)
            r2 = 0
            if (r0 != 0) goto L65
            X.WGV r0 = r14.A0y
            boolean r0 = r0.A0A
            if (r0 == 0) goto L60
            r7 = 10
        L60:
            long r0 = (long) r7
        L61:
            r14.A0G(r3, r2, r0)
        L64:
            return
        L65:
            boolean r0 = r14.A10
            if (r0 == 0) goto L8c
            X.56i r0 = r14.A0J
            long r0 = r0.A03(r8)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            X.VaX r0 = new X.VaX
            r0.<init>(r1)
            r14.A07(r0)
            r0 = 10
            goto L61
        L7e:
            long r0 = r11.A0Z
            float r10 = (float) r0
            long r0 = r11.A0a
            float r9 = (float) r0
            float r10 = r10 / r9
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r10, r0)
            goto L2e
        L8c:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "doWork setPlaybackState PLAYBACK_COMPLETE"
            A08(r14, r0, r1)
            X.9sJ r0 = X.EnumC222789sJ.PLAYBACK_COMPLETE
            r14.A0C(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WZF.A02():void");
    }

    private void A04() {
        String str;
        C69439VnO c69439VnO;
        A08(this, "playInternal", new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (A0F(this)) {
                EnumC222789sJ enumC222789sJ = this.A0z;
                EnumC222789sJ enumC222789sJ2 = EnumC222789sJ.PLAYING;
                if (enumC222789sJ != enumC222789sJ2) {
                    C55070OaQ c55070OaQ = this.A0K;
                    if (c55070OaQ != null && (c69439VnO = c55070OaQ.A05) != null) {
                        c69439VnO.A05 = true;
                    }
                    this.A0X = true;
                    A08(this, "onPlaybackStarted", new Object[0]);
                    this.A0C = System.currentTimeMillis();
                    A0C(enumC222789sJ2);
                    A02();
                }
            }
        } finally {
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            HashMap A00 = A00(this);
            A00.put("media_player_start_time_ms", Long.toString(currentTimeMillis2));
            C70129W5q c70129W5q = this.A0H;
            if (c70129W5q != null && (str = c70129W5q.A0G) != null) {
                A00.put("decoder_debug_info", str);
            }
            A08(this, "playInternal logPlay params=%s", A00);
            W1m.A00(this.A0h, "media_player_play", A00);
        }
    }

    private void A05(MediaComposition mediaComposition, int i, long j) {
        W1m w1m = this.A0h;
        long millis = TimeUnit.NANOSECONDS.toMillis(j);
        HashMap A00 = A00(this);
        C14360o3.A0B(mediaComposition, 0);
        A00.put("media_composition", mediaComposition.toString());
        A00.put("target_position_ms", String.valueOf(millis));
        A00.put("media_composition_update_time_ms", String.valueOf(i));
        A00.put("media_composition_hash", mediaComposition.A05());
        W1m.A00(w1m, "media_player_update_media_composition", A00);
    }

    private void A06(VDF vdf) {
        this.A0d.removeMessages(vdf.ordinal());
    }

    private void A07(C68697VaX c68697VaX) {
        EnumC222789sJ enumC222789sJ;
        C69439VnO c69439VnO;
        boolean z = false;
        A08(this, "doSeek: seekInfo=%s", c68697VaX);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (A0F(this)) {
                EnumC222789sJ enumC222789sJ2 = this.A0z;
                EnumC222789sJ enumC222789sJ3 = EnumC222789sJ.PLAYING;
                if (enumC222789sJ2 == enumC222789sJ3) {
                    z = true;
                }
                A0C(EnumC222789sJ.SEEKING);
                long j = 0;
                Long l = c68697VaX.A00;
                if (l != null) {
                    j = l.longValue();
                }
                this.A0y.getClass();
                this.A0J.getClass();
                C1125456i c1125456i = this.A0J;
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                long min = Math.min(Math.max(j, c1125456i.A03(timeUnit)), this.A0J.A02(timeUnit));
                this.A0y.A0B(min);
                if (z) {
                    enumC222789sJ = enumC222789sJ3;
                } else {
                    enumC222789sJ = EnumC222789sJ.PAUSED;
                }
                A0C(enumC222789sJ);
                if (this.A0z != enumC222789sJ3) {
                    WGV wgv = this.A0y;
                    C1125456i c1125456i2 = this.A0J;
                    TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
                    wgv.A07(c1125456i2.A02(timeUnit), true);
                    this.A0y.A09();
                    C55070OaQ c55070OaQ = this.A0K;
                    if (c55070OaQ != null && (c69439VnO = c55070OaQ.A05) != null) {
                        c69439VnO.A07.A05.add(AbstractC111324zv.A00(1365));
                        if (c69439VnO.A00 >= 300) {
                            c69439VnO.A05 = false;
                        } else {
                            c69439VnO.A01 = 0;
                            c69439VnO.A00 = 0;
                            c69439VnO.A02 = min;
                        }
                    }
                }
            }
        } finally {
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            HashMap A00 = A00(this);
            A00.put("media_player_seek_time_ms", Long.toString(currentTimeMillis2));
            W1m.A00(this.A0h, "media_player_seek", A00);
        }
    }

    public static void A08(WZF wzf, String str, Object... objArr) {
        AbstractC66043Tyf.A00("FBMediaCompositionPlayer", AnonymousClass001.A0u("mPlayerSessionId: ", wzf.A0u, " ", str), objArr);
    }

    private void A0C(EnumC222789sJ enumC222789sJ) {
        StringBuilder sb = new StringBuilder();
        sb.append("setPlaybackState state: ");
        sb.append(enumC222789sJ);
        sb.append(" mState: ");
        A08(this, AbstractC166997dE.A0v(this.A0z, sb), new Object[0]);
        if (this.A0z != enumC222789sJ) {
            EnumC222789sJ enumC222789sJ2 = this.A0z;
            this.A0z = enumC222789sJ;
            InterfaceC71894X9b interfaceC71894X9b = this.A0O;
            if (interfaceC71894X9b != null) {
                Handler handler = this.A0E;
                handler.getClass();
                handler.post(new RunnableC71597Wwt(this, interfaceC71894X9b, enumC222789sJ2, enumC222789sJ));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c4, code lost:
    
        if (r0.A0M == true) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0207 A[Catch: all -> 0x03f3, TryCatch #4 {all -> 0x03f3, blocks: (B:3:0x001a, B:5:0x006a, B:7:0x0074, B:15:0x0095, B:22:0x009a, B:23:0x03ef, B:24:0x03f2, B:18:0x009f, B:16:0x00a8, B:32:0x00e1, B:34:0x00ff, B:36:0x0109, B:39:0x0115, B:41:0x0119, B:42:0x0123, B:46:0x0140, B:47:0x0144, B:48:0x0137, B:50:0x0146, B:53:0x015b, B:54:0x0173, B:57:0x0294, B:59:0x029e, B:61:0x02ad, B:72:0x02f2, B:74:0x02ff, B:75:0x0306, B:77:0x0356, B:78:0x035a, B:81:0x037d, B:82:0x0389, B:85:0x0374, B:86:0x0188, B:88:0x01be, B:90:0x01c6, B:91:0x01d2, B:93:0x01d8, B:96:0x01e2, B:98:0x01e8, B:100:0x01ec, B:102:0x01f0, B:104:0x01f4, B:106:0x01f8, B:108:0x0207, B:109:0x0218, B:110:0x021f, B:111:0x023b, B:138:0x026f, B:139:0x0272, B:141:0x0276, B:143:0x027a, B:157:0x016a, B:160:0x03d5, B:66:0x02bb, B:68:0x02cc, B:69:0x02ec, B:70:0x02f0), top: B:2:0x001a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021f A[Catch: all -> 0x03f3, TryCatch #4 {all -> 0x03f3, blocks: (B:3:0x001a, B:5:0x006a, B:7:0x0074, B:15:0x0095, B:22:0x009a, B:23:0x03ef, B:24:0x03f2, B:18:0x009f, B:16:0x00a8, B:32:0x00e1, B:34:0x00ff, B:36:0x0109, B:39:0x0115, B:41:0x0119, B:42:0x0123, B:46:0x0140, B:47:0x0144, B:48:0x0137, B:50:0x0146, B:53:0x015b, B:54:0x0173, B:57:0x0294, B:59:0x029e, B:61:0x02ad, B:72:0x02f2, B:74:0x02ff, B:75:0x0306, B:77:0x0356, B:78:0x035a, B:81:0x037d, B:82:0x0389, B:85:0x0374, B:86:0x0188, B:88:0x01be, B:90:0x01c6, B:91:0x01d2, B:93:0x01d8, B:96:0x01e2, B:98:0x01e8, B:100:0x01ec, B:102:0x01f0, B:104:0x01f4, B:106:0x01f8, B:108:0x0207, B:109:0x0218, B:110:0x021f, B:111:0x023b, B:138:0x026f, B:139:0x0272, B:141:0x0276, B:143:0x027a, B:157:0x016a, B:160:0x03d5, B:66:0x02bb, B:68:0x02cc, B:69:0x02ec, B:70:0x02f0), top: B:2:0x001a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02cc A[Catch: all -> 0x02f1, TryCatch #1 {all -> 0x02f1, blocks: (B:66:0x02bb, B:68:0x02cc, B:69:0x02ec, B:70:0x02f0), top: B:65:0x02bb, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ec A[Catch: all -> 0x02f1, TryCatch #1 {all -> 0x02f1, blocks: (B:66:0x02bb, B:68:0x02cc, B:69:0x02ec, B:70:0x02f0), top: B:65:0x02bb, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ff A[Catch: all -> 0x03f3, TryCatch #4 {all -> 0x03f3, blocks: (B:3:0x001a, B:5:0x006a, B:7:0x0074, B:15:0x0095, B:22:0x009a, B:23:0x03ef, B:24:0x03f2, B:18:0x009f, B:16:0x00a8, B:32:0x00e1, B:34:0x00ff, B:36:0x0109, B:39:0x0115, B:41:0x0119, B:42:0x0123, B:46:0x0140, B:47:0x0144, B:48:0x0137, B:50:0x0146, B:53:0x015b, B:54:0x0173, B:57:0x0294, B:59:0x029e, B:61:0x02ad, B:72:0x02f2, B:74:0x02ff, B:75:0x0306, B:77:0x0356, B:78:0x035a, B:81:0x037d, B:82:0x0389, B:85:0x0374, B:86:0x0188, B:88:0x01be, B:90:0x01c6, B:91:0x01d2, B:93:0x01d8, B:96:0x01e2, B:98:0x01e8, B:100:0x01ec, B:102:0x01f0, B:104:0x01f4, B:106:0x01f8, B:108:0x0207, B:109:0x0218, B:110:0x021f, B:111:0x023b, B:138:0x026f, B:139:0x0272, B:141:0x0276, B:143:0x027a, B:157:0x016a, B:160:0x03d5, B:66:0x02bb, B:68:0x02cc, B:69:0x02ec, B:70:0x02f0), top: B:2:0x001a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0356 A[Catch: all -> 0x03f3, TryCatch #4 {all -> 0x03f3, blocks: (B:3:0x001a, B:5:0x006a, B:7:0x0074, B:15:0x0095, B:22:0x009a, B:23:0x03ef, B:24:0x03f2, B:18:0x009f, B:16:0x00a8, B:32:0x00e1, B:34:0x00ff, B:36:0x0109, B:39:0x0115, B:41:0x0119, B:42:0x0123, B:46:0x0140, B:47:0x0144, B:48:0x0137, B:50:0x0146, B:53:0x015b, B:54:0x0173, B:57:0x0294, B:59:0x029e, B:61:0x02ad, B:72:0x02f2, B:74:0x02ff, B:75:0x0306, B:77:0x0356, B:78:0x035a, B:81:0x037d, B:82:0x0389, B:85:0x0374, B:86:0x0188, B:88:0x01be, B:90:0x01c6, B:91:0x01d2, B:93:0x01d8, B:96:0x01e2, B:98:0x01e8, B:100:0x01ec, B:102:0x01f0, B:104:0x01f4, B:106:0x01f8, B:108:0x0207, B:109:0x0218, B:110:0x021f, B:111:0x023b, B:138:0x026f, B:139:0x0272, B:141:0x0276, B:143:0x027a, B:157:0x016a, B:160:0x03d5, B:66:0x02bb, B:68:0x02cc, B:69:0x02ec, B:70:0x02f0), top: B:2:0x001a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0374 A[Catch: all -> 0x03f3, TryCatch #4 {all -> 0x03f3, blocks: (B:3:0x001a, B:5:0x006a, B:7:0x0074, B:15:0x0095, B:22:0x009a, B:23:0x03ef, B:24:0x03f2, B:18:0x009f, B:16:0x00a8, B:32:0x00e1, B:34:0x00ff, B:36:0x0109, B:39:0x0115, B:41:0x0119, B:42:0x0123, B:46:0x0140, B:47:0x0144, B:48:0x0137, B:50:0x0146, B:53:0x015b, B:54:0x0173, B:57:0x0294, B:59:0x029e, B:61:0x02ad, B:72:0x02f2, B:74:0x02ff, B:75:0x0306, B:77:0x0356, B:78:0x035a, B:81:0x037d, B:82:0x0389, B:85:0x0374, B:86:0x0188, B:88:0x01be, B:90:0x01c6, B:91:0x01d2, B:93:0x01d8, B:96:0x01e2, B:98:0x01e8, B:100:0x01ec, B:102:0x01f0, B:104:0x01f4, B:106:0x01f8, B:108:0x0207, B:109:0x0218, B:110:0x021f, B:111:0x023b, B:138:0x026f, B:139:0x0272, B:141:0x0276, B:143:0x027a, B:157:0x016a, B:160:0x03d5, B:66:0x02bb, B:68:0x02cc, B:69:0x02ec, B:70:0x02f0), top: B:2:0x001a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01be A[Catch: all -> 0x03f3, TryCatch #4 {all -> 0x03f3, blocks: (B:3:0x001a, B:5:0x006a, B:7:0x0074, B:15:0x0095, B:22:0x009a, B:23:0x03ef, B:24:0x03f2, B:18:0x009f, B:16:0x00a8, B:32:0x00e1, B:34:0x00ff, B:36:0x0109, B:39:0x0115, B:41:0x0119, B:42:0x0123, B:46:0x0140, B:47:0x0144, B:48:0x0137, B:50:0x0146, B:53:0x015b, B:54:0x0173, B:57:0x0294, B:59:0x029e, B:61:0x02ad, B:72:0x02f2, B:74:0x02ff, B:75:0x0306, B:77:0x0356, B:78:0x035a, B:81:0x037d, B:82:0x0389, B:85:0x0374, B:86:0x0188, B:88:0x01be, B:90:0x01c6, B:91:0x01d2, B:93:0x01d8, B:96:0x01e2, B:98:0x01e8, B:100:0x01ec, B:102:0x01f0, B:104:0x01f4, B:106:0x01f8, B:108:0x0207, B:109:0x0218, B:110:0x021f, B:111:0x023b, B:138:0x026f, B:139:0x0272, B:141:0x0276, B:143:0x027a, B:157:0x016a, B:160:0x03d5, B:66:0x02bb, B:68:0x02cc, B:69:0x02ec, B:70:0x02f0), top: B:2:0x001a, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r0v85, types: [X.XC9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9, types: [X.VK1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r27v0, types: [X.WZX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, X.Po5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0D(java.lang.Long r35) {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WZF.A0D(java.lang.Long):void");
    }

    public static boolean A0F(WZF wzf) {
        if (wzf.A0z != EnumC222789sJ.READY && wzf.A0z != EnumC222789sJ.PLAYING && wzf.A0z != EnumC222789sJ.PAUSED && wzf.A0z != EnumC222789sJ.SEEKING && wzf.A0z != EnumC222789sJ.PLAYBACK_COMPLETE) {
            return false;
        }
        return true;
    }

    public final void A0G(VDF vdf, Object obj, long j) {
        if (this.A0z == EnumC222789sJ.RELEASED) {
            String name = vdf.name();
            A08(this, AnonymousClass001.A0g("sendMessage player already released. ", name, " failed."), new Object[0]);
            A0A(this, new IllegalStateException(AnonymousClass001.A0g("Player already released. ", name, " failed.")));
        } else {
            Handler handler = this.A0d;
            handler.sendMessageDelayed(handler.obtainMessage(vdf.ordinal(), obj), j);
        }
    }

    @Override // X.InterfaceC58201Pr7
    public final long Aui() {
        WGV wgv = this.A0y;
        if (this.A0P.A0B.A0W()) {
            if (wgv == null || !wgv.A09) {
                return this.A07;
            }
        } else if (wgv == null) {
            return 0L;
        }
        return wgv.A0Z * 1000;
    }

    @Override // X.InterfaceC58201Pr7
    public final void E5P() {
        E5Z(0L);
    }

    @Override // X.InterfaceC58201Pr7
    public final void EMh(long j) {
        C68697VaX c68697VaX = new C68697VaX(Long.valueOf(TimeUnit.NANOSECONDS.toMicros(j)));
        A08(this, "seekTo: %s", c68697VaX);
        VDF vdf = VDF.SEEK;
        A06(vdf);
        A0G(vdf, c68697VaX, 0L);
    }

    @Override // X.InterfaceC58201Pr7
    public final void Eay(final InterfaceC71893X9a interfaceC71893X9a) {
        this.A0d.post(new Runnable() { // from class: X.Wu4
            @Override // java.lang.Runnable
            public final void run() {
                WZF.this.A0N = interfaceC71893X9a;
            }
        });
    }

    @Override // X.InterfaceC58201Pr7
    public final void Eb0(C54386O1s c54386O1s, long j) {
        this.A06 = j;
        this.A0d.post(new RunnableC71548Wvx(this, c54386O1s, j));
    }

    @Override // X.InterfaceC58201Pr7
    public final void Eb3(InterfaceC71894X9b interfaceC71894X9b) {
        this.A0d.post(new RunnableC71443Wu5(this, interfaceC71894X9b));
    }

    @Override // X.InterfaceC58201Pr7
    public final void Ee0(boolean z) {
        W1m w1m = this.A0h;
        HashMap A00 = A00(this);
        A00.put("loop", String.valueOf(z));
        W1m.A00(w1m, "media_player_set_loop", A00);
        this.A10 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (r1.containsKey(r28) != false) goto L8;
     */
    @Override // X.InterfaceC58201Pr7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean FAr(X.EnumC1125356h r26, com.facebook.videolite.transcoder.base.composition.MediaEffect r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WZF.FAr(X.56h, com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.String):boolean");
    }

    @Override // X.InterfaceC58201Pr7
    public final void FBM(MediaComposition mediaComposition) {
        long Aui;
        if (this.A0P.A0B.A0Y()) {
            Aui = -1;
        } else {
            Aui = Aui();
        }
        FBN(mediaComposition, Aui);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:190|191|(1:193)(1:223)|194|(1:196)|197|(1:201)|202|(7:203|(2:205|(0)(1:209))|213|214|215|(1:217)|218)|211|213|214|215|(0)|218) */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0506, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0507, code lost:
    
        r2 = new X.C09540e5(r3);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x001e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0512 A[Catch: all -> 0x0628, TryCatch #3 {all -> 0x0628, blocks: (B:172:0x0484, B:174:0x048c, B:176:0x0496, B:177:0x0499, B:194:0x04b9, B:196:0x04bf, B:197:0x04d0, B:199:0x04d6, B:201:0x04dc, B:202:0x04e6, B:203:0x04e9, B:205:0x04ed, B:209:0x04f4, B:211:0x04fc, B:215:0x050c, B:217:0x0512, B:218:0x0523, B:221:0x0507, B:179:0x0525, B:181:0x0571, B:182:0x057e, B:225:0x04b4, B:191:0x04a1, B:193:0x04a5, B:214:0x04fe), top: B:171:0x0484, outer: #0, inners: #1, #2 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r30) {
        /*
            Method dump skipped, instructions count: 1662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WZF.handleMessage(android.os.Message):boolean");
    }

    @Override // X.InterfaceC58201Pr7
    public final boolean isPlaying() {
        return AbstractC167007dF.A1X(this.A0z, EnumC222789sJ.PLAYING);
    }

    public static void A09(WZF wzf, Throwable th) {
        String stackTraceString;
        HashMap A00 = A00(wzf);
        String str = wzf.A0T;
        if (str != null) {
            A00.put("debug_message", str);
        }
        A08(wzf, "logPlayerError: Exception=%s, map=%s", th, A00);
        W1m w1m = wzf.A0h;
        if (th == null) {
            stackTraceString = "";
        } else {
            stackTraceString = android.util.Log.getStackTraceString(th);
            C14360o3.A0A(stackTraceString);
        }
        A00.put("error_trace", stackTraceString);
        W1m.A00(w1m, "media_player_error", A00);
    }

    public static void A0A(WZF wzf, Throwable th) {
        String stackTraceString;
        HashMap A00 = A00(wzf);
        String str = wzf.A0T;
        if (str != null) {
            A00.put("debug_message", str);
        }
        A08(wzf, "logPlayerWarning: Exception=%s, map=%s", th, A00);
        W1m w1m = wzf.A0h;
        if (th == null) {
            stackTraceString = "";
        } else {
            stackTraceString = android.util.Log.getStackTraceString(th);
            C14360o3.A0A(stackTraceString);
        }
        A00.put("error_trace", stackTraceString);
        W1m.A00(w1m, "media_player_warning", A00);
    }

    public static void A0B(final WZF wzf, final Throwable th) {
        String str;
        Handler handler;
        A08(wzf, "onPlaybackException: e=%s", th);
        final EnumC222789sJ enumC222789sJ = wzf.A0z;
        wzf.A03();
        if (!(th instanceof CancellationException)) {
            if (wzf.A0P.A0B.A0E()) {
                Throwable th2 = th;
                while (true) {
                    Throwable cause = th2.getCause();
                    if (cause == null || th2 == cause) {
                        break;
                    } else {
                        th2 = cause;
                    }
                }
                if (th2 instanceof InterruptedException) {
                    return;
                }
            }
            A09(wzf, th);
            wzf.A0C(EnumC222789sJ.ERROR);
            final InterfaceC71893X9a interfaceC71893X9a = wzf.A0N;
            if (interfaceC71893X9a != null && (handler = wzf.A0E) != null) {
                handler.post(new Runnable() { // from class: X.Wws
                    @Override // java.lang.Runnable
                    public final void run() {
                        String stackTraceString;
                        WZF wzf2 = WZF.this;
                        InterfaceC71893X9a interfaceC71893X9a2 = interfaceC71893X9a;
                        EnumC222789sJ enumC222789sJ2 = enumC222789sJ;
                        Throwable th3 = th;
                        String str2 = wzf2.A0u;
                        if (th3 == null) {
                            stackTraceString = "";
                        } else {
                            stackTraceString = android.util.Log.getStackTraceString(th3);
                            C14360o3.A0A(stackTraceString);
                        }
                        interfaceC71893X9a2.DZ2(enumC222789sJ2, str2, stackTraceString, th3);
                    }
                });
            }
            X9S x9s = wzf.A0G;
            if (x9s != null) {
                if (th.getMessage() != null) {
                    str = th.getMessage();
                } else {
                    str = "";
                }
                x9s.CjB(new Exception(th), "FBMediaCompositionPlayer_onPlaybackException", str);
            }
        }
    }

    private void A0E(boolean z) {
        A08(this, "doPause: isUserTriggeredPause=%s", Boolean.valueOf(z));
        if (A0F(this)) {
            EnumC222789sJ enumC222789sJ = this.A0z;
            EnumC222789sJ enumC222789sJ2 = EnumC222789sJ.PAUSED;
            if (enumC222789sJ != enumC222789sJ2) {
                WGV wgv = this.A0y;
                wgv.getClass();
                wgv.A09();
                A03();
                A0C(enumC222789sJ2);
                if (z) {
                    W1m.A00(this.A0h, "media_player_pause", A00(this));
                }
            }
        }
    }

    @Override // X.InterfaceC58201Pr7
    public final void E5Z(long j) {
        A08(this, "prepareAndSeek: seekToPositionNs=%s", AbstractC58319PtB.A1Y(j));
        if (this.A0P.A08 != null) {
            A0G(VDF.PREPARE, new Long(j), 0L);
        }
    }

    @Override // X.InterfaceC58201Pr7
    public final void Eaw(C1125456i c1125456i) {
        A08(this, "setPlayTimeRange: timeRange=%s", c1125456i);
        W1m w1m = this.A0h;
        HashMap A00 = A00(this);
        A00.put("time_range", c1125456i.toString());
        W1m.A00(w1m, "media_player_set_time_range", A00);
        VDF vdf = VDF.SET_RANGE;
        A06(vdf);
        A06(VDF.SEEK);
        A0G(vdf, c1125456i, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    @Override // X.InterfaceC58201Pr7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FBN(com.facebook.videolite.transcoder.base.composition.MediaComposition r7, long r8) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WZF.FBN(com.facebook.videolite.transcoder.base.composition.MediaComposition, long):void");
    }
}
