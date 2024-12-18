package X;

import java.io.IOException;

/* renamed from: X.WgY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70759WgY implements C1EH {
    public static final C70759WgY A00 = new C70759WgY();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        C38687GzS c38687GzS = new C38687GzS(null, null, null, 3, 23);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaPollV2StickerOption should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                if (A0s.equals("text")) {
                    if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                        c38687GzS.A01 = A1P;
                    }
                } else if (A0s.equals("count")) {
                    c38687GzS.A00 = AbstractC166997dE.A0h(c16l);
                } else {
                    C0K8.A0C("MediaPollV2StickerOptionJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                }
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c38687GzS;
    }
}
