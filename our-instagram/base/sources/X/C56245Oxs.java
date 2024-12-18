package X;

import android.app.Activity;
import com.instagram.common.gallery.Medium;
import com.instagram.profilecard.domain.ProfileCardViewModel;

/* renamed from: X.Oxs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56245Oxs implements InterfaceC186138Nh {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ ProfileCardViewModel A01;

    @Override // X.InterfaceC186138Nh
    public final void DIz(Medium medium, boolean z) {
        C14360o3.A0B(medium, 0);
        AbstractC167017dG.A0y(this.A00, C3DN.A00);
        String str = medium.A0X;
        if (str != null) {
            ProfileCardViewModel profileCardViewModel = this.A01;
            AbstractC166987dD.A1Z(new MCF(profileCardViewModel, str, null, 35), AbstractC141776au.A00(profileCardViewModel));
        }
    }

    public C56245Oxs(Activity activity, ProfileCardViewModel profileCardViewModel) {
        this.A00 = activity;
        this.A01 = profileCardViewModel;
    }
}
