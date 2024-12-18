package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.view.View;

/* renamed from: X.8RH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8RH extends View {
    public float A00;
    public float A01;
    public int A02;
    public long A03;
    public C8RI A04;
    public C8R4 A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public float[] A0C;
    public float A0D;
    public float A0E;

    public C8RH(Context context) {
        super(context, null, 0);
        C8RI c8ri = new C8RI(-1, 0, 0, 0);
        c8ri.A06(0);
        this.A04 = c8ri;
        this.A0D = 1.0f;
        this.A0C = new float[0];
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        C8RI c8ri = this.A04;
        if (c8ri != null) {
            c8ri.draw(canvas);
        }
    }

    public final void setSnapValues(float[] fArr) {
        C14360o3.A0B(fArr, 0);
        this.A0C = fArr;
    }

    public final void setupTrimmer(AbstractC22994ABt abstractC22994ABt) {
        C14360o3.A0B(abstractC22994ABt, 0);
        this.A04 = abstractC22994ABt.A00();
        if (getWidth() > 0 && getHeight() > 0) {
            C8RI c8ri = this.A04;
            C14360o3.A0A(c8ri);
            c8ri.setBounds(0, 0, getWidth(), getHeight());
        }
        invalidate();
    }

    private final float A00(float f, boolean z) {
        float f2;
        float A00;
        C8RI c8ri = this.A04;
        float f3 = 0.0f;
        if (c8ri != null) {
            f2 = c8ri.A01;
        } else {
            f2 = 0.0f;
        }
        if (this.A06) {
            A00 = AbstractC225999yI.A00(f, 0.0f, 1.0f);
            if (c8ri != null) {
                f3 = c8ri.A00;
            }
            float A002 = AbstractC225999yI.A00(f2, this.A0E + f3, Math.min(1.0f, f3 + this.A0D));
            if (c8ri != null && A002 != f2 && c8ri.A01 != A002) {
                c8ri.A01 = A002;
                c8ri.A04();
            }
            C8RI c8ri2 = this.A04;
            if (c8ri2 != null) {
                if (c8ri2.A00 != A00) {
                    c8ri2.A00 = A00;
                    c8ri2.A04();
                }
                invalidate();
            }
            C8R4 c8r4 = this.A05;
            if (z && c8r4 != null) {
                if (A002 == f2) {
                    c8r4.DOr(A00);
                } else {
                    c8r4.DOo(A00, A002);
                    return A00;
                }
            }
        } else {
            A00 = AbstractC225999yI.A00(f, Math.max(0.0f, f2 - this.A0D), f2 - this.A0E);
            if (c8ri != null) {
                if (c8ri.A00 != A00) {
                    c8ri.A00 = A00;
                    c8ri.A04();
                }
                invalidate();
            }
            C8R4 c8r42 = this.A05;
            if (z && c8r42 != null) {
                c8r42.DOr(A00);
                return A00;
            }
        }
        return A00;
    }

    private final float A01(float f, boolean z) {
        float f2;
        float A00;
        float f3;
        C8RI c8ri = this.A04;
        if (c8ri != null) {
            f2 = c8ri.A00;
        } else {
            f2 = 0.0f;
        }
        if (this.A06) {
            A00 = AbstractC225999yI.A00(f, 0.0f, 1.0f);
            if (c8ri != null) {
                f3 = c8ri.A01;
            } else {
                f3 = 0.0f;
            }
            float A002 = AbstractC225999yI.A00(f2, Math.max(0.0f, f3 - this.A0D), f3 - this.A0E);
            if (c8ri != null && A002 != f2 && c8ri.A00 != A002) {
                c8ri.A00 = A002;
                c8ri.A04();
            }
            C8RI c8ri2 = this.A04;
            if (c8ri2 != null) {
                if (c8ri2.A01 != A00) {
                    c8ri2.A01 = A00;
                    c8ri2.A04();
                }
                invalidate();
            }
            C8R4 c8r4 = this.A05;
            if (z && c8r4 != null) {
                if (A002 == f2) {
                    c8r4.DhT(A00);
                } else {
                    c8r4.DOo(A002, A00);
                    return A00;
                }
            }
        } else {
            A00 = AbstractC225999yI.A00(f, this.A0E + f2, Math.min(1.0f, f2 + this.A0D));
            if (c8ri != null) {
                if (c8ri.A01 != A00) {
                    c8ri.A01 = A00;
                    c8ri.A04();
                }
                invalidate();
            }
            C8R4 c8r42 = this.A05;
            if (z && c8r42 != null) {
                c8r42.DhT(A00);
                return A00;
            }
        }
        return A00;
    }

    public static final void A02(C8RH c8rh, float f) {
        float f2;
        int i;
        C8RI c8ri = c8rh.A04;
        if (c8ri != null) {
            int i2 = c8ri.getBounds().left + c8ri.A0D;
            C8RL c8rl = c8ri.A06;
            if (c8rl != null) {
                i = c8rl.A02;
            } else {
                i = 0;
            }
            f2 = (f - (i2 + i)) / c8ri.A00();
        } else {
            f2 = 0.0f;
        }
        c8rh.A01(f2, true);
    }

    private final boolean A03(float f, float f2, float f3) {
        for (float f4 : this.A0C) {
            if ((f2 < f4 && f4 <= f) || (f2 > f4 && f4 >= f)) {
                C2UY.A01.A05(5L);
                if (f3 <= 0.3f) {
                    if (this.A09) {
                        A00(f4, true);
                    } else if (this.A0A) {
                        A01(f4, true);
                        return true;
                    }
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void A04() {
        C8RI c8ri = this.A04;
        if (c8ri != null) {
            float f = c8ri.A01;
            float f2 = f - c8ri.A00;
            if (f2 < this.A0E || f2 > this.A0D) {
                boolean z = this.A06;
                this.A06 = false;
                A01(f, true);
                this.A06 = z;
            }
        }
    }

    public final void A05(float f, float f2) {
        C8RI c8ri = this.A04;
        if (c8ri != null) {
            if ((c8ri.A00 != f || c8ri.A01 != f2) && !Float.isNaN(f) && !Float.isNaN(f2)) {
                c8ri.A00 = f;
                c8ri.A01 = f2;
                if (f <= f2) {
                    c8ri.A04();
                } else {
                    throw new IllegalStateException(AnonymousClass001.A0a("left: ", " right: ", f, f2));
                }
            }
            invalidate();
        }
    }

    public final int getBottomInnerEdge() {
        C8RI c8ri = this.A04;
        if (c8ri != null) {
            return c8ri.getBounds().bottom - c8ri.A0D;
        }
        return 0;
    }

    public final int getInsideWidth() {
        C8RI c8ri = this.A04;
        if (c8ri != null) {
            return c8ri.A00();
        }
        return 0;
    }

    public final int getLeftInnerEdge() {
        C8RI c8ri = this.A04;
        if (c8ri != null) {
            return c8ri.A01();
        }
        return 0;
    }

    public final float getLeftTrimmerValue() {
        C8RI c8ri = this.A04;
        if (c8ri != null) {
            return c8ri.A00;
        }
        return 0.0f;
    }

    public final int getRightInnerEdge() {
        C8RI c8ri = this.A04;
        if (c8ri != null) {
            return c8ri.A02();
        }
        return 0;
    }

    public final float getRightTrimmerValue() {
        C8RI c8ri = this.A04;
        if (c8ri != null) {
            return c8ri.A01;
        }
        return 0.0f;
    }

    public final int getTopInnerEdge() {
        C8RI c8ri = this.A04;
        if (c8ri != null) {
            return c8ri.getBounds().top + c8ri.A0D;
        }
        return 0;
    }

    public final void setMaximumRange(float f) {
        this.A0D = f;
        postDelayed(new Runnable() { // from class: X.8RP
            @Override // java.lang.Runnable
            public final void run() {
                C8RH.this.A04();
            }
        }, 100L);
    }

    public final void setMinimumRange(float f) {
        this.A0E = f;
        postDelayed(new RunnableC24306AqB(this), 100L);
    }

    public final void setShader(Shader shader) {
        C8RI c8ri = this.A04;
        if (c8ri != null) {
            c8ri.A07(shader);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-592624086);
        super.onSizeChanged(i, i2, i3, i4);
        C8RI c8ri = this.A04;
        if (c8ri != null) {
            c8ri.setBounds(0, 0, i, i2);
        }
        invalidate();
        C0f9.A0D(290074577, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r10.A0A != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0144, code lost:
    
        if (r7 > getRightInnerEdge()) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ed, code lost:
    
        if (r7 >= r1.getBounds().right) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8RH.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setDragBeyondAllowed(boolean z) {
        this.A06 = z;
    }

    public final void setDurationSlidingAllowed(boolean z) {
        this.A07 = z;
    }

    public final void setHandleTouchPadding(int i) {
        this.A02 = i;
    }

    public final void setListener(C8R4 c8r4) {
        this.A05 = c8r4;
    }
}
