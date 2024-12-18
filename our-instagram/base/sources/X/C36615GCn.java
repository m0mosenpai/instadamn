package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.GCn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36615GCn implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            AbstractC25228BEl.A1G(activity, AbstractC166987dD.A0b(), this.A01, ModalActivity.class, "profile_photo");
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public C36615GCn(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
