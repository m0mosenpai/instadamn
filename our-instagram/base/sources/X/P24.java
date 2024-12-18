package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.model.direct.DirectShareTarget;
import java.util.LinkedHashSet;

/* loaded from: classes9.dex */
public final class P24 implements InterfaceC37209GaK {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    public P24(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.A00 = directPrivateStoryRecipientController;
    }

    @Override // X.InterfaceC37209GaK
    public final int BYu(TextView textView) {
        return OP7.A00(textView, C05F.A00);
    }

    @Override // X.InterfaceC37209GaK
    public final boolean Cco(DirectShareTarget directShareTarget) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        if (!directPrivateStoryRecipientController.A1L) {
            if (directShareTarget.A0V() && AbstractC1337462f.A00(directPrivateStoryRecipientController.A0B)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37209GaK
    public final void Dkm(DirectShareTarget directShareTarget, int i, int i2, int i3) {
        String str;
        String str2;
        String str3;
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A02++;
        UserSession userSession = directPrivateStoryRecipientController.A0B;
        AbstractC59962oe abstractC59962oe = directPrivateStoryRecipientController.A0w;
        String BjQ = directPrivateStoryRecipientController.A0O.BjQ();
        G05 g05 = directPrivateStoryRecipientController.A1E;
        if (g05 == null) {
            str = null;
            str2 = null;
        } else {
            str = g05.A0A;
            str2 = g05.A08;
        }
        EnumC40111tc enumC40111tc = directPrivateStoryRecipientController.A0M;
        if (enumC40111tc != null) {
            str3 = enumC40111tc.name();
        } else {
            str3 = null;
        }
        F3J.A00(directPrivateStoryRecipientController.A07, abstractC59962oe, userSession, directShareTarget, BjQ, str, str2, str3, null, null, i2, i, true);
        DirectPrivateStoryRecipientController.A09(directPrivateStoryRecipientController, directShareTarget, i, i2, i3);
        LinkedHashSet linkedHashSet = directPrivateStoryRecipientController.A0H.A0U;
        linkedHashSet.remove(directShareTarget);
        linkedHashSet.add(directShareTarget);
        directPrivateStoryRecipientController.A0H.A06();
        directPrivateStoryRecipientController.mSearchController.onBackPressed();
        directPrivateStoryRecipientController.A06.postDelayed(new RunnableC56896PMp(directPrivateStoryRecipientController), 200L);
        AbstractC50523MSb.A1G(directPrivateStoryRecipientController);
    }

    @Override // X.InterfaceC37209GaK
    public final void Dqj(View view, DirectShareTarget directShareTarget, int i, int i2, int i3) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        InterfaceC37151GYo interfaceC37151GYo = directPrivateStoryRecipientController.A11;
        C57112jm c57112jm = directPrivateStoryRecipientController.A10;
        if (c57112jm != null) {
            C59072n8 A00 = C59062n7.A00(directShareTarget, new FKH(i, i2, i3), String.valueOf(directShareTarget.A09()));
            A00.A00(new G0X(interfaceC37151GYo));
            c57112jm.A05(view, A00.A01());
        }
    }

    @Override // X.InterfaceC37209GaK
    public final void DwC(DirectShareTarget directShareTarget, int i, int i2) {
        String str;
        String str2;
        String str3;
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A03++;
        UserSession userSession = directPrivateStoryRecipientController.A0B;
        AbstractC59962oe abstractC59962oe = directPrivateStoryRecipientController.A0w;
        String BjQ = directPrivateStoryRecipientController.A0O.BjQ();
        G05 g05 = directPrivateStoryRecipientController.A1E;
        if (g05 == null) {
            str = null;
            str2 = null;
        } else {
            str = g05.A0A;
            str2 = g05.A08;
        }
        EnumC40111tc enumC40111tc = directPrivateStoryRecipientController.A0M;
        if (enumC40111tc != null) {
            str3 = enumC40111tc.name();
        } else {
            str3 = null;
        }
        F3J.A00(directPrivateStoryRecipientController.A07, abstractC59962oe, userSession, directShareTarget, BjQ, str, str2, str3, null, null, i2, i, false);
        if (g05 != null && g05.A0C) {
            g05.A0J.remove(directShareTarget);
        }
        AbstractC50523MSb.A1G(directPrivateStoryRecipientController);
        C0fA.A00(directPrivateStoryRecipientController.A0I, -725313217);
    }
}
