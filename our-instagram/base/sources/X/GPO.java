package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class GPO implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC35716Fpq A01;
    public final /* synthetic */ C32328ELw A02;

    public GPO(View view, ViewTreeObserverOnGlobalLayoutListenerC35716Fpq viewTreeObserverOnGlobalLayoutListenerC35716Fpq, C32328ELw c32328ELw) {
        this.A02 = c32328ELw;
        this.A00 = view;
        this.A01 = viewTreeObserverOnGlobalLayoutListenerC35716Fpq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C32328ELw c32328ELw = this.A02;
        String str = c32328ELw.A04;
        if (str == null) {
            AbstractC31171DnF.A0x();
            throw C00O.createAndThrow();
        }
        if (str.equals("hidden_reaction_nux") && c32328ELw.A01 != null) {
            C32328ELw.A00(c32328ELw);
            this.A00.getViewTreeObserver().removeOnGlobalLayoutListener(this.A01);
        }
    }
}
