package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.facebook.R;

/* renamed from: X.Vmu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69410Vmu {
    public final Paint A00;
    public final W4X A01;
    public final W4X A02;
    public final W4X A03;
    public final W4X A04;
    public final W4X A05;
    public final W4X A06;
    public final W4X A07;

    public C69410Vmu(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC1343565e.A00(context, UEx.class.getCanonicalName(), R.attr.materialCalendarStyle), C65N.A0L);
        this.A01 = W4X.A00(context, obtainStyledAttributes.getResourceId(3, 0));
        this.A02 = W4X.A00(context, obtainStyledAttributes.getResourceId(1, 0));
        this.A03 = W4X.A00(context, obtainStyledAttributes.getResourceId(2, 0));
        this.A05 = W4X.A00(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList A01 = AbstractC1567371w.A01(context, obtainStyledAttributes, 6);
        this.A07 = W4X.A00(context, obtainStyledAttributes.getResourceId(8, 0));
        this.A04 = W4X.A00(context, obtainStyledAttributes.getResourceId(7, 0));
        this.A06 = W4X.A00(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setColor(A01.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
