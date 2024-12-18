package X;

import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.XhT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC72589XhT {
    public static Map A00(YR7 yr7) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (yr7.AdC() != null) {
            AbstractC72046XLm.A1V(yr7.AdC(), A1I);
        }
        if (yr7.AdO() != null) {
            AbstractC72046XLm.A1Y(yr7.AdO(), A1I);
        }
        if (yr7.AvN() != null) {
            AbstractC72046XLm.A1Z(yr7.AvN(), A1I);
        }
        if (yr7.Ayd() != null) {
            AbstractC72046XLm.A1W(yr7.Ayd(), A1I);
        }
        if (yr7.B29() != null) {
            AbstractC37303Gc4.A1N(yr7.B29(), A1I);
        }
        if (yr7.BDR() != null) {
            AbstractC37303Gc4.A1L(yr7.BDR(), A1I);
        }
        if (yr7.getId() != null) {
            AbstractC37300Gc1.A12(yr7.getId(), A1I);
        }
        if (yr7.CUY() != null) {
            AbstractC72046XLm.A1X(yr7.CUY(), A1I);
        }
        if (yr7.CVk() != null) {
            AbstractC72046XLm.A1S(yr7.CVk(), A1I);
        }
        if (yr7.CaJ() != null) {
            AbstractC72046XLm.A1T(yr7.CaJ(), A1I);
        }
        if (yr7.Cdh() != null) {
            AbstractC72046XLm.A1U(yr7.Cdh(), A1I);
        }
        if (yr7.getMediaType() != null) {
            AbstractC37300Gc1.A19(yr7.getMediaType(), A1I);
        }
        if (yr7.BSZ() != null) {
            A1I.put("merchant_id", yr7.BSZ());
        }
        if (yr7.Bh4() != null) {
            A1I.put("product_ids", yr7.Bh4());
        }
        if (yr7.BoS() != null) {
            A1I.put(AbstractC111324zv.A00(518), yr7.BoS());
        }
        if (yr7.Bpa() != null) {
            AbstractC37303Gc4.A1M(yr7.Bpa(), A1I);
        }
        if (yr7.Bzq() != null) {
            AbstractC37303Gc4.A1O(yr7.Bzq(), A1I);
        }
        if (yr7.C0i() != null) {
            AbstractC72046XLm.A1a(yr7.C0i(), A1I);
        }
        if (yr7.getStorefrontAttributionUsername() != null) {
            A1I.put(AbstractC58317Pt9.A00(135), yr7.getStorefrontAttributionUsername());
        }
        String str = null;
        if (yr7.C3Y() != null) {
            AbstractC72046XLm.A1b(AbstractC72046XLm.A05(yr7.C3Y()), A1I);
        }
        if (yr7.C4I() != null) {
            StickerTraySurface C4I = yr7.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            AbstractC72046XLm.A1R(str, A1I);
        }
        if (yr7.CHf() != null) {
            AbstractC37303Gc4.A1K(yr7.CHf(), A1I);
        }
        if (yr7.CI1() != null) {
            AbstractC37302Gc3.A1V(yr7.CI1(), A1I);
        }
        if (yr7.CIa() != null) {
            AbstractC37303Gc4.A1I(yr7.CIa(), A1I);
        }
        if (yr7.CIh() != null) {
            AbstractC37303Gc4.A1J(yr7.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
