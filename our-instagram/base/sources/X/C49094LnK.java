package X;

import android.os.Bundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel;

/* renamed from: X.LnK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49094LnK implements InterfaceC163937Vh {
    public final /* synthetic */ C45518KDj A00;

    @Override // X.InterfaceC163937Vh
    public final void ElA(MRL mrl, MessageActionsViewModel messageActionsViewModel) {
        Bundle bundle;
        C45518KDj c45518KDj = this.A00;
        if (c45518KDj.isResumed() && (bundle = c45518KDj.mArguments) != null) {
            int i = bundle.getInt(AbstractC111324zv.A00(18), 0);
            UserSession A0r = AbstractC166987dD.A0r(c45518KDj.A0I);
            C3o9 c3o9 = c45518KDj.A08;
            if (c3o9 == null) {
                C14360o3.A0F("unifiedThreadKey");
                throw C00O.createAndThrow();
            }
            KB3 A01 = KB3.A01(A0r, messageActionsViewModel, null, c3o9, i, false, false, false, false);
            c45518KDj.A06 = A01;
            A01.A0N(mrl);
            C14240no A0F = AbstractC43593JPy.A0F(c45518KDj);
            A0F.A0C(A01, c45518KDj.A0E, R.id.card_gallery_fragment);
            A0F.A00();
        }
    }

    public C49094LnK(C45518KDj c45518KDj) {
        this.A00 = c45518KDj;
    }
}
