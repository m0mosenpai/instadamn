package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.GdF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37373GdF {
    public static Map A00(AnonymousClass447 anonymousClass447) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (anonymousClass447.AdC() != null) {
            A1I.put("attribution", anonymousClass447.AdC());
        }
        if (anonymousClass447.AdO() != null) {
            A1I.put("attribution_url", anonymousClass447.AdO());
        }
        if (anonymousClass447.AvN() != null) {
            A1I.put("custom_text_color", anonymousClass447.AvN());
        }
        if (anonymousClass447.Ayd() != null) {
            A1I.put("display_type", anonymousClass447.Ayd());
        }
        if (anonymousClass447.B29() != null) {
            AbstractC37303Gc4.A1N(anonymousClass447.B29(), A1I);
        }
        if (anonymousClass447.BDR() != null) {
            AbstractC37303Gc4.A1L(anonymousClass447.BDR(), A1I);
        }
        if (anonymousClass447.getId() != null) {
            AbstractC37300Gc1.A12(anonymousClass447.getId(), A1I);
        }
        if (anonymousClass447.CUY() != null) {
            A1I.put("is_fb_sticker", anonymousClass447.CUY());
        }
        if (anonymousClass447.CVk() != null) {
            A1I.put("is_hidden", anonymousClass447.CVk());
        }
        if (anonymousClass447.CaJ() != null) {
            A1I.put("is_pinned", anonymousClass447.CaJ());
        }
        if (anonymousClass447.Cdh() != null) {
            A1I.put("is_sticker", anonymousClass447.Cdh());
        }
        if (anonymousClass447.getMediaType() != null) {
            AbstractC37300Gc1.A19(anonymousClass447.getMediaType(), A1I);
        }
        if (anonymousClass447.Bpa() != null) {
            AbstractC37303Gc4.A1M(anonymousClass447.Bpa(), A1I);
        }
        if (anonymousClass447.Bzq() != null) {
            AbstractC37303Gc4.A1O(anonymousClass447.Bzq(), A1I);
        }
        if (anonymousClass447.C0i() != null) {
            A1I.put("sticker_style_enum", anonymousClass447.C0i());
        }
        String str = null;
        if (anonymousClass447.C3Y() != null) {
            SubscriptionStickerDictIntf C3Y = anonymousClass447.C3Y();
            if (C3Y != null) {
                treeUpdaterJNI = C3Y.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("subscription_sticker", treeUpdaterJNI);
        }
        if (anonymousClass447.C4I() != null) {
            StickerTraySurface C4I = anonymousClass447.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            A1I.put("surface", str);
        }
        AbstractC37302Gc3.A1T(anonymousClass447.CDj(), A1I);
        if (anonymousClass447.getUserId() != null) {
            A1I.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, anonymousClass447.getUserId());
        }
        if (anonymousClass447.CHf() != null) {
            AbstractC37303Gc4.A1K(anonymousClass447.CHf(), A1I);
        }
        if (anonymousClass447.CI1() != null) {
            AbstractC37302Gc3.A1V(anonymousClass447.CI1(), A1I);
        }
        if (anonymousClass447.CIa() != null) {
            AbstractC37303Gc4.A1I(anonymousClass447.CIa(), A1I);
        }
        if (anonymousClass447.CIh() != null) {
            AbstractC37303Gc4.A1J(anonymousClass447.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
