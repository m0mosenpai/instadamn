package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Htv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40291Htv {
    public static Map A00(C5KP c5kp) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c5kp.AdC() != null) {
            A1I.put("attribution", c5kp.AdC());
        }
        if (c5kp.AdO() != null) {
            A1I.put("attribution_url", c5kp.AdO());
        }
        if (c5kp.AvN() != null) {
            A1I.put("custom_text_color", c5kp.AvN());
        }
        if (c5kp.AvP() != null) {
            A1I.put(AbstractC111324zv.A00(4235), c5kp.AvP());
        }
        if (c5kp.Ayd() != null) {
            A1I.put("display_type", c5kp.Ayd());
        }
        if (c5kp.B29() != null) {
            AbstractC37303Gc4.A1N(c5kp.B29(), A1I);
        }
        String str = null;
        if (c5kp.BD3() != null) {
            C5KN BD3 = c5kp.BD3();
            if (BD3 != null) {
                treeUpdaterJNI2 = BD3.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("hashtag", treeUpdaterJNI2);
        }
        if (c5kp.BDR() != null) {
            AbstractC37303Gc4.A1L(c5kp.BDR(), A1I);
        }
        if (c5kp.getId() != null) {
            AbstractC37300Gc1.A12(c5kp.getId(), A1I);
        }
        if (c5kp.CUY() != null) {
            A1I.put("is_fb_sticker", c5kp.CUY());
        }
        if (c5kp.CVk() != null) {
            A1I.put("is_hidden", c5kp.CVk());
        }
        if (c5kp.CaJ() != null) {
            A1I.put("is_pinned", c5kp.CaJ());
        }
        if (c5kp.Cdh() != null) {
            A1I.put("is_sticker", c5kp.Cdh());
        }
        if (c5kp.getMediaType() != null) {
            AbstractC37300Gc1.A19(c5kp.getMediaType(), A1I);
        }
        if (c5kp.Bpa() != null) {
            AbstractC37303Gc4.A1M(c5kp.Bpa(), A1I);
        }
        if (c5kp.Bzq() != null) {
            AbstractC37303Gc4.A1O(c5kp.Bzq(), A1I);
        }
        if (c5kp.C0i() != null) {
            A1I.put("sticker_style_enum", c5kp.C0i());
        }
        if (c5kp.C3Y() != null) {
            SubscriptionStickerDictIntf C3Y = c5kp.C3Y();
            if (C3Y != null) {
                treeUpdaterJNI = C3Y.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("subscription_sticker", treeUpdaterJNI);
        }
        if (c5kp.C4I() != null) {
            StickerTraySurface C4I = c5kp.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            A1I.put("surface", str);
        }
        if (c5kp.C50() != null) {
            A1I.put("tag_name", c5kp.C50());
        }
        if (c5kp.CHf() != null) {
            AbstractC37303Gc4.A1K(c5kp.CHf(), A1I);
        }
        if (c5kp.CI1() != null) {
            AbstractC37302Gc3.A1V(c5kp.CI1(), A1I);
        }
        if (c5kp.CIa() != null) {
            AbstractC37303Gc4.A1I(c5kp.CIa(), A1I);
        }
        if (c5kp.CIh() != null) {
            AbstractC37303Gc4.A1J(c5kp.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
