package X;

import android.graphics.Bitmap;
import android.view.View;

/* renamed from: X.NFs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52376NFs extends AbstractC54808OKe {
    public final int A00;
    public final int A01;
    public final Bitmap A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52376NFs(Bitmap bitmap, View view, float f, float f2) {
        super(view, f, f2);
        C14360o3.A0B(bitmap, 4);
        this.A02 = bitmap;
        this.A01 = view.getWidth();
        this.A00 = view.getHeight();
    }
}
