package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Cwm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29353Cwm implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        Bundle A0b = AbstractC166987dD.A0b();
        String queryParameter = uri.getQueryParameter("scroll_to_auto_save");
        if (queryParameter == null) {
            queryParameter = "";
        }
        String A0h = AbstractC167007dF.A0h(queryParameter);
        int length = A0h.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            int A00 = C14360o3.A00(A0h.charAt(i2), 32);
            boolean z2 = false;
            if (A00 <= 0) {
                z2 = true;
            }
            if (!z) {
                if (!z2) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!z2) {
                break;
            } else {
                length--;
            }
        }
        A0b.putBoolean("ReelSettingsFragment.ARGUMENT_REEL_SETTINGS_SCROLL_TO_AUTO_SAVE_SETTINGS", "true".equals(A0h.subSequence(i, length + 1).toString()));
        AbstractC25228BEl.A1G(this.A00, A0b, this.A01, ModalActivity.class, AbstractC111324zv.A00(1217));
    }

    public C29353Cwm(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
