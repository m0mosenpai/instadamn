package X;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.WrT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71299WrT implements Runnable {
    public final /* synthetic */ TextInputLayout A00;

    public RunnableC71299WrT(TextInputLayout textInputLayout) {
        this.A00 = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CheckableImageButton checkableImageButton = this.A00.A1D;
        checkableImageButton.performClick();
        checkableImageButton.jumpDrawablesToCurrentState();
    }
}
