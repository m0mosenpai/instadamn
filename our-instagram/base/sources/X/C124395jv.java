package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import com.facebook.R;

/* renamed from: X.5jv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124395jv {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public Rect A04;
    public Integer A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Rect A09;
    public final C124375jt A0A;
    public final C124375jt A0B;

    public final void A00(int i, int i2) {
        float f = i;
        this.A03 = f;
        float f2 = i2;
        this.A00 = f2;
        this.A02 = f;
        this.A01 = f2;
        boolean z = false;
        this.A0B.A06.A00(0, i, 0, 0);
        this.A0A.A06.A00(0, i2, 0, 0);
        if (i != 0 && i2 != 0) {
            z = true;
        }
        this.A06 = z;
    }

    public C124395jv(Context context, C55952hg c55952hg) {
        Integer num = C05F.A0C;
        this.A0B = new C124375jt(context, c55952hg, num);
        this.A0A = new C124375jt(context, c55952hg, num);
        Paint paint = new Paint();
        paint.setColor(context.getColor(R.color.design_dark_default_color_on_background));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material));
        this.A08 = paint;
        this.A09 = new Rect();
        this.A05 = C05F.A00;
    }
}
