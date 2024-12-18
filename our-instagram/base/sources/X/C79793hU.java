package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import com.facebook.litho.TextContent;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3hU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79793hU extends Drawable implements Drawable.Callback, TextContent, InterfaceC51172Wp {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public Path A08;
    public Handler A09;
    public Layout A0A;
    public C5M7 A0B;
    public D23 A0C;
    public CharSequence A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public ClickableSpan[] A0I;
    public ImageSpan[] A0J;
    public float A0K;
    public Paint A0L;
    public boolean A0M;

    public static C5M7 A01(C79793hU c79793hU) {
        Layout layout = c79793hU.A0A;
        if (layout == null) {
            return null;
        }
        C5M7 c5m7 = c79793hU.A0B;
        if (c5m7 == null) {
            C5M7 c5m72 = new C5M7(layout.getPaint().getTypeface(), c79793hU, c79793hU.A0D, layout.getPaint().getTextSize(), (layout.getPaint().getFontMetricsInt(null) * layout.getSpacingMultiplier()) + layout.getSpacingAdd(), c79793hU.A0A.getPaint().getColor(), layout.getLineCount());
            c79793hU.A0B = c5m72;
            return c5m72;
        }
        return c5m7;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private int A00(int i, int i2) {
        float width;
        float lineMax;
        int lineForVertical = this.A0A.getLineForVertical(i2);
        Layout.Alignment alignment = this.A0A.getAlignment();
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        Layout layout = this.A0A;
        if (alignment == alignment2) {
            width = layout.getLineLeft(lineForVertical);
            lineMax = this.A0A.getLineRight(lineForVertical);
        } else {
            int paragraphDirection = layout.getParagraphDirection(lineForVertical);
            Layout.Alignment paragraphAlignment = this.A0A.getParagraphAlignment(lineForVertical);
            boolean z = true;
            if (paragraphDirection != -1 ? paragraphDirection != 1 || paragraphAlignment != Layout.Alignment.ALIGN_OPPOSITE : paragraphAlignment != Layout.Alignment.ALIGN_NORMAL) {
                z = false;
                width = this.A0A.getParagraphLeft(lineForVertical);
            } else {
                width = this.A0A.getWidth() - this.A0A.getLineMax(lineForVertical);
            }
            Layout layout2 = this.A0A;
            if (z) {
                lineMax = layout2.getParagraphRight(lineForVertical);
            } else {
                lineMax = layout2.getLineMax(lineForVertical);
            }
        }
        float f = i;
        if (f >= width && f <= lineMax) {
            try {
                return this.A0A.getOffsetForHorizontal(lineForVertical, f);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -1;
    }

    private void A02() {
        Handler handler = this.A09;
        if (handler != null) {
            handler.removeCallbacks(this.A0C);
            this.A0C = null;
        }
        this.A0F = false;
    }

    private void A03(int i, int i2) {
        if (Color.alpha(this.A02) != 0) {
            if (this.A05 == i && this.A04 == i2) {
                return;
            }
            this.A05 = i;
            this.A04 = i2;
            Paint paint = this.A0L;
            if (paint == null) {
                paint = new Paint();
                this.A0L = paint;
            }
            paint.setColor(this.A02);
            this.A0G = true;
            invalidateSelf();
        }
    }

    private void A04(Canvas canvas) {
        if (this.A01 > 0.0f) {
            TextPaint paint = this.A0A.getPaint();
            int color = paint.getColor();
            Paint.Style style = paint.getStyle();
            float strokeWidth = paint.getStrokeWidth();
            Paint.Join strokeJoin = paint.getStrokeJoin();
            paint.setStrokeJoin(Paint.Join.ROUND);
            int i = this.A03;
            if (i == 0) {
                i = AD5.A00(paint);
            }
            paint.setColor(i);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.A01);
            this.A0A.draw(canvas);
            paint.setStrokeWidth(strokeWidth);
            paint.setStyle(style);
            paint.setColor(color);
            paint.setStrokeJoin(strokeJoin);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (r11.length <= 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(android.content.res.ColorStateList r7, android.text.Layout r8, java.lang.CharSequence r9, java.lang.String r10, android.text.style.ClickableSpan[] r11, android.text.style.ImageSpan[] r12, float r13, float r14, float r15, int r16, int r17, int r18, boolean r19) {
        /*
            r6 = this;
            r6.A0A = r8
            r6.A0K = r13
            r6.A00 = r14
            r0 = r19
            r6.A0M = r0
            r6.A0D = r9
            r6.A0I = r11
            android.os.Handler r0 = r6.A09
            if (r0 != 0) goto L25
            if (r11 == 0) goto L25
            int r2 = r11.length
            r1 = 0
        L16:
            if (r1 >= r2) goto L25
            r0 = r11[r1]
            boolean r0 = r0 instanceof X.AbstractC89933zZ
            if (r0 == 0) goto L88
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r6.A09 = r0
        L25:
            r5 = 1
            r4 = 0
            if (r11 == 0) goto L2d
            int r1 = r11.length
            r0 = 1
            if (r1 > 0) goto L2e
        L2d:
            r0 = 0
        L2e:
            r6.A0H = r0
            r0 = r17
            r6.A02 = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L43
            r6.A01 = r15
            r0 = r18
            r6.A03 = r0
            r6.invalidateSelf()
        L43:
            r1 = r16
            if (r16 == 0) goto L64
            r0 = 0
            r6.A07 = r0
            r6.A06 = r1
        L4c:
            r6.A03(r4, r4)
            if (r12 == 0) goto L8b
            int r2 = r12.length
            r1 = 0
        L53:
            if (r1 >= r2) goto L8b
            r0 = r12[r1]
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r0.setCallback(r6)
            r0.setVisible(r5, r4)
            int r1 = r1 + 1
            goto L53
        L64:
            if (r7 != 0) goto L68
            android.content.res.ColorStateList r7 = X.AbstractC77713dv.A01
        L68:
            r6.A07 = r7
            int r0 = r7.getDefaultColor()
            r6.A06 = r0
            android.text.Layout r0 = r6.A0A
            if (r0 == 0) goto L4c
            android.text.TextPaint r3 = r0.getPaint()
            android.content.res.ColorStateList r2 = r6.A07
            int[] r1 = r6.getState()
            int r0 = r6.A06
            int r0 = r2.getColorForState(r1, r0)
            r3.setColor(r0)
            goto L4c
        L88:
            int r1 = r1 + 1
            goto L16
        L8b:
            r6.A0J = r12
            r6.A0E = r10
            r6.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79793hU.A06(android.content.res.ColorStateList, android.text.Layout, java.lang.CharSequence, java.lang.String, android.text.style.ClickableSpan[], android.text.style.ImageSpan[], float, float, float, int, int, int, boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.A0A != null) {
            int save = canvas.save();
            Rect bounds = getBounds();
            if (this.A0M) {
                canvas.clipRect(bounds);
            }
            canvas.translate(bounds.left + this.A0K, bounds.top + this.A00);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    A04(canvas);
                }
                Layout layout = this.A0A;
                Path path = null;
                if (this.A05 != this.A04 && Color.alpha(this.A02) != 0) {
                    if (this.A0G) {
                        Path path2 = this.A08;
                        if (path2 == null) {
                            path2 = new Path();
                            this.A08 = path2;
                        }
                        this.A0A.getSelectionPath(this.A05, this.A04, path2);
                        this.A0G = false;
                    }
                    path = this.A08;
                }
                layout.draw(canvas, path, this.A0L, 0);
                canvas.restoreToCount(save);
            } catch (IndexOutOfBoundsException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(" [");
                sb.append(this.A0E);
                sb.append("] ");
                CharSequence charSequence = this.A0D;
                if (charSequence instanceof SpannableStringBuilder) {
                    Object[] spans = ((SpannableStringBuilder) charSequence).getSpans(0, charSequence.length(), Object.class);
                    sb.append("spans: ");
                    for (Object obj : spans) {
                        sb.append(obj.getClass().getSimpleName());
                        sb.append(", ");
                    }
                }
                sb.append("ellipsizedWidth: ");
                sb.append(this.A0A.getEllipsizedWidth());
                sb.append(", lineCount: ");
                sb.append(this.A0A.getLineCount());
                RuntimeException runtimeException = new RuntimeException(AnonymousClass001.A0R("Debug info for IOOB: ", sb.toString()), e);
                runtimeException.setStackTrace(new StackTraceElement[0]);
                throw runtimeException;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (this.A07 == null) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Layout layout;
        if (this.A07 != null && (layout = this.A0A) != null) {
            int color = layout.getPaint().getColor();
            int colorForState = this.A07.getColorForState(iArr, this.A06);
            if (colorForState != color) {
                this.A0A.getPaint().setColor(colorForState);
                invalidateSelf();
            }
        }
        return super.onStateChange(iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r5 == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A05(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r5 = r7.getActionMasked()
            r4 = 0
            r0 = 1
            if (r5 == r0) goto Lb
            r3 = 0
            if (r5 != 0) goto Lc
        Lb:
            r3 = 1
        Lc:
            boolean r0 = r6.A0H
            if (r0 == 0) goto L26
            android.graphics.Rect r2 = r6.getBounds()
            float r0 = r7.getX()
            int r1 = (int) r0
            float r0 = r7.getY()
            int r0 = (int) r0
            boolean r0 = r2.contains(r1, r0)
            if (r0 == 0) goto L26
            if (r3 != 0) goto L29
        L26:
            r0 = 3
            if (r5 != r0) goto L2a
        L29:
            r4 = 1
        L2a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79793hU.A05(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if (r8.A0C.A00 != r2) goto L32;
     */
    @Override // X.InterfaceC51172Wp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DuB(android.view.View r9, android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79793hU.DuB(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC51172Wp
    public final boolean Eik(MotionEvent motionEvent) {
        if (!A05(motionEvent)) {
            if (this.A0H && this.A09 != null && motionEvent.getAction() != 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.facebook.litho.TextContent
    public final List getItems() {
        C5M7 A01 = A01(this);
        if (A01 == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(A01);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
