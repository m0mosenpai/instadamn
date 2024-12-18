package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.EwG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33790EwG {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        boolean A01 = C6DZ.A01(c6fw.A01());
        Object A02 = c6fw.A02();
        AbstractC25225BEi.A1S(A02);
        String str = (String) A02;
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        boolean z = !A01;
        F5G.A00(A0W, new DirectThreadKey(str, null), z);
        C162337Ov.A0n(A0W, str, z);
        return null;
    }
}
