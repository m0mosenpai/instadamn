package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GJA implements InterfaceC37205GaG {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C18920wW A01;
    public final /* synthetic */ C38266GsB A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ GIS A04;

    @Override // X.InterfaceC37205GaG
    public final /* synthetic */ void onFinish() {
    }

    @Override // X.InterfaceC37205GaG
    public final /* synthetic */ void onStart() {
    }

    public GJA(FragmentActivity fragmentActivity, C18920wW c18920wW, C38266GsB c38266GsB, User user, GIS gis) {
        this.A01 = c18920wW;
        this.A03 = user;
        this.A00 = fragmentActivity;
        this.A02 = c38266GsB;
        this.A04 = gis;
    }

    @Override // X.InterfaceC37205GaG
    public final void DFj(Integer num) {
        C9GR.A0B(this.A00, "unrestricted_user_failed");
    }

    @Override // X.InterfaceC37205GaG
    public final void onSuccess() {
        C18920wW c18920wW = this.A01;
        User user = this.A03;
        C75R.A0E(c18920wW, "impression", "unrestrict_success_toast", user.getId());
        C9GR.A07(this.A00, 2131952120);
        user.A1B(false);
        C38266GsB c38266GsB = this.A02;
        c38266GsB.A0G = false;
        c38266GsB.A0D = false;
        this.A04.A07.CtN();
    }
}
