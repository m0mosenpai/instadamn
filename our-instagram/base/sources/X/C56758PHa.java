package X;

import com.instagram.common.session.UserSession;
import instagram.features.clips.edit.ClipsEditMetadataController;

/* renamed from: X.PHa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56758PHa implements InterfaceC1119153d {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C56758PHa(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        Integer num;
        switch (this.A00) {
            case 0:
                if (!((C8Y5) this.A02).A00) {
                    return;
                }
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 1:
                boolean A0C = AbstractC46542Bs.A00((UserSession) this.A02).A0C();
                InterfaceC57990Pna interfaceC57990Pna = ((C54729OFg) this.A01).A08;
                if (interfaceC57990Pna == null) {
                    return;
                }
                interfaceC57990Pna.afterSelection(A0C);
                return;
            case 2:
                C3DO c3do = C3DN.A00;
                C48755LhN c48755LhN = (C48755LhN) this.A02;
                C3DN A00 = c3do.A00(c48755LhN.A00);
                if (A00 != null) {
                    num = ((C3DP) A00).A0K;
                } else {
                    num = null;
                }
                if (num != C05F.A0u) {
                    return;
                }
                c48755LhN.DW0((L5X) this.A01);
                return;
            case 3:
                N51 n51 = (N51) this.A02;
                if (n51.A0E != null) {
                    AbstractC12990ll A0o = AbstractC166987dD.A0o(n51.A0F);
                    String valueOf = String.valueOf(n51.A0E);
                    AbstractC167017dG.A1N(A0o, valueOf);
                    C35191Ffj.A00(A0o, "upsell_screen_dismissed", valueOf);
                }
                InterfaceC58134Ppx interfaceC58134Ppx = (InterfaceC58134Ppx) this.A01;
                if (interfaceC58134Ppx == null) {
                    return;
                }
                interfaceC58134Ppx.getDismissAction();
                return;
            case 4:
                NMX nmx = (NMX) this.A02;
                InterfaceC09390do interfaceC09390do = nmx.A0W;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                C130135uJ c130135uJ = (C130135uJ) this.A01;
                boolean z = c130135uJ.A00;
                String valueOf2 = String.valueOf(c130135uJ.A02);
                nmx.requireContext();
                C131975xX c131975xX = C131965xW.A05;
                C131975xX.A00(AbstractC166987dD.A0r(interfaceC09390do));
                AbstractC130145uK.A02(A0r, "default_privacy_consent_bottomsheet_dismiss_click", valueOf2, null, "video_feed", String.valueOf(c130135uJ.A01), z, C196218mC.A00(AbstractC166987dD.A0r(interfaceC09390do)), c130135uJ.A05);
                if (!C131975xX.A02(c130135uJ) || c130135uJ.A00) {
                    return;
                }
                NMX.A04(c130135uJ, nmx);
                C131965xW A002 = C131975xX.A00(AbstractC166987dD.A0r(interfaceC09390do));
                nmx.requireActivity();
                A002.A07(nmx.requireContext(), "video_feed");
                return;
            case 5:
            default:
                return;
            case 6:
                if (!((C14510oO) this.A01).A00) {
                    return;
                }
                C26823Bsl.A02((C26823Bsl) this.A02);
                return;
        }
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
        EnumC76383bi enumC76383bi;
        switch (this.A00) {
            case 5:
                if (((C14510oO) this.A01).A00) {
                    return;
                }
                C55196Oe3.A04((C55196Oe3) this.A02, "DISMISSAL");
                return;
            case 6:
            default:
                return;
            case 7:
                ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A02;
                Object A02 = MSW.A0X(clipsEditMetadataController.A18).A00.A02();
                C38321qM c38321qM = (C38321qM) this.A01;
                if (c38321qM != null) {
                    enumC76383bi = c38321qM.A1x();
                } else {
                    enumC76383bi = null;
                }
                if (A02 == enumC76383bi) {
                    return;
                }
                clipsEditMetadataController.A0T = true;
                ClipsEditMetadataController.A0C(clipsEditMetadataController);
                return;
        }
    }
}
