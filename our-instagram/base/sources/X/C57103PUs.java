package X;

/* renamed from: X.PUs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57103PUs implements InterfaceC14180ni, InterfaceC57893Plx {
    public final /* synthetic */ C51078MhZ A00;

    public C57103PUs(C51078MhZ c51078MhZ) {
        this.A00 = c51078MhZ;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(0, this.A00, C51078MhZ.class, "invalidate", "invalidate()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC57893Plx
    public final void DN2() {
        this.A00.A06();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC57893Plx) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, getFunctionDelegate());
    }
}
