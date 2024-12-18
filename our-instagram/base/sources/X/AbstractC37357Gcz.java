package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.AdditionalCandidates;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gcz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37357Gcz {
    public static Map A00(AdditionalCandidates additionalCandidates) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (additionalCandidates.B6a() != null) {
            ExtendedImageUrl B6a = additionalCandidates.B6a();
            if (B6a != null) {
                treeUpdaterJNI2 = B6a.A00();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("first_frame", treeUpdaterJNI2);
        }
        if (additionalCandidates.BGL() != null) {
            ExtendedImageUrl BGL = additionalCandidates.BGL();
            if (BGL != null) {
                treeUpdaterJNI = BGL.A00();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("igtv_first_frame", treeUpdaterJNI);
        }
        if (additionalCandidates.Bxr() != null) {
            ExtendedImageUrl Bxr = additionalCandidates.Bxr();
            if (Bxr != null) {
                treeUpdaterJNI3 = Bxr.A00();
            }
            A1I.put("smart_frame", treeUpdaterJNI3);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
