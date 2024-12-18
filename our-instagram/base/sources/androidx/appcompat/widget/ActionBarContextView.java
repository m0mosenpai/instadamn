package androidx.appcompat.widget;

import X.AbstractC010103p;
import X.AbstractC167007dF;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.AbstractC43594JPz;
import X.AbstractC53402cO;
import X.AbstractC63123SdR;
import X.AbstractC65702TsY;
import X.C04E;
import X.C0f9;
import X.C53122bu;
import X.UDL;
import X.VKM;
import X.WPV;
import X.WPX;
import X.WQH;
import X.WQR;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public class ActionBarContextView extends ViewGroup {
    public int A00;
    public View A01;
    public WPV A02;
    public C04E A03;
    public CharSequence A04;
    public CharSequence A05;
    public boolean A06;
    public boolean A07;
    public int A08;
    public int A09;
    public int A0A;
    public View A0B;
    public View A0C;
    public LinearLayout A0D;
    public TextView A0E;
    public TextView A0F;
    public boolean A0G;
    public ActionMenuView A0H;
    public final Context A0I;
    public final WQR A0J;

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.A0J = new WQR(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && (i2 = typedValue.resourceId) != 0) {
            this.A0I = new ContextThemeWrapper(context, i2);
        } else {
            this.A0I = context;
        }
        C53122bu A00 = C53122bu.A00(context, attributeSet, AbstractC53402cO.A03, i, 0);
        setBackground(A00.A02(0));
        TypedArray typedArray = A00.A02;
        this.A0A = typedArray.getResourceId(5, 0);
        this.A09 = typedArray.getResourceId(4, 0);
        this.A00 = typedArray.getLayoutDimension(3, 0);
        this.A08 = typedArray.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArray.recycle();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    private void A01() {
        if (this.A0D == null) {
            Context context = getContext();
            LayoutInflater.from(context).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.A0D = linearLayout;
            this.A0F = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.A0E = (TextView) this.A0D.findViewById(R.id.action_bar_subtitle);
            int i = this.A0A;
            if (i != 0) {
                this.A0F.setTextAppearance(context, i);
            }
            int i2 = this.A09;
            if (i2 != 0) {
                this.A0E.setTextAppearance(context, i2);
            }
        }
        this.A0F.setText(this.A05);
        this.A0E.setText(this.A04);
        boolean z = !TextUtils.isEmpty(this.A05);
        int i3 = !TextUtils.isEmpty(this.A04) ? 1 : 0;
        int i4 = 0;
        this.A0E.setVisibility(AbstractC167007dF.A05(i3));
        LinearLayout linearLayout2 = this.A0D;
        if (!z && i3 == 0) {
            i4 = 8;
        }
        linearLayout2.setVisibility(i4);
        if (this.A0D.getParent() == null) {
            addView(this.A0D);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(X.VK7 r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.A01
            if (r0 != 0) goto L8c
            android.view.LayoutInflater r1 = X.AbstractC25228BEl.A0P(r7)
            int r0 = r7.A08
            android.view.View r0 = X.AbstractC31172DnG.A0A(r1, r7, r0)
            r7.A01 = r0
        L10:
            r7.addView(r0)
        L13:
            android.view.View r1 = r7.A01
            r0 = 2131427603(0x7f0b0113, float:1.8476827E38)
            android.view.View r1 = r1.findViewById(r0)
            r7.A0B = r1
            r6 = 0
            X.WNV r0 = new X.WNV
            r0.<init>(r6, r7, r8)
            r1.setOnClickListener(r0)
            boolean r0 = r8 instanceof X.UDD
            if (r0 == 0) goto L87
            X.UDD r8 = (X.UDD) r8
            X.WQH r2 = r8.A02
        L2f:
            X.WPV r0 = r7.A02
            if (r0 == 0) goto L36
            r0.A01()
        L36:
            android.content.Context r1 = r7.getContext()
            X.WPV r0 = new X.WPV
            r0.<init>(r1)
            r7.A02 = r0
            r5 = 1
            r0.A0G = r5
            r0.A0H = r5
            r1 = -2
            r0 = -1
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r1, r0)
            X.WPV r1 = r7.A02
            android.content.Context r0 = r7.A0I
            r2.A07(r0, r1)
            X.WPV r3 = r7.A02
            X.X8d r2 = r3.A08
            if (r2 != 0) goto L6f
            android.view.LayoutInflater r1 = r3.A05
            r0 = 2131623940(0x7f0e0004, float:1.8875046E38)
            android.view.View r1 = r1.inflate(r0, r7, r6)
            X.X8d r1 = (X.InterfaceC71870X8d) r1
            r3.A08 = r1
            X.WQH r0 = r3.A06
            r1.COE(r0)
            r3.FBO(r5)
        L6f:
            X.X8d r1 = r3.A08
            if (r2 == r1) goto L79
            r0 = r1
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            r0.setPresenter(r3)
        L79:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r7.A0H = r1
            r0 = 0
            r1.setBackground(r0)
            androidx.appcompat.widget.ActionMenuView r0 = r7.A0H
            r7.addView(r0, r4)
            return
        L87:
            X.UDE r8 = (X.UDE) r8
            X.WQH r2 = r8.A03
            goto L2f
        L8c:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L13
            android.view.View r0 = r7.A01
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.A05(X.VK7):void");
    }

    /* renamed from: getAnimatedVisibility$AbsActionBarView, reason: merged with bridge method [inline-methods] */
    public int getAnimatedVisibility() {
        if (this.A03 != null) {
            return this.A0J.A00;
        }
        return getVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return this.A00;
    }

    public int getContentHeight$AbsActionBarView() {
        return this.A00;
    }

    public CharSequence getSubtitle() {
        return this.A04;
    }

    public CharSequence getTitle() {
        return this.A05;
    }

    public void setCustomView(View view) {
        View view2 = this.A0C;
        if (view2 != null) {
            removeView(view2);
        }
        this.A0C = view;
        if (view != null) {
            LinearLayout linearLayout = this.A0D;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.A0D = null;
            }
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.A04 = charSequence;
        A01();
    }

    public void setTitle(CharSequence charSequence) {
        this.A05 = charSequence;
        A01();
        AbstractC010103p.A0F(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.A07) {
            requestLayout();
        }
        this.A07 = z;
    }

    public static final int A00(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        return measuredWidth;
    }

    public final void A04() {
        removeAllViews();
        this.A0C = null;
        this.A0H = null;
        this.A02 = null;
        View view = this.A0B;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC53402cO.A00, R.attr.actionBarStyle, 0);
        this.A00 = obtainStyledAttributes.getLayoutDimension(13, 0);
        obtainStyledAttributes.recycle();
        WPV wpv = this.A02;
        if (wpv != null) {
            wpv.A00 = VKM.A00(wpv.A01);
            WQH wqh = wpv.A06;
            if (wqh != null) {
                wqh.A0D(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        WPX wpx;
        int A06 = C0f9.A06(-474531504);
        super.onDetachedFromWindow();
        WPV wpv = this.A02;
        if (wpv != null) {
            wpv.A02();
            UDL udl = this.A02.A09;
            if (udl != null && (wpx = udl.A03) != null && wpx.CdI()) {
                udl.A03.dismiss();
            }
        }
        C0f9.A0D(1387246402, A06);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A0G = false;
        }
        if (!this.A0G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.A0G = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.A0G = false;
            return true;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        boolean z2 = true;
        if (getLayoutDirection() == 1) {
            paddingLeft = (i3 - i) - getPaddingRight();
        } else {
            z2 = false;
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int A0A = AbstractC65702TsY.A0A(this, i4 - i2);
        View view = this.A01;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A01.getLayoutParams();
            if (z2) {
                int i7 = marginLayoutParams.rightMargin;
                i5 = marginLayoutParams.leftMargin;
                i6 = paddingLeft - i7;
            } else {
                int i8 = marginLayoutParams.leftMargin;
                i5 = marginLayoutParams.rightMargin;
                i6 = paddingLeft + i8;
            }
            int A00 = i6 + A00(this.A01, i6, paddingTop, A0A, z2);
            int i9 = A00 + i5;
            if (z2) {
                i9 = A00 - i5;
            }
            paddingLeft = i9;
        }
        LinearLayout linearLayout = this.A0D;
        if (linearLayout != null && this.A0C == null && linearLayout.getVisibility() != 8) {
            paddingLeft += A00(this.A0D, paddingLeft, paddingTop, A0A, z2);
        }
        View view2 = this.A0C;
        if (view2 != null) {
            A00(view2, paddingLeft, paddingTop, A0A, z2);
        }
        if (z2) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.A0H;
        if (actionMenuView != null) {
            A00(actionMenuView, paddingRight, paddingTop, A0A, !z2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int i3 = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
        if (mode == 1073741824) {
            if (View.MeasureSpec.getMode(i2) != 0) {
                int size = View.MeasureSpec.getSize(i);
                int i4 = this.A00;
                if (i4 <= 0) {
                    i4 = View.MeasureSpec.getSize(i2);
                }
                int A09 = AbstractC65702TsY.A09(this);
                int A08 = AbstractC43594JPz.A08(this, size);
                int i5 = i4 - A09;
                int i6 = Integer.MIN_VALUE;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
                View view = this.A01;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(A08, Integer.MIN_VALUE), makeMeasureSpec);
                    int max = Math.max(0, A08 - view.getMeasuredWidth());
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A01.getLayoutParams();
                    A08 = max - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.A0H;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    ActionMenuView actionMenuView2 = this.A0H;
                    actionMenuView2.measure(View.MeasureSpec.makeMeasureSpec(A08, Integer.MIN_VALUE), makeMeasureSpec);
                    A08 = Math.max(0, A08 - actionMenuView2.getMeasuredWidth());
                }
                LinearLayout linearLayout = this.A0D;
                if (linearLayout != null && this.A0C == null) {
                    if (this.A07) {
                        this.A0D.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.A0D.getMeasuredWidth();
                        boolean z = false;
                        if (measuredWidth <= A08) {
                            z = true;
                            A08 -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.A0D;
                        int i7 = 8;
                        if (z) {
                            i7 = 0;
                        }
                        linearLayout2.setVisibility(i7);
                    } else {
                        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(A08, Integer.MIN_VALUE), makeMeasureSpec);
                        A08 = Math.max(0, A08 - linearLayout.getMeasuredWidth());
                    }
                }
                View view2 = this.A0C;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i8 = layoutParams.width;
                    if (i8 != -2) {
                        i6 = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
                        if (i8 >= 0) {
                            A08 = Math.min(i8, A08);
                        }
                    }
                    int i9 = layoutParams.height;
                    if (i9 != -2) {
                        if (i9 >= 0) {
                            i5 = Math.min(i9, i5);
                        }
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    AbstractC65702TsY.A12(this.A0C, i5, i3, View.MeasureSpec.makeMeasureSpec(A08, i6));
                }
                if (this.A00 <= 0) {
                    int childCount = getChildCount();
                    i4 = 0;
                    for (int i10 = 0; i10 < childCount; i10++) {
                        int measuredHeight = getChildAt(i10).getMeasuredHeight() + A09;
                        if (measuredHeight > i4) {
                            i4 = measuredHeight;
                        }
                    }
                }
                setMeasuredDimension(size, i4);
                return;
            }
            throw AbstractC31175DnJ.A0V(AbstractC31173DnH.A0q(this), " can only be used with android:layout_height=\"wrap_content\"");
        }
        throw AbstractC31175DnJ.A0V(AbstractC31173DnH.A0q(this), " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }

    @Override // android.view.View
    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(1720691346);
        int A052 = C0f9.A05(-756703698);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A06 = false;
        }
        if (!this.A06) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.A06 = true;
                }
                C0f9.A0C(-656565677, A052);
                C0f9.A0C(1051507495, A05);
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A06 = false;
        }
        C0f9.A0C(-656565677, A052);
        C0f9.A0C(1051507495, A05);
        return true;
    }

    public void setContentHeight(int i) {
        this.A00 = i;
    }

    @Override // android.view.View
    /* renamed from: setVisibility$AbsActionBarView, reason: merged with bridge method [inline-methods] */
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C04E c04e = this.A03;
            if (c04e != null) {
                c04e.A00();
            }
            super.setVisibility(i);
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
