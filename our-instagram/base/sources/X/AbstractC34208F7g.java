package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.F7g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34208F7g {
    public static final void A00(C6FQ c6fq, boolean z) {
        String str;
        Bundle bundle;
        UserSession A07;
        FragmentActivity A04 = C6BQ.A04(c6fq);
        try {
            A07 = AbstractC31172DnG.A0W(c6fq);
        } catch (ClassCastException unused) {
            Bundle A0b = AbstractC166987dD.A0b();
            Bundle A0A = AbstractC31173DnH.A0A(A04);
            if (A0A == null || (str = A0A.getString("last_logged_in_ig_access_token", null)) == null) {
                Bundle A0A2 = AbstractC31173DnH.A0A(A04);
                if (A0A2 != null && (bundle = A0A2.getBundle("source_activity_arguments")) != null) {
                    str = bundle.getString("last_logged_in_ig_access_token", null);
                } else {
                    str = null;
                }
            }
            AbstractC31171DnF.A12(A0b, str);
            A07 = C023409i.A0A.A07(A0b);
        }
        if (A07 != null) {
            AbstractC35178FfV.A00().A01(A04, C0BQ.A00(A07).AEY(A04, null, A07, null, z).A00, A07, false);
        }
    }
}
