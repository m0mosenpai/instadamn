package X;

import android.graphics.Bitmap;

/* renamed from: X.9NP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9NP extends C0T6 implements BBC {
    public final Bitmap A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9NP) && C14360o3.A0K(this.A00, ((C9NP) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C9NP(Bitmap bitmap) {
        this.A00 = bitmap;
    }
}
