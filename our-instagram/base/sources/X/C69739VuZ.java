package X;

/* renamed from: X.VuZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69739VuZ {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C14360o3.A0K(cls2, cls)) {
            return false;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.fresco.urimod.Dimensions");
        C69739VuZ c69739VuZ = (C69739VuZ) obj;
        return this.A01 == c69739VuZ.A01 && this.A00 == c69739VuZ.A00;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A01('x', this.A01, this.A00);
    }

    public C69739VuZ(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
