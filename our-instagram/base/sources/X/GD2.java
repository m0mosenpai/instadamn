package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes6.dex */
public final class GD2 implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("scrollToVideo", false);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("scroll_to_video_chat", booleanQueryParameter);
        UserSession userSession = this.A01;
        Fragment fragment = this.A00;
        AbstractC31173DnH.A1I(fragment, AbstractC31176DnK.A0d(fragment.requireActivity(), A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(2271)));
    }

    public GD2(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
