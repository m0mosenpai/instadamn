package X;

import android.content.Context;
import android.media.MediaCodecList;
import android.net.NetworkInfo;
import android.os.Process;
import android.text.TextUtils;
import com.facebook.systrace.Systrace;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.video.heroplayer.ipc.HeroScrollSetting;
import com.facebook.video.heroplayer.ipc.SubtitleConfiguration;
import com.facebook.video.heroplayer.service.errorcallback.ErrorCallback;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.model.mediatype.ProductType;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1wL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41711wL implements InterfaceC13000lm {
    public static boolean A0B;
    public static boolean A0C;
    public C459529d A00;
    public HeroPlayerSetting A01;
    public final Context A04;
    public final UserSession A05;
    public final C29X A06;
    public final ExecutorC14040nU A07;
    public final ScheduledExecutorService A08;
    public static java.util.Set A0A = new HashSet();
    public static final InterfaceC08100bW A0D = new C1QF("IgSecureUriParser").A00;
    public final AtomicBoolean A09 = new AtomicBoolean(false);
    public InterfaceC12870lZ A02 = new InterfaceC12870lZ() { // from class: X.1wR
        @Override // X.InterfaceC12870lZ
        public final void onAppBackgrounded() {
            int A03 = C0f9.A03(-1668051780);
            C459529d c459529d = C41711wL.this.A00;
            if (c459529d != null) {
                C2QC.A03("onAppStateChanged backgrounded", new Object[0]);
                C2VR.A00(C2VR.A05);
                C459529d.A00(c459529d).post(new RunnableC24289Apu(c459529d));
                C2BZ c2bz = c459529d.A06;
                if (c2bz != null) {
                    c2bz.A03 = true;
                }
            }
            C41241vZ A00 = AbstractC41221vX.A00();
            A00.A09.execute(new PLO(A00));
            C0f9.A0A(-599946542, A03);
        }

        @Override // X.InterfaceC12870lZ
        public final void onAppForegrounded() {
            C2BZ c2bz;
            int A03 = C0f9.A03(-1358876196);
            C459529d c459529d = C41711wL.this.A00;
            if (c459529d != null && (c2bz = c459529d.A06) != null) {
                c2bz.A03 = false;
            }
            AbstractC41221vX.A00().A02();
            C0f9.A0A(-891414082, A03);
        }
    };
    public InterfaceC15680qO A03 = new InterfaceC15680qO() { // from class: X.1wT
        @Override // X.InterfaceC15680qO
        public final void onConnectionChanged(NetworkInfo networkInfo) {
            String str;
            SVi sVi;
            if (networkInfo != null) {
                if (networkInfo.getTypeName() != null) {
                    str = networkInfo.getTypeName();
                } else {
                    str = "";
                }
                C459529d c459529d = C41711wL.this.A00;
                C2QC.A03("network type changed to: %s", str);
                synchronized (SVi.class) {
                    sVi = SVi.A01;
                }
                synchronized (sVi) {
                }
                C2A4 c2a4 = c459529d.A09;
                if (c2a4 != null) {
                    c2a4.A01 = str.toUpperCase(Locale.US);
                }
                if (c459529d.A0c != null) {
                    for (C95794Sn c95794Sn : c459529d.A0c.A00.snapshot().values()) {
                        C95794Sn.A07(c95794Sn.A0G.obtainMessage(40, str), c95794Sn);
                    }
                }
            }
        }
    };

    public final void A0D(HeroScrollSetting heroScrollSetting, final boolean z) {
        C459529d c459529d = this.A00;
        C2QC.A03("App is scrolling %s", String.valueOf(z));
        AtomicReference atomicReference = c459529d.A0U;
        if (atomicReference.get() != null) {
            C460529p c460529p = (C460529p) atomicReference.get();
            if (C460529p.A01 != z) {
                C460529p.A01 = z;
                Iterator it = c460529p.A00.iterator();
                while (it.hasNext()) {
                    C46442Bh c46442Bh = (C46442Bh) it.next();
                    Queue<C92274Bh> queue = c46442Bh.A0G;
                    synchronized (queue) {
                        for (C92274Bh c92274Bh : queue) {
                            C46442Bh.A05(c46442Bh, c92274Bh, ((C91954Ab) c92274Bh).A02.A0F);
                        }
                        queue.clear();
                    }
                }
            }
        }
        if (heroScrollSetting.A02) {
            if (!heroScrollSetting.A01) {
                c459529d.A0Q.set(z);
            }
            C2BV c2bv = c459529d.A0c;
            int i = heroScrollSetting.A00;
            for (C95794Sn c95794Sn : c2bv.A00.snapshot().values()) {
                c95794Sn.A0z.set(z);
                c95794Sn.A11.set(i);
                if (z) {
                    C95794Sn.A0D(c95794Sn, i);
                } else {
                    C95794Sn.A09(c95794Sn);
                }
            }
        }
        HeroPlayerSetting heroPlayerSetting = c459529d.A0H;
        if (!heroPlayerSetting.A1b && heroScrollSetting.A03) {
            C459529d.A00(c459529d).post(new Runnable() { // from class: X.4s2
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z2 = z;
                    C92064Am c92064Am = C92064Am.A03;
                    synchronized (c92064Am) {
                        if (z2) {
                            AtomicInteger atomicInteger = c92064Am.A02;
                            if (atomicInteger.get() == 0) {
                                atomicInteger.set(1);
                                java.util.Set set = c92064Am.A01;
                                Map map = c92064Am.A00;
                                Iterator it2 = set.iterator();
                                while (it2.hasNext()) {
                                    int intValue = ((Number) it2.next()).intValue();
                                    Integer valueOf = Integer.valueOf(intValue);
                                    if (!map.containsKey(valueOf)) {
                                        try {
                                            int threadPriority = Process.getThreadPriority(intValue);
                                            Process.setThreadPriority(intValue, 19);
                                            map.put(valueOf, Integer.valueOf(threadPriority));
                                        } catch (IllegalArgumentException unused) {
                                            it2.remove();
                                        } catch (Exception unused2) {
                                        }
                                    }
                                }
                            }
                        } else {
                            AtomicInteger atomicInteger2 = c92064Am.A02;
                            if (atomicInteger2.get() == 1) {
                                atomicInteger2.set(0);
                                java.util.Set set2 = c92064Am.A01;
                                Map map2 = c92064Am.A00;
                                Iterator it3 = map2.keySet().iterator();
                                while (it3.hasNext()) {
                                    int intValue2 = ((Number) it3.next()).intValue();
                                    try {
                                        Integer num = (Integer) map2.get(Integer.valueOf(intValue2));
                                        if (num != null) {
                                            Process.setThreadPriority(intValue2, num.intValue());
                                        }
                                    } catch (IllegalArgumentException unused3) {
                                        set2.remove(Integer.valueOf(intValue2));
                                    } catch (Exception unused4) {
                                    }
                                }
                                map2.clear();
                            }
                        }
                    }
                }
            });
        }
        if (heroPlayerSetting.A2O) {
            c459529d.A0B.A0I.set(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static C4AN A00(Context context, android.net.Uri uri, UserSession userSession, C75363a3 c75363a3, String str) {
        android.net.Uri A02;
        C4AK c4ak;
        C5H1 c5h1;
        ImmutableList immutableList;
        String str2;
        String str3;
        String str4 = c75363a3.A0L;
        String str5 = null;
        if (str4 == null) {
            A02 = null;
        } else {
            A02 = AbstractC08820cl.A02(A0D, str4, true);
        }
        Integer num = c75363a3.A0E;
        String str6 = "";
        switch (num.intValue()) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
                if (c75363a3.A08()) {
                    c4ak = C4AK.DASH_VOD;
                } else {
                    c4ak = C4AK.PROGRESSIVE;
                }
                if (A02 == null && num != C05F.A0Y) {
                    VideoUrlImpl videoUrlImpl = c75363a3.A08;
                    if (videoUrlImpl != null) {
                        InterfaceC224217b A00 = C3WL.A00(videoUrlImpl);
                        C14360o3.A0A(A00);
                        VideoUrlImpl videoUrlImpl2 = (VideoUrlImpl) A00;
                        if (videoUrlImpl2 != null) {
                            str6 = videoUrlImpl2.A06;
                        }
                    }
                    A02 = AbstractC08820cl.A02(A0D, str6, true);
                    if (A02 == null || str6.length() == 0) {
                        C0w9.A03("IgHeroServiceController", "Received invalid video url");
                        break;
                    }
                }
                break;
            case 3:
                c4ak = C4AK.DASH_LIVE;
                break;
            case 6:
                if (c75363a3.A08()) {
                    c4ak = C4AK.DASH_VOD;
                } else {
                    c4ak = C4AK.PROGRESSIVE;
                }
                C5H1 c5h12 = c75363a3.A07;
                if (c5h12 != null && (c5h1 = (C5H1) C3WL.A00(c5h12)) != null) {
                    str6 = c5h1.Ae0();
                }
                A02 = AbstractC08820cl.A03(str6);
                if (str6.length() == 0) {
                    C0w9.A03("IgHeroServiceController", "Received invalid audio url");
                    break;
                }
                break;
            default:
                throw new IllegalArgumentException("Illegal SourceType");
        }
        if (num.equals(C05F.A01)) {
            str5 = "ig_stories";
        }
        if (A02 == null) {
            A02 = android.net.Uri.EMPTY;
        }
        String str7 = c75363a3.A0G;
        String A03 = c75363a3.A03();
        String A04 = c75363a3.A04();
        if (A04 != null && A04.equals("MP3_OR_MP4")) {
            A04 = "undefined";
        }
        if (context != null && C18U.A06(C06090Tz.A05, userSession, 36321932831958938L)) {
            immutableList = c75363a3.A01(context);
            ?? arrayList = new ArrayList();
            arrayList.add("undefined");
            if (immutableList != null && immutableList.contains("MP3_OR_MP4")) {
                immutableList = arrayList;
            }
        } else {
            immutableList = null;
        }
        if (num == C05F.A0N) {
            str2 = c75363a3.A0J;
        } else {
            str2 = null;
        }
        boolean z = c75363a3.A0T;
        boolean z2 = c75363a3.A0Q;
        boolean z3 = c75363a3.A0O;
        Map map = Collections.EMPTY_MAP;
        String A002 = C4AL.A00(A02(num));
        C4AM c4am = C4AM.GENERAL;
        String str8 = c75363a3.A0F;
        List<InterfaceC105674pe> list = c75363a3.A0N;
        String str9 = c75363a3.A0K;
        ArrayList arrayList2 = new ArrayList();
        if (AbstractC442122d.A00(userSession).booleanValue()) {
            if (AbstractC75373a4.A07(userSession)) {
                if (C11X.A01) {
                    str3 = AbstractC75373a4.A00(userSession, str9);
                } else {
                    str3 = C1Q2.A03().getLanguage();
                }
            } else {
                str3 = null;
            }
            if (uri != null) {
                boolean z4 = false;
                if (str3 == null) {
                    z4 = true;
                }
                arrayList2.add(new SubtitleConfiguration(uri, null, z4));
            }
            if (list != null) {
                for (InterfaceC105674pe interfaceC105674pe : list) {
                    android.net.Uri A022 = AbstractC08820cl.A02(A0D, interfaceC105674pe.getUri(), false);
                    if (A022 != null) {
                        arrayList2.add(new SubtitleConfiguration(A022, interfaceC105674pe.BL7(), AbstractC50102Ry.A00(str3, interfaceC105674pe.BL7())));
                    }
                }
            }
        }
        return new C4AN(A02, uri, c4am, c4ak, str7, A03, A04, str, str5, "UNKNOWN", str2, A002, str8, immutableList, arrayList2, map, false, z, z2, z3);
    }

    public static C41711wL A01(final UserSession userSession) {
        return (C41711wL) userSession.A01(C41711wL.class, new InterfaceC16820sZ() { // from class: X.1wO
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C41711wL(UserSession.this);
            }
        });
    }

    public static Integer A02(Integer num) {
        int intValue;
        if (num == null || ((intValue = num.intValue()) != 6 && intValue != 7)) {
            return C05F.A00;
        }
        return C05F.A01;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [X.2CV, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.29c] */
    private void A03(Context context, final C29Y c29y, HeroPlayerSetting heroPlayerSetting, final UserSession userSession) {
        UserSession userSession2 = this.A05;
        HashMap hashMap = new HashMap();
        hashMap.put("prefetch.prefetch_max_cache_file_size", String.valueOf(102400));
        C06090Tz c06090Tz = C06090Tz.A05;
        hashMap.put("prefetch.block_on_same_cache_key_timeout_ms", String.valueOf(Long.valueOf(C18U.A01(c06090Tz, userSession2, 36605611127346486L)).intValue()));
        if (C21W.A00(userSession2).booleanValue()) {
            c06090Tz = C06090Tz.A06;
        }
        hashMap.put("dash.live_num_segments_prefetch", String.valueOf(Long.valueOf(C18U.A01(c06090Tz, userSession2, 36600328319209328L)).intValue()));
        hashMap.put("dash.live_prefetch_max_retries", String.valueOf(8));
        hashMap.put("progressive.enable_throttling_data_source", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        hashMap.put("progressive.throttling_buffer_low", String.valueOf(131100));
        hashMap.put("progressive.throttling_buffer_high", String.valueOf(524300));
        hashMap.put("dummy_default_setting", String.valueOf(1));
        hashMap.put("update_prefetch_priority", String.valueOf(AnonymousClass214.A00(userSession2).booleanValue() ? 1 : 0));
        this.A00 = C459529d.A01(context, heroPlayerSetting, new Object(), hashMap, this.A07, this.A08);
        if (heroPlayerSetting.A1e) {
            C2C9 c2c9 = C2C9.A02;
            InterfaceC16820sZ interfaceC16820sZ = new InterfaceC16820sZ() { // from class: X.2CC
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    String A01 = C1Q2.A01();
                    if (TextUtils.isEmpty(A01)) {
                        return C1Q2.A02().getLanguage();
                    }
                    return A01;
                }
            };
            synchronized (c2c9) {
                C2C9.A01 = interfaceC16820sZ;
            }
            InterfaceC16820sZ interfaceC16820sZ2 = new InterfaceC16820sZ() { // from class: X.2CD
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return Boolean.valueOf(!AbstractC75373a4.A05(UserSession.this));
                }
            };
            synchronized (c2c9) {
                C2C9.A00 = interfaceC16820sZ2;
            }
        }
        AbstractC25061Kk.A00().A0B(this.A00, 0, 1 << new C1KJ[]{C1KJ.A06}[0].ordinal());
        C459529d c459529d = this.A00;
        Context context2 = this.A04;
        final C2CE c2ce = new C2CE(context2, userSession2);
        AtomicReference atomicReference = c459529d.A0T;
        final C2C8 c2c8 = c459529d.A08;
        atomicReference.set(new C29Y(c2c8, c29y, c2ce) { // from class: X.2CU
            public final C2C8 A00;
            public final C29Y A01;
            public final C2CE A02;

            /* JADX WARN: Code restructure failed: missing block: B:262:0x0d24, code lost:
            
                if (r9 != null) goto L129;
             */
            /* JADX WARN: Code restructure failed: missing block: B:263:0x0d26, code lost:
            
                r4.put(com.facebook.proxygen.TraceFieldType.ErrorCode, java.lang.Integer.valueOf(r9.A00));
                r4.put("error", r9.name());
                r3 = r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:264:0x0d3c, code lost:
            
                r0 = "reliability_label";
                r3 = r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:270:0x0d1e, code lost:
            
                if (r3 != 0) goto L129;
             */
            /* JADX WARN: Failed to find 'out' block for switch in B:55:0x00dc. Please report as an issue. */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:123:0x0f85  */
            /* JADX WARN: Removed duplicated region for block: B:126:0x10a2  */
            /* JADX WARN: Removed duplicated region for block: B:194:0x0f8a  */
            /* JADX WARN: Removed duplicated region for block: B:195:0x0f8e  */
            /* JADX WARN: Removed duplicated region for block: B:201:0x0fa4  */
            /* JADX WARN: Removed duplicated region for block: B:202:0x0fba  */
            /* JADX WARN: Removed duplicated region for block: B:203:0x0fd0  */
            /* JADX WARN: Removed duplicated region for block: B:204:0x1099  */
            /* JADX WARN: Removed duplicated region for block: B:205:0x1528  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0f79  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0f7d  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x0f81  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x0fd9  */
            /* JADX WARN: Type inference failed for: r1v175, types: [java.lang.Long] */
            /* JADX WARN: Type inference failed for: r1v302, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Long] */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Long] */
            /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Long] */
            /* JADX WARN: Type inference failed for: r3v4 */
            /* JADX WARN: Type inference failed for: r3v6 */
            /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r3v8 */
            /* JADX WARN: Type inference failed for: r3v9 */
            @Override // X.C29Y
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void ATC(X.AbstractC53312cF r19, int r20) {
                /*
                    Method dump skipped, instructions count: 5722
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2CU.ATC(X.2cF, int):void");
            }

            {
                this.A02 = c2ce;
                this.A00 = c2c8;
                this.A01 = c29y;
            }
        });
        C459529d c459529d2 = this.A00;
        c459529d2.A0W.set(new C2CW(userSession2, new Object()));
        C2CZ.A01.A00 = new ErrorCallback() { // from class: X.2CX
            @Override // com.facebook.video.heroplayer.service.errorcallback.ErrorCallback
            public final void onError(Throwable th, String str, String str2, String str3, Map map) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("errorcode", str2);
                hashMap2.put("errordomain", str);
                if (map != null) {
                    hashMap2.putAll(map);
                }
                AbstractC12120kG.A0J("android_video_playback_fatal_error", th, hashMap2, 941167147);
            }
        };
        C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.2Ca
            @Override // java.lang.Runnable
            public final void run() {
                C18720vz c18720vz = AbstractC12960li.A00;
                C226418s A01 = C226218q.A01(c18720vz);
                A01.A0P(A01.A02, "IG_VIDEO_CACHE_INIT_START");
                C459529d c459529d3 = C41711wL.this.A00;
                C2QC.A03("maybeInitCache due to app idle", new Object[0]);
                c459529d3.A06.A03();
                C226418s A012 = C226218q.A01(c18720vz);
                A012.A0P(A012.A02, "IG_VIDEO_CACHE_INIT_END");
            }

            {
                super(1874417689, 2, false, true);
            }
        });
        final C1CM c1cm = new C1CM(context2);
        AtomicInteger atomicInteger = C46642Cc.A0E;
        C46642Cc.A07 = new InterfaceC16820sZ() { // from class: X.2Cn
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                C1CM c1cm2 = C1CM.this;
                C1CM.A00(c1cm2);
                return Integer.valueOf(c1cm2.A00);
            }
        };
        C46642Cc.A09 = new InterfaceC16820sZ() { // from class: X.2Cp
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return Boolean.valueOf(C1CM.this.A06());
            }
        };
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.56R, java.lang.Object] */
    public static void A04(C41711wL c41711wL) {
        ?? obj = new Object();
        C42871yF A00 = C42871yF.A00();
        ExecutorC14040nU executorC14040nU = new ExecutorC14040nU(C14120nc.A00(), 206, 3, true, false);
        C56S c56s = new C56S(c41711wL.A05, A0C, A0B);
        synchronized (A00) {
            if (!A00.A07) {
                A00.A01 = 7;
                new Thread(new C56T(A00, obj, c56s, executorC14040nU), "LocalSocketVideoProxy").start();
                A00.A07 = true;
            }
        }
        if (!c41711wL.A01.A25) {
            C459529d c459529d = c41711wL.A00;
            String str = C42871yF.A00().A06;
            C2QC.A03("setProxyAddress", new Object[0]);
            C56P.A00(c459529d.A0H, str, c459529d.A0S);
        }
    }

    public static boolean A05(C4AN c4an, UserSession userSession) {
        long j;
        boolean startsWith = c4an.A0A.startsWith("reel_");
        C06090Tz c06090Tz = C06090Tz.A05;
        if (startsWith) {
            j = 36315168260361297L;
        } else {
            j = 36315168260426834L;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }

    public static boolean A07(UserSession userSession, String str) {
        String A04 = C18U.A04(C06090Tz.A05, userSession, 36883035951071717L);
        if (A04.isEmpty()) {
            return false;
        }
        String[] split = A04.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        for (String str2 : split) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int A09() {
        C2BV c2bv = this.A00.A0c;
        if (c2bv != null) {
            return c2bv.A00.snapshot().size();
        }
        return 3;
    }

    public final void A0A() {
        C2BZ c2bz = this.A00.A06;
        if (c2bz != null) {
            String str = c2bz.A06.A01;
            C2BZ.A02(str, C05F.A00);
            C2BZ.A02(str, C05F.A0C);
            C2BZ.A02(str, C05F.A01);
            C2QD A03 = c2bz.A03();
            if (A03 != null) {
                if (A03.A02) {
                    Iterator it = A03.BKo().iterator();
                    while (it.hasNext()) {
                        A03.A00.EGD((String) it.next());
                    }
                } else {
                    A03.A00.A01.clear();
                }
                A03.A00.A04.clear();
            }
        }
    }

    public final void A0B() {
        boolean z;
        int i;
        if (!this.A09.getAndSet(true)) {
            if (Systrace.A0E(1L)) {
                C0fO.A01("startHeroService", -444459956);
            }
            try {
                HeroPlayerSetting heroPlayerSetting = this.A01;
                A0C = heroPlayerSetting.A2o;
                A0B = heroPlayerSetting.A0w.A0x;
                C29X c29x = this.A06;
                C41961wm c41961wm = heroPlayerSetting.A0y;
                UserSession userSession = this.A05;
                C14360o3.A0B(c41961wm, 0);
                C14360o3.A0B(userSession, 1);
                if (c41961wm.A0K) {
                    Context A06 = userSession.deviceSession.A06();
                    synchronized (C14470oJ.class) {
                        long A00 = C14470oJ.A00(A06);
                        z = false;
                        if (A00 <= 1610612736) {
                            z = true;
                        }
                    }
                    if (z) {
                        i = c41961wm.A04;
                    } else {
                        i = c41961wm.A03;
                    }
                    c29x.A00 = new C106744rW(i, c41961wm.A05);
                }
                if (!heroPlayerSetting.A25) {
                    A04(this);
                }
                AbstractC41221vX.A00().A02();
                if (C18U.A06(C06090Tz.A05, userSession, 36319712333799004L)) {
                    C218914p.A08.A0B(this.A02);
                } else {
                    C218914p.A08.A0A(this.A02);
                }
                C18150uz.A0B.A03(this.A03);
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-1170149085);
                }
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(1253689257);
                }
                throw th;
            }
        }
    }

    public final void A0C(int i) {
        C2BV c2bv = this.A00.A0c;
        if (c2bv != null) {
            synchronized (c2bv) {
                c2bv.A00.resize(Math.max(i, 3));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x02d5, code lost:
    
        if (X.C18U.A06(r4, r0, 36324849114690059L) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (r2 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a1, code lost:
    
        if (A06(r0, r5.A09, r44.A08) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0141, code lost:
    
        if (r8 != X.C05F.A0u) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02d7, code lost:
    
        r38 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015e, code lost:
    
        if (r3 == false) goto L74;
     */
    /* JADX WARN: Type inference failed for: r16v0, types: [X.4AO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(X.C4AD r44) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41711wL.A0E(X.4AD):void");
    }

    public final void A0F(String str, boolean z) {
        C459529d c459529d = this.A00;
        C2QC.A03("cancelPrefetchForVideo %s, %b", str, Boolean.valueOf(z));
        C2C8 c2c8 = c459529d.A08;
        if (c2c8 != null) {
            synchronized (c2c8) {
                c2c8.A00.remove(str);
            }
        }
        C46442Bh c46442Bh = c459529d.A0B;
        C4TJ c4tj = new C4TJ(c46442Bh, str);
        C46462Bj c46462Bj = c46442Bh.A03;
        boolean z2 = false;
        int size = c46462Bj.A01(c4tj, "CANCELED_IN_IG_HERO_PER_VIDEO").size();
        C46432Bg c46432Bg = c46442Bh.A07;
        if (c46432Bg != null) {
            String valueOf = String.valueOf(false);
            if (size > 0) {
                z2 = true;
            }
            c46432Bg.A00.A0G.callback(new C138306Om(str, valueOf, "CANCELED_IN_IG_HERO_PER_VIDEO", z2));
        }
        if (z) {
            c46462Bj.A02(c4tj);
        }
    }

    public final boolean A0G(String str) {
        C2QI c2qi;
        C2BZ c2bz = this.A00.A06;
        if (c2bz != null && (c2qi = c2bz.A00) != null) {
            ConcurrentHashMap concurrentHashMap = c2qi.A00;
            java.util.Set set = (java.util.Set) concurrentHashMap.get(str);
            if (set != null) {
                try {
                    if (!set.isEmpty()) {
                        return true;
                    }
                } catch (NullPointerException unused) {
                    android.util.Log.e("PerVideoCacheLookup", String.format("Invalid video cache for video id = %s", str));
                    concurrentHashMap.remove(str);
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (!this.A01.A25) {
            C42871yF.A00().A05(false);
        }
        UserSession userSession = this.A05;
        if (AbstractC201688vy.A01(userSession, C05F.A04)) {
            InterfaceC12870lZ interfaceC12870lZ = this.A02;
            C218914p.A07(interfaceC12870lZ);
            C218914p.A06(interfaceC12870lZ);
        }
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36331124062962869L)) {
            C15670qN.A00(this.A03);
        }
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, X.2Cx] */
    public C41711wL(UserSession userSession) {
        InterfaceC46822Cv A00;
        C46842Cx c46842Cx;
        this.A05 = userSession;
        Context applicationContext = AbstractC12290kX.A00.getApplicationContext();
        this.A04 = applicationContext;
        this.A01 = AbstractC41811wV.A0G(applicationContext, userSession);
        C29X c29x = new C29X(userSession);
        this.A06 = c29x;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36331227141129434L)) {
            MediaCodecList.getCodecCount();
        }
        HeroPlayerSetting heroPlayerSetting = this.A01;
        if (heroPlayerSetting.A2g) {
            this.A08 = C14250np.A00().A00;
            this.A07 = new ExecutorC14040nU(C14120nc.A00(), 337004259, 5, false, true);
            A03(applicationContext, c29x, this.A01, userSession);
        } else {
            A03(applicationContext, c29x, heroPlayerSetting, userSession);
            this.A08 = C14250np.A00().A00;
            this.A07 = new ExecutorC14040nU(C14120nc.A00(), 337004259, 5, false, true);
        }
        if (this.A01.A25) {
            if (C18U.A06(c06090Tz, userSession, 36320756010853235L)) {
                A00 = AbstractC46782Cq.A00(userSession);
            } else {
                A00 = AbstractC54278Nyy.A00(userSession);
            }
            synchronized (C46842Cx.class) {
                synchronized (C46842Cx.A02) {
                    C46842Cx c46842Cx2 = C46842Cx.A01;
                    c46842Cx = c46842Cx2;
                    if (c46842Cx2 == null) {
                        ?? obj = new Object();
                        C46842Cx.A01 = obj;
                        c46842Cx = obj;
                    }
                }
            }
            if (c46842Cx != null) {
                c46842Cx.A00 = A00;
            }
        }
        String A04 = C18U.A04(c06090Tz, userSession, 36891926531670949L);
        if (!A04.isEmpty()) {
            A0A = new HashSet(Arrays.asList(A04.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)));
        }
    }

    public static boolean A06(UserSession userSession, ProductType productType, String str) {
        if (A08(str)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36316070201528261L)) {
                if (C18U.A06(c06090Tz, userSession, 36316070201921481L) && productType == ProductType.CLIPS) {
                    return false;
                }
                if (!C18U.A06(c06090Tz, userSession, 36316070201659334L)) {
                    return true;
                }
                return true ^ C1BU.A00().A03();
            }
            return false;
        }
        return false;
    }

    public static boolean A08(String str) {
        if (!str.equals("explore_popular") && !str.equals("explore")) {
            return false;
        }
        return true;
    }
}
