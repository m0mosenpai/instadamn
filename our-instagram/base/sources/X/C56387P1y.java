package X;

import android.view.View;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.P1y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56387P1y implements InterfaceC58308Pt0 {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    public C56387P1y(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.A00 = directPrivateStoryRecipientController;
    }

    @Override // X.InterfaceC58308Pt0
    public final ImmutableSet B2y() {
        return ImmutableSet.A03(this.A00.A1K);
    }

    @Override // X.GYT
    public final void DjF() {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        if (directPrivateStoryRecipientController.A0O.CUG()) {
            InterfaceC169517hR interfaceC169517hR = directPrivateStoryRecipientController.A0O;
            interfaceC169517hR.Eby(interfaceC169517hR.BjQ());
        }
    }

    @Override // X.InterfaceC58308Pt0
    public final void Dkm(DirectShareTarget directShareTarget, int i, int i2, int i3) {
        String str;
        String str2;
        String str3;
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A02++;
        UserSession userSession = directPrivateStoryRecipientController.A0B;
        AbstractC59962oe abstractC59962oe = directPrivateStoryRecipientController.A0w;
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
        F3J.A00(directPrivateStoryRecipientController.A07, abstractC59962oe, userSession, directShareTarget, null, str, str2, str3, null, null, i2, i, true);
        DirectPrivateStoryRecipientController.A09(directPrivateStoryRecipientController, directShareTarget, i, i2, i3);
        AbstractC50523MSb.A1G(directPrivateStoryRecipientController);
    }

    @Override // X.InterfaceC58308Pt0
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

    @Override // X.InterfaceC58308Pt0
    public final void DwC(DirectShareTarget directShareTarget, int i, int i2) {
        String str;
        String str2;
        String str3;
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A03++;
        UserSession userSession = directPrivateStoryRecipientController.A0B;
        AbstractC59962oe abstractC59962oe = directPrivateStoryRecipientController.A0w;
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
        F3J.A00(directPrivateStoryRecipientController.A07, abstractC59962oe, userSession, directShareTarget, null, str, str2, str3, null, null, i2, i, false);
        if (g05 != null && g05.A0C) {
            g05.A0J.remove(directShareTarget);
        }
        AbstractC50523MSb.A1G(directPrivateStoryRecipientController);
    }
}
