package X;

/* renamed from: X.B3y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C25002B3y implements InterfaceC14180ni, AnonymousClass822 {
    public final /* synthetic */ InterfaceC16660sJ A00;

    public C25002B3y(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return this.A00;
    }

    @Override // X.AnonymousClass822
    public final /* synthetic */ void onChanged(Object obj) {
        this.A00.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass822) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, this.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
