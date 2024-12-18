package X;

import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

/* renamed from: X.GMq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36869GMq implements Runnable {
    public final /* synthetic */ EditPhoneNumberView A00;

    public RunnableC36869GMq(EditPhoneNumberView editPhoneNumberView) {
        this.A00 = editPhoneNumberView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditPhoneNumberView editPhoneNumberView = this.A00;
        if (editPhoneNumberView.A01.requestFocus()) {
            AbstractC13880nE.A0R(editPhoneNumberView.A01);
        }
    }
}
