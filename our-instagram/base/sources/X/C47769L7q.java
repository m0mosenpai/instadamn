package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.L7q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47769L7q {
    public boolean A00;
    public final C25671My A01;
    public final UserSession A02;
    public final L67 A03;
    public final C2DS A04;
    public final String A05;

    public C47769L7q(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = AbstractC25651Mw.A00(userSession);
        this.A04 = C2JD.A00(userSession);
        this.A05 = AbstractC31180DnO.A0k(AbstractC166997dE.A0Y(userSession).BTC());
        this.A03 = (L67) userSession.A01(L67.class, MHS.A00(userSession, 31));
    }

    public final void A00() {
        if (!this.A00) {
            this.A00 = true;
            Object obj = new Object();
            Object obj2 = new Object();
            Object obj3 = new Object();
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            LinkedHashMap A1I2 = AbstractC166987dD.A1I();
            List A0F = ((C2DU) this.A04).A0C.A0F(C4I1.A00);
            if (AbstractC166987dD.A1b(A0F)) {
                long A0L = AbstractC166987dD.A0L(((C2EH) AbstractC001800i.A0K(A0F)).BLF());
                MailboxFeature mailboxFeature = new MailboxFeature(JVC.A00.A00(this.A02));
                InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(mailboxFeature);
                MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0H);
                AbstractC43594JPz.A1G(A0H, new LVG(A0L, mailboxFeature, 6, A0D), A0D);
                A0D.addResultCallback(new C48187LUl(0, this, A1I, A1I2, obj3, obj2, obj));
            }
        }
    }
}
