package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.GdR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37385GdR {
    public static Map A00(InterfaceC84683qH interfaceC84683qH) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC84683qH.AdC() != null) {
            A1I.put("attribution", interfaceC84683qH.AdC());
        }
        if (interfaceC84683qH.AdO() != null) {
            A1I.put("attribution_url", interfaceC84683qH.AdO());
        }
        if (interfaceC84683qH.getClipsCreationEntryPoint() != null) {
            A1I.put("clips_creation_entry_point", interfaceC84683qH.getClipsCreationEntryPoint());
        }
        if (interfaceC84683qH.AvN() != null) {
            A1I.put("custom_text_color", interfaceC84683qH.AvN());
        }
        if (interfaceC84683qH.Ayd() != null) {
            A1I.put("display_type", interfaceC84683qH.Ayd());
        }
        if (interfaceC84683qH.B29() != null) {
            AbstractC37303Gc4.A1N(interfaceC84683qH.B29(), A1I);
        }
        if (interfaceC84683qH.BBh() != null) {
            A1I.put(AbstractC111324zv.A00(4535), interfaceC84683qH.BBh());
        }
        if (interfaceC84683qH.BDR() != null) {
            AbstractC37303Gc4.A1L(interfaceC84683qH.BDR(), A1I);
        }
        if (interfaceC84683qH.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC84683qH.getId(), A1I);
        }
        if (interfaceC84683qH.CUY() != null) {
            A1I.put("is_fb_sticker", interfaceC84683qH.CUY());
        }
        if (interfaceC84683qH.CVk() != null) {
            A1I.put("is_hidden", interfaceC84683qH.CVk());
        }
        if (interfaceC84683qH.CaJ() != null) {
            A1I.put("is_pinned", interfaceC84683qH.CaJ());
        }
        if (interfaceC84683qH.Cdh() != null) {
            A1I.put("is_sticker", interfaceC84683qH.Cdh());
        }
        if (interfaceC84683qH.BQW() != null) {
            A1I.put("media_code", interfaceC84683qH.BQW());
        }
        if (interfaceC84683qH.BQY() != null) {
            A1I.put("media_compound_str", interfaceC84683qH.BQY());
        }
        if (interfaceC84683qH.getMediaId() != null) {
            AbstractC37300Gc1.A18(interfaceC84683qH.getMediaId(), A1I);
        }
        if (interfaceC84683qH.getMediaType() != null) {
            AbstractC37300Gc1.A19(interfaceC84683qH.getMediaType(), A1I);
        }
        if (interfaceC84683qH.getProductType() != null) {
            A1I.put("product_type", interfaceC84683qH.getProductType());
        }
        if (interfaceC84683qH.Bpa() != null) {
            AbstractC37303Gc4.A1M(interfaceC84683qH.Bpa(), A1I);
        }
        if (interfaceC84683qH.Bvz() != null) {
            A1I.put(AbstractC111324zv.A00(5361), interfaceC84683qH.Bvz());
        }
        if (interfaceC84683qH.Bzq() != null) {
            AbstractC37303Gc4.A1O(interfaceC84683qH.Bzq(), A1I);
        }
        if (interfaceC84683qH.C0i() != null) {
            A1I.put("sticker_style_enum", interfaceC84683qH.C0i());
        }
        String str = null;
        if (interfaceC84683qH.C3Y() != null) {
            SubscriptionStickerDictIntf C3Y = interfaceC84683qH.C3Y();
            if (C3Y != null) {
                treeUpdaterJNI = C3Y.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("subscription_sticker", treeUpdaterJNI);
        }
        if (interfaceC84683qH.C4I() != null) {
            StickerTraySurface C4I = interfaceC84683qH.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            A1I.put("surface", str);
        }
        if (interfaceC84683qH.CHf() != null) {
            AbstractC37303Gc4.A1K(interfaceC84683qH.CHf(), A1I);
        }
        if (interfaceC84683qH.CI1() != null) {
            AbstractC37302Gc3.A1V(interfaceC84683qH.CI1(), A1I);
        }
        if (interfaceC84683qH.CIa() != null) {
            AbstractC37303Gc4.A1I(interfaceC84683qH.CIa(), A1I);
        }
        if (interfaceC84683qH.CIh() != null) {
            AbstractC37303Gc4.A1J(interfaceC84683qH.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
