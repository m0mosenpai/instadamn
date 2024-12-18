package X;

import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.business.promote.model.AudienceGender;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.AudienceInterest;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Vxh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69916Vxh {
    /* JADX WARN: Type inference failed for: r0v2, types: [com.instagram.business.promote.model.PromoteAudienceInfo, X.1um, X.1ul] */
    public static PromoteAudienceInfo parseFromJson(C16L c16l) {
        AudienceGender audienceGender;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("audience_id".equals(A0s)) {
                    c40791um.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("display_name".equals(A0s)) {
                    c40791um.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("min_age".equals(A0s)) {
                    c40791um.A01 = c16l.A1D();
                } else if ("max_age".equals(A0s)) {
                    c40791um.A00 = c16l.A1D();
                } else if ("genders".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            String A1Q = c16l.A1Q();
                            C14360o3.A0B(A1Q, 0);
                            AudienceGender[] values = AudienceGender.values();
                            int length = values.length;
                            int i = 0;
                            while (true) {
                                if (i < length) {
                                    audienceGender = values[i];
                                    if (!C14360o3.A0K(audienceGender.A00, A1Q)) {
                                        i++;
                                    }
                                } else {
                                    audienceGender = AudienceGender.A04;
                                    break;
                                }
                            }
                            arrayList.add(audienceGender);
                        }
                    }
                    c40791um.A06 = arrayList;
                } else if ("geo_locations".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AudienceGeoLocation parseFromJson = VRY.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A07 = arrayList;
                } else if ("interests".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AudienceInterest parseFromJson2 = VRZ.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    c40791um.A08 = arrayList;
                } else if ("target_relax_option".equals(A0s)) {
                    TargetingRelaxationConstants targetingRelaxationConstants = (TargetingRelaxationConstants) TargetingRelaxationConstants.A01.get(AbstractC167017dG.A0m(c16l));
                    if (targetingRelaxationConstants == null) {
                        targetingRelaxationConstants = TargetingRelaxationConstants.A06;
                    }
                    c40791um.A03 = targetingRelaxationConstants;
                } else if ("advantage_audience".equals(A0s)) {
                    c40791um.A02 = AbstractC68364VNy.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
