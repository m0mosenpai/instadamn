package X;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class OU7 {
    public CharSequence[] A00;
    public final P6K A01;
    public final C193328hC A02;
    public final Fragment A03;
    public final UserSession A04;

    public static final CharSequence[] A00(OU7 ou7) {
        if (ou7.A00 == null) {
            P6K p6k = ou7.A01;
            Resources resources = AbstractC166997dE.A0L(p6k.A0C).getResources();
            ArrayList A1E = AbstractC166987dD.A1E();
            C47Z c47z = p6k.A02;
            if (c47z != null) {
                boolean A12 = c47z.A12();
                int i = 2131969463;
                if (A12) {
                    A1E.add(resources.getString(2131969479));
                    i = 2131969475;
                }
                A1E.add(resources.getString(i));
                A1E.add(resources.getString(2131969467));
                CharSequence[] charSequenceArr = new CharSequence[A1E.size()];
                ou7.A00 = charSequenceArr;
                A1E.toArray(charSequenceArr);
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        CharSequence[] charSequenceArr2 = ou7.A00;
        if (charSequenceArr2 != null) {
            return charSequenceArr2;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public OU7(Fragment fragment, UserSession userSession, P6K p6k) {
        AbstractC167017dG.A1P(userSession, fragment);
        this.A04 = userSession;
        this.A03 = fragment;
        this.A01 = p6k;
        C193328hC A0O = AbstractC31175DnJ.A0O(fragment);
        A0O.A0m(fragment, userSession);
        this.A02 = A0O;
    }
}
