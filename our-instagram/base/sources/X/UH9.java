package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class UH9 extends AbstractC70653Fc {
    public float A00;
    public UHP A01;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Rect A07;
    public final C69328Vla A08;
    public final boolean A09;
    public final boolean A0A;
    public final int A0B;
    public final int A0C;
    public final Paint A0D = new Paint();
    public final RectF A0F = new RectF();
    public final RectF A0E = new RectF();
    public boolean A02 = false;

    @Override // X.AbstractC70653Fc
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C3F5 c3f5) {
        RectF rectF;
        RectF rectF2;
        float f;
        int i;
        Rect rect;
        int width;
        UHP uhp = this.A01;
        if (uhp != null && !this.A02 && !uhp.A04 && uhp.A02) {
            RunnableC71404WtS runnableC71404WtS = new RunnableC71404WtS(recyclerView, uhp);
            uhp.A01 = runnableC71404WtS;
            recyclerView.postDelayed(runnableC71404WtS, 1500L);
        }
        boolean z = true;
        this.A02 = true;
        if (this.A00 != 0.0f) {
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            if (abstractC70663Fe instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC70663Fe;
                boolean A1P = AbstractC167007dF.A1P(((AbstractC70663Fe) linearLayoutManager).A07.getLayoutDirection(), 1);
                if (linearLayoutManager.A01 == 1) {
                    int A0a = linearLayoutManager.A0a(c3f5);
                    int A0c = linearLayoutManager.A0c(c3f5);
                    int height = recyclerView.getHeight();
                    boolean z2 = this.A0A;
                    if (z2) {
                        Rect rect2 = this.A07;
                        height = (height - rect2.top) - rect2.bottom;
                    }
                    int A0b = linearLayoutManager.A0b(c3f5);
                    if (A0c != A0a) {
                        int round = Math.round((height * A0a) / A0c);
                        int i2 = height / 2;
                        if (round > i2) {
                            round = i2;
                        }
                        int round2 = Math.round(((height - round) * A0b) / (A0c - A0a));
                        rectF = this.A0F;
                        if (A1P) {
                            rect = this.A07;
                            int i3 = rect.right;
                            rectF.left = i3;
                            width = this.A06 + i3;
                        } else {
                            int width2 = recyclerView.getWidth() - this.A06;
                            rect = this.A07;
                            rectF.left = width2 - rect.right;
                            width = recyclerView.getWidth() - rect.right;
                        }
                        float f2 = width;
                        rectF.right = f2;
                        rectF.top = round2;
                        rectF.bottom = round2 + round;
                        rectF2 = this.A0E;
                        rectF2.left = rectF.left;
                        rectF2.right = f2;
                        rectF2.top = 0.0f;
                        rectF2.bottom = recyclerView.getHeight();
                        if (z2) {
                            float f3 = rectF.top;
                            float f4 = rect.top;
                            rectF.top = f3 + f4;
                            rectF.bottom += f4;
                            rectF2.top += f4;
                            rectF2.bottom -= rect.bottom;
                        }
                    } else {
                        return;
                    }
                } else {
                    int A0X = linearLayoutManager.A0X(c3f5);
                    int A0Z = linearLayoutManager.A0Z(c3f5);
                    int width3 = recyclerView.getWidth();
                    boolean z3 = this.A0A;
                    if (z3) {
                        Rect rect3 = this.A07;
                        width3 = (width3 - rect3.left) - rect3.right;
                    }
                    int A0Y = linearLayoutManager.A0Y(c3f5);
                    if (A0Z == A0X) {
                        return;
                    }
                    int round3 = Math.round((width3 * A0X) / A0Z);
                    int i4 = width3 / 2;
                    if (round3 > i4) {
                        round3 = i4;
                    }
                    int round4 = Math.round(((width3 - round3) * A0Y) / (A0Z - A0X));
                    rectF = this.A0F;
                    rectF.left = round4;
                    rectF.right = round4 + round3;
                    int height2 = recyclerView.getHeight() - this.A06;
                    Rect rect4 = this.A07;
                    rectF.top = height2 - rect4.bottom;
                    rectF.bottom = recyclerView.getHeight() - rect4.bottom;
                    rectF2 = this.A0E;
                    rectF2.left = 0.0f;
                    rectF2.top = rectF.top;
                    rectF2.right = recyclerView.getWidth();
                    rectF2.bottom = rectF.bottom;
                    if (z3) {
                        float f5 = rectF.left;
                        if (A1P) {
                            float f6 = rect4.right;
                            rectF.left = f5 + f6;
                            rectF.right += f6;
                            rectF2.left += f6;
                            f = rectF2.right;
                            i = rect4.left;
                        } else {
                            float f7 = rect4.left;
                            rectF.left = f5 + f7;
                            rectF.right += f7;
                            rectF2.left += f7;
                            f = rectF2.right;
                            i = rect4.right;
                        }
                        rectF2.right = f - i;
                    }
                }
                int i5 = this.A03;
                if (i5 != 0) {
                    C69328Vla c69328Vla = this.A08;
                    float f8 = c69328Vla.A03;
                    if (f8 != 0.0f && canvas.isHardwareAccelerated()) {
                        this.A0D.setShadowLayer(f8, c69328Vla.A01, c69328Vla.A00, c69328Vla.A05);
                    } else {
                        z = false;
                    }
                    Paint paint = this.A0D;
                    paint.setColor(i5);
                    paint.setAlpha((int) (this.A00 * this.A0B));
                    float f9 = this.A05;
                    canvas.drawRoundRect(rectF2, f9, f9, paint);
                    if (z) {
                        paint.clearShadowLayer();
                    }
                }
                Paint paint2 = this.A0D;
                paint2.setColor(this.A04);
                paint2.setAlpha((int) (this.A00 * this.A0C));
                float f10 = this.A05;
                canvas.drawRoundRect(rectF, f10, f10, paint2);
            }
        }
    }

    public UH9(Rect rect, C69328Vla c69328Vla, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A03 = i2;
        this.A04 = i;
        this.A0C = Color.alpha(i);
        this.A0B = Color.alpha(i2);
        this.A06 = i3;
        this.A05 = i4;
        this.A09 = z;
        if (z) {
            this.A00 = 1.0f;
        }
        this.A07 = rect;
        this.A0A = z2;
        this.A08 = c69328Vla;
    }
}
