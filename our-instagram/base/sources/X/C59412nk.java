package X;

import android.graphics.Bitmap;

/* renamed from: X.2nk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59412nk implements InterfaceC59172nI {
    public final Bitmap A00;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BitmapImageSource(bitmap=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
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
        if (!C14360o3.A0K(cls2, cls)) {
            return false;
        }
        Bitmap bitmap = this.A00;
        C14360o3.A0C(obj, AbstractC111324zv.A00(2779));
        return C14360o3.A0K(bitmap, ((C59412nk) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C59412nk(Bitmap bitmap) {
        this.A00 = bitmap;
    }
}
