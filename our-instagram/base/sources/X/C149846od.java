package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.model.XplatAssetType;
import com.facebook.cameracore.ardelivery.xplat.models.XplatRemoteAsset;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.facebook.cameracore.mediapipeline.services.music.MusicServiceDataSource;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import com.facebook.cameracore.recognizer.logger.RecognizerLogger;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.google.common.collect.ImmutableMap;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6od, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149846od implements InterfaceC149836oc {
    public static final InterfaceC149876og A0K = new C149866of(0);
    public static final String __redex_internal_original_name = "IgCameraEffectManager";
    public GalleryPickerServiceDataSource A00;
    public final Context A01;
    public final C150156pL A02;
    public final UserSession A04;
    public final C150716qS A09;
    public final MusicServiceDataSource A0A;
    public final InterfaceC150356pk A0F;
    public volatile Boolean A0I;
    public volatile Boolean A0J;
    public RecognizerLogger mLogger;
    public final C150376pm A0G = new C150376pm();
    public final Object A06 = new Object();
    public final Object A0H = new Object();
    public final Handler A08 = new Handler(Looper.getMainLooper());
    public final C150396po A0E = new Object();
    public final C150416pq A0C = new Object();
    public final C150436ps A0B = new Object();
    public final C150456pu A0D = new Object();
    public final InterfaceC14020nS A05 = C14120nc.A00();
    public final C142626cO A03 = new C142626cO(this);
    public final Map A07 = Collections.synchronizedMap(new HashMap());

    @Override // X.InterfaceC149836oc
    public final C177797vD ANP(String str) {
        return new C177797vD(null, null);
    }

    @Override // X.InterfaceC149836oc
    public final InterfaceC150176pN ChO(final C203708zZ c203708zZ, C1819185b c1819185b, final CameraAREffect cameraAREffect, final InterfaceC203668zV interfaceC203668zV) {
        if (cameraAREffect == null) {
            interfaceC203668zV.DCy(null, null, null);
            return null;
        }
        interfaceC203668zV.DgL(c1819185b, cameraAREffect.A0K);
        Map map = this.A07;
        if (!map.containsKey(cameraAREffect)) {
            map.clear();
        }
        C203678zW c203678zW = (C203678zW) map.get(cameraAREffect);
        if (c203678zW != null) {
            this.A02.A05(c1819185b, cameraAREffect.A0K, cameraAREffect.A0M);
            String str = c1819185b.A00;
            String str2 = c1819185b.A01;
            c203678zW.A02 = str;
            c203678zW.A01 = str2;
            interfaceC203668zV.DCy(c203678zW, null, cameraAREffect);
            return null;
        }
        ARRequestAsset A00 = AbstractC202058wk.A00(cameraAREffect, false);
        C142626cO.A00(cameraAREffect, this.A03);
        C150156pL c150156pL = this.A02;
        final InterfaceC203698zY interfaceC203698zY = new InterfaceC203698zY() { // from class: X.8zX
            @Override // X.InterfaceC203698zY
            public final void DFx(RkH rkH) {
                interfaceC203668zV.DCy(null, rkH, cameraAREffect);
            }

            @Override // X.InterfaceC203698zY
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                C203678zW c203678zW2 = (C203678zW) obj;
                if (c203678zW2 != null) {
                    c203678zW2.A04.A00 = c203708zZ;
                }
                C149846od c149846od = this;
                CameraAREffect cameraAREffect2 = cameraAREffect;
                InterfaceC203668zV interfaceC203668zV2 = interfaceC203668zV;
                c149846od.A07.put(cameraAREffect2, c203678zW2);
                interfaceC203668zV2.DCy(c203678zW2, null, cameraAREffect2);
            }
        };
        Handler handler = this.A08;
        List singletonList = Collections.singletonList(A00);
        C14360o3.A07(singletonList);
        return C150156pL.A00(handler, new InterfaceC203698zY() { // from class: X.8za
            @Override // X.InterfaceC203698zY
            public final void DFx(RkH rkH) {
                C14360o3.A0B(rkH, 0);
                InterfaceC203698zY.this.DFx(rkH);
            }

            @Override // X.InterfaceC203698zY
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                InterfaceC203698zY.this.onSuccess(obj);
            }
        }, c150156pL.A04, c150156pL, c1819185b, singletonList, false);
    }

    @Override // X.InterfaceC149836oc
    public final void EP3(TextView textView) {
    }

    @Override // X.InterfaceC13050lr
    public final synchronized void onUserSessionWillEnd(boolean z) {
    }

    @Override // X.InterfaceC149836oc
    public final void A8Z(InterfaceC142616cN interfaceC142616cN) {
        this.A02.A04(interfaceC142616cN);
    }

    @Override // X.InterfaceC149836oc
    public final C142626cO B0c() {
        return this.A03;
    }

    @Override // X.InterfaceC149836oc
    public final boolean CLs(CameraAREffect cameraAREffect) {
        if (this.A0J == null) {
            synchronized (this.A0H) {
                if (this.A0J == null) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        AbstractC12120kG.A01(__redex_internal_original_name, "hasSufficientStorageToApplyEffect() executed in UI thread");
                    }
                    boolean z = false;
                    if (!C0JK.A01().A0A()) {
                        z = true;
                    }
                    this.A0J = Boolean.valueOf(z);
                }
            }
        }
        return Boolean.TRUE.equals(this.A0J);
    }

    @Override // X.InterfaceC149836oc
    public final boolean CSw(CameraAREffect cameraAREffect) {
        if (TextUtils.isEmpty(cameraAREffect.A0K)) {
            return false;
        }
        ARRequestAsset A00 = AbstractC202058wk.A00(cameraAREffect, false);
        C150156pL c150156pL = this.A02;
        boolean z = false;
        if (A00.A02.A02 == ARAssetType.EFFECT) {
            z = true;
        }
        C18C.A0I(z, "ARD operate publicly only at effect level", new Object[0]);
        return c150156pL.A05.isEffectCached(new XplatRemoteAsset(A00), false);
    }

    @Override // X.InterfaceC149836oc
    public final void Cki(String str) {
        C150156pL c150156pL = this.A02;
        C14360o3.A0B(str, 0);
        Iterator it = c150156pL.A02.A03.entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC178407wE B4Z = ((InterfaceC142616cN) ((Map.Entry) it.next()).getKey()).B4Z();
            if (B4Z != null) {
                C150136pI.A02(B4Z.BYr().onEvent(14, str, true));
            }
        }
    }

    @Override // X.InterfaceC149836oc
    public final void Cln(C203678zW c203678zW, C1819185b c1819185b, CameraAREffect cameraAREffect) {
        this.A02.A05(c1819185b, cameraAREffect.A0K, cameraAREffect.A0M);
        String str = c1819185b.A00;
        String str2 = c1819185b.A01;
        c203678zW.A02 = str;
        c203678zW.A01 = str2;
    }

    @Override // X.InterfaceC149836oc
    public final void E5F(final String str, List list) {
        Context context = this.A01;
        UserSession userSession = this.A04;
        final C22955A9z c22955A9z = new C22955A9z(context, this.A02, new A4Y(context), new A54(list), userSession, this.A05);
        boolean A0G = AbstractC15820qc.A0G(c22955A9z.A01);
        c22955A9z.A00 = A0G;
        A54 a54 = c22955A9z.A04;
        int i = 6;
        if (A0G) {
            i = 25;
        }
        List list2 = a54.A00;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (((CameraAREffect) obj).CcN()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        ArrayList A0S = AbstractC001800i.A0S(AbstractC001800i.A0d(arrayList2, i), AbstractC001800i.A0d(arrayList, 3));
        ArrayList arrayList3 = new ArrayList();
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            CameraAREffect cameraAREffect = (CameraAREffect) it.next();
            if (cameraAREffect != null && cameraAREffect.A0K != null) {
                arrayList3.add(AbstractC202058wk.A00(cameraAREffect, false));
            } else {
                AbstractC12120kG.A07("EffectPrefetchService", "Invalid effect found in cached metadata", null);
            }
        }
        final List A0a = AbstractC001800i.A0a(new LinkedHashSet(arrayList3));
        if (A0a.isEmpty()) {
            AbstractC12120kG.A07("EffectPrefetchService", "Attempting to prefetch empty list of assets", null);
        } else {
            c22955A9z.A06.ATO(new AbstractRunnableC14200nk() { // from class: X.9j3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(27, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AK3 ak3;
                    C22955A9z c22955A9z2 = C22955A9z.this;
                    String str2 = str;
                    List<ARRequestAsset> list3 = A0a;
                    C224559vg c224559vg = AK3.A02;
                    int i2 = 6;
                    if (c22955A9z2.A00) {
                        i2 = 25;
                    }
                    int i3 = i2 + 3;
                    synchronized (c224559vg) {
                        ak3 = AK3.A01;
                        if (ak3 == null) {
                            ak3 = new AK3(i3);
                            AK3.A01 = ak3;
                        }
                        C14360o3.A0A(ak3);
                    }
                    A4Y a4y = c22955A9z2.A03;
                    C150156pL c150156pL = c22955A9z2.A02;
                    UserSession userSession2 = c22955A9z2.A05;
                    C1819085a c1819085a = new C1819085a();
                    c1819085a.A03 = str2;
                    String A0t = AbstractC166997dE.A0t(userSession2);
                    if (A0t == null) {
                        A0t = AbstractC166997dE.A0o();
                    }
                    c1819085a.A05 = A0t;
                    C1819185b A00 = c1819085a.A00();
                    synchronized (ak3) {
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            if (!list3.isEmpty()) {
                                Context context2 = a4y.A00;
                                if (AbstractC13530mf.A00(context2) > 104857600) {
                                    LinkedHashMap A1I = AbstractC166987dD.A1I();
                                    int i4 = ak3.A00;
                                    for (ARRequestAsset aRRequestAsset : list3) {
                                        C174407pa c174407pa = aRRequestAsset.A02;
                                        ARAssetType aRAssetType = c174407pa.A02;
                                        if (aRAssetType == ARAssetType.SUPPORT) {
                                            C0K8.A0E("AREffectSmartPrefetcher", "use ModelManager.fetchLatestModels to fetch model assets");
                                        } else if (aRAssetType == ARAssetType.EFFECT) {
                                            String str3 = c174407pa.A09;
                                            if (!A1I.containsKey(str3)) {
                                                A1I.put(str3, aRRequestAsset);
                                                if (A1I.size() >= i4) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else {
                                            throw AbstractC166987dD.A12(AbstractC167017dG.A0n(aRAssetType, "Got unsupported asset type: ", AbstractC166987dD.A1C()));
                                        }
                                    }
                                    ArrayList A1F = AbstractC166987dD.A1F(A1I.values());
                                    long A05 = C0JK.A01().A05() - 104857600;
                                    long j = 0;
                                    if (A05 > 0) {
                                        long maxSizeBytes = c150156pL.A05.getMaxSizeBytes(AbstractC166987dD.A1J(Integer.valueOf(XplatAssetType.AREffect.getValue())), C0JK.A01().A05());
                                        if ((maxSizeBytes ^ Long.MIN_VALUE) >= -1) {
                                            maxSizeBytes = Long.MAX_VALUE;
                                        }
                                        j = Math.min(A05, maxSizeBytes);
                                    }
                                    ArrayList A1E = AbstractC166987dD.A1E();
                                    Iterator it2 = A1F.iterator();
                                    while (it2.hasNext()) {
                                        ARRequestAsset aRRequestAsset2 = (ARRequestAsset) it2.next();
                                        long j2 = aRRequestAsset2.A01;
                                        if (j2 == -1) {
                                            C0K8.A0Q("IgAREffectSmartPrefetcher", "Got unknown size for asset id=%s", aRRequestAsset2.A02.A0A);
                                        } else {
                                            boolean A1X = AbstractC167007dF.A1X(aRRequestAsset2.A02.A02, ARAssetType.EFFECT);
                                            C18C.A0I(A1X, AbstractC111324zv.A00(1484), new Object[0]);
                                            if (!c150156pL.A05.isEffectCached(new XplatRemoteAsset(aRRequestAsset2), true) && j2 <= j) {
                                                j -= j2;
                                                A1E.add(aRRequestAsset2);
                                            }
                                        }
                                    }
                                    Iterator it3 = A1E.iterator();
                                    while (it3.hasNext()) {
                                        Object next = it3.next();
                                        CountDownLatch countDownLatch = new CountDownLatch(1);
                                        List singletonList = Collections.singletonList(next);
                                        AV4 av4 = new AV4(countDownLatch);
                                        C14360o3.A0B(singletonList, 0);
                                        InterfaceC150176pN A002 = C150156pL.A00(null, av4, c150156pL.A04, c150156pL, A00, singletonList, true);
                                        while (AbstractC167007dF.A1O((AbstractC13530mf.A00(context2) > 104857600L ? 1 : (AbstractC13530mf.A00(context2) == 104857600L ? 0 : -1))) && countDownLatch.getCount() > 0) {
                                            try {
                                                countDownLatch.await(1L, TimeUnit.SECONDS);
                                            } catch (InterruptedException e) {
                                                C0K8.A0J("AREffectSmartPrefetcher", "Got unexpected InterruptedException", e);
                                            }
                                        }
                                        if (countDownLatch.getCount() > 0) {
                                            A002.cancel();
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC149836oc
    public final void EoY(String str) {
        this.A02.A06(str);
    }

    @Override // X.InterfaceC149836oc, X.InterfaceC11380iw
    public final String getModuleName() {
        return "unknown_ig_composer";
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.6po, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.6pq] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.6ps] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.6pu, java.lang.Object] */
    public C149846od(Context context, InterfaceC142616cN interfaceC142616cN, InterfaceC150356pk interfaceC150356pk, UserSession userSession) {
        this.A01 = context;
        this.A04 = userSession;
        this.A0F = interfaceC150356pk;
        this.A02 = C150476pw.A00(context, interfaceC150356pk, userSession).A00(interfaceC142616cN);
        this.A09 = (C150716qS) userSession.A01(C150716qS.class, new C57243PbR(userSession, 5));
        this.A0A = new C150836qg(context);
        if (C17280tP.A01(context).A02() <= 0) {
            C17280tP.A01(this.A01).A0B(C56B.A00(this.A04));
        }
    }

    @Override // X.InterfaceC149836oc
    public final void EUu(GalleryPickerServiceDataSource galleryPickerServiceDataSource) {
        this.A00 = galleryPickerServiceDataSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [X.83P, X.7vE] */
    /* JADX WARN: Type inference failed for: r10v80 */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.facebook.cameracore.mediapipeline.services.locale.LocaleDataSource, X.902, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.lang.Object, X.ABJ] */
    /* JADX WARN: Type inference failed for: r12v39, types: [java.lang.Object, X.ABJ] */
    /* JADX WARN: Type inference failed for: r12v43, types: [java.lang.Object, X.ABJ] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, X.ABJ] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, X.90d] */
    /* JADX WARN: Type inference failed for: r3v13, types: [com.facebook.cameracore.mediapipeline.services.memoryinfo.MemoryInfoServiceImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.facebook.cameracore.mediapipeline.services.externalasset.ExternalAssetLocalDataSource, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [X.8zs, X.901, java.lang.Object] */
    @Override // X.InterfaceC149836oc
    public final C177797vD AMy(C203678zW c203678zW, AudioGraphClientProvider audioGraphClientProvider, C1814883b c1814883b, InterfaceC1815083d interfaceC1815083d, C200478tq c200478tq, EnumC150616qF enumC150616qF, CameraControlServiceDelegate cameraControlServiceDelegate, InterfaceC149876og interfaceC149876og, C83W c83w, C83Y c83y, C8zr c8zr, AudioServiceConfigurationAnnouncer audioServiceConfigurationAnnouncer, C83P c83p, CameraAREffect cameraAREffect, UserSession userSession, Integer num, Integer num2, String str, String str2, boolean z) {
        String str3;
        ModelPathsHolder modelPathsHolder;
        ModelPathsHolder modelPathsHolder2;
        ?? r10;
        ModelPathsHolder modelPathsHolder3;
        int A03;
        int A032;
        int A033;
        int A034;
        C177797vD c177797vD;
        C2040590y c2040590y;
        C2040390s c2040390s;
        C69724VuJ c69724VuJ;
        C177797vD c177797vD2;
        String str4;
        String str5;
        C23337AWg c23337AWg;
        InterfaceC149876og interfaceC149876og2 = interfaceC149876og;
        C8zr c8zr2 = c8zr;
        if (cameraAREffect != null) {
            C142626cO c142626cO = this.A03;
            UserSession userSession2 = this.A04;
            if (C142626cO.A00(cameraAREffect, c142626cO) && c203678zW != null) {
                List list = c203678zW.A05;
                if (!list.isEmpty()) {
                    str3 = ((C203768zk) list.get(0)).A01;
                } else {
                    str3 = null;
                }
                boolean contains = cameraAREffect.A0a.contains("faceTracker");
                boolean contains2 = cameraAREffect.A0a.contains("segmentation");
                boolean contains3 = cameraAREffect.A0a.contains("hairSegmentation");
                boolean contains4 = cameraAREffect.A0a.contains("Recognition");
                boolean contains5 = cameraAREffect.A0a.contains("bodyTracking");
                boolean contains6 = cameraAREffect.A0a.contains("handTracker");
                boolean contains7 = cameraAREffect.A0a.contains("multiclassSegmentation");
                boolean z2 = cameraAREffect.A0Z.get("genericML") != null;
                boolean A0H = cameraAREffect.A0H();
                boolean z3 = cameraAREffect.A0Z.get("bodyTracking3D") != null;
                C203888zz c203888zz = cameraControlServiceDelegate != null ? new C203888zz(cameraControlServiceDelegate) : null;
                if (interfaceC149876og == null) {
                    interfaceC149876og2 = A0K;
                }
                ?? obj = new Object();
                obj.A00 = interfaceC149876og2;
                ?? obj2 = new Object();
                Context context = this.A01;
                obj2.setDeviceLocaleIdentifier(context.getResources().getConfiguration().locale.toString());
                AnonymousClass905 A00 = AnonymousClass904.A00(context, !AbstractC177217uH.A00(context));
                A00.A00(AnonymousClass901.A01, obj);
                A00.A00(AnonymousClass909.A01, new AnonymousClass909(c83w));
                A00.A00(C90B.A01, new C90B(new C90C(context, num2, false)));
                A00.A00(C203888zz.A01, c203888zz);
                A00.A00(C90L.A01, new C90L(new Object()));
                A00.A00(C90O.A02, new C90O(interfaceC1815083d, c1814883b));
                C203848zt c203848zt = C90P.A05;
                C90Q c90q = new C90Q(userSession2, cameraAREffect.A0K);
                c83y.getClass();
                C90R c90r = new C90R();
                String str6 = cameraAREffect.A0K;
                C150716qS c150716qS = this.A09;
                ARDFileCache A01 = c150716qS.A01();
                ARDFileCache A02 = c150716qS.A02();
                AndroidAsyncExecutorFactory androidAsyncExecutorFactory = AndroidAsyncExecutorFactory.$redex_init_class;
                A00.A00(c203848zt, new C90P(c90q, c83y, c90r, new C90S(str6, A01, A02, new AndroidAsyncExecutorFactory(C14250np.A00().A00)), new C90R()));
                A00.A00(C90T.A01, new C90T(obj2));
                A00.A00(C90U.A01, new C90U(new Object()));
                A00.A00(C90W.A01, new C90W(this.A0A));
                A00.A00(C90X.A01, new C90X(new C90Y(context)));
                A00.A00(C90a.A01, new C90a(new C2038990b(context)));
                A00.A02 = new Object();
                A00.A00(C2039290e.A01, new C2039290e(new Object()));
                C203848zt c203848zt2 = C8zr.A02;
                if (c8zr == null) {
                    c8zr2 = new C8zr(this.A0B, this.A0C, this.A0D, this.A0E, cameraAREffect.A0K);
                }
                A00.A00(c203848zt2, c8zr2);
                A00.A00(C2039490h.A01, new C2039490h(new C2039590i()));
                String str7 = C1F8.A00(userSession2).A04;
                if (str7 != null) {
                    A00.A00(C90m.A04, new C90m(C05F.A0j, str7, C1FO.A00(), C1HO.A08() ? C1HO.A02().replace(AbstractC43591JPw.A00(166), "") : ""));
                }
                if (A0H && str7 != null) {
                    if (str7.startsWith("Bearer")) {
                        str7 = str7.substring("Bearer".length());
                    }
                    String trim = str7.trim();
                    C203708zZ c203708zZ = c203678zW.A04.A00;
                    if (c203708zZ != null) {
                        c23337AWg = new C23337AWg(c203708zZ.A00, this);
                    } else {
                        c23337AWg = null;
                    }
                    A00.A00(C9Y5.A05, new C9Y5(c23337AWg, null, C05F.A01, userSession2.userId, trim));
                }
                if (!AbstractC177217uH.A00(context) || cameraAREffect.A0K()) {
                    A00.A05 = new AnonymousClass906(context, audioGraphClientProvider, audioServiceConfigurationAnnouncer, z);
                }
                GalleryPickerServiceDataSource galleryPickerServiceDataSource = this.A00;
                if (galleryPickerServiceDataSource != null) {
                    A00.A00(GalleryPickerServiceConfiguration.A01, new GalleryPickerServiceConfiguration(galleryPickerServiceDataSource));
                }
                C1825788b c1825788b = c203678zW.A00;
                String str8 = "ARModelPaths is null";
                if (!contains) {
                    modelPathsHolder = null;
                    modelPathsHolder2 = null;
                } else {
                    if (c1825788b != null) {
                        VersionedCapability versionedCapability = VersionedCapability.Facetracker;
                        Map map = c1825788b.A00;
                        modelPathsHolder = (ModelPathsHolder) map.get(versionedCapability);
                        if (modelPathsHolder == null) {
                            AbstractC12120kG.A01(__redex_internal_original_name, "AREngineEffect is missing FaceTracker assets");
                            return null;
                        }
                        HashMap A002 = AbstractC2041591k.A00(modelPathsHolder);
                        String[] strArr = (String[]) A002.keySet().toArray(new String[0]);
                        int length = strArr.length;
                        String[] strArr2 = new String[length];
                        for (int i = 0; i < length; i++) {
                            strArr2[i] = A002.get(strArr[i]);
                        }
                        ModelPathsHolder modelPathsHolder4 = (ModelPathsHolder) map.get(VersionedCapability.FaceExpressionFitting);
                        modelPathsHolder2 = modelPathsHolder4;
                        if (modelPathsHolder4 != null) {
                            str5 = modelPathsHolder4.getModelPath(EnumC1825988f.A05);
                        } else {
                            str5 = null;
                        }
                        A00.A00 = new AnonymousClass910(null, num, null, null, str5, strArr, strArr2, true);
                    }
                    AbstractC12120kG.A01(__redex_internal_original_name, str8);
                    r10 = 0;
                    return new C177797vD(r10, r10);
                }
                if (contains2 || contains7) {
                    if (c1825788b != null) {
                        VersionedCapability versionedCapability2 = VersionedCapability.Segmentation;
                        Map map2 = c1825788b.A00;
                        modelPathsHolder3 = (ModelPathsHolder) map2.get(versionedCapability2);
                        ModelPathsHolder modelPathsHolder5 = (ModelPathsHolder) map2.get(VersionedCapability.MulticlassSegmentation);
                        if (modelPathsHolder3 == null && modelPathsHolder5 == null) {
                            AbstractC12120kG.A01(__redex_internal_original_name, "AREngineEffect is missing Segmentation assets");
                            return null;
                        }
                        AKY aky = new AKY(C211359Wj.A00, 512);
                        if (modelPathsHolder3 == null) {
                            A03 = 0;
                            A032 = 0;
                        } else {
                            String modelPath = modelPathsHolder3.getModelPath(EnumC1825988f.A03);
                            modelPath.getClass();
                            A03 = aky.A03(modelPath);
                            String modelPath2 = modelPathsHolder3.getModelPath(EnumC1825988f.A04);
                            modelPath2.getClass();
                            A032 = aky.A03(modelPath2);
                        }
                        if (modelPathsHolder5 == null) {
                            A033 = 0;
                            A034 = 0;
                        } else {
                            String modelPath3 = modelPathsHolder5.getModelPath(EnumC1825988f.A0N);
                            modelPath3.getClass();
                            A033 = aky.A03(modelPath3);
                            String modelPath4 = modelPathsHolder5.getModelPath(EnumC1825988f.A0O);
                            modelPath4.getClass();
                            A034 = aky.A03(modelPath4);
                        }
                        aky.A08(6);
                        aky.A0A(3, A034);
                        aky.A0A(2, A033);
                        aky.A0A(1, A032);
                        aky.A0A(0, A03);
                        aky.A0B(1, 0);
                        ByteBuffer byteBuffer = aky.A07;
                        int i2 = aky.A03 - 1;
                        aky.A03 = i2;
                        byteBuffer.put(i2, (byte) 1);
                        aky.A07(5);
                        aky.A06(aky.A01());
                        aky.A04();
                        AG3 ag3 = new AG3(C211399Wn.class, aky.A07);
                        ?? obj3 = new Object();
                        obj3.A00(ag3);
                        A00.A01(new C22859A6c(EnumC150506pz.A15, obj3));
                    }
                    AbstractC12120kG.A01(__redex_internal_original_name, str8);
                    r10 = 0;
                    return new C177797vD(r10, r10);
                }
                modelPathsHolder3 = null;
                String str9 = "AREngineEffect is missing Body tracking assets";
                if (contains5) {
                    if (c1825788b != null) {
                        ModelPathsHolder modelPathsHolder6 = (ModelPathsHolder) c1825788b.A00.get(VersionedCapability.BodyTracking);
                        if (modelPathsHolder6 == null) {
                            AbstractC12120kG.A01(__redex_internal_original_name, "AREngineEffect is missing Body tracking assets");
                            return null;
                        }
                        AKY aky2 = new AKY(C211359Wj.A00, 256);
                        String modelPath5 = modelPathsHolder6.getModelPath(EnumC1825988f.A03);
                        modelPath5.getClass();
                        int A035 = aky2.A03(modelPath5);
                        String modelPath6 = modelPathsHolder6.getModelPath(EnumC1825988f.A04);
                        modelPath6.getClass();
                        aky2.A06(C211419Wp.A00(aky2, A035, aky2.A03(modelPath6), modelPathsHolder6.mVersion));
                        aky2.A04();
                        AG3 ag32 = new AG3(C211419Wp.class, aky2.A07);
                        ?? obj4 = new Object();
                        obj4.A00(ag32);
                        A00.A01(new C22859A6c(EnumC150506pz.A09, obj4));
                    }
                    AbstractC12120kG.A01(__redex_internal_original_name, str8);
                    r10 = 0;
                    return new C177797vD(r10, r10);
                }
                if (z3) {
                    if (c1825788b != null) {
                        c177797vD2 = null;
                        ModelPathsHolder modelPathsHolder7 = (ModelPathsHolder) c1825788b.A00.get(VersionedCapability.BodyTracking3D);
                        if (modelPathsHolder7 != null) {
                            AKY aky3 = new AKY(C211359Wj.A00, 256);
                            String modelPath7 = modelPathsHolder7.getModelPath(EnumC1825988f.A01);
                            modelPath7.getClass();
                            int A036 = aky3.A03(modelPath7);
                            String modelPath8 = modelPathsHolder7.getModelPath(EnumC1825988f.A02);
                            modelPath8.getClass();
                            int A037 = aky3.A03(modelPath8);
                            int i3 = modelPathsHolder7.mVersion;
                            aky3.A08(4);
                            aky3.A09(3, i3);
                            aky3.A09(2, 45000);
                            aky3.A0A(1, A037);
                            aky3.A0A(0, A036);
                            aky3.A06(aky3.A01());
                            aky3.A04();
                            AG3 ag33 = new AG3(C211369Wk.class, aky3.A07);
                            ?? obj5 = new Object();
                            obj5.A00(ag33);
                            A00.A01(new C22859A6c(EnumC150506pz.A08, obj5));
                        }
                        AbstractC12120kG.A01(__redex_internal_original_name, str9);
                        return c177797vD2;
                    }
                    AbstractC12120kG.A01(__redex_internal_original_name, str8);
                    r10 = 0;
                    return new C177797vD(r10, r10);
                }
                List asList = Arrays.asList(AbstractC2039990o.A00);
                if (z2) {
                    AKY aky4 = new AKY(C211359Wj.A00, 256);
                    Map map3 = c1825788b.A01;
                    int size = ImmutableMap.copyOf(map3).size();
                    int[] iArr = new int[size];
                    int i4 = 0;
                    for (Map.Entry entry : ImmutableMap.copyOf(map3).entrySet()) {
                        byte indexOf = (byte) asList.indexOf(entry.getKey());
                        if (-1 != indexOf) {
                            int i5 = i4 + 1;
                            int A038 = aky4.A03((CharSequence) entry.getValue());
                            aky4.A08(2);
                            aky4.A0A(1, A038);
                            if (indexOf != 0) {
                                aky4.A0B(1, 0);
                                ByteBuffer byteBuffer2 = aky4.A07;
                                int i6 = aky4.A03 - 1;
                                aky4.A03 = i6;
                                byteBuffer2.put(i6, indexOf);
                                aky4.A07(0);
                            }
                            iArr[i4] = aky4.A01();
                            i4 = i5;
                        }
                    }
                    if (!aky4.A09) {
                        aky4.A04 = size;
                        int i7 = size * 4;
                        aky4.A0B(4, i7);
                        aky4.A0B(4, i7);
                        aky4.A09 = true;
                        for (int i8 = size - 1; i8 >= 0; i8--) {
                            aky4.A05(iArr[i8]);
                        }
                        int A022 = aky4.A02();
                        aky4.A08(2);
                        aky4.A0A(1, A022);
                        aky4.A0B(1, 0);
                        ByteBuffer byteBuffer3 = aky4.A07;
                        int i9 = aky4.A03 - 1;
                        aky4.A03 = i9;
                        byteBuffer3.put(i9, (byte) 1);
                        aky4.A07(0);
                        aky4.A06(aky4.A01());
                        aky4.A04();
                        AG3 ag34 = new AG3(C211409Wo.class, aky4.A07);
                        ?? obj6 = new Object();
                        obj6.A00(ag34);
                        A00.A01(new C22859A6c(EnumC150506pz.A0X, obj6));
                    } else {
                        throw new AssertionError("FlatBuffers: object serialization must not be nested.");
                    }
                }
                if (contains6) {
                    if (c1825788b == null) {
                        str8 = "AREngineEffect:HT - ARModelPaths is null";
                        AbstractC12120kG.A01(__redex_internal_original_name, str8);
                        r10 = 0;
                        return new C177797vD(r10, r10);
                    }
                    c177797vD = null;
                    c177797vD = null;
                    ModelPathsHolder modelPathsHolder8 = (ModelPathsHolder) c1825788b.A00.get(VersionedCapability.HandTracker);
                    if (modelPathsHolder8 == null) {
                        str4 = "AREngineEffect:HT - AREngineEffect is missing Hand Tracking assets";
                    } else {
                        EnumC1825988f enumC1825988f = EnumC1825988f.A03;
                        if (modelPathsHolder8.getModelPath(enumC1825988f) != null) {
                            EnumC1825988f enumC1825988f2 = EnumC1825988f.A04;
                            if (modelPathsHolder8.getModelPath(enumC1825988f2) != null) {
                                try {
                                    A00.A01 = new AnonymousClass911(context, modelPathsHolder8.getModelPath(enumC1825988f), modelPathsHolder8.getModelPath(enumC1825988f2), modelPathsHolder8.getModelPath(enumC1825988f), modelPathsHolder8.getModelPath(enumC1825988f2));
                                } catch (Exception unused) {
                                    AbstractC12120kG.A01(__redex_internal_original_name, "AREngineEffect:HT - Could not create and set HandTrackingDataProviderConfiguration");
                                }
                            }
                        }
                        str4 = "AREngineEffect:HT - At least one Hand Tracking model path is null";
                    }
                    AbstractC12120kG.A01(__redex_internal_original_name, str4);
                    return c177797vD;
                }
                c177797vD = null;
                r10 = 0;
                if (contains3) {
                    if (c1825788b == null) {
                        AbstractC12120kG.A01(__redex_internal_original_name, "ARModelPaths is null");
                        return new C177797vD(r10, r10);
                    }
                    ModelPathsHolder modelPathsHolder9 = (ModelPathsHolder) c1825788b.A00.get(VersionedCapability.HairSegmentation);
                    if (modelPathsHolder9 == null) {
                        str4 = "AREngineEffect is missing hair segmentation assets";
                        AbstractC12120kG.A01(__redex_internal_original_name, str4);
                        return c177797vD;
                    }
                    C203848zt c203848zt3 = C9Y4.A03;
                    String modelPath9 = modelPathsHolder9.getModelPath(EnumC1825988f.A03);
                    modelPath9.getClass();
                    String modelPath10 = modelPathsHolder9.getModelPath(EnumC1825988f.A04);
                    modelPath10.getClass();
                    A00.A00(c203848zt3, new C9Y4(modelPath9, modelPath10, false));
                }
                A00.A00(C2040090p.A01, new C2040090p(c200478tq));
                if (contains4) {
                    if (c1825788b != null) {
                        c177797vD2 = null;
                        if (c1825788b.A00.get(VersionedCapability.Recognition) == null) {
                            str9 = "AREngineEffect is missing Target recognition assets";
                            AbstractC12120kG.A01(__redex_internal_original_name, str9);
                            return c177797vD2;
                        }
                    }
                    AbstractC12120kG.A01(__redex_internal_original_name, str8);
                    r10 = 0;
                    return new C177797vD(r10, r10);
                }
                if (C9NQ.A01(context, userSession2)) {
                    W59 w59 = ((C2040190q) this.A0G.A00.getValue()).A01;
                    if (w59 != null && (c69724VuJ = w59.A01) != null) {
                        c2040390s = new C2040390s(context, C9NQ.A00(c69724VuJ));
                    } else {
                        c2040390s = new C2040390s(context);
                    }
                    A00.A03 = c2040390s;
                }
                if (str != null) {
                    A00.A00(C9Y0.A01, new C9Y0(str));
                }
                HashMap hashMap = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = cameraAREffect.A0K;
                if (str14 == null || str14.isEmpty()) {
                    str14 = "0";
                }
                String str15 = cameraAREffect.A0M;
                if (str15 == null || str15.isEmpty()) {
                    str15 = "0";
                }
                String str16 = cameraAREffect.A0S;
                ArrayList A0E = cameraAREffect.A0E();
                C150156pL c150156pL = this.A02;
                if (c150156pL == null) {
                    AbstractC12120kG.A01(__redex_internal_original_name, "onAsyncAssetRequested before EffectManager is initialized.");
                    c2040590y = new Object();
                } else {
                    c2040590y = new C2040590y(c150156pL);
                }
                String str17 = ((C22F) AnonymousClass229.A01(userSession2)).A04.A0L;
                String str18 = c203678zW.A01;
                String str19 = c203678zW.A02;
                AnonymousClass904 anonymousClass904 = new AnonymousClass904(A00);
                ImmutableMap copyOf = ImmutableMap.copyOf(c203678zW.A03.A00);
                if (contains) {
                    if (modelPathsHolder == null) {
                        hashMap = new HashMap();
                    } else {
                        String modelPath11 = modelPathsHolder.getModelPath(EnumC1825988f.A08);
                        String modelPath12 = modelPathsHolder.getModelPath(EnumC1825988f.A06);
                        String modelPath13 = modelPathsHolder.getModelPath(EnumC1825988f.A07);
                        String modelPath14 = modelPathsHolder.getModelPath(EnumC1825988f.A09);
                        HashMap hashMap2 = new HashMap();
                        String[] strArr3 = AbstractC2041691m.A00;
                        hashMap2.put(strArr3[0], modelPath11);
                        hashMap2.put(strArr3[1], modelPath12);
                        hashMap2.put(strArr3[2], modelPath13);
                        hashMap2.put(strArr3[3], modelPath14);
                        hashMap = new HashMap(hashMap2);
                    }
                    if (modelPathsHolder2 != null) {
                        str10 = modelPathsHolder2.getModelPath(EnumC1825988f.A05);
                    }
                }
                ModelPathsHolder modelPathsHolder10 = (ModelPathsHolder) c1825788b.A00.get(VersionedCapability.FaceExpressionFittingRTRRetargeting);
                String modelPath15 = modelPathsHolder10 != null ? modelPathsHolder10.getModelPath(EnumC1825988f.A0Z) : null;
                if (contains2 && modelPathsHolder3 != null) {
                    str12 = modelPathsHolder3.getModelPath(EnumC1825988f.A03);
                    str13 = modelPathsHolder3.getModelPath(EnumC1825988f.A04);
                    EnumC1825988f enumC1825988f3 = EnumC1825988f.A0N;
                    r35 = modelPathsHolder3.mModelPaths.containsKey(enumC1825988f3) ? modelPathsHolder3.getModelPath(enumC1825988f3) : null;
                    EnumC1825988f enumC1825988f4 = EnumC1825988f.A0O;
                    if (modelPathsHolder3.mModelPaths.containsKey(enumC1825988f4)) {
                        str11 = modelPathsHolder3.getModelPath(enumC1825988f4);
                    }
                }
                return new C177797vD(new C177807vE(c2040590y, anonymousClass904, enumC150616qF, str2, str17, str18, str3, str19, null, str10, str14, str15, str16, r35, str11, str12, str13, modelPath15, hashMap, A0E, copyOf), c83p);
            }
        }
        return new C177797vD(null, null);
    }
}
