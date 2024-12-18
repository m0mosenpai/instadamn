package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* renamed from: X.XOt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72122XOt extends XP4 {
    public final LF9 A00;
    public final C72064XMi A01;
    public final C72065XMj A02;
    public final Executor A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.LF9, java.lang.Object] */
    public C72122XOt(C72064XMi c72064XMi, C6VV c6vv, Executor executor) {
        super(c6vv);
        C14360o3.A0B(executor, 3);
        ?? obj = new Object();
        C72065XMj c72065XMj = new C72065XMj();
        this.A01 = c72064XMi;
        this.A03 = executor;
        this.A00 = obj;
        this.A02 = c72065XMj;
    }

    public static final void A00(C9CK c9ck, XP0 xp0, C72127XOz c72127XOz, C72122XOt c72122XOt, XP9 xp9, C6PU c6pu, Throwable th, int i) {
        boolean z;
        if (i > 0) {
            z = true;
            xp9.ClD(LF9.A00(th), c72122XOt.A00.A01(th), i);
        } else {
            z = false;
            xp9.DgF();
        }
        ListenableFuture AUu = ((XP4) c72122XOt).A00.AUu(c9ck, xp9, c6pu);
        C14360o3.A0B(AUu, 0);
        xp0.A01.add(AUu);
        C2OD.A03(new XP8(c9ck, xp0, c72127XOz, c72122XOt, xp9, c6pu, th, i, z), AUu, c72122XOt.A03);
    }

    @Override // X.C6VV
    public final ListenableFuture AUu(C9CK c9ck, XP9 xp9, C6PU c6pu) {
        AbstractC167017dG.A1N(c9ck, c6pu);
        C72064XMi c72064XMi = this.A01;
        if (c72064XMi.A02 && c72064XMi.A00 > 0) {
            return XOv.A00(new C72124XOw(c9ck, this, xp9, new C9HB(c6pu), c6pu));
        }
        return super.A00.AUu(c9ck, xp9, c6pu);
    }
}
