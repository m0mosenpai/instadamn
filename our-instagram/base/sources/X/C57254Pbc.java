package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Pbc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57254Pbc extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57254Pbc(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v64, types: [X.3Ro, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.3Ro, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C07N c07n;
        InterfaceC52932ba defaultViewModelProviderFactory;
        C07N c07n2;
        Object invoke;
        switch (this.A00) {
            case 0:
                OJB ojb = (OJB) this.A01;
                ojb.A02 = new C65075Td4(this.A02, 22);
                return new C79353gg(new C57243PbR(ojb, 28));
            case 1:
                ((C07T) this.A01).A0A((C07W) this.A02);
                break;
            case 2:
                C07T c07t = (C07T) this.A01;
                C07W c07w = (C07W) this.A02;
                c07t.A09(c07w);
                return new C79353gg(new C57254Pbc(1, c07t, c07w));
            case 3:
            case 4:
                List<AbstractC70653Fc> list = ((C170197iY) this.A02).A0C;
                if (list != null) {
                    RecyclerView recyclerView = (RecyclerView) this.A01;
                    for (AbstractC70653Fc abstractC70653Fc : list) {
                        recyclerView.A11(abstractC70653Fc);
                        if (abstractC70653Fc instanceof Q9V) {
                            AbstractC79383gk.A02(null);
                            ((Q9V) abstractC70653Fc).A00 = null;
                        }
                    }
                    break;
                }
                break;
            case 5:
                AbstractC169677hh.A03(((C170197iY) this.A02).A09, (C2Z8) this.A01);
                break;
            case 6:
                ((C170197iY) this.A02).A0A.F9H((ViewGroup) this.A01);
                break;
            case 7:
                C169917i6 c169917i6 = (C169917i6) this.A02;
                InterfaceC169817hv interfaceC169817hv = AbstractC169037gc.A01;
                c169917i6.A0H();
                break;
            case 8:
                return ((InterfaceC16660sJ) this.A01).invoke(new C168937gS(((C28943Cpr) this.A02).A00));
            case 9:
                C65850TvB c65850TvB = (C65850TvB) this.A02;
                C65891Tvv c65891Tvv = (C65891Tvv) this.A01;
                C65893Tvx c65893Tvx = c65891Tvv.A0S;
                C14360o3.A0B(c65893Tvx, 0);
                c65850TvB.A00.remove(c65893Tvx);
                c65891Tvv.A0I = null;
                c65891Tvv.A0H = null;
                C55982hj c55982hj = c65891Tvv.A0G;
                if (c55982hj != null) {
                    c55982hj.A0B(c65891Tvv);
                    C55982hj c55982hj2 = c65891Tvv.A0F;
                    if (c55982hj2 != null) {
                        c55982hj2.A0B(c65891Tvv);
                        C65891Tvv.A01(c65891Tvv);
                        break;
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            case 10:
                return new C94C((UserSession) this.A02, (Context) this.A01);
            case 11:
                return new AnonymousClass943((Context) this.A01, (UserSession) this.A02);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                final UserSession userSession = (UserSession) this.A02;
                final Context context = (Context) this.A01;
                return new C94A(userSession, context) { // from class: X.949
                    public final C0JM A00;
                    public final C3SZ A01;
                    public final C3RU A02;
                    public final C4QF A03;
                    public final C3SQ A04;
                    public final UserSession A05;
                    public final C94F A06;
                    public final C94B A07;

                    @Override // X.C94A
                    public final void COI() {
                        long j;
                        Object obj;
                        InterfaceC73913Tc interfaceC73913Tc;
                        C3RU c3ru = this.A02;
                        if (!c3ru.Car()) {
                            cleanup();
                            return;
                        }
                        C94F c94f = this.A06;
                        List singletonList = Collections.singletonList(c3ru);
                        C14360o3.A07(singletonList);
                        c94f.A00(singletonList);
                        if (C1CC.A09 == C1CA.A03) {
                            this.A03.A05("last_cold_start_key", C1CC.A08);
                        }
                        InterfaceC10260gi interfaceC10260gi = this.A04.A00;
                        if (interfaceC10260gi != null && interfaceC10260gi.AhA(36317753829561870L)) {
                            this.A01.EEz();
                        } else {
                            C3SZ c3sz = this.A01;
                            if (interfaceC10260gi != null) {
                                j = interfaceC10260gi.BP2(36599228806335969L);
                            } else {
                                j = 0;
                            }
                            c3sz.CgV((int) j);
                        }
                        if (c3ru.BfO() == C05F.A01 && c3ru.Bvt()) {
                            UserSession userSession2 = this.A05;
                            C14360o3.A0B(userSession2, 0);
                            File A00 = AH5.A00((AH5) userSession2.A01(AH5.class, new C57243PbR(c3ru, 45)));
                            if (!A00.exists() || !A00.canRead()) {
                                OKP A002 = AbstractC53716Np5.A00(userSession2);
                                C14360o3.A0B(A002, 2);
                                C3SN A003 = AHQ.A00(A002, c3ru, AbstractC09440dt.A01(B6K.A00));
                                if (A003.A02 && (obj = A003.A00) != null && (interfaceC73913Tc = (InterfaceC73913Tc) obj) != null) {
                                    try {
                                        ((AH5) userSession2.A01(AH5.class, new C57243PbR(c3ru, 45))).A02((DynamicNNModelParams) interfaceC73913Tc);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                        if (!c3ru.Ceh()) {
                            return;
                        }
                        UserSession userSession3 = this.A05;
                        C14360o3.A0B(userSession3, 0);
                        C3S9 c3s9 = (C3S9) ((C2047594j) userSession3.A01(C2047594j.class, new C57545PgJ(userSession3, 9))).A02.getValue();
                        List Aay = c3s9.Aay();
                        if (Aay.isEmpty()) {
                            return;
                        }
                        new C2047794l(AbstractC40691uc.A01(userSession3)).A00(C05F.A0N, c3ru.CDV(), c3ru.CDY(), Aay, null, null, this.A00.now());
                        c3s9.EEt();
                    }

                    @Override // X.C94A
                    public final void cleanup() {
                        C2L1.A00(((AG4) this.A07.A02.getValue()).A00).A05("IG_STORY_ADS_PREFETCH_WORKER");
                        this.A03.A03("last_cold_start_key");
                        this.A01.EEz();
                        UserSession userSession2 = this.A05;
                        C14360o3.A0B(userSession2, 0);
                        ((C3S9) ((C2047594j) userSession2.A01(C2047594j.class, new C57545PgJ(userSession2, 9))).A02.getValue()).EEt();
                    }

                    {
                        this.A05 = userSession;
                        this.A03 = (C4QF) C4QD.A00(userSession).A02.getValue();
                        this.A02 = new C3RT(userSession);
                        this.A04 = new C3SQ(userSession);
                        C14360o3.A0B(userSession, 0);
                        C14360o3.A0B(context, 1);
                        this.A07 = (C94B) userSession.A01(C94B.class, new C57254Pbc(17, context, userSession));
                        this.A01 = (C3SZ) ((C3SP) userSession.A01(C3SP.class, new C57545PgJ(userSession, 16))).A03.getValue();
                        this.A06 = ((C94C) userSession.A01(C94C.class, new C57254Pbc(10, context, userSession))).A01;
                        C03250Di c03250Di = C03250Di.A00;
                        C14360o3.A07(c03250Di);
                        this.A00 = c03250Di;
                    }
                };
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new C54742OFt((UserSession) this.A02, (Context) this.A01);
            case 14:
                return new C55709Oob((UserSession) this.A01, (C73633Rp) ((C54742OFt) this.A02).A0B.getValue());
            case Process.SIGTERM /* 15 */:
                return new C55708Ooa((UserSession) this.A01, (C73633Rp) ((C54742OFt) this.A02).A0B.getValue());
            case 16:
                return new C3RS((UserSession) this.A02, (Context) this.A01);
            case 17:
                return new C94B((UserSession) this.A02, (Context) this.A01);
            case 18:
                final UserSession userSession2 = (UserSession) this.A02;
                final Context context2 = (Context) this.A01;
                return new C94A(userSession2, context2) { // from class: X.94b
                    public final C0JM A00;
                    public final C3RU A01;
                    public final UserSession A02;
                    public final C94F A03;

                    @Override // X.C94A
                    public final void COI() {
                        C3RU c3ru = this.A01;
                        if (!c3ru.Car()) {
                            cleanup();
                            return;
                        }
                        if (c3ru.CDg()) {
                            C94F c94f = this.A03;
                            List singletonList = Collections.singletonList(c3ru);
                            C14360o3.A07(singletonList);
                            c94f.A00(singletonList);
                        }
                        if (!c3ru.Ceh()) {
                            return;
                        }
                        UserSession userSession3 = this.A02;
                        C14360o3.A0B(userSession3, 0);
                        C3S9 c3s9 = (C3S9) ((C2048794v) userSession3.A01(C2048794v.class, new C57545PgJ(userSession3, 21))).A01.getValue();
                        List Aay = c3s9.Aay();
                        if (Aay.isEmpty()) {
                            return;
                        }
                        new C2047794l(AbstractC40691uc.A01(userSession3)).A00(C05F.A0N, c3ru.CDV(), c3ru.CDY(), Aay, null, null, this.A00.now());
                        c3s9.EEt();
                    }

                    @Override // X.C94A
                    public final void cleanup() {
                        UserSession userSession3 = this.A02;
                        C14360o3.A0B(userSession3, 0);
                        ((C3S9) ((C2048794v) userSession3.A01(C2048794v.class, new C57545PgJ(userSession3, 21))).A01.getValue()).EEt();
                    }

                    {
                        this.A02 = userSession2;
                        this.A01 = new AnonymousClass948(userSession2);
                        C14360o3.A0B(userSession2, 0);
                        C14360o3.A0B(context2, 1);
                        this.A03 = ((C94C) userSession2.A01(C94C.class, new C57254Pbc(10, context2, userSession2))).A01;
                        C03250Di c03250Di = C03250Di.A00;
                        C14360o3.A07(c03250Di);
                        this.A00 = c03250Di;
                    }
                };
            case Process.SIGSTOP /* 19 */:
                return new OFV((UserSession) this.A02, (Context) this.A01);
            case 20:
                return new C54713OEq((UserSession) this.A02, (Context) this.A01);
            case 21:
                return new C94G((UserSession) this.A02, (Context) this.A01);
            case 22:
                return new C56060Ouc((C71383Hz) this.A01, (UserSession) this.A02);
            case 23:
                C22951A9v c22951A9v = (C22951A9v) this.A02;
                return new C73683Ru((C73673Rt) this.A01, "ScrollSpeedAggregated", AbstractC16960so.A1Q(c22951A9v.A00, new Object(), new C55705OoX(c22951A9v.A02, "TargetSpeedSource", "222"), new C55705OoX(c22951A9v.A01, "MultiplierCapSource", "333"), new Object()));
            case 24:
                InterfaceC09390do interfaceC09390do = ((OFQ) this.A02).A0A;
                Double d = ((AnonymousClass944) interfaceC09390do.getValue()).A01;
                Double d2 = ((AnonymousClass944) interfaceC09390do.getValue()).A00;
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A01;
                C73673Rt c73673Rt = new C73673Rt(AbstractC43592JPx.A0N(), 424086240);
                C14360o3.A0B(abstractC12990ll, 2);
                return ((C22951A9v) abstractC12990ll.A01(C22951A9v.class, new ME7(6, c73673Rt, abstractC12990ll, d2, d))).A03.getValue();
            case 25:
                C006802i A0N = AbstractC43592JPx.A0N();
                ((OFQ) this.A02).A0A.getValue();
                return new C73673Rt(A0N, 424096228);
            case 26:
                Object obj = this.A01;
                AbstractC12990ll abstractC12990ll2 = (AbstractC12990ll) this.A02;
                if (obj != null) {
                    C14360o3.A0B(abstractC12990ll2, 0);
                    return ((C53607NnE) abstractC12990ll2.A01(C53607NnE.class, new C57545PgJ(obj, 31))).A00;
                }
                C14360o3.A0B(abstractC12990ll2, 0);
                return ((C54659OCl) abstractC12990ll2.A01(C54659OCl.class, new C57545PgJ(abstractC12990ll2, 37))).A00;
            case 27:
                return AbstractC12220kQ.A01((C19270xB) this.A01, (AbstractC12990ll) this.A02);
            case 28:
            case 30:
            case 32:
            case 34:
            case 36:
            case 37:
            case 38:
            case 40:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 44:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 48:
            default:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ == null || (invoke = interfaceC16820sZ.invoke()) == null) {
                    InterfaceC018407e A0i = AbstractC25228BEl.A0i(this.A02);
                    if ((A0i instanceof C07N) && (c07n2 = (C07N) A0i) != null) {
                        return c07n2.getDefaultViewModelCreationExtras();
                    }
                    return C52962bd.A00;
                }
                return invoke;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 31:
            case 33:
            case 35:
            case 39:
            case Seq.NULL_REFNUM /* 41 */:
            case 43:
            case 45:
            case 47:
            case 49:
                InterfaceC018407e A0i2 = AbstractC25228BEl.A0i(this.A01);
                if ((A0i2 instanceof C07N) && (c07n = (C07N) A0i2) != null && (defaultViewModelProviderFactory = c07n.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                return ((Fragment) this.A02).getDefaultViewModelProviderFactory();
        }
        return C0eB.A00;
    }
}
