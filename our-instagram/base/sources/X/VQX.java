package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes11.dex */
public abstract class VQX {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP A0O = AbstractC65702TsY.A0O(c6fw);
        Context requireContext = C6BQ.A00(C6BQ.A09(c6fq)).requireContext();
        UserSession userSession = (UserSession) AbstractC31175DnJ.A0J(c6fq);
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        String A0I = A0O.A0I();
        if (A0I != null) {
            String A0E = A0O.A0E();
            if (A0E != null) {
                String A0F = A0O.A0F();
                List<String> A0O2 = A0O.A0O(36);
                C14360o3.A07(A0O2);
                ArrayList A0q = AbstractC167017dG.A0q(A0O2);
                for (String str2 : A0O2) {
                    Locale locale = Locale.US;
                    C14360o3.A08(locale);
                    String upperCase = str2.toUpperCase(locale);
                    C14360o3.A07(upperCase);
                    A0q.add(AbstractC68362VNw.A00(upperCase));
                }
                AbstractC138316On.A02(requireContext, userSession, str, A0I, A0E, A0F, A0q);
                return null;
            }
            throw new IllegalStateException("cta_type cannot be null");
        }
        throw new IllegalStateException("media_id cannot be null");
    }
}
