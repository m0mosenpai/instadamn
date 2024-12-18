package X;

import com.instagram.api.schemas.MusicInfoImpl;
import java.io.IOException;

/* renamed from: X.Gmb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37938Gmb {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.H95, X.1um, X.1ul] */
    public static H95 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("caption".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c40791um.A02 = A1P;
                } else if ("music_info".equals(A0q)) {
                    c40791um.A00 = C3XO.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            String str = c40791um.A02;
            MusicInfoImpl musicInfoImpl = c40791um.A00;
            C14360o3.A0A(musicInfoImpl);
            c40791um.A01 = new C37940Gmd(musicInfoImpl, str);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
