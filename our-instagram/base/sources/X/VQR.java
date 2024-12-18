package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public abstract class VQR {
    public static Number A00(C6FQ c6fq, C6FW c6fw) {
        C38321qM A0h = AbstractC25229BEm.A0h((UserSession) C6BQ.A0B(c6fq), (String) c6fw.A01());
        Float valueOf = Float.valueOf(-3.4028235E38f);
        if (A0h != null && A0h.A0C.BkJ() != null) {
            valueOf = A0h.A0C.BkJ();
        }
        return C6DZ.A00(valueOf.floatValue());
    }
}
