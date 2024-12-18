package X;

import java.io.IOException;

/* renamed from: X.Wgk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70771Wgk implements C1EH {
    public static final C70771Wgk A00 = new C70771Wgk();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        UQE uqe = new UQE(13);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for PromptTitles should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                if (A0s.equals("first")) {
                    if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                        uqe.A00 = A1P2;
                    }
                } else if (A0s.equals("second")) {
                    if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                        uqe.A01 = A1P;
                    }
                } else {
                    C0K8.A0C("PromptTitlesJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                }
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return uqe;
    }
}
