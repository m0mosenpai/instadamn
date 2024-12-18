package X;

import android.graphics.Bitmap;

/* renamed from: X.8rc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199358rc extends C8KC {
    public final Bitmap A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C199358rc) && C14360o3.A0K(this.A00, ((C199358rc) obj).A00));
    }

    public final int hashCode() {
        Bitmap bitmap = this.A00;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.hashCode();
    }

    public C199358rc(Bitmap bitmap) {
        super("stacked_timeline_unfinished_draft");
        this.A00 = bitmap;
    }

    public C199358rc() {
        this(null);
    }
}
