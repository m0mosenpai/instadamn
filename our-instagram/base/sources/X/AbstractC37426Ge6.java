package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ge6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37426Ge6 {
    public static Map A00(C4GI c4gi) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c4gi.B8F() != null) {
            A1I.put("formatted_mashups_count", c4gi.B8F());
        }
        if (c4gi.CXM() != null) {
            A1I.put("is_light_weight_check", c4gi.CXM());
        }
        c4gi.isPivotPageAvailable();
        A1I.put("is_pivot_page_available", Boolean.valueOf(c4gi.isPivotPageAvailable()));
        if (c4gi.BPj() != null) {
            A1I.put("mashups_allowed", c4gi.BPj());
        }
        if (c4gi.getMediaType() != null) {
            AbstractC37300Gc1.A19(c4gi.getMediaType(), A1I);
        }
        if (c4gi.BXE() != null) {
            A1I.put("non_privacy_filtered_mashups_media_count", c4gi.BXE());
        }
        if (c4gi.getPk() != null) {
            A1I.put("pk", c4gi.getPk());
        }
        if (c4gi.Bgd() != null) {
            A1I.put("privacy_filtered_mashups_media_count", c4gi.Bgd());
        }
        if (c4gi.getProductType() != null) {
            A1I.put("product_type", c4gi.getProductType());
        }
        if (c4gi.BxC() != null) {
            A1I.put(AbstractC111324zv.A00(5371), c4gi.BxC());
        }
        if (c4gi.CDj() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, c4gi.CDj().A07());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
