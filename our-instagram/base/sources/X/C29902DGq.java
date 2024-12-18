package X;

import android.util.SparseArray;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.DGq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29902DGq extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29902DGq(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C51762Yz A00(C76223bS c76223bS, Object obj, int i) {
        return AbstractC77073ct.A00(c76223bS, new C29902DGq(obj, i));
    }

    public static C29902DGq A01(Object obj, int i) {
        return new C29902DGq(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        UserSession userSession;
        int integer;
        String str;
        InterfaceC31137Dmc interfaceC31137Dmc;
        C120985dq c120985dq;
        C38321qM c38321qM;
        InterfaceC30968DjP interfaceC30968DjP;
        C75113Zb c75113Zb;
        switch (this.A00) {
            case 0:
                return this.A01;
            case 1:
                C40971v4 c40971v4 = ((C26512BnX) this.A01).A01;
                return new C139366Sr(c40971v4.A0S, c40971v4.A0j).EqO();
            case 2:
                ((C26622BpJ) this.A01).A01.A08();
                return C0eB.A00;
            case 3:
                ((C26622BpJ) this.A01).A01.A03();
                return C0eB.A00;
            case 4:
                ((C2K) this.A01).reset();
                return C0eB.A00;
            case 5:
                ((AbstractC127345pD) this.A01).A02 = null;
                return C0eB.A00;
            case 6:
                ((C26622BpJ) this.A01).A04.A02 = null;
                return C0eB.A00;
            case 7:
                ((C2K) this.A01).A03 = null;
                return C0eB.A00;
            case 8:
                C29375Cx8 c29375Cx8 = ((C26622BpJ) this.A01).A04;
                C138746Qe c138746Qe = c29375Cx8.A00;
                if (c138746Qe != null) {
                    c138746Qe.A07();
                }
                c29375Cx8.A00 = null;
                c29375Cx8.A04 = null;
                c29375Cx8.A08.A00(false);
                return C0eB.A00;
            case 9:
                ((C26622BpJ) this.A01).A04.A01 = null;
                return C0eB.A00;
            case 10:
                C25370BKn c25370BKn = (C25370BKn) this.A01;
                if (c25370BKn != null) {
                    c25370BKn.A04 = null;
                }
                return C0eB.A00;
            case 11:
                C139416Sw c139416Sw = new C139416Sw(((C26622BpJ) this.A01).A03);
                SparseArray sparseArray = new SparseArray();
                sparseArray.put(R.id.showreel_config_provider, c139416Sw);
                return sparseArray;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                AnonymousClass634.A08((C6FG) this.A01);
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return AbstractC25225BEi.A0f(A01(this.A01, 12));
            case 14:
                C131565ws c131565ws = ((C2K) this.A01).A01;
                if (c131565ws != null) {
                    return c131565ws.findViewWithTag("showreel_composition_video_view_tag");
                }
                return null;
            case Process.SIGTERM /* 15 */:
                ((C25732BYs) this.A01).setInfoText(null);
                return C0eB.A00;
            case 16:
                ((C25732BYs) this.A01).setBorderEnabled(false);
                return C0eB.A00;
            case 17:
                ((C25732BYs) this.A01).setBorderColor(-16776961);
                return C0eB.A00;
            case 18:
                return new CUI((UserSession) this.A01);
            case Process.SIGSTOP /* 19 */:
                return ((BM2) this.A01).A01.A01(C27951CTn.class, DCZ.A00);
            case 20:
                userSession = ((BM1) this.A01).A01;
                return AbstractC124495k7.A00(userSession);
            case 21:
                userSession = (UserSession) this.A01;
                return AbstractC124495k7.A00(userSession);
            case 22:
                userSession = ((C25405BLw) this.A01).A00;
                return AbstractC124495k7.A00(userSession);
            case 23:
                userSession = ((C25407BLy) this.A01).A02;
                return AbstractC124495k7.A00(userSession);
            case 24:
                return ((C15370ps) this.A01).A00;
            case 25:
                C76223bS c76223bS = (C76223bS) this.A01;
                C14360o3.A0B(c76223bS, 0);
                C2XH BoZ = c76223bS.BoZ();
                C2XF c2xf = BoZ.A02;
                Number number = (Number) ((C2XG) c2xf).A00.A02(Integer.valueOf(R.integer.clips_viewer_ghost_page_shimmer_animation_duration));
                if (number != null) {
                    integer = number.intValue();
                } else {
                    integer = BoZ.A01.getInteger(R.integer.clips_viewer_ghost_page_shimmer_animation_duration);
                    c2xf.A00(R.integer.clips_viewer_ghost_page_shimmer_animation_duration, Integer.valueOf(integer));
                }
                long j = integer;
                C167847ee c167847ee = new C167847ee();
                c167847ee.A05(AbstractC25228BEl.A09(c76223bS, R.color.baseline_neutral_80));
                int A09 = AbstractC25228BEl.A09(c76223bS, R.color.primary_text_disabled_material_dark);
                C84793qT c84793qT = c167847ee.A00;
                c84793qT.A09 = A09;
                c84793qT.A06 = 0;
                c167847ee.A04(j);
                c84793qT.A03 = 0.0f;
                C84793qT A01 = c167847ee.A01();
                C14360o3.A07(A01);
                return A01;
            case 26:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 30:
            default:
                return Integer.valueOf(((CUJ) this.A01).A00);
            case 31:
                C26591Boo c26591Boo = (C26591Boo) this.A01;
                CR0 cr0 = c26591Boo.A09;
                if (cr0 != null) {
                    cr0.A01.remove(Integer.valueOf(c26591Boo.A00));
                }
                return C0eB.A00;
            case 32:
                C26574BoX c26574BoX = (C26574BoX) this.A01;
                C120985dq c120985dq2 = c26574BoX.A00;
                Integer A00 = C71113Gx.A00(Integer.valueOf(c120985dq2.A03().A00));
                if (A00 == null) {
                    A00 = C05F.A00;
                }
                C37644Ghd c37644Ghd = c26574BoX.A01;
                int i = c37644Ghd.A09.A01;
                UserSession userSession2 = c26574BoX.A02;
                if (C18U.A06(AbstractC25228BEl.A0l(userSession2), userSession2, 36319209827867742L)) {
                    str = AbstractC43591JPw.A00(203);
                } else {
                    str = "see_more";
                }
                c26574BoX.A04.DJf(c120985dq2, c37644Ghd, c26574BoX.A03, A00, str, i);
                return C0eB.A00;
            case 33:
                C75113Zb c75113Zb2 = ((C26574BoX) this.A01).A01.A0E;
                if (c75113Zb2 != null) {
                    c75113Zb2.A2J = true;
                }
                return C0eB.A00;
            case 34:
                return AbstractC80603ip.A00(((C76223bS) this.A01).A05.A0C, 32);
            case 35:
            case 36:
                ((BVR) this.A01).setCurrentIndex(0);
                return C0eB.A00;
            case 37:
                ((AbstractC27080Bx4) this.A01).A0H();
                return C0eB.A00;
            case 38:
                return new C25634BUw(new C2XE(((AbstractC25398BLp) this.A01).A06), false);
            case 39:
                return ((C2XI) this.A01).A00;
            case 40:
                return AbstractC25226BEj.A1C(this.A01);
            case Seq.NULL_REFNUM /* 41 */:
                return Integer.valueOf(((C26459Bmg) this.A01).A00);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new D1L((C77123cy) this.A01);
            case 43:
                C26460Bmh c26460Bmh = (C26460Bmh) this.A01;
                c26460Bmh.A02.D14(c26460Bmh.A00, c26460Bmh.A01);
                return C0eB.A00;
            case 44:
                C26585Boi c26585Boi = (C26585Boi) this.A01;
                interfaceC31137Dmc = c26585Boi.A01;
                if (interfaceC31137Dmc != null) {
                    c120985dq = c26585Boi.A00;
                    interfaceC31137Dmc.DWG(c120985dq);
                }
                return C0eB.A00;
            case 45:
                AbstractC25233BEq.A1C((C77123cy) this.A01);
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C26476Bmx c26476Bmx = (C26476Bmx) this.A01;
                c38321qM = c26476Bmx.A00.A02;
                if (c38321qM != null) {
                    interfaceC30968DjP = c26476Bmx.A02;
                    c75113Zb = c26476Bmx.A01;
                    interfaceC30968DjP.Dlq(c38321qM, c75113Zb);
                }
                return C0eB.A00;
            case 47:
                C25581BSt c25581BSt = (C25581BSt) this.A01;
                interfaceC31137Dmc = c25581BSt.A01;
                if (interfaceC31137Dmc != null) {
                    c120985dq = c25581BSt.A00;
                    interfaceC31137Dmc.DWG(c120985dq);
                }
                return C0eB.A00;
            case 48:
                C26439BmM c26439BmM = (C26439BmM) this.A01;
                c26439BmM.A02.DbV(c26439BmM.A00, c26439BmM.A01);
                return C0eB.A00;
            case 49:
                C26494BnF c26494BnF = (C26494BnF) this.A01;
                c38321qM = c26494BnF.A00.A02;
                if (c38321qM != null) {
                    interfaceC30968DjP = c26494BnF.A02;
                    c75113Zb = c26494BnF.A01;
                    interfaceC30968DjP.Dlq(c38321qM, c75113Zb);
                }
                return C0eB.A00;
        }
    }
}
