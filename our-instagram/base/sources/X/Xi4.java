package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class Xi4 {
    public static Map A00(YR3 yr3) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (yr3.AdC() != null) {
            AbstractC72046XLm.A1V(yr3.AdC(), A1I);
        }
        if (yr3.AdO() != null) {
            AbstractC72046XLm.A1Y(yr3.AdO(), A1I);
        }
        if (yr3.AvN() != null) {
            AbstractC72046XLm.A1Z(yr3.AvN(), A1I);
        }
        if (yr3.Ayd() != null) {
            AbstractC72046XLm.A1W(yr3.Ayd(), A1I);
        }
        if (yr3.B29() != null) {
            AbstractC37303Gc4.A1N(yr3.B29(), A1I);
        }
        if (yr3.BDR() != null) {
            AbstractC37303Gc4.A1L(yr3.BDR(), A1I);
        }
        if (yr3.getId() != null) {
            AbstractC37300Gc1.A12(yr3.getId(), A1I);
        }
        if (yr3.CUY() != null) {
            AbstractC72046XLm.A1X(yr3.CUY(), A1I);
        }
        if (yr3.CVk() != null) {
            AbstractC72046XLm.A1S(yr3.CVk(), A1I);
        }
        if (yr3.CaJ() != null) {
            AbstractC72046XLm.A1T(yr3.CaJ(), A1I);
        }
        if (yr3.Cdh() != null) {
            AbstractC72046XLm.A1U(yr3.Cdh(), A1I);
        }
        if (yr3.getMediaType() != null) {
            AbstractC37300Gc1.A19(yr3.getMediaType(), A1I);
        }
        if (yr3.Bpa() != null) {
            AbstractC37303Gc4.A1M(yr3.Bpa(), A1I);
        }
        if (yr3.Bzq() != null) {
            AbstractC37303Gc4.A1O(yr3.Bzq(), A1I);
        }
        if (yr3.C0i() != null) {
            AbstractC72046XLm.A1a(yr3.C0i(), A1I);
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (yr3.C3Y() != null) {
            AbstractC72046XLm.A1b(AbstractC72046XLm.A05(yr3.C3Y()), A1I);
        }
        if (yr3.C4I() != null) {
            StickerTraySurface C4I = yr3.C4I();
            if (C4I != null) {
                str = C4I.A00;
            } else {
                str = null;
            }
            AbstractC72046XLm.A1R(str, A1I);
        }
        if (yr3.C6m() != null) {
            InterfaceC43568JMc C6m = yr3.C6m();
            if (C6m != null) {
                treeUpdaterJNI = C6m.F7o();
            }
            A1I.put(AbstractC111324zv.A00(273), treeUpdaterJNI);
        }
        if (yr3.CHf() != null) {
            AbstractC37303Gc4.A1K(yr3.CHf(), A1I);
        }
        if (yr3.CI1() != null) {
            AbstractC37302Gc3.A1V(yr3.CI1(), A1I);
        }
        if (yr3.CIa() != null) {
            AbstractC37303Gc4.A1I(yr3.CIa(), A1I);
        }
        if (yr3.CIh() != null) {
            AbstractC37303Gc4.A1J(yr3.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
