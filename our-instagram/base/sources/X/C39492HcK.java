package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.HcK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39492HcK extends HL1 {
    public final UserSession A00;
    public final JIJ A01;
    public final List A02;
    public final C38668Gz9 A03;
    public final String A04;

    public C39492HcK(Fragment fragment, UserSession userSession, JIJ jij, C38668Gz9 c38668Gz9, List list) {
        super(fragment, userSession, jij, list, false);
        String string;
        this.A00 = userSession;
        this.A01 = jij;
        this.A02 = list;
        this.A03 = c38668Gz9;
        FragmentActivity activity = fragment.getActivity();
        this.A04 = (activity == null || (string = activity.getString(2131966147)) == null) ? "" : string;
    }

    public static final C38321qM A02(C38321qM c38321qM, C39492HcK c39492HcK) {
        ArrayList arrayList = null;
        C14360o3.A0B(c38321qM, 1);
        String str = c39492HcK.A04;
        C38668Gz9 c38668Gz9 = c39492HcK.A03;
        String str2 = c38668Gz9.A01;
        String str3 = str2 != null ? str2 : null;
        if (c38321qM.A5M()) {
            arrayList = AbstractC166987dD.A1E();
            int A0p = c38321qM.A0p();
            for (int i = 0; i < A0p; i++) {
                C38321qM A1e = c38321qM.A1e(i);
                if (A1e != null) {
                    arrayList.add(A02(A1e, c39492HcK));
                }
            }
        }
        return I0G.A00(c39492HcK.A00, c38668Gz9, c38321qM, str3, null, str, arrayList, true, true);
    }
}
