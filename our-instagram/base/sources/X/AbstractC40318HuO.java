package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HuO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40318HuO {
    public static Map A00(InterfaceC106104qQ interfaceC106104qQ) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC106104qQ.AdC() != null) {
            A1I.put("attribution", interfaceC106104qQ.AdC());
        }
        if (interfaceC106104qQ.AdO() != null) {
            A1I.put("attribution_url", interfaceC106104qQ.AdO());
        }
        if (interfaceC106104qQ.AvN() != null) {
            A1I.put("custom_text_color", interfaceC106104qQ.AvN());
        }
        if (interfaceC106104qQ.Ayd() != null) {
            A1I.put("display_type", interfaceC106104qQ.Ayd());
        }
        if (interfaceC106104qQ.B29() != null) {
            AbstractC37303Gc4.A1N(interfaceC106104qQ.B29(), A1I);
        }
        if (interfaceC106104qQ.BDR() != null) {
            AbstractC37303Gc4.A1L(interfaceC106104qQ.BDR(), A1I);
        }
        if (interfaceC106104qQ.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC106104qQ.getId(), A1I);
        }
        if (interfaceC106104qQ.CUY() != null) {
            A1I.put("is_fb_sticker", interfaceC106104qQ.CUY());
        }
        if (interfaceC106104qQ.CVk() != null) {
            A1I.put("is_hidden", interfaceC106104qQ.CVk());
        }
        if (interfaceC106104qQ.CaJ() != null) {
            A1I.put("is_pinned", interfaceC106104qQ.CaJ());
        }
        if (interfaceC106104qQ.Cdh() != null) {
            A1I.put("is_sticker", interfaceC106104qQ.Cdh());
        }
        if (interfaceC106104qQ.getMediaType() != null) {
            AbstractC37300Gc1.A19(interfaceC106104qQ.getMediaType(), A1I);
        }
        String str = null;
        if (interfaceC106104qQ.Bki() != null) {
            InterfaceC106084qO Bki = interfaceC106104qQ.Bki();
            if (Bki != null) {
                treeUpdaterJNI2 = Bki.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("reaction_sticker", treeUpdaterJNI2);
        }
        if (interfaceC106104qQ.Bpa() != null) {
            AbstractC37303Gc4.A1M(interfaceC106104qQ.Bpa(), A1I);
        }
        if (interfaceC106104qQ.Bzq() != null) {
            AbstractC37303Gc4.A1O(interfaceC106104qQ.Bzq(), A1I);
        }
        if (interfaceC106104qQ.C0i() != null) {
            A1I.put("sticker_style_enum", interfaceC106104qQ.C0i());
        }
        if (interfaceC106104qQ.C3Y() != null) {
            SubscriptionStickerDictIntf C3Y = interfaceC106104qQ.C3Y();
            if (C3Y != null) {
                treeUpdaterJNI = C3Y.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("subscription_sticker", treeUpdaterJNI);
        }
        if (interfaceC106104qQ.C4I() != null) {
            StickerTraySurface C4I = interfaceC106104qQ.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            A1I.put("surface", str);
        }
        if (interfaceC106104qQ.CHf() != null) {
            AbstractC37303Gc4.A1K(interfaceC106104qQ.CHf(), A1I);
        }
        if (interfaceC106104qQ.CI1() != null) {
            AbstractC37302Gc3.A1V(interfaceC106104qQ.CI1(), A1I);
        }
        if (interfaceC106104qQ.CIa() != null) {
            AbstractC37303Gc4.A1I(interfaceC106104qQ.CIa(), A1I);
        }
        if (interfaceC106104qQ.CIh() != null) {
            AbstractC37303Gc4.A1J(interfaceC106104qQ.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
