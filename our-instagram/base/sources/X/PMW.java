package X;

import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

/* loaded from: classes9.dex */
public final class PMW implements Runnable {
    public final /* synthetic */ FollowersShareFragment A00;

    public PMW(FollowersShareFragment followersShareFragment) {
        this.A00 = followersShareFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OL8 ol8;
        FollowersShareFragment followersShareFragment = this.A00;
        C47Z A05 = FollowersShareFragment.A05(followersShareFragment);
        if (A05 != null && (ol8 = followersShareFragment.A0E) != null) {
            IgAutoCompleteTextView igAutoCompleteTextView = ol8.A01;
            if (igAutoCompleteTextView != null) {
                A05.A2Z = AbstractC167007dF.A0g(igAutoCompleteTextView);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
