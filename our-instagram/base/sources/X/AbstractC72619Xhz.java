package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.SMBSupportStickerDictIntf;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.StorySmbSupportStickerObject;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Xhz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC72619Xhz {
    public static Map A00(StorySmbSupportStickerObject storySmbSupportStickerObject) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (storySmbSupportStickerObject.AdC() != null) {
            AbstractC72046XLm.A1V(storySmbSupportStickerObject.AdC(), A1I);
        }
        if (storySmbSupportStickerObject.AdO() != null) {
            AbstractC72046XLm.A1Y(storySmbSupportStickerObject.AdO(), A1I);
        }
        if (storySmbSupportStickerObject.AvN() != null) {
            AbstractC72046XLm.A1Z(storySmbSupportStickerObject.AvN(), A1I);
        }
        if (storySmbSupportStickerObject.Ayd() != null) {
            AbstractC72046XLm.A1W(storySmbSupportStickerObject.Ayd(), A1I);
        }
        if (storySmbSupportStickerObject.B29() != null) {
            AbstractC37303Gc4.A1N(storySmbSupportStickerObject.B29(), A1I);
        }
        if (storySmbSupportStickerObject.BDR() != null) {
            AbstractC37303Gc4.A1L(storySmbSupportStickerObject.BDR(), A1I);
        }
        if (storySmbSupportStickerObject.getId() != null) {
            AbstractC37300Gc1.A12(storySmbSupportStickerObject.getId(), A1I);
        }
        if (storySmbSupportStickerObject.CUY() != null) {
            AbstractC72046XLm.A1X(storySmbSupportStickerObject.CUY(), A1I);
        }
        if (storySmbSupportStickerObject.CVk() != null) {
            AbstractC72046XLm.A1S(storySmbSupportStickerObject.CVk(), A1I);
        }
        if (storySmbSupportStickerObject.CaJ() != null) {
            AbstractC72046XLm.A1T(storySmbSupportStickerObject.CaJ(), A1I);
        }
        if (storySmbSupportStickerObject.Cdh() != null) {
            AbstractC72046XLm.A1U(storySmbSupportStickerObject.Cdh(), A1I);
        }
        if (storySmbSupportStickerObject.getMediaType() != null) {
            AbstractC37300Gc1.A19(storySmbSupportStickerObject.getMediaType(), A1I);
        }
        if (storySmbSupportStickerObject.Bpa() != null) {
            AbstractC37303Gc4.A1M(storySmbSupportStickerObject.Bpa(), A1I);
        }
        String str = null;
        if (storySmbSupportStickerObject.Bxz() != null) {
            SMBSupportStickerDictIntf Bxz = storySmbSupportStickerObject.Bxz();
            if (Bxz != null) {
                treeUpdaterJNI = Bxz.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(1271), treeUpdaterJNI);
        }
        if (storySmbSupportStickerObject.Bzq() != null) {
            AbstractC37303Gc4.A1O(storySmbSupportStickerObject.Bzq(), A1I);
        }
        if (storySmbSupportStickerObject.C0i() != null) {
            AbstractC72046XLm.A1a(storySmbSupportStickerObject.C0i(), A1I);
        }
        if (storySmbSupportStickerObject.C3Y() != null) {
            AbstractC72046XLm.A1b(AbstractC72046XLm.A05(storySmbSupportStickerObject.C3Y()), A1I);
        }
        if (storySmbSupportStickerObject.C4I() != null) {
            StickerTraySurface C4I = storySmbSupportStickerObject.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            AbstractC72046XLm.A1R(str, A1I);
        }
        if (storySmbSupportStickerObject.CHf() != null) {
            AbstractC37303Gc4.A1K(storySmbSupportStickerObject.CHf(), A1I);
        }
        if (storySmbSupportStickerObject.CI1() != null) {
            AbstractC37302Gc3.A1V(storySmbSupportStickerObject.CI1(), A1I);
        }
        if (storySmbSupportStickerObject.CIa() != null) {
            AbstractC37303Gc4.A1I(storySmbSupportStickerObject.CIa(), A1I);
        }
        if (storySmbSupportStickerObject.CIh() != null) {
            AbstractC37303Gc4.A1J(storySmbSupportStickerObject.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
