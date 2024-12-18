package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;

/* renamed from: X.DGw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29908DGw extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29908DGw(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C29908DGw(obj, i));
    }

    public static C29908DGw A01(C5Tl c5Tl, Object obj, int i) {
        C29908DGw c29908DGw = new C29908DGw(obj, i);
        c5Tl.FBy(c29908DGw);
        return c29908DGw;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int A00;
        Object value;
        C26067Bfv A002;
        UserSession A0r;
        InterfaceC09390do interfaceC09390do;
        Object value2;
        C26067Bfv A003;
        InterfaceC09390do interfaceC09390do2;
        InterfaceC16820sZ interfaceC16820sZ;
        UserSession A0r2;
        Object value3;
        switch (this.A00) {
            case 0:
                return new C27012Bvr(((C53Z) this.A01).getSession(), "");
            case 1:
                A0r2 = ((C26893Btu) this.A01).A01;
                return new BP5(A0r2, null);
            case 2:
                C26771Brs c26771Brs = (C26771Brs) this.A01;
                A0r = AbstractC166987dD.A0r(c26771Brs.A07);
                interfaceC09390do = c26771Brs.A04;
                return new BP5(A0r, AbstractC25225BEi.A15(interfaceC09390do));
            case 3:
                return C3I7.A01(this.A01, false, true);
            case 4:
                return new C56177Owk(this.A01, 5);
            case 5:
                C25867BcM c25867BcM = (C25867BcM) ((C26771Brs) this.A01).A08.getValue();
                C05A c05a = c25867BcM.A09;
                do {
                    value3 = c05a.getValue();
                } while (!c05a.AIi(value3, C26080Bg9.A00(null, null, (C26080Bg9) value3, null, null, C6R.A03, 61)));
                AbstractC166987dD.A1Z(D4z.A02(c25867BcM, null, 42), AbstractC141776au.A00(c25867BcM));
                return C0eB.A00;
            case 6:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 27:
            case 35:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 47:
                return this.A01;
            case 7:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 28:
            case 36:
            case 43:
            case 48:
                interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                return interfaceC16820sZ.invoke();
            case 8:
            case 14:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 37:
            case 44:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 9:
                C26771Brs c26771Brs2 = (C26771Brs) this.A01;
                return new C27013Bvs(AbstractC166987dD.A0r(c26771Brs2.A07), AbstractC25225BEi.A15(c26771Brs2.A03));
            case 10:
                interfaceC09390do2 = ((C26769Brq) this.A01).A03;
                A0r2 = AbstractC166987dD.A0r(interfaceC09390do2);
                return new BP5(A0r2, null);
            case 11:
                C26771Brs c26771Brs3 = new C26771Brs();
                C26769Brq c26769Brq = (C26769Brq) this.A01;
                AbstractC25227BEk.A1C(c26771Brs3, AbstractC167007dF.A1b("creator_ai_entry_point_extra", "settings", AbstractC166987dD.A1L(AbstractC43591JPw.A00(18), C63.A03), AbstractC166987dD.A1L("creator_ai_creator_fbid", c26769Brq.A02.getValue())));
                C140966Yy A0c = AbstractC25231BEo.A0c(c26769Brq.requireActivity(), c26769Brq.A03);
                A0c.A0D(c26771Brs3);
                A0c.A04();
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                interfaceC16820sZ = ((C26769Brq) this.A01).A00;
                return interfaceC16820sZ.invoke();
            case 16:
                C26769Brq c26769Brq2 = (C26769Brq) this.A01;
                return new C27014Bvt(AbstractC166987dD.A0r(c26769Brq2.A03), AbstractC25225BEi.A15(c26769Brq2.A02));
            case 17:
                interfaceC09390do2 = ((C26754Brb) this.A01).A02;
                A0r2 = AbstractC166987dD.A0r(interfaceC09390do2);
                return new BP5(A0r2, null);
            case 18:
                C26765Brm c26765Brm = (C26765Brm) this.A01;
                A0r = AbstractC166987dD.A0r(c26765Brm.A08);
                interfaceC09390do = c26765Brm.A03;
                return new BP5(A0r, AbstractC25225BEi.A15(interfaceC09390do));
            case Process.SIGSTOP /* 19 */:
                C26765Brm c26765Brm2 = (C26765Brm) this.A01;
                FragmentActivity requireActivity = c26765Brm2.requireActivity();
                UserSession A0r3 = AbstractC166987dD.A0r(c26765Brm2.A08);
                InterfaceC09390do interfaceC09390do3 = c26765Brm2.A07;
                return new C52942bb(new C27029Bw9(A0r3, (EnumC27380C6j) interfaceC09390do3.getValue(), AbstractC25225BEi.A15(c26765Brm2.A02)), requireActivity).A01(C26901Bu4.class, ((EnumC27380C6j) interfaceC09390do3.getValue()).name());
            case 20:
            case 21:
            case 39:
            case Seq.NULL_REFNUM /* 41 */:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                AbstractC166987dD.A1Y(this.A01);
                return C0eB.A00;
            case 22:
                A00 = ((List) this.A01).size();
                return Integer.valueOf(A00);
            case 23:
                C26737BrI c26737BrI = (C26737BrI) this.A01;
                A0r = AbstractC166987dD.A0r(c26737BrI.A05);
                interfaceC09390do = c26737BrI.A03;
                return new BP5(A0r, AbstractC25225BEi.A15(interfaceC09390do));
            case 24:
                C26737BrI c26737BrI2 = (C26737BrI) this.A01;
                BP5 bp5 = (BP5) c26737BrI2.A01.getValue();
                bp5.A04(C8p.A0C, bp5.A00);
                C26749BrW c26749BrW = c26737BrI2.A00;
                if (c26749BrW != null) {
                    AbstractC25229BEm.A0g(c26749BrW).A01(false);
                }
                AbstractC25233BEq.A14(c26737BrI2);
                return C0eB.A00;
            case 25:
                C26737BrI c26737BrI3 = (C26737BrI) this.A01;
                BP5 bp52 = (BP5) c26737BrI3.A01.getValue();
                bp52.A04(C8p.A0A, bp52.A00);
                C26749BrW c26749BrW2 = c26737BrI3.A00;
                if (c26749BrW2 != null) {
                    C05A c05a2 = AbstractC25229BEm.A0g(c26749BrW2).A0A;
                    do {
                        value2 = c05a2.getValue();
                        A003 = C26067Bfv.A00(null, null, (C26067Bfv) value2, null, null, null, 253951, false, false, false, true);
                    } while (!c05a2.AIi(value2, A003));
                }
                AbstractC25233BEq.A14(c26737BrI3);
                return C0eB.A00;
            case 26:
            case 34:
                A00 = AbstractC166997dE.A0N((Fragment) this.A01).getDimensionPixelSize(R.dimen.appreciation_reels_grid_item_width);
                return Integer.valueOf(A00);
            case 30:
                C26737BrI c26737BrI4 = (C26737BrI) this.A01;
                return new C27032BwC(AbstractC166987dD.A0r(c26737BrI4.A05), AbstractC25225BEi.A15(c26737BrI4.A02), AbstractC25225BEi.A15(c26737BrI4.A03));
            case 31:
                C26749BrW c26749BrW3 = (C26749BrW) this.A01;
                A0r = AbstractC166987dD.A0r(c26749BrW3.A04);
                interfaceC09390do = c26749BrW3.A02;
                return new BP5(A0r, AbstractC25225BEi.A15(interfaceC09390do));
            case 32:
                C05A c05a3 = AbstractC25229BEm.A0g((C26749BrW) this.A01).A0A;
                do {
                    value = c05a3.getValue();
                    A002 = C26067Bfv.A00(null, null, (C26067Bfv) value, null, null, null, 253951, false, false, false, false);
                } while (!c05a3.AIi(value, A002));
                return C0eB.A00;
            case 33:
                C26749BrW.A00((C26749BrW) this.A01);
                return C0eB.A00;
            case 38:
                C26749BrW c26749BrW4 = (C26749BrW) this.A01;
                return new C27032BwC(AbstractC166987dD.A0r(c26749BrW4.A04), AbstractC25225BEi.A15(c26749BrW4.A01), AbstractC25225BEi.A15(c26749BrW4.A02));
            case 40:
                A00 = ((LazyListState) this.A01).A00();
                return Integer.valueOf(A00);
            case 45:
                C26755Brc c26755Brc = (C26755Brc) this.A01;
                return new C27016Bvv(AbstractC166987dD.A0r(c26755Brc.A01), AbstractC25225BEi.A15(c26755Brc.A00));
        }
    }
}
