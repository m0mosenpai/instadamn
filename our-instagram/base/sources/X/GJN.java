package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GJN implements InterfaceC37142GYd {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C18920wW A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ GIS A04;

    public GJN(Context context, FragmentActivity fragmentActivity, C18920wW c18920wW, User user, GIS gis) {
        this.A02 = c18920wW;
        this.A03 = user;
        this.A00 = context;
        this.A04 = gis;
        this.A01 = fragmentActivity;
    }

    @Override // X.InterfaceC37142GYd
    public final void Dy6(String str) {
        C18920wW c18920wW = this.A02;
        User user = this.A03;
        C75R.A0E(c18920wW, "impression", "restrict_success_toast", user.getId());
        FDP.A00(this.A01, this.A00, this.A04.A04, user.getUsername());
    }
}
