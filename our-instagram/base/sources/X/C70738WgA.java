package X;

import java.io.IOException;

/* renamed from: X.WgA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70738WgA implements C1EH {
    public static final C70738WgA A00 = new C70738WgA();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        C66625UPn c66625UPn = new C66625UPn(1);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for FaceCenter should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                int hashCode = A0s.hashCode();
                if (hashCode != 120) {
                    if (hashCode != 121) {
                        if (hashCode == 829251210 && A0s.equals("confidence")) {
                            c66625UPn.A00 = (float) c16l.A0U();
                        }
                        C0K8.A0C("FaceCenterJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                    } else {
                        if (A0s.equals("y")) {
                            c66625UPn.A02 = (float) c16l.A0U();
                        }
                        C0K8.A0C("FaceCenterJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                    }
                } else {
                    if (A0s.equals("x")) {
                        c66625UPn.A01 = (float) c16l.A0U();
                    }
                    C0K8.A0C("FaceCenterJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                }
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c66625UPn;
    }
}
