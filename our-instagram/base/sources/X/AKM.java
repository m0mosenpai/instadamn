package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.facebook.cameracore.mediapipeline.services.music.MusicServiceDataSource;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AKM {
    public InterfaceC179927yi A00;
    public O4V A05;
    public final C1814883b A06;
    public final C1814983c A07;
    public final Context A08;
    public final C150716qS A09;
    public final MusicServiceDataSource A0A;
    public final C83V A0C;
    public final C150376pm A0D;
    public final UserSession A0E;
    public final String A0F;
    public static final C150396po A0H = new Object();
    public static final C150416pq A0G = new Object();
    public InterfaceC150466pv A04 = new Object();
    public InterfaceC150446pt A03 = new Object();
    public GalleryPickerServiceDataSource A02 = null;
    public C90O A01 = null;
    public final C83P A0B = new C51965My1(this, 1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object, X.90d] */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.facebook.cameracore.mediapipeline.services.externalasset.ExternalAssetLocalDataSource, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25, types: [X.8zs, X.901, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object, X.ABJ] */
    /* JADX WARN: Type inference failed for: r6v15, types: [com.facebook.cameracore.mediapipeline.services.locale.LocaleDataSource, X.902, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, X.ABJ] */
    public final C177797vD A01(C203678zW c203678zW, C150156pL c150156pL, C9Y5 c9y5, BB1 bb1, BB2 bb2, String str) {
        C203768zk c203768zk;
        int i;
        int i2;
        int i3;
        int i4;
        C2040390s c2040390s;
        C69724VuJ c69724VuJ;
        String str2;
        List list = c203678zW.A05;
        if (list.size() == 1 && (c203768zk = (C203768zk) list.get(0)) != null) {
            String str3 = c203768zk.A01;
            if (!TextUtils.isEmpty(str3)) {
                HashMap hashMap = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = "0";
                Context context = this.A08;
                AnonymousClass905 A00 = AnonymousClass904.A00(context, true);
                String str12 = c203768zk.A02;
                String str13 = str12;
                if (str12.isEmpty()) {
                    str13 = "0";
                }
                String str14 = c203768zk.A04;
                ImmutableList immutableList = c203768zk.A00;
                String str15 = this.A0F;
                EnumC150616qF enumC150616qF = EnumC150616qF.USER_INTERACTION;
                String str16 = c203678zW.A01;
                String str17 = c203678zW.A02;
                String str18 = c203768zk.A03;
                if (str18 != null) {
                    if (str18.isEmpty()) {
                        str18 = "0";
                    }
                    str11 = str18;
                }
                C203758zj c203758zj = c203678zW.A04;
                int i5 = 4;
                if (c203758zj.A02) {
                    i5 = 0;
                }
                boolean z = c203758zj.A01;
                A00.A04 = new ProductFeatureConfig(c203758zj.A03, i5, z, z, true);
                C1825788b c1825788b = c203678zW.A00;
                VersionedCapability versionedCapability = VersionedCapability.Facetracker;
                Map map = c1825788b.A00;
                ModelPathsHolder modelPathsHolder = (ModelPathsHolder) map.get(versionedCapability);
                if (modelPathsHolder != null) {
                    String modelPath = modelPathsHolder.getModelPath(EnumC1825988f.A08);
                    String modelPath2 = modelPathsHolder.getModelPath(EnumC1825988f.A06);
                    String modelPath3 = modelPathsHolder.getModelPath(EnumC1825988f.A07);
                    String modelPath4 = modelPathsHolder.getModelPath(EnumC1825988f.A09);
                    HashMap A1G = AbstractC166987dD.A1G();
                    String[] strArr = AbstractC2041691m.A00;
                    A1G.put(strArr[0], modelPath);
                    A1G.put(strArr[1], modelPath2);
                    A1G.put(strArr[2], modelPath3);
                    A1G.put(strArr[3], modelPath4);
                    hashMap = new HashMap(A1G);
                    HashMap A002 = AbstractC2041591k.A00(modelPathsHolder);
                    String[] strArr2 = (String[]) A002.keySet().toArray(new String[0]);
                    int length = strArr2.length;
                    String[] strArr3 = new String[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        strArr3[i6] = A002.get(strArr2[i6]);
                    }
                    ModelPathsHolder modelPathsHolder2 = (ModelPathsHolder) map.get(VersionedCapability.FaceExpressionFitting);
                    if (modelPathsHolder2 != null) {
                        EnumC1825988f enumC1825988f = EnumC1825988f.A05;
                        str5 = modelPathsHolder2.getModelPath(enumC1825988f);
                        str2 = modelPathsHolder2.getModelPath(enumC1825988f);
                    } else {
                        str2 = null;
                    }
                    ModelPathsHolder modelPathsHolder3 = (ModelPathsHolder) map.get(VersionedCapability.FaceExpressionFittingRTRRetargeting);
                    if (modelPathsHolder3 != null) {
                        str10 = modelPathsHolder3.getModelPath(EnumC1825988f.A0Z);
                    }
                    ModelPathsHolder modelPathsHolder4 = (ModelPathsHolder) map.get(VersionedCapability.FaceWave);
                    if (modelPathsHolder4 != null) {
                        str4 = modelPathsHolder4.getModelPath(EnumC1825988f.A0W);
                    }
                    A00.A00 = new AnonymousClass910(null, C05F.A00, null, null, str2, strArr2, strArr3, false);
                }
                ModelPathsHolder modelPathsHolder5 = (ModelPathsHolder) map.get(VersionedCapability.Segmentation);
                ModelPathsHolder modelPathsHolder6 = (ModelPathsHolder) map.get(VersionedCapability.MulticlassSegmentation);
                if (modelPathsHolder5 != null || modelPathsHolder6 != null) {
                    if (modelPathsHolder != null) {
                        str8 = modelPathsHolder.getModelPath(EnumC1825988f.A03);
                        str9 = modelPathsHolder.getModelPath(EnumC1825988f.A04);
                        EnumC1825988f enumC1825988f2 = EnumC1825988f.A0N;
                        if (modelPathsHolder.mModelPaths.containsKey(enumC1825988f2)) {
                            str6 = modelPathsHolder.getModelPath(enumC1825988f2);
                        }
                        EnumC1825988f enumC1825988f3 = EnumC1825988f.A0O;
                        if (modelPathsHolder.mModelPaths.containsKey(enumC1825988f3)) {
                            str7 = modelPathsHolder.getModelPath(enumC1825988f3);
                        }
                    }
                    AKY aky = new AKY(C211359Wj.A00, 512);
                    if (modelPathsHolder5 != null) {
                        i = A00(aky, EnumC1825988f.A03, modelPathsHolder5);
                        i2 = A00(aky, EnumC1825988f.A04, modelPathsHolder5);
                    } else {
                        i = 0;
                        i2 = 0;
                    }
                    if (modelPathsHolder6 != null) {
                        i3 = A00(aky, EnumC1825988f.A0N, modelPathsHolder6);
                        i4 = A00(aky, EnumC1825988f.A0O, modelPathsHolder6);
                    } else {
                        i3 = 0;
                        i4 = 0;
                    }
                    aky.A08(6);
                    aky.A0A(3, i4);
                    aky.A0A(2, i3);
                    aky.A0A(1, i2);
                    aky.A0A(0, i);
                    aky.A0B(1, 0);
                    ByteBuffer byteBuffer = aky.A07;
                    int i7 = aky.A03 - 1;
                    aky.A03 = i7;
                    byteBuffer.put(i7, (byte) 1);
                    aky.A07(5);
                    aky.A06(aky.A01());
                    aky.A04();
                    AG3 ag3 = new AG3(C211399Wn.class, aky.A07);
                    ?? obj = new Object();
                    obj.A00(ag3);
                    A00.A01(new C22859A6c(EnumC150506pz.A15, obj));
                }
                ModelPathsHolder modelPathsHolder7 = (ModelPathsHolder) map.get(VersionedCapability.HairSegmentation);
                if (modelPathsHolder7 != null) {
                    C203848zt c203848zt = C9Y4.A03;
                    String modelPath5 = modelPathsHolder7.getModelPath(EnumC1825988f.A03);
                    modelPath5.getClass();
                    String modelPath6 = modelPathsHolder7.getModelPath(EnumC1825988f.A04);
                    modelPath6.getClass();
                    A00.A00(c203848zt, new C9Y4(modelPath5, modelPath6, false));
                }
                ModelPathsHolder modelPathsHolder8 = (ModelPathsHolder) map.get(VersionedCapability.HandTracker);
                if (modelPathsHolder8 != null) {
                    EnumC1825988f enumC1825988f4 = EnumC1825988f.A03;
                    if (modelPathsHolder8.getModelPath(enumC1825988f4) != null) {
                        EnumC1825988f enumC1825988f5 = EnumC1825988f.A04;
                        if (modelPathsHolder8.getModelPath(enumC1825988f5) != null) {
                            String modelPath7 = modelPathsHolder8.getModelPath(enumC1825988f4);
                            modelPath7.getClass();
                            String modelPath8 = modelPathsHolder8.getModelPath(enumC1825988f5);
                            modelPath8.getClass();
                            String modelPath9 = modelPathsHolder8.getModelPath(enumC1825988f4);
                            modelPath9.getClass();
                            String modelPath10 = modelPathsHolder8.getModelPath(enumC1825988f5);
                            modelPath10.getClass();
                            A00.A01 = new AnonymousClass911(context, modelPath7, modelPath8, modelPath9, modelPath10);
                        }
                    }
                }
                ModelPathsHolder modelPathsHolder9 = (ModelPathsHolder) map.get(VersionedCapability.BodyTracking);
                if (modelPathsHolder9 != null) {
                    AKY aky2 = new AKY(C211359Wj.A00, 256);
                    aky2.A06(C211419Wp.A00(aky2, A00(aky2, EnumC1825988f.A03, modelPathsHolder9), A00(aky2, EnumC1825988f.A04, modelPathsHolder9), modelPathsHolder9.mVersion));
                    aky2.A04();
                    AG3 ag32 = new AG3(C211419Wp.class, aky2.A07);
                    ?? obj2 = new Object();
                    obj2.A00(ag32);
                    A00.A01(new C22859A6c(EnumC150506pz.A09, obj2));
                }
                A00.A00(C2039290e.A01, new C2039290e(new Object()));
                UserSession userSession = this.A0E;
                if (C9NQ.A01(context, userSession)) {
                    W59 w59 = ((C2040190q) this.A0D.A00.getValue()).A01;
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
                if (bb1 != null) {
                    A00.A00(C9Y1.A01, new C9Y1(bb1));
                }
                if (bb2 != null) {
                    A00.A00(C9Y2.A01, new C9Y2(bb2));
                }
                GalleryPickerServiceDataSource galleryPickerServiceDataSource = this.A02;
                if (galleryPickerServiceDataSource != null) {
                    A00.A00(GalleryPickerServiceConfiguration.A01, new GalleryPickerServiceConfiguration(galleryPickerServiceDataSource));
                }
                ?? obj3 = new Object();
                obj3.setDeviceLocaleIdentifier(context.getResources().getConfiguration().locale.toString());
                A00.A00(C90T.A01, new C90T(obj3));
                A00.A00(C90L.A01, new C90L(new Object()));
                A00.A00(C90B.A01, new C90B(new C90C(context, C05F.A00, true)));
                A00.A00(C90W.A01, new C90W(this.A0A));
                C203848zt c203848zt2 = C90O.A02;
                C90O c90o = this.A01;
                if (c90o == null) {
                    c90o = new C90O(this.A07, this.A06);
                }
                A00.A00(c203848zt2, c90o);
                A00.A00(C90X.A01, new C90X(new C90Y(context)));
                if (c9y5 != null) {
                    A00.A00(C9Y5.A05, c9y5);
                }
                A00.A00(C8zr.A02, new C8zr(this.A03, A0G, this.A04, A0H, str12));
                A00.A02 = new Object();
                C203848zt c203848zt3 = AnonymousClass901.A01;
                C149866of c149866of = new C149866of(0);
                ?? obj4 = new Object();
                obj4.A00 = c149866of;
                A00.A00(c203848zt3, obj4);
                A00.A00(C2039490h.A01, new C2039490h(new C2039590i()));
                A00.A00(AnonymousClass909.A01, new AnonymousClass909(this.A0C));
                C203848zt c203848zt4 = C90P.A05;
                C90Q c90q = new C90Q(userSession, str12);
                C83Y c83y = new C83Y();
                C90R c90r = new C90R();
                C150716qS c150716qS = this.A09;
                ARDFileCache A01 = c150716qS.A01();
                ARDFileCache A02 = c150716qS.A02();
                AndroidAsyncExecutorFactory androidAsyncExecutorFactory = AndroidAsyncExecutorFactory.$redex_init_class;
                A00.A00(c203848zt4, new C90P(c90q, c83y, c90r, new C90S(str12, A01, A02, new AndroidAsyncExecutorFactory(C14250np.A00().A00)), new C90R()));
                return new C177797vD(new C177807vE(new C2040590y(c150156pL), new AnonymousClass904(A00), enumC150616qF, str15, null, str16, str3, str17, str4, str5, str13, str11, str14, str6, str7, str8, str9, str10, hashMap, immutableList, null), this.A0B);
            }
        }
        return new C177797vD(null, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.6pv] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.6pt, java.lang.Object] */
    public AKM(Context context, UserSession userSession, String str) {
        this.A08 = context;
        this.A0E = userSession;
        this.A0F = str;
        this.A0A = new C150836qg(context);
        C1814883b c1814883b = new C1814883b();
        this.A06 = c1814883b;
        this.A07 = new C1814983c(c1814883b, userSession);
        this.A0D = new C150376pm();
        this.A0C = new C83V(userSession);
        C14360o3.A0B(userSession, 0);
        this.A09 = (C150716qS) userSession.A01(C150716qS.class, new C57243PbR(userSession, 5));
    }

    public static int A00(AKY aky, EnumC1825988f enumC1825988f, ModelPathsHolder modelPathsHolder) {
        String modelPath = modelPathsHolder.getModelPath(enumC1825988f);
        modelPath.getClass();
        return aky.A03(modelPath);
    }
}
