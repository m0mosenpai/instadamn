package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.75H, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75H {
    public final Context A00;
    public final UserSession A01;
    public final Map A02;
    public final Map A03;

    public C75H(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A01 = userSession;
        if (!(context instanceof Application) && C18U.A06(C06090Tz.A05, userSession, 36330720334988262L)) {
            context = context.getApplicationContext();
            C14360o3.A07(context);
        }
        this.A00 = context;
        this.A02 = new HashMap();
        this.A03 = new HashMap();
    }

    public final Medium A00(C38321qM c38321qM) {
        int i;
        String str;
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A03;
        Medium medium = (Medium) map.get(c38321qM);
        if (medium == null) {
            boolean Cff = c38321qM.Cff();
            int A0z = c38321qM.A0z();
            int A0y = c38321qM.A0y();
            if (c38321qM.Cff()) {
                i = (int) c38321qM.A1C();
            } else {
                i = 0;
            }
            String A2u = c38321qM.A2u();
            ImageUrl A1S = c38321qM.A1S();
            if (A1S != null) {
                str = A1S.getUrl();
            } else {
                str = null;
            }
            Medium A04 = C8IU.A04(A2u, str, A0z, A0y, i, Cff);
            map.put(c38321qM, A04);
            this.A02.put(String.valueOf(A04.A05), c38321qM);
            return A04;
        }
        return medium;
    }

    public final C121275eQ A01(List list, List list2) {
        C14360o3.A0B(list, 0);
        return new C121275eQ(new PUQ(this.A00, this.A01, list, list2, this.A02), 576);
    }
}
