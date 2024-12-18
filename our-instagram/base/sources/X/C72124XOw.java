package X;

import java.util.concurrent.Executor;

/* renamed from: X.XOw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72124XOw implements YNC {
    public final /* synthetic */ C9CK A00;
    public final /* synthetic */ C72122XOt A01;
    public final /* synthetic */ XP9 A02;
    public final /* synthetic */ C9HB A03;
    public final /* synthetic */ C6PU A04;

    public C72124XOw(C9CK c9ck, C72122XOt c72122XOt, XP9 xp9, C9HB c9hb, C6PU c6pu) {
        this.A01 = c72122XOt;
        this.A00 = c9ck;
        this.A04 = c6pu;
        this.A03 = c9hb;
        this.A02 = xp9;
    }

    @Override // X.YNC
    public final /* bridge */ /* synthetic */ Object ACy(C72123XOu c72123XOu) {
        C72122XOt c72122XOt = this.A01;
        C9CK c9ck = this.A00;
        C6PU c6pu = this.A04;
        C72127XOz c72127XOz = new C72127XOz(c72123XOu);
        C72121XOs c72121XOs = new C72121XOs(AbstractC16960so.A1Q(this.A03, this.A02));
        XP0 xp0 = new XP0(c72122XOt.A02);
        C72122XOt.A00(c9ck, xp0, c72127XOz, c72122XOt, c72121XOs, c6pu, null, 0);
        XP7 xp7 = new XP7(xp0);
        Executor executor = c72122XOt.A03;
        C56I c56i = c72123XOu.A01;
        if (c56i != null) {
            c56i.addListener(xp7, executor);
        }
        return C0eB.A00;
    }
}
