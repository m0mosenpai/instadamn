package X;

/* renamed from: X.7N3, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7N3 implements InterfaceC14180ni, InterfaceC50439MOt {
    public final /* synthetic */ C164477Xm A00;

    public C7N3(C164477Xm c164477Xm) {
        this.A00 = c164477Xm;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC50439MOt) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(0, this.A00, C164477Xm.class, "retrieveEnforcementNoticeInfo", "retrieveEnforcementNoticeInfo()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC50439MOt
    public final void DpB() {
        C164477Xm c164477Xm = this.A00;
        c164477Xm.A02.A02(new C7N4(c164477Xm), C05F.A00, new EnumC44104JeT[]{EnumC44104JeT.A05});
    }
}
