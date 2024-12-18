package X;

import com.instagram.api.schemas.InstagramProfileCallToActionDestinations;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VOu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68386VOu {
    public static C50627MWo parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("eligible_ctas".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P2 = null;
                            } else {
                                A1P2 = c16l.A1P();
                            }
                            InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations = (InstagramProfileCallToActionDestinations) InstagramProfileCallToActionDestinations.A01.get(A1P2);
                            if (instagramProfileCallToActionDestinations == null) {
                                instagramProfileCallToActionDestinations = InstagramProfileCallToActionDestinations.A09;
                            }
                            arrayList.add(instagramProfileCallToActionDestinations);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("enabled_ctas".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P = null;
                            } else {
                                A1P = c16l.A1P();
                            }
                            InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations2 = (InstagramProfileCallToActionDestinations) InstagramProfileCallToActionDestinations.A01.get(A1P);
                            if (instagramProfileCallToActionDestinations2 == null) {
                                instagramProfileCallToActionDestinations2 = InstagramProfileCallToActionDestinations.A09;
                            }
                            arrayList2.add(instagramProfileCallToActionDestinations2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("eligible_ctas", c16l, "ProfileSecondaryCallToActionInfo");
            } else if (arrayList2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("enabled_ctas", c16l, "ProfileSecondaryCallToActionInfo");
            } else {
                return new C50627MWo(arrayList, arrayList2, 15);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
