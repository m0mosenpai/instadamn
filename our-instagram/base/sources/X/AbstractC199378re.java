package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;

/* renamed from: X.8re, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC199378re {
    public static final boolean A00(C22P c22p) {
        C14360o3.A0B(c22p, 0);
        if (c22p != C22P.A2c && c22p != C22P.A5I && c22p != C22P.A5G) {
            return false;
        }
        return true;
    }

    public static final boolean A01(C22P c22p, Medium medium, UserSession userSession) {
        C14360o3.A0B(c22p, 0);
        if (A00(c22p) && medium != null && medium.A03 > AnonymousClass827.A00(userSession).A01) {
            return true;
        }
        return false;
    }
}
