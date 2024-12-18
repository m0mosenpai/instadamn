package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.util.List;

/* renamed from: X.9Sv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210569Sv extends LayerDrawable {
    public final float A00;
    public final Bitmap A01;
    public final List A02;

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Rect A0W = AbstractC166987dD.A0W(this);
        int width = this.A01.getWidth();
        int height = A0W.height();
        int i = (int) (width * this.A00);
        float f = i;
        int A06 = (int) ((AbstractC166987dD.A06(getDrawable(0)) / getDrawable(0).getIntrinsicWidth()) * f);
        int i2 = A0W.left + ((width - i) / 2);
        int i3 = A0W.top + ((height - A06) / 2);
        int i4 = i2 + i;
        int i5 = i3 + A06;
        Drawable drawable = getDrawable(0);
        drawable.setBounds(i2, i3, i4, i5);
        drawable.draw(canvas);
        Drawable drawable2 = getDrawable(1);
        drawable2.setBounds(i2 + ((int) (f * 0.04f)), ((int) (A06 * 0.02f)) + i5, i4 + i, i5 + 200);
        drawable2.draw(canvas);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C210569Sv(android.graphics.Bitmap r6, com.instagram.ui.widget.interactive.InteractiveDrawableContainer r7, java.lang.String r8, java.util.List r9) {
        /*
            r5 = this;
            if (r8 == 0) goto L60
            android.text.Spannable r0 = X.C6RB.A0d
            android.content.Context r1 = r7.getContext()
            int r0 = r7.getWidth()
            X.6RB r3 = X.AbstractC166987dD.A0z(r1, r0)
            int r4 = X.AbstractC167007dF.A08(r1)
            int r2 = X.AbstractC166997dE.A02(r1)
            r3.A0M(r8)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165228(0x7f07002c, float:1.7944667E38)
            float r0 = r1.getDimension(r0)
            r3.A0A(r0)
            r3.A0F(r4)
            r1 = 1084227584(0x40a00000, float:5.0)
            r0 = 0
            r3.A0D(r1, r0, r0, r2)
            java.lang.String r1 = "…"
            r0 = 1
            r3.A0N(r1, r0, r0)
            android.graphics.Typeface r1 = android.graphics.Typeface.SANS_SERIF
            r0 = 0
            r3.A0J(r1, r0)
            android.content.res.Resources r2 = r7.getResources()
            X.C14360o3.A07(r2)
            r1 = 1103101952(0x41c00000, float:24.0)
            X.8FX r0 = new X.8FX
            r0.<init>(r2, r6)
            r0.A02(r1)
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r0, r3}
            r5.<init>(r0)
            r5.A01 = r6
            r5.A02 = r9
            r0 = 1062836634(0x3f59999a, float:0.85)
            r5.A00 = r0
            return
        L60:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C210569Sv.<init>(android.graphics.Bitmap, com.instagram.ui.widget.interactive.InteractiveDrawableContainer, java.lang.String, java.util.List):void");
    }
}
