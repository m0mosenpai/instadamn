package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.Jjq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44410Jjq extends View {
    public C5SW A00;
    public String A01;
    public int A02;
    public int A03;
    public Boolean A04;
    public final ViewParent A05;
    public final Paint A06;
    public final Paint A07;
    public final Path A08;
    public final RectF A09;
    public final float[] A0A;

    public C44410Jjq(Context context, ViewParent viewParent) {
        super(context);
        this.A05 = viewParent;
        this.A01 = "";
        Paint A0R = AbstractC166987dD.A0R();
        Paint.Style style = Paint.Style.FILL;
        A0R.setStyle(style);
        this.A06 = A0R;
        Paint A0R2 = AbstractC166987dD.A0R();
        A0R2.setStyle(style);
        this.A07 = A0R2;
        this.A08 = AbstractC166987dD.A0T();
        this.A09 = AbstractC166987dD.A0X();
        float A08 = AbstractC166997dE.A08(getResources());
        float[] fArr = new float[8];
        fArr[0] = A08;
        AbstractC43594JPz.A1U(fArr, A08, 1);
        AbstractC167017dG.A1X(fArr, A08);
        this.A0A = fArr;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        RectF rectF = this.A09;
        rectF.set(0.0f, 0.0f, AbstractC166987dD.A07(this), AbstractC166987dD.A08(this));
        Path path = this.A08;
        path.reset();
        path.addRoundRect(rectF, this.A0A, Path.Direction.CW);
        if (AbstractC166997dE.A1Z(this.A04, false)) {
            paint = this.A07;
        } else {
            paint = this.A06;
        }
        canvas.drawPath(path, paint);
    }

    public final void setTooltipText(String str) {
        C14360o3.A0B(str, 0);
        this.A01 = str;
    }

    public final int getBaseColor() {
        return this.A02;
    }

    @Override // android.view.View
    public final String getTooltipText() {
        return this.A01;
    }

    public final int getUnselectedColor() {
        return this.A03;
    }

    public final void setBarSelected(Boolean bool) {
        C5SW c5sw;
        this.A04 = bool;
        invalidate();
        if (AbstractC31177DnL.A1b(bool) && (c5sw = this.A00) != null) {
            c5sw.A06();
        }
    }

    public final void setBaseColor(int i) {
        this.A02 = i;
        this.A06.setColor(i);
    }

    public final void setUnselectedColor(int i) {
        this.A03 = i;
        this.A07.setColor(i);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewGroup viewGroup;
        C5SU c5su;
        Activity activity;
        super.onLayout(z, i, i2, i3, i4);
        if (getWidth() > 0 && this.A00 == null) {
            Context context = getContext();
            if ((context instanceof Activity) && (activity = (Activity) context) != null) {
                c5su = new C5SU(activity, new C149686oL(this.A01));
            } else {
                ViewParent viewParent = this.A05;
                if (!(viewParent instanceof ViewGroup) || (viewGroup = (ViewGroup) viewParent) == null) {
                    return;
                }
                C14360o3.A07(context);
                c5su = new C5SU(context, viewGroup, new C149686oL(this.A01));
            }
            c5su.A04(this, getWidth() / 2, -10, false);
            c5su.A02();
            c5su.A0B = false;
            this.A00 = c5su.A00();
        }
    }
}
