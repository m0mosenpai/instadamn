package X;

/* loaded from: classes9.dex */
public final class NVW extends O5W {
    public final InterfaceC37110GWv A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NVW(InterfaceC37110GWv interfaceC37110GWv) {
        super("navigate");
        C14360o3.A0B(interfaceC37110GWv, 1);
        this.A00 = interfaceC37110GWv;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NVW) && C14360o3.A0K(this.A00, ((NVW) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
