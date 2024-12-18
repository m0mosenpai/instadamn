package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.LvC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49558LvC implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C49558LvC(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("direct_is_creating_secret_conversation", true);
        UserSession userSession = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        AbstractC31174DnI.A0a(fragmentActivity, A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(2266)).A0C(fragmentActivity);
    }
}
