package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6Yq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC140886Yq {
    public static final boolean A00(UserSession userSession, C41181vS c41181vS) {
        String str;
        String A36;
        C38321qM c38321qM = c41181vS.A0b;
        String str2 = null;
        if (c38321qM != null) {
            JMM C1A = c38321qM.A0C.C1A();
            if (C1A != null) {
                str = C1A.Bfx();
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        if (c38321qM != null) {
            str2 = c38321qM.A36();
        }
        if (!C9H3.A01(userSession, str2)) {
            if (c38321qM == null) {
                return false;
            }
            String A362 = c38321qM.A36();
            if ((A362 == null || A362.length() == 0 || !C9H3.A01.contains(A362)) && ((A36 = c38321qM.A36()) == null || A36.length() == 0 || !C9H3.A00.contains(A36))) {
                return false;
            }
        }
        return true;
    }
}
