package X;

import android.content.Context;
import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public abstract class AEO {
    public static final String A00(Context context, Integer num) {
        int i;
        if (num == C05F.A00) {
            i = 2131974262;
        } else if (num == C05F.A01) {
            i = 2131974260;
        } else if (num == C05F.A0C) {
            i = 2131974261;
        } else {
            return "";
        }
        return AbstractC166997dE.A0p(context, i);
    }

    public static final String A01(User user, Integer num) {
        InterfaceC111194zh Bxx;
        InterfaceC111194zh Bxv;
        if (num == C05F.A00) {
            Bxv = user.A03.Bxy();
        } else if (num == C05F.A01) {
            Bxv = user.A03.Bxv();
        } else {
            if (num == C05F.A0C && user.A03.Bxx() != null && (Bxx = user.A03.Bxx()) != null) {
                Bxx.Bba();
                return "";
            }
            return "";
        }
        if (Bxv != null) {
            return Bxv.Bba();
        }
        return "";
    }
}
