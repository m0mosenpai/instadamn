package X;

import android.content.Context;
import android.widget.AdapterView;
import java.util.List;

/* loaded from: classes11.dex */
public final class UDc extends UCx {
    public X7N A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public List A04;
    public List A05;
    public int A06;
    public final AdapterView.OnItemSelectedListener A07;
    public final Runnable A08;

    public UDc(Context context, int i) {
        super(context, null, i);
        this.A07 = new C70259WOe(this, 3);
        this.A08 = new RunnableC71241WqW(this);
        this.A06 = i;
    }

    public int getMode() {
        return this.A06;
    }

    public X7N getOnSelectListener() {
        return this.A00;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getOnItemSelectedListener() == null) {
            setOnItemSelectedListener(this.A07);
        }
    }

    @Override // android.widget.AbsSpinner, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        post(this.A08);
    }

    public void setImmediateSelection(int i) {
        if (i != getSelectedItemPosition()) {
            setOnItemSelectedListener(null);
            setSelection(i, false);
            setOnItemSelectedListener(this.A07);
        }
    }

    public void setOnSelectListener(X7N x7n) {
        this.A00 = x7n;
    }

    public void setStagedBackgroundColor(Integer num) {
        this.A01 = num;
    }

    public void setStagedItems(List list) {
        this.A05 = list;
    }

    public void setStagedPrimaryTextColor(Integer num) {
        this.A02 = num;
    }

    public void setStagedSelection(int i) {
        this.A03 = Integer.valueOf(i);
    }
}
