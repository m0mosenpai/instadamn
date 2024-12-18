package com.instagram.debug.devoptions.api;

import X.AbstractC166997dE;
import X.C16L;
import X.C16R;
import X.C16V;
import X.C1EH;
import X.C40791um;
import X.C55702hA;

/* loaded from: classes11.dex */
public final class BundledActivityFeedExperienceResponse__JsonHelper {
    public static BundledActivityFeedExperienceResponse parseFromJson(C16L c16l) {
        return (BundledActivityFeedExperienceResponse) C16V.A01(c16l, new C1EH() { // from class: com.instagram.debug.devoptions.api.BundledActivityFeedExperienceResponse__JsonHelper.1
            @Override // X.C1EH
            public BundledActivityFeedExperienceResponse invoke(C16L c16l2) {
                return BundledActivityFeedExperienceResponse__JsonHelper.unsafeParseFromJson(c16l2);
            }

            @Override // X.C1EH
            public /* bridge */ /* synthetic */ Object invoke(C16L c16l2) {
                return BundledActivityFeedExperienceResponse__JsonHelper.unsafeParseFromJson(c16l2);
            }
        });
    }

    public static boolean processSingleField(BundledActivityFeedExperienceResponse bundledActivityFeedExperienceResponse, String str, C16L c16l) {
        String A1P;
        if ("setting".equals(str)) {
            if (c16l.A11() == C16R.A0G) {
                A1P = null;
            } else {
                A1P = c16l.A1P();
            }
            bundledActivityFeedExperienceResponse.experience = A1P;
            return true;
        }
        return C55702hA.A01(c16l, bundledActivityFeedExperienceResponse, str);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.instagram.debug.devoptions.api.BundledActivityFeedExperienceResponse, X.1um] */
    public static BundledActivityFeedExperienceResponse unsafeParseFromJson(C16L c16l) {
        ?? c40791um = new C40791um();
        if (c16l.A11() != C16R.A0D) {
            c16l.A0z();
            return null;
        }
        while (c16l.A1J() != C16R.A09) {
            processSingleField(c40791um, AbstractC166997dE.A0s(c16l), c16l);
            c16l.A0z();
        }
        return c40791um;
    }

    public static BundledActivityFeedExperienceResponse parseFromJson(String str) {
        return parseFromJson(C16V.A00(str));
    }
}
