package X;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.FPg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34671FPg {
    public final Fragment A00;
    public final UserSession A01;

    public C34671FPg(Fragment fragment, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragment;
    }

    public final String A00() {
        String string;
        int A00 = AbstractC34041F0u.A00(this.A01);
        Resources A0N = AbstractC166997dE.A0N(this.A00);
        if (A00 > 0) {
            string = AbstractC167017dG.A0k(A0N, A00, R.plurals.birthday_effect_audience_picker_close_friends_count);
        } else {
            string = A0N.getString(2131953828);
        }
        C14360o3.A0A(string);
        return string;
    }
}
