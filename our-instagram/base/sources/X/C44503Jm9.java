package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jm9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44503Jm9 extends AbstractC52922bZ {
    public final C2GT A00;
    public final C2GT A01;
    public final C195448kk A02;
    public final C05A A03;
    public final C05A A04;
    public final C0UO A05;
    public final InterfaceC19390xP A06;

    public C44503Jm9(UserSession userSession, Context context, boolean z) {
        C195448kk A00 = AbstractC195438kj.A00(userSession);
        this.A02 = A00;
        C008002u A002 = C10E.A00(null);
        this.A03 = A002;
        this.A05 = AbstractC208910l.A02(A002);
        C008002u A003 = C10E.A00(Boolean.valueOf(z));
        this.A04 = A003;
        C15200pa A01 = C10Q.A01(new GSU(context, this, (InterfaceC23621Ds) null), A00.A05, A00.A07, A002, A003);
        this.A06 = A01;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A00 = AbstractC58232lf.A00(anonymousClass191, A01);
        this.A01 = AbstractC58232lf.A00(anonymousClass191, new C43818JZg(30, new InterfaceC19390xP[]{A002}, this));
    }
}
