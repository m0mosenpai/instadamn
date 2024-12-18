package X;

import android.view.View;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes5.dex */
public final class DRV extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean onTouch;
        InterfaceC31162Dn6 interfaceC31162Dn6;
        BPP bpp;
        int i;
        C120985dq c120985dq;
        InterfaceC30862Dhb interfaceC30862Dhb;
        InterfaceC31162Dn6 interfaceC31162Dn62;
        C120985dq c120985dq2;
        BPP bpp2;
        int i2;
        InterfaceC31137Dmc interfaceC31137Dmc;
        C120985dq c120985dq3;
        C37644Ghd c37644Ghd;
        BQL bql;
        InterfaceC31137Dmc interfaceC31137Dmc2;
        C120985dq c120985dq4;
        int A06;
        BQL bql2;
        C75113Zb c75113Zb;
        switch (this.A00) {
            case 0:
            case 1:
                onTouch = ((C14510oO) this.A01).A00;
                return Boolean.valueOf(onTouch);
            case 2:
                C2YJ A0Z = AbstractC25235BEs.A0Z(obj);
                View.OnClickListener onClickListener = (View.OnClickListener) this.A01;
                if (onClickListener != null) {
                    onClickListener.onClick(A0Z.A00);
                }
                return C0eB.A00;
            case 3:
                C2XB c2xb = (C2XB) obj;
                onTouch = false;
                C14360o3.A0B(c2xb, 0);
                ((C130735vM) this.A01).A00(c2xb.A00, c2xb.A01);
                return Boolean.valueOf(onTouch);
            case 4:
                C2YJ A0Z2 = AbstractC25235BEs.A0Z(obj);
                InterfaceC16660sJ interfaceC16660sJ = ((C26501BnM) this.A01).A02;
                View view = A0Z2.A00;
                C14360o3.A06(view);
                interfaceC16660sJ.invoke(view);
                return C0eB.A00;
            case 5:
                onTouch = false;
                C14360o3.A0B(obj, 0);
                return Boolean.valueOf(onTouch);
            case 6:
                C26495BnG c26495BnG = (C26495BnG) this.A01;
                interfaceC31137Dmc2 = c26495BnG.A05;
                c120985dq4 = c26495BnG.A01;
                C37644Ghd c37644Ghd2 = c26495BnG.A02;
                interfaceC31137Dmc2.DsU(c120985dq4, c37644Ghd2);
                A06 = c37644Ghd2.A06();
                bql2 = BQL.A0l;
                interfaceC31137Dmc2.Ciq(EnumC120795dP.A0h, bql2, c120985dq4, null, A06);
                return C0eB.A00;
            case 7:
                C26495BnG c26495BnG2 = (C26495BnG) this.A01;
                interfaceC31137Dmc = c26495BnG2.A05;
                c120985dq3 = c26495BnG2.A01;
                c37644Ghd = c26495BnG2.A02;
                bql = BQL.A0l;
                interfaceC31137Dmc.Cip(EnumC120795dP.A0h, bql, c120985dq3, c37644Ghd, null);
                return C0eB.A00;
            case 8:
                C26495BnG c26495BnG3 = (C26495BnG) this.A01;
                interfaceC31137Dmc2 = c26495BnG3.A05;
                c120985dq4 = c26495BnG3.A01;
                C37644Ghd c37644Ghd3 = c26495BnG3.A02;
                interfaceC31137Dmc2.D7i(c26495BnG3.A00, ClipsViewerSource.A29, c120985dq4, c37644Ghd3, c26495BnG3.A03);
                A06 = c37644Ghd3.A06();
                bql2 = BQL.A0Z;
                interfaceC31137Dmc2.Ciq(EnumC120795dP.A0h, bql2, c120985dq4, null, A06);
                return C0eB.A00;
            case 9:
            case 11:
                C26495BnG c26495BnG4 = (C26495BnG) this.A01;
                interfaceC31137Dmc = c26495BnG4.A05;
                c120985dq3 = c26495BnG4.A01;
                c37644Ghd = c26495BnG4.A02;
                bql = BQL.A0Z;
                interfaceC31137Dmc.Cip(EnumC120795dP.A0h, bql, c120985dq3, c37644Ghd, null);
                return C0eB.A00;
            case 10:
                C26495BnG c26495BnG5 = (C26495BnG) this.A01;
                interfaceC31137Dmc2 = c26495BnG5.A05;
                c120985dq4 = c26495BnG5.A01;
                C37644Ghd c37644Ghd4 = c26495BnG5.A02;
                interfaceC31137Dmc2.D7i(c26495BnG5.A00, ClipsViewerSource.A2H, c120985dq4, c37644Ghd4, c26495BnG5.A03);
                A06 = c37644Ghd4.A06();
                bql2 = BQL.A0Z;
                interfaceC31137Dmc2.Ciq(EnumC120795dP.A0h, bql2, c120985dq4, null, A06);
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C26495BnG c26495BnG6 = (C26495BnG) this.A01;
                interfaceC31137Dmc2 = c26495BnG6.A05;
                c120985dq4 = c26495BnG6.A01;
                interfaceC31137Dmc2.D8e(c120985dq4);
                A06 = c26495BnG6.A02.A06();
                bql2 = BQL.A0a;
                interfaceC31137Dmc2.Ciq(EnumC120795dP.A0h, bql2, c120985dq4, null, A06);
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C26495BnG c26495BnG7 = (C26495BnG) this.A01;
                interfaceC31137Dmc = c26495BnG7.A05;
                c120985dq3 = c26495BnG7.A01;
                c37644Ghd = c26495BnG7.A02;
                bql = BQL.A0a;
                interfaceC31137Dmc.Cip(EnumC120795dP.A0h, bql, c120985dq3, c37644Ghd, null);
                return C0eB.A00;
            case 14:
                C26495BnG c26495BnG8 = (C26495BnG) this.A01;
                interfaceC31137Dmc2 = c26495BnG8.A05;
                c120985dq4 = c26495BnG8.A01;
                C37644Ghd c37644Ghd5 = c26495BnG8.A02;
                interfaceC31137Dmc2.D8g(c120985dq4, c37644Ghd5);
                A06 = c37644Ghd5.A06();
                bql2 = BQL.A12;
                interfaceC31137Dmc2.Ciq(EnumC120795dP.A0h, bql2, c120985dq4, null, A06);
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                C26495BnG c26495BnG9 = (C26495BnG) this.A01;
                interfaceC31137Dmc = c26495BnG9.A05;
                c120985dq3 = c26495BnG9.A01;
                c37644Ghd = c26495BnG9.A02;
                bql = BQL.A12;
                interfaceC31137Dmc.Cip(EnumC120795dP.A0h, bql, c120985dq3, c37644Ghd, null);
                return C0eB.A00;
            case 16:
                C26495BnG c26495BnG10 = (C26495BnG) this.A01;
                interfaceC31137Dmc2 = c26495BnG10.A05;
                c120985dq4 = c26495BnG10.A01;
                C37644Ghd c37644Ghd6 = c26495BnG10.A02;
                interfaceC31137Dmc2.DML(c120985dq4, c37644Ghd6);
                A06 = c37644Ghd6.A06();
                bql2 = BQL.A0k;
                interfaceC31137Dmc2.Ciq(EnumC120795dP.A0h, bql2, c120985dq4, null, A06);
                return C0eB.A00;
            case 17:
            case 18:
                C26495BnG c26495BnG11 = (C26495BnG) this.A01;
                InterfaceC31137Dmc interfaceC31137Dmc3 = c26495BnG11.A05;
                C120985dq c120985dq5 = c26495BnG11.A01;
                C37644Ghd c37644Ghd7 = c26495BnG11.A02;
                interfaceC31137Dmc3.D68(null, c120985dq5, c37644Ghd7, null, false);
                interfaceC31137Dmc3.Ciq(EnumC120795dP.A0h, BQL.A0X, c120985dq5, null, c37644Ghd7.A06());
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                View view2 = (View) obj;
                C14360o3.A0B(view2, 0);
                C26495BnG c26495BnG12 = (C26495BnG) this.A01;
                InterfaceC31137Dmc interfaceC31137Dmc4 = c26495BnG12.A05;
                C120985dq c120985dq6 = c26495BnG12.A01;
                C37644Ghd c37644Ghd8 = c26495BnG12.A02;
                interfaceC31137Dmc4.DlM(view2, c120985dq6, c37644Ghd8, null, false);
                interfaceC31137Dmc4.Ciq(EnumC120795dP.A0h, BQL.A0X, c120985dq6, null, c37644Ghd8.A06());
                return C0eB.A00;
            case 20:
            case 22:
                C26495BnG c26495BnG13 = (C26495BnG) this.A01;
                interfaceC31137Dmc = c26495BnG13.A05;
                c120985dq3 = c26495BnG13.A01;
                c37644Ghd = c26495BnG13.A02;
                bql = BQL.A0X;
                interfaceC31137Dmc.Cip(EnumC120795dP.A0h, bql, c120985dq3, c37644Ghd, null);
                return C0eB.A00;
            case 21:
                C26495BnG c26495BnG14 = (C26495BnG) this.A01;
                InterfaceC31137Dmc interfaceC31137Dmc5 = c26495BnG14.A05;
                C120985dq c120985dq7 = c26495BnG14.A01;
                C37644Ghd c37644Ghd9 = c26495BnG14.A02;
                interfaceC31137Dmc5.DOx(null, c120985dq7, c37644Ghd9, false);
                interfaceC31137Dmc5.Ciq(EnumC120795dP.A0h, BQL.A0X, c120985dq7, null, c37644Ghd9.A06());
                return C0eB.A00;
            case 23:
                C26495BnG c26495BnG15 = (C26495BnG) this.A01;
                interfaceC31137Dmc2 = c26495BnG15.A05;
                c120985dq4 = c26495BnG15.A01;
                interfaceC31137Dmc2.Dck(c120985dq4);
                A06 = c26495BnG15.A02.A06();
                bql2 = BQL.A0y;
                interfaceC31137Dmc2.Ciq(EnumC120795dP.A0h, bql2, c120985dq4, null, A06);
                return C0eB.A00;
            case 24:
                C26495BnG c26495BnG16 = (C26495BnG) this.A01;
                interfaceC31137Dmc = c26495BnG16.A05;
                c120985dq3 = c26495BnG16.A01;
                c37644Ghd = c26495BnG16.A02;
                bql = BQL.A0y;
                interfaceC31137Dmc.Cip(EnumC120795dP.A0h, bql, c120985dq3, c37644Ghd, null);
                return C0eB.A00;
            case 25:
                C26495BnG c26495BnG17 = (C26495BnG) this.A01;
                interfaceC31137Dmc2 = c26495BnG17.A05;
                c120985dq4 = c26495BnG17.A01;
                C37644Ghd c37644Ghd10 = c26495BnG17.A02;
                interfaceC31137Dmc2.Djo(c120985dq4, c37644Ghd10, c26495BnG17.A03);
                A06 = c37644Ghd10.A06();
                bql2 = BQL.A04;
                interfaceC31137Dmc2.Ciq(EnumC120795dP.A0h, bql2, c120985dq4, null, A06);
                return C0eB.A00;
            case 26:
                C26495BnG c26495BnG18 = (C26495BnG) this.A01;
                interfaceC31137Dmc = c26495BnG18.A05;
                c120985dq3 = c26495BnG18.A01;
                c37644Ghd = c26495BnG18.A02;
                bql = BQL.A04;
                interfaceC31137Dmc.Cip(EnumC120795dP.A0h, bql, c120985dq3, c37644Ghd, null);
                return C0eB.A00;
            case 27:
                C26495BnG c26495BnG19 = (C26495BnG) this.A01;
                C120985dq c120985dq8 = c26495BnG19.A01;
                C38321qM c38321qM = c120985dq8.A02;
                if (c38321qM != null && (c75113Zb = c26495BnG19.A02.A0E) != null) {
                    c26495BnG19.A05.C56().DwZ(c38321qM, c75113Zb);
                }
                c26495BnG19.A05.Ciq(EnumC120795dP.A0h, BQL.A19, c120985dq8, null, c26495BnG19.A02.A06());
                return C0eB.A00;
            case 28:
                C26495BnG c26495BnG20 = (C26495BnG) this.A01;
                interfaceC31137Dmc = c26495BnG20.A05;
                c120985dq3 = c26495BnG20.A01;
                c37644Ghd = c26495BnG20.A02;
                bql = BQL.A19;
                interfaceC31137Dmc.Cip(EnumC120795dP.A0h, bql, c120985dq3, c37644Ghd, null);
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C26495BnG c26495BnG21 = (C26495BnG) this.A01;
                interfaceC31137Dmc2 = c26495BnG21.A05;
                c120985dq4 = c26495BnG21.A01;
                C37644Ghd c37644Ghd11 = c26495BnG21.A02;
                interfaceC31137Dmc2.Dvj(c120985dq4, c37644Ghd11);
                A06 = c37644Ghd11.A06();
                bql2 = BQL.A0F;
                interfaceC31137Dmc2.Ciq(EnumC120795dP.A0h, bql2, c120985dq4, null, A06);
                return C0eB.A00;
            case 30:
                C26495BnG c26495BnG22 = (C26495BnG) this.A01;
                interfaceC31137Dmc = c26495BnG22.A05;
                c120985dq3 = c26495BnG22.A01;
                c37644Ghd = c26495BnG22.A02;
                bql = BQL.A0F;
                interfaceC31137Dmc.Cip(EnumC120795dP.A0h, bql, c120985dq3, c37644Ghd, null);
                return C0eB.A00;
            case 31:
                C26495BnG c26495BnG23 = (C26495BnG) this.A01;
                interfaceC31137Dmc2 = c26495BnG23.A05;
                c120985dq4 = c26495BnG23.A01;
                C37644Ghd c37644Ghd12 = c26495BnG23.A02;
                interfaceC31137Dmc2.Dvl(c120985dq4, c37644Ghd12);
                A06 = c37644Ghd12.A06();
                bql2 = BQL.A1R;
                interfaceC31137Dmc2.Ciq(EnumC120795dP.A0h, bql2, c120985dq4, null, A06);
                return C0eB.A00;
            case 32:
                C26495BnG c26495BnG24 = (C26495BnG) this.A01;
                interfaceC31137Dmc = c26495BnG24.A05;
                c120985dq3 = c26495BnG24.A01;
                c37644Ghd = c26495BnG24.A02;
                interfaceC31137Dmc.Dvk(c120985dq3, c37644Ghd);
                bql = BQL.A1R;
                interfaceC31137Dmc.Cip(EnumC120795dP.A0h, bql, c120985dq3, c37644Ghd, null);
                return C0eB.A00;
            case 33:
                C26495BnG c26495BnG25 = (C26495BnG) this.A01;
                interfaceC31137Dmc2 = c26495BnG25.A05;
                c120985dq4 = c26495BnG25.A01;
                C37644Ghd c37644Ghd13 = c26495BnG25.A02;
                interfaceC31137Dmc2.Dvv(c120985dq4, c37644Ghd13);
                A06 = c37644Ghd13.A06();
                bql2 = BQL.A0A;
                interfaceC31137Dmc2.Ciq(EnumC120795dP.A0h, bql2, c120985dq4, null, A06);
                return C0eB.A00;
            case 34:
                C26495BnG c26495BnG26 = (C26495BnG) this.A01;
                interfaceC31137Dmc = c26495BnG26.A05;
                c120985dq3 = c26495BnG26.A01;
                c37644Ghd = c26495BnG26.A02;
                bql = BQL.A0A;
                interfaceC31137Dmc.Cip(EnumC120795dP.A0h, bql, c120985dq3, c37644Ghd, null);
                return C0eB.A00;
            case 35:
                C26377BlM c26377BlM = (C26377BlM) this.A01;
                interfaceC31137Dmc = c26377BlM.A02;
                c120985dq3 = c26377BlM.A00;
                c37644Ghd = c26377BlM.A01;
                bql = BQL.A1G;
                interfaceC31137Dmc.Cip(EnumC120795dP.A0h, bql, c120985dq3, c37644Ghd, null);
                return C0eB.A00;
            case 36:
                C26414Blx c26414Blx = (C26414Blx) this.A01;
                interfaceC31137Dmc = c26414Blx.A02;
                c120985dq3 = c26414Blx.A00;
                c37644Ghd = c26414Blx.A01;
                bql = BQL.A1X;
                interfaceC31137Dmc.Cip(EnumC120795dP.A0h, bql, c120985dq3, c37644Ghd, null);
                return C0eB.A00;
            case 37:
                C26378BlN c26378BlN = (C26378BlN) this.A01;
                interfaceC31137Dmc = c26378BlN.A02;
                c120985dq3 = c26378BlN.A00;
                c37644Ghd = c26378BlN.A01;
                bql = BQL.A1Y;
                interfaceC31137Dmc.Cip(EnumC120795dP.A0h, bql, c120985dq3, c37644Ghd, null);
                return C0eB.A00;
            case 38:
                C26478Bmz c26478Bmz = (C26478Bmz) this.A01;
                interfaceC31162Dn62 = c26478Bmz.A04;
                c120985dq2 = c26478Bmz.A01;
                bpp2 = c26478Bmz.A03;
                i2 = c26478Bmz.A00;
                interfaceC31162Dn62.CK8(c120985dq2, bpp2, i2);
                return C0eB.A00;
            case 39:
                C26478Bmz c26478Bmz2 = (C26478Bmz) this.A01;
                interfaceC31162Dn6 = c26478Bmz2.A04;
                bpp = c26478Bmz2.A03;
                i = c26478Bmz2.A00;
                c120985dq = c26478Bmz2.A01;
                interfaceC30862Dhb = c26478Bmz2.A05;
                interfaceC31162Dn6.CKA(c120985dq, bpp, interfaceC30862Dhb, i);
                return C0eB.A00;
            case 40:
                C26415Bly c26415Bly = (C26415Bly) this.A01;
                InterfaceC31137Dmc interfaceC31137Dmc6 = c26415Bly.A00;
                C26243BjC c26243BjC = c26415Bly.A01;
                interfaceC31137Dmc6.CyG(c26243BjC.A00, c26243BjC.A01);
                return C0eB.A00;
            case Seq.NULL_REFNUM /* 41 */:
                C26415Bly c26415Bly2 = (C26415Bly) this.A01;
                c26415Bly2.A00.CyH(c26415Bly2.A01.A00);
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 47:
                ((C25317BIm) this.A01).A01();
                return C0eB.A00;
            case 43:
            case 48:
            default:
                ((C25317BIm) this.A01).A08.cancel();
                return C0eB.A00;
            case 44:
                BPR bpr = (BPR) this.A01;
                interfaceC31162Dn62 = bpr.A00;
                BPQ bpq = bpr.A01;
                c120985dq2 = bpq.A02;
                bpp2 = bpq.A05;
                i2 = bpq.A00;
                interfaceC31162Dn62.CK8(c120985dq2, bpp2, i2);
                return C0eB.A00;
            case 45:
                BPR bpr2 = (BPR) this.A01;
                interfaceC31162Dn6 = bpr2.A00;
                BPQ bpq2 = bpr2.A01;
                bpp = bpq2.A05;
                i = bpq2.A00;
                c120985dq = bpq2.A02;
                interfaceC30862Dhb = bpq2.A06;
                interfaceC31162Dn6.CKA(c120985dq, bpp, interfaceC30862Dhb, i);
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C26503BnO c26503BnO = (C26503BnO) this.A01;
                if (C18U.A06(C06090Tz.A05, c26503BnO.A02, 36328315153300939L)) {
                    InterfaceC31165Dn9 interfaceC31165Dn9 = c26503BnO.A04;
                    C26244BjD c26244BjD = c26503BnO.A05;
                    interfaceC31165Dn9.CKP(c26244BjD.A00, c26244BjD.A01, c26503BnO.A00, c26244BjD.A03);
                } else {
                    InterfaceC31137Dmc interfaceC31137Dmc7 = c26503BnO.A03;
                    C26244BjD c26244BjD2 = c26503BnO.A05;
                    interfaceC31137Dmc7.DnW(c26244BjD2.A00, c26244BjD2.A01, c26503BnO.A00);
                }
                return C0eB.A00;
            case 49:
                C2XB A0k = AbstractC25228BEl.A0k(obj);
                onTouch = ((View.OnTouchListener) this.A01).onTouch(A0k.A01, A0k.A00);
                return Boolean.valueOf(onTouch);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DRV(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    public static DRV A00(Object obj, int i) {
        return new DRV(obj, i);
    }
}
