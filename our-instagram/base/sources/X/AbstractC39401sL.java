package X;

import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.1sL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39401sL {
    public static C39411sM parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C38714H3b c38714H3b = null;
            C38715H3c c38715H3c = null;
            ArrayList arrayList = null;
            C38716H3d c38716H3d = null;
            ArrayList arrayList2 = null;
            Long l = null;
            C38720H3i c38720H3i = null;
            C38722H3k c38722H3k = null;
            AnonymousClass535 anonymousClass535 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("buyWithIntegrationIABPostClickDataExtension".equals(A0q)) {
                    c38714H3b = AbstractC87613vT.parseFromJson(c16l);
                } else if ("buyWithPrimeIABPostClickDataExtension".equals(A0q)) {
                    c38715H3c = AbstractC87623vU.parseFromJson(c16l);
                } else if ("eligibleExperienceTypes".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P = null;
                            } else {
                                A1P = c16l.A1P();
                            }
                            IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes = (IGPostClickEligibleExperienceTypes) IGPostClickEligibleExperienceTypes.A01.get(A1P);
                            if (iGPostClickEligibleExperienceTypes == null) {
                                iGPostClickEligibleExperienceTypes = IGPostClickEligibleExperienceTypes.A0D;
                            }
                            arrayList.add(iGPostClickEligibleExperienceTypes);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("iabAutofillAdsPersonalizationPostClickDataExtension".equals(A0q)) {
                    c38716H3d = AbstractC87663vY.parseFromJson(c16l);
                } else if ("iabPostClickDisclaimers".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            H3e parseFromJson = AbstractC39979HoH.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("impressionTime".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("metaCheckoutIABPostClickDataExtension".equals(A0q)) {
                    c38720H3i = AbstractC87633vV.parseFromJson(c16l);
                } else if ("metaPaymentsSDKIABPostClickDataExtension".equals(A0q)) {
                    c38722H3k = AbstractC87643vW.parseFromJson(c16l);
                } else if ("promoAdsAutofillPostClickDataExtension".equals(A0q)) {
                    anonymousClass535 = AbstractC87653vX.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C39411sM(c38714H3b, c38715H3c, c38716H3d, c38720H3i, c38722H3k, anonymousClass535, l, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
