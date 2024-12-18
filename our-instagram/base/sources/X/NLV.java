package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.pendingmedia.model.UserStoryTarget;

/* loaded from: classes9.dex */
public final class NLV extends P26 {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NLV(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        super(directPrivateStoryRecipientController);
        this.A00 = directPrivateStoryRecipientController;
    }

    @Override // X.InterfaceC58149PqE
    public final boolean Ccu() {
        C684436h c684436h = this.A00.A09;
        c684436h.getClass();
        UserSession userSession = c684436h.A01;
        if (AbstractC34041F0u.A00(userSession) > 0) {
            return true;
        }
        AbstractC35049FcM.A01(c684436h.A00, EnumC33409Epg.STORY_SHARE_SHORTCUT, userSession, false, false);
        return false;
    }

    @Override // X.P26, X.InterfaceC58149PqE
    public final void DlS(UserStoryTarget userStoryTarget) {
        AbstractC55178Odj.A05(this.A00.A0B);
        UserStoryTarget userStoryTarget2 = UserStoryTarget.A09;
        if (userStoryTarget != userStoryTarget2) {
            userStoryTarget2 = UserStoryTarget.A02;
        }
        super.DlS(userStoryTarget2);
    }

    @Override // X.InterfaceC58149PqE
    public final void DwD(UserStoryTarget userStoryTarget) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A03++;
        java.util.Set<UserStoryTarget> set = directPrivateStoryRecipientController.A1K;
        for (UserStoryTarget userStoryTarget2 : set) {
            String CBn = userStoryTarget2.CBn();
            if (CBn.equals("CLOSE_FRIENDS") || CBn.equals("CLOSE_FRIENDS_WITH_BLACKLIST") || CBn.equals("PRIVATE_STORY")) {
                set.remove(userStoryTarget2);
            }
        }
        DirectPrivateStoryRecipientController.A06(directPrivateStoryRecipientController);
    }
}
