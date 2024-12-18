package X;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: X.0lw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13100lw implements TextWatcher {
    public int A00;
    public int A01;
    public long A02;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C14360o3.A0B(charSequence, 0);
        if (this.A02 == 0 && charSequence.length() != 0) {
            this.A02 = SystemClock.elapsedRealtime();
        }
        boolean z = false;
        if (charSequence.length() < this.A01) {
            z = true;
        }
        this.A01 = charSequence.length();
        if (z) {
            this.A00++;
        }
    }

    public final long A00() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A02;
        this.A02 = 0L;
        return elapsedRealtime;
    }
}
