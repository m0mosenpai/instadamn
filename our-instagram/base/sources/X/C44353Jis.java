package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.Jis, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44353Jis extends Drawable {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public float A04;
    public float A05;
    public int A06;
    public final Paint A07;
    public final Paint A08;

    public C44353Jis(Context context) {
        Resources A0M = AbstractC166997dE.A0M(context);
        int dimensionPixelSize = A0M.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A00 = dimensionPixelSize;
        this.A05 = dimensionPixelSize / 2.0f;
        int A0B = AbstractC166997dE.A0B(A0M);
        this.A01 = A0B;
        this.A04 = A0B / 2.0f;
        this.A02 = A0M.getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
        this.A06 = A0M.getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
        Paint A0R = AbstractC166987dD.A0R();
        this.A07 = A0R;
        A0R.setAntiAlias(true);
        AbstractC166987dD.A1R(A0R);
        A0R.setColor(-1);
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A08 = A0S;
        A0S.setColor(-16777216);
        A0S.setTextAlign(Paint.Align.CENTER);
        A0S.setTextSize(this.A06);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00 + this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00 + this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
        this.A08.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
        this.A08.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        float f = this.A04;
        canvas.translate(f, f);
        float f2 = this.A05;
        canvas.drawCircle(f2, f2, f2, this.A07);
        String str = this.A03;
        if (str != null) {
            canvas.drawText(str, f2, (this.A06 / 3.0f) + f2, this.A08);
        }
        canvas.restore();
    }
}
