package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.shapes.RectShape;

/* renamed from: X.7IH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7IH {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final int A0O;
    public final int A0P;
    public final Drawable A0Q;
    public final Drawable A0R;
    public final ShapeDrawable A0S;
    public final TransitionDrawable A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final int[] A0X;
    public final Drawable A0Y;
    public final Drawable A0Z;

    public C7IH(Context context, Drawable drawable, Drawable drawable2, String str, String str2, String str3, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, boolean z) {
        Drawable drawable3;
        int i28 = i5;
        this.A0O = i;
        this.A0P = i2;
        this.A0A = i3;
        this.A0H = i4;
        this.A00 = i6;
        this.A03 = i7;
        this.A01 = i8;
        this.A02 = i9;
        this.A0D = i10;
        this.A0E = i11;
        this.A0F = i12;
        this.A0C = i13;
        this.A0K = i14;
        this.A06 = i15;
        this.A0L = i16;
        this.A0M = i17;
        this.A0N = i18;
        this.A0G = i19;
        this.A04 = i20;
        this.A0X = iArr;
        this.A0B = i21;
        this.A08 = i22;
        this.A0U = str;
        this.A0W = str2;
        this.A0V = str3;
        this.A0R = drawable;
        this.A0Q = drawable2;
        this.A0I = i24;
        this.A0J = i25;
        this.A05 = i26;
        this.A09 = i27;
        if (AbstractC72723Nt.A00(context)) {
            drawable3 = this.A0Q;
        } else {
            drawable3 = this.A0R;
        }
        drawable3 = drawable3 == null ? new ColorDrawable(this.A0H) : drawable3;
        this.A0Y = drawable3;
        drawable2 = drawable2 == null ? new ColorDrawable(i28) : drawable2;
        this.A0Z = drawable2;
        this.A07 = z ? i28 : i4;
        Drawable[] drawableArr = new Drawable[2];
        if (z) {
            drawableArr[0] = drawable2;
            drawableArr[1] = drawable3;
        } else {
            drawableArr[0] = drawable3;
            drawableArr[1] = drawable2;
        }
        this.A0T = new TransitionDrawable(drawableArr);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        this.A0S = shapeDrawable;
        AbstractC148406mA.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, i23);
    }
}
