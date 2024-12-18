package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.FaY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34948FaY {
    public final ImageUrl A00;
    public final CharSequence A01;
    public final String A02;

    public C34948FaY(Context context, UserSession userSession, C38321qM c38321qM) {
        String str;
        this.A00 = c38321qM.A1S();
        User A2E = c38321qM.A2E(userSession);
        A2E.getClass();
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A2E.getUsername());
        if (A2E.isVerified()) {
            C85963sQ.A08(context, A0H, true);
        }
        this.A01 = A0H;
        if (c38321qM.A5g()) {
            str = c38321qM.A0C.getTitle();
        } else if (c38321qM.A1V() != null) {
            str = c38321qM.A1V().A0e;
        } else {
            str = null;
        }
        this.A02 = str;
    }

    public C34948FaY() {
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }
}
