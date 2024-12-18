package X;

/* loaded from: classes4.dex */
public final class B23 implements InterfaceC08830cm {
    public final /* synthetic */ C7W4 A00;

    public B23(C7W4 c7w4) {
        this.A00 = c7w4;
    }

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        C7U0 c7u0 = this.A00.A08;
        if (c7u0 == null) {
            C14360o3.A0F("clientInfra");
            throw C00O.createAndThrow();
        }
        return c7u0;
    }
}
