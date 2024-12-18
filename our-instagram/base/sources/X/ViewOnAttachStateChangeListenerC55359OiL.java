package X;

import android.view.View;
import android.view.ViewParent;
import com.facebook.rtc.views.omnigridview.OmniGridView;

/* renamed from: X.OiL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnAttachStateChangeListenerC55359OiL implements View.OnAttachStateChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public ViewOnAttachStateChangeListenerC55359OiL(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.A00 == 0) {
            C14360o3.A0B(view, 0);
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                parent = null;
            }
            ((C14510oO) this.A01).A00 = C14360o3.A0K(parent, ((C55644OnV) this.A03).A00);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.A00) {
            case 0:
                if (((C14510oO) this.A01).A00) {
                    return;
                }
                AbstractC1127657i abstractC1127657i = (AbstractC1127657i) this.A02;
                if (AbstractC105064oM.A02(abstractC1127657i)) {
                    return;
                }
                abstractC1127657i.A05();
                return;
            case 1:
                ((JPT) this.A01).DLY((C38321qM) this.A03);
                ((View) this.A02).removeOnAttachStateChangeListener(this);
                return;
            default:
                ((View) this.A01).removeOnAttachStateChangeListener(this);
                OmniGridView omniGridView = (OmniGridView) this.A02;
                omniGridView.A0H.A0M.remove(((PCK) this.A03).A05);
                return;
        }
    }
}
