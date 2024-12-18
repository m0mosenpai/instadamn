package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes6.dex */
public final class GD3 implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        Fragment fragment = this.A00;
        AbstractC31171DnF.A0L(fragment.requireActivity(), bundle, userSession, ModalActivity.class, AbstractC111324zv.A00(5018)).A0C(fragment.getContext());
    }

    public GD3(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
