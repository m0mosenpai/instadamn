package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;

/* renamed from: X.4mv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC104324mv {
    public static final MonetizationEligibilityDecision A00(String str) {
        MonetizationEligibilityDecision monetizationEligibilityDecision = (MonetizationEligibilityDecision) MonetizationEligibilityDecision.A01.get(str);
        if (monetizationEligibilityDecision == null) {
            return MonetizationEligibilityDecision.A09;
        }
        return monetizationEligibilityDecision;
    }
}
