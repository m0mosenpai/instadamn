package X;

import java.io.IOException;

/* renamed from: X.540, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass540 {
    public static AnonymousClass544 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            AnonymousClass541 anonymousClass541 = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("style".equals(A0q)) {
                    anonymousClass541 = AnonymousClass541.A03.A00(c16l.A1D());
                } else if ("attachment_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            AnonymousClass544 anonymousClass544 = new AnonymousClass544();
            if (anonymousClass541 != null) {
                anonymousClass544.A00 = anonymousClass541;
            }
            if (str != null) {
                anonymousClass544.A01 = str;
            }
            return anonymousClass544;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
