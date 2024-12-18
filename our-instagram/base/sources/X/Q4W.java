package X;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import com.facebook.R;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.ViewGroupManager;

/* loaded from: classes10.dex */
public class Q4W extends ViewGroup implements XD4, InterfaceC65495TlJ, InterfaceC65658Tqk, InterfaceC65222TgD, InterfaceC65223TgE, InterfaceC65224TgG {
    public int A00;
    public Rect A01;
    public Rect A02;
    public InterfaceC65221TgC A03;
    public EnumC61122Rfc A04;
    public ViewOnLayoutChangeListenerC63510Sod A05;
    public boolean A06;
    public boolean A07;
    public View[] A08;
    public float A09;
    public C62722SNm A0A;
    public Integer A0B;
    public String A0C;
    public final Rect A0D;
    public static final ViewGroup.LayoutParams A0F = new ViewGroup.LayoutParams(0, 0);
    public static final Rect A0E = AbstractC166987dD.A0U();

    private void A00() {
        setClipChildren(false);
        this.A07 = false;
        this.A08 = null;
        this.A00 = 0;
        this.A01 = null;
        this.A02 = null;
        this.A0B = C05F.A00;
        this.A04 = EnumC61122Rfc.A02;
        this.A05 = null;
        this.A03 = null;
        this.A06 = false;
        this.A0A = null;
        this.A09 = 1.0f;
        this.A0C = "visible";
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i2 + i;
        for (int i4 = i; i4 < i3; i4++) {
            if (i4 < getChildCount()) {
                A04(getChildAt(i4));
            }
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i2 + i;
        for (int i4 = i; i4 < i3; i4++) {
            if (i4 < getChildCount()) {
                A04(getChildAt(i4));
            }
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    private void A01(Rect rect) {
        AbstractC05810Sj.A00(this.A08);
        int i = 0;
        for (int i2 = 0; i2 < this.A00; i2++) {
            A02(rect, this, i2, i);
            if (this.A08[i2].getParent() == null) {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0034, code lost:
    
        if (r0.hasEnded() != false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(android.graphics.Rect r6, X.Q4W r7, int r8, int r9) {
        /*
            android.view.View[] r0 = r7.A08
            X.AbstractC05810Sj.A00(r0)
            r4 = r0[r8]
            android.graphics.Rect r5 = X.Q4W.A0E
            int r3 = r4.getLeft()
            int r2 = r4.getTop()
            int r1 = r4.getRight()
            int r0 = r4.getBottom()
            r5.set(r3, r2, r1, r0)
            int r3 = r5.left
            int r2 = r5.top
            int r1 = r5.right
            int r0 = r5.bottom
            boolean r3 = r6.intersects(r3, r2, r1, r0)
            android.view.animation.Animation r0 = r4.getAnimation()
            r2 = 1
            if (r0 == 0) goto L36
            boolean r0 = r0.hasEnded()
            r1 = 1
            if (r0 == 0) goto L37
        L36:
            r1 = 0
        L37:
            android.view.ViewParent r0 = r4.getParent()
            if (r3 != 0) goto L54
            if (r0 == 0) goto L53
            if (r1 != 0) goto L53
            r7.removeViewInLayout(r4)
        L44:
            boolean r0 = r4 instanceof X.XD4
            if (r0 == 0) goto L53
            X.XD4 r4 = (X.XD4) r4
            boolean r0 = r4.getRemoveClippedSubviews()
            if (r0 == 0) goto L53
            r4.FAW()
        L53:
            return
        L54:
            if (r0 != 0) goto L44
            int r8 = r8 - r9
            android.view.ViewGroup$LayoutParams r0 = X.Q4W.A0F
            r7.addViewInLayout(r4, r8, r0, r2)
            r7.invalidate()
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q4W.A02(android.graphics.Rect, X.Q4W, int, int):void");
    }

    private C62722SNm getDrawingOrderHelper() {
        C62722SNm c62722SNm = this.A0A;
        if (c62722SNm == null) {
            C62722SNm c62722SNm2 = new C62722SNm(this);
            this.A0A = c62722SNm2;
            return c62722SNm2;
        }
        return c62722SNm;
    }

    public final void A06() {
        if (this.A08 != null && this.A05 != null) {
            for (int i = 0; i < this.A00; i++) {
                this.A08[i].removeOnLayoutChangeListener(this.A05);
            }
        }
        A00();
        this.A0D.setEmpty();
        A0E.setEmpty();
        removeAllViews();
        super.setBackground(null);
        this.A04 = EnumC61122Rfc.A02;
    }

    public final void A07() {
        float f;
        if (!this.A0C.equals("visible")) {
            float rotationX = getRotationX();
            float rotationY = getRotationY();
            if (rotationX < -90.0f || rotationX >= 90.0f || rotationY < -90.0f || rotationY >= 90.0f) {
                f = 0.0f;
                setAlpha(f);
            }
        }
        f = this.A09;
        setAlpha(f);
    }

    @Override // X.XD4
    public final void AoA(Rect rect) {
        rect.set(this.A01);
    }

    @Override // X.XD4
    public final void FAW() {
        if (this.A07) {
            AbstractC05810Sj.A00(this.A01);
            AbstractC05810Sj.A00(this.A08);
            W8K.A00(this, this.A01);
            A01(this.A01);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.A0B != C05F.A00 || getTag(R.id.filter) != null) {
            C63403SjY.A03(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (!C63234Sfm.A02(this.A04)) {
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public int getAllChildrenCount() {
        return this.A00;
    }

    public Rect getHitSlopRect() {
        return this.A02;
    }

    @Override // X.InterfaceC65360Tio
    public String getOverflow() {
        int intValue = this.A0B.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 0) {
                    return null;
                }
                return "visible";
            }
            return "scroll";
        }
        return "hidden";
    }

    @Override // X.InterfaceC65658Tqk
    public Rect getOverflowInset() {
        return this.A0D;
    }

    public EnumC61122Rfc getPointerEvents() {
        return this.A04;
    }

    @Override // X.XD4
    public boolean getRemoveClippedSubviews() {
        return this.A07;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.A06;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (ReactFeatureFlags.dispatchPointerEvents) {
            return C63234Sfm.A01(this.A04);
        }
        return super.onHoverEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (getId() == r1) goto L10;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            X.TgC r0 = r3.A03
            r2 = 1
            if (r0 == 0) goto L1c
            X.T0X r0 = (X.T0X) r0
            X.C14360o3.A0B(r4, r2)
            int r1 = r0.A01
            r0 = -1
            if (r1 == r0) goto L1c
            int r0 = r4.getAction()
            if (r0 == r2) goto L1c
            int r0 = r3.getId()
            if (r0 != r1) goto L1c
        L1b:
            return r2
        L1c:
            X.Rfc r0 = r3.A04
            boolean r0 = X.C63234Sfm.A02(r0)
            if (r0 == 0) goto L1b
            boolean r2 = super.onInterceptTouchEvent(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q4W.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackfaceVisibility(String str) {
        this.A0C = str;
        A07();
    }

    public void setBorderStyle(String str) {
        Integer A00;
        if (str == null) {
            A00 = null;
        } else {
            A00 = C69829VwF.A00(str);
        }
        C63403SjY.A0C(this, A00);
    }

    public void setOpacityIfPossible(float f) {
        this.A09 = f;
        A07();
    }

    public void setOverflow(String str) {
        Integer num;
        if (str == null || (num = C69830VwG.A00(str)) == null) {
            num = C05F.A00;
        }
        this.A0B = num;
        invalidate();
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z != this.A07) {
            this.A07 = z;
            if (z) {
                Rect A0U = AbstractC166987dD.A0U();
                this.A01 = A0U;
                W8K.A00(this, A0U);
                int childCount = getChildCount();
                this.A00 = childCount;
                this.A08 = new View[Math.max(12, childCount)];
                this.A05 = new ViewOnLayoutChangeListenerC63510Sod(this);
                for (int i = 0; i < this.A00; i++) {
                    View childAt = getChildAt(i);
                    this.A08[i] = childAt;
                    childAt.addOnLayoutChangeListener(this.A05);
                }
                FAW();
                return;
            }
            AbstractC05810Sj.A00(this.A01);
            AbstractC05810Sj.A00(this.A08);
            AbstractC05810Sj.A00(this.A05);
            for (int i2 = 0; i2 < this.A00; i2++) {
                this.A08[i2].removeOnLayoutChangeListener(this.A05);
            }
            getDrawingRect(this.A01);
            A01(this.A01);
            this.A08 = null;
            this.A01 = null;
            this.A00 = 0;
            this.A05 = null;
        }
    }

    public Q4W(Context context) {
        super(context);
        this.A0D = AbstractC166987dD.A0U();
        A00();
    }

    private void A03(View view) {
        boolean z;
        if (!A05()) {
            C62722SNm drawingOrderHelper = getDrawingOrderHelper();
            if (ViewGroupManager.getViewZIndex(view) != null) {
                drawingOrderHelper.A00++;
            }
            drawingOrderHelper.A01 = null;
            z = AbstractC167007dF.A1O(getDrawingOrderHelper().A00);
        } else {
            z = false;
        }
        setChildrenDrawingOrderEnabled(z);
    }

    private void A04(View view) {
        boolean z;
        if (!A05()) {
            if (indexOfChild(view) != -1) {
                C62722SNm drawingOrderHelper = getDrawingOrderHelper();
                if (ViewGroupManager.getViewZIndex(view) != null) {
                    drawingOrderHelper.A00--;
                }
                drawingOrderHelper.A01 = null;
                z = AbstractC167007dF.A1O(getDrawingOrderHelper().A00);
            } else {
                return;
            }
        } else {
            z = false;
        }
        setChildrenDrawingOrderEnabled(z);
    }

    private boolean A05() {
        if (getId() == -1 || getId() % 2 != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC65495TlJ
    public final int CIj(int i) {
        if (!A05() && getDrawingOrderHelper().A00 > 0) {
            return getDrawingOrderHelper().A00(getChildCount(), i);
        }
        return i;
    }

    @Override // X.InterfaceC65495TlJ
    public final void FAq() {
        if (!A05()) {
            getDrawingOrderHelper().A01();
            setChildrenDrawingOrderEnabled(AbstractC167007dF.A1O(getDrawingOrderHelper().A00));
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A03(view);
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        A03(view);
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        try {
            super.dispatchProvideStructure(viewStructure);
        } catch (NullPointerException e) {
            C0I2.A05("ReactNative", "NullPointerException when executing dispatchProvideStructure", e);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int A03 = C0f9.A03(-1061329973);
        if (Build.VERSION.SDK_INT >= 29 && C62797SRr.A00(this) == 2) {
            for (int i = 0; i < getChildCount(); i++) {
                if (getChildAt(i).getTag(R.id.mix_blend_mode) != null) {
                    Rect rect = this.A0D;
                    canvas.saveLayer(rect.left, rect.top, getWidth() + (-rect.right), getHeight() + (-rect.bottom), null);
                    super.draw(canvas);
                    canvas.restore();
                    break;
                }
            }
        }
        super.draw(canvas);
        C0f9.A0A(307627363, A03);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = false;
        if (view.getElevation() > 0.0f) {
            z = true;
            C62870SUu.A00(canvas, true);
        }
        BlendMode blendMode = null;
        if (Build.VERSION.SDK_INT >= 29) {
            int i = 0;
            while (true) {
                if (i >= getChildCount()) {
                    break;
                }
                if (getChildAt(i).getTag(R.id.mix_blend_mode) != null) {
                    blendMode = (BlendMode) view.getTag(R.id.mix_blend_mode);
                    if (blendMode != null) {
                        Paint A0R = AbstractC166987dD.A0R();
                        A0R.setBlendMode(blendMode);
                        Rect rect = this.A0D;
                        canvas.saveLayer(rect.left, rect.top, getWidth() + (-rect.right), getHeight() + (-rect.bottom), A0R);
                    }
                } else {
                    i++;
                }
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (blendMode != null) {
            canvas.restore();
        }
        if (z) {
            C62870SUu.A00(canvas, false);
        }
        return drawChild;
    }

    public int getBackgroundColor() {
        Q2R q2r;
        Q2N q2n;
        Drawable background = getBackground();
        if ((background instanceof Q2R) && (q2r = (Q2R) background) != null && (q2n = q2r.A03) != null) {
            int i = q2n.A01;
            if (Integer.valueOf(i) != null) {
                return i;
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        if (!A05()) {
            return getDrawingOrderHelper().A00(i, i2);
        }
        return i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = C0f9.A06(-1104786157);
        super.onAttachedToWindow();
        if (this.A07) {
            FAW();
        }
        C0f9.A0D(-1784533721, A06);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C69827VwD.A00(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(234321197);
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A07) {
            FAW();
        }
        C0f9.A0D(1874857776, A06);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(1297029251);
        boolean z = true;
        int i = 400799890;
        if (!C63234Sfm.A01(this.A04)) {
            z = false;
            i = -1702743922;
        }
        C0f9.A0C(i, A05);
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        A04(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        A04(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        A04(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        C63403SjY.A0B(this, Integer.valueOf(i));
    }

    public void setHitSlopRect(Rect rect) {
        this.A02 = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z) {
        this.A06 = z;
    }

    public void setOnInterceptTouchEventListener(InterfaceC65221TgC interfaceC65221TgC) {
        this.A03 = interfaceC65221TgC;
    }

    public void setPointerEvents(EnumC61122Rfc enumC61122Rfc) {
        this.A04 = enumC61122Rfc;
    }

    @Deprecated(forRemoval = true, since = "0.76.0")
    public void setTranslucentBackgroundDrawable(Drawable drawable) {
        C63403SjY.A04(drawable, this);
    }

    public void setBorderRadius(VDC vdc, C63011Saa c63011Saa) {
        C63403SjY.A08(this, c63011Saa, vdc);
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setBorderRadius(float f) {
        C63011Saa c63011Saa;
        if (Float.isNaN(f)) {
            c63011Saa = null;
        } else {
            c63011Saa = new C63011Saa(C05F.A00, f);
        }
        C63403SjY.A08(this, c63011Saa, VDC.values()[0]);
    }
}
