package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class LFu {
    public final Context A00;
    public final UserSession A01;

    public static String A00(LFu lFu, User user, String str) {
        String str2;
        boolean equals = lFu.A01.userId.equals(str);
        Context context = lFu.A00;
        if (equals) {
            return context.getString(2131960238);
        }
        if (user != null) {
            str2 = AbstractC101904i3.A08(user);
        } else {
            str2 = "";
        }
        return AbstractC167007dF.A0f(context, str2, 2131960235);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0198, code lost:
    
        if (r5 == false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.L51 A01(X.C160787Im r51, X.EnumC46202Kce r52) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LFu.A01(X.7Im, X.Kce):X.L51");
    }

    public LFu(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }
}
