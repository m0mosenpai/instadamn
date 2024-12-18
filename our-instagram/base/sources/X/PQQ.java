package X;

import android.view.View;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;

/* loaded from: classes9.dex */
public final class PQQ implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FollowersShareFragment A01;

    public PQQ(View view, FollowersShareFragment followersShareFragment) {
        this.A01 = followersShareFragment;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FollowersShareFragment.A09(this.A00, this.A01);
    }
}
