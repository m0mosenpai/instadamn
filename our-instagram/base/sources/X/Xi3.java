package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class Xi3 {
    public static Map A00(YR2 yr2) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (yr2.AdC() != null) {
            AbstractC72046XLm.A1V(yr2.AdC(), A1I);
        }
        if (yr2.AdO() != null) {
            AbstractC72046XLm.A1Y(yr2.AdO(), A1I);
        }
        if (yr2.AvN() != null) {
            AbstractC72046XLm.A1Z(yr2.AvN(), A1I);
        }
        if (yr2.Ayd() != null) {
            AbstractC72046XLm.A1W(yr2.Ayd(), A1I);
        }
        if (yr2.B29() != null) {
            AbstractC37303Gc4.A1N(yr2.B29(), A1I);
        }
        if (yr2.BDR() != null) {
            AbstractC37303Gc4.A1L(yr2.BDR(), A1I);
        }
        if (yr2.getId() != null) {
            AbstractC37300Gc1.A12(yr2.getId(), A1I);
        }
        if (yr2.CUY() != null) {
            AbstractC72046XLm.A1X(yr2.CUY(), A1I);
        }
        if (yr2.CVk() != null) {
            AbstractC72046XLm.A1S(yr2.CVk(), A1I);
        }
        if (yr2.CaJ() != null) {
            AbstractC72046XLm.A1T(yr2.CaJ(), A1I);
        }
        if (yr2.Cdh() != null) {
            AbstractC72046XLm.A1U(yr2.Cdh(), A1I);
        }
        if (yr2.getMediaType() != null) {
            AbstractC37300Gc1.A19(yr2.getMediaType(), A1I);
        }
        if (yr2.Bpa() != null) {
            AbstractC37303Gc4.A1M(yr2.Bpa(), A1I);
        }
        if (yr2.Bzq() != null) {
            AbstractC37303Gc4.A1O(yr2.Bzq(), A1I);
        }
        if (yr2.C0i() != null) {
            AbstractC72046XLm.A1a(yr2.C0i(), A1I);
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (yr2.C3Y() != null) {
            AbstractC72046XLm.A1b(AbstractC72046XLm.A05(yr2.C3Y()), A1I);
        }
        if (yr2.C4I() != null) {
            StickerTraySurface C4I = yr2.C4I();
            if (C4I != null) {
                str = C4I.A00;
            } else {
                str = null;
            }
            AbstractC72046XLm.A1R(str, A1I);
        }
        if (yr2.CH7() != null) {
            InterfaceC43492JJe CH7 = yr2.CH7();
            if (CH7 != null) {
                treeUpdaterJNI = CH7.F7o();
            }
            A1I.put(AbstractC111324zv.A00(1372), treeUpdaterJNI);
        }
        if (yr2.CHf() != null) {
            AbstractC37303Gc4.A1K(yr2.CHf(), A1I);
        }
        if (yr2.CI1() != null) {
            AbstractC37302Gc3.A1V(yr2.CI1(), A1I);
        }
        if (yr2.CIa() != null) {
            AbstractC37303Gc4.A1I(yr2.CIa(), A1I);
        }
        if (yr2.CIh() != null) {
            AbstractC37303Gc4.A1J(yr2.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
