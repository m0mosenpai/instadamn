package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;

/* renamed from: X.PgJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57545PgJ extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57545PgJ(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new C57545PgJ(obj, i));
    }

    public static C17050sx A01(Object obj, int i) {
        return AbstractC09440dt.A01(new C57545PgJ(obj, i));
    }

    /* JADX WARN: Type inference failed for: r4v42, types: [X.NnE, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC09390do interfaceC09390do;
        switch (this.A00) {
            case 0:
                return new C2047294g(((C54657OCj) this.A01).A01);
            case 1:
                return new C3RT((UserSession) this.A01);
            case 2:
                return new C73693Rv((InterfaceC73623Ro) ((C54742OFt) this.A01).A0D.getValue());
            case 3:
                return C4CY.A00((UserSession) this.A01);
            case 4:
                C54742OFt c54742OFt = (C54742OFt) this.A01;
                InterfaceC10260gi interfaceC10260gi = ((C3RT) c54742OFt.A08.getValue()).A00;
                if (interfaceC10260gi != null && interfaceC10260gi.AhA(36317753830675989L)) {
                    return c54742OFt.A09.getValue();
                }
                return c54742OFt.A0D.getValue();
            case 5:
                ArrayList A1E = AbstractC166987dD.A1E();
                C54742OFt c54742OFt2 = (C54742OFt) this.A01;
                InterfaceC09390do interfaceC09390do2 = c54742OFt2.A08;
                InterfaceC10260gi interfaceC10260gi2 = ((C3RT) interfaceC09390do2.getValue()).A00;
                if (interfaceC10260gi2 != null && interfaceC10260gi2.AhA(2342160763045287459L)) {
                    A1E.add(c54742OFt2.A0I.getValue());
                }
                InterfaceC10260gi interfaceC10260gi3 = ((C3RT) interfaceC09390do2.getValue()).A00;
                if (interfaceC10260gi3 != null && interfaceC10260gi3.AhA(2342160763045221922L)) {
                    InterfaceC10260gi interfaceC10260gi4 = ((C3RT) interfaceC09390do2.getValue()).A00;
                    if (interfaceC10260gi4 != null && interfaceC10260gi4.AhA(36317753831790118L)) {
                        interfaceC09390do = c54742OFt2.A0H;
                    } else {
                        interfaceC09390do = c54742OFt2.A0G;
                    }
                    A1E.add(interfaceC09390do.getValue());
                }
                A1E.add(c54742OFt2.A06);
                return new C73683Ru((C73673Rt) c54742OFt2.A0E.getValue(), CameraRollManager.ASSET_TYPE_ALL, A1E);
            case 6:
                return new C73673Rt(AbstractC43592JPx.A0N(), 424086240);
            case 7:
                C1M7 A01 = C1M7.A01();
                C14360o3.A07(A01);
                return new C73593Rl((C0JM) AbstractC166987dD.A17(((C54742OFt) this.A01).A0A), new C3Ri(new C73563Rh(A01).A00()));
            case 8:
                C54742OFt c54742OFt3 = (C54742OFt) this.A01;
                return new C73683Ru((C73673Rt) c54742OFt3.A0E.getValue(), "System", AbstractC16960so.A1Q(c54742OFt3.A00, c54742OFt3.A01, c54742OFt3.A02, c54742OFt3.A03, c54742OFt3.A05, c54742OFt3.A04));
            case 9:
                return new C2047594j((UserSession) this.A01);
            case 10:
                return new C54658OCk();
            case 11:
                return new C3Ri(((C73563Rh) ((C54658OCk) this.A01).A02.getValue()).A00());
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new C73563Rh((C1M7) AbstractC166987dD.A17(((C54658OCk) this.A01).A04));
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C54658OCk c54658OCk = (C54658OCk) this.A01;
                return new C73593Rl((C0JM) AbstractC166987dD.A17(c54658OCk.A00), (InterfaceC73573Rj) c54658OCk.A01.getValue());
            case 14:
                return new C73493Ra((UserSession) this.A01);
            case Process.SIGTERM /* 15 */:
                return new C3RY((UserSession) this.A01);
            case 16:
                return new C3SP((UserSession) this.A01);
            case 17:
                return new LVR(((LVS) this.A01).A01);
            case 18:
                return new C55716Ooi(((LVS) this.A01).A01);
            case Process.SIGSTOP /* 19 */:
                return new C55715Ooh(((LVS) this.A01).A01);
            case 20:
                return new C55717Ooj(((LVR) this.A01).A01);
            case 21:
                return new C2048794v((UserSession) this.A01);
            case 22:
                return C1AT.A01((UserSession) this.A01).A04(C1AV.A16, C4QF.class);
            case 23:
                return new C4QF(new SharedPreferencesC19650xs((InterfaceC19630xq) ((OFV) this.A01).A07.getValue()), "ig_reels_scroll_");
            case 24:
                OFV ofv = (OFV) this.A01;
                return new C73683Ru(null, "System", AbstractC16960so.A1Q(ofv.A03, ofv.A00, ofv.A01, ofv.A02, ofv.A05, ofv.A04));
            case 25:
                C54713OEq c54713OEq = (C54713OEq) this.A01;
                UserSession userSession = c54713OEq.A01;
                Context context = c54713OEq.A00;
                AbstractC167017dG.A1N(userSession, context);
                return userSession.A01(OFV.class, new C57254Pbc(19, context, userSession));
            case 26:
                C54713OEq c54713OEq2 = (C54713OEq) this.A01;
                return C3RW.A00(c54713OEq2.A01).A00((InterfaceC73523Rd) c54713OEq2.A04.getValue(), (AnonymousClass948) c54713OEq2.A05.getValue(), AbstractC166987dD.A1J(((OFV) c54713OEq2.A02.getValue()).A09.getValue()));
            case 27:
                C54713OEq c54713OEq3 = (C54713OEq) this.A01;
                return new C55712Ooe((C53715Np4) c54713OEq3.A07.getValue(), (OKP) c54713OEq3.A06.getValue(), (AnonymousClass948) c54713OEq3.A05.getValue());
            case 28:
                return new AnonymousClass948(((C54713OEq) this.A01).A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return AbstractC53716Np5.A00(((C54713OEq) this.A01).A01);
            case 30:
                return new C94L((UserSession) this.A01);
            case 31:
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                ?? obj = new Object();
                obj.A00 = new C55710Ooc(interfaceC16660sJ);
                return obj;
            case 32:
                OFQ ofq = (OFQ) this.A01;
                return new C23381AYf((C0JM) AbstractC166987dD.A17(ofq.A01), (C2047794l) ofq.A04.getValue(), (AnonymousClass944) ofq.A0A.getValue(), C05F.A0N);
            case 33:
                return new C2047794l((C40701ud) ((OFQ) this.A01).A05.getValue());
            case 34:
                return AbstractC40691uc.A01((UserSession) this.A01);
            case 35:
                OFQ ofq2 = (OFQ) this.A01;
                AnonymousClass944 anonymousClass944 = (AnonymousClass944) ofq2.A0A.getValue();
                InterfaceC73623Ro interfaceC73623Ro = (InterfaceC73623Ro) ofq2.A02.getValue();
                InterfaceC73523Rd interfaceC73523Rd = (InterfaceC73523Rd) ofq2.A09.getValue();
                C73673Rt c73673Rt = (C73673Rt) ofq2.A07.getValue();
                return new C3SC(interfaceC73623Ro, (C3SB) ofq2.A00.getValue(), (C23381AYf) ofq2.A03.getValue(), c73673Rt, interfaceC73523Rd, anonymousClass944, (InterfaceExecutorServiceC73393Qq) AbstractC166987dD.A17(ofq2.A06));
            case 36:
                return new AnonymousClass944((UserSession) this.A01);
            case 37:
                return new C54659OCl((UserSession) this.A01);
            case 38:
                return new AnonymousClass944(((C54659OCl) this.A01).A01);
            case 39:
                return C006802i.A0p;
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
                return ((Fragment) this.A01).requireParentFragment().requireParentFragment();
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 44:
            case 48:
                return AbstractC25226BEj.A1C(this.A01);
            case 43:
            case 45:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 47:
                return ((Fragment) this.A01).requireParentFragment();
        }
    }
}
