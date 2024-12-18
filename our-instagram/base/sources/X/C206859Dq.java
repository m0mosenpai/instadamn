package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.IgTextureLoader;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.odin.features.persistence.room.ig4a.IgRoomExampleDatabase;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Matrix;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.roomdb.IgRoomDatabase;
import go.Seq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.9Dq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206859Dq extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206859Dq(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0004. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.3rM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [X.3rM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.3rM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.3rM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, X.3cy] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC16820sZ interfaceC16820sZ;
        String str;
        String str2;
        InterfaceC09390do interfaceC09390do;
        C73703Rx c73703Rx;
        IgRoomDatabase igRoomDatabase;
        List list;
        int[] iArr;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        Matrix[] matrixArr;
        float[][] fArr4;
        Matrix matrix;
        Matrix matrix2;
        Object obj;
        switch (this.A00) {
            case 0:
                C102814kI c102814kI = ((C102984kZ) this.A01).A00;
                if (c102814kI != null) {
                    ArrayList arrayList = new ArrayList();
                    C102814kI c102814kI2 = c102814kI;
                    do {
                        arrayList.addAll(0, c102814kI2.A03);
                        c102814kI2 = c102814kI2.A02;
                    } while (c102814kI2 != null);
                    C102814kI c102814kI3 = c102814kI;
                    while (true) {
                        str = c102814kI3.A01;
                        if (str == null) {
                            c102814kI3 = c102814kI3.A02;
                            if (c102814kI3 == null) {
                                str = null;
                            }
                        }
                    }
                    while (true) {
                        str2 = c102814kI.A00;
                        if (str2 == null) {
                            c102814kI = c102814kI.A02;
                            if (c102814kI == null) {
                                str2 = null;
                            }
                        }
                    }
                    return new C22897A7r(str, str2, arrayList);
                }
                return null;
            case 1:
                return new A6T(((C50E) this.A01).A02.A02());
            case 2:
                return IgTextureLoader.access$createTextureLoaderNative((IgTextureLoader) this.A01);
            case 3:
                ((C27221Tw) this.A01).A05.evictAll();
                return C0eB.A00;
            case 4:
                return new AnonymousClass974((UserSession) this.A01);
            case 5:
                return this.A01;
            case 6:
                ((Drawable) this.A01).invalidateSelf();
                return C0eB.A00;
            case 7:
                InterfaceC09250da interfaceC09250da = (InterfaceC09250da) this.A01;
                C14360o3.A0B(interfaceC09250da, 1);
                ?? obj2 = new Object();
                obj2.A00 = interfaceC09250da;
                return new C6DM(obj2);
            case 8:
                InterfaceC09250da interfaceC09250da2 = (InterfaceC09250da) this.A01;
                C14360o3.A0B(interfaceC09250da2, 1);
                ?? obj3 = new Object();
                obj3.A00 = interfaceC09250da2;
                return new C85323rN(obj3);
            case 9:
                InterfaceC09250da interfaceC09250da3 = (InterfaceC09250da) this.A01;
                C14360o3.A0B(interfaceC09250da3, 1);
                ?? obj4 = new Object();
                obj4.A00 = interfaceC09250da3;
                return new C24995B3r(obj4);
            case 10:
                InterfaceC09250da interfaceC09250da4 = (InterfaceC09250da) this.A01;
                C14360o3.A0B(interfaceC09250da4, 1);
                ?? obj5 = new Object();
                obj5.A00 = interfaceC09250da4;
                return new C9IQ(obj5);
            case 11:
                C1LN.A01(AnonymousClass001.A0R("onEvent: ", ((C77783e3) this.A01).A00));
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                Object invoke = ((InterfaceC16820sZ) this.A01).invoke();
                ?? obj6 = new Object();
                obj6.A00 = invoke;
                return obj6;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                interfaceC16820sZ = ((C75863ar) this.A01).A00;
                return interfaceC16820sZ.invoke();
            case 14:
                return new C80363iQ((C51762Yz) this.A01, AnonymousClass191.A00);
            case Process.SIGTERM /* 15 */:
                interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                return interfaceC16820sZ.invoke();
            case 16:
                return new C2XI(this.A01);
            case 17:
                ((C51762Yz) this.A01).A03(C25097B8t.A00);
                return C0eB.A00;
            case 18:
                return new C65075Td4(this.A01, 24);
            case Process.SIGSTOP /* 19 */:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 20:
                return ((InterfaceC82463mA) this.A01).B3h();
            case 21:
                C4P1 c4p1 = (C4P1) this.A01;
                c4p1.A05.A01();
                c4p1.A06.A00();
                C20H c20h = c4p1.A0C;
                c4p1.A0C = null;
                if (c20h != null) {
                    c20h.stop();
                }
                return C0eB.A00;
            case 22:
            case 24:
                C20H c20h2 = ((C4P1) this.A01).A0C;
                if (c20h2 != null) {
                    c20h2.onNetworkAvailable();
                }
                return C0eB.A00;
            case 23:
            case 25:
                C20H c20h3 = ((C4P1) this.A01).A0C;
                if (c20h3 != null) {
                    c20h3.onNetworkUnavailable();
                }
                return C0eB.A00;
            case 26:
                C1M7 A01 = C1M7.A01();
                C14360o3.A07(A01);
                return new C73593Rl(((C94C) this.A01).A00, new C3Ri(new C73563Rh(A01).A00()));
            case 27:
                C18V c18v = C18V.A01;
                if (c18v != null) {
                    AnonymousClass943 anonymousClass943 = (AnonymousClass943) this.A01;
                    AnonymousClass943 anonymousClass9432 = AnonymousClass943.$redex_init_class;
                    C1AC A02 = c18v.A02(anonymousClass943.A01);
                    if (A02 != null) {
                        return A02.A01.A00;
                    }
                    return null;
                }
                return null;
            case 28:
                return new C94K((UserSession) this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new C3RX((UserSession) this.A01);
            case 30:
                c73703Rx = IgRoomExampleDatabase.A00;
                UserSession userSession = ((C3RX) this.A01).A01;
                Object A00 = userSession.A00(IgRoomExampleDatabase.class);
                if (A00 != null) {
                    return A00;
                }
                synchronized (c73703Rx) {
                    igRoomDatabase = (IgRoomDatabase) userSession.A00(IgRoomExampleDatabase.class);
                    if (igRoomDatabase == null) {
                        Context context = AbstractC12290kX.A00;
                        C14360o3.A07(context);
                        C1Ye A002 = C1Yc.A00(context, IgRoomExampleDatabase.class, C1YZ.A00(userSession, c73703Rx));
                        AbstractC28241Yh.A00(A002, 1809011763, 1567390029, false);
                        A002.A01();
                        igRoomDatabase = (IgRoomDatabase) A002.A00();
                        userSession.A04(IgRoomExampleDatabase.class, igRoomDatabase);
                    }
                    return igRoomDatabase;
                }
            case 31:
                C1M7 A012 = C1M7.A01();
                C14360o3.A07(A012);
                return new C73593Rl(((C3RX) this.A01).A00, new C3Ri(new C73563Rh(A012).A00()));
            case 32:
                return new C2047094e((UserSession) this.A01);
            case 33:
            case 43:
            default:
                return new C3RT((UserSession) this.A01);
            case 34:
                ArrayList arrayList2 = new ArrayList();
                C73543Rf c73543Rf = (C73543Rf) this.A01;
                arrayList2.add(c73543Rf.A09.getValue());
                arrayList2.add(c73543Rf.A05.getValue());
                arrayList2.add(c73543Rf.A0A.getValue());
                arrayList2.add(c73543Rf.A00);
                return new C73683Ru((C73673Rt) c73543Rf.A07.getValue(), CameraRollManager.ASSET_TYPE_ALL, arrayList2);
            case 35:
                return C1AT.A01((UserSession) this.A01).A04(C1AV.A25, C73663Rs.class);
            case 36:
                return new C73693Rv((InterfaceC73623Ro) ((C73543Rf) this.A01).A02.getValue());
            case 37:
                return new C73653Rr(((C73543Rf) this.A01).A00());
            case 38:
                C73543Rf c73543Rf2 = (C73543Rf) this.A01;
                InterfaceC10260gi interfaceC10260gi = ((C3RT) c73543Rf2.A01.getValue()).A00;
                boolean z = true;
                if (interfaceC10260gi == null || !interfaceC10260gi.AhA(36317753830675989L)) {
                    z = false;
                }
                if (z) {
                    interfaceC09390do = c73543Rf2.A04;
                } else {
                    interfaceC09390do = c73543Rf2.A02;
                }
                return interfaceC09390do.getValue();
            case 39:
                C006802i c006802i = C006802i.A0p;
                C14360o3.A07(c006802i);
                return new C73673Rt(c006802i, 424086240);
            case 40:
                C1M7 A013 = C1M7.A01();
                C14360o3.A07(A013);
                return new C73593Rl(((C73543Rf) this.A01).A00(), new C3Ri(new C73563Rh(A013).A00()));
            case Seq.NULL_REFNUM /* 41 */:
                final UserSession userSession2 = (UserSession) this.A01;
                final C73633Rp A003 = C4CY.A00(userSession2);
                return new InterfaceC73623Ro(userSession2, A003) { // from class: X.3Rq
                    public final UserSession A00;
                    public final C73633Rp A01;

                    {
                        C14360o3.A0B(A003, 1);
                        C14360o3.A0B(userSession2, 2);
                        this.A01 = A003;
                        this.A00 = userSession2;
                    }

                    @Override // X.InterfaceC73623Ro
                    public final String getId() {
                        return "StoryFeatureSourceForV10";
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v4, types: [X.0sl] */
                    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
                    @Override // X.InterfaceC73623Ro
                    public final C3SN ATr(OdinContext odinContext) {
                        C16930sl c16930sl;
                        ArrayList arrayList3;
                        Collection singletonList;
                        C3SN E8E = ((C3SZ) this.A01.A01.getValue()).E8E(AbstractC16960so.A1Q("recent_time_on_story", "last_story_session_end_timestamp"), 0);
                        if (E8E.A02) {
                            Map map = (Map) E8E.A00;
                            ?? arrayList4 = new ArrayList();
                            try {
                                List list2 = (List) map.get("recent_time_on_story");
                                if (list2 == null) {
                                    list2 = C16930sl.A00;
                                }
                                if (list2.isEmpty()) {
                                    arrayList3 = C16930sl.A00;
                                } else {
                                    ArrayList arrayList5 = new ArrayList();
                                    C3R9[] c3r9Arr = FeatureData.A0E;
                                    Type type = Type.A09;
                                    arrayList5.add(new FeatureData(type, "3343", null, null, 0.0d, 16376, ((Number) list2.get(((int) Math.ceil((20.0d / 100.0d) * list2.size())) - 1)).longValue()));
                                    arrayList5.add(new FeatureData(type, "3344", null, null, 0.0d, 16376, ((Number) list2.get(((int) Math.ceil((50.0d / 100.0d) * list2.size())) - 1)).longValue()));
                                    arrayList3 = arrayList5;
                                }
                                arrayList4.addAll(arrayList3);
                                List list3 = (List) map.get("last_story_session_end_timestamp");
                                if (list3 == null) {
                                    list3 = C16930sl.A00;
                                }
                                if (list3.isEmpty()) {
                                    singletonList = C16930sl.A00;
                                } else {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    long longValue = currentTimeMillis - ((Number) list3.get(list3.size() - 1)).longValue();
                                    if (longValue <= 0) {
                                        C55078OaY.A00(null, AnonymousClass001.A0f("Invalid time interval since last story session value, currentTimestampMs is : ", ", lastSessionEndTimestampMs: ", currentTimeMillis, ((Number) list3.get(list3.size() - 1)).longValue()));
                                    }
                                    Type type2 = Type.A09;
                                    long j = new long[]{longValue, -1}[0];
                                    if (-1 > j) {
                                        j = -1;
                                    }
                                    singletonList = Collections.singletonList(new FeatureData(type2, "3353", null, null, 0.0d, 16376, j));
                                    C14360o3.A07(singletonList);
                                }
                                arrayList4.addAll(singletonList);
                                c16930sl = arrayList4;
                            } catch (Exception e) {
                                C55078OaY.A00(null, AnonymousClass001.A0R(MSV.A00(763), e.getMessage()));
                                c16930sl = arrayList4;
                            }
                        } else {
                            c16930sl = C16930sl.A00;
                        }
                        return new C3SN(c16930sl, null, true);
                    }
                };
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C73543Rf c73543Rf3 = (C73543Rf) this.A01;
                return new C73663Rs(c73543Rf3.A00(), (InterfaceC19630xq) c73543Rf3.A03.getValue());
            case 44:
                C2047594j c2047594j = (C2047594j) this.A01;
                C3S0 A004 = ((IgRoomExampleDatabase) c2047594j.A03.getValue()).A00();
                C3RU c3ru = (C3RU) c2047594j.A00.getValue();
                Object value = c2047594j.A01.getValue();
                C14360o3.A07(value);
                return new C3S8((C0JM) value, A004, c3ru);
            case 45:
                c73703Rx = IgRoomExampleDatabase.A00;
                UserSession userSession3 = (UserSession) this.A01;
                Object A005 = userSession3.A00(IgRoomExampleDatabase.class);
                if (A005 != null) {
                    return A005;
                }
                synchronized (c73703Rx) {
                    igRoomDatabase = (IgRoomDatabase) userSession3.A00(IgRoomExampleDatabase.class);
                    if (igRoomDatabase == null) {
                        Context context2 = AbstractC12290kX.A00;
                        C14360o3.A07(context2);
                        C1Ye A006 = C1Yc.A00(context2, IgRoomExampleDatabase.class, C1YZ.A00(userSession3, c73703Rx));
                        AbstractC28241Yh.A00(A006, 1809011763, 1567390029, false);
                        A006.A01();
                        igRoomDatabase = (IgRoomDatabase) A006.A00();
                        userSession3.A04(IgRoomExampleDatabase.class, igRoomDatabase);
                    }
                    return igRoomDatabase;
                }
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new C3RT(((C3RS) this.A01).A01);
            case 47:
                C73493Ra c73493Ra = (C73493Ra) this.A01;
                UserSession userSession4 = c73493Ra.A00;
                Object value2 = c73493Ra.A02.getValue();
                C14360o3.A0B(userSession4, 0);
                C14360o3.A0B(value2, 1);
                return userSession4.A01(AH5.class, new C57243PbR(value2, 45));
            case 48:
                C73493Ra c73493Ra2 = (C73493Ra) this.A01;
                InterfaceC09390do interfaceC09390do2 = c73493Ra2.A02;
                if (((C3RT) interfaceC09390do2.getValue()).Bvt()) {
                    C3SN A014 = ((AH5) c73493Ra2.A01.getValue()).A01();
                    if (A014.A02 && (obj = A014.A00) != null) {
                        return obj;
                    }
                    return new DynamicNNModelParams();
                }
                if (((C3RT) interfaceC09390do2.getValue()).BUS() == 11) {
                    list = A4K.A02;
                    iArr = A4K.A05;
                    fArr = A4K.A03;
                    fArr2 = new float[0];
                    fArr3 = A4K.A04;
                    matrixArr = A4K.A06;
                    fArr4 = A4K.A07;
                    matrix = A4K.A00;
                    matrix2 = A4K.A01;
                } else {
                    list = C3TQ.A02;
                    iArr = C3TQ.A05;
                    fArr = C3TQ.A03;
                    fArr2 = new float[0];
                    fArr3 = C3TQ.A04;
                    matrixArr = C3TQ.A06;
                    fArr4 = C3TQ.A07;
                    matrix = C3TQ.A00;
                    matrix2 = C3TQ.A01;
                }
                return new C73903Tb(matrix, matrix2, list, fArr, fArr2, fArr3, iArr, matrixArr, fArr4);
            case 49:
                return new C3RT(((C73493Ra) this.A01).A00);
        }
    }
}
