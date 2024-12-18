package X;

import android.widget.TextView;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.pendingmedia.model.UserStoryTarget;

/* loaded from: classes9.dex */
public abstract class P26 implements InterfaceC58149PqE {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    public P26(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.A00 = directPrivateStoryRecipientController;
    }

    @Override // X.InterfaceC58149PqE
    public final int BPz(TextView textView) {
        return this.A00.A0H.A05(textView);
    }

    @Override // X.InterfaceC58149PqE
    public void DlS(UserStoryTarget userStoryTarget) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A02++;
        directPrivateStoryRecipientController.A1K.add(userStoryTarget);
        DirectPrivateStoryRecipientController.A06(directPrivateStoryRecipientController);
    }
}
