package androidx.constraintlayout.helper.widget;

import X.AbstractC56282iH;
import X.C3OI;
import X.C3OJ;
import X.C56082hw;
import X.C72141XPp;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes12.dex */
public class Flow extends C3OJ {
    public C72141XPp A00;

    @Override // X.AbstractC56322iM
    public final void A07(C56082hw widget, boolean isRtl) {
        C72141XPp c72141XPp = this.A00;
        int i = ((C3OI) c72141XPp).A04;
        if (i > 0 || ((C3OI) c72141XPp).A03 > 0) {
            if (isRtl) {
                ((C3OI) c72141XPp).A06 = ((C3OI) c72141XPp).A03;
                ((C3OI) c72141XPp).A07 = i;
            } else {
                ((C3OI) c72141XPp).A06 = i;
                ((C3OI) c72141XPp).A07 = ((C3OI) c72141XPp).A03;
            }
        }
    }

    @Override // X.AbstractC56322iM, android.view.View
    public final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        A0B(this.A00, widthMeasureSpec, heightMeasureSpec);
    }

    public void setFirstHorizontalBias(float bias) {
        this.A00.A00 = bias;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int style) {
        this.A00.A07 = style;
        requestLayout();
    }

    public void setFirstVerticalBias(float bias) {
        this.A00.A01 = bias;
        requestLayout();
    }

    public void setFirstVerticalStyle(int style) {
        this.A00.A08 = style;
        requestLayout();
    }

    public void setHorizontalAlign(int align) {
        this.A00.A09 = align;
        requestLayout();
    }

    public void setHorizontalBias(float bias) {
        this.A00.A02 = bias;
        requestLayout();
    }

    public void setHorizontalGap(int gap) {
        this.A00.A0A = gap;
        requestLayout();
    }

    public void setHorizontalStyle(int style) {
        this.A00.A0B = style;
        requestLayout();
    }

    public void setLastHorizontalBias(float bias) {
        this.A00.A03 = bias;
        requestLayout();
    }

    public void setLastHorizontalStyle(int style) {
        this.A00.A0C = style;
        requestLayout();
    }

    public void setLastVerticalBias(float bias) {
        this.A00.A04 = bias;
        requestLayout();
    }

    public void setLastVerticalStyle(int style) {
        this.A00.A0D = style;
        requestLayout();
    }

    public void setMaxElementsWrap(int max) {
        this.A00.A0E = max;
        requestLayout();
    }

    public void setOrientation(int orientation) {
        this.A00.A0F = orientation;
        requestLayout();
    }

    public void setPadding(int padding) {
        C72141XPp c72141XPp = this.A00;
        ((C3OI) c72141XPp).A05 = padding;
        ((C3OI) c72141XPp).A02 = padding;
        ((C3OI) c72141XPp).A04 = padding;
        ((C3OI) c72141XPp).A03 = padding;
        requestLayout();
    }

    public void setPaddingBottom(int paddingBottom) {
        ((C3OI) this.A00).A02 = paddingBottom;
        requestLayout();
    }

    public void setPaddingLeft(int paddingLeft) {
        ((C3OI) this.A00).A06 = paddingLeft;
        requestLayout();
    }

    public void setPaddingRight(int paddingRight) {
        ((C3OI) this.A00).A07 = paddingRight;
        requestLayout();
    }

    public void setPaddingTop(int paddingTop) {
        ((C3OI) this.A00).A05 = paddingTop;
        requestLayout();
    }

    public void setVerticalAlign(int align) {
        this.A00.A0G = align;
        requestLayout();
    }

    public void setVerticalBias(float bias) {
        this.A00.A05 = bias;
        requestLayout();
    }

    public void setVerticalGap(int gap) {
        this.A00.A0H = gap;
        requestLayout();
    }

    public void setVerticalStyle(int style) {
        this.A00.A0I = style;
        requestLayout();
    }

    public void setWrapMode(int mode) {
        this.A00.A0J = mode;
        requestLayout();
    }

    @Override // X.C3OJ, X.AbstractC56322iM
    public final void A06(AttributeSet attrs) {
        C72141XPp c72141XPp;
        int dimensionPixelSize;
        C72141XPp c72141XPp2;
        int dimensionPixelSize2;
        super.A06(attrs);
        this.A00 = new C72141XPp();
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, AbstractC56282iH.A01);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.A00.A0F = obtainStyledAttributes.getInt(index, 0);
                } else {
                    if (index == 1) {
                        c72141XPp2 = this.A00;
                        dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        ((C3OI) c72141XPp2).A05 = dimensionPixelSize2;
                        ((C3OI) c72141XPp2).A02 = dimensionPixelSize2;
                        ((C3OI) c72141XPp2).A04 = dimensionPixelSize2;
                    } else {
                        if (index == 18) {
                            c72141XPp = this.A00;
                            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                            ((C3OI) c72141XPp).A04 = dimensionPixelSize;
                            ((C3OI) c72141XPp).A06 = dimensionPixelSize;
                        } else if (index == 19) {
                            c72141XPp2 = this.A00;
                            dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 2) {
                            ((C3OI) this.A00).A06 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 3) {
                            ((C3OI) this.A00).A05 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 4) {
                            c72141XPp = this.A00;
                            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 5) {
                            ((C3OI) this.A00).A02 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 54) {
                            this.A00.A0J = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 44) {
                            this.A00.A0B = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 53) {
                            this.A00.A0I = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 38) {
                            this.A00.A07 = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 46) {
                            this.A00.A0C = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 40) {
                            this.A00.A08 = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 48) {
                            this.A00.A0D = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 42) {
                            this.A00.A02 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 37) {
                            this.A00.A00 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 45) {
                            this.A00.A03 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 39) {
                            this.A00.A01 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 47) {
                            this.A00.A04 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 51) {
                            this.A00.A05 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 41) {
                            this.A00.A09 = obtainStyledAttributes.getInt(index, 2);
                        } else if (index == 50) {
                            this.A00.A0G = obtainStyledAttributes.getInt(index, 2);
                        } else if (index == 43) {
                            this.A00.A0A = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 52) {
                            this.A00.A0H = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 49) {
                            this.A00.A0E = obtainStyledAttributes.getInt(index, -1);
                        }
                        ((C3OI) c72141XPp).A07 = dimensionPixelSize;
                    }
                    ((C3OI) c72141XPp2).A03 = dimensionPixelSize2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.A02 = this.A00;
        A04();
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0237, code lost:
    
        if (r1[1] == r13) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x035c, code lost:
    
        if (r4 == 0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x040c, code lost:
    
        if (r12 <= r5) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x040e, code lost:
    
        if (r10 <= 1) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0410, code lost:
    
        r10 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0366, code lost:
    
        if (r4 == 0) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0371, code lost:
    
        r10 = (int) java.lang.Math.ceil(r8 / r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r0 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0515, code lost:
    
        if (r3[1] == r1) goto L297;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:237:0x0410 -> B:179:0x0412). Please report as a decompilation issue!!! */
    @Override // X.C3OJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(X.C3OI r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 1666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.A0B(X.3OI, int, int):void");
    }

    public Flow(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Flow(Context context) {
        super(context);
    }

    public Flow(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
