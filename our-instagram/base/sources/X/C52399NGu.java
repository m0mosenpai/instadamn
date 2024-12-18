package X;

import com.instagram.mainfeed.network.FeedCacheCoordinator;

/* renamed from: X.NGu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52399NGu extends AbstractC18280vF {
    public final /* synthetic */ C1X6 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52399NGu(C1X6 c1x6) {
        super("feedCacheInitialization", 1099672250);
        this.A00 = c1x6;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        C1X6 c1x6 = this.A00;
        ((FeedCacheCoordinator) ((C1Y3) c1x6.A06.getValue())).Emk(c1x6, true);
    }
}
