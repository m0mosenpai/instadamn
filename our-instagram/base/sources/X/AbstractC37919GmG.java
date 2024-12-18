package X;

import com.instagram.api.schemas.ReelsMediaInteractivityType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.GmG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37919GmG {
    public static BVD parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            Integer num = null;
            String str2 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("display_uri".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("duration_in_ms".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("headline".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("is_eligible_for_tappable_tooltip".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("media_interactivity_types".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P = null;
                            } else {
                                A1P = c16l.A1P();
                            }
                            ReelsMediaInteractivityType reelsMediaInteractivityType = (ReelsMediaInteractivityType) ReelsMediaInteractivityType.A01.get(A1P);
                            if (reelsMediaInteractivityType == null) {
                                reelsMediaInteractivityType = ReelsMediaInteractivityType.A07;
                            }
                            arrayList.add(reelsMediaInteractivityType);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("is_eligible_for_tappable_tooltip", c16l, "ReelsTappableTooltipImpl");
                throw C00O.createAndThrow();
            }
            return new BVD(num, str, str2, arrayList, bool.booleanValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
