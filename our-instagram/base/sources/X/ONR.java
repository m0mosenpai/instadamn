package X;

import com.facebook.common.dextricks.DexStore;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class ONR {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.N2P, X.1um, X.1ul] */
    public static N2P parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (DexStore.CONFIG_FILENAME.equals(A0s)) {
                    c40791um.A00 = AbstractC53777NqT.parseFromJson(c16l);
                } else if ("error".equals(A0s)) {
                    c40791um.A02 = AbstractC40690I1w.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            c40791um.A01 = new C51584Mqc(c40791um.A00, c40791um.A02);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}