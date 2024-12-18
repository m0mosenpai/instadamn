package com.instagram.bugreporter;

import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC43592JPx;
import X.AbstractC43594JPz;
import X.AbstractC55922hc;
import X.C006802i;
import X.C0f9;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class BugReporterDrawingView extends View {
    public float A00;
    public float A01;
    public Bitmap A02;
    public Bitmap A03;
    public Canvas A04;
    public Rect A05;
    public final Paint A06;
    public final Paint A07;
    public final Path A08;
    public final Path A09;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        C14360o3.A0B(canvas, 0);
        Rect rect = this.A05;
        if (rect != null) {
            if (rect.width() > 0) {
                Rect rect2 = this.A05;
                if (rect2 != null) {
                    if (rect2.height() > 0 && (bitmap = this.A02) != null) {
                        Rect rect3 = this.A05;
                        if (rect3 != null) {
                            canvas.drawBitmap(bitmap, (Rect) null, rect3, this.A06);
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public final void A01() {
        Bitmap bitmap = this.A02;
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
            this.A04 = null;
        }
        this.A08.reset();
    }

    public final void setUnderlayBitmap(Bitmap bitmap) {
        this.A03 = bitmap;
        A00();
    }

    public /* synthetic */ BugReporterDrawingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    private final void A00() {
        int paddingLeft;
        int paddingRight;
        int paddingTop;
        int paddingBottom;
        int A08 = AbstractC43594JPz.A08(this, getWidth());
        int availableHeight = getAvailableHeight();
        Bitmap bitmap = this.A03;
        if (bitmap != null && A08 > 0 && availableHeight > 0) {
            int width = bitmap.getWidth();
            Bitmap bitmap2 = this.A03;
            if (bitmap2 != null) {
                float f = A08 / width;
                float height = availableHeight / bitmap2.getHeight();
                if (f > height) {
                    f = height;
                }
                int ceil = (A08 - ((int) Math.ceil(r3 * f))) / 2;
                int ceil2 = (availableHeight - ((int) Math.ceil(r2 * f))) / 2;
                paddingLeft = getPaddingLeft() + ceil;
                paddingRight = (getWidth() - getPaddingRight()) - ceil;
                paddingTop = getPaddingTop() + ceil2;
                paddingBottom = (getHeight() - getPaddingBottom()) - ceil2;
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        Rect A0V = AbstractC166987dD.A0V(paddingLeft, paddingTop, paddingRight, paddingBottom);
        this.A05 = A0V;
        int width2 = A0V.width();
        Rect rect = this.A05;
        if (rect != null) {
            int height2 = rect.height();
            if (width2 > 0 && height2 > 0) {
                A01();
                Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                this.A02 = createBitmap;
                if (createBitmap != null) {
                    Canvas A06 = AbstractC43592JPx.A06(createBitmap);
                    this.A04 = A06;
                    A06.drawColor(0, PorterDuff.Mode.CLEAR);
                    Bitmap bitmap3 = this.A03;
                    if (bitmap3 != null) {
                        Rect rect2 = new Rect(0, 0, width2, height2);
                        Canvas canvas = this.A04;
                        if (canvas != null) {
                            canvas.drawBitmap(bitmap3, (Rect) null, rect2, this.A06);
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    Matrix A0Q = AbstractC166987dD.A0Q();
                    if (this.A05 != null) {
                        A0Q.postTranslate(-r2.left, -r2.top);
                        Canvas canvas2 = this.A04;
                        if (canvas2 != null) {
                            canvas2.setMatrix(A0Q);
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            A01();
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    private final int getAvailableHeight() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private final int getAvailableWidth() {
        return AbstractC43594JPz.A08(this, getWidth());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(115765338);
        A00();
        C0f9.A0D(816755891, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        IllegalStateException A14;
        int i;
        int A05 = C0f9.A05(-765808055);
        C14360o3.A0B(motionEvent, 0);
        Rect rect = this.A05;
        if (rect != null) {
            boolean z = false;
            z = false;
            if (rect.width() > 0) {
                Rect rect2 = this.A05;
                if (rect2 != null) {
                    if (rect2.height() > 0) {
                        int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked != 0) {
                            if (actionMasked != 1) {
                                if (actionMasked != 2) {
                                    C0f9.A0C(193783655, A05);
                                    return false;
                                }
                                Path path = this.A09;
                                path.reset();
                                path.moveTo(this.A00, this.A01);
                                int historySize = motionEvent.getHistorySize();
                                for (int i2 = 0; i2 < historySize; i2++) {
                                    float historicalX = motionEvent.getHistoricalX(i2);
                                    float historicalY = motionEvent.getHistoricalY(i2);
                                    float f = this.A00;
                                    float f2 = (historicalX + f) / 2.0f;
                                    float f3 = this.A01;
                                    float f4 = (historicalY + f3) / 2.0f;
                                    path.quadTo(f, f3, f2, f4);
                                    this.A00 = f2;
                                    this.A01 = f4;
                                }
                                float x = motionEvent.getX();
                                float y = motionEvent.getY();
                                float f5 = this.A00;
                                float f6 = (x + f5) / 2.0f;
                                float f7 = this.A01;
                                float f8 = (y + f7) / 2.0f;
                                path.quadTo(f5, f7, f6, f8);
                                this.A00 = f6;
                                this.A01 = f8;
                                this.A08.addPath(path);
                                Canvas canvas = this.A04;
                                if (canvas != null) {
                                    canvas.drawPath(path, this.A07);
                                    invalidate();
                                    z = true;
                                } else {
                                    A14 = AbstractC166987dD.A14("Required value was null.");
                                    i = 968171778;
                                }
                            } else {
                                Path path2 = this.A08;
                                path2.moveTo(this.A00, this.A01);
                                path2.lineTo(motionEvent.getX(), motionEvent.getY());
                                Canvas canvas2 = this.A04;
                                if (canvas2 != null) {
                                    canvas2.drawLine(this.A00, this.A01, motionEvent.getX(), motionEvent.getY(), this.A07);
                                    invalidate();
                                    z = true;
                                } else {
                                    A14 = AbstractC166987dD.A14("Required value was null.");
                                    i = -1803735883;
                                }
                            }
                        } else {
                            C006802i A0N = AbstractC43592JPx.A0N();
                            A0N.markerStart(391266213, 0);
                            A0N.markerEnd(391266213, 0, (short) 2);
                            this.A00 = motionEvent.getX();
                            float y2 = motionEvent.getY();
                            this.A01 = y2;
                            Path path3 = this.A08;
                            float f9 = this.A00;
                            path3.addRect(f9, y2, f9 + 0.1f, y2 + 0.1f, Path.Direction.CW);
                            Canvas canvas3 = this.A04;
                            if (canvas3 != null) {
                                canvas3.drawPoint(this.A00, this.A01, this.A07);
                                invalidate();
                                z = true;
                            } else {
                                A14 = AbstractC166987dD.A14("Required value was null.");
                                i = -454054701;
                            }
                        }
                    }
                } else {
                    A14 = AbstractC166987dD.A14("Required value was null.");
                    i = 2082926856;
                }
            }
            C0f9.A0C(-1432510161, A05);
            return z;
        }
        A14 = AbstractC166987dD.A14("Required value was null.");
        i = -1347218969;
        C0f9.A0C(i, A05);
        throw A14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BugReporterDrawingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A08 = AbstractC166987dD.A0T();
        this.A09 = AbstractC166987dD.A0T();
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC55922hc.A09);
        C14360o3.A07(obtainStyledAttributes);
        float dimension = obtainStyledAttributes.getDimension(1, AbstractC13880nE.A04(context2, 12));
        int color = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        Paint A0R = AbstractC166987dD.A0R();
        this.A07 = A0R;
        A0R.setAntiAlias(true);
        A0R.setColor(color);
        AbstractC43592JPx.A1E(A0R);
        A0R.setStrokeJoin(Paint.Join.ROUND);
        A0R.setStrokeWidth(dimension);
        A0R.setStrokeCap(Paint.Cap.ROUND);
        Paint A0R2 = AbstractC166987dD.A0R();
        this.A06 = A0R2;
        A0R2.setAntiAlias(true);
        A0R2.setDither(true);
        A0R2.setFilterBitmap(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BugReporterDrawingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BugReporterDrawingView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }
}
