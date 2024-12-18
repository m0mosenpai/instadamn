package com.facebookpay.form.view;

import X.AbstractC166997dE;
import X.C0f9;
import X.C14360o3;
import X.C2FP;
import X.C70302WQh;
import X.InterfaceC16820sZ;
import X.JQ0;
import X.UFM;
import X.W6b;
import X.X9g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import com.facebook.R;
import com.facebookpay.form.cell.apm.APMLinkCellParams;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public class FormLayout extends TableLayout implements X9g {
    public float A00;
    public UFM A01;
    public InterfaceC16820sZ A02;
    public int A03;
    public final C70302WQh A04;

    public FormLayout(Context context) {
        this(context, null);
    }

    public final void A00(UFM ufm) {
        C14360o3.A0B(ufm, 0);
        this.A01 = ufm;
        ufm.A04.A09(this.A04);
    }

    @Override // X.X9g
    public final void AAm(View view, APMLinkCellParams aPMLinkCellParams) {
        int i;
        C14360o3.A0B(view, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.TableRow.LayoutParams");
        float f = ((LinearLayout.LayoutParams) layoutParams).weight;
        Context A0L = AbstractC166997dE.A0L(this);
        int A00 = (int) W6b.A00(A0L, R.attr.fbpay_cell_horizontal_margin);
        float f2 = this.A00;
        boolean z = true;
        if (f2 != 0.0f && f2 + f <= 1.0f) {
            z = false;
        }
        if (z) {
            this.A00 = 0.0f;
            View tableRow = new TableRow(A0L);
            TableLayout.LayoutParams layoutParams2 = new TableLayout.LayoutParams(-1, -2);
            if (aPMLinkCellParams == null) {
                i = getChildCount() > 0 ? this.A03 : 0;
                addView(tableRow, layoutParams2);
            }
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i;
            addView(tableRow, layoutParams2);
        } else {
            View childAt = getChildAt(getChildCount() - 1);
            C14360o3.A0C(childAt, "null cannot be cast to non-null type android.widget.TableRow");
            ViewGroup viewGroup = (ViewGroup) childAt;
            ViewGroup.LayoutParams layoutParams3 = viewGroup.getChildAt(viewGroup.getChildCount() - 1).getLayoutParams();
            C14360o3.A0C(layoutParams3, "null cannot be cast to non-null type android.widget.TableRow.LayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = A00;
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            C14360o3.A0C(layoutParams4, "null cannot be cast to non-null type android.widget.TableRow.LayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = A00;
        }
        this.A00 += f;
        View childAt2 = getChildAt(getChildCount() - 1);
        C14360o3.A0C(childAt2, "null cannot be cast to non-null type android.widget.TableRow");
        ((ViewGroup) childAt2).addView(view);
    }

    @Override // android.widget.TableLayout, android.view.ViewGroup
    public final void addView(View view) {
        C14360o3.A0B(view, 0);
        AAm(view, null);
    }

    public final void setOnRebuild(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        this.A02 = interfaceC16820sZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = C0f9.A06(1312790527);
        super.onAttachedToWindow();
        UFM ufm = this.A01;
        if (ufm != null) {
            ufm.A04.A09(this.A04);
        }
        C0f9.A0D(-944951535, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = C0f9.A06(519839021);
        super.onDetachedFromWindow();
        UFM ufm = this.A01;
        if (ufm != null) {
            ufm.A04.A08(this.A04);
        }
        C0f9.A0D(-1439790898, A06);
    }

    public final void setRowSpacing(int i) {
        this.A03 = getResources().getDimensionPixelOffset(i);
    }

    public /* synthetic */ FormLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormLayout(Context context, AttributeSet attributeSet) {
        super(new ContextThemeWrapper(context, R.style.Ig4aFbPay), attributeSet);
        C2FP.A0E();
        this.A04 = new C70302WQh(this, 53);
    }
}
