package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.8XR, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C8XR implements InterfaceC14180ni, InterfaceC58362lv {
    public final /* synthetic */ C8XH A00;

    public C8XR(C8XH c8xh) {
        this.A00 = c8xh;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC58362lv) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, this.A00, C8XH.class, "launchQuickCaptureSubFragmentWithoutCaptureStateChange", "launchQuickCaptureSubFragmentWithoutCaptureStateChange(Landroidx/fragment/app/Fragment;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        Fragment fragment = (Fragment) obj;
        C14360o3.A0B(fragment, 0);
        C8XH c8xh = this.A00;
        C8XH.A01(fragment, c8xh);
        C8XH.A00(fragment, c8xh.A03);
    }
}
