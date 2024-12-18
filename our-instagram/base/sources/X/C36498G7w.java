package X;

import android.content.Context;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.G7w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36498G7w implements GZA {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C36498G7w(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.GZA
    public final void onActionClicked() {
        String str;
        switch (this.A00) {
            case 0:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 1:
                C12260kU.A0G((Context) this.A01, AbstractC08820cl.A03("https://help.instagram.com/963211828280354?helpref=faq_content"));
                return;
            default:
                FLM flm = ((C34467FHf) this.A02).A00;
                if (flm != null) {
                    ENN enn = flm.A00;
                    InterfaceC09390do interfaceC09390do = enn.A0L;
                    interfaceC09390do.getValue();
                    INH A0C = AbstractC86593tX.A0C(C22P.A1y);
                    A0C.A0z = true;
                    A0C.A0n = true;
                    A0C.A01(C128535rM.A00);
                    A0C.A01(C208509Kk.A00);
                    A0C.A01(C81S.A00);
                    AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
                    C6XJ A02 = C6XJ.A02(enn.requireActivity(), A0C.A00(), A0o, TransparentModalActivity.class, "clips_camera");
                    AbstractC31179DnN.A1S(A02);
                    AbstractC31172DnG.A1M(enn, A02);
                    Long l = flm.A02;
                    if (l != null) {
                        AbstractC12990ll A0o2 = AbstractC166987dD.A0o(interfaceC09390do);
                        if (enn.A0B) {
                            str = "collaborators_bottomsheet_reels";
                        } else {
                            str = "collaborators_bottomsheet_feed";
                        }
                        AbstractC31179DnN.A1M(AbstractC31176DnK.A0L(enn, A0o2), l, "ig_collaborator_bottom_sheet_education_banner_cta_tap", str);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // X.GZA
    public final void onBannerDismissed() {
        String str;
        switch (this.A00) {
            case 0:
                AbstractC166987dD.A1Y(this.A02);
                return;
            case 1:
                AbstractC167007dF.A17(((C31324Dpm) this.A02).A01.A00.ARD(), "ai_studio_privacy_banner_dismiss");
                return;
            default:
                ((C34468FHg) this.A01).A00.setVisibility(8);
                FLM flm = ((C34467FHf) this.A02).A00;
                if (flm != null) {
                    ENN enn = flm.A00;
                    InterfaceC09390do interfaceC09390do = enn.A0L;
                    C23031Ai A0l = AbstractC25230BEn.A0l(interfaceC09390do);
                    AbstractC167007dF.A1L(A0l, A0l.A0k, C23031Ai.A8c, 95, true);
                    C32403EPe c32403EPe = flm.A01;
                    c32403EPe.A07 = false;
                    c32403EPe.A0C();
                    Long l = flm.A02;
                    if (l != null) {
                        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
                        if (enn.A0B) {
                            str = "collaborators_bottomsheet_reels";
                        } else {
                            str = "collaborators_bottomsheet_feed";
                        }
                        AbstractC31179DnN.A1M(AbstractC31172DnG.A0Q(enn, A0o, 0), l, "ig_collaborator_bottom_sheet_education_banner_dismiss", str);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
