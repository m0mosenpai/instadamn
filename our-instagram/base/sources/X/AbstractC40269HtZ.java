package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HtZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40269HtZ {
    public static Map A00(InterfaceC102164im interfaceC102164im) {
        String str;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC102164im.AdC() != null) {
            A1I.put("attribution", interfaceC102164im.AdC());
        }
        if (interfaceC102164im.AdO() != null) {
            A1I.put("attribution_url", interfaceC102164im.AdO());
        }
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (interfaceC102164im.AeA() != null) {
            InterfaceC102144ik AeA = interfaceC102164im.AeA();
            if (AeA != null) {
                treeUpdaterJNI2 = AeA.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put(AbstractC111324zv.A00(1959), treeUpdaterJNI2);
        }
        if (interfaceC102164im.Aei() != null) {
            A1I.put(AbstractC111324zv.A00(175), interfaceC102164im.Aei());
        }
        if (interfaceC102164im.AvN() != null) {
            A1I.put("custom_text_color", interfaceC102164im.AvN());
        }
        if (interfaceC102164im.Ayd() != null) {
            A1I.put("display_type", interfaceC102164im.Ayd());
        }
        if (interfaceC102164im.B29() != null) {
            AbstractC37303Gc4.A1N(interfaceC102164im.B29(), A1I);
        }
        if (interfaceC102164im.B3Q() != null) {
            A1I.put("expression_id", interfaceC102164im.B3Q());
        }
        if (interfaceC102164im.BDR() != null) {
            AbstractC37303Gc4.A1L(interfaceC102164im.BDR(), A1I);
        }
        if (interfaceC102164im.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC102164im.getId(), A1I);
        }
        if (interfaceC102164im.CUY() != null) {
            A1I.put("is_fb_sticker", interfaceC102164im.CUY());
        }
        if (interfaceC102164im.CVk() != null) {
            A1I.put("is_hidden", interfaceC102164im.CVk());
        }
        if (interfaceC102164im.CaJ() != null) {
            A1I.put("is_pinned", interfaceC102164im.CaJ());
        }
        if (interfaceC102164im.Cdh() != null) {
            A1I.put("is_sticker", interfaceC102164im.Cdh());
        }
        if (interfaceC102164im.getMediaType() != null) {
            AbstractC37300Gc1.A19(interfaceC102164im.getMediaType(), A1I);
        }
        if (interfaceC102164im.Bpa() != null) {
            AbstractC37303Gc4.A1M(interfaceC102164im.Bpa(), A1I);
        }
        if (interfaceC102164im.Bzq() != null) {
            AbstractC37303Gc4.A1O(interfaceC102164im.Bzq(), A1I);
        }
        if (interfaceC102164im.C0i() != null) {
            A1I.put("sticker_style_enum", interfaceC102164im.C0i());
        }
        if (interfaceC102164im.C3Y() != null) {
            SubscriptionStickerDictIntf C3Y = interfaceC102164im.C3Y();
            if (C3Y != null) {
                treeUpdaterJNI = C3Y.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("subscription_sticker", treeUpdaterJNI);
        }
        if (interfaceC102164im.C4I() != null) {
            StickerTraySurface C4I = interfaceC102164im.C4I();
            if (C4I != null) {
                str = C4I.A00;
            } else {
                str = null;
            }
            A1I.put("surface", str);
        }
        if (interfaceC102164im.getUserId() != null) {
            A1I.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, interfaceC102164im.getUserId());
        }
        if (interfaceC102164im.CFz() != null) {
            InterfaceC102144ik CFz = interfaceC102164im.CFz();
            if (CFz != null) {
                treeUpdaterJNI3 = CFz.F7o();
            }
            A1I.put(AbstractC111324zv.A00(3304), treeUpdaterJNI3);
        }
        if (interfaceC102164im.CHf() != null) {
            AbstractC37303Gc4.A1K(interfaceC102164im.CHf(), A1I);
        }
        if (interfaceC102164im.CI1() != null) {
            AbstractC37302Gc3.A1V(interfaceC102164im.CI1(), A1I);
        }
        if (interfaceC102164im.CIa() != null) {
            AbstractC37303Gc4.A1I(interfaceC102164im.CIa(), A1I);
        }
        if (interfaceC102164im.CIh() != null) {
            AbstractC37303Gc4.A1J(interfaceC102164im.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
