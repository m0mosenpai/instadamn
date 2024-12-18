package X;

/* renamed from: X.8GQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C8GQ implements InterfaceC14180ni, AnonymousClass822 {
    public final /* synthetic */ C8GH A00;

    public C8GQ(C8GH c8gh) {
        this.A00 = c8gh;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AnonymousClass822) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, this.A00, C8GH.class, "setupCameraToolPairings", "setupCameraToolPairings(Ljava/util/Set;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.AnonymousClass822
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        java.util.Set set = (java.util.Set) obj;
        C14360o3.A0B(set, 0);
        C8GH.A01(this.A00, set);
    }
}
