package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.api.schemas.CommentPrompt;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.471, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass471 {
    public static final AnonymousClass471 A00 = new Object();

    public static final C193328hC A01(Context context, C2JL c2jl, UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        C193328hC c193328hC = new C193328hC(context);
        c193328hC.A0A(2131957700);
        c193328hC.A09(2131957699);
        c193328hC.A0J(new DialogInterfaceOnClickListenerC35333FiA(c2jl, userSession, c38321qM), 2131957698);
        c193328hC.A03();
        return c193328hC;
    }

    public static final String A02(Resources resources, CommentPrompt commentPrompt, UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        Integer BnC = commentPrompt.BnC();
        if (BnC != null) {
            int intValue = BnC.intValue();
            if (intValue == 0 && (!z || C18U.A06(C06090Tz.A05, userSession, 36326171964815076L))) {
                return resources.getString(2131956472);
            }
            return resources.getQuantityString(R.plurals.comment_prompt_reply_count, intValue, BnC);
        }
        return null;
    }

    public static final boolean A04(UserSession userSession, C38321qM c38321qM) {
        String str;
        C14360o3.A0B(userSession, 1);
        if (A00(c38321qM) != null) {
            User CDj = c38321qM.A0C.CDj();
            if (CDj != null) {
                str = CDj.getId();
            } else {
                str = null;
            }
            if (C14360o3.A0K(str, userSession.userId) || ((c38321qM.A5P() && C18U.A06(C06090Tz.A06, userSession, 36326171964684002L)) || (c38321qM.A5c() && C18U.A06(C06090Tz.A06, userSession, 36328461182189098L)))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final CommentPrompt A00(C38321qM c38321qM) {
        AnonymousClass520 Ald;
        if (c38321qM != null && (Ald = c38321qM.A0C.Ald()) != null) {
            return Ald.Ape();
        }
        return null;
    }

    public static final String A03(C38321qM c38321qM) {
        CommentPrompt A002 = A00(c38321qM);
        if (A002 != null) {
            return A002.BbH();
        }
        return null;
    }

    public final boolean A05(UserSession userSession, C38321qM c38321qM) {
        if (A04(userSession, c38321qM)) {
            if (!c38321qM.A5P() || C18U.A06(C06090Tz.A05, userSession, 36326171964749539L)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
