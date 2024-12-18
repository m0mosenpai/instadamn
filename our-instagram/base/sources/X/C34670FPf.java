package X;

import android.content.Context;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.FPf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34670FPf {
    public final /* synthetic */ FoY A00;
    public final /* synthetic */ boolean A01;

    public C34670FPf(FoY foY, boolean z) {
        this.A00 = foY;
        this.A01 = z;
    }

    public final void A00() {
        boolean z = !this.A01;
        FoY foY = this.A00;
        FWX.A00((Context) foY.A03, (FOQ) foY.A06, z);
        GIQ giq = (GIQ) foY.A04;
        giq.A05.A17(z);
        UserDetailTabController userDetailTabController = giq.A04;
        if (userDetailTabController != null) {
            userDetailTabController.A0F();
        }
    }
}
