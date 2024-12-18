package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes6.dex */
public final class GJI implements InterfaceC37142GYd {
    public final /* synthetic */ C36006Fv4 A00;
    public final /* synthetic */ String A01;

    public GJI(C36006Fv4 c36006Fv4, String str) {
        this.A00 = c36006Fv4;
        this.A01 = str;
    }

    @Override // X.InterfaceC37142GYd
    public final void Dy6(String str) {
        C36006Fv4 c36006Fv4 = this.A00;
        C75R.A0E(c36006Fv4.A06, "impression", "restrict_success_toast", this.A01);
        FragmentActivity fragmentActivity = c36006Fv4.A02;
        FDP.A00(fragmentActivity, fragmentActivity, c36006Fv4.A07, c36006Fv4.A0C.getUsername());
        C36006Fv4.A00(c36006Fv4);
    }
}
