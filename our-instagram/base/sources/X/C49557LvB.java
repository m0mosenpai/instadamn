package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.LvB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49557LvB implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C49557LvB(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable("ARGUMENT_CAMERA_SETTINGS_MODE", EnumC46157Kbv.A03);
        AbstractC25228BEl.A1G(this.A00, A0b, this.A01, ModalActivity.class, "camera_settings");
    }
}
