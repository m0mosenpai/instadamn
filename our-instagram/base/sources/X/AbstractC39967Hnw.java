package X;

import com.instagram.api.schemas.IABPostClickDataDictImpl;
import com.instagram.api.schemas.IABPostClickEligibleExperienceTypes;
import com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDictImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hnw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39967Hnw {
    public static IABPostClickDataDictImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            IGBWPIABPostClickDataExtensionDictImpl iGBWPIABPostClickDataExtensionDictImpl = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("buyWithPrimeIABPostClickDataExtension".equals(A0s)) {
                    iGBWPIABPostClickDataExtensionDictImpl = Ho9.parseFromJson(c16l);
                } else if ("eligibleExperienceTypes".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P = null;
                            } else {
                                A1P = c16l.A1P();
                            }
                            IABPostClickEligibleExperienceTypes iABPostClickEligibleExperienceTypes = (IABPostClickEligibleExperienceTypes) IABPostClickEligibleExperienceTypes.A01.get(A1P);
                            if (iABPostClickEligibleExperienceTypes == null) {
                                iABPostClickEligibleExperienceTypes = IABPostClickEligibleExperienceTypes.A04;
                            }
                            arrayList.add(iABPostClickEligibleExperienceTypes);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            return new IABPostClickDataDictImpl(iGBWPIABPostClickDataExtensionDictImpl, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}