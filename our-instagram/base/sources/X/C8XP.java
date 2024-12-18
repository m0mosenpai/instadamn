package X;

/* renamed from: X.8XP, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C8XP implements InterfaceC14180ni, InterfaceC58362lv {
    public final /* synthetic */ C8XH A00;

    public C8XP(C8XH c8xh) {
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
        return new C03E(1, this.A00, C8XH.class, "closeSubFragment", "closeSubFragment(Lcom/instagram/creation/capture/quickcapture/fragment/subfragment/QuickCaptureSubFragmentManager$Destination;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C8XI c8xi = (C8XI) obj;
        C14360o3.A0B(c8xi, 0);
        C8XH c8xh = this.A00;
        c8xh.A00 = c8xi;
        C8XI c8xi2 = C8XI.A04;
        C1816783z c1816783z = c8xh.A04;
        if (c8xi != c8xi2) {
            c1816783z.A01.A0V = false;
        } else {
            c1816783z.A01.A03 = null;
        }
        c8xh.A03.A0x("QuickCaptureSubFragmentManager", 1);
    }
}
