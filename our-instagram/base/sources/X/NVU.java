package X;

/* loaded from: classes9.dex */
public final class NVU extends O5W {
    public final InterfaceC57989PnZ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NVU(InterfaceC57989PnZ interfaceC57989PnZ) {
        super("cancel");
        C14360o3.A0B(interfaceC57989PnZ, 1);
        this.A00 = interfaceC57989PnZ;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NVU) && C14360o3.A0K(this.A00, ((NVU) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
