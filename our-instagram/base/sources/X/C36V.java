package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.36V, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36V extends C59062n7 {
    public static final C36V A02;
    public final C40971v4 A00;
    public final UserSession A01;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.36W, X.2n8] */
    static {
        ?? c59072n8 = new C59072n8(null, null, "empty");
        c59072n8.A00 = null;
        c59072n8.A00 = C59062n7.A07;
        A02 = new C36V(c59072n8);
    }

    @Override // X.C59062n7
    public final void A01(InterfaceC57162jr interfaceC57162jr) {
        UserSession userSession = this.A01;
        C40971v4 c40971v4 = this.A00;
        if (c40971v4 != null && userSession != null && interfaceC57162jr.CFq(this) == C05F.A00) {
            AbstractC41561w6.A00(userSession).A01(c40971v4);
        }
        super.A01(interfaceC57162jr);
    }

    public C36V(C36W c36w) {
        super(c36w);
        this.A00 = c36w.A01;
        this.A01 = c36w.A00;
    }
}
