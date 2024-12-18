package X;

import java.io.IOException;

/* renamed from: X.Wg4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70733Wg4 implements C1EH {
    public static final C70733Wg4 A00 = new C70733Wg4();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        UQ7 uq7 = new UQ7(8);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaDrawableRect should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -1383228885:
                        if (A0s.equals("bottom")) {
                            uq7.A00 = c16l.A1D();
                            break;
                        }
                        break;
                    case 115029:
                        if (A0s.equals("top")) {
                            uq7.A03 = c16l.A1D();
                            break;
                        }
                        break;
                    case 3317767:
                        if (A0s.equals("left")) {
                            uq7.A01 = c16l.A1D();
                            break;
                        }
                        break;
                    case 108511772:
                        if (A0s.equals("right")) {
                            uq7.A02 = c16l.A1D();
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaDrawableRectJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return uq7;
    }
}
