package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jir, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44352Jir extends Drawable {
    public int[] A00 = AbstractC47206Ktf.A02;
    public final Paint A01;
    public final float A02;
    public final float A03;
    public final Paint A04;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C44352Jir(Context context) {
        this.A02 = AbstractC13880nE.A04(context, 2);
        float A04 = AbstractC13880nE.A04(context, 2);
        this.A03 = A04;
        Paint A0S = AbstractC166987dD.A0S(3);
        this.A04 = A0S;
        A0S.setStrokeWidth(A04);
        AbstractC43592JPx.A1E(A0S);
        AbstractC166987dD.A1N(context, A0S, AbstractC53242c7.A07(context));
        this.A01 = AbstractC166987dD.A0S(3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float exactCenterX = bounds.exactCenterX();
        float exactCenterY = bounds.exactCenterY();
        float width = bounds.width() / 2.0f;
        int[] state = getState();
        int length = state.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (state[i] == 16842913) {
                float f = this.A03;
                canvas.drawCircle(exactCenterX, exactCenterY, width - (f / 2.0f), this.A04);
                width = (width - this.A02) - f;
                break;
            }
            i++;
        }
        canvas.drawCircle(exactCenterX, exactCenterY, width, this.A01);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int[] iArr;
        Rect bounds = getBounds();
        if (bounds.width() != 0 && bounds.height() != 0 && (iArr = this.A00) != null) {
            this.A01.setShader(new LinearGradient(bounds.left, bounds.bottom, bounds.right, bounds.top, iArr, (float[]) null, Shader.TileMode.CLAMP));
        }
    }
}
