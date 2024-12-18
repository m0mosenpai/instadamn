package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.Jiu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44355Jiu extends Drawable {
    public static final int[] A08 = {4, 8, 14};
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public final Paint A06 = AbstractC166987dD.A0S(1);
    public final RectF A07 = AbstractC166987dD.A0X();
    public final Deque A05 = new LinkedList();

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Deque deque = this.A05;
        if (!deque.isEmpty() && this.A00 > 0.0f) {
            Iterator it = deque.iterator();
            float f = 0.0f;
            while (it.hasNext()) {
                float f2 = (A08[AbstractC167007dF.A0B(it) - 1] * this.A00) + f;
                RectF rectF = this.A07;
                rectF.set(f, 0.0f, f2, this.A02);
                float f3 = this.A03;
                canvas.drawRoundRect(rectF, f3, f3, this.A06);
                f = this.A01 + f2;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.ceil(this.A02);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) Math.ceil(this.A04);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
    }

    public C44355Jiu(int i) {
        StringBuilder A11;
        boolean z = true;
        while (true) {
            if (i > 0) {
                int i2 = i & 3;
                if (i2 > 0) {
                    this.A05.addFirst(Integer.valueOf(i2));
                    i >>= 2;
                } else {
                    z = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            A11 = AbstractC166997dE.A11("Invalid code value ");
        } else {
            if (this.A05.size() >= 6 && this.A05.size() <= 12) {
                return;
            }
            A11 = AbstractC166997dE.A11("Invalid code value ");
            A11.append(i);
            A11.append(" with length ");
            i = this.A05.size();
        }
        A11.append(i);
        C0w9.A03("LineCodeDrawable", A11.toString());
        this.A05.clear();
    }
}
