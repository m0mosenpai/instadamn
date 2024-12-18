package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerDict;
import com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class Xi6 {
    public static Map A00(WhatsAppChannelShareToIgStoryStickerTappableObject whatsAppChannelShareToIgStoryStickerTappableObject) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (whatsAppChannelShareToIgStoryStickerTappableObject.AdC() != null) {
            AbstractC72046XLm.A1V(whatsAppChannelShareToIgStoryStickerTappableObject.AdC(), A1I);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.AdO() != null) {
            AbstractC72046XLm.A1Y(whatsAppChannelShareToIgStoryStickerTappableObject.AdO(), A1I);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.AvN() != null) {
            AbstractC72046XLm.A1Z(whatsAppChannelShareToIgStoryStickerTappableObject.AvN(), A1I);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.Ayd() != null) {
            AbstractC72046XLm.A1W(whatsAppChannelShareToIgStoryStickerTappableObject.Ayd(), A1I);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.B29() != null) {
            AbstractC37303Gc4.A1N(whatsAppChannelShareToIgStoryStickerTappableObject.B29(), A1I);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.BDR() != null) {
            AbstractC37303Gc4.A1L(whatsAppChannelShareToIgStoryStickerTappableObject.BDR(), A1I);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.getId() != null) {
            AbstractC37300Gc1.A12(whatsAppChannelShareToIgStoryStickerTappableObject.getId(), A1I);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.CUY() != null) {
            AbstractC72046XLm.A1X(whatsAppChannelShareToIgStoryStickerTappableObject.CUY(), A1I);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.CVk() != null) {
            AbstractC72046XLm.A1S(whatsAppChannelShareToIgStoryStickerTappableObject.CVk(), A1I);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.CaJ() != null) {
            AbstractC72046XLm.A1T(whatsAppChannelShareToIgStoryStickerTappableObject.CaJ(), A1I);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.Cdh() != null) {
            AbstractC72046XLm.A1U(whatsAppChannelShareToIgStoryStickerTappableObject.Cdh(), A1I);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.getMediaType() != null) {
            AbstractC37300Gc1.A19(whatsAppChannelShareToIgStoryStickerTappableObject.getMediaType(), A1I);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.Bpa() != null) {
            AbstractC37303Gc4.A1M(whatsAppChannelShareToIgStoryStickerTappableObject.Bpa(), A1I);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.Bzq() != null) {
            AbstractC37303Gc4.A1O(whatsAppChannelShareToIgStoryStickerTappableObject.Bzq(), A1I);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.C0i() != null) {
            AbstractC72046XLm.A1a(whatsAppChannelShareToIgStoryStickerTappableObject.C0i(), A1I);
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (whatsAppChannelShareToIgStoryStickerTappableObject.C3Y() != null) {
            AbstractC72046XLm.A1b(AbstractC72046XLm.A05(whatsAppChannelShareToIgStoryStickerTappableObject.C3Y()), A1I);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.C4I() != null) {
            StickerTraySurface C4I = whatsAppChannelShareToIgStoryStickerTappableObject.C4I();
            if (C4I != null) {
                str = C4I.A00;
            } else {
                str = null;
            }
            AbstractC72046XLm.A1R(str, A1I);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.CHX() != null) {
            WhatsAppChannelShareToIgStoryStickerDict CHX = whatsAppChannelShareToIgStoryStickerTappableObject.CHX();
            if (CHX != null) {
                treeUpdaterJNI = CHX.F7o();
            }
            A1I.put(AbstractC111324zv.A00(1375), treeUpdaterJNI);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.CHf() != null) {
            AbstractC37303Gc4.A1K(whatsAppChannelShareToIgStoryStickerTappableObject.CHf(), A1I);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.CI1() != null) {
            AbstractC37302Gc3.A1V(whatsAppChannelShareToIgStoryStickerTappableObject.CI1(), A1I);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.CIa() != null) {
            AbstractC37303Gc4.A1I(whatsAppChannelShareToIgStoryStickerTappableObject.CIa(), A1I);
        }
        if (whatsAppChannelShareToIgStoryStickerTappableObject.CIh() != null) {
            AbstractC37303Gc4.A1J(whatsAppChannelShareToIgStoryStickerTappableObject.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
