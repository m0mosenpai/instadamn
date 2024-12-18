package X;

import com.instagram.api.schemas.IGClickToMessagingCardTypeEnum;
import java.io.IOException;

/* renamed from: X.Eur, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33703Eur {
    public static E7s parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            IGClickToMessagingCardTypeEnum iGClickToMessagingCardTypeEnum = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("cardType".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGClickToMessagingCardTypeEnum = (IGClickToMessagingCardTypeEnum) IGClickToMessagingCardTypeEnum.A01.get(A1P);
                    if (iGClickToMessagingCardTypeEnum == null) {
                        iGClickToMessagingCardTypeEnum = IGClickToMessagingCardTypeEnum.A06;
                    }
                } else if ("icebreakerDisclaimerText".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new E7s(iGClickToMessagingCardTypeEnum, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
