package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.BusinessProfileDict;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.api.schemas.SMBSupportStickerDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hsl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40222Hsl {
    public static Map A00(SMBSupportStickerDictIntf sMBSupportStickerDictIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str = null;
        if (sMBSupportStickerDictIntf.Air() != null) {
            BusinessProfileDict Air = sMBSupportStickerDictIntf.Air();
            if (Air != null) {
                treeUpdaterJNI = Air.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("business_profile", treeUpdaterJNI);
        }
        if (sMBSupportStickerDictIntf.Aj7() != null) {
            A1I.put("button_text", sMBSupportStickerDictIntf.Aj7());
        }
        if (sMBSupportStickerDictIntf.Aj8() != null) {
            A1I.put("button_text_color", sMBSupportStickerDictIntf.Aj8());
        }
        if (sMBSupportStickerDictIntf.getCtaTitle() != null) {
            A1I.put("cta_title", sMBSupportStickerDictIntf.getCtaTitle());
        }
        if (sMBSupportStickerDictIntf.Att() != null) {
            A1I.put("cta_url", sMBSupportStickerDictIntf.Att());
        }
        if (sMBSupportStickerDictIntf.AyB() != null) {
            A1I.put("disclaimer", sMBSupportStickerDictIntf.AyB());
        }
        if (sMBSupportStickerDictIntf.getEndBackgroundColor() != null) {
            A1I.put("end_background_color", sMBSupportStickerDictIntf.getEndBackgroundColor());
        }
        if (sMBSupportStickerDictIntf.BZz() != null) {
            A1I.put(AbstractC111324zv.A00(130), AbstractC166997dE.A0f(sMBSupportStickerDictIntf.BZz()));
        }
        if (sMBSupportStickerDictIntf.Bba() != null) {
            A1I.put("partner_name", sMBSupportStickerDictIntf.Bba());
        }
        if (sMBSupportStickerDictIntf.getPk() != null) {
            A1I.put("pk", sMBSupportStickerDictIntf.getPk());
        }
        if (sMBSupportStickerDictIntf.Btk() != null) {
            SMBPartnerType Btk = sMBSupportStickerDictIntf.Btk();
            if (Btk != null) {
                str = Btk.A00;
            }
            A1I.put("service_type", str);
        }
        if (sMBSupportStickerDictIntf.getStartBackgroundColor() != null) {
            A1I.put("start_background_color", sMBSupportStickerDictIntf.getStartBackgroundColor());
        }
        if (sMBSupportStickerDictIntf.C3f() != null) {
            A1I.put("subtitle_color", sMBSupportStickerDictIntf.C3f());
        }
        if (sMBSupportStickerDictIntf.getTitle() != null) {
            AbstractC37300Gc1.A17(sMBSupportStickerDictIntf.getTitle(), A1I);
        }
        if (sMBSupportStickerDictIntf.C8x() != null) {
            A1I.put("title_color", sMBSupportStickerDictIntf.C8x());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
