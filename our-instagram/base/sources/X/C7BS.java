package X;

/* renamed from: X.7BS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7BS extends C0T6 implements InterfaceC129555tK {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7BS) && this.A00 == ((C7BS) obj).A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C14360o3.A0B(obj, 0);
        return equals(obj);
    }

    public final int hashCode() {
        String str;
        Integer num = this.A00;
        if (num == null) {
            return 0;
        }
        int intValue = num.intValue();
        if (1 != intValue) {
            str = "ARMADILLO_EXPRESS_PROTOBUF";
        } else {
            str = "PROTON";
        }
        return str.hashCode() + intValue;
    }

    public C7BS(Integer num) {
        this.A00 = num;
    }
}
