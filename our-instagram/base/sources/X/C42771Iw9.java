package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Iw9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42771Iw9 implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        Bundle A0E = AbstractC31174DnI.A0E(uri, 0);
        A0E.putString("effect_id", uri.getQueryParameter("effect_id"));
        AbstractC25228BEl.A1G(this.A00, A0E, this.A01, ModalActivity.class, "effects_page");
    }

    public C42771Iw9(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
