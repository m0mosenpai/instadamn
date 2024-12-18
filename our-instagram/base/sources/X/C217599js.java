package X;

import android.graphics.Bitmap;

/* renamed from: X.9js, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217599js extends AbstractC223719uG {
    public final Bitmap A00;
    public final Integer A01;
    public final Throwable A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C217599js) {
                C217599js c217599js = (C217599js) obj;
                if (!C14360o3.A0K(this.A00, c217599js.A00) || !C14360o3.A0K(this.A01, c217599js.A01) || !C14360o3.A0K(this.A02, c217599js.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public C217599js(Bitmap bitmap, Integer num, Throwable th) {
        this.A00 = bitmap;
        this.A01 = num;
        this.A02 = th;
    }
}
