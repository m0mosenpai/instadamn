package X;

import com.instagram.api.schemas.IGMusicArtistPinningErrorType;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class IOM {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.H92, X.1um, X.1ul] */
    public static H92 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(2321).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    IGMusicArtistPinningErrorType iGMusicArtistPinningErrorType = (IGMusicArtistPinningErrorType) IGMusicArtistPinningErrorType.A01.get(A1P);
                    if (iGMusicArtistPinningErrorType == null) {
                        iGMusicArtistPinningErrorType = IGMusicArtistPinningErrorType.A0C;
                    }
                    c40791um.A00 = iGMusicArtistPinningErrorType;
                } else if ("success".equals(A0s)) {
                    c40791um.A02 = AbstractC166997dE.A0d(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            c40791um.A01 = new C38599Gy2(c40791um.A00, AbstractC31172DnG.A1b(c40791um.A02));
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
