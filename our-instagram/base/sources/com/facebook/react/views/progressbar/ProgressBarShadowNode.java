package com.facebook.react.views.progressbar;

import X.AbstractC05810Sj;
import X.AbstractC166987dD;
import X.AbstractC78533fL;
import X.AbstractC78733ff;
import X.C63055Sbc;
import X.EnumC78643fW;
import X.InterfaceC50872Vi;
import X.R3N;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Set;

/* loaded from: classes10.dex */
public final class ProgressBarShadowNode extends LayoutShadowNode implements InterfaceC50872Vi {
    public String A00;
    public final SparseIntArray A01 = new SparseIntArray();
    public final SparseIntArray A02 = new SparseIntArray();
    public final Set A03 = AbstractC166987dD.A1H();

    @Override // X.InterfaceC50872Vi
    public final long CpA(EnumC78643fW enumC78643fW, EnumC78643fW enumC78643fW2, AbstractC78533fL abstractC78533fL, float f, float f2) {
        int A00 = C63055Sbc.A00(this.A00);
        Set set = this.A03;
        Integer valueOf = Integer.valueOf(A00);
        if (!set.contains(valueOf)) {
            R3N r3n = this.A0A;
            AbstractC05810Sj.A00(r3n);
            ProgressBar A01 = C63055Sbc.A01(r3n, A00);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            A01.measure(makeMeasureSpec, makeMeasureSpec);
            this.A01.put(A00, A01.getMeasuredHeight());
            this.A02.put(A00, A01.getMeasuredWidth());
            set.add(valueOf);
        }
        return AbstractC78733ff.A00(this.A02.get(A00), this.A01.get(A00));
    }

    @ReactProp(name = ReactProgressBarViewManager.PROP_STYLE)
    public final void setStyle(String str) {
        if (str == null) {
            str = ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        this.A00 = str;
    }

    public ProgressBarShadowNode() {
        A09(this);
        this.A00 = ReactProgressBarViewManager.DEFAULT_STYLE;
    }
}
