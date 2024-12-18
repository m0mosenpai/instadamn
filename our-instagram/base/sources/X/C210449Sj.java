package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.9Sj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210449Sj extends Drawable implements C5RR {
    public String A00;
    public final Context A01;
    public final Bitmap A02;
    public final Paint A03;
    public final Rect A04;
    public final String A05;

    public C210449Sj(Context context, Rect rect, String str, String str2) {
        Rect A0U = AbstractC166987dD.A0U();
        this.A04 = A0U;
        this.A03 = AbstractC166987dD.A0S(3);
        this.A01 = context;
        this.A05 = str;
        this.A00 = str2;
        Bitmap A0E = C1NC.A0E(str2, rect.width(), rect.height());
        if (A0E != null) {
            this.A02 = A0E;
            A0U.set(rect);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.drawBitmap(this.A02, (Rect) null, this.A04, this.A03);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java", replaceWith = @ReplaceWith(expression = "PixelFormat.TRANSLUCENT", imports = {"android.graphics.PixelFormat"}))
    public final int getOpacity() {
        return -3;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        String str = this.A00;
        if (str == null) {
            try {
                str = AbstractC917048o.A02(this.A02);
                this.A00 = str;
            } catch (IOException unused) {
                return null;
            }
        }
        return new Wm3(this.A04, this.A05, str);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A04.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A04.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        this.A04.set(i, i2, i3, i4);
        super.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
    }

    public C210449Sj(Context context, Bitmap bitmap, Rect rect, String str) {
        AbstractC167017dG.A1P(context, str);
        Rect A0U = AbstractC166987dD.A0U();
        this.A04 = A0U;
        this.A03 = AbstractC166987dD.A0S(3);
        this.A01 = context;
        this.A05 = str;
        this.A02 = bitmap;
        A0U.set(rect);
    }

    public C210449Sj(Context context, Bitmap bitmap, String str) {
        Rect A0U = AbstractC166987dD.A0U();
        this.A04 = A0U;
        this.A03 = AbstractC166987dD.A0S(3);
        this.A01 = context;
        this.A05 = str;
        this.A02 = bitmap;
        A0U.set(new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
    }
}
