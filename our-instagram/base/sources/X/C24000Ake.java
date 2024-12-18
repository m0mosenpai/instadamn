package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.Ake, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24000Ake implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        AbstractC189688an.A00(C22P.A2L);
        Bundle bundle2 = new Bundle();
        FragmentActivity fragmentActivity = this.A00;
        C6XJ.A02(fragmentActivity, bundle2, userSession, TransparentModalActivity.class, "direct_quick_camera_fragment").A0C(fragmentActivity);
    }

    public C24000Ake(Fragment fragment, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = fragment.getActivity();
    }
}
