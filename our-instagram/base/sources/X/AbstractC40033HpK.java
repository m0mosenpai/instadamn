package X;

import com.instagram.api.schemas.IntentAwareAdsFormatInfoImpl;
import com.instagram.api.schemas.IntentAwareAdsFormatType;
import java.io.IOException;

/* renamed from: X.HpK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40033HpK {
    public static IntentAwareAdsFormatInfoImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            IntentAwareAdsFormatType intentAwareAdsFormatType = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("format".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    intentAwareAdsFormatType = (IntentAwareAdsFormatType) IntentAwareAdsFormatType.A01.get(A1P);
                    if (intentAwareAdsFormatType == null) {
                        intentAwareAdsFormatType = IntentAwareAdsFormatType.A0C;
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new IntentAwareAdsFormatInfoImpl(intentAwareAdsFormatType, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
