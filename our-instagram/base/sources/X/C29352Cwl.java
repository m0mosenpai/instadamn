package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Cwl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29352Cwl implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("persona_id");
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("persona_id", queryParameter);
        AbstractC25228BEl.A1G(this.A00, A0b, this.A01, ModalActivity.class, "AI_SETTINGS");
    }

    public C29352Cwl(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
