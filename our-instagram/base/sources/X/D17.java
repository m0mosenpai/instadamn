package X;

import android.widget.EditText;

/* loaded from: classes5.dex */
public final class D17 implements Runnable {
    public final /* synthetic */ C26757Bre A00;

    public D17(C26757Bre c26757Bre) {
        this.A00 = c26757Bre;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C26757Bre c26757Bre = this.A00;
        EditText editText = c26757Bre.A00;
        if (editText != null) {
            editText.requestFocus();
            EditText editText2 = c26757Bre.A00;
            if (editText2 != null) {
                AbstractC13880nE.A0R(editText2);
                return;
            }
        }
        C14360o3.A0F("titleEditText");
        throw C00O.createAndThrow();
    }
}
