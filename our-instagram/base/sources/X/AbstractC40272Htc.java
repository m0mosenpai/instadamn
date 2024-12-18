package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Htc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40272Htc {
    public static Map A00(InterfaceC43581JMp interfaceC43581JMp) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43581JMp.AdC() != null) {
            A1I.put("attribution", interfaceC43581JMp.AdC());
        }
        if (interfaceC43581JMp.AdO() != null) {
            A1I.put("attribution_url", interfaceC43581JMp.AdO());
        }
        String str = null;
        if (interfaceC43581JMp.Agd() != null) {
            InterfaceC43552JLm Agd = interfaceC43581JMp.Agd();
            if (Agd != null) {
                treeUpdaterJNI2 = Agd.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("bloks_sticker", treeUpdaterJNI2);
        }
        if (interfaceC43581JMp.AvN() != null) {
            A1I.put("custom_text_color", interfaceC43581JMp.AvN());
        }
        if (interfaceC43581JMp.Ayd() != null) {
            A1I.put("display_type", interfaceC43581JMp.Ayd());
        }
        if (interfaceC43581JMp.B29() != null) {
            AbstractC37303Gc4.A1N(interfaceC43581JMp.B29(), A1I);
        }
        if (interfaceC43581JMp.BDR() != null) {
            AbstractC37303Gc4.A1L(interfaceC43581JMp.BDR(), A1I);
        }
        if (interfaceC43581JMp.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC43581JMp.getId(), A1I);
        }
        if (interfaceC43581JMp.CUY() != null) {
            A1I.put("is_fb_sticker", interfaceC43581JMp.CUY());
        }
        if (interfaceC43581JMp.CVk() != null) {
            A1I.put("is_hidden", interfaceC43581JMp.CVk());
        }
        if (interfaceC43581JMp.CaJ() != null) {
            A1I.put("is_pinned", interfaceC43581JMp.CaJ());
        }
        if (interfaceC43581JMp.Cdh() != null) {
            A1I.put("is_sticker", interfaceC43581JMp.Cdh());
        }
        if (interfaceC43581JMp.getMediaType() != null) {
            AbstractC37300Gc1.A19(interfaceC43581JMp.getMediaType(), A1I);
        }
        if (interfaceC43581JMp.Bpa() != null) {
            AbstractC37303Gc4.A1M(interfaceC43581JMp.Bpa(), A1I);
        }
        if (interfaceC43581JMp.Bzq() != null) {
            AbstractC37303Gc4.A1O(interfaceC43581JMp.Bzq(), A1I);
        }
        if (interfaceC43581JMp.C0i() != null) {
            A1I.put("sticker_style_enum", interfaceC43581JMp.C0i());
        }
        if (interfaceC43581JMp.C3Y() != null) {
            SubscriptionStickerDictIntf C3Y = interfaceC43581JMp.C3Y();
            if (C3Y != null) {
                treeUpdaterJNI = C3Y.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("subscription_sticker", treeUpdaterJNI);
        }
        if (interfaceC43581JMp.C4I() != null) {
            StickerTraySurface C4I = interfaceC43581JMp.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            A1I.put("surface", str);
        }
        if (interfaceC43581JMp.CHf() != null) {
            AbstractC37303Gc4.A1K(interfaceC43581JMp.CHf(), A1I);
        }
        if (interfaceC43581JMp.CI1() != null) {
            AbstractC37302Gc3.A1V(interfaceC43581JMp.CI1(), A1I);
        }
        if (interfaceC43581JMp.CIa() != null) {
            AbstractC37303Gc4.A1I(interfaceC43581JMp.CIa(), A1I);
        }
        if (interfaceC43581JMp.CIh() != null) {
            AbstractC37303Gc4.A1J(interfaceC43581JMp.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
