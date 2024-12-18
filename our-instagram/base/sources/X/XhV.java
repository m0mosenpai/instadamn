package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class XhV {
    public static Map A00(YQY yqy) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str = null;
        if (yqy.Ac7() != null) {
            JLY Ac7 = yqy.Ac7();
            if (Ac7 != null) {
                treeUpdaterJNI = Ac7.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(1918), treeUpdaterJNI);
        }
        if (yqy.AdC() != null) {
            AbstractC72046XLm.A1V(yqy.AdC(), A1I);
        }
        if (yqy.AdO() != null) {
            AbstractC72046XLm.A1Y(yqy.AdO(), A1I);
        }
        if (yqy.AvN() != null) {
            AbstractC72046XLm.A1Z(yqy.AvN(), A1I);
        }
        if (yqy.Ayd() != null) {
            AbstractC72046XLm.A1W(yqy.Ayd(), A1I);
        }
        if (yqy.B29() != null) {
            AbstractC37303Gc4.A1N(yqy.B29(), A1I);
        }
        if (yqy.BDR() != null) {
            AbstractC37303Gc4.A1L(yqy.BDR(), A1I);
        }
        if (yqy.getId() != null) {
            AbstractC37300Gc1.A12(yqy.getId(), A1I);
        }
        if (yqy.CUY() != null) {
            AbstractC72046XLm.A1X(yqy.CUY(), A1I);
        }
        if (yqy.CVk() != null) {
            AbstractC72046XLm.A1S(yqy.CVk(), A1I);
        }
        if (yqy.CaJ() != null) {
            AbstractC72046XLm.A1T(yqy.CaJ(), A1I);
        }
        if (yqy.Cdh() != null) {
            AbstractC72046XLm.A1U(yqy.Cdh(), A1I);
        }
        if (yqy.getMediaType() != null) {
            AbstractC37300Gc1.A19(yqy.getMediaType(), A1I);
        }
        if (yqy.Bpa() != null) {
            AbstractC37303Gc4.A1M(yqy.Bpa(), A1I);
        }
        if (yqy.Bzq() != null) {
            AbstractC37303Gc4.A1O(yqy.Bzq(), A1I);
        }
        if (yqy.C0i() != null) {
            AbstractC72046XLm.A1a(yqy.C0i(), A1I);
        }
        if (yqy.C3Y() != null) {
            AbstractC72046XLm.A1b(AbstractC72046XLm.A05(yqy.C3Y()), A1I);
        }
        if (yqy.C4I() != null) {
            StickerTraySurface C4I = yqy.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            AbstractC72046XLm.A1R(str, A1I);
        }
        if (yqy.CHf() != null) {
            AbstractC37303Gc4.A1K(yqy.CHf(), A1I);
        }
        if (yqy.CI1() != null) {
            AbstractC37302Gc3.A1V(yqy.CI1(), A1I);
        }
        if (yqy.CIa() != null) {
            AbstractC37303Gc4.A1I(yqy.CIa(), A1I);
        }
        if (yqy.CIh() != null) {
            AbstractC37303Gc4.A1J(yqy.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
