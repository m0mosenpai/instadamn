package X;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.RectF;
import android.os.Debug;
import android.os.SystemClock;
import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.AsyncAssetFetcher;
import com.facebook.cameracore.common.exception.EffectsFrameworkException;
import com.facebook.cameracore.logging.spars.xplatimpl.XplatSparsLogger;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.platformtexture.implementation.PlatformTextureDataProviderObjectsWrapper;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import com.facebook.cameracore.mediapipeline.services.music.MusicServiceDataSource;
import com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.818, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass818 implements AnonymousClass819, C81A, C81B, InterfaceC179577y7 {
    public static final InterfaceC178407wE A0r = new C201438vY();
    public long A02;
    public C72822Xo6 A03;
    public InterfaceC189918bA A04;
    public InterfaceC149876og A05;
    public PlatformAlgorithmDataSource A06;
    public C174867qM A07;
    public AbstractC2039690j A08;
    public AXC A09;
    public C200608u3 A0A;
    public InterfaceC179187xU A0B;
    public C177817vF A0C;
    public C173707oN A0D;
    public boolean A0G;
    public boolean A0I;
    public boolean A0K;
    public boolean A0N;
    public int[] A0Q;
    public C173687oL A0R;
    public C173677oK A0S;
    public C173697oM A0T;
    public final C178597wX A0V;
    public final C201558vk A0W;
    public final C201568vl A0X;
    public final C201538vi A0Y;
    public final InterfaceC201368vP A0Z;
    public final InterfaceC150356pk A0a;
    public final InterfaceC178337w7 A0b;
    public final ActivityManager A0f;
    public final C201428vX A0g;
    public final C201418vW A0i;
    public final Executor A0j;
    public volatile InterfaceC178407wE A0p;
    public final C201518vg A0h = new Object();
    public final C201528vh A0c = new C201528vh();
    public final Object A0d = new Object();
    public volatile boolean A0m = false;
    public volatile boolean A0n = false;
    public volatile C177807vE A0k = null;
    public volatile C83P A0l = null;
    public volatile AnonymousClass904 A0o = null;
    public String A0E = null;
    public String A0F = null;
    public boolean A0J = false;
    public boolean A0U = false;
    public int A01 = -1;
    public int A00 = -1;
    public boolean A0P = false;
    public boolean A0M = false;
    public boolean A0L = false;
    public volatile boolean A0q = true;
    public boolean A0O = true;
    public boolean A0H = false;
    public final boolean[] A0e = new boolean[EnumC185798Lz.values().length];

    private synchronized void A04() {
        C173687oL c173687oL;
        C173677oK c173677oK;
        C173697oM c173697oM;
        int i;
        if (this.A0m && this.A0B != null) {
            C201518vg c201518vg = this.A0h;
            if (c201518vg.A03 && (c173687oL = c201518vg.A00) != null && (c173677oK = c201518vg.A01) != null && (c173697oM = c201518vg.A02) != null) {
                int i2 = 0;
                c201518vg.A03 = false;
                C201538vi c201538vi = this.A0Y;
                int i3 = c173677oK.A01;
                int i4 = c173677oK.A00;
                Integer num = c173687oL.A00;
                Integer num2 = C05F.A00;
                boolean z = false;
                if (num == num2) {
                    z = true;
                }
                int i5 = c173697oM.A00 * 90;
                int i6 = c173697oM.A01;
                if (z) {
                    i = 360 - ((i6 + i5) % 360);
                } else {
                    i = (i6 - i5) + 360;
                }
                int i7 = i % 360;
                boolean z2 = false;
                if (num == num2) {
                    z2 = true;
                }
                c201538vi.A00 = i7;
                c201538vi.A01 = z2;
                c201538vi.A02.Eho(i3, i4, i3, i7, z2);
                InterfaceC201368vP interfaceC201368vP = this.A0Z;
                if (c201518vg.A00.A00 != num2) {
                    i2 = 1;
                }
                interfaceC201368vP.EQq(i2);
            }
        }
    }

    @Override // X.C81A
    public final void EPl(X9R x9r) {
    }

    private InterfaceC178407wE A00(String str) {
        String str2;
        InterfaceC178407wE interfaceC178407wE = this.A0p;
        if (interfaceC178407wE == null) {
            C177807vE c177807vE = this.A0k;
            if (c177807vE != null) {
                str2 = c177807vE.A04;
            } else {
                str2 = "null_config";
            }
            C0K8.A0C("FbMsqrdRenderer", "====== No proper logger !!!!!!!!!! ======");
            QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
            if (qPLInstance != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("use_case", str);
                if (str2 == null) {
                    str2 = "null_product_name";
                }
                hashMap.put("product_name", str2);
                qPLInstance.markerGenerateWithAnnotations(11282540, (short) 4, 1L, TimeUnit.MILLISECONDS, hashMap);
            }
            return A0r;
        }
        return interfaceC178407wE;
    }

    private void A01() {
        if (!this.A0U) {
            this.A0Z.EGq();
            this.A0U = true;
            C83P c83p = this.A0l;
            C177807vE c177807vE = this.A0k;
            if (c83p != null && c177807vE != null) {
                c83p.A07(c177807vE.A0A);
            }
        }
    }

    private void A02() {
        InterfaceC149876og interfaceC149876og = this.A05;
        if (interfaceC149876og != null) {
            C173687oL c173687oL = this.A0R;
            if (c173687oL != null) {
                interfaceC149876og.EQr(c173687oL.A00);
                this.A0R = null;
            }
            C173707oN c173707oN = this.A0D;
            if (c173707oN != null) {
                this.A05.setPreviewViewInfo(c173707oN.A02, c173707oN.A01, c173707oN.A00);
                this.A0D = null;
            }
            C173677oK c173677oK = this.A0S;
            if (c173677oK != null) {
                this.A05.setCaptureDeviceSize(c173677oK.A01, c173677oK.A00);
                C173677oK c173677oK2 = this.A0S;
                this.A0Q = new int[]{c173677oK2.A01, c173677oK2.A00};
                this.A0S = null;
            }
            C173697oM c173697oM = this.A0T;
            if (c173697oM != null) {
                this.A05.setRotation(c173697oM.A00);
                this.A0T = null;
            }
            C177817vF c177817vF = this.A0C;
            if (c177817vF != null) {
                this.A05.ERD(c177817vF.A00);
                this.A0C = null;
            }
        }
    }

    private void A03() {
        Arrays.fill(this.A0e, false);
        C9M2.A01(this, this.A0B);
        if (this.A0n || this.A0U) {
            synchronized (this.A0d) {
                A09(this.A0k, null, "release", false);
                this.A0n = false;
                this.A0Z.EGs();
                this.A0U = false;
            }
        }
        this.A0l = null;
        this.A0m = false;
        this.A0o = null;
        AXC axc = this.A09;
        if (axc != null) {
            axc.release();
            this.A09 = null;
        }
        hashCode();
    }

    private void A06(C177807vE c177807vE, int i) {
        String str;
        boolean z;
        String str2;
        InterfaceC201488vd BYr = A00(AnonymousClass001.A0O("logXEvent ", i)).BYr();
        if (c177807vE != null) {
            str = c177807vE.A07;
            z = false;
        } else {
            str = "null_config_session";
            z = true;
        }
        boolean onEvent = BYr.onEvent(i, str, z);
        String A0O = AnonymousClass001.A0O("event_", i);
        if (c177807vE != null) {
            str2 = c177807vE.A04;
        } else {
            str2 = "null_config";
        }
        A0B(onEvent, A0O, str2);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, X.ABJ] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, X.ABJ] */
    private void A07(C177807vE c177807vE, C83P c83p) {
        Object obj;
        ABJ abj;
        int A03;
        int A032;
        int A033;
        int A034;
        AnonymousClass904 anonymousClass904;
        HashMap hashMap;
        String str;
        String str2;
        String str3;
        String str4;
        EnumC150616qF enumC150616qF;
        ImmutableList immutableList;
        EnumC200638u6 enumC200638u6;
        AudioPlatformComponentHost audioPlatformComponentHost;
        AudioPlatformComponentHost audioPlatformComponentHost2;
        A04();
        InterfaceC201368vP interfaceC201368vP = this.A0Z;
        EffectServiceHost B0d = interfaceC201368vP.B0d();
        String str5 = c177807vE.A05;
        if (str5 != null) {
            B0d.mProductSessionId = str5;
        }
        try {
            FaceTrackerDataProviderConfig faceTrackerDataProviderConfig = interfaceC201368vP.B0d().mEffectServiceHostConfig.mFaceTrackerDataProviderConfig;
            Integer num = C05F.A00;
            if (faceTrackerDataProviderConfig != null && faceTrackerDataProviderConfig.executionMode != 0) {
                num = C05F.A01;
            }
            C201558vk c201558vk = this.A0W;
            AnonymousClass905 anonymousClass905 = new AnonymousClass905(c177807vE.A03);
            c201558vk.A00 = anonymousClass905;
            HashMap hashMap2 = c177807vE.A0I;
            if (hashMap2 != null) {
                String[] strArr = (String[]) hashMap2.keySet().toArray(new String[0]);
                String[] strArr2 = new String[hashMap2.size()];
                for (int i = 0; i < hashMap2.size(); i++) {
                    strArr2[i] = hashMap2.get(strArr[i]);
                }
                String str6 = c177807vE.A09;
                anonymousClass905 = c201558vk.A00;
                anonymousClass905.A00 = new AnonymousClass910(new AWR(c201558vk, c177807vE), num, null, null, str6, strArr, strArr2, false);
            }
            String str7 = c177807vE.A0H;
            if (str7 != null) {
                AKY aky = new AKY(C211359Wj.A00, 64);
                int A035 = aky.A03(str7);
                aky.A08(1);
                aky.A0A(0, A035);
                aky.A06(aky.A01());
                aky.A04();
                AG3 ag3 = new AG3(C211389Wm.class, aky.A07);
                ?? obj2 = new Object();
                obj2.A00(ag3);
                anonymousClass905.A01(new C22859A6c(EnumC150506pz.A1I, obj2));
            }
            String str8 = c177807vE.A08;
            if (str8 != null) {
                AnonymousClass905 anonymousClass9052 = c201558vk.A00;
                AKY aky2 = new AKY(C211359Wj.A00, 64);
                int A036 = aky2.A03(str8);
                aky2.A08(4);
                aky2.A0A(0, A036);
                aky2.A06(aky2.A01());
                aky2.A04();
                AG3 ag32 = new AG3(C211379Wl.class, aky2.A07);
                ?? obj3 = new Object();
                obj3.A00(ag32);
                anonymousClass9052.A01(new C22859A6c(EnumC150506pz.A0R, obj3));
            }
            String str9 = c177807vE.A0F;
            if (str9 != null || c177807vE.A0D != null) {
                String str10 = c177807vE.A0G;
                String str11 = c177807vE.A0D;
                String str12 = c177807vE.A0E;
                AnonymousClass905 anonymousClass9053 = c201558vk.A00;
                EnumC150506pz enumC150506pz = EnumC150506pz.A15;
                C22859A6c c22859A6c = (C22859A6c) anonymousClass9053.A07.get(enumC150506pz);
                if (c22859A6c == null) {
                    abj = new Object();
                } else {
                    abj = c22859A6c.A01;
                }
                c201558vk.A01 = abj;
                if (c22859A6c == null) {
                    c201558vk.A00.A01(new C22859A6c(enumC150506pz, abj));
                }
                c201558vk.A01.A02 = new C63965Swr(c201558vk.A03);
                AKY aky3 = new AKY(C211359Wj.A00, 512);
                if (str9 == null) {
                    A03 = 0;
                } else {
                    A03 = aky3.A03(str9);
                }
                if (str10 == null) {
                    A032 = 0;
                } else {
                    A032 = aky3.A03(str10);
                }
                if (str11 == null) {
                    A033 = 0;
                } else {
                    A033 = aky3.A03(str11);
                }
                if (str12 == null) {
                    A034 = 0;
                } else {
                    A034 = aky3.A03(str12);
                }
                aky3.A08(6);
                aky3.A0A(3, A034);
                aky3.A0A(2, A033);
                aky3.A0A(1, A032);
                aky3.A0A(0, A03);
                aky3.A06(aky3.A01());
                ABJ abj2 = c201558vk.A01;
                aky3.A04();
                abj2.A00(new AG3(C211399Wn.class, aky3.A07));
            }
            Map map = c177807vE.A0K;
            if (map != null) {
                String[] strArr3 = (String[]) map.keySet().toArray(new String[0]);
                String[] strArr4 = new String[map.size()];
                for (int i2 = 0; i2 < map.size(); i2++) {
                    strArr4[i2] = map.get(strArr3[i2]);
                }
                c201558vk.A00.A00(C9Y3.A02, new C9Y3(strArr3, strArr4));
            }
            anonymousClass904 = new AnonymousClass904(c201558vk.A00);
            AnonymousClass906 anonymousClass906 = anonymousClass904.A06;
            if (anonymousClass906 != null) {
                InterfaceC189918bA interfaceC189918bA = this.A04;
                anonymousClass906.A01 = interfaceC189918bA;
                WeakReference weakReference = anonymousClass906.A04;
                if (weakReference != null && (audioPlatformComponentHost2 = (AudioPlatformComponentHost) weakReference.get()) != null) {
                    ((AudioPlatformComponentHostImpl) audioPlatformComponentHost2).mExternalAudioProvider = interfaceC189918bA;
                }
                boolean z = this.A0G;
                anonymousClass906.A05 = z;
                if (weakReference != null && (audioPlatformComponentHost = (AudioPlatformComponentHost) weakReference.get()) != null) {
                    audioPlatformComponentHost.setMuted(z);
                }
            }
            C203848zt c203848zt = C2039290e.A01;
            hashMap = anonymousClass904.A08;
            if (hashMap.containsKey(c203848zt)) {
                this.A06 = ((C2039290e) anonymousClass904.A02(c203848zt)).A00;
            }
            this.A0o = anonymousClass904;
            AnalyticsLogger Abc = interfaceC201368vP.Abc();
            String str13 = interfaceC201368vP.B0d().mProductSessionId;
            if (Abc != null) {
                String str14 = c177807vE.A04;
                if (str14 == null) {
                    str14 = "";
                }
                String str15 = c177807vE.A0A;
                String str16 = c177807vE.A0B;
                String str17 = c177807vE.A01;
                if (str17 == null) {
                    str17 = "";
                }
                String str18 = c177807vE.A07;
                if (str18 == null) {
                    str18 = "";
                }
                EnumC150616qF enumC150616qF2 = c177807vE.A00;
                AnalyticsLoggerImpl analyticsLoggerImpl = (AnalyticsLoggerImpl) Abc;
                analyticsLoggerImpl.mProductName = str14;
                analyticsLoggerImpl.mEffectStartIntent = enumC150616qF2;
                InterfaceC150566q9 interfaceC150566q9 = analyticsLoggerImpl.mCameraARAnalyticsLogger;
                if (interfaceC150566q9 != null) {
                    interfaceC150566q9.EW7(enumC150616qF2, str14, str15, str16, str17, str18, str13, false);
                }
            }
            if (c177807vE.A00 == EnumC150616qF.USER_INTERACTION) {
                c177807vE.A00 = EnumC150616qF.SYSTEM;
            }
            c177807vE.A01 = null;
            if (anonymousClass906 != null) {
                C68680VaG c68680VaG = new C68680VaG(A00("tryPassLoggerToAudioConfiguration"));
                anonymousClass906.A03 = c68680VaG;
                WeakReference weakReference2 = anonymousClass906.A04;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((AudioPlatformComponentHostImpl) ((AudioPlatformComponentHost) weakReference2.get())).mAudioLogger = c68680VaG;
                }
            }
            str = c177807vE.A07;
            str2 = str;
            str3 = interfaceC201368vP.B0d().mProductSessionId;
            str4 = c177807vE.A01;
            enumC150616qF = c177807vE.A00;
            SystemClock.elapsedRealtime();
        } catch (EffectsFrameworkException e) {
            A08(this.A0k, e);
            this.A0k = null;
            String str19 = c177807vE.A06;
            StringBuilder sb = new StringBuilder();
            sb.append("setEffectToEngine failed, file exist: ");
            if (str19 != null) {
                obj = Boolean.valueOf(new File(str19).exists());
            } else {
                obj = "null path";
            }
            sb.append(obj);
            String obj4 = sb.toString();
            C14360o3.A0A(obj4);
            AbstractC12120kG.A07("FbMsqrdRenderer", obj4, e);
            if (c83p != null) {
                c83p.A0A(c177807vE.A0A, e);
            }
        }
        try {
            try {
                this.A0J = true;
                this.A0K = true;
                this.A02 = 0L;
                this.A0N = false;
                List ANB = interfaceC201368vP.ANB(anonymousClass904);
                String str20 = c177807vE.A0A;
                String str21 = c177807vE.A0B;
                List list = c177807vE.A0J;
                if (list != null) {
                    immutableList = ImmutableList.copyOf((Collection) list);
                } else {
                    immutableList = null;
                }
                AsyncAssetFetcher asyncAssetFetcher = new AsyncAssetFetcher(str20, str21, immutableList, c177807vE.A02, false);
                String str22 = "";
                if (str == null) {
                    str2 = "";
                }
                if (str3 == null) {
                    str3 = "";
                }
                if (str4 != null) {
                    str22 = str4;
                }
                String str23 = c177807vE.A06;
                str23.getClass();
                interfaceC201368vP.ETd(asyncAssetFetcher, anonymousClass904.A05, enumC150616qF, null, this.A0c, str20, str21, str2, str3, str22, str23, ANB, true);
                this.A0X.A01 = true;
                if (this.A08 != null) {
                    EffectManifest BPZ = interfaceC201368vP.BPZ();
                    AbstractC2039690j abstractC2039690j = this.A08;
                    C2039890l c2039890l = new C2039890l(BPZ.supportsTapGesture, BPZ.supportsPanGesture, BPZ.supportsPinchGesture, BPZ.supportsRotateGesture, BPZ.supportsLongPressGesture, BPZ.supportsRawTouchGesture, BPZ.usesTouchService);
                    if (abstractC2039690j instanceof C2039590i) {
                        C2039590i c2039590i = (C2039590i) abstractC2039690j;
                        c2039590i.A01 = c2039890l;
                        C2039790k c2039790k = c2039590i.A00;
                        if (c2039790k != null) {
                            c2039790k.A0B = c2039890l;
                            C2039790k.A03(c2039790k);
                        }
                    }
                }
                SystemClock.elapsedRealtime();
                C203848zt c203848zt2 = AnonymousClass901.A01;
                if (hashMap.containsKey(c203848zt2)) {
                    this.A05 = ((AnonymousClass901) anonymousClass904.A02(c203848zt2)).A00;
                    A02();
                }
                C203848zt c203848zt3 = C2039490h.A01;
                if (hashMap.containsKey(c203848zt3)) {
                    this.A08 = ((C2039490h) anonymousClass904.A02(c203848zt3)).A00;
                    if (this.A0J) {
                        EffectManifest BPZ2 = interfaceC201368vP.BPZ();
                        AbstractC2039690j abstractC2039690j2 = this.A08;
                        C2039890l c2039890l2 = new C2039890l(BPZ2.supportsTapGesture, BPZ2.supportsPanGesture, BPZ2.supportsPinchGesture, BPZ2.supportsRotateGesture, BPZ2.supportsLongPressGesture, BPZ2.supportsRawTouchGesture, BPZ2.usesTouchService);
                        if (abstractC2039690j2 instanceof C2039590i) {
                            C2039590i c2039590i2 = (C2039590i) abstractC2039690j2;
                            c2039590i2.A01 = c2039890l2;
                            C2039790k c2039790k2 = c2039590i2.A00;
                            if (c2039790k2 != null) {
                                c2039790k2.A0B = c2039890l2;
                                C2039790k.A03(c2039790k2);
                            }
                        }
                    }
                    C174867qM c174867qM = this.A07;
                    if (c174867qM != null) {
                        c174867qM.A00(this.A08);
                    }
                }
                C200608u3 c200608u3 = this.A0A;
                if (c200608u3 == null) {
                    c200608u3 = new C200608u3(new C200618u4(this));
                    this.A0A = c200608u3;
                }
                c200608u3.A01 = EnumC200638u6.NONE;
                c200608u3.A02 = true;
                if (interfaceC201368vP.CKs()) {
                    EnumC201408vV enumC201408vV = interfaceC201368vP.BPZ().frameFormatForPostProcessing;
                    if (enumC201408vV == EnumC201408vV.YUV) {
                        enumC200638u6 = EnumC200638u6.RGBA;
                    } else if (enumC201408vV == EnumC201408vV.Y) {
                        enumC200638u6 = EnumC200638u6.LUM;
                    }
                    c200608u3.A01 = enumC200638u6;
                }
                A0A(this.A0B);
                if (c83p != null) {
                    c83p.A08(B0d.mAttribution, B0d.mEffectManifest, B0d, str20);
                }
                if (A0C("setMsqrdConfigStage2")) {
                    A06(c177807vE, 5);
                    A05(c177807vE, 5);
                } else if (str != null) {
                    InterfaceC150356pk interfaceC150356pk = this.A0a;
                    interfaceC150356pk.markPoint(interfaceC150356pk.getInstanceIdWithString(16321564, str), 3, str);
                }
                this.A0X.A01 = true;
            } catch (Throwable th) {
                SystemClock.elapsedRealtime();
                throw th;
            }
        } catch (UnsatisfiedLinkError e2) {
            throw new Exception(e2.getMessage());
        }
    }

    private void A08(C177807vE c177807vE, Exception exc) {
        String str;
        C9M2.A01(this, this.A0B);
        if (exc != null) {
            str = "ex";
        } else {
            str = "noex";
        }
        A09(c177807vE, exc, AnonymousClass001.A0R("unsetMsqrd-", str), false);
        this.A0l = null;
        this.A0m = false;
        this.A0o = null;
        AXC axc = this.A09;
        if (axc != null) {
            axc.release();
            this.A09 = null;
        }
    }

    private void A09(C177807vE c177807vE, Exception exc, String str, boolean z) {
        String str2;
        String message;
        String str3;
        String message2;
        AnalyticsLogger Abc;
        PlatformTextureDataProviderObjectsWrapper platformTextureDataProviderObjectsWrapper;
        List list;
        C1814883b c1814883b;
        BDB bdb;
        if (c177807vE != null) {
            if (A0C(AnonymousClass001.A0R("stopEffect1-", str))) {
                if (z) {
                    A06(c177807vE, 11);
                }
                A06(c177807vE, 12);
                A05(c177807vE, 12);
            } else {
                String str4 = c177807vE.A07;
                if (str4 != null) {
                    InterfaceC150356pk interfaceC150356pk = this.A0a;
                    interfaceC150356pk.markPoint(interfaceC150356pk.getInstanceIdWithString(16321564, str4), 7, str4);
                }
            }
        }
        C83P c83p = this.A0l;
        boolean z2 = this.A0J;
        InterfaceC201368vP interfaceC201368vP = this.A0Z;
        if (z2) {
            interfaceC201368vP.EoW();
        } else {
            interfaceC201368vP.AHT();
        }
        AnonymousClass904 anonymousClass904 = this.A0o;
        if (anonymousClass904 != null) {
            for (AbstractC203838zs abstractC203838zs : anonymousClass904.A08.values()) {
                if (abstractC203838zs instanceof C2040090p) {
                    C200478tq c200478tq = ((C2040090p) abstractC203838zs).A00;
                    if (c200478tq != null && (platformTextureDataProviderObjectsWrapper = c200478tq.A00) != null) {
                        platformTextureDataProviderObjectsWrapper.mHybridData.resetNative();
                    }
                } else if (abstractC203838zs instanceof C2039490h) {
                    AbstractC2039690j abstractC2039690j = ((C2039490h) abstractC203838zs).A00;
                    if (abstractC2039690j instanceof C2039590i) {
                        list = ((C2039590i) abstractC2039690j).A03;
                    } else {
                        list = ((C9YK) abstractC2039690j).A01;
                    }
                    list.clear();
                } else if (abstractC203838zs instanceof C90W) {
                    MusicServiceDataSource musicServiceDataSource = ((C90W) abstractC203838zs).A00;
                    if (musicServiceDataSource != null) {
                        musicServiceDataSource.stop();
                    }
                } else if (abstractC203838zs instanceof AnonymousClass901) {
                    InterfaceC149876og interfaceC149876og = ((AnonymousClass901) abstractC203838zs).A00;
                    if (interfaceC149876og != null) {
                        interfaceC149876og.stop();
                    }
                } else if ((abstractC203838zs instanceof C90O) && (c1814883b = ((C90O) abstractC203838zs).A00) != null && (bdb = c1814883b.A00) != null) {
                    bdb.stop();
                }
            }
        }
        C174867qM c174867qM = this.A07;
        String str5 = null;
        if (c174867qM != null) {
            c174867qM.A00(null);
        }
        this.A0T = null;
        this.A0S = null;
        this.A0R = null;
        this.A0D = null;
        this.A05 = null;
        this.A0J = false;
        AXC axc = this.A09;
        if (axc != null) {
            axc.release();
            this.A09 = null;
        }
        if (exc == null) {
            if (interfaceC201368vP.CKs() && (Abc = interfaceC201368vP.Abc()) != null) {
                C150626qG c150626qG = new C150626qG(Abc);
                C150646qJ c150646qJ = XplatSparsLogger.Companion;
                C150646qJ.A00(c150626qG);
            }
            if (c177807vE != null) {
                if (A0C(AnonymousClass001.A0R("stopEffect3-", str))) {
                    A06(c177807vE, 13);
                } else {
                    String str6 = c177807vE.A07;
                    if (str6 != null) {
                        InterfaceC150356pk interfaceC150356pk2 = this.A0a;
                        interfaceC150356pk2.endSuccess(interfaceC150356pk2.getInstanceIdWithString(16321564, str6), str6);
                    }
                }
            }
        } else {
            if (c177807vE != null && !A0C(AnonymousClass001.A0R("stopEffect4-", str))) {
                InterfaceC150356pk interfaceC150356pk3 = this.A0a;
                String str7 = c177807vE.A07;
                long instanceIdWithString = interfaceC150356pk3.getInstanceIdWithString(16321564, str7);
                if (exc.getMessage() == null) {
                    message2 = "";
                } else {
                    message2 = exc.getMessage();
                }
                String A0R = AnonymousClass001.A0R("Loading effect error: ", message2);
                if (str7 == null) {
                    str7 = "";
                }
                interfaceC150356pk3.endFail(instanceIdWithString, "renderer", 1, A0R, str7);
            }
            if (A0C(AnonymousClass001.A0R("stopEffect5-", str))) {
                InterfaceC201488vd BYr = A00(AnonymousClass001.A0R("stopEffect-", str)).BYr();
                if (c177807vE != null) {
                    str2 = c177807vE.A07;
                } else {
                    str2 = "null_config_session";
                }
                if (exc.getMessage() == null) {
                    message = "EffectsFrameworkException";
                } else {
                    message = exc.getMessage();
                }
                boolean onFailureEvent = BYr.onFailureEvent(6, str2, "renderer", 1, message);
                String A0R2 = AnonymousClass001.A0R("stopEffect5-", str);
                if (c177807vE != null) {
                    str3 = c177807vE.A04;
                } else {
                    str3 = "null_config";
                }
                A0B(onFailureEvent, A0R2, str3);
            }
        }
        if (c83p != null && this.A0N) {
            if (c177807vE != null) {
                str5 = c177807vE.A0A;
            }
            c83p.A09(str5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
    
        if (r0 == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0A(X.InterfaceC179187xU r8) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass818.A0A(X.7xU):void");
    }

    public static void A0B(boolean z, String str, String str2) {
        QuickPerformanceLogger qPLInstance;
        if (!z && (qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance()) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("use_case", AnonymousClass001.A0R("jni_null_", str));
            if (str2 == null) {
                str2 = "null_product_name";
            }
            hashMap.put("product_name", str2);
            qPLInstance.markerGenerateWithAnnotations(11282540, (short) 4, 1L, TimeUnit.MILLISECONDS, hashMap);
        }
    }

    private boolean A0C(String str) {
        if (this.A0V.A00.CUZ(135) && !(A00(AnonymousClass001.A0R("useARXLogger-", str)) instanceof C201438vY)) {
            return true;
        }
        return false;
    }

    public final EffectServiceHost A0D() {
        InterfaceC201368vP interfaceC201368vP = this.A0Z;
        if (interfaceC201368vP.CKs()) {
            return interfaceC201368vP.B0d();
        }
        return null;
    }

    public final HashMap A0E() {
        HashMap hashMap = new HashMap();
        hashMap.put("filter_type", "msqrd");
        String str = this.A0E;
        if (str != null) {
            hashMap.put("effect_id", str);
        }
        String str2 = this.A0F;
        if (str2 != null) {
            hashMap.put("effect_instance_id", str2);
        }
        C177807vE c177807vE = this.A0k;
        if (c177807vE != null) {
            hashMap.put("effect_session_id", c177807vE.A07);
        }
        return hashMap;
    }

    public final void A0F(InterfaceC189918bA interfaceC189918bA) {
        AnonymousClass906 anonymousClass906;
        AudioPlatformComponentHost audioPlatformComponentHost;
        this.A04 = interfaceC189918bA;
        AnonymousClass904 anonymousClass904 = this.A0o;
        if (anonymousClass904 != null && (anonymousClass906 = anonymousClass904.A06) != null) {
            anonymousClass906.A01 = interfaceC189918bA;
            WeakReference weakReference = anonymousClass906.A04;
            if (weakReference != null && (audioPlatformComponentHost = (AudioPlatformComponentHost) weakReference.get()) != null) {
                ((AudioPlatformComponentHostImpl) audioPlatformComponentHost).mExternalAudioProvider = interfaceC189918bA;
            }
        }
    }

    public final void A0H(C173677oK c173677oK) {
        C201518vg c201518vg = this.A0h;
        if (c173677oK != null && !c173677oK.equals(c201518vg.A01)) {
            c201518vg.A01 = c173677oK;
            c201518vg.A03 = true;
        }
        this.A0S = c173677oK;
        A02();
        A04();
    }

    @Deprecated
    public final void A0I(boolean z) {
        AnonymousClass906 anonymousClass906;
        AudioPlatformComponentHost audioPlatformComponentHost;
        this.A0G = z;
        AnonymousClass904 anonymousClass904 = this.A0o;
        if (anonymousClass904 != null && (anonymousClass906 = anonymousClass904.A06) != null) {
            anonymousClass906.A05 = z;
            WeakReference weakReference = anonymousClass906.A04;
            if (weakReference != null && (audioPlatformComponentHost = (AudioPlatformComponentHost) weakReference.get()) != null) {
                audioPlatformComponentHost.setMuted(z);
            }
        }
    }

    @Override // X.C81A
    public final Integer BIA() {
        return C05F.A01;
    }

    @Override // X.C81B
    public final boolean CZ1() {
        if (this.A0J) {
            InterfaceC201368vP interfaceC201368vP = this.A0Z;
            if (interfaceC201368vP.CKs()) {
                return interfaceC201368vP.BPZ().multipleOutputsSupported;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x023f, code lost:
    
        if (r8.A00 != r7) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0173, code lost:
    
        if (CZ1() == false) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02dc  */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.7oK, java.lang.Object] */
    @Override // X.C81A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DCH(X.C201278vB r26, long r27) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass818.DCH(X.8vB, long):boolean");
    }

    @Override // X.C81A
    public final void Dr3(int i, int i2) {
        boolean z;
        this.A01 = i;
        this.A00 = i2;
        if (this.A0n) {
            this.A0Z.EGt(i, i2);
            z = false;
        } else {
            z = true;
        }
        this.A0P = z;
    }

    @Override // X.C81A
    public final void Dr7(C179877yd c179877yd) {
        this.A0h.A03 = true;
    }

    @Override // X.C81A
    public final void Dr8(RectF rectF) {
        Dr3(this.A01, this.A00);
    }

    @Override // X.C81B
    public final void ETG(C201528vh c201528vh) {
        C201528vh c201528vh2 = this.A0c;
        c201528vh2.A00 = c201528vh.A00;
        c201528vh2.A01 = c201528vh.A01;
    }

    @Override // X.InterfaceC179577y7
    public final void Ecb(InterfaceC179187xU interfaceC179187xU) {
        InterfaceC179187xU interfaceC179187xU2 = this.A0B;
        if (interfaceC179187xU != interfaceC179187xU2) {
            if (interfaceC179187xU2 != null) {
                interfaceC179187xU2.F9Y(this, EnumC179217xX.A0Y);
                interfaceC179187xU2.F9Y(this, EnumC179217xX.A0k);
                interfaceC179187xU2.F9Y(this, EnumC179217xX.A0Q);
                interfaceC179187xU2.F9Y(this, EnumC179217xX.A0l);
            }
            if (interfaceC179187xU != null) {
                interfaceC179187xU.EDH(this, EnumC179217xX.A0Y);
                interfaceC179187xU.EDH(this, EnumC179217xX.A0k);
                interfaceC179187xU.EDH(this, EnumC179217xX.A0Q);
                interfaceC179187xU.EDH(this, EnumC179217xX.A0l);
            }
            if (this.A0m) {
                C9M2.A01(this, this.A0B);
                C9M2.A00(this, interfaceC179187xU);
                if (this.A0n) {
                    A0A(interfaceC179187xU);
                }
            }
            this.A0B = interfaceC179187xU;
        }
    }

    @Override // X.C81A
    public final boolean Ejv() {
        return false;
    }

    @Override // X.C81A
    public final boolean isEnabled() {
        if (this.A0q && this.A0m) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.8vg] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.8vj] */
    public AnonymousClass818(Context context, C178597wX c178597wX, C201428vX c201428vX, InterfaceC201368vP interfaceC201368vP, InterfaceC150356pk interfaceC150356pk, final C201418vW c201418vW, Executor executor) {
        this.A0i = c201418vW;
        this.A0g = c201428vX;
        this.A0V = c178597wX;
        this.A0b = c178597wX.A00;
        this.A0j = executor;
        this.A0Z = interfaceC201368vP;
        this.A0Y = new C201538vi(interfaceC201368vP);
        this.A0W = new C201558vk(context, new Object(c201418vW) { // from class: X.8vj
            public final C201418vW A00;

            {
                this.A00 = c201418vW;
            }
        });
        this.A0X = new C201568vl(c201428vX, interfaceC201368vP);
        this.A0a = interfaceC150356pk;
        this.A0f = (ActivityManager) context.getSystemService("activity");
        hashCode();
    }

    private void A05(C177807vE c177807vE, int i) {
        ActivityManager activityManager;
        String str;
        String str2;
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (qPLInstance != null && (activityManager = this.A0f) != null && c177807vE != null && (str = c177807vE.A07) != null) {
            int hashCode = str.hashCode();
            if (qPLInstance.isMarkerOn(16323880, hashCode)) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                Runtime runtime = Runtime.getRuntime();
                long freeMemory = runtime.totalMemory() - runtime.freeMemory();
                long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
                MarkerEditor withMarker = qPLInstance.withMarker(16323880, hashCode);
                switch (i) {
                    case 4:
                        str2 = "effect_setting_started";
                        break;
                    case 5:
                        str2 = "effect_setting_finished";
                        break;
                    case 6:
                        str2 = "effect_setting_failed";
                        break;
                    case 7:
                        str2 = "effect_first_frame_started";
                        break;
                    case 8:
                        str2 = "effect_first_frame_finished";
                        break;
                    case 9:
                        str2 = "effect_first_frame_async";
                        break;
                    case 10:
                        str2 = "effect_first_frame_failed";
                        break;
                    case 11:
                        str2 = "effect_getting_swapped";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        str2 = "effect_deselecting_started";
                        break;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        str2 = "effect_deselecting_finished";
                        break;
                    case 14:
                        str2 = "effect_new_selection_requested";
                        break;
                    case Process.SIGTERM /* 15 */:
                        str2 = "low_on_memory";
                        break;
                    case 16:
                        str2 = "effect_frame_10";
                        break;
                    case 17:
                        str2 = "effect_frame_30";
                        break;
                    case 18:
                        str2 = "effect_frame_150";
                        break;
                    default:
                        str2 = "effect_frame_600";
                        break;
                }
                withMarker.pointEditor(str2).addPointData("java_heap", freeMemory).addPointData("native_neap", nativeHeapAllocatedSize).addPointData("avail_mem", memoryInfo.availMem).addPointData("is_low_mem", memoryInfo.lowMemory).markerEditingCompleted();
            }
        }
    }

    public final void A0G(InterfaceC178407wE interfaceC178407wE) {
        hashCode();
        if (interfaceC178407wE != null) {
            interfaceC178407wE.hashCode();
        }
        this.A0p = interfaceC178407wE;
        if (interfaceC178407wE != null) {
            boolean z = interfaceC178407wE instanceof C201438vY;
            if (z) {
                C0K8.A0D("FbMsqrdRenderer", "Dummy Logger used !!!");
            }
            QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
            if (qPLInstance != null) {
                short s = 2;
                if (z) {
                    s = 3;
                }
                qPLInstance.markerGenerate(11282540, s, 1L, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0230, code lost:
    
        if (r7.equals(r0) == false) goto L99;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.InterfaceC179577y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DfO(X.InterfaceC179247xa r12) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass818.DfO(X.7xa):void");
    }

    @Override // X.C81A
    public final void DrA() {
        A03();
    }
}
