package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: X.UDk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66367UDk extends C66360UCh {
    public InterfaceC71937XBm A00;
    public MenuItem A01;
    public final int A02;
    public final int A03;

    @Override // X.C66360UCh, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        int pointToPosition;
        int i2;
        if (this.A00 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                adapter = headerViewListAdapter.getWrappedAdapter();
            } else {
                i = 0;
            }
            UBC ubc = (UBC) adapter;
            WQJ wqj = null;
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < ubc.getCount()) {
                wqj = ubc.getItem(i2);
            }
            MenuItem menuItem = this.A01;
            if (menuItem != wqj) {
                WQH wqh = ubc.A00;
                if (menuItem != null) {
                    this.A00.DNV(menuItem, wqh);
                }
                this.A01 = wqj;
                if (wqj != null) {
                    this.A00.DNU(wqj, wqh);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public C66367UDk(Context context, boolean z) {
        super(context, z);
        if (1 == AbstractC58319PtB.A08(context).getLayoutDirection()) {
            this.A02 = 21;
            this.A03 = 22;
        } else {
            this.A02 = 22;
            this.A03 = 21;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null) {
            if (i == this.A02) {
                if (listMenuItemView.isEnabled() && listMenuItemView.A05.hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (i == this.A03) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((UBC) adapter).A00.A0C(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.C66360UCh, android.widget.AbsListView, android.view.View
    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(-1450740429);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        C0f9.A0C(-1276008651, A05);
        return onTouchEvent;
    }

    public void setHoverListener(InterfaceC71937XBm interfaceC71937XBm) {
        this.A00 = interfaceC71937XBm;
    }

    @Override // X.C66360UCh, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
