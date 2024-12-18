package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.StoryLinkInfoDictIntf;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gnw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC38010Gnw {
    public static Map A00(InterfaceC108154u0 interfaceC108154u0) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC108154u0.AdC() != null) {
            A1I.put("attribution", interfaceC108154u0.AdC());
        }
        if (interfaceC108154u0.AdO() != null) {
            A1I.put("attribution_url", interfaceC108154u0.AdO());
        }
        if (interfaceC108154u0.AvN() != null) {
            A1I.put("custom_text_color", interfaceC108154u0.AvN());
        }
        if (interfaceC108154u0.Ayd() != null) {
            A1I.put("display_type", interfaceC108154u0.Ayd());
        }
        if (interfaceC108154u0.B29() != null) {
            AbstractC37303Gc4.A1N(interfaceC108154u0.B29(), A1I);
        }
        if (interfaceC108154u0.BDR() != null) {
            AbstractC37303Gc4.A1L(interfaceC108154u0.BDR(), A1I);
        }
        if (interfaceC108154u0.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC108154u0.getId(), A1I);
        }
        if (interfaceC108154u0.CUY() != null) {
            A1I.put("is_fb_sticker", interfaceC108154u0.CUY());
        }
        if (interfaceC108154u0.CVk() != null) {
            A1I.put("is_hidden", interfaceC108154u0.CVk());
        }
        if (interfaceC108154u0.CaJ() != null) {
            A1I.put("is_pinned", interfaceC108154u0.CaJ());
        }
        if (interfaceC108154u0.Cdh() != null) {
            A1I.put("is_sticker", interfaceC108154u0.Cdh());
        }
        if (interfaceC108154u0.getMediaType() != null) {
            AbstractC37300Gc1.A19(interfaceC108154u0.getMediaType(), A1I);
        }
        if (interfaceC108154u0.Bpa() != null) {
            AbstractC37303Gc4.A1M(interfaceC108154u0.Bpa(), A1I);
        }
        if (interfaceC108154u0.Bzq() != null) {
            AbstractC37303Gc4.A1O(interfaceC108154u0.Bzq(), A1I);
        }
        if (interfaceC108154u0.C0i() != null) {
            A1I.put("sticker_style_enum", interfaceC108154u0.C0i());
        }
        String str = null;
        if (interfaceC108154u0.C1h() != null) {
            StoryLinkInfoDictIntf C1h = interfaceC108154u0.C1h();
            if (C1h != null) {
                treeUpdaterJNI2 = C1h.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("story_link", treeUpdaterJNI2);
        }
        if (interfaceC108154u0.C3Y() != null) {
            SubscriptionStickerDictIntf C3Y = interfaceC108154u0.C3Y();
            if (C3Y != null) {
                treeUpdaterJNI = C3Y.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("subscription_sticker", treeUpdaterJNI);
        }
        if (interfaceC108154u0.C4I() != null) {
            StickerTraySurface C4I = interfaceC108154u0.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            A1I.put("surface", str);
        }
        if (interfaceC108154u0.CHf() != null) {
            AbstractC37303Gc4.A1K(interfaceC108154u0.CHf(), A1I);
        }
        if (interfaceC108154u0.CI1() != null) {
            AbstractC37302Gc3.A1V(interfaceC108154u0.CI1(), A1I);
        }
        if (interfaceC108154u0.CIa() != null) {
            AbstractC37303Gc4.A1I(interfaceC108154u0.CIa(), A1I);
        }
        if (interfaceC108154u0.CIh() != null) {
            AbstractC37303Gc4.A1J(interfaceC108154u0.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
