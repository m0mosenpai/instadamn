package X;

import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.WrU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71300WrU implements Runnable {
    public final /* synthetic */ TextInputLayout A00;

    public RunnableC71300WrU(TextInputLayout textInputLayout) {
        this.A00 = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A0F.requestLayout();
    }
}
