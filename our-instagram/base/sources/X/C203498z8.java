package X;

import android.graphics.Bitmap;

/* renamed from: X.8z8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203498z8 extends AbstractC203508z9 {
    public final Bitmap A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C203498z8) && C14360o3.A0K(this.A00, ((C203498z8) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MlInputBitmap(bitmap=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C203498z8(Bitmap bitmap) {
        this.A00 = bitmap;
    }
}
