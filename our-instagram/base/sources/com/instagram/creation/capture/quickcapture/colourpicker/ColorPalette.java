package com.instagram.creation.capture.quickcapture.colourpicker;

import X.ACO;
import X.AbstractC13560mi;
import X.AbstractC13620mo;
import X.AbstractC22759A2d;
import X.AbstractC55922hc;
import X.AbstractC87043uM;
import X.AnonymousClass051;
import X.C0f5;
import X.C14360o3;
import X.C18950wb;
import X.C55982hj;
import X.C8D4;
import X.C8DD;
import X.C8DF;
import X.C8DG;
import X.C8DI;
import X.InterfaceC55932he;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ColorPalette extends View {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public C8D4 A05;
    public C8DF A06;
    public boolean A07;
    public float A08;
    public float A09;
    public UserSession A0A;
    public boolean A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final C55982hj A0E;
    public final ArrayList A0F;
    public final GestureDetector A0G;
    public final C8DG A0H;
    public final C8DI A0I;
    public final ArrayList A0J;
    public final boolean A0K;
    public static final int[] A0N = new int[2];
    public static final int A0L = Color.rgb(230, 230, 230);
    public static final int A0M = Color.rgb(51, 51, 51);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorPalette(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (this.A0I.A05(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Iterator it = this.A0F.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            C14360o3.A07(next);
            ACO aco = (ACO) next;
            ColorPalette colorPalette = aco.A0B;
            C55982hj c55982hj = colorPalette.A0E;
            if ((!c55982hj.A0C()) || colorPalette.A06 == C8DF.A02) {
                RectF rectF = aco.A05;
                float f = aco.A00;
                canvas.drawRoundRect(rectF, f, f, aco.A03);
            }
            if (aco.A08) {
                if (colorPalette.A03 > 0.0f && colorPalette.A06 == C8DF.A03 && !(!c55982hj.A0C())) {
                    RectF rectF2 = aco.A05;
                    float f2 = aco.A00;
                    canvas.drawRoundRect(rectF2, f2, f2, colorPalette.A0C);
                }
                RectF rectF3 = aco.A05;
                float f3 = aco.A00;
                canvas.drawRoundRect(rectF3, f3, f3, aco.A02);
                float f4 = aco.A00;
                canvas.drawRoundRect(rectF3, f4, f4, colorPalette.A0D);
            }
        }
    }

    public final void setColorStops(UserSession userSession, ArrayList arrayList) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(arrayList, 1);
        if (!arrayList.isEmpty()) {
            this.A0A = userSession;
            ArrayList arrayList2 = this.A0J;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            this.A04 = ((C8DD) arrayList.get(0)).A00;
            invalidate();
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMode(C8DF c8df) {
        C55982hj c55982hj;
        double d;
        if (this.A06 != c8df) {
            this.A06 = c8df;
            if (c8df == C8DF.A03) {
                C8D4 c8d4 = this.A05;
                if (c8d4 != null) {
                    c8d4.DJe(false, this.A04);
                }
                c55982hj = this.A0E;
                d = 0.0d;
            } else {
                C8D4 c8d42 = this.A05;
                if (c8d42 != null) {
                    c8d42.DJe(true, this.A04);
                }
                c55982hj = this.A0E;
                d = 1.0d;
            }
            c55982hj.A06(d);
        }
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return (AccessibilityNodeProvider) ((AnonymousClass051) this.A0I).A00;
    }

    public final List getColorStops() {
        return this.A0F;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object obj;
        int i5;
        float f;
        ArrayList arrayList = this.A0F;
        arrayList.clear();
        ArrayList arrayList2 = this.A0J;
        int size = arrayList2.size();
        float width = getWidth() / Math.max(size, 10);
        float height = getHeight();
        if (this.A0A != null) {
            float f2 = height - 0.0f;
            if (((int) (width - 0.0f)) <= 0 || ((int) f2) <= 0) {
                C0f5 AEp = C18950wb.A01.AEp("ColorPalette#onLayout invalid bounds", 817900750);
                AEp.ABU("left", i);
                AEp.ABU("top", i2);
                AEp.ABU("right", i3);
                AEp.ABU("bottom", i4);
                AEp.ABU("numColors", size);
                AEp.report();
                return;
            }
        }
        float f3 = this.A09;
        float f4 = 0.0f + f3;
        float f5 = width - f3;
        float f6 = height - this.A08;
        float f7 = f6 - (f5 - f4);
        float f8 = width;
        float f9 = 0.0f;
        int i6 = 0;
        while (i6 < size) {
            if (this.A07 && i6 == size - 1) {
                f8 = getWidth();
            }
            float f10 = f8;
            boolean z2 = this.A0K;
            int i7 = i6;
            if (z2) {
                i7 = (size - 1) - i6;
            }
            Object obj2 = arrayList2.get(i7);
            C14360o3.A07(obj2);
            C8DD c8dd = (C8DD) obj2;
            if (i7 == 0) {
                obj = arrayList2.get(i7);
            } else {
                obj = arrayList2.get(i7 - 1);
            }
            int i8 = ((C8DD) obj).A00;
            int i9 = i7 + 1;
            if (i9 < size) {
                i5 = ((C8DD) arrayList2.get(i9)).A00;
            } else {
                i5 = -1;
            }
            int i10 = c8dd.A00;
            int A00 = AbstractC22759A2d.A00(0.5f, i8, i10);
            int A002 = AbstractC22759A2d.A00(0.5f, i10, i5);
            boolean z3 = false;
            if (i7 != 0) {
                z3 = true;
            }
            boolean z4 = this.A0B;
            int i11 = A00;
            if (z2) {
                i11 = A002;
                A002 = A00;
            }
            arrayList.add(new ACO(c8dd, this, f9, f8, height, f4, f7, f5, f6, i11, A002, z3, z4));
            if (this.A07 && i6 == 0) {
                float width2 = (getWidth() - ((width * size) / 2.0f)) + width;
                f = f8 + width2;
                f4 += width2;
                f5 += width2;
            } else {
                f = f8 + width;
                f5 = f - f3;
                f4 = f8 + f3;
            }
            f8 = f;
            i6++;
            f9 = f10;
        }
        this.A01 = f7;
        this.A00 = f6;
    }

    public final void setIsItemRectangular(boolean z) {
        this.A0B = z;
        invalidate();
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r1 != 3) goto L9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            r0 = 1778195660(0x69fd1ccc, float:3.8249278E25)
            int r4 = X.C0f9.A05(r0)
            r8 = 0
            X.C14360o3.A0B(r11, r8)
            android.view.GestureDetector r0 = r10.A0G
            boolean r9 = r0.onTouchEvent(r11)
            int r1 = r11.getAction()
            r3 = 1
            if (r1 == 0) goto L27
            r5 = 2
            if (r1 == r3) goto L7f
            if (r1 == r5) goto L27
            r0 = 3
            if (r1 == r0) goto L7f
        L20:
            r0 = -1260883478(0xffffffffb4d871ea, float:-4.031602E-7)
            X.C0f9.A0C(r0, r4)
            return r9
        L27:
            X.8DF r1 = r10.A06
            X.8DF r0 = X.C8DF.A02
            if (r1 != r0) goto L20
            float r6 = r11.getX()
            float r2 = r11.getY()
            r1 = 0
            int r0 = r10.getHeight()
            float r0 = (float) r0
            float r0 = java.lang.Math.min(r0, r2)
            float r7 = java.lang.Math.max(r1, r0)
            java.util.ArrayList r0 = r10.A0F
            java.util.Iterator r2 = r0.iterator()
            X.C14360o3.A07(r2)
        L4c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r1 = r2.next()
            X.C14360o3.A07(r1)
            X.ACO r1 = (X.ACO) r1
            boolean r0 = r1.A01(r6, r7)
            if (r0 == 0) goto L4c
            int r5 = r1.A00(r6, r7)
            r10.A04 = r5
            X.8D4 r2 = r10.A05
            if (r2 == 0) goto L7b
            int[] r1 = com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette.A0N
            r10.getLocationInWindow(r1)
            r0 = r1[r8]
            float r0 = (float) r0
            float r6 = r6 + r0
            r0 = r1[r3]
            float r0 = (float) r0
            float r7 = r7 + r0
            r2.D5z(r5, r6, r7)
        L7b:
            r0 = -747853784(0xffffffffd36ca828, float:-1.0164335E12)
            goto La4
        L7f:
            X.8DG r0 = r10.A0H
            r0.A00 = r8
            X.8DF r1 = r10.A06
            X.8DF r0 = X.C8DF.A02
            if (r1 != r0) goto L20
            X.8DF r0 = X.C8DF.A03
            r10.setMode(r0)
            int r0 = r10.A04
            X.8DD r2 = new X.8DD
            r2.<init>(r0)
            r1 = -1
            int r0 = r2.A00
            r10.A04 = r0
            X.8D4 r0 = r10.A05
            if (r0 == 0) goto La1
            r0.D5y(r2, r5, r1)
        La1:
            r0 = 699235133(0x29ad7b3d, float:7.704122E-14)
        La4:
            X.C0f9.A0C(r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setInteractionListener(C8D4 c8d4) {
        this.A05 = c8d4;
    }

    public final void setShouldCenterColorStopList(boolean z) {
        this.A07 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.3uM, X.8DI] */
    public ColorPalette(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0J = new ArrayList();
        this.A0F = new ArrayList();
        this.A0K = AbstractC13620mo.A02(context);
        this.A06 = C8DF.A03;
        try {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A0I);
            try {
                this.A02 = obtainStyledAttributes.getDimension(3, 5.0f);
                this.A09 = obtainStyledAttributes.getDimension(2, 0.0f);
                this.A08 = obtainStyledAttributes.getDimension(1, 0.0f);
                this.A03 = obtainStyledAttributes.getDimension(5, 0.0f);
                int color = obtainStyledAttributes.getColor(4, -16777216);
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    setContentDescription(context.getString(resourceId));
                }
                obtainStyledAttributes.recycle();
                Paint paint = new Paint(1);
                this.A0D = paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.A02);
                paint.setColor(-1);
                Paint paint2 = new Paint(1);
                this.A0C = paint2;
                paint2.setShadowLayer(this.A03, 0.0f, 0.0f, color);
                C8DG c8dg = new C8DG(this);
                this.A0H = c8dg;
                this.A0G = new GestureDetector(context, c8dg, new Handler(Looper.getMainLooper()));
                InterfaceC55932he interfaceC55932he = new InterfaceC55932he() { // from class: X.8DH
                    @Override // X.InterfaceC55932he
                    public final void Dnj(C55982hj c55982hj) {
                    }

                    @Override // X.InterfaceC55932he
                    public final void Dnk(C55982hj c55982hj) {
                    }

                    @Override // X.InterfaceC55932he
                    public final void Dnl(C55982hj c55982hj) {
                    }

                    @Override // X.InterfaceC55932he
                    public final void Dnm(C55982hj c55982hj) {
                        C14360o3.A0B(c55982hj, 0);
                        float f = (float) c55982hj.A09.A00;
                        ColorPalette colorPalette = ColorPalette.this;
                        Iterator it = colorPalette.A0F.iterator();
                        C14360o3.A07(it);
                        while (it.hasNext()) {
                            Object next = it.next();
                            C14360o3.A07(next);
                            ACO aco = (ACO) next;
                            float f2 = aco.A01;
                            aco.A00 = f2 + ((0.0f - f2) * f);
                            RectF rectF = aco.A06;
                            RectF rectF2 = aco.A04;
                            RectF rectF3 = aco.A05;
                            float f3 = rectF.left;
                            float f4 = f3 + ((rectF2.left - f3) * f);
                            float f5 = rectF.top;
                            float f6 = f5 + ((rectF2.top - f5) * f);
                            float f7 = rectF.right;
                            float f8 = f7 + ((rectF2.right - f7) * f);
                            float f9 = rectF.bottom;
                            rectF3.set(f4, f6, f8, f9 + ((rectF2.bottom - f9) * f));
                            int i2 = (int) (255.0f + ((0.0f - 255.0f) * f));
                            aco.A0B.A0D.setAlpha(i2);
                            aco.A02.setAlpha(i2);
                            aco.A03.setAlpha(255 - i2);
                        }
                        colorPalette.invalidate();
                    }
                };
                C55982hj A02 = AbstractC13560mi.A00().A02();
                A02.A06(0.0d);
                A02.A01();
                A02.A06 = true;
                A02.A0A(interfaceC55932he);
                this.A0E = A02;
                if (this.A03 > 0.0f) {
                    setLayerType(1, null);
                }
                this.A0I = new AbstractC87043uM(this);
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public /* synthetic */ ColorPalette(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorPalette(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
