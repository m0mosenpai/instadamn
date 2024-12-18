package X;

import android.os.Bundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel;

/* renamed from: X.LnJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49093LnJ implements InterfaceC163937Vh {
    public final /* synthetic */ EOJ A00;

    @Override // X.InterfaceC163937Vh
    public final void ElA(MRL mrl, MessageActionsViewModel messageActionsViewModel) {
        Bundle bundle;
        EOJ eoj = this.A00;
        if (eoj.isResumed() && (bundle = eoj.mArguments) != null) {
            int i = bundle.getInt(AbstractC111324zv.A00(18), 0);
            UserSession A0D = eoj.A0D();
            C3o9 c3o9 = eoj.A0D;
            if (c3o9 == null) {
                C14360o3.A0F("unifiedThreadKey");
                throw C00O.createAndThrow();
            }
            KB3 A01 = KB3.A01(A0D, messageActionsViewModel, null, c3o9, i, false, false, false, false);
            eoj.A08 = A01;
            A01.A0N(mrl);
            A01.A0M(-1);
            C14240no A0F = AbstractC43593JPy.A0F(eoj);
            A0F.A0C(A01, eoj.A0R, R.id.card_gallery_fragment);
            A0F.A00();
        }
    }

    public C49093LnJ(EOJ eoj) {
        this.A00 = eoj;
    }
}
