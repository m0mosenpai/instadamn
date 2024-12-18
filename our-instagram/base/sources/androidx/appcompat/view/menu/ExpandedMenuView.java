package androidx.appcompat.view.menu;

import X.C0f9;
import X.C53122bu;
import X.InterfaceC71869X8c;
import X.InterfaceC71870X8d;
import X.WQH;
import X.WQJ;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* loaded from: classes11.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, InterfaceC71869X8c, InterfaceC71870X8d {
    public static final int[] A01 = {R.attr.background, R.attr.divider};
    public WQH A00;

    @Override // X.InterfaceC71869X8c
    public final boolean CP9(WQJ wqj) {
        return this.A00.A0I(wqj, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C53122bu A00 = C53122bu.A00(context, attributeSet, A01, i, 0);
        TypedArray typedArray = A00.A02;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(A00.A02(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(A00.A02(1));
        }
        typedArray.recycle();
    }

    @Override // X.InterfaceC71870X8d
    public final void COE(WQH wqh) {
        this.A00 = wqh;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1976257305);
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
        C0f9.A0D(-1898944034, A06);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CP9((WQJ) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
