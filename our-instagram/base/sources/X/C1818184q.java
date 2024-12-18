package X;

/* renamed from: X.84q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1818184q implements InterfaceC14180ni, InterfaceC58362lv {
    public final /* synthetic */ InterfaceC16660sJ A00;

    public C1818184q(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return this.A00;
    }

    @Override // X.InterfaceC58362lv
    public final /* synthetic */ void onChanged(Object obj) {
        this.A00.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC58362lv) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return C14360o3.A0K(this.A00, ((InterfaceC14180ni) obj).getFunctionDelegate());
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
