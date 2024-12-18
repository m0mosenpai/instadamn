package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class WPT implements XEV {
    public WQH A00;
    public WQJ A01;
    public final /* synthetic */ Toolbar A02;

    @Override // X.XEV
    public final boolean AVx() {
        return false;
    }

    @Override // X.XEV
    public final void D5e(WQH wqh, boolean z) {
    }

    @Override // X.XEV
    public final boolean DpV(UDI udi) {
        return false;
    }

    @Override // X.XEV
    public final void EQl(InterfaceC71933XBi interfaceC71933XBi) {
        throw C00O.createAndThrow();
    }

    public WPT(Toolbar toolbar) {
        this.A02 = toolbar;
    }

    @Override // X.XEV
    public final boolean AIM(WQH wqh, WQJ wqj) {
        Toolbar toolbar = this.A02;
        KeyEvent.Callback callback = toolbar.A08;
        if (callback instanceof InterfaceC71932XBh) {
            ((InterfaceC71932XBh) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.A08);
        toolbar.removeView(toolbar.A09);
        toolbar.A08 = null;
        ArrayList arrayList = toolbar.A0g;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar.addView((View) arrayList.get(size));
            } else {
                arrayList.clear();
                this.A01 = null;
                toolbar.requestLayout();
                wqj.A0F = false;
                wqj.A0A.A0D(false);
                toolbar.A0G();
                return true;
            }
        }
    }

    @Override // X.XEV
    public final boolean ATp(WQH wqh, WQJ wqj) {
        Toolbar toolbar = this.A02;
        toolbar.A0E();
        ViewParent parent = toolbar.A09.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.A09);
            }
            toolbar.addView(toolbar.A09);
        }
        View actionView = wqj.getActionView();
        toolbar.A08 = actionView;
        this.A01 = wqj;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.A08);
            }
            UD6 ud6 = new UD6();
            ((AbstractC66342UAh) ud6).A00 = 8388611 | (toolbar.A00 & 112);
            ud6.A00 = 2;
            toolbar.A08.setLayoutParams(ud6);
            toolbar.addView(toolbar.A08);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (((UD6) childAt.getLayoutParams()).A00 != 2 && childAt != toolbar.A0E) {
                toolbar.removeViewAt(childCount);
                toolbar.A0g.add(childAt);
            }
        }
        toolbar.requestLayout();
        wqj.A0F = true;
        WQJ.A00(wqj);
        KeyEvent.Callback callback = toolbar.A08;
        if (callback instanceof InterfaceC71932XBh) {
            ((InterfaceC71932XBh) callback).onActionViewExpanded();
        }
        toolbar.A0G();
        return true;
    }

    @Override // X.XEV
    public final void CNw(Context context, WQH wqh) {
        WQJ wqj;
        WQH wqh2 = this.A00;
        if (wqh2 != null && (wqj = this.A01) != null) {
            wqh2.A0J(wqj);
        }
        this.A00 = wqh;
    }

    @Override // X.XEV
    public final void FBO(boolean z) {
        WQJ wqj = this.A01;
        if (wqj != null) {
            WQH wqh = this.A00;
            if (wqh != null) {
                int size = wqh.size();
                for (int i = 0; i < size; i++) {
                    if (wqh.getItem(i) == wqj) {
                        return;
                    }
                }
            }
            AIM(wqh, wqj);
        }
    }
}
