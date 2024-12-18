package X;

import com.instagram.api.schemas.ClipsTrialDictImpl;
import com.instagram.api.schemas.MediaTrialGraduationStrategy;
import com.instagram.api.schemas.MediaTrialStatus;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* renamed from: X.Hlf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39831Hlf {
    public static ClipsTrialDictImpl parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            MediaTrialGraduationStrategy mediaTrialGraduationStrategy = null;
            Boolean bool2 = null;
            MediaTrialStatus mediaTrialStatus = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(62).equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (MSV.A00(207).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    mediaTrialGraduationStrategy = (MediaTrialGraduationStrategy) MediaTrialGraduationStrategy.A01.get(A1P2);
                    if (mediaTrialGraduationStrategy == null) {
                        mediaTrialGraduationStrategy = MediaTrialGraduationStrategy.A06;
                    }
                } else if (AbstractC111324zv.A00(1060).equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    mediaTrialStatus = (MediaTrialStatus) MediaTrialStatus.A01.get(A1P);
                    if (mediaTrialStatus == null) {
                        mediaTrialStatus = MediaTrialStatus.A06;
                    }
                }
                c16l.A0z();
            }
            return new ClipsTrialDictImpl(mediaTrialGraduationStrategy, mediaTrialStatus, bool, bool2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
