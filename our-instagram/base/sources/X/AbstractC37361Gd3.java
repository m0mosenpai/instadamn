package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.music.common.model.MusicOverlayStickerModelIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gd3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37361Gd3 {
    public static Map A00(C4A3 c4a3) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c4a3.AdC() != null) {
            A1I.put("attribution", c4a3.AdC());
        }
        if (c4a3.AdO() != null) {
            A1I.put("attribution_url", c4a3.AdO());
        }
        if (c4a3.AvN() != null) {
            A1I.put("custom_text_color", c4a3.AvN());
        }
        if (c4a3.Ayd() != null) {
            A1I.put("display_type", c4a3.Ayd());
        }
        if (c4a3.B29() != null) {
            AbstractC37303Gc4.A1N(c4a3.B29(), A1I);
        }
        if (c4a3.BDR() != null) {
            AbstractC37303Gc4.A1L(c4a3.BDR(), A1I);
        }
        if (c4a3.getId() != null) {
            AbstractC37300Gc1.A12(c4a3.getId(), A1I);
        }
        if (c4a3.CUY() != null) {
            A1I.put("is_fb_sticker", c4a3.CUY());
        }
        if (c4a3.CVk() != null) {
            A1I.put("is_hidden", c4a3.CVk());
        }
        if (c4a3.CaJ() != null) {
            A1I.put("is_pinned", c4a3.CaJ());
        }
        if (c4a3.Cdh() != null) {
            A1I.put("is_sticker", c4a3.Cdh());
        }
        if (c4a3.getMediaType() != null) {
            AbstractC37300Gc1.A19(c4a3.getMediaType(), A1I);
        }
        String str = null;
        if (c4a3.BVW() != null) {
            MusicOverlayStickerModelIntf BVW = c4a3.BVW();
            if (BVW != null) {
                treeUpdaterJNI3 = BVW.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put("music_asset_info", treeUpdaterJNI3);
        }
        if (c4a3.BZw() != null) {
            OriginalSoundDataIntf BZw = c4a3.BZw();
            if (BZw != null) {
                treeUpdaterJNI2 = BZw.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("original_sound_info", treeUpdaterJNI2);
        }
        if (c4a3.Bpa() != null) {
            AbstractC37303Gc4.A1M(c4a3.Bpa(), A1I);
        }
        if (c4a3.Bzq() != null) {
            AbstractC37303Gc4.A1O(c4a3.Bzq(), A1I);
        }
        if (c4a3.C0i() != null) {
            A1I.put("sticker_style_enum", c4a3.C0i());
        }
        if (c4a3.C3Y() != null) {
            SubscriptionStickerDictIntf C3Y = c4a3.C3Y();
            if (C3Y != null) {
                treeUpdaterJNI = C3Y.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("subscription_sticker", treeUpdaterJNI);
        }
        if (c4a3.C4I() != null) {
            StickerTraySurface C4I = c4a3.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            A1I.put("surface", str);
        }
        if (c4a3.CHf() != null) {
            AbstractC37303Gc4.A1K(c4a3.CHf(), A1I);
        }
        if (c4a3.CI1() != null) {
            AbstractC37302Gc3.A1V(c4a3.CI1(), A1I);
        }
        if (c4a3.CIa() != null) {
            AbstractC37303Gc4.A1I(c4a3.CIa(), A1I);
        }
        if (c4a3.CIh() != null) {
            AbstractC37303Gc4.A1J(c4a3.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
