package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Faj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34959Faj {
    public final Activity A00;
    public final Fragment A01;
    public final UserSession A02;
    public final C31600DuS A03;
    public final C2DS A04;

    public C34959Faj(Activity activity, Fragment fragment, UserSession userSession) {
        C14360o3.A0B(fragment, 3);
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = fragment;
        this.A03 = C31600DuS.A00(userSession, AbstractC166997dE.A0a());
        this.A04 = AbstractC28761aE.A00(userSession);
    }

    public static final String A00(String str, List list) {
        if (str.length() <= 0) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                A1C.append(AbstractC31172DnG.A14(AbstractC31172DnG.A0n(list, i)));
                if (i < AbstractC25226BEj.A05(list)) {
                    A1C.append(", ");
                }
            }
            return AbstractC166987dD.A19(A1C);
        }
        return str;
    }
}
