package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.9Si, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210439Si extends Drawable implements C5RR {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C8FY A04;
    public final String A05;

    public C210439Si(Context context, Bitmap bitmap, String str, int i, int i2, int i3, int i4) {
        C14360o3.A0B(str, 2);
        this.A05 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A00 = i4;
        C8FY c8fy = new C8FY(context.getResources(), bitmap);
        this.A04 = c8fy;
        c8fy.A02(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A04.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        this.A04.setBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.5NL, java.lang.Object, X.Al2] */
    @Override // X.C5RR
    public final C5NL C0T() {
        String str = this.A05;
        int i = this.A02;
        int i2 = this.A01;
        int i3 = this.A03;
        int i4 = this.A00;
        C14360o3.A0B(str, 1);
        ?? obj = new Object();
        obj.A04 = str;
        obj.A02 = i;
        obj.A01 = i2;
        obj.A03 = i3;
        obj.A00 = i4;
        return obj;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A04.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A04.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }
}
