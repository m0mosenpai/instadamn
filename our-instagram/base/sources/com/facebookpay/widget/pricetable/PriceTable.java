package com.facebookpay.widget.pricetable;

import X.AbstractC31171DnF;
import X.AbstractC55922hc;
import X.AbstractC70177WFc;
import X.AnonymousClass013;
import X.C0YR;
import X.C14360o3;
import X.C2FP;
import X.InterfaceC16530ry;
import X.X6H;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TableLayout;
import com.facebook.R;
import java.util.List;

/* loaded from: classes11.dex */
public final class PriceTable extends TableLayout {
    public static final /* synthetic */ C0YR[] A06 = {new AnonymousClass013(PriceTable.class, "priceTableRowDataList", "getPriceTableRowDataList()Ljava/util/List;", 0)};
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final InterfaceC16530ry A05;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PriceTable(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    public final List getPriceTableRowDataList() {
        return (List) this.A05.CES(this, A06[0]);
    }

    public final void setPriceTableRowDataList(List list) {
        AbstractC31171DnF.A1S(this, list, this.A05, A06, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceTable(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A01 = true;
        this.A05 = new X6H(this, 5);
        C2FP.A0A();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.FBPayUIPriceTable, AbstractC55922hc.A0h);
        this.A03 = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.A04 = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
        this.A02 = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        setPadding(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
        obtainStyledAttributes.recycle();
        setColumnShrinkable(1, true);
        setColumnStretchable(2, true);
        AbstractC70177WFc.A01(this, 2);
        setImportantForAccessibility(2);
    }
}
