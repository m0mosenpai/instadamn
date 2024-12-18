package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.urlhandlers.directaccountthemepicker.DirectAccountThemePickerUrlHandlerActivity;
import go.Seq;

/* renamed from: X.MDs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50165MDs extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50165MDs(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean CIM;
        switch (this.A00) {
            case 0:
                C7IM c7im = ((C164197Wi) this.A01).A0M.A04;
                C14360o3.A07(c7im);
                return c7im;
            case 1:
                return ((C7Z7) ((C7XQ) this.A01).A0k.getValue()).A00;
            case 2:
                return AbstractC31176DnK.A0X((InterfaceC08830cm) this.A01);
            case 3:
                return ((C7XQ) this.A01).A0o.getValue();
            case 4:
                return Boolean.valueOf(AbstractC31174DnI.A0V((C7U0) AbstractC25226BEj.A1C(this.A01)).A0N.A08);
            case 5:
                return ((G4H) this.A01).A00.requireContext();
            case 6:
                return AbstractC31176DnK.A0V(((C32302EKp) this.A01).A0B);
            case 7:
                return AbstractC31176DnK.A0V(((KDM) this.A01).A0Q);
            case 8:
                C34476FHo c34476FHo = (C34476FHo) this.A01;
                if (c34476FHo != null) {
                    DirectAccountThemePickerUrlHandlerActivity directAccountThemePickerUrlHandlerActivity = c34476FHo.A00;
                    UserSession userSession = directAccountThemePickerUrlHandlerActivity.A01;
                    String str = directAccountThemePickerUrlHandlerActivity.A00;
                    C14360o3.A0B(userSession, 0);
                    AbstractC34073F2b.A00(directAccountThemePickerUrlHandlerActivity, userSession, "branded_chat_interstitial", "click", "cancel_button", str, null);
                    directAccountThemePickerUrlHandlerActivity.finish();
                    break;
                }
                break;
            case 9:
                AbstractC166987dD.A1Y(this.A01);
                break;
            case 10:
                InterfaceC50459MPn interfaceC50459MPn = ((C45481KBt) this.A01).A0D;
                if (interfaceC50459MPn != null) {
                    interfaceC50459MPn.Dl5();
                    break;
                }
                break;
            case 11:
                return C137756Lx.A03.A01((UserSession) this.A01, EnumC132075xi.A0F).A01;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new C7F3(((C35007Fbe) this.A01).A02);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((G4W) this.A01).A05, 36316628547277354L);
            case 14:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((G4W) this.A01).A05, 36316628547342891L);
            case Process.SIGTERM /* 15 */:
            case 16:
            case 18:
                return AbstractC31172DnG.A0y((InterfaceC08830cm) this.A01);
            case 17:
                return ((InterfaceC08830cm) this.A01).get();
            case Process.SIGSTOP /* 19 */:
                return new C159447Df((UserSession) this.A01);
            case 20:
                return new C7K7((UserSession) this.A01);
            case 21:
                return new L7C((UserSession) this.A01);
            case 22:
                LF7 lf7 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx = lf7.A01;
                if (!lf7.A0S) {
                    return interfaceC50520MRx.Ad1(lf7.A00);
                }
                return null;
            case 23:
                LF7 lf72 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx2 = lf72.A01;
                if (!lf72.A0S) {
                    return interfaceC50520MRx2.Ad2(lf72.A00);
                }
                return null;
            case 24:
                LF7 lf73 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx3 = lf73.A01;
                boolean z = lf73.A0S;
                int i = lf73.A00;
                if (z) {
                    return interfaceC50520MRx3.Bn3(i);
                }
                return interfaceC50520MRx3.Ad4(i);
            case 25:
                LF7 lf74 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx4 = lf74.A01;
                boolean z2 = lf74.A0S;
                int i2 = lf74.A00;
                if (z2) {
                    return interfaceC50520MRx4.Bn6(i2);
                }
                return interfaceC50520MRx4.Ad6(i2);
            case 26:
                LF7 lf75 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx5 = lf75.A01;
                boolean z3 = lf75.A0S;
                int i3 = lf75.A00;
                if (z3) {
                    return interfaceC50520MRx5.BnE(i3);
                }
                return interfaceC50520MRx5.BDC(i3);
            case 27:
                LF7 lf76 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx6 = lf76.A01;
                boolean z4 = lf76.A0S;
                int i4 = lf76.A00;
                if (z4) {
                    return interfaceC50520MRx6.BnH(i4);
                }
                return Integer.valueOf(interfaceC50520MRx6.BSk(i4));
            case 28:
                LF7 lf77 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx7 = lf77.A01;
                boolean z5 = lf77.A0S;
                int i5 = lf77.A00;
                if (z5) {
                    return String.valueOf(interfaceC50520MRx7.BnJ(i5));
                }
                return interfaceC50520MRx7.BSx(i5);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                LF7 lf78 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx8 = lf78.A01;
                boolean z6 = lf78.A0S;
                int i6 = lf78.A00;
                if (z6) {
                    return interfaceC50520MRx8.BnM(i6);
                }
                return interfaceC50520MRx8.Bdo(i6);
            case 30:
                LF7 lf79 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx9 = lf79.A01;
                boolean z7 = lf79.A0S;
                int i7 = lf79.A00;
                if (z7) {
                    return interfaceC50520MRx9.BnN(i7);
                }
                return interfaceC50520MRx9.Ad5(i7);
            case 31:
                LF7 lf710 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx10 = lf710.A01;
                boolean z8 = lf710.A0S;
                int i8 = lf710.A00;
                if (z8) {
                    return interfaceC50520MRx10.Bn4(i8);
                }
                return interfaceC50520MRx10.Bfp(i8);
            case 32:
                LF7 lf711 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx11 = lf711.A01;
                boolean z9 = lf711.A0S;
                int i9 = lf711.A00;
                if (z9) {
                    return interfaceC50520MRx11.Bn5(i9);
                }
                return interfaceC50520MRx11.Bg0(i9);
            case 33:
                LF7 lf712 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx12 = lf712.A01;
                boolean z10 = lf712.A0S;
                int i10 = lf712.A00;
                if (z10) {
                    return interfaceC50520MRx12.BnK(i10);
                }
                return interfaceC50520MRx12.C5u(i10);
            case 34:
                LF7 lf713 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx13 = lf713.A01;
                boolean z11 = lf713.A0S;
                int i11 = lf713.A00;
                if (z11) {
                    return interfaceC50520MRx13.BnU(i11);
                }
                return interfaceC50520MRx13.CIA(i11);
            case 35:
                LF7 lf714 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx14 = lf714.A01;
                boolean z12 = lf714.A0S;
                int i12 = lf714.A00;
                if (z12) {
                    return interfaceC50520MRx14.BnW(i12);
                }
                return interfaceC50520MRx14.CID(i12);
            case 36:
                LF7 lf715 = (LF7) this.A01;
                return lf715.A01.CIE(lf715.A00);
            case 37:
                LF7 lf716 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx15 = lf716.A01;
                boolean z13 = lf716.A0S;
                int i13 = lf716.A00;
                if (z13) {
                    return interfaceC50520MRx15.BnY(i13);
                }
                return interfaceC50520MRx15.CIH(i13);
            case 38:
                LF7 lf717 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx16 = lf717.A01;
                boolean z14 = lf717.A0S;
                int i14 = lf717.A00;
                if (z14) {
                    return interfaceC50520MRx16.BnZ(i14);
                }
                return interfaceC50520MRx16.CII(i14);
            case 39:
                LF7 lf718 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx17 = lf718.A01;
                boolean z15 = lf718.A0S;
                int i15 = lf718.A00;
                if (z15) {
                    return interfaceC50520MRx17.Bna(i15);
                }
                return interfaceC50520MRx17.CIJ(i15);
            case 40:
                LF7 lf719 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx18 = lf719.A01;
                boolean z16 = lf719.A0S;
                int i16 = lf719.A00;
                if (z16) {
                    return interfaceC50520MRx18.Bnb(i16);
                }
                return interfaceC50520MRx18.CIK(i16);
            case Seq.NULL_REFNUM /* 41 */:
                LF7 lf720 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx19 = lf720.A01;
                boolean z17 = lf720.A0S;
                int i17 = lf720.A00;
                if (z17) {
                    return interfaceC50520MRx19.Bnc(i17);
                }
                return interfaceC50520MRx19.CIL(i17);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                LF7 lf721 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx20 = lf721.A01;
                boolean z18 = lf721.A0S;
                int i18 = lf721.A00;
                if (z18) {
                    CIM = interfaceC50520MRx20.Bnd(i18);
                } else {
                    CIM = interfaceC50520MRx20.CIM(i18);
                }
                return Boolean.valueOf(CIM);
            case 43:
                LF7 lf722 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx21 = lf722.A01;
                boolean z19 = lf722.A0S;
                int i19 = lf722.A00;
                if (z19) {
                    return interfaceC50520MRx21.Bne(i19);
                }
                return interfaceC50520MRx21.CIN(i19);
            case 44:
                LF7 lf723 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx22 = lf723.A01;
                boolean z20 = lf723.A0S;
                int i20 = lf723.A00;
                if (z20) {
                    return interfaceC50520MRx22.Bnf(i20);
                }
                return interfaceC50520MRx22.CIO(i20);
            case 45:
                LF7 lf724 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx23 = lf724.A01;
                boolean z21 = lf724.A0S;
                int i21 = lf724.A00;
                if (z21) {
                    return interfaceC50520MRx23.Bng(i21);
                }
                return interfaceC50520MRx23.CIP(i21);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                LF7 lf725 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx24 = lf725.A01;
                boolean z22 = lf725.A0S;
                int i22 = lf725.A00;
                if (z22) {
                    return interfaceC50520MRx24.Bnh(i22);
                }
                return interfaceC50520MRx24.CIQ(i22);
            case 47:
                LF7 lf726 = (LF7) this.A01;
                InterfaceC50520MRx interfaceC50520MRx25 = lf726.A01;
                boolean z23 = lf726.A0S;
                int i23 = lf726.A00;
                if (z23) {
                    return interfaceC50520MRx25.Bnj(i23);
                }
                return interfaceC50520MRx25.CIS(i23);
            case 48:
                return AbstractC31179DnN.A04(this.A01).getString("DirectThreadInviteLinkSettingsFragment.BROADCAST_CHAT_CREATOR_ID");
            default:
                return AbstractC31174DnI.A0n(AbstractC31179DnN.A04(this.A01), "DirectThreadInviteLinkSettingsFragment.ARGUMENT_GROUP_INVITE_FORCE_DISABLE_TOGGLE");
        }
        return C0eB.A00;
    }
}
