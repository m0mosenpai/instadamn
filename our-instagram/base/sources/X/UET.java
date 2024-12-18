package X;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes11.dex */
public final class UET extends AbstractC17900uT {
    public final int A00;
    public final Object A01;

    public UET(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C04F
    public final void CwY(View view) {
        View view2;
        View view3;
        switch (this.A00) {
            case 0:
                LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = ((RunnableC71204Wpv) this.A01).A00;
                layoutInflaterFactory2C52042a4.A0M.setAlpha(1.0f);
                layoutInflaterFactory2C52042a4.A0O.A07(null);
                layoutInflaterFactory2C52042a4.A0O = null;
                return;
            case 1:
                LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a42 = ((WPJ) this.A01).A01;
                layoutInflaterFactory2C52042a42.A0M.setVisibility(8);
                PopupWindow popupWindow = layoutInflaterFactory2C52042a42.A0B;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C52042a42.A0M.getParent() instanceof View) {
                    ((View) layoutInflaterFactory2C52042a42.A0M.getParent()).requestApplyInsets();
                }
                layoutInflaterFactory2C52042a42.A0M.A04();
                layoutInflaterFactory2C52042a42.A0O.A07(null);
                layoutInflaterFactory2C52042a42.A0O = null;
                view2 = layoutInflaterFactory2C52042a42.A09;
                break;
            case 2:
                UD8 ud8 = (UD8) this.A01;
                if (ud8.A0D && (view3 = ud8.A03) != null) {
                    view3.setTranslationY(0.0f);
                    ud8.A08.setTranslationY(0.0f);
                }
                ud8.A08.setVisibility(8);
                ud8.A08.setTransitioning(false);
                ud8.A07 = null;
                XDW xdw = ud8.A05;
                if (xdw != null) {
                    xdw.D9v(ud8.A06);
                    ud8.A06 = null;
                    ud8.A05 = null;
                }
                view2 = ud8.A0A;
                if (view2 == null) {
                    return;
                }
                break;
            default:
                UD8 ud82 = (UD8) this.A01;
                ud82.A07 = null;
                ud82.A08.requestLayout();
                return;
        }
        view2.requestApplyInsets();
    }

    @Override // X.AbstractC17900uT, X.C04F
    public final void Cwg(View view) {
        if (this.A00 != 0) {
            super.Cwg(view);
        } else {
            ((RunnableC71204Wpv) this.A01).A00.A0M.setVisibility(0);
        }
    }
}
