package X;

import java.io.IOException;

/* renamed from: X.WgB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70739WgB implements C1EH {
    public static final C70739WgB A00 = new C70739WgB();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        C51737MtK c51737MtK = new C51737MtK(24);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for GradientColor should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                if (A0s.equals("top_color")) {
                    c51737MtK.A01 = c16l.A1D();
                } else if (A0s.equals("bottom_color")) {
                    c51737MtK.A00 = c16l.A1D();
                } else {
                    C0K8.A0C("GradientColorJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                }
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c51737MtK;
    }
}
