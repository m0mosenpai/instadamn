package com.instagram.ui.widget.radiogroup;

import X.C0f9;
import X.C71077WnZ;
import X.InterfaceC57999Pnj;
import X.InterfaceC72038XGg;
import X.UCF;
import X.WOA;
import X.XBO;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;

/* loaded from: classes11.dex */
public class IgRadioGroup extends LinearLayout {
    public int A00;
    public InterfaceC57999Pnj A01;
    public XBO A02;
    public WOA A03;
    public boolean A04;

    public final void A02(int i) {
        if (i != -1 && i == this.A00) {
            return;
        }
        int i2 = this.A00;
        if (i2 != -1) {
            A01(this, i2, false);
        }
        if (i != -1) {
            A01(this, i, true);
        }
        setCheckedId(i);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.A00 = i;
        XBO xbo = this.A02;
        if (xbo != null) {
            xbo.D2u(this, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if ((view instanceof InterfaceC72038XGg) && ((Checkable) view).isChecked()) {
            this.A04 = true;
            int i2 = this.A00;
            if (i2 != -1) {
                A01(this, i2, false);
            }
            this.A04 = false;
            setCheckedId(view.getId());
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return IgRadioGroup.class.getName();
    }

    public int getCheckedRadioButtonId() {
        return this.A00;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A03.A00 = onHierarchyChangeListener;
    }

    public IgRadioGroup(Context context) {
        super(context);
        this.A00 = -1;
        this.A04 = false;
        this.A01 = new C71077WnZ(this);
        WOA woa = new WOA(this);
        this.A03 = woa;
        super.setOnHierarchyChangeListener(woa);
    }

    public static void A01(IgRadioGroup igRadioGroup, int i, boolean z) {
        KeyEvent.Callback findViewById = igRadioGroup.findViewById(i);
        if (findViewById != null && (findViewById instanceof InterfaceC72038XGg)) {
            ((Checkable) findViewById).setChecked(z);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof UCF;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        int A06 = C0f9.A06(-1207466535);
        super.onFinishInflate();
        int i = this.A00;
        if (i != -1) {
            this.A04 = true;
            A01(this, i, true);
            this.A04 = false;
            setCheckedId(this.A00);
        }
        C0f9.A0D(687041123, A06);
    }

    public void setOnCheckedChangeListener(XBO xbo) {
        this.A02 = xbo;
    }

    public IgRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = -1;
        this.A04 = false;
        this.A01 = new C71077WnZ(this);
        WOA woa = new WOA(this);
        this.A03 = woa;
        super.setOnHierarchyChangeListener(woa);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}
