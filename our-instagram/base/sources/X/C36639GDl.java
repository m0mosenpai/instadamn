package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.GDl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36639GDl implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        Fragment fragment = this.A00;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            UserSession userSession = this.A01;
            AbstractC31171DnF.A0L(fragment.requireActivity(), AbstractC166987dD.A0b(), userSession, ModalActivity.class, "ads_data_preferences_notice").A0C(activity);
        }
    }

    public C36639GDl(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
