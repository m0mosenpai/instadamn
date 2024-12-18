package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BPn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C25499BPn extends C03E implements InterfaceC16660sJ {
    public C25499BPn(Object obj) {
        super(1, obj, BKA.class, "launchTemplatePivotPage", "launchTemplatePivotPage(Lcom/instagram/feed/media/Media;)V", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC110104xf AdG;
        String templateMediaId;
        C38321qM c38321qM = (C38321qM) obj;
        BKA A0h = AbstractC25235BEs.A0h(c38321qM, this);
        UserSession userSession = A0h.A04;
        InterfaceC110214xq A1R = c38321qM.A1R();
        if (A1R != null && (AdG = A1R.AdG()) != null && (templateMediaId = AdG.getTemplateMediaId()) != null) {
            AbstractC37834Gko.A06(A0h.A01, userSession, templateMediaId);
        }
        return C0eB.A00;
    }
}
