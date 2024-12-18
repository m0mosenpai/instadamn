package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.ABd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22979ABd {
    public final HashMap A00 = AbstractC166987dD.A1G();
    public final Context A01;
    public final UserSession A02;
    public final String A03;

    public final Drawable A00(C5NJ c5nj) {
        C5NL A00;
        C55U c55u;
        C14360o3.A0B(c5nj, 0);
        HashMap hashMap = this.A00;
        Drawable drawable = (Drawable) hashMap.get(c5nj);
        if (drawable == null) {
            Context context = this.A01;
            UserSession userSession = this.A02;
            String str = this.A03;
            C5NM c5nm = c5nj.A04;
            if (c5nm != null && (A00 = c5nm.A00()) != null) {
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != 3138974) {
                        if (hashCode != 3496474) {
                            if (hashCode == 94750499 && str.equals("clips")) {
                                c55u = C81U.A00;
                            }
                        } else if (str.equals("reel")) {
                            c55u = C208509Kk.A00;
                        }
                    } else if (str.equals("feed")) {
                        c55u = C128535rM.A00;
                    }
                    Drawable A002 = AMH.A00(context, userSession, c55u, null, A00, null, null, "RegionTrackingFilter", true);
                    AbstractC167017dG.A14(A002);
                    hashMap.put(c5nj, A002);
                    return A002;
                }
                c55u = null;
                Drawable A0022 = AMH.A00(context, userSession, c55u, null, A00, null, null, "RegionTrackingFilter", true);
                AbstractC167017dG.A14(A0022);
                hashMap.put(c5nj, A0022);
                return A0022;
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(c5nj.A03);
            throw AbstractC166987dD.A14(AbstractC166997dE.A0x(" sticker model shouldn't be null.", A1C));
        }
        return drawable;
    }

    public C22979ABd(Context context, UserSession userSession, String str) {
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = str;
    }
}
