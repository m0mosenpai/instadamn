package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes2.dex */
public class AutoMeasureLinearLayoutManager extends LinearLayoutManager {
    public boolean A00;

    @Override // X.AbstractC70663Fe
    public final void A12(boolean z) {
        this.A00 = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final boolean A14() {
        return this.A00;
    }

    public AutoMeasureLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A00 = true;
    }
}
