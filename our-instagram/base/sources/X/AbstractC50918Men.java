package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Men, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50918Men extends AbstractC52922bZ {
    public final HKK A00;
    public final C38U A01;
    public final EnumC53206Ng4 A02;
    public final NY4 A03;
    public final InterfaceC15070pN A04;

    public AbstractC50918Men(UserSession userSession, EnumC53206Ng4 enumC53206Ng4, InterfaceC15070pN interfaceC15070pN) {
        this.A02 = enumC53206Ng4;
        this.A04 = interfaceC15070pN;
        C38U c38u = C38U.A00;
        this.A01 = c38u;
        HKK hkk = new HKK(new J69(new C155376yQ(userSession)), c38u);
        this.A00 = hkk;
        this.A03 = new NY4(hkk);
        PYu.A01(this, AbstractC141776au.A00(this), 30);
    }
}
