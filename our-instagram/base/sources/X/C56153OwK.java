package X;

import com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource;
import com.instagram.mainfeed.network.FeedCacheCoordinator;

/* renamed from: X.OwK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56153OwK implements C11R {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C56153OwK(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // X.C11R
    public final String getName() {
        return "save_flash_feed_item";
    }

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final void onFinish() {
    }

    @Override // X.C11R
    public final void onStart() {
    }

    @Override // X.C11R
    public final void run() {
        if (this.A00 != 0) {
            FeedCacheCoordinator.A06((FeedCacheCoordinator) this.A02, this.A01);
        } else {
            PZF.A02((MainFeedLocalDataSource) this.A02, AbstractC24771Iv.A02(117128848, this.A01), 11);
        }
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return 117128848;
    }
}
