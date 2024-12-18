package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Doe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31256Doe {
    public int A00;
    public AbstractC46972Dl A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC41501vz A05;
    public final UserSession A06;
    public final C0UO A07;
    public final C05A A08;
    public final boolean A09;
    public final boolean A0A;

    public C31256Doe(UserSession userSession, AbstractC46972Dl abstractC46972Dl, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        this.A06 = userSession;
        this.A09 = z;
        this.A0A = z2;
        this.A01 = abstractC46972Dl;
        C008002u A00 = C10E.A00(A00());
        this.A08 = A00;
        this.A07 = AbstractC208910l.A02(A00);
        this.A05 = C31650DvG.A00(this, 33);
    }

    private final C31257Dof A00() {
        boolean A01;
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A06;
        String A0n = AbstractC31173DnH.A0n(userSession, c08730cb);
        boolean z = this.A09;
        AbstractC46972Dl abstractC46972Dl = this.A01;
        boolean z2 = this.A0A;
        boolean z3 = this.A03;
        int i = this.A00;
        int A00 = AbstractC31264Dom.A00(userSession);
        if (AbstractC54472f1.A03()) {
            A01 = AbstractC167007dF.A1O(A00);
        } else {
            A01 = AbstractC71963Ku.A01(userSession);
        }
        return new C31257Dof(abstractC46972Dl, A0n, i, z, z2, z3, A01, this.A02, this.A04);
    }

    public static final void A01(C31256Doe c31256Doe) {
        c31256Doe.A08.Egh(c31256Doe.A00());
    }
}
