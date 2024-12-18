package X;

import com.instagram.api.schemas.AdsTargetingGender;
import com.instagram.api.schemas.AudienceValidationResponse;
import com.instagram.api.schemas.BoostedPostAudienceOption;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.business.promote.model.PromoteAudience;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VRd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68447VRd {
    public static PromoteAudience parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            PromoteAudience promoteAudience = new PromoteAudience();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("audience_id".equals(A0s)) {
                    promoteAudience.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("display_name".equals(A0s)) {
                    promoteAudience.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("target_spec_string".equals(A0s)) {
                    promoteAudience.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("audience_code".equals(A0s)) {
                    BoostedPostAudienceOption boostedPostAudienceOption = (BoostedPostAudienceOption) BoostedPostAudienceOption.A01.get(AbstractC167017dG.A0m(c16l));
                    if (boostedPostAudienceOption == null) {
                        boostedPostAudienceOption = BoostedPostAudienceOption.A0g;
                    }
                    promoteAudience.A03 = boostedPostAudienceOption;
                } else if ("min_age".equals(A0s)) {
                    promoteAudience.A01 = c16l.A1D();
                } else if ("max_age".equals(A0s)) {
                    promoteAudience.A00 = c16l.A1D();
                } else if ("genders".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        ArrayList arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P = null;
                            } else {
                                A1P = c16l.A1P();
                            }
                            AdsTargetingGender adsTargetingGender = (AdsTargetingGender) AdsTargetingGender.A01.get(A1P);
                            if (adsTargetingGender == null) {
                                adsTargetingGender = AdsTargetingGender.A07;
                            }
                            arrayList2.add(adsTargetingGender);
                        }
                        arrayList = arrayList2;
                    }
                    C14360o3.A0B(arrayList, 0);
                    promoteAudience.A08 = arrayList;
                } else if ("geo_locations".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    promoteAudience.A09 = arrayList;
                } else if ("interests".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    promoteAudience.A0A = arrayList;
                } else if ("target_relax_option".equals(A0s)) {
                    TargetingRelaxationConstants targetingRelaxationConstants = (TargetingRelaxationConstants) TargetingRelaxationConstants.A01.get(AbstractC167017dG.A0m(c16l));
                    if (targetingRelaxationConstants == null) {
                        targetingRelaxationConstants = TargetingRelaxationConstants.A06;
                    }
                    promoteAudience.A04 = targetingRelaxationConstants;
                } else if ("validation_responses".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AudienceValidationResponse parseFromJson = AbstractC39751HkN.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    promoteAudience.A0B = arrayList;
                } else if (AbstractC111324zv.A00(3186).equals(A0s)) {
                    promoteAudience.A0C = c16l.A0d();
                } else if ("subject_to_taiwan_finserv".equals(A0s)) {
                    promoteAudience.A0D = c16l.A0d();
                } else if ("advantage_audience".equals(A0s)) {
                    promoteAudience.A02 = AbstractC68364VNy.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return promoteAudience;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
