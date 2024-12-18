package X;

/* renamed from: X.5gE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122185gE {
    public final float A00;

    public final boolean equals(Object obj) {
        float f = this.A00;
        if (!(obj instanceof C122185gE) || Float.compare(f, ((C122185gE) obj).A00) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0F("BaselineShift(multiplier=", ')', this.A00);
    }
}
