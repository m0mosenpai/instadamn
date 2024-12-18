package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Meh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50912Meh extends AbstractC52922bZ {
    public final HKK A00;
    public final Ng1 A01;
    public final NY3 A02;
    public final C38U A03;
    public final InterfaceC15070pN A04;

    public AbstractC50912Meh(UserSession userSession, Ng1 ng1, InterfaceC15070pN interfaceC15070pN, boolean z) {
        this.A01 = ng1;
        this.A04 = interfaceC15070pN;
        C38U c38u = C38U.A00;
        this.A03 = c38u;
        HKK hkk = new HKK(new J69(new C155376yQ(userSession)), c38u);
        this.A00 = hkk;
        this.A02 = new NY3(hkk, z);
        PZF.A02(this, AbstractC141776au.A00(this), 18);
    }
}
