package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Nq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162067Nq implements C7C2 {
    public static final C162067Nq A00 = new Object();

    @Override // X.C7C2
    public final boolean CWe(UserSession userSession, AbstractC159137Bz abstractC159137Bz, String str) {
        C14360o3.A0B(userSession, 2);
        if (str.length() == 0) {
            return false;
        }
        String obj = AbstractC001900j.A0B(str).toString();
        if (obj != null && obj.equalsIgnoreCase("meta")) {
            return true;
        }
        if (!AbstractC002300n.A0h("metaai", str, true) || !C18U.A06(C06090Tz.A05, userSession, 36331141241783481L)) {
            return false;
        }
        return true;
    }
}
