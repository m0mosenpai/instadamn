package X;

/* renamed from: X.6OK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6OK {
    public final InterfaceC16820sZ A00;
    public final InterfaceC16820sZ A01;
    public final boolean A02;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScrollAxisRange(value=");
        sb.append(((Number) this.A01.invoke()).floatValue());
        sb.append(", maxValue=");
        sb.append(((Number) this.A00.invoke()).floatValue());
        sb.append(", reverseScrolling=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C6OK(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z) {
        this.A01 = interfaceC16820sZ;
        this.A00 = interfaceC16820sZ2;
        this.A02 = z;
    }
}
