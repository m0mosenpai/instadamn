package X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bp0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26603Bp0 extends AbstractC77583di {
    public final C26945Bum A00;
    public final C25814BbV A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        CharSequence charSequence;
        C14360o3.A0B(c77993eR, 0);
        BO2 bo2 = BO2.A00;
        Resources A0M = AbstractC166997dE.A0M(AbstractC77363dM.A00(c77993eR));
        CWE cwe = this.A00.A00;
        SpannableStringBuilder A03 = bo2.A03(A0M, cwe);
        CharSequence A01 = cwe.A01(AbstractC166997dE.A0M(AbstractC77363dM.A00(c77993eR)));
        Resources A0M2 = AbstractC166997dE.A0M(AbstractC77363dM.A00(c77993eR));
        if ((cwe instanceof C2J) && ((C2J) cwe).A02) {
            charSequence = A0M2.getText(2131976111);
        } else {
            charSequence = null;
        }
        return AbstractC25234BEr.A08(c77993eR, AbstractC25232BEp.A1A(C28978CqT.A00), new C29044CrX(A03, A01, charSequence, AbstractC167007dF.A1W(cwe.A00(AbstractC77363dM.A00(c77993eR)))), C29734DAe.A00, new C50369MLw(35, this, c77993eR));
    }

    public C26603Bp0(C26945Bum c26945Bum, C25814BbV c25814BbV, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167027dH.A13(c25814BbV, c26945Bum, userSession);
        this.A01 = c25814BbV;
        this.A00 = c26945Bum;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
    }
}
