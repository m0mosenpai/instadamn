package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Mf0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50931Mf0 extends AbstractC52922bZ {
    public final C2GT A00;
    public final C51761Mtk A01;
    public final List A02;
    public final C05A A03;
    public final boolean A04;
    public final boolean A05;
    public final UserSession A06;

    public C50931Mf0(C152406tQ c152406tQ, C51761Mtk c51761Mtk, UserSession userSession, List list) {
        AbstractC167027dH.A13(userSession, list, c51761Mtk);
        this.A06 = userSession;
        this.A02 = list;
        this.A01 = c51761Mtk;
        this.A05 = AbstractC167007dF.A1T(AbstractC50522MSa.A0e(c152406tQ, "arg_should_include_country_code"));
        Boolean A0e = AbstractC50522MSa.A0e(c152406tQ, "args_is_form_extension");
        this.A04 = A0e != null ? A0e.booleanValue() : false;
        C008002u A1H = AbstractC25225BEi.A1H("");
        this.A03 = A1H;
        this.A00 = AbstractC31172DnG.A0E(AnonymousClass111.A01(new PZH(this, null, 35), A1H));
    }
}
