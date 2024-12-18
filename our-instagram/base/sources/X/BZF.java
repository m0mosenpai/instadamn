package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.PopupWindow;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes5.dex */
public final class BZF extends PopupWindow {
    public int A00;
    public View A01;
    public InterfaceC16820sZ A02;
    public InterfaceC16820sZ A03;
    public InterfaceC16820sZ A04;
    public final View.OnLayoutChangeListener A05;

    public BZF(Context context) {
        super(context);
        this.A05 = new ViewOnLayoutChangeListenerC28670ClI(this, 0);
        setContentView(new C131555wr(context));
        setInputMethodMode(2);
        setBackgroundDrawable(AbstractC25225BEi.A0G(0));
        setAnimationStyle(0);
        setFocusable(true);
        setOutsideTouchable(true);
    }

    public final void A01(View view, int i, int i2) {
        if (!isShowing()) {
            this.A01 = view;
            this.A00 = view.getResources().getConfiguration().orientation;
            View view2 = this.A01;
            if (view2 != null) {
                View rootView = view2.getRootView();
                View.OnLayoutChangeListener onLayoutChangeListener = this.A05;
                rootView.removeOnLayoutChangeListener(onLayoutChangeListener);
                view2.getRootView().addOnLayoutChangeListener(onLayoutChangeListener);
                super.showAtLocation(view, 0, i, i2);
                return;
            }
            throw AbstractC25227BEk.A0n();
        }
    }

    @Override // android.widget.PopupWindow
    @Deprecated(level = AbstractC68219VIb.ERROR, message = "Use show() instead", replaceWith = @ReplaceWith(expression = "show()", imports = {}))
    public final void showAsDropDown(View view) {
    }

    @Override // android.widget.PopupWindow
    @Deprecated(level = AbstractC68219VIb.ERROR, message = "Use show() instead", replaceWith = @ReplaceWith(expression = "show()", imports = {}))
    public final void showAsDropDown(View view, int i, int i2) {
    }

    @Override // android.widget.PopupWindow
    @Deprecated(level = AbstractC68219VIb.ERROR, message = "Use show() instead", replaceWith = @ReplaceWith(expression = "show()", imports = {}))
    public final void showAsDropDown(View view, int i, int i2, int i3) {
    }

    @Override // android.widget.PopupWindow
    @Deprecated(level = AbstractC68219VIb.ERROR, message = "Use show() instead", replaceWith = @ReplaceWith(expression = "show()", imports = {}))
    public final void showAtLocation(View view, int i, int i2, int i3) {
    }

    public final void A00() {
        if (isShowing()) {
            super.dismiss();
            View view = this.A01;
            if (view != null) {
                view.getRootView().removeOnLayoutChangeListener(this.A05);
                this.A01 = null;
                this.A00 = 0;
                View contentView = getContentView();
                C14360o3.A0C(contentView, AbstractC111324zv.A00(480));
                ((C131565ws) contentView).setRenderTree(null);
                this.A04 = null;
                this.A02 = null;
                this.A03 = null;
                return;
            }
            throw AbstractC25227BEk.A0n();
        }
    }

    @Override // android.widget.PopupWindow
    @Deprecated(level = AbstractC68219VIb.ERROR, message = "Use hide() instead", replaceWith = @ReplaceWith(expression = "hide()", imports = {}))
    public final void dismiss() {
        InterfaceC16820sZ interfaceC16820sZ;
        if (getContentView().getKeyDispatcherState().isTracking(new KeyEvent(0, 4))) {
            interfaceC16820sZ = this.A02;
        } else {
            interfaceC16820sZ = this.A04;
        }
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
    }
}
