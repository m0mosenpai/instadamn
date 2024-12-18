package X;

import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.pendingmedia.model.UserStoryTarget;

/* loaded from: classes9.dex */
public final class NLW extends P26 {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    @Override // X.InterfaceC58149PqE
    public final boolean Ccu() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NLW(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        super(directPrivateStoryRecipientController);
        this.A00 = directPrivateStoryRecipientController;
    }

    @Override // X.P26, X.InterfaceC58149PqE
    public final void DlS(UserStoryTarget userStoryTarget) {
        AbstractC55178Odj.A05(this.A00.A0B);
        super.DlS(UserStoryTarget.A03);
    }

    @Override // X.InterfaceC58149PqE
    public final void DwD(UserStoryTarget userStoryTarget) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A03++;
        java.util.Set<UserStoryTarget> set = directPrivateStoryRecipientController.A1K;
        for (UserStoryTarget userStoryTarget2 : set) {
            if ("EXCLUSIVE_STORY".equals(userStoryTarget2.CBn())) {
                set.remove(userStoryTarget2);
            }
        }
        DirectPrivateStoryRecipientController.A06(directPrivateStoryRecipientController);
    }
}
