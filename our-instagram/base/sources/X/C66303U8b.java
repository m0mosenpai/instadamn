package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.Arrays;

/* renamed from: X.U8b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66303U8b extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public Paint A0D;
    public int A0E;
    public int A0F;
    public final int A0G;
    public final int A0H;
    public final TextPaint A0I;
    public final boolean A0J;
    public final int[] A0K;
    public final StaticLayout[] A0L;
    public final Paint A0M;
    public final InterfaceC71984XDt A0N;

    public C66303U8b(InterfaceC71984XDt interfaceC71984XDt, float f, int i, boolean z) {
        this.A0N = interfaceC71984XDt;
        this.A0G = i;
        this.A0J = z;
        int Bd3 = interfaceC71984XDt.Bd3();
        this.A0H = Bd3;
        this.A0L = new StaticLayout[Bd3];
        this.A0K = new int[Bd3];
        TextPaint textPaint = new TextPaint(1);
        this.A0I = textPaint;
        Paint paint = new Paint(1);
        this.A0M = paint;
        this.A0F = -1;
        this.A0E = -1;
        this.A08 = Integer.MAX_VALUE;
        this.A07 = 255;
        this.A02 = 0.25f;
        this.A03 = 0.9f;
        this.A0B = 1;
        textPaint.setColor(-1);
        textPaint.setTextSize(f);
        textPaint.setFakeBoldText(true);
        this.A06 = VW9.A00(this.A0I);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setAlpha(128);
        setBounds(0, 0, getIntrinsicWidth(), getIntrinsicHeight());
        A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r7 >= r6.A0H) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A03(int r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 < 0) goto L8
            int r0 = r6.A0H
            r4 = 1
            if (r7 < r0) goto L9
        L8:
            r4 = 0
        L9:
            java.lang.String r3 = "ScrollableByPhraseLyricsDrawable: invalid phrase index "
            java.lang.String r2 = " for phrase count "
            int r1 = r6.A0H
            java.lang.String r0 = " in getPhraseCenter()"
            java.lang.String r1 = X.AnonymousClass001.A0n(r3, r2, r0, r7, r1)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.C18C.A0I(r4, r1, r0)
            int[] r0 = r6.A0K
            r0 = r0[r7]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66303U8b.A03(int):int");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        int i2;
        C14360o3.A0B(canvas, 0);
        C14360o3.A07(getBounds());
        canvas.save();
        float f12 = this.A01;
        if (f12 > 0.0f) {
            float f13 = 1.0f - 0.0f;
            float f14 = 0.85f - 1.0f;
            float f15 = 0.0f;
            if (f13 != 0.0f) {
                f15 = (f12 - 0.0f) / f13;
            }
            float f16 = (f15 * f14) + 1.0f;
            canvas.scale(f16, f16, canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f);
        }
        canvas.translate(r5.left, (r5.top + (this.A0E / 2.0f)) - this.A0A);
        int i3 = this.A0A;
        int[] iArr = this.A0K;
        int binarySearch = Arrays.binarySearch(iArr, i3);
        if (binarySearch < 0) {
            binarySearch = Math.min(Math.max(0, ((-binarySearch) - 1) - 1), iArr.length - 1);
        }
        int i4 = this.A0B;
        int max = Math.max(0, binarySearch - i4);
        int i5 = this.A0H - 1;
        int min = Math.min(i4 + binarySearch + 1, i5);
        int i6 = iArr[binarySearch];
        if (binarySearch < i5) {
            i = iArr[binarySearch + 1];
        } else {
            i = (i6 - iArr[binarySearch - 1]) + i6;
        }
        float f17 = 1.0f;
        float A02 = AbstractC13600mm.A02(this.A0A, i6, i, 0.0f, 1.0f);
        int i7 = this.A04;
        int i8 = iArr[i7];
        StaticLayout[] staticLayoutArr = this.A0L;
        StaticLayout staticLayout = staticLayoutArr[i7];
        if (staticLayout != null) {
            int height = i8 - (staticLayout.getHeight() / 2);
            int i9 = this.A0G / 2;
            int i10 = height - i9;
            StaticLayout staticLayout2 = staticLayoutArr[i7];
            if (staticLayout2 != null) {
                int height2 = (staticLayout2.getHeight() / 2) + i8 + i9;
                int i11 = this.A0A;
                if (i11 < i10) {
                    f17 = -1.0f;
                } else if (i11 <= height2) {
                    if (staticLayoutArr[i7] != null) {
                        float height3 = r0.getHeight() * this.A00;
                        int i12 = this.A0A;
                        float f18 = i12;
                        if (i12 < i8) {
                            f = i10;
                            f2 = i8 - height3;
                            f3 = -1.0f;
                            f4 = 0.0f;
                        } else {
                            f = i8 + height3;
                            f2 = height2;
                            f3 = 0.0f;
                            f4 = 1.0f;
                        }
                        f17 = AbstractC13600mm.A02(f18, f, f2, f3, f4);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                if (max <= min) {
                    while (true) {
                        canvas.save();
                        float f19 = iArr[max];
                        if (staticLayoutArr[max] != null) {
                            canvas.translate(0.0f, f19 - (r0.getHeight() / 2.0f));
                            if (max == this.A04) {
                                float abs = 1.0f - Math.abs(f17);
                                float f20 = this.A02;
                                float f21 = this.A07;
                                f5 = (int) (f20 * f21);
                                f6 = 1.0f - 0.0f;
                                f7 = (f21 * 1.0f) - f5;
                                f8 = 0.0f;
                                if (f6 != 0.0f) {
                                    f9 = abs - 0.0f;
                                    f8 = f9 / f6;
                                }
                                f10 = (f8 * f7) + f5;
                            } else {
                                int i13 = binarySearch - max;
                                int i14 = this.A0B;
                                boolean z = true;
                                if (i13 != i14 && (max - binarySearch) - 1 != i14) {
                                    f10 = this.A02 * this.A07;
                                } else {
                                    if (max <= binarySearch) {
                                        z = false;
                                    }
                                    int i15 = (int) (this.A02 * this.A07);
                                    if (z) {
                                        f5 = 0.0f;
                                        f6 = 1.0f - 0.0f;
                                        f7 = i15 - 0.0f;
                                    } else {
                                        f5 = i15;
                                        f6 = 1.0f - 0.0f;
                                        f7 = 0.0f - f5;
                                    }
                                    f8 = 0.0f;
                                    if (f6 != 0.0f) {
                                        f9 = A02 - 0.0f;
                                        f8 = f9 / f6;
                                    }
                                    f10 = (f8 * f7) + f5;
                                }
                            }
                            int i16 = (int) f10;
                            float f22 = this.A01;
                            if (f22 > 0.0f && (max < binarySearch - 1 || max > binarySearch + 1)) {
                                i16 = (int) (i16 * AbstractC58322PtE.A01(1.0f, f22, 0.0f));
                            }
                            StaticLayout staticLayout3 = staticLayoutArr[max];
                            if (staticLayout3 != null) {
                                staticLayout3.getPaint().setAlpha(i16);
                                if (max == this.A04 && !this.A0J) {
                                    float abs2 = 1.0f - Math.abs(f17);
                                    float f23 = this.A03;
                                    float f24 = 1.0f - 0.0f;
                                    float f25 = 1.0f - f23;
                                    float f26 = 0.0f;
                                    if (f24 != 0.0f) {
                                        f26 = (abs2 - 0.0f) / f24;
                                    }
                                    f11 = (f26 * f25) + f23;
                                } else {
                                    f11 = this.A03;
                                }
                                float f27 = this.A0F / 2.0f;
                                StaticLayout staticLayout4 = staticLayoutArr[max];
                                if (staticLayout4 != null) {
                                    i2 = staticLayout4.getHeight();
                                } else {
                                    i2 = 0;
                                }
                                canvas.scale(f11, f11, f27, i2 / 2.0f);
                                StaticLayout staticLayout5 = staticLayoutArr[max];
                                if (staticLayout5 != null) {
                                    Paint paint = this.A0D;
                                    if (paint != null) {
                                        Rect rect = new Rect(C6RE.A00(staticLayout5) - this.A05, staticLayout5.getLineTop(0) - this.A0C, C6RE.A01(staticLayout5) + this.A05, staticLayout5.getLineBottom(staticLayout5.getLineCount() - 1) + this.A0C);
                                        Paint paint2 = new Paint(paint);
                                        paint2.setAlpha(i16);
                                        canvas.drawRect(rect, paint2);
                                    }
                                    staticLayout5.draw(canvas);
                                }
                                canvas.restore();
                                if (max == min) {
                                    break;
                                } else {
                                    max++;
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                canvas.restore();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        if (this.A0F != rect.width() || this.A0E != rect.height()) {
            this.A0F = rect.width();
            this.A0E = rect.height();
            A01(this);
        }
    }

    private final void A00() {
        int i;
        int abs;
        int height;
        int i2 = this.A0A;
        int[] iArr = this.A0K;
        StaticLayout[] staticLayoutArr = this.A0L;
        int length = iArr.length;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            binarySearch = Math.min(Math.max(0, ((-binarySearch) - 1) - 1), length - 1);
        }
        try {
            int i3 = iArr[binarySearch];
            if (i3 != i2) {
                if (i3 < i2) {
                    if (binarySearch != length - 1) {
                        i = binarySearch + 1;
                        StaticLayout staticLayout = staticLayoutArr[binarySearch];
                        if (staticLayout != null) {
                            abs = Math.abs((i3 + (staticLayout.getHeight() / 2)) - i2);
                            int i4 = iArr[i];
                            StaticLayout staticLayout2 = staticLayoutArr[i];
                            if (staticLayout2 != null) {
                                height = i4 - (staticLayout2.getHeight() / 2);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } else if (binarySearch != 0) {
                    i = binarySearch - 1;
                    StaticLayout staticLayout3 = staticLayoutArr[binarySearch];
                    if (staticLayout3 != null) {
                        abs = Math.abs((i3 - (staticLayout3.getHeight() / 2)) - i2);
                        int i5 = iArr[i];
                        StaticLayout staticLayout4 = staticLayoutArr[i];
                        if (staticLayout4 != null) {
                            height = i5 + (staticLayout4.getHeight() / 2);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                if (abs >= Math.abs(height - i2)) {
                    binarySearch = i;
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            binarySearch = 0;
        }
        this.A04 = binarySearch;
    }

    public static final void A01(C66303U8b c66303U8b) {
        Layout.Alignment alignment;
        int i;
        if (c66303U8b.A0F != -1 && c66303U8b.A0E != -1) {
            int i2 = c66303U8b.A0H;
            for (int i3 = 0; i3 < i2; i3++) {
                String Bd2 = c66303U8b.A0N.Bd2(i3);
                StaticLayout[] staticLayoutArr = c66303U8b.A0L;
                TextPaint textPaint = c66303U8b.A0I;
                int i4 = c66303U8b.A0F;
                AbstractC167017dG.A1P(textPaint, Bd2);
                int i5 = c66303U8b.A08;
                if (c66303U8b.A0J) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
                staticLayoutArr[i3] = AbstractC70057W0r.A00(alignment, textPaint, Bd2, i5, i4);
                int[] iArr = c66303U8b.A0K;
                if (i3 != 0) {
                    int i6 = i3 - 1;
                    int i7 = iArr[i6];
                    StaticLayout staticLayout = staticLayoutArr[i6];
                    if (staticLayout != null) {
                        int height = i7 + (staticLayout.getHeight() / 2) + c66303U8b.A0G;
                        StaticLayout staticLayout2 = staticLayoutArr[i3];
                        if (staticLayout2 != null) {
                            i = height + (staticLayout2.getHeight() / 2);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    i = 0;
                }
                iArr[i3] = i;
            }
            c66303U8b.A09 = c66303U8b.A0K[i2 - 1];
        }
    }

    public final int A02(int i) {
        int[] iArr = this.A0K;
        C14360o3.A0B(iArr, 1);
        int length = iArr.length;
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            binarySearch = Math.min(Math.max(0, ((-binarySearch) - 1) - 1), length - 1);
        }
        int i2 = iArr[binarySearch];
        if (i != i2 && binarySearch < length - 1) {
            int abs = Math.abs(i2 - i);
            int i3 = binarySearch + 1;
            if (abs >= Math.abs(iArr[i3] - i)) {
                binarySearch = i3;
            }
            return iArr[binarySearch];
        }
        return i2;
    }

    public final void A04(int i) {
        this.A0A = Math.max(0, Math.min(i, this.A09));
        A00();
        invalidateSelf();
    }

    public final void A05(int i) {
        this.A0I.setColor(i);
        this.A07 = Color.alpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A07 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0I.setColorFilter(colorFilter);
        Paint paint = this.A0D;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }
}
