package X;

import com.instagram.api.schemas.IGAdsRrFormatEnum;
import java.io.IOException;

/* renamed from: X.VVb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68548VVb {
    public static C105364p0 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            UQx uQx = null;
            C66644URi c66644URi = null;
            IGAdsRrFormatEnum iGAdsRrFormatEnum = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(851).equals(A0s)) {
                    uQx = VOU.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(1189).equals(A0s)) {
                    c66644URi = AbstractC68550VVd.parseFromJson(c16l);
                } else if ("rr_format".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGAdsRrFormatEnum = (IGAdsRrFormatEnum) IGAdsRrFormatEnum.A01.get(A1P);
                    if (iGAdsRrFormatEnum == null) {
                        iGAdsRrFormatEnum = IGAdsRrFormatEnum.A06;
                    }
                }
                c16l.A0z();
            }
            return new C105364p0(uQx, iGAdsRrFormatEnum, c66644URi);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
