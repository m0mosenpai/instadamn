package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.model.venue.LocationDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I0N {
    public static Map A00(InterfaceC1123955r interfaceC1123955r) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC1123955r.AdC() != null) {
            A1I.put("attribution", interfaceC1123955r.AdC());
        }
        if (interfaceC1123955r.AdO() != null) {
            A1I.put("attribution_url", interfaceC1123955r.AdO());
        }
        if (interfaceC1123955r.AvN() != null) {
            A1I.put("custom_text_color", interfaceC1123955r.AvN());
        }
        if (interfaceC1123955r.Ayd() != null) {
            A1I.put("display_type", interfaceC1123955r.Ayd());
        }
        if (interfaceC1123955r.B29() != null) {
            AbstractC37303Gc4.A1N(interfaceC1123955r.B29(), A1I);
        }
        String str = null;
        if (interfaceC1123955r.BAp() != null) {
            InterfaceC1124155t BAp = interfaceC1123955r.BAp();
            if (BAp != null) {
                treeUpdaterJNI3 = BAp.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put(AbstractC111324zv.A00(4525), treeUpdaterJNI3);
        }
        if (interfaceC1123955r.BDR() != null) {
            AbstractC37303Gc4.A1L(interfaceC1123955r.BDR(), A1I);
        }
        if (interfaceC1123955r.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC1123955r.getId(), A1I);
        }
        if (interfaceC1123955r.CUY() != null) {
            A1I.put("is_fb_sticker", interfaceC1123955r.CUY());
        }
        if (interfaceC1123955r.CVk() != null) {
            A1I.put("is_hidden", interfaceC1123955r.CVk());
        }
        if (interfaceC1123955r.CaJ() != null) {
            A1I.put("is_pinned", interfaceC1123955r.CaJ());
        }
        if (interfaceC1123955r.Cdh() != null) {
            A1I.put("is_sticker", interfaceC1123955r.Cdh());
        }
        if (interfaceC1123955r.BOL() != null) {
            LocationDictIntf BOL = interfaceC1123955r.BOL();
            if (BOL != null) {
                treeUpdaterJNI2 = BOL.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("location", treeUpdaterJNI2);
        }
        if (interfaceC1123955r.getMediaType() != null) {
            AbstractC37300Gc1.A19(interfaceC1123955r.getMediaType(), A1I);
        }
        if (interfaceC1123955r.Bpa() != null) {
            AbstractC37303Gc4.A1M(interfaceC1123955r.Bpa(), A1I);
        }
        if (interfaceC1123955r.Bzq() != null) {
            AbstractC37303Gc4.A1O(interfaceC1123955r.Bzq(), A1I);
        }
        if (interfaceC1123955r.C0i() != null) {
            A1I.put("sticker_style_enum", interfaceC1123955r.C0i());
        }
        if (interfaceC1123955r.C3Y() != null) {
            SubscriptionStickerDictIntf C3Y = interfaceC1123955r.C3Y();
            if (C3Y != null) {
                treeUpdaterJNI = C3Y.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("subscription_sticker", treeUpdaterJNI);
        }
        if (interfaceC1123955r.C4I() != null) {
            StickerTraySurface C4I = interfaceC1123955r.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            A1I.put("surface", str);
        }
        if (interfaceC1123955r.CHf() != null) {
            AbstractC37303Gc4.A1K(interfaceC1123955r.CHf(), A1I);
        }
        if (interfaceC1123955r.CI1() != null) {
            AbstractC37302Gc3.A1V(interfaceC1123955r.CI1(), A1I);
        }
        if (interfaceC1123955r.CIa() != null) {
            AbstractC37303Gc4.A1I(interfaceC1123955r.CIa(), A1I);
        }
        if (interfaceC1123955r.CIh() != null) {
            AbstractC37303Gc4.A1J(interfaceC1123955r.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
