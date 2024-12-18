package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.model.direct.DirectShareTarget;

/* loaded from: classes6.dex */
public final class G1L implements InterfaceC37151GYo {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    @Override // X.InterfaceC37151GYo
    public final void DdI(DirectShareTarget directShareTarget) {
    }

    public G1L(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.A00 = directPrivateStoryRecipientController;
    }

    @Override // X.InterfaceC37151GYo
    public final void DdJ(FKH fkh, DirectShareTarget directShareTarget, float f) {
        long j;
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        G05 g05 = directPrivateStoryRecipientController.A1E;
        if (g05 != null) {
            UserSession userSession = directPrivateStoryRecipientController.A0B;
            int i = fkh.A02;
            long j2 = fkh.A01;
            long j3 = fkh.A00;
            EnumC40111tc enumC40111tc = directPrivateStoryRecipientController.A0M;
            if (enumC40111tc != null) {
                j = enumC40111tc.A00;
            } else {
                j = -1;
            }
            String str = directPrivateStoryRecipientController.A0U;
            EnumC33491ErQ enumC33491ErQ = directPrivateStoryRecipientController.A07;
            AbstractC59962oe abstractC59962oe = directPrivateStoryRecipientController.A0w;
            InterfaceC169517hR interfaceC169517hR = directPrivateStoryRecipientController.A0O;
            g05.A0A(enumC33491ErQ, abstractC59962oe, userSession, directShareTarget, str, null, null, interfaceC169517hR.BjQ(), interfaceC169517hR.Bo9(), i, j2, j3, j, false);
        }
    }
}
