package X;

import com.instagram.api.schemas.IntegrityInterstitialType;
import java.io.IOException;

/* renamed from: X.Vwo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69863Vwo {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.UyT, X.1um, X.1ul] */
    public static C67794UyT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("country".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC43591JPw.A00(1095).equals(A0s)) {
                    IntegrityInterstitialType integrityInterstitialType = (IntegrityInterstitialType) IntegrityInterstitialType.A01.get(AbstractC167017dG.A0m(c16l));
                    if (integrityInterstitialType == null) {
                        integrityInterstitialType = IntegrityInterstitialType.A07;
                    }
                    c40791um.A01 = integrityInterstitialType;
                } else if ("lynx_url".equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("regulator".equals(A0s)) {
                    c40791um.A04 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            c40791um.A00 = new C211759a0(c40791um.A01, c40791um.A02, c40791um.A03, c40791um.A04);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
