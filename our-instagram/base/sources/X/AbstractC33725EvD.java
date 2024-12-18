package X;

import com.instagram.api.schemas.MidCardReelsChainCtaType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.EvD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33725EvD {
    public static C26142BhT parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ArrayList arrayList = null;
            MidCardReelsChainCtaType midCardReelsChainCtaType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("chain_primary_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("chain_secondary_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("prioritized_media_ids".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("reels_viewer_cta_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    midCardReelsChainCtaType = (MidCardReelsChainCtaType) MidCardReelsChainCtaType.A01.get(A1P);
                    if (midCardReelsChainCtaType == null) {
                        midCardReelsChainCtaType = MidCardReelsChainCtaType.A05;
                    }
                }
                c16l.A0z();
            }
            return new C26142BhT(midCardReelsChainCtaType, str, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
