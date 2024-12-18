package X;

import com.instagram.api.schemas.CreatorDigestSignalInfoImpl;
import com.instagram.api.schemas.InspirationSignalType;
import java.io.IOException;

/* renamed from: X.HmE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39865HmE {
    public static CreatorDigestSignalInfoImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            InspirationSignalType inspirationSignalType = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("signal_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    inspirationSignalType = (InspirationSignalType) InspirationSignalType.A01.get(A1P);
                    if (inspirationSignalType == null) {
                        inspirationSignalType = InspirationSignalType.A0E;
                    }
                } else if (AbstractC37300Gc1.A1L(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new CreatorDigestSignalInfoImpl(inspirationSignalType, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
