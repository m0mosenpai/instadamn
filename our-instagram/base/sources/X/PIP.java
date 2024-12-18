package X;

import android.view.View;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

/* loaded from: classes9.dex */
public final class PIP implements InterfaceC59892oW {
    public final int A00;
    public final Object A01;

    public PIP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC59892oW
    public final void Dnp(int i, int i2) {
        if (this.A00 != 0) {
            View view = (View) this.A01;
            AbstractC13880nE.A0f(view, i);
            AbstractC13880nE.A0U(view, i2);
        } else {
            DirectPrivateStoryRecipientController directPrivateStoryRecipientController = (DirectPrivateStoryRecipientController) this.A01;
            if (directPrivateStoryRecipientController.A04 == null) {
                return;
            }
            DirectPrivateStoryRecipientController.A07(directPrivateStoryRecipientController, -i2);
        }
    }
}
