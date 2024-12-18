package X;

import android.view.View;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.P1z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56388P1z implements InterfaceC58308Pt0 {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    @Override // X.GYT
    public final void DjF() {
    }

    @Override // X.InterfaceC58308Pt0
    public final void Dqj(View view, DirectShareTarget directShareTarget, int i, int i2, int i3) {
    }

    public C56388P1z(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.A00 = directPrivateStoryRecipientController;
    }

    @Override // X.InterfaceC58308Pt0
    public final ImmutableSet B2y() {
        return ImmutableSet.A03(this.A00.A1K);
    }

    @Override // X.InterfaceC58308Pt0
    public final void Dkm(DirectShareTarget directShareTarget, int i, int i2, int i3) {
        String str;
        String str2;
        String str3;
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
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
        F3J.A00(directPrivateStoryRecipientController.A07, abstractC59962oe, userSession, directShareTarget, null, str, str2, str3, null, null, i2, 3, true);
        DirectPrivateStoryRecipientController.A09(directPrivateStoryRecipientController, directShareTarget, i, i2, i3);
        AbstractC50523MSb.A1G(directPrivateStoryRecipientController);
    }

    @Override // X.InterfaceC58308Pt0
    public final void DwC(DirectShareTarget directShareTarget, int i, int i2) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        G05 g05 = directPrivateStoryRecipientController.A1E;
        if (g05 != null && g05.A0C) {
            g05.A0J.remove(directShareTarget);
        }
        AbstractC50523MSb.A1G(directPrivateStoryRecipientController);
    }
}
