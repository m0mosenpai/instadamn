package X;

import com.instagram.mainfeed.network.FeedCacheCoordinator;

/* loaded from: classes9.dex */
public final class NGV extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FeedCacheCoordinator A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NGV(FeedCacheCoordinator feedCacheCoordinator, int i) {
        super(117128848, i, false, false);
        this.A00 = i;
        this.A01 = feedCacheCoordinator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FeedCacheCoordinator.A06(this.A01, this.A00);
    }
}
