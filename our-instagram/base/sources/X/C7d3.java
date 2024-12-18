package X;

/* renamed from: X.7d3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7d3 extends C0T6 implements InterfaceC166427cB {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7d3) && Float.compare(this.A00, ((C7d3) obj).A00) == 0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public C7d3(float f) {
        this.A00 = f;
    }
}
