package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EyA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33908EyA {
    public static final Boolean A00(C6FQ c6fq, C6FW c6fw) {
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        boolean z = false;
        Object obj = c6fw.A00.get(0);
        if (((C2DP) C2DJ.A00(A0S)).A05.A00()) {
            z = AbstractC25231BEo.A1Z(obj, "instagram_direct", false);
        }
        return Boolean.valueOf(z);
    }
}
