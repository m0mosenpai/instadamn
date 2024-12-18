package X;

import com.instagram.banyan.BanyanCoordinator;

/* renamed from: X.EZb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32653EZb extends AbstractRunnableC14200nk {
    public final /* synthetic */ BanyanCoordinator A00;
    public final /* synthetic */ C121285eR A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32653EZb(BanyanCoordinator banyanCoordinator, C121285eR c121285eR) {
        super(19, 3, true, true);
        this.A00 = banyanCoordinator;
        this.A01 = c121285eR;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BanyanCoordinator.A05(this.A00, this.A01.A00);
    }
}
