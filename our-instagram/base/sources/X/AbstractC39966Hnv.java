package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IABPostClickDataDict;
import com.instagram.api.schemas.IABPostClickEligibleExperienceTypes;
import com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hnv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39966Hnv {
    public static Map A00(IABPostClickDataDict iABPostClickDataDict) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList = null;
        if (iABPostClickDataDict.AjM() != null) {
            IGBWPIABPostClickDataExtensionDict AjM = iABPostClickDataDict.AjM();
            if (AjM != null) {
                treeUpdaterJNI = AjM.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("buyWithPrimeIABPostClickDataExtension", treeUpdaterJNI);
        }
        if (iABPostClickDataDict.B15() != null) {
            List<IABPostClickEligibleExperienceTypes> B15 = iABPostClickDataDict.B15();
            if (B15 != null) {
                arrayList = AbstractC167017dG.A0q(B15);
                for (IABPostClickEligibleExperienceTypes iABPostClickEligibleExperienceTypes : B15) {
                    C14360o3.A0B(iABPostClickEligibleExperienceTypes, 0);
                    arrayList.add(iABPostClickEligibleExperienceTypes.A00);
                }
            }
            A1I.put("eligibleExperienceTypes", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
