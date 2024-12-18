package X;

import com.instagram.video.live.mvvm.view.likes.customviews.ProfilePictureLikesView;

/* loaded from: classes9.dex */
public final class PTQ implements Runnable {
    public final /* synthetic */ C73033Pe A00;
    public final /* synthetic */ ProfilePictureLikesView A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public PTQ(C73033Pe c73033Pe, ProfilePictureLikesView profilePictureLikesView, String str, boolean z) {
        this.A01 = profilePictureLikesView;
        this.A03 = z;
        this.A00 = c73033Pe;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProfilePictureLikesView profilePictureLikesView = this.A01;
        if (profilePictureLikesView.A01) {
            ProfilePictureLikesView.A02(this.A00.A01, profilePictureLikesView, this.A02, this.A03);
            profilePictureLikesView.postInvalidateOnAnimation();
        }
    }
}
