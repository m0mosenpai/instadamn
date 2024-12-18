package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.FPw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34685FPw {
    public final GZT A00;
    public final UserSession A01;
    public final String A02;

    public final void A00(Context context, AbstractC018607g abstractC018607g, String str) {
        if (str != null) {
            C25621Ms A0N = AbstractC31173DnH.A0N(this.A01);
            A0N.A0S(C2045893s.class, C2046093u.class);
            A0N.A9s("from_module", this.A02);
            A0N.A0B("users/{user_name}/usernameinfo/");
            C1ON A0T = AbstractC31172DnG.A0T(A0N, "user_name", str);
            C31714DwJ.A00(A0T, this, 6);
            C1GJ.A00(context, abstractC018607g, A0T);
            return;
        }
        throw AbstractC166987dD.A12("userId and username cannot both be null");
    }

    public C34685FPw(UserSession userSession, GZT gzt, String str) {
        this.A01 = userSession;
        this.A00 = gzt;
        this.A02 = str;
    }
}
