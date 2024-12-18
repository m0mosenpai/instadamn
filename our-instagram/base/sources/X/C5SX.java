package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.5SX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5SX extends Drawable {
    public int A00;
    public Integer A01;
    public int A02;
    public Drawable A03;
    public Drawable A04;
    public Drawable A05;
    public Drawable A06;
    public final int A07;
    public final int A08;
    public final Paint A09;
    public final RectF A0A;
    public final Drawable A0B;
    public final boolean A0C;
    public final int[] A0D;

    public C5SX(Context context, C5SV c5sv, boolean z, boolean z2) {
        int color;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c5sv, 2);
        this.A0C = z;
        Drawable drawable = context.getDrawable(R.drawable.tooltip_nub_top);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            C14360o3.A07(mutate);
            this.A06 = mutate;
            Drawable drawable2 = context.getDrawable(R.drawable.tooltip_nub_bottom);
            if (drawable2 != null) {
                Drawable mutate2 = drawable2.mutate();
                C14360o3.A07(mutate2);
                this.A03 = mutate2;
                Drawable drawable3 = context.getDrawable(R.drawable.tooltip_nub_right);
                if (drawable3 != null) {
                    Drawable mutate3 = drawable3.mutate();
                    C14360o3.A07(mutate3);
                    this.A05 = mutate3;
                    Drawable drawable4 = context.getDrawable(R.drawable.tooltip_nub_left);
                    if (drawable4 != null) {
                        Drawable mutate4 = drawable4.mutate();
                        C14360o3.A07(mutate4);
                        this.A04 = mutate4;
                        Drawable drawable5 = context.getDrawable(c5sv.A01);
                        if (drawable5 != null) {
                            Drawable mutate5 = drawable5.mutate();
                            C14360o3.A07(mutate5);
                            this.A0B = mutate5;
                            this.A09 = new Paint(1);
                            this.A0A = new RectF();
                            this.A08 = context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
                            this.A0D = new int[4];
                            this.A02 = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
                            Integer num = c5sv.A04;
                            if (num != null) {
                                color = num.intValue();
                            } else {
                                color = context.getColor(c5sv.A00);
                            }
                            this.A07 = color;
                            this.A01 = C05F.A01;
                            if (C14640oc.A0G()) {
                                this.A02 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                                Drawable drawable6 = context.getDrawable(R.drawable.prism_tooltip_nub_top);
                                if (drawable6 != null) {
                                    this.A06 = drawable6.mutate();
                                    Drawable drawable7 = context.getDrawable(R.drawable.prism_tooltip_nub_bottom);
                                    if (drawable7 != null) {
                                        this.A03 = drawable7.mutate();
                                        Drawable drawable8 = context.getDrawable(R.drawable.prism_tooltip_nub_right);
                                        if (drawable8 != null) {
                                            this.A05 = drawable8.mutate();
                                            Drawable drawable9 = context.getDrawable(R.drawable.prism_tooltip_nub_left);
                                            if (drawable9 != null) {
                                                this.A04 = drawable9.mutate();
                                            } else {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            if (z2) {
                                this.A02 = context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
                            }
                            int i = 0;
                            do {
                                this.A0D[i] = context.getResources().getDimensionPixelSize(c5sv.A05[i]);
                                i++;
                            } while (i < 4);
                            setColorFilter(C3DY.A00(this.A07));
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        C14360o3.A0B(canvas, 0);
        if (this.A0C) {
            this.A0B.draw(canvas);
        }
        Paint paint = this.A09;
        paint.setColor(this.A07);
        RectF rectF = this.A0A;
        float f = this.A02;
        canvas.drawRoundRect(rectF, f, f, paint);
        int intValue = this.A01.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        drawable = this.A04;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    drawable = this.A05;
                }
            } else {
                drawable = this.A03;
            }
        } else {
            drawable = this.A06;
        }
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        A00(rect, this);
    }

    public static final void A00(Rect rect, C5SX c5sx) {
        RectF rectF;
        Drawable drawable;
        int intrinsicWidth;
        int i;
        int intrinsicWidth2;
        int i2;
        int intrinsicHeight;
        int i3;
        int intValue = c5sx.A01.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        rectF = c5sx.A0A;
                        int i4 = rect.left;
                        drawable = c5sx.A04;
                        float intrinsicWidth3 = i4 + drawable.getIntrinsicWidth() + 1;
                        int i5 = rect.top;
                        int i6 = c5sx.A08;
                        rectF.set(intrinsicWidth3, i5 + i6, rect.right - i6, rect.bottom - i6);
                        intrinsicWidth = rect.left + 1;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    rectF = c5sx.A0A;
                    int i7 = rect.left;
                    float f = rect.top + c5sx.A08;
                    int i8 = rect.right;
                    drawable = c5sx.A05;
                    rectF.set(i7 + r10, f, (i8 - drawable.getIntrinsicWidth()) + 1, rect.bottom - r10);
                    intrinsicWidth = rect.right - drawable.getIntrinsicWidth();
                }
                if (intrinsicWidth < 0) {
                    intrinsicWidth = 0;
                }
                i = rect.centerY() - (drawable.getIntrinsicHeight() / 2);
                intrinsicWidth2 = drawable.getIntrinsicWidth() + intrinsicWidth;
                i2 = rect.centerY();
                intrinsicHeight = drawable.getIntrinsicHeight() / 2;
            } else {
                rectF = c5sx.A0A;
                int i9 = rect.left;
                int i10 = c5sx.A08;
                float f2 = i9 + i10;
                float f3 = rect.top + i10;
                float f4 = rect.right - i10;
                int i11 = rect.bottom;
                drawable = c5sx.A03;
                rectF.set(f2, f3, f4, (i11 - drawable.getIntrinsicHeight()) + 1);
                intrinsicWidth = c5sx.A00 - (drawable.getIntrinsicWidth() / 2);
                if (intrinsicWidth < 0) {
                    intrinsicWidth = 0;
                }
                i = rect.bottom - drawable.getIntrinsicHeight();
                intrinsicWidth2 = drawable.getIntrinsicWidth() + intrinsicWidth;
                i3 = rect.bottom;
                drawable.setBounds(intrinsicWidth, i, intrinsicWidth2, i3);
                Drawable drawable2 = c5sx.A0B;
                float f5 = rectF.left;
                int[] iArr = c5sx.A0D;
                drawable2.setBounds(C1H4.A01(f5 - iArr[0]), C1H4.A01(rectF.top - iArr[1]), C1H4.A01(rectF.right + iArr[2]), C1H4.A01(rectF.bottom + iArr[3]));
                c5sx.invalidateSelf();
            }
        } else {
            rectF = c5sx.A0A;
            int i12 = rect.left;
            int i13 = c5sx.A08;
            int i14 = rect.top;
            drawable = c5sx.A06;
            rectF.set(i12 + i13, (i14 + drawable.getIntrinsicHeight()) - 1, rect.right - i13, rect.bottom - i13);
            intrinsicWidth = c5sx.A00 - (drawable.getIntrinsicWidth() / 2);
            if (intrinsicWidth < 0) {
                intrinsicWidth = 0;
            }
            i = rect.top;
            intrinsicWidth2 = drawable.getIntrinsicWidth() + intrinsicWidth;
            i2 = rect.top;
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        i3 = i2 + intrinsicHeight;
        drawable.setBounds(intrinsicWidth, i, intrinsicWidth2, i3);
        Drawable drawable22 = c5sx.A0B;
        float f52 = rectF.left;
        int[] iArr2 = c5sx.A0D;
        drawable22.setBounds(C1H4.A01(f52 - iArr2[0]), C1H4.A01(rectF.top - iArr2[1]), C1H4.A01(rectF.right + iArr2[2]), C1H4.A01(rectF.bottom + iArr2[3]));
        c5sx.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
        this.A03.setAlpha(i);
        this.A05.setAlpha(i);
        this.A04.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
        this.A03.setColorFilter(colorFilter);
        this.A05.setColorFilter(colorFilter);
        this.A04.setColorFilter(colorFilter);
    }
}
