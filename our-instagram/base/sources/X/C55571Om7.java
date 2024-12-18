package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Om7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55571Om7 implements InterfaceC018407e, C07N {
    public final C018307d A00;
    public final C52992bg A01;
    public final C55564Oly A02;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Oly, java.lang.Object] */
    public C55571Om7(C018307d c018307d, C206329Bp c206329Bp, UserSession userSession, C147236jz c147236jz) {
        C14360o3.A0B(c018307d, 1);
        this.A00 = c018307d;
        this.A02 = new Object();
        C52992bg c52992bg = new C52992bg(C52962bd.A00);
        c52992bg.A01(C55572OmA.A00, c147236jz);
        c52992bg.A01(C55573OmB.A00, c206329Bp);
        c52992bg.A01(C55574OmC.A00, new C54703OEf(userSession, c147236jz));
        c52992bg.A01(C55575OmD.A00, userSession);
        this.A01 = c52992bg;
    }

    @Override // X.C07N
    public final AbstractC52972be getDefaultViewModelCreationExtras() {
        return this.A01;
    }

    @Override // X.C07N
    public final InterfaceC52932ba getDefaultViewModelProviderFactory() {
        return this.A02;
    }

    @Override // X.InterfaceC018407e
    public final C018307d getViewModelStore() {
        return this.A00;
    }
}
