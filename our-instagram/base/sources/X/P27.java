package X;

import android.widget.TextView;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.pendingmedia.model.UserStoryTarget;

/* loaded from: classes9.dex */
public final class P27 implements InterfaceC58149PqE {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    @Override // X.InterfaceC58149PqE
    public final boolean Ccu() {
        throw C00O.createAndThrow();
    }

    public P27(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.A00 = directPrivateStoryRecipientController;
    }

    @Override // X.InterfaceC58149PqE
    public final int BPz(TextView textView) {
        return this.A00.A0H.A05(textView);
    }

    @Override // X.InterfaceC58149PqE
    public final void DlS(UserStoryTarget userStoryTarget) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A02++;
        DirectPrivateStoryRecipientController.A05(directPrivateStoryRecipientController);
        DirectPrivateStoryRecipientController.A06(directPrivateStoryRecipientController);
        AbstractC50568MTz.A00(MU0.SHARE_CLICK, MU1.STORY, C82G.A0j, null, directPrivateStoryRecipientController.A0B);
    }

    @Override // X.InterfaceC58149PqE
    public final void DwD(UserStoryTarget userStoryTarget) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A03++;
        DirectPrivateStoryRecipientController.A05(directPrivateStoryRecipientController);
        DirectPrivateStoryRecipientController.A06(directPrivateStoryRecipientController);
    }
}
