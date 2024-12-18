package X;

import com.instagram.banyan.BanyanCoordinator;

/* renamed from: X.EZa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32652EZa extends AbstractRunnableC14200nk {
    public final /* synthetic */ BanyanCoordinator A00;
    public final /* synthetic */ C42281xI A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32652EZa(BanyanCoordinator banyanCoordinator, C42281xI c42281xI) {
        super(19, 3, true, true);
        this.A00 = banyanCoordinator;
        this.A01 = c42281xI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BanyanCoordinator.A05(this.A00, this.A01.A00);
    }
}
