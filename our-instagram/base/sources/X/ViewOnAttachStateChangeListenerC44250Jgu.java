package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.instagram.direct.visual.DirectVisualMessageViewerController;

/* renamed from: X.Jgu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnAttachStateChangeListenerC44250Jgu implements View.OnAttachStateChangeListener {
    public final int A00;
    public final Object A01;

    public ViewOnAttachStateChangeListenerC44250Jgu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.A00) {
            case 2:
                MRJ mrj = ((DirectVisualMessageViewerController) this.A01).A0D;
                if (mrj == null) {
                    return;
                }
                mrj.E0X();
                return;
            case 3:
                AbstractC115715Lh.A00().A01((C75113Zb) this.A01, 3000L);
                return;
            case 4:
                P6K p6k = (P6K) this.A01;
                C47Z c47z = p6k.A02;
                if (c47z == null) {
                    return;
                }
                c47z.A0W(p6k);
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(view, 0);
                view.removeOnAttachStateChangeListener(this);
                ((AnonymousClass195) this.A01).AGH(null);
                return;
            case 1:
                MRJ mrj = ((L5T) this.A01).A00;
                if (mrj == null) {
                    return;
                }
                mrj.DfP();
                return;
            case 2:
                return;
            case 3:
                C115725Li A00 = AbstractC115715Lh.A00();
                C75113Zb c75113Zb = (C75113Zb) this.A01;
                A00.A00(c75113Zb);
                c75113Zb.A0m(false, false);
                return;
            case 4:
                P6K p6k = (P6K) this.A01;
                C47Z c47z = p6k.A02;
                if (c47z == null) {
                    return;
                }
                c47z.A0X(p6k);
                return;
            default:
                C14360o3.A0B(view, 0);
                view.removeOnAttachStateChangeListener(this);
                if (view.getViewTreeObserver().isAlive()) {
                    view.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) this.A01);
                    return;
                }
                return;
        }
    }
}
