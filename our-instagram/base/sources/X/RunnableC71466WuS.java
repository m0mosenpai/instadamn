package X;

import android.widget.AutoCompleteTextView;

/* renamed from: X.WuS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71466WuS implements Runnable {
    public final /* synthetic */ AutoCompleteTextView A00;
    public final /* synthetic */ C67753UxS A01;

    public RunnableC71466WuS(AutoCompleteTextView autoCompleteTextView, C67753UxS c67753UxS) {
        this.A01 = c67753UxS;
        this.A00 = autoCompleteTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isPopupShowing = this.A00.isPopupShowing();
        C67777Uxt c67777Uxt = this.A01.A00;
        C67777Uxt.A02(c67777Uxt, isPopupShowing);
        c67777Uxt.A06 = isPopupShowing;
    }
}
