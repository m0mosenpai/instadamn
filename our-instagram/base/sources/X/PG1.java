package X;

import android.widget.TextView;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.pendingmedia.model.UserStoryTarget;

/* loaded from: classes9.dex */
public final class PG1 implements InterfaceC146856jN, InterfaceC58149PqE {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    @Override // X.InterfaceC58149PqE
    public final boolean Ccu() {
        return true;
    }

    public PG1(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.A00 = directPrivateStoryRecipientController;
    }

    @Override // X.InterfaceC58149PqE
    public final int BPz(TextView textView) {
        return this.A00.A0H.A05(textView);
    }

    @Override // X.InterfaceC146856jN
    public final void CyQ(C82G c82g, C41181vS c41181vS) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A0F(EnumC201098ur.ACCEPT, c41181vS);
        directPrivateStoryRecipientController.A0P.A05(true, "ig_story_composer");
    }

    @Override // X.InterfaceC146856jN
    public final void D9P(C82G c82g, C41181vS c41181vS) {
        this.A00.A0F(EnumC201098ur.DECLINE, c41181vS);
    }

    @Override // X.InterfaceC58149PqE
    public final void DlS(UserStoryTarget userStoryTarget) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        AbstractC55178Odj.A05(directPrivateStoryRecipientController.A0B);
        directPrivateStoryRecipientController.A02++;
        directPrivateStoryRecipientController.A1K.add(UserStoryTarget.A01);
        DirectPrivateStoryRecipientController.A06(directPrivateStoryRecipientController);
    }

    @Override // X.InterfaceC146856jN
    public final void DmS(C82G c82g, C41181vS c41181vS) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A0F(EnumC201098ur.OTHER, c41181vS);
        directPrivateStoryRecipientController.A0P.A04(true);
    }

    @Override // X.InterfaceC146856jN
    public final void Dos() {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A0F(EnumC201098ur.OTHER, null);
        directPrivateStoryRecipientController.A0P.A05(false, "ig_story_composer");
    }

    @Override // X.InterfaceC146856jN
    public final void Dp0() {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A0F(EnumC201098ur.ACCEPT, null);
        directPrivateStoryRecipientController.A0P.A04(false);
    }

    @Override // X.InterfaceC58149PqE
    public final void DwD(UserStoryTarget userStoryTarget) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A03++;
        java.util.Set<UserStoryTarget> set = directPrivateStoryRecipientController.A1K;
        for (UserStoryTarget userStoryTarget2 : set) {
            String CBn = userStoryTarget2.CBn();
            if (CBn.equals("ALL") || CBn.equals("ALL_WITH_BLACKLIST")) {
                set.remove(userStoryTarget2);
            }
        }
        DirectPrivateStoryRecipientController.A06(directPrivateStoryRecipientController);
    }
}
