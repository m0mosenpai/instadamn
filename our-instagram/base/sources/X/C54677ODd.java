package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.ODd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54677ODd {
    public final Bitmap A00;
    public final Rect A01;
    public final RectF A02;
    public final RectF A03;
    public final boolean A04;
    public final boolean A05;

    public C54677ODd(Bitmap bitmap, Rect rect, RectF rectF, RectF rectF2, boolean z, boolean z2) {
        this.A02 = new RectF(rectF);
        this.A03 = new RectF(rectF2);
        this.A01 = new Rect(rect);
        this.A00 = bitmap;
        this.A04 = z;
        this.A05 = z2;
    }
}
