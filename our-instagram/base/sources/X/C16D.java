package X;

import java.io.File;
import java.io.Serializable;

/* renamed from: X.16D, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16D implements Serializable {
    public static final C16D A02 = new C16D(false, null);
    public final boolean A00;
    public final transient Object A01;

    public static final void A00(int[] iArr, int i) {
        int i2 = iArr[0];
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= i) {
            i2 = i;
        }
        iArr[0] = i2;
        int i3 = iArr[1];
        int i4 = i - i2;
        if (i3 < 0 || i3 > i4) {
            iArr[1] = i4;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && (obj instanceof C16D)) {
                Object obj2 = ((C16D) obj).A01;
                Object obj3 = this.A01;
                if (obj3 == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (obj2 != null) {
                    if ((obj3 instanceof File) || (obj3 instanceof java.net.URL) || (obj3 instanceof java.net.URI)) {
                        return obj3.equals(obj2);
                    }
                    return obj3 == obj2;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.A01;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public C16D(boolean z, Object obj) {
        this.A00 = z;
        this.A01 = obj;
    }
}
