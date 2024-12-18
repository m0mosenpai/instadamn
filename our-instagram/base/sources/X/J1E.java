package X;

import com.instagram.wellbeing.fundraiser.coverphotopicker.FundraiserPhotoPickerPostsTabFragment;

/* loaded from: classes7.dex */
public final class J1E implements InterfaceC62602sz {
    public final /* synthetic */ FundraiserPhotoPickerPostsTabFragment A00;

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        return true;
    }

    public J1E(FundraiserPhotoPickerPostsTabFragment fundraiserPhotoPickerPostsTabFragment) {
        this.A00 = fundraiserPhotoPickerPostsTabFragment;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        return AbstractC166987dD.A1b(this.A00.A02.A00);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return this.A00.A01.A03.A05();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return this.A00.A01.A01();
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        FundraiserPhotoPickerPostsTabFragment.A00(this.A00, !CL7());
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        return this.A00.A01.A02();
    }
}
