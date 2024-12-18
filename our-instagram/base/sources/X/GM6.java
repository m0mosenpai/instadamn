package X;

import android.widget.EditText;

/* loaded from: classes6.dex */
public final class GM6 implements Runnable {
    public final /* synthetic */ FQF A00;

    public GM6(FQF fqf) {
        this.A00 = fqf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FQF fqf = this.A00;
        EditText editText = fqf.A01;
        editText.setOnTouchListener(null);
        editText.removeTextChangedListener(fqf.A00);
    }
}
