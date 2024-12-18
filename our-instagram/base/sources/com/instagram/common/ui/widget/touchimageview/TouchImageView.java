package com.instagram.common.ui.widget.touchimageview;

import X.AbstractC13560mi;
import X.AbstractC166987dD;
import X.AbstractC70163Da;
import X.C0f9;
import X.C14360o3;
import X.C54596O9x;
import X.C54677ODd;
import X.C55942hf;
import X.C55952hg;
import X.C55982hj;
import X.C56186Owt;
import X.InterfaceC148026lY;
import X.InterfaceC57809Pkb;
import X.InterfaceC58260Ps4;
import X.JQ0;
import X.MSX;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class TouchImageView extends View implements GestureDetector.OnGestureListener, InterfaceC148026lY, ScaleGestureDetector.OnScaleGestureListener {
    public static final C55942hf A0Z = C55942hf.A04(0.0d, 1.5d);
    public static final C55942hf A0a = C55942hf.A04(30.0d, 8.0d);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public Bitmap A05;
    public InterfaceC58260Ps4 A06;
    public InterfaceC57809Pkb A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public Rect A0I;
    public boolean A0J;
    public boolean A0K;
    public final Rect A0L;
    public final RectF A0M;
    public final C55982hj A0N;
    public final C55982hj A0O;
    public final C55982hj A0P;
    public final Paint A0Q;
    public final PointF A0R;
    public final PointF A0S;
    public final RectF A0T;
    public final RectF A0U;
    public final RectF A0V;
    public final GestureDetector A0W;
    public final ScaleGestureDetector A0X;
    public final C54596O9x A0Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.O9x, java.lang.Object] */
    public TouchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0W = new GestureDetector(context, this);
        this.A0X = new ScaleGestureDetector(context, this);
        this.A0L = AbstractC166987dD.A0U();
        this.A0M = AbstractC166987dD.A0X();
        this.A0V = AbstractC166987dD.A0X();
        this.A0U = AbstractC166987dD.A0X();
        this.A0T = AbstractC166987dD.A0X();
        this.A0Q = new Paint(2);
        this.A0R = new PointF();
        this.A0S = new PointF();
        this.A0Y = new Object();
        this.A0K = true;
        this.A0F = true;
        this.A02 = Float.MAX_VALUE;
        C55952hg A00 = AbstractC13560mi.A00();
        A00.A04.add(this);
        C55982hj A02 = A00.A02();
        C55942hf c55942hf = A0Z;
        A02.A09(c55942hf);
        A02.A02 = 0.5d;
        A02.A00 = 0.5d;
        this.A0O = A02;
        C55982hj A022 = A00.A02();
        A022.A02 = 0.5d;
        A022.A00 = 0.5d;
        A022.A09(c55942hf);
        this.A0P = A022;
        C55982hj A023 = A00.A02();
        A023.A09(A0a);
        A023.A02 = 0.01d;
        A023.A00 = 0.01d;
        this.A0N = A023;
        this.A06 = new C56186Owt();
    }

    @Override // X.InterfaceC148026lY
    public final void Cw4(C55952hg c55952hg) {
        C14360o3.A0B(c55952hg, 0);
        if (this.A08) {
            RectF rectF = this.A0U;
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = rectF.right;
            float f4 = rectF.bottom;
            RectF rectF2 = this.A0T;
            float f5 = rectF2.left;
            float f6 = rectF2.top;
            float f7 = rectF2.right;
            float f8 = rectF2.bottom;
            double d = (float) this.A0N.A09.A00;
            this.A0M.set((float) AbstractC70163Da.A03(d, f, f5), (float) AbstractC70163Da.A03(d, f2, f6), (float) AbstractC70163Da.A03(d, f3, f7), (float) AbstractC70163Da.A03(d, f4, f8));
            invalidate();
            return;
        }
        C55982hj c55982hj = this.A0O;
        if (c55982hj.A0C() && this.A0P.A0C()) {
            return;
        }
        this.A0M.offsetTo((float) c55982hj.A09.A00, (float) this.A0P.A09.A00);
        invalidate();
        if (this.A0H) {
            return;
        }
        A05(true);
    }

    @Override // X.InterfaceC148026lY
    public final void CzD(C55952hg c55952hg) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        if (this.A0B) {
            if (this.A0I == null || !getCropRect().equals(this.A0I)) {
                this.A0I = getCropRect();
                return;
            }
            return;
        }
        if (this.A05 == null) {
            return;
        }
        Rect rect = this.A0L;
        if (rect.isEmpty() || InterfaceC58260Ps4.A00(this).isEmpty()) {
            return;
        }
        int i = -1;
        int i2 = 1;
        if (this.A0D) {
            i2 = -1;
        }
        float f = i2;
        if (!this.A0C) {
            i = 1;
        }
        RectF rectF = this.A0M;
        canvas.scale(f, i, rectF.centerX(), rectF.centerY());
        Bitmap bitmap = this.A05;
        C14360o3.A0A(bitmap);
        canvas.drawBitmap(bitmap, rect, rectF, this.A0Q);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A03 = (float) Math.min(Math.max(f, -3000.0d), 3000.0d);
        this.A04 = (float) Math.min(Math.max(f2, -3000.0d), 3000.0d);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C14360o3.A0B(scaleGestureDetector, 0);
        PointF pointF = this.A0S;
        PointF pointF2 = this.A0R;
        pointF.x = pointF2.x;
        pointF.y = pointF2.y;
        pointF2.x = (int) scaleGestureDetector.getFocusX();
        pointF2.y = (int) scaleGestureDetector.getFocusY();
        float currentSpan = scaleGestureDetector.getCurrentSpan() / scaleGestureDetector.getPreviousSpan();
        A02(this.A0L, this.A0M, currentSpan * getContentScale(), pointF2.x, pointF2.y);
        invalidate();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C14360o3.A0B(scaleGestureDetector, 0);
        if (!this.A0K) {
            return false;
        }
        this.A0E = true;
        getParent().requestDisallowInterceptTouchEvent(true);
        PointF pointF = this.A0S;
        pointF.x = (int) scaleGestureDetector.getFocusX();
        pointF.y = (int) scaleGestureDetector.getFocusY();
        PointF pointF2 = this.A0R;
        pointF2.x = (int) scaleGestureDetector.getFocusX();
        pointF2.y = (int) scaleGestureDetector.getFocusY();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent2, 1);
        getParent().requestDisallowInterceptTouchEvent(true);
        if (this.A0X.isInProgress()) {
            PointF pointF = this.A0S;
            float f3 = pointF.x;
            PointF pointF2 = this.A0R;
            f = f3 - pointF2.x;
            f2 = pointF.y - pointF2.y;
        } else if (!this.A0A) {
            this.A0A = true;
            f -= this.A00 - motionEvent2.getRawX();
            f2 -= this.A01 - motionEvent2.getRawY();
        }
        if (!this.A0E && this.A0F) {
            C54596O9x c54596O9x = this.A0Y;
            RectF A00 = InterfaceC58260Ps4.A00(this);
            RectF rectF = this.A0M;
            C14360o3.A0B(A00, 0);
            C14360o3.A0B(rectF, 1);
            c54596O9x.A00 = Math.min(Math.max(rectF.left / A00.width(), 0.0f), 1.0f);
            c54596O9x.A02 = Math.min(Math.max(rectF.top / A00.height(), 0.0f), 1.0f);
            c54596O9x.A01 = Math.min(Math.max((A00.width() - rectF.right) / A00.width(), 0.0f), 1.0f);
            float min = Math.min(Math.max((A00.height() - rectF.bottom) / A00.height(), 0.0f), 1.0f);
            float pow = (float) Math.pow(1.0f - Math.max(c54596O9x.A00, c54596O9x.A01), 4.0d);
            f *= pow;
            float pow2 = (float) Math.pow(1.0f - Math.max(c54596O9x.A02, min), 4.0d);
            f2 *= pow2;
            if (pow < 0.25f || pow2 < 0.25f) {
                if (!this.A0J && this.A0H) {
                    this.A0J = true;
                }
                this.A0M.offset(-f, -f2);
                invalidate();
                return true;
            }
        }
        this.A0J = false;
        this.A0M.offset(-f, -f2);
        invalidate();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final void setRenderState(C54677ODd c54677ODd) {
        C14360o3.A0B(c54677ODd, 0);
        setImageBitmap(c54677ODd.A00);
        this.A0O.A01();
        this.A0P.A01();
        this.A0N.A01();
        RectF rectF = this.A0M;
        RectF rectF2 = c54677ODd.A02;
        rectF.set(rectF2);
        RectF A00 = InterfaceC58260Ps4.A00(this);
        this.A0C = c54677ODd.A04;
        this.A0D = c54677ODd.A05;
        RectF rectF3 = c54677ODd.A03;
        PointF pointF = new PointF(rectF3.centerX() - rectF2.left, rectF3.centerY() - rectF2.top);
        PointF pointF2 = this.A0R;
        pointF2.x = pointF.x;
        pointF2.y = pointF.y;
        float width = rectF2.width() / c54677ODd.A01.width();
        float width2 = rectF3.width() / rectF3.height();
        float A002 = MSX.A00(AbstractC166987dD.A07(this), this);
        if (AbstractC166987dD.A01(width2, A002) / A002 < 0.1f) {
            width *= Math.min(A00.width() / rectF3.width(), A00.height() / rectF3.height());
        }
        A01(pointF.x, pointF.y, width);
        invalidate();
    }

    private final boolean A03() {
        InterfaceC58260Ps4 interfaceC58260Ps4;
        if ((this.A0B || this.A05 != null) && !this.A0L.isEmpty() && (interfaceC58260Ps4 = this.A06) != null && !interfaceC58260Ps4.Ahm(this).isEmpty()) {
            return true;
        }
        return false;
    }

    public final void A04() {
        if (!this.A09 && A03()) {
            this.A09 = true;
            RectF rectF = this.A0M;
            rectF.set(this.A0L);
            A01(rectF.centerX(), rectF.centerY(), A00());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0027, code lost:
    
        if (r10 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(boolean r13) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.touchimageview.TouchImageView.A05(boolean):void");
    }

    public final float getContentScale() {
        return this.A0M.width() / this.A0L.width();
    }

    public final float getContentTranslationX() {
        return this.A0M.left;
    }

    public final float getContentTranslationY() {
        return this.A0M.top;
    }

    public final Rect getCropRect() {
        RectF rectF = new RectF(this.A0M);
        RectF rectF2 = new RectF(InterfaceC58260Ps4.A00(this));
        float f = -rectF.left;
        float f2 = -rectF.top;
        rectF.offset(f, f2);
        rectF2.offset(f, f2);
        rectF.intersect(rectF2);
        float contentScale = getContentScale();
        return AbstractC166987dD.A0V(Math.round(rectF.left / contentScale), Math.round(rectF.top / contentScale), Math.round(rectF.right / contentScale), Math.round(rectF.bottom / contentScale));
    }

    public final boolean getIgnoreImageBitmap() {
        return this.A0B;
    }

    public final Bitmap getImageBitmap() {
        return this.A05;
    }

    public final InterfaceC57809Pkb getListener() {
        return null;
    }

    public final Rect getPreviousCropRect() {
        return this.A0I;
    }

    public final C54677ODd getRenderState() {
        RectF rectF = this.A0M;
        RectF A00 = InterfaceC58260Ps4.A00(this);
        return new C54677ODd(this.A05, this.A0L, rectF, A00, this.A0C, this.A0D);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        this.A05 = bitmap;
        this.A09 = false;
        this.A0C = false;
        this.A0D = false;
        if (bitmap == null) {
            this.A0M.setEmpty();
        } else {
            Rect rect = this.A0L;
            int width = bitmap.getWidth();
            Bitmap bitmap2 = this.A05;
            C14360o3.A0A(bitmap2);
            rect.set(0, 0, width, bitmap2.getHeight());
        }
        this.A0M.set(this.A0L);
        A04();
    }

    private final float A00() {
        float height = InterfaceC58260Ps4.A00(this).height();
        Rect rect = this.A0L;
        return Math.max(height / rect.height(), InterfaceC58260Ps4.A00(this).width() / rect.width());
    }

    private final void A01(float f, float f2, float f3) {
        RectF A00 = InterfaceC58260Ps4.A00(this);
        float centerX = A00.centerX() - f;
        float centerY = A00.centerY() - f2;
        RectF rectF = this.A0M;
        rectF.offsetTo(centerX, centerY);
        invalidate();
        float max = Math.max(A00(), f3);
        float centerX2 = A00.centerX();
        float centerY2 = A00.centerY();
        Rect rect = this.A0L;
        A02(rect, rectF, max, centerX2, centerY2);
        invalidate();
        if (!rectF.contains(A00)) {
            float f4 = 1.0f;
            float width = f / rectF.width();
            float height = f2 / rectF.height();
            if (Math.round(rectF.left) > Math.round(A00.left)) {
                f4 = Math.max(((r1 - r0) / width) / rectF.width(), 1.0f);
            }
            if (Math.round(rectF.right) < Math.round(A00.right)) {
                f4 = Math.max(((r0 - r1) / (1.0f - width)) / rectF.width(), f4);
            }
            if (Math.round(rectF.top) > Math.round(A00.top)) {
                f4 = Math.max(((r1 - r0) / height) / rectF.height(), f4);
            }
            if (Math.round(rectF.bottom) < Math.round(A00.bottom)) {
                f4 = Math.max(Math.max(((r0 - r1) / (1.0f - height)) / rectF.height(), f4), f4);
            }
            A02(rect, rectF, f4 * getContentScale(), f, f2);
            invalidate();
            A05(false);
        }
    }

    public static final void A02(Rect rect, RectF rectF, float f, float f2, float f3) {
        float width = rect.width() * f;
        float height = rect.height() * f;
        float f4 = f2 - (rectF.left - rect.left);
        float f5 = f3 - (rectF.top - rect.top);
        float width2 = f4 / rectF.width();
        float height2 = f5 / rectF.height();
        rectF.left -= width2 * (width - rectF.width());
        float height3 = rectF.top - (height2 * (height - rectF.height()));
        rectF.top = height3;
        rectF.right = rectF.left + width;
        rectF.bottom = height3 + height;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int A06 = C0f9.A06(-687530270);
        super.onSizeChanged(i, i2, i3, i4);
        this.A0N.A01();
        this.A0O.A01();
        this.A0P.A01();
        if (!A03()) {
            i5 = 1575468891;
        } else {
            A04();
            this.A0M.offset((i / 2.0f) - (i3 / 2.0f), (i2 / 2.0f) - (i4 / 2.0f));
            invalidate();
            A05(false);
            i5 = -1291197680;
        }
        C0f9.A0D(i5, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(-1402862563);
        C14360o3.A0B(motionEvent, 0);
        boolean z = false;
        if (!this.A0G) {
            C0f9.A0C(-941998414, A05);
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A0H = true;
            this.A0A = false;
            this.A00 = motionEvent.getRawX();
            this.A01 = motionEvent.getRawY();
            this.A03 = 0.0f;
            this.A04 = 0.0f;
            this.A08 = false;
            C55982hj c55982hj = this.A0O;
            RectF rectF = this.A0M;
            c55982hj.A08(rectF.left, true);
            this.A0P.A08(rectF.top, true);
            this.A0N.A08(getContentScale(), true);
        }
        boolean onTouchEvent = this.A0X.onTouchEvent(motionEvent);
        if (this.A0W.onTouchEvent(motionEvent) || onTouchEvent || super.onTouchEvent(motionEvent)) {
            z = true;
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A0H = false;
            this.A0E = false;
            C55982hj c55982hj2 = this.A0O;
            C55942hf c55942hf = A0Z;
            c55982hj2.A09(c55942hf);
            RectF rectF2 = this.A0M;
            c55982hj2.A08(rectF2.left, true);
            c55982hj2.A07(this.A03);
            C55982hj c55982hj3 = this.A0P;
            c55982hj3.A09(c55942hf);
            c55982hj3.A08(rectF2.top, true);
            c55982hj3.A07(this.A04);
            this.A0N.A08(getContentScale(), true);
            A05(true);
        }
        C0f9.A0C(240419877, A05);
        return z;
    }

    public final void setBoundsDelegate(InterfaceC58260Ps4 interfaceC58260Ps4) {
        this.A06 = interfaceC58260Ps4;
    }

    public final void setIgnoreImageBitmap(boolean z) {
        this.A0B = z;
    }

    public final void setIsFlipped(boolean z) {
        this.A0C = z;
    }

    public final void setIsMirrored(boolean z) {
        this.A0D = z;
    }

    public final void setListener(InterfaceC57809Pkb interfaceC57809Pkb) {
        this.A07 = interfaceC57809Pkb;
    }

    public final void setMaxScale(float f) {
        this.A02 = f;
    }

    public final void setPreviousCropRect(Rect rect) {
        this.A0I = rect;
    }

    public final void setScaleEnabled(boolean z) {
        this.A0K = z;
    }

    public final void setShouldSlipNearBounds(boolean z) {
        this.A0F = z;
    }

    public final void setTouchEnabled(boolean z) {
        this.A0G = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TouchImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TouchImageView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ TouchImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
