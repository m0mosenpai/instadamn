package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hvy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40411Hvy {
    public static Map A00(InterfaceC114635Ft interfaceC114635Ft) {
        String str;
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC114635Ft.AdC() != null) {
            A1I.put("attribution", interfaceC114635Ft.AdC());
        }
        if (interfaceC114635Ft.AdO() != null) {
            A1I.put("attribution_url", interfaceC114635Ft.AdO());
        }
        if (interfaceC114635Ft.AvN() != null) {
            A1I.put("custom_text_color", interfaceC114635Ft.AvN());
        }
        if (interfaceC114635Ft.Ayd() != null) {
            A1I.put("display_type", interfaceC114635Ft.Ayd());
        }
        if (interfaceC114635Ft.B29() != null) {
            AbstractC37303Gc4.A1N(interfaceC114635Ft.B29(), A1I);
        }
        if (interfaceC114635Ft.BDR() != null) {
            AbstractC37303Gc4.A1L(interfaceC114635Ft.BDR(), A1I);
        }
        if (interfaceC114635Ft.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC114635Ft.getId(), A1I);
        }
        if (interfaceC114635Ft.CUY() != null) {
            A1I.put("is_fb_sticker", interfaceC114635Ft.CUY());
        }
        if (interfaceC114635Ft.CVk() != null) {
            A1I.put("is_hidden", interfaceC114635Ft.CVk());
        }
        if (interfaceC114635Ft.CaJ() != null) {
            A1I.put("is_pinned", interfaceC114635Ft.CaJ());
        }
        if (interfaceC114635Ft.Cdh() != null) {
            A1I.put("is_sticker", interfaceC114635Ft.Cdh());
        }
        if (interfaceC114635Ft.getMediaType() != null) {
            AbstractC37300Gc1.A19(interfaceC114635Ft.getMediaType(), A1I);
        }
        if (interfaceC114635Ft.Bpa() != null) {
            AbstractC37303Gc4.A1M(interfaceC114635Ft.Bpa(), A1I);
        }
        if (interfaceC114635Ft.Bzq() != null) {
            AbstractC37303Gc4.A1O(interfaceC114635Ft.Bzq(), A1I);
        }
        if (interfaceC114635Ft.C0i() != null) {
            A1I.put("sticker_style_enum", interfaceC114635Ft.C0i());
        }
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (interfaceC114635Ft.C3Y() != null) {
            SubscriptionStickerDictIntf C3Y = interfaceC114635Ft.C3Y();
            if (C3Y != null) {
                treeUpdaterJNI = C3Y.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("subscription_sticker", treeUpdaterJNI);
        }
        if (interfaceC114635Ft.C4I() != null) {
            StickerTraySurface C4I = interfaceC114635Ft.C4I();
            if (C4I != null) {
                str = C4I.A00;
            } else {
                str = null;
            }
            A1I.put("surface", str);
        }
        if (interfaceC114635Ft.C6f() != null) {
            JLB C6f = interfaceC114635Ft.C6f();
            if (C6f != null) {
                treeUpdaterJNI2 = C6f.F7o();
            }
            A1I.put(AbstractC111324zv.A00(541), treeUpdaterJNI2);
        }
        if (interfaceC114635Ft.CHf() != null) {
            AbstractC37303Gc4.A1K(interfaceC114635Ft.CHf(), A1I);
        }
        if (interfaceC114635Ft.CI1() != null) {
            AbstractC37302Gc3.A1V(interfaceC114635Ft.CI1(), A1I);
        }
        if (interfaceC114635Ft.CIa() != null) {
            AbstractC37303Gc4.A1I(interfaceC114635Ft.CIa(), A1I);
        }
        if (interfaceC114635Ft.CIh() != null) {
            AbstractC37303Gc4.A1J(interfaceC114635Ft.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
