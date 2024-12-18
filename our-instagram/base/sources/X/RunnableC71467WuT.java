package X;

import android.widget.AutoCompleteTextView;

/* renamed from: X.WuT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71467WuT implements Runnable {
    public final /* synthetic */ AutoCompleteTextView A00;
    public final /* synthetic */ C70544Wca A01;

    public RunnableC71467WuT(AutoCompleteTextView autoCompleteTextView, C70544Wca c70544Wca) {
        this.A01 = c70544Wca;
        this.A00 = autoCompleteTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.removeTextChangedListener(this.A01.A00.A08);
    }
}
