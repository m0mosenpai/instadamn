package X;

import android.content.Context;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.9Qc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209909Qc {
    public static JMA A00(C41181vS c41181vS) {
        if (c41181vS != null && c41181vS.CY4()) {
            C38321qM c38321qM = c41181vS.A0b;
            c38321qM.getClass();
            if (c38321qM.A0C.C1a() != null) {
                List C1a = c38321qM.A0C.C1a();
                C14360o3.A0B(C1a, 0);
                return (JMA) AbstractC001800i.A0J(C1a);
            }
            return null;
        }
        return null;
    }

    public static AlB A01(Context context, User user, String str) {
        user.getClass();
        int[] iArr = AlB.A03;
        C44I c44i = new C189138Ze(AJu.A00(), null, null, "", "", null, null, "", "", "", "", "", "", 0).A01;
        String A0w = AbstractC166997dE.A0w(AbstractC167007dF.A0f(context, user.B8y(), 2131962984));
        C14360o3.A0B(A0w, 0);
        AbstractC167017dG.A0x();
        return new AlB(new C189138Ze(c44i.F55(), user, null, "", "", "DEFAULT", null, "", str, "", "", A0w, "", 0));
    }
}
