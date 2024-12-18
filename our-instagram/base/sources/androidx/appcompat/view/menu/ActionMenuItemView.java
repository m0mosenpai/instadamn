package androidx.appcompat.view.menu;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC63123SdR;
import X.C0f9;
import X.C3WF;
import X.C66368UDl;
import X.InterfaceC71869X8c;
import X.InterfaceC71934XBj;
import X.InterfaceC71935XBk;
import X.VIK;
import X.WO8;
import X.WQH;
import X.WQJ;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/* loaded from: classes11.dex */
public class ActionMenuItemView extends C3WF implements View.OnClickListener, InterfaceC71934XBj, InterfaceC71935XBk {
    public VIK A00;
    public InterfaceC71869X8c A01;
    public WQJ A02;
    public int A03;
    public int A04;
    public int A05;
    public Drawable A06;
    public WO8 A07;
    public CharSequence A08;
    public boolean A09;
    public boolean A0A;

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    private void A00() {
        CharSequence charSequence;
        CharSequence title;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.A08);
        if (this.A06 != null && ((this.A02.A05 & 4) != 4 || (!this.A09 && !this.A0A))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        if (z3) {
            charSequence = this.A08;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.A02.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                title = null;
            } else {
                title = this.A02.getTitle();
            }
            setContentDescription(title);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.A02.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.A02.getTitle();
            }
            setTooltipText(charSequence2);
            return;
        }
        setTooltipText(tooltipText);
    }

    @Override // X.InterfaceC71934XBj
    public final void COF(WQJ wqj, int i) {
        this.A02 = wqj;
        setIcon(wqj.getIcon());
        setTitle(wqj.getTitleCondensed());
        setId(wqj.getItemId());
        setVisibility(AbstractC167007dF.A05(wqj.isVisible() ? 1 : 0));
        setEnabled(wqj.isEnabled());
        if (wqj.hasSubMenu() && this.A07 == null) {
            this.A07 = new C66368UDl(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // X.InterfaceC71934XBj
    public WQJ getItemData() {
        return this.A02;
    }

    public void setExpandedFormat(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            WQJ wqj = this.A02;
            if (wqj != null) {
                WQH wqh = wqj.A0A;
                wqh.A0A = true;
                wqh.A0D(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.A06 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.A03;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        A00();
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.A05 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setTitle(CharSequence charSequence) {
        this.A08 = charSequence;
        A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r2.orientation == 2) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ActionMenuItemView(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            r4.<init>(r5, r6, r7)
            android.content.res.Resources r3 = r5.getResources()
            android.content.res.Resources r0 = X.AbstractC25228BEl.A0M(r4)
            android.content.res.Configuration r2 = r0.getConfiguration()
            int r1 = r2.screenWidthDp
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 >= r0) goto L1b
            int r2 = r2.orientation
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L1c
        L1b:
            r0 = 1
        L1c:
            r4.A09 = r0
            int[] r0 = X.AbstractC53402cO.A02
            r2 = 0
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r0, r7, r2)
            int r0 = r1.getDimensionPixelSize(r2, r2)
            r4.A04 = r0
            r1.recycle()
            android.util.DisplayMetrics r0 = r3.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1107296256(0x42000000, float:32.0)
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            r4.A03 = r0
            r4.setOnClickListener(r4)
            r0 = -1
            r4.A05 = r0
            r4.setSaveEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // X.InterfaceC71935XBk
    public final boolean CsB() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // X.InterfaceC71935XBk
    public final boolean CsC() {
        if ((!TextUtils.isEmpty(getText())) && this.A02.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1268696158);
        InterfaceC71869X8c interfaceC71869X8c = this.A01;
        if (interfaceC71869X8c != null) {
            interfaceC71869X8c.CP9(this.A02);
        }
        C0f9.A0C(-1262562698, A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r2.orientation == 2) goto L6;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onConfigurationChanged(android.content.res.Configuration r4) {
        /*
            r3 = this;
            super.onConfigurationChanged(r4)
            android.content.res.Resources r0 = X.AbstractC25228BEl.A0M(r3)
            android.content.res.Configuration r2 = r0.getConfiguration()
            int r1 = r2.screenWidthDp
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 >= r0) goto L17
            int r2 = r2.orientation
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L18
        L17:
            r0 = 1
        L18:
            r3.A09 = r0
            r3.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.onConfigurationChanged(android.content.res.Configuration):void");
    }

    @Override // X.C3WF, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int A06 = C0f9.A06(1845867706);
        boolean z = !TextUtils.isEmpty(getText());
        if (z && (i5 = this.A05) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i4 = this.A04;
            i3 = Math.min(size, i4);
        } else {
            i3 = this.A04;
            i4 = i3;
        }
        if (mode != 1073741824 && i4 > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), i2);
        }
        if (!z && this.A06 != null) {
            super.setPadding((getMeasuredWidth() - AbstractC166997dE.A0H(this.A06)) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        C0f9.A0D(1295482007, A06);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        WO8 wo8;
        int A05 = C0f9.A05(1971064676);
        if (this.A02.hasSubMenu() && (wo8 = this.A07) != null && wo8.onTouch(this, motionEvent)) {
            onTouchEvent = true;
            i = -1481508837;
        } else {
            onTouchEvent = super.onTouchEvent(motionEvent);
            i = -543317402;
        }
        C0f9.A0C(i, A05);
        return onTouchEvent;
    }

    public void setItemInvoker(InterfaceC71869X8c interfaceC71869X8c) {
        this.A01 = interfaceC71869X8c;
    }

    public void setPopupCallback(VIK vik) {
        this.A00 = vik;
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
