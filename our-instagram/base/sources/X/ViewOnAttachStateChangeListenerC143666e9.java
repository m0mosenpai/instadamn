package X;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: X.6e9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC143666e9 implements C07X, View.OnAttachStateChangeListener {
    public AnonymousClass195 A00;
    public boolean A01;
    public C0eR A02 = new C0eR(this);
    public final InterfaceC56392iX A03;
    public final TextView A04;

    public static final void A00(C105814ps c105814ps, ViewOnAttachStateChangeListenerC143666e9 viewOnAttachStateChangeListenerC143666e9, boolean z) {
        TextView textView;
        int i;
        InterfaceC56392iX interfaceC56392iX = viewOnAttachStateChangeListenerC143666e9.A03;
        interfaceC56392iX.getView().setVisibility(4);
        boolean z2 = false;
        if (c105814ps.A00.A1f.ordinal() >= 6) {
            z2 = true;
        }
        if (z2 && z) {
            ((ProgressBar) interfaceC56392iX.getView()).setIndeterminate(true);
            textView = viewOnAttachStateChangeListenerC143666e9.A04;
            i = 2131969469;
        } else {
            ((ProgressBar) interfaceC56392iX.getView()).setIndeterminate(false);
            textView = viewOnAttachStateChangeListenerC143666e9.A04;
            i = 2131976314;
        }
        textView.setText(i);
        interfaceC56392iX.getView().setVisibility(0);
    }

    public final void A01() {
        AnonymousClass195 anonymousClass195 = this.A00;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        InterfaceC56392iX interfaceC56392iX = this.A03;
        if (interfaceC56392iX.CWW()) {
            ((ProgressBar) interfaceC56392iX.getView()).setProgress(0);
            interfaceC56392iX.getView().setVisibility(8);
        }
    }

    @Override // X.C07X
    public final C07T getLifecycle() {
        return this.A02;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A02.A0C(C07S.RESUMED);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.A02.A0C(C07S.CREATED);
    }

    public ViewOnAttachStateChangeListenerC143666e9(TextView textView, InterfaceC56392iX interfaceC56392iX) {
        this.A03 = interfaceC56392iX;
        this.A04 = textView;
    }
}
