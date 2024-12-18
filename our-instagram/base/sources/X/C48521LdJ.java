package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.LdJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48521LdJ implements InterfaceC13000lm, C9AS {
    public C6Eh A00;
    public final SessionedNotificationCenter A01;
    public final AccountSession A02;
    public final UserSession A03;
    public final AtomicBoolean A04;

    public C48521LdJ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        AccountSession A02 = C61A.A02(userSession, !userSession.isStopped());
        this.A02 = A02;
        SessionedNotificationCenter sessionedNotificationCenter = A02.getSessionedNotificationCenter();
        C14360o3.A07(sessionedNotificationCenter);
        this.A01 = sessionedNotificationCenter;
        this.A04 = AbstractC166997dE.A17();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0124, code lost:
    
        if (X.C0JA.A00().A04() == false) goto L53;
     */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.facebook.msys.mca.MailboxFeature, X.K3P] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.InterfaceC16660sJ r38) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48521LdJ.A00(X.0sJ):void");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C6Eh c6Eh;
        synchronized (this) {
            c6Eh = this.A00;
        }
        if (c6Eh != null) {
            this.A01.removeEveryObserver(c6Eh);
        }
    }

    @Override // X.C9AS
    public final void CuN(boolean z) {
        MailboxFeature mailboxFeature;
        InterfaceExecutorC135866Co A0H;
        MailboxFutureImpl A0I;
        int i;
        C135656Br c135656Br = new C135656Br(this.A02);
        if (z) {
            mailboxFeature = new MailboxFeature(c135656Br);
            LVA lva = LVA.A00;
            A0H = AbstractC43593JPy.A0H(mailboxFeature);
            A0I = AbstractC43593JPy.A0I(A0H, lva);
            i = 31;
        } else {
            mailboxFeature = new MailboxFeature(c135656Br);
            LVB lvb = LVB.A00;
            A0H = AbstractC43593JPy.A0H(mailboxFeature);
            A0I = AbstractC43593JPy.A0I(A0H, lvb);
            i = 32;
        }
        AbstractC43594JPz.A1G(A0H, new C44176Jff(i, mailboxFeature, A0I), A0I);
    }
}
