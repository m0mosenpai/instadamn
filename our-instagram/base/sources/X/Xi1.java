package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class Xi1 {
    public static Map A00(YR0 yr0) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (yr0.AdC() != null) {
            AbstractC72046XLm.A1V(yr0.AdC(), A1I);
        }
        if (yr0.AdO() != null) {
            AbstractC72046XLm.A1Y(yr0.AdO(), A1I);
        }
        if (yr0.AvN() != null) {
            AbstractC72046XLm.A1Z(yr0.AvN(), A1I);
        }
        if (yr0.Ayd() != null) {
            AbstractC72046XLm.A1W(yr0.Ayd(), A1I);
        }
        if (yr0.B29() != null) {
            AbstractC37303Gc4.A1N(yr0.B29(), A1I);
        }
        if (yr0.BDR() != null) {
            AbstractC37303Gc4.A1L(yr0.BDR(), A1I);
        }
        if (yr0.getId() != null) {
            AbstractC37300Gc1.A12(yr0.getId(), A1I);
        }
        if (yr0.CUY() != null) {
            AbstractC72046XLm.A1X(yr0.CUY(), A1I);
        }
        if (yr0.CVk() != null) {
            AbstractC72046XLm.A1S(yr0.CVk(), A1I);
        }
        if (yr0.CaJ() != null) {
            AbstractC72046XLm.A1T(yr0.CaJ(), A1I);
        }
        if (yr0.Cdh() != null) {
            AbstractC72046XLm.A1U(yr0.Cdh(), A1I);
        }
        if (yr0.getMediaType() != null) {
            AbstractC37300Gc1.A19(yr0.getMediaType(), A1I);
        }
        if (yr0.Bpa() != null) {
            AbstractC37303Gc4.A1M(yr0.Bpa(), A1I);
        }
        if (yr0.Bzq() != null) {
            AbstractC37303Gc4.A1O(yr0.Bzq(), A1I);
        }
        if (yr0.C0i() != null) {
            AbstractC72046XLm.A1a(yr0.C0i(), A1I);
        }
        String str = null;
        if (yr0.C3W() != null) {
            JMC C3W = yr0.C3W();
            if (C3W != null) {
                treeUpdaterJNI = C3W.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(3191), treeUpdaterJNI);
        }
        if (yr0.C3Y() != null) {
            AbstractC72046XLm.A1b(AbstractC72046XLm.A05(yr0.C3Y()), A1I);
        }
        if (yr0.C4I() != null) {
            StickerTraySurface C4I = yr0.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            AbstractC72046XLm.A1R(str, A1I);
        }
        if (yr0.CHf() != null) {
            AbstractC37303Gc4.A1K(yr0.CHf(), A1I);
        }
        if (yr0.CI1() != null) {
            AbstractC37302Gc3.A1V(yr0.CI1(), A1I);
        }
        if (yr0.CIa() != null) {
            AbstractC37303Gc4.A1I(yr0.CIa(), A1I);
        }
        if (yr0.CIh() != null) {
            AbstractC37303Gc4.A1J(yr0.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
