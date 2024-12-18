package X;

import com.instagram.api.schemas.TIFUAppDestinationEnum;
import java.io.IOException;

/* renamed from: X.4dH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC99444dH {
    public static C99454dJ parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            TIFUAppDestinationEnum tIFUAppDestinationEnum = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("landing_site".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    tIFUAppDestinationEnum = (TIFUAppDestinationEnum) TIFUAppDestinationEnum.A01.get(A1P);
                    if (tIFUAppDestinationEnum == null) {
                        tIFUAppDestinationEnum = TIFUAppDestinationEnum.A07;
                    }
                } else if ("url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C99454dJ(tIFUAppDestinationEnum, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
