package X;

/* renamed from: X.7bK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C165927bK implements InterfaceC14180ni, InterfaceC42241xE {
    public final /* synthetic */ C7W4 A00;

    public C165927bK(C7W4 c7w4) {
        this.A00 = c7w4;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC42241xE) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, this.A00, C7W4.class, "onEnterThreadLogging", "onEnterThreadLogging(Lcom/instagram/model/direct/threadkey/intf/ThreadId;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C7W4.A09(this.A00, (InterfaceC83733oI) obj);
    }
}
