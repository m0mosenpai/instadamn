package X;

/* loaded from: classes5.dex */
public final class C3B extends AbstractC27451C9t {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C3B) && Float.compare(this.A00, ((C3B) obj).A00) == 0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0F("RoundedSquare(cornerRadiusDp=", ')', this.A00);
    }

    public C3B(float f) {
        this.A00 = f;
    }
}
