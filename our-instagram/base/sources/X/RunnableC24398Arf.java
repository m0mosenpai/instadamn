package X;

import android.widget.TextView;

/* renamed from: X.Arf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24398Arf implements Runnable {
    public final /* synthetic */ ViewOnFocusChangeListenerC23261ASw A00;

    public RunnableC24398Arf(ViewOnFocusChangeListenerC23261ASw viewOnFocusChangeListenerC23261ASw) {
        this.A00 = viewOnFocusChangeListenerC23261ASw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnFocusChangeListenerC23261ASw viewOnFocusChangeListenerC23261ASw = this.A00;
        if (viewOnFocusChangeListenerC23261ASw.A0A != null) {
            int A01 = C1H4.A01(r0.getLineHeight() / AbstractC167007dF.A0K(viewOnFocusChangeListenerC23261ASw.A0N).density);
            TextView textView = viewOnFocusChangeListenerC23261ASw.A0A;
            if (textView != null) {
                viewOnFocusChangeListenerC23261ASw.A01 = textView.getLineCount() * A01;
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
