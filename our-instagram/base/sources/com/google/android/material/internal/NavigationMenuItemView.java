package com.google.android.material.internal;

import X.AbstractC010103p;
import X.AbstractC167007dF;
import X.C02V;
import X.C0f9;
import X.C3OO;
import X.C65M;
import X.C65N;
import X.InterfaceC71934XBj;
import X.UEP;
import X.WQJ;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes11.dex */
public class NavigationMenuItemView extends LinearLayoutCompat implements InterfaceC71934XBj {
    public static final int[] A0G = {R.attr.state_checked};
    public int A00;
    public int A01;
    public FrameLayout A02;
    public WQJ A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public ColorStateList A07;
    public Drawable A08;
    public Drawable A09;
    public boolean A0A;
    public boolean A0B;
    public final Rect A0C;
    public final Rect A0D;
    public final CheckedTextView A0E;
    public final C02V A0F;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0D = new Rect();
        this.A0C = new Rect();
        this.A00 = 119;
        this.A06 = true;
        this.A05 = false;
        TypedArray A00 = C65M.A00(context, attributeSet, C65N.A0G, new int[0], i, 0);
        this.A00 = A00.getInt(1, 119);
        Drawable drawable = A00.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.A06 = A00.getBoolean(2, true);
        A00.recycle();
        UEP uep = new UEP(this, 8);
        this.A0F = uep;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.facebook.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.A01 = context.getResources().getDimensionPixelSize(com.facebook.R.dimen.abc_dialog_padding_material);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.facebook.R.id.design_menu_item_text);
        this.A0E = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC010103p.A0B(checkedTextView, uep);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.A0A) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.A07);
            }
            int i = this.A01;
            drawable.setBounds(0, 0, i, i);
        } else if (this.A0B) {
            if (this.A08 == null) {
                Drawable drawable2 = getResources().getDrawable(com.facebook.R.drawable.navigation_empty_icon, getContext().getTheme());
                this.A08 = drawable2;
                if (drawable2 != null) {
                    int i2 = this.A01;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.A08;
        }
        this.A0E.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    private void setActionView(View view) {
        if (view != null) {
            FrameLayout frameLayout = this.A02;
            if (frameLayout == null) {
                frameLayout = (FrameLayout) ((ViewStub) findViewById(com.facebook.R.id.design_menu_item_action_area_stub)).inflate();
                this.A02 = frameLayout;
            }
            frameLayout.removeAllViews();
            this.A02.addView(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
    
        if (r5.A03.getActionView() == null) goto L17;
     */
    @Override // X.InterfaceC71934XBj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void COF(X.WQJ r6, int r7) {
        /*
            r5 = this;
            r5.A03 = r6
            int r0 = r6.getItemId()
            if (r0 <= 0) goto Lb
            r5.setId(r0)
        Lb:
            boolean r0 = r6.isVisible()
            int r0 = X.AbstractC167007dF.A05(r0)
            r5.setVisibility(r0)
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 != 0) goto L52
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources$Theme r2 = r0.getTheme()
            r1 = 2130969099(0x7f04020b, float:1.754687E38)
            r0 = 1
            boolean r0 = r2.resolveAttribute(r1, r4, r0)
            if (r0 == 0) goto Lca
            android.graphics.drawable.StateListDrawable r3 = new android.graphics.drawable.StateListDrawable
            r3.<init>()
            int[] r2 = com.google.android.material.internal.NavigationMenuItemView.A0G
            int r1 = r4.data
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r3.addState(r2, r0)
            int[] r2 = android.view.View.EMPTY_STATE_SET
            r1 = 0
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r3.addState(r2, r0)
        L4f:
            r5.setBackground(r3)
        L52:
            boolean r0 = r6.isCheckable()
            r5.setCheckable(r0)
            boolean r0 = r6.isChecked()
            r5.setChecked(r0)
            boolean r0 = r6.isEnabled()
            r5.setEnabled(r0)
            java.lang.CharSequence r0 = r6.getTitle()
            r5.setTitle(r0)
            android.graphics.drawable.Drawable r0 = r6.getIcon()
            r5.setIcon(r0)
            android.view.View r0 = r6.getActionView()
            r5.setActionView(r0)
            java.lang.CharSequence r0 = r6.getContentDescription()
            r5.setContentDescription(r0)
            java.lang.CharSequence r0 = r6.getTooltipText()
            r5.setTooltipText(r0)
            X.WQJ r1 = r5.A03
            java.lang.CharSequence r0 = r1.getTitle()
            if (r0 != 0) goto La1
            android.graphics.drawable.Drawable r0 = r1.getIcon()
            if (r0 != 0) goto La1
            X.WQJ r0 = r5.A03
            android.view.View r1 = r0.getActionView()
            r0 = 1
            if (r1 != 0) goto La2
        La1:
            r0 = 0
        La2:
            android.widget.CheckedTextView r1 = r5.A0E
            if (r0 == 0) goto Lbc
            r0 = 8
            r1.setVisibility(r0)
            android.widget.FrameLayout r0 = r5.A02
            if (r0 == 0) goto Lbb
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = -1
        Lb4:
            r1.width = r0
            android.widget.FrameLayout r0 = r5.A02
            r0.setLayoutParams(r1)
        Lbb:
            return
        Lbc:
            r0 = 0
            r1.setVisibility(r0)
            android.widget.FrameLayout r0 = r5.A02
            if (r0 == 0) goto Lbb
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = -2
            goto Lb4
        Lca:
            r3 = 0
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.NavigationMenuItemView.COF(X.WQJ, int):void");
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.A09;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.A00;
    }

    @Override // X.InterfaceC71934XBj
    public WQJ getItemData() {
        return this.A03;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        WQJ wqj = this.A03;
        if (wqj != null && wqj.isCheckable() && wqj.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0G);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.A09;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.A09);
            }
            this.A09 = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.A00 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.A00 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.A00 = i;
            if (i == 119 && this.A09 != null) {
                this.A09.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public void setIconPadding(int i) {
        this.A0E.setCompoundDrawablePadding(i);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.A07 = colorStateList;
        this.A0A = AbstractC167007dF.A1W(colorStateList);
        WQJ wqj = this.A03;
        if (wqj != null) {
            setIcon(wqj.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.A0E.setMaxLines(i);
    }

    public void setTextAppearance(int i) {
        this.A0E.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.A0E.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.A0E.setText(charSequence);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int A03 = C0f9.A03(-781201612);
        super.draw(canvas);
        Drawable drawable = this.A09;
        if (drawable != null) {
            if (this.A05) {
                this.A05 = false;
                Rect rect = this.A0D;
                Rect rect2 = this.A0C;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.A06) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.A00, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
        C0f9.A0A(-610563378, A03);
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A09;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A09;
        if (drawable != null && drawable.isStateful()) {
            this.A09.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A09;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A05 = z | this.A05;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(103646230);
        super.onSizeChanged(i, i2, i3, i4);
        this.A05 = true;
        C0f9.A0D(-1005867068, A06);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.A04 != z) {
            this.A04 = z;
            this.A0F.A0R(this.A0E, C3OO.FLAG_MOVED);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.A0E.setChecked(z);
    }

    public void setIconSize(int i) {
        this.A01 = i;
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.A0B = z;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.A09) {
            return false;
        }
        return true;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }
}
