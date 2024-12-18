package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8x8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202288x8 extends Drawable implements InterfaceC25178BCb {
    public static final AGT A0F = new Object();
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public SpannableString A04;
    public String A05;
    public String A06;
    public final C6RB A07;
    public final String A08;
    public final int A09;
    public final Paint A0A;
    public final Rect A0B;
    public final Rect A0C;
    public final String A0D;
    public final String A0E;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x00a8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C202288x8(android.content.Context r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, long r17) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202288x8.<init>(android.content.Context, java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int height;
        C14360o3.A0B(canvas, 0);
        Paint paint = this.A0A;
        paint.setTextAlign(Paint.Align.CENTER);
        int height2 = getBounds().top + this.A0C.height();
        float f = this.A00;
        if (f > 0.0f) {
            paint.setTextSize(f);
            SpannableString spannableString = this.A04;
            if (spannableString.length() > 0) {
                C6RB c6rb = this.A07;
                c6rb.A0L(spannableString);
                c6rb.A0K(Layout.Alignment.ALIGN_CENTER);
                c6rb.A0A(f);
                c6rb.A0F(-1);
                c6rb.setBounds(getBounds().centerX() - (c6rb.A0A / 2), getBounds().top, getBounds().centerX() + (c6rb.A0A / 2), getBounds().top + c6rb.A06);
                c6rb.draw(canvas);
                height = c6rb.A06;
            } else {
                String str = this.A05;
                C14360o3.A0A(str);
                C14360o3.A0A(str);
                int length = str.length();
                float centerX = getBounds().centerX();
                int i = getBounds().top;
                Rect rect = this.A0B;
                canvas.drawText(str, 0, length, centerX, i + rect.height(), paint);
                height = rect.height();
            }
            height2 = height2 + height + this.A09;
        }
        paint.setTextSize(this.A01);
        String str2 = this.A06;
        C14360o3.A0A(str2);
        C14360o3.A0A(str2);
        canvas.drawText(str2, 0, str2.length(), getBounds().centerX(), height2, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // X.InterfaceC25178BCb
    public final int BSK() {
        if (this.A0D != null && this.A0E != null) {
            return 1;
        }
        return 0;
    }

    @Override // X.InterfaceC25178BCb
    public final List BSS() {
        String str;
        String str2 = this.A0D;
        if (str2 != null && (str = this.A0E) != null) {
            List singletonList = Collections.singletonList(new User(str2, str));
            C14360o3.A07(singletonList);
            return singletonList;
        }
        return C16930sl.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0A.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0A.setColorFilter(colorFilter);
    }
}
