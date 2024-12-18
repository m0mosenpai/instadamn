package X;

import android.graphics.Bitmap;

/* renamed from: X.CuY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29229CuY implements InterfaceC30812Dgn {
    public final Bitmap A00;
    public final C44135Jf0 A01;
    public final String A02;

    public C29229CuY(Bitmap bitmap, C44135Jf0 c44135Jf0, String str) {
        C14360o3.A0B(bitmap, 2);
        this.A02 = str;
        this.A00 = bitmap;
        this.A01 = c44135Jf0;
    }

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
        if (!C14360o3.A0K(cls2, cls) || !(obj instanceof C29229CuY)) {
            return false;
        }
        return C14360o3.A0K(this.A02, ((C29229CuY) obj).A02);
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }
}
