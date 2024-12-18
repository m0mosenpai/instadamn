package X;

/* renamed from: X.5Xd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C118415Xd extends AbstractC118405Xc {
    public float A00;
    public float A01;

    public final boolean equals(Object obj) {
        if (obj instanceof C118415Xd) {
            C118415Xd c118415Xd = (C118415Xd) obj;
            if (c118415Xd.A00 == this.A00 && c118415Xd.A01 == this.A01) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }

    public final String toString() {
        return AnonymousClass001.A0a("AnimationVector2D: v1 = ", ", v2 = ", this.A00, this.A01);
    }

    public C118415Xd(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
