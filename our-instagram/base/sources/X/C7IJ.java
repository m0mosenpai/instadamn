package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.Shape;
import com.facebook.R;

/* renamed from: X.7IJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7IJ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final C7II A0A;
    public final int[] A0B;
    public final int[] A0C;

    public C7IJ(Context context, C7II c7ii, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        C14360o3.A0B(iArr, 6);
        C14360o3.A0B(iArr2, 7);
        this.A09 = context;
        this.A04 = i;
        this.A05 = i2;
        this.A06 = i3;
        this.A08 = i4;
        this.A0C = iArr;
        this.A0B = iArr2;
        this.A02 = i5;
        this.A03 = i6;
        this.A01 = i7;
        this.A00 = i8;
        this.A07 = i9;
        this.A0A = c7ii;
    }

    public final void A00(Drawable drawable, AnonymousClass541 anonymousClass541, C7R2 c7r2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        float f;
        float f2;
        C162867Qx c162867Qx;
        int i;
        float f3;
        float f4;
        int[] iArr;
        int i2;
        if (z) {
            C7II c7ii = this.A0A;
            Context context = this.A09;
            C14360o3.A0A(c7r2);
            C14360o3.A0B(context, 0);
            C14360o3.A0B(c7r2, 2);
            if (AbstractC13620mo.A02(context)) {
                f3 = c7ii.A01;
                f4 = c7ii.A02;
            } else {
                f3 = c7ii.A02;
                f4 = c7ii.A01;
            }
            C162247Oj c162247Oj = (C162247Oj) C162247Oj.A06.get(drawable);
            if (c162247Oj != null) {
                if (!C7II.A02(context, c162247Oj, anonymousClass541)) {
                    if (z4) {
                        iArr = c7ii.A0D;
                    } else if (!z3 && !z5) {
                        iArr = c7ii.A0B;
                    } else {
                        iArr = c7ii.A0C;
                    }
                    if (z2) {
                        if (z4) {
                            i2 = c7ii.A06;
                        } else {
                            i2 = c7ii.A05;
                            if (i2 == c7ii.A03 && C14640oc.A07()) {
                                i2 = c7ii.A07;
                            }
                        }
                        c162247Oj.A01(i2);
                    } else {
                        int length = iArr.length;
                        if (length == 0) {
                            c162247Oj.A01(context.getColor(R.color.grey_6));
                        } else if (length == 1) {
                            c162247Oj.A01(iArr[0]);
                        } else {
                            float A00 = c7ii.A08.A00();
                            AbstractC148406mA.A01(null, Paint.Cap.BUTT, Paint.Style.FILL, c162247Oj.A01, c162247Oj.A03, iArr, A00, 0.0f);
                            c162247Oj.A00.getPaint().setAlpha(0);
                        }
                    }
                }
                Shape shape = c162247Oj.A03;
                if (shape instanceof AbstractC148416mB) {
                    C14360o3.A0C(shape, "null cannot be cast to non-null type com.facebook.common.messagingui.roundedcornergradientdrawable.shape.RoundedRectShape");
                    C7II.A01((AbstractC148416mB) shape, c7r2, c7ii, f3, f4);
                }
                if (AbstractC001800i.A0u(AbstractC16960so.A1Q(AnonymousClass541.A0E, AnonymousClass541.A0F, AnonymousClass541.A0A), anonymousClass541)) {
                    c162867Qx = c162247Oj.A04;
                } else {
                    C162867Qx c162867Qx2 = c162247Oj.A04;
                    if (c162867Qx2 == null) {
                        return;
                    }
                    c162867Qx2.setAlpha(0);
                    return;
                }
            } else {
                return;
            }
        } else {
            C7II c7ii2 = this.A0A;
            Context context2 = this.A09;
            C14360o3.A0A(c7r2);
            C14360o3.A0B(context2, 0);
            C14360o3.A0B(c7r2, 2);
            if (AbstractC13620mo.A02(context2)) {
                f = c7ii2.A02;
                f2 = c7ii2.A01;
            } else {
                f = c7ii2.A01;
                f2 = c7ii2.A02;
            }
            int A03 = c7ii2.A03(z4, z3, z5, z2);
            C162247Oj c162247Oj2 = (C162247Oj) C162247Oj.A06.get(drawable);
            if (c162247Oj2 == null) {
                return;
            }
            if (!C7II.A02(context2, c162247Oj2, anonymousClass541)) {
                float f5 = c7ii2.A00;
                if (f5 == 0.0f) {
                    c162247Oj2.A01(A03);
                } else if (c7ii2.A04 == 0) {
                    c162247Oj2.A02(c7ii2.A03, f5, true);
                } else {
                    c162247Oj2.A03(A03, c7ii2.A03, f5);
                }
            }
            Shape shape2 = c162247Oj2.A03;
            if (shape2 instanceof AbstractC148416mB) {
                C14360o3.A0C(shape2, "null cannot be cast to non-null type com.facebook.common.messagingui.roundedcornergradientdrawable.shape.RoundedRectShape");
                C7II.A01((AbstractC148416mB) shape2, c7r2, c7ii2, f, f2);
            }
            boolean A0u = AbstractC001800i.A0u(AbstractC16960so.A1Q(AnonymousClass541.A0E, AnonymousClass541.A0F, AnonymousClass541.A0A), anonymousClass541);
            c162867Qx = c162247Oj2.A04;
            if (!A0u) {
                if (c162867Qx == null) {
                    return;
                }
                i = 0;
                c162867Qx.setAlpha(i);
            }
        }
        if (c162867Qx != null) {
            i = 255;
            c162867Qx.setAlpha(i);
        }
    }
}
