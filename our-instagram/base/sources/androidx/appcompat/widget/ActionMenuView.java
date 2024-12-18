package androidx.appcompat.widget;

import X.AbstractC65702TsY;
import X.AbstractC65703TsZ;
import X.C0f9;
import X.InterfaceC52052a5;
import X.InterfaceC71869X8c;
import X.InterfaceC71870X8d;
import X.InterfaceC71933XBi;
import X.InterfaceC71935XBk;
import X.UDY;
import X.UDo;
import X.WPM;
import X.WPV;
import X.WQH;
import X.WQJ;
import X.X6o;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;

/* loaded from: classes11.dex */
public class ActionMenuView extends LinearLayoutCompat implements InterfaceC71869X8c, InterfaceC71870X8d {
    public int A00;
    public int A01;
    public InterfaceC52052a5 A02;
    public WQH A03;
    public WPV A04;
    public X6o A05;
    public boolean A06;
    public int A07;
    public int A08;
    public Context A09;
    public InterfaceC71933XBi A0A;
    public boolean A0B;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public final boolean A09(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC71935XBk)) {
            z = false | ((InterfaceC71935XBk) childAt).CsB();
        }
        if (i > 0 && (childAt2 instanceof InterfaceC71935XBk)) {
            return z | ((InterfaceC71935XBk) childAt2).CsC();
        }
        return z;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.UDo, android.view.ViewGroup$LayoutParams, android.widget.LinearLayout$LayoutParams] */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.A04 = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r0 <= 0) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.UDo, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.UDo, android.widget.LinearLayout$LayoutParams] */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: A08, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.UDo generateLayoutParams(android.view.ViewGroup.LayoutParams r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L20
            boolean r0 = r3 instanceof X.UDo
            if (r0 == 0) goto L1a
            X.UDo r3 = (X.UDo) r3
            X.UDo r1 = new X.UDo
            r1.<init>(r3)
            boolean r0 = r3.A04
            r1.A04 = r0
        L11:
            int r0 = r1.gravity
            if (r0 > 0) goto L19
        L15:
            r0 = 16
            r1.gravity = r0
        L19:
            return r1
        L1a:
            X.UDo r1 = new X.UDo
            r1.<init>(r3)
            goto L11
        L20:
            r0 = -2
            X.UDo r1 = new X.UDo
            r1.<init>(r0, r0)
            r0 = 0
            r1.A04 = r0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.generateLayoutParams(android.view.ViewGroup$LayoutParams):X.UDo");
    }

    @Override // X.InterfaceC71869X8c
    public final boolean CP9(WQJ wqj) {
        return this.A03.A0I(wqj, null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Menu getMenu() {
        WQH wqh = this.A03;
        if (wqh == null) {
            Context context = getContext();
            WQH wqh2 = new WQH(context);
            this.A03 = wqh2;
            wqh2.A03 = new WPM(this);
            WPV wpv = new WPV(context);
            this.A04 = wpv;
            wpv.A0G = true;
            wpv.A0H = true;
            InterfaceC71933XBi interfaceC71933XBi = this.A0A;
            InterfaceC71933XBi interfaceC71933XBi2 = interfaceC71933XBi;
            if (interfaceC71933XBi == null) {
                interfaceC71933XBi2 = new Object();
            }
            wpv.A07 = interfaceC71933XBi2;
            this.A03.A07(this.A09, wpv);
            WPV wpv2 = this.A04;
            wpv2.A08 = this;
            WQH wqh3 = wpv2.A06;
            this.A03 = wqh3;
            return wqh3;
        }
        return wqh;
    }

    public int getPopupTheme() {
        return this.A08;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int A08;
        int i6;
        if (!this.A0B) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int i8 = super.A04;
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean A1a = AbstractC65703TsZ.A1a(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                UDo uDo = (UDo) childAt.getLayoutParams();
                if (uDo.A04) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (A09(i12)) {
                        measuredWidth += i8;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (A1a) {
                        i6 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) uDo).leftMargin;
                        A08 = i6 + measuredWidth;
                    } else {
                        A08 = AbstractC65702TsY.A08(this) - ((ViewGroup.MarginLayoutParams) uDo).rightMargin;
                        i6 = A08 - measuredWidth;
                    }
                    int i13 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i13, A08, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) uDo).leftMargin) + ((ViewGroup.MarginLayoutParams) uDo).rightMargin;
                    A09(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        if (i16 > 0) {
            i5 = paddingRight / i16;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (A1a) {
            int A082 = AbstractC65702TsY.A08(this);
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                UDo uDo2 = (UDo) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !uDo2.A04) {
                    int i18 = A082 - ((ViewGroup.MarginLayoutParams) uDo2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    A082 = i18 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) uDo2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            UDo uDo3 = (UDo) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !uDo3.A04) {
                int i21 = paddingLeft + ((ViewGroup.MarginLayoutParams) uDo3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) uDo3).rightMargin + max;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01db, code lost:
    
        if (r10 != 1) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        if ((!android.text.TextUtils.isEmpty(((X.C3WF) r13).getText())) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e4, code lost:
    
        if ((!android.text.TextUtils.isEmpty(r0.getText())) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0157, code lost:
    
        if (r10 != 2) goto L72;
     */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r32, int r33) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.A04.A0E = z;
    }

    public void setMenuCallbacks(InterfaceC71933XBi interfaceC71933XBi, InterfaceC52052a5 interfaceC52052a5) {
        this.A0A = interfaceC71933XBi;
        this.A02 = interfaceC52052a5;
    }

    public void setPopupTheme(int i) {
        Context contextThemeWrapper;
        if (this.A08 != i) {
            this.A08 = i;
            if (i == 0) {
                contextThemeWrapper = getContext();
            } else {
                contextThemeWrapper = new ContextThemeWrapper(getContext(), i);
            }
            this.A09 = contextThemeWrapper;
        }
    }

    public void setPresenter(WPV wpv) {
        this.A04 = wpv;
        wpv.A08 = this;
        this.A03 = wpv.A06;
    }

    @Override // X.InterfaceC71870X8d
    public final void COE(WQH wqh) {
        this.A03 = wqh;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof UDo;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        WPV wpv = this.A04;
        UDY udy = wpv.A0C;
        if (udy != null) {
            return udy.getDrawable();
        }
        if (wpv.A0F) {
            return wpv.A03;
        }
        return null;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        WPV wpv = this.A04;
        if (wpv != null) {
            wpv.FBO(false);
            if (this.A04.A03()) {
                this.A04.A02();
                this.A04.A04();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-1251837996);
        super.onDetachedFromWindow();
        WPV wpv = this.A04;
        if (wpv != null) {
            wpv.A01();
        }
        C0f9.A0D(-1776569546, A06);
    }

    public void setOnMenuItemClickListener(X6o x6o) {
        this.A05 = x6o;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        WPV wpv = this.A04;
        UDY udy = wpv.A0C;
        if (udy != null) {
            udy.setImageDrawable(drawable);
        } else {
            wpv.A0F = true;
            wpv.A03 = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.A06 = z;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        super.A09 = false;
        float A00 = AbstractC65702TsY.A00(context);
        this.A01 = (int) (56.0f * A00);
        this.A00 = (int) (A00 * 4.0f);
        this.A09 = context;
        this.A08 = 0;
    }
}
