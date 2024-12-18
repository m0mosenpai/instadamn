package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.EkH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33170EkH extends AbstractC86353t7 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C1YA A01;

    public C33170EkH(FragmentActivity fragmentActivity, C1YA c1ya) {
        this.A01 = c1ya;
        this.A00 = fragmentActivity;
    }

    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    public final void DB6() {
        FragmentActivity fragmentActivity = this.A00;
        fragmentActivity.setResult(-1);
        fragmentActivity.finish();
    }
}
