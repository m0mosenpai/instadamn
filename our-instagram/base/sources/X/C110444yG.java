package X;

import com.instagram.mainfeed.network.FeedCacheCoordinator;

/* renamed from: X.4yG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110444yG extends AbstractC18280vF {
    public final /* synthetic */ FeedCacheCoordinator A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C110444yG(FeedCacheCoordinator feedCacheCoordinator) {
        super("flashFeedRecsLoad", 1179135489);
        this.A00 = feedCacheCoordinator;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        FeedCacheCoordinator feedCacheCoordinator = this.A00;
        C006802i c006802i = C006802i.A0p;
        int incrementAndGet = FeedCacheCoordinator.A0F.incrementAndGet();
        c006802i.markerStart(974459630, incrementAndGet);
        c006802i.markerAnnotate(974459630, incrementAndGet, "CACHE_NAME", "RECS");
        if (feedCacheCoordinator.A09 != null) {
            C19L c19l = feedCacheCoordinator.A0B;
            C9D9 c9d9 = new C9D9(feedCacheCoordinator, c006802i, null, incrementAndGet, 1);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d9, c19l);
        }
    }
}
