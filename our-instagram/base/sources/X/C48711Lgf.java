package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.Lgf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48711Lgf implements InterfaceC50459MPn {
    public final /* synthetic */ KDM A00;
    public final /* synthetic */ DirectThreadThemeInfo A01;

    public C48711Lgf(KDM kdm, DirectThreadThemeInfo directThreadThemeInfo) {
        this.A00 = kdm;
        this.A01 = directThreadThemeInfo;
    }

    @Override // X.InterfaceC50459MPn
    public final void D1q() {
        KDM kdm = this.A00;
        if (kdm.A0E) {
            UserSession A0r = AbstractC166987dD.A0r(kdm.A0Q);
            String str = this.A01.A0o;
            String str2 = kdm.A0A;
            AbstractC167017dG.A1N(A0r, str);
            AbstractC34073F2b.A00(kdm, A0r, "branded_chat_theme_preview", "click", "cancel_button", str2, AbstractC167007dF.A0n("theme", str));
        }
        C3DN A0m = AbstractC25230BEn.A0m(kdm);
        if (A0m != null) {
            A0m.A0Y();
        }
    }

    @Override // X.InterfaceC50459MPn
    public final void Dl5() {
        KDM kdm = this.A00;
        if (kdm.A0E) {
            UserSession A0r = AbstractC166987dD.A0r(kdm.A0Q);
            String str = this.A01.A0o;
            String str2 = kdm.A0A;
            AbstractC167017dG.A1N(A0r, str);
            AbstractC34073F2b.A00(kdm, A0r, "branded_chat_theme_preview", "click", MSV.A00(376), str2, AbstractC167007dF.A0n("theme", str));
        }
        KDM.A06(kdm, this.A01, false);
    }
}
