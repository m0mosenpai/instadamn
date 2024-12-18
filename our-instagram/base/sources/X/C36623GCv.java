package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.GCv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36623GCv implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        if (AbstractC2051396d.A01(userSession)) {
            C36296Fzq A00 = F1E.A00(userSession);
            A00.A00 = AbstractC166997dE.A0n();
            C36296Fzq.A01(EnumC33514Ern.A0B, EnumC33512Erl.PROFILE_QUICK_PROMOTION, A00, "chat_creation_sheet_rendered");
            if (bundle == null) {
                bundle = AbstractC166987dD.A0b();
            }
            Fragment fragment = this.A00;
            AbstractC31171DnF.A0L(fragment.requireActivity(), bundle, userSession, ModalActivity.class, AbstractC111324zv.A00(4211)).A0C(fragment.getContext());
        }
    }

    public C36623GCv(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
