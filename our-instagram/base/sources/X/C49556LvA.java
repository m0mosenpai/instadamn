package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.LvA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49556LvA implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        Fragment fragment = this.A00;
        new C6XJ(fragment.requireActivity(), bundle, userSession, ModalActivity.class, AbstractC111324zv.A00(2820)).A0C(fragment.getContext());
    }

    public C49556LvA(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
