package X;

import com.instagram.api.schemas.BwPIconOverlayType;
import com.instagram.api.schemas.BwPPostClickLandingExperineceType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hkz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39789Hkz {
    public static H2V parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            BwPPostClickLandingExperineceType bwPPostClickLandingExperineceType = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("formatted_price".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("icon_overlays".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P2 = null;
                            } else {
                                A1P2 = c16l.A1P();
                            }
                            BwPIconOverlayType bwPIconOverlayType = (BwPIconOverlayType) BwPIconOverlayType.A01.get(A1P2);
                            if (bwPIconOverlayType == null) {
                                bwPIconOverlayType = BwPIconOverlayType.A05;
                            }
                            arrayList.add(bwPIconOverlayType);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("post_click_landing_experience".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    bwPPostClickLandingExperineceType = (BwPPostClickLandingExperineceType) BwPPostClickLandingExperineceType.A01.get(A1P);
                    if (bwPPostClickLandingExperineceType == null) {
                        bwPPostClickLandingExperineceType = BwPPostClickLandingExperineceType.A08;
                    }
                } else if ("post_click_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("primary_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("secondary_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new H2V(bwPPostClickLandingExperineceType, str, str2, str3, str4, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
