package X;

/* renamed from: X.DrQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31421DrQ implements InterfaceC58362lv, InterfaceC14180ni {
    public final int A00;
    public final Object A01;

    public C31421DrQ(int i, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = i;
        this.A01 = interfaceC16660sJ;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC58362lv) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return C14360o3.A0K(this.A01, ((InterfaceC14180ni) obj).getFunctionDelegate());
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return (InterfaceC09250da) this.A01;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    @Override // X.InterfaceC58362lv
    public final /* synthetic */ void onChanged(Object obj) {
        AbstractC25225BEi.A1U(this.A01, obj);
    }
}
