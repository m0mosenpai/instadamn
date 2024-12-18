package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes6.dex */
public final class GDU implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        AbstractC31178DnM.A0j(this.A00, AbstractC166987dD.A0b(), userSession, ModalActivity.class, "direct_pick_video_call_recipients");
    }

    public GDU(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
