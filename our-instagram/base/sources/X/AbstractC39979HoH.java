package X;

import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HoH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39979HoH {
    public static H3e parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("disclaimerBodyRanges".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38717H3f parseFromJson = HoJ.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("disclaimerText".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("eligibleExperienceType".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGPostClickEligibleExperienceTypes = (IGPostClickEligibleExperienceTypes) IGPostClickEligibleExperienceTypes.A01.get(A1P);
                    if (iGPostClickEligibleExperienceTypes == null) {
                        iGPostClickEligibleExperienceTypes = IGPostClickEligibleExperienceTypes.A0D;
                    }
                }
                c16l.A0z();
            }
            return new H3e(iGPostClickEligibleExperienceTypes, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
