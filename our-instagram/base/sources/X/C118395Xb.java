package X;

/* renamed from: X.5Xb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C118395Xb extends AbstractC118405Xc {
    public float A00;

    public final boolean equals(Object obj) {
        if ((obj instanceof C118395Xb) && ((C118395Xb) obj).A00 == this.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0N("AnimationVector1D: value = ", this.A00);
    }
}
