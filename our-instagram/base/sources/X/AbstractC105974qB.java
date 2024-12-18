package X;

import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import java.io.IOException;

/* renamed from: X.4qB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC105974qB {
    public static C105984qC parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("label".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("placement".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGAdTransparencyDisclaimerPlacement = (IGAdTransparencyDisclaimerPlacement) IGAdTransparencyDisclaimerPlacement.A01.get(A1P);
                    if (iGAdTransparencyDisclaimerPlacement == null) {
                        iGAdTransparencyDisclaimerPlacement = IGAdTransparencyDisclaimerPlacement.A07;
                    }
                }
                c16l.A0z();
            }
            return new C105984qC(iGAdTransparencyDisclaimerPlacement, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
