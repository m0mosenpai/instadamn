package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gdt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37413Gdt {
    public static Map A00(InterfaceC109274vt interfaceC109274vt) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC109274vt.AdC() != null) {
            A1I.put("attribution", interfaceC109274vt.AdC());
        }
        if (interfaceC109274vt.AdO() != null) {
            A1I.put("attribution_url", interfaceC109274vt.AdO());
        }
        if (interfaceC109274vt.AvN() != null) {
            A1I.put("custom_text_color", interfaceC109274vt.AvN());
        }
        if (interfaceC109274vt.Ayd() != null) {
            A1I.put("display_type", interfaceC109274vt.Ayd());
        }
        if (interfaceC109274vt.B29() != null) {
            AbstractC37303Gc4.A1N(interfaceC109274vt.B29(), A1I);
        }
        if (interfaceC109274vt.BDR() != null) {
            AbstractC37303Gc4.A1L(interfaceC109274vt.BDR(), A1I);
        }
        if (interfaceC109274vt.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC109274vt.getId(), A1I);
        }
        if (interfaceC109274vt.CUY() != null) {
            A1I.put("is_fb_sticker", interfaceC109274vt.CUY());
        }
        if (interfaceC109274vt.CVk() != null) {
            A1I.put("is_hidden", interfaceC109274vt.CVk());
        }
        if (interfaceC109274vt.CaJ() != null) {
            A1I.put("is_pinned", interfaceC109274vt.CaJ());
        }
        if (interfaceC109274vt.Cdh() != null) {
            A1I.put("is_sticker", interfaceC109274vt.Cdh());
        }
        if (interfaceC109274vt.getMediaType() != null) {
            AbstractC37300Gc1.A19(interfaceC109274vt.getMediaType(), A1I);
        }
        if (interfaceC109274vt.Bpa() != null) {
            AbstractC37303Gc4.A1M(interfaceC109274vt.Bpa(), A1I);
        }
        if (interfaceC109274vt.Bzq() != null) {
            AbstractC37303Gc4.A1O(interfaceC109274vt.Bzq(), A1I);
        }
        if (interfaceC109274vt.C0i() != null) {
            A1I.put("sticker_style_enum", interfaceC109274vt.C0i());
        }
        String str = null;
        if (interfaceC109274vt.C3Y() != null) {
            SubscriptionStickerDictIntf C3Y = interfaceC109274vt.C3Y();
            if (C3Y != null) {
                treeUpdaterJNI = C3Y.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("subscription_sticker", treeUpdaterJNI);
        }
        if (interfaceC109274vt.C4I() != null) {
            StickerTraySurface C4I = interfaceC109274vt.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            A1I.put("surface", str);
        }
        if (interfaceC109274vt.CHf() != null) {
            AbstractC37303Gc4.A1K(interfaceC109274vt.CHf(), A1I);
        }
        if (interfaceC109274vt.CI1() != null) {
            AbstractC37302Gc3.A1V(interfaceC109274vt.CI1(), A1I);
        }
        if (interfaceC109274vt.CIa() != null) {
            AbstractC37303Gc4.A1I(interfaceC109274vt.CIa(), A1I);
        }
        if (interfaceC109274vt.CIh() != null) {
            AbstractC37303Gc4.A1J(interfaceC109274vt.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
