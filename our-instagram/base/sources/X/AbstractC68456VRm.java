package X;

import com.instagram.business.promote.model.SpecialRequirementCategory;

/* renamed from: X.VRm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68456VRm {
    public static final SpecialRequirementCategory A00(String str) {
        C14360o3.A0B(str, 0);
        for (SpecialRequirementCategory specialRequirementCategory : SpecialRequirementCategory.values()) {
            if (C14360o3.A0K(specialRequirementCategory.A01, str)) {
                return specialRequirementCategory;
            }
        }
        return SpecialRequirementCategory.A07;
    }
}
