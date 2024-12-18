package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* loaded from: classes11.dex */
public abstract class WPX implements XDX, XEV, AdapterView.OnItemClickListener {
    public Rect A00;

    public static int A01(Context context, ListAdapter listAdapter, int i) {
        FrameLayout frameLayout = null;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    @Override // X.XEV
    public final boolean AIM(WQH wqh, WQJ wqj) {
        return false;
    }

    @Override // X.XEV
    public final boolean ATp(WQH wqh, WQJ wqj) {
        return false;
    }

    @Override // X.XEV
    public final void CNw(Context context, WQH wqh) {
    }

    public final void A02(boolean z) {
        if (this instanceof UDK) {
            ((UDK) this).A0E.A01 = z;
        } else {
            ((UDJ) this).A09 = z;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        ListAdapter listAdapter2 = listAdapter;
        if (listAdapter instanceof HeaderViewListAdapter) {
            listAdapter2 = ((HeaderViewListAdapter) listAdapter2).getWrappedAdapter();
        }
        WQH wqh = ((UBC) listAdapter2).A00;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (this instanceof UDJ) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        wqh.A0I(menuItem, this, i2);
    }
}
