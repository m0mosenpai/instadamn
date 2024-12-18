package X;

import com.instagram.video.live.mvvm.view.likes.customviews.ProfilePictureLikesView;

/* renamed from: X.Osj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55951Osj implements C1NJ {
    public final /* synthetic */ O91 A00;
    public final /* synthetic */ ProfilePictureLikesView A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        ProfilePictureLikesView profilePictureLikesView = this.A01;
        if (profilePictureLikesView.A01) {
            int i = this.A00.A00;
            for (int i2 = 0; i2 < i; i2 = 1) {
                profilePictureLikesView.postDelayed(new PTQ(c73033Pe, profilePictureLikesView, this.A02, this.A03), 0L);
            }
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public C55951Osj(O91 o91, ProfilePictureLikesView profilePictureLikesView, String str, boolean z) {
        this.A01 = profilePictureLikesView;
        this.A03 = z;
        this.A02 = str;
        this.A00 = o91;
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        ProfilePictureLikesView profilePictureLikesView = this.A01;
        if (profilePictureLikesView.A01) {
            ProfilePictureLikesView.A02(null, profilePictureLikesView, this.A02, this.A03);
            profilePictureLikesView.postInvalidateOnAnimation();
        }
    }
}
