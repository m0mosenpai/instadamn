package X;

/* renamed from: X.8JO, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C8JO implements InterfaceC14180ni, AnonymousClass822 {
    public final /* synthetic */ C8JI A00;

    public C8JO(C8JI c8ji) {
        this.A00 = c8ji;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AnonymousClass822) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, this.A00, C8JI.class, "onCameraDestinationChanged", "onCameraDestinationChanged(Lcom/instagram/creation/cameraconfiguration/CameraDestination;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.AnonymousClass822
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C55U c55u = (C55U) obj;
        C14360o3.A0B(c55u, 0);
        C8JI.A02(c55u, this.A00);
    }
}
