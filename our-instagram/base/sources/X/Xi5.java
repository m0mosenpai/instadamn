package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class Xi5 {
    public static Map A00(YR4 yr4) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (yr4.AdC() != null) {
            AbstractC72046XLm.A1V(yr4.AdC(), A1I);
        }
        if (yr4.AdO() != null) {
            AbstractC72046XLm.A1Y(yr4.AdO(), A1I);
        }
        if (yr4.AvN() != null) {
            AbstractC72046XLm.A1Z(yr4.AvN(), A1I);
        }
        if (yr4.Ayd() != null) {
            AbstractC72046XLm.A1W(yr4.Ayd(), A1I);
        }
        if (yr4.B29() != null) {
            AbstractC37303Gc4.A1N(yr4.B29(), A1I);
        }
        if (yr4.BDR() != null) {
            AbstractC37303Gc4.A1L(yr4.BDR(), A1I);
        }
        if (yr4.getId() != null) {
            AbstractC37300Gc1.A12(yr4.getId(), A1I);
        }
        if (yr4.CUY() != null) {
            AbstractC72046XLm.A1X(yr4.CUY(), A1I);
        }
        if (yr4.CVk() != null) {
            AbstractC72046XLm.A1S(yr4.CVk(), A1I);
        }
        if (yr4.CaJ() != null) {
            AbstractC72046XLm.A1T(yr4.CaJ(), A1I);
        }
        if (yr4.Cdh() != null) {
            AbstractC72046XLm.A1U(yr4.Cdh(), A1I);
        }
        if (yr4.getMediaType() != null) {
            AbstractC37300Gc1.A19(yr4.getMediaType(), A1I);
        }
        if (yr4.Bpa() != null) {
            AbstractC37303Gc4.A1M(yr4.Bpa(), A1I);
        }
        if (yr4.Bzq() != null) {
            AbstractC37303Gc4.A1O(yr4.Bzq(), A1I);
        }
        if (yr4.C0i() != null) {
            AbstractC72046XLm.A1a(yr4.C0i(), A1I);
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (yr4.C3Y() != null) {
            AbstractC72046XLm.A1b(AbstractC72046XLm.A05(yr4.C3Y()), A1I);
        }
        if (yr4.C4I() != null) {
            StickerTraySurface C4I = yr4.C4I();
            if (C4I != null) {
                str = C4I.A00;
            } else {
                str = null;
            }
            AbstractC72046XLm.A1R(str, A1I);
        }
        if (yr4.CH5() != null) {
            JME CH5 = yr4.CH5();
            if (CH5 != null) {
                treeUpdaterJNI = CH5.F7o();
            }
            A1I.put(AbstractC111324zv.A00(1371), treeUpdaterJNI);
        }
        if (yr4.CHf() != null) {
            AbstractC37303Gc4.A1K(yr4.CHf(), A1I);
        }
        if (yr4.CI1() != null) {
            AbstractC37302Gc3.A1V(yr4.CI1(), A1I);
        }
        if (yr4.CIa() != null) {
            AbstractC37303Gc4.A1I(yr4.CIa(), A1I);
        }
        if (yr4.CIh() != null) {
            AbstractC37303Gc4.A1J(yr4.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
