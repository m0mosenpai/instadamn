package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.8XQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C8XQ implements InterfaceC14180ni, InterfaceC58362lv {
    public final /* synthetic */ C8XH A00;

    public C8XQ(C8XH c8xh) {
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
        return new C03E(1, this.A00, C8XH.class, "launchSubFragment", "launchSubFragment(Landroidx/fragment/app/Fragment;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C8XI c8xi;
        String obj2;
        Fragment fragment = (Fragment) obj;
        C14360o3.A0B(fragment, 0);
        C8XH c8xh = this.A00;
        if (c8xh.A01 != C8XI.A04) {
            obj2 = "Only one sub-fragment can be launched at a time";
        } else {
            InterfaceC1810081c interfaceC1810081c = c8xh.A06;
            int ordinal = interfaceC1810081c.AuH().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Current state is ");
                    sb.append(interfaceC1810081c.AuH());
                    sb.append(". Sub fragments can only be launched when quick-capture is in pre or post cap");
                    obj2 = sb.toString();
                } else {
                    c8xi = C8XI.A05;
                }
            } else {
                c8xi = C8XI.A06;
            }
            c8xh.A01 = c8xi;
            ((C1809981b) interfaceC1810081c).A02.A04(new Object());
            C8XH.A01(fragment, c8xh);
            C8XH.A00(fragment, c8xh.A03);
            return;
        }
        AbstractC12120kG.A07("QuickCaptureSubFragmentManager", obj2, null);
    }
}
