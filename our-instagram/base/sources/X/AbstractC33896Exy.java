package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Exy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33896Exy {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        Object A03 = c6fw.A03(0);
        if (A03 instanceof String) {
            str = (String) A03;
        } else {
            str = null;
        }
        Object A02 = c6fw.A02();
        if (!(A02 instanceof String)) {
            A02 = null;
        }
        C2DS A00 = C2JD.A00(AbstractC31172DnG.A0W(c6fq));
        A00.A8w(new DirectThreadKey(str, null), null);
        if (C14360o3.A0K(A02, "CLEAR_USER")) {
            A00.A8i(new DirectThreadKey(str, null), false);
        }
        return null;
    }
}
