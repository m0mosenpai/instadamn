package X;

import android.content.Context;
import com.instagram.wellbeing.fundraiser.coverphotopicker.FundraiserPhotoPickerPostsTabFragment;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Ivu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42756Ivu implements InterfaceC154766xR {
    public final /* synthetic */ FundraiserPhotoPickerPostsTabFragment A00;

    @Override // X.InterfaceC154766xR
    public final void DRa(String str, Long l) {
    }

    public C42756Ivu(FundraiserPhotoPickerPostsTabFragment fundraiserPhotoPickerPostsTabFragment) {
        this.A00 = fundraiserPhotoPickerPostsTabFragment;
    }

    @Override // X.InterfaceC154766xR
    public final void DRX(AbstractC115105If abstractC115105If, EnumC125775mS enumC125775mS) {
        FundraiserPhotoPickerPostsTabFragment fundraiserPhotoPickerPostsTabFragment = this.A00;
        fundraiserPhotoPickerPostsTabFragment.A02.A00(new J1E(fundraiserPhotoPickerPostsTabFragment), null);
    }

    @Override // X.InterfaceC154766xR
    public final void DRZ(EnumC125775mS enumC125775mS) {
        FundraiserPhotoPickerPostsTabFragment fundraiserPhotoPickerPostsTabFragment = this.A00;
        fundraiserPhotoPickerPostsTabFragment.A02.A00(new J1E(fundraiserPhotoPickerPostsTabFragment), null);
    }

    @Override // X.InterfaceC154766xR
    public final void DRc(EnumC125775mS enumC125775mS, boolean z, boolean z2, boolean z3) {
        FundraiserPhotoPickerPostsTabFragment fundraiserPhotoPickerPostsTabFragment = this.A00;
        fundraiserPhotoPickerPostsTabFragment.A02.A00(new J1E(fundraiserPhotoPickerPostsTabFragment), null);
    }

    @Override // X.InterfaceC154766xR
    public final void DRd(Context context, C51758Mth c51758Mth, C123645id c123645id, EnumC125775mS enumC125775mS, boolean z, boolean z2) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = c123645id.A06.iterator();
        while (it.hasNext()) {
            C38321qM A0i = AbstractC31172DnG.A0i(it);
            if (A0i.A5M()) {
                for (int i = 0; i < A0i.A0p(); i++) {
                    C38321qM A1e = A0i.A1e(i);
                    if (A1e != null && A1e.A5x()) {
                        A1E.add(A1e);
                    }
                }
            }
            if (A0i.A5x()) {
                A1E.add(A0i);
            }
        }
        FundraiserPhotoPickerPostsTabFragment fundraiserPhotoPickerPostsTabFragment = this.A00;
        fundraiserPhotoPickerPostsTabFragment.A02.A00(new J1E(fundraiserPhotoPickerPostsTabFragment), A1E);
    }
}
