package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.XhW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC72590XhW {
    public static Map A00(YQZ yqz) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str = null;
        if (yqz.Ac8() != null) {
            JLY Ac8 = yqz.Ac8();
            if (Ac8 != null) {
                treeUpdaterJNI = Ac8.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(1919), treeUpdaterJNI);
        }
        if (yqz.AdC() != null) {
            AbstractC72046XLm.A1V(yqz.AdC(), A1I);
        }
        if (yqz.AdO() != null) {
            AbstractC72046XLm.A1Y(yqz.AdO(), A1I);
        }
        if (yqz.AvN() != null) {
            AbstractC72046XLm.A1Z(yqz.AvN(), A1I);
        }
        if (yqz.Ayd() != null) {
            AbstractC72046XLm.A1W(yqz.Ayd(), A1I);
        }
        if (yqz.B29() != null) {
            AbstractC37303Gc4.A1N(yqz.B29(), A1I);
        }
        if (yqz.BDR() != null) {
            AbstractC37303Gc4.A1L(yqz.BDR(), A1I);
        }
        if (yqz.getId() != null) {
            AbstractC37300Gc1.A12(yqz.getId(), A1I);
        }
        if (yqz.CUY() != null) {
            AbstractC72046XLm.A1X(yqz.CUY(), A1I);
        }
        if (yqz.CVk() != null) {
            AbstractC72046XLm.A1S(yqz.CVk(), A1I);
        }
        if (yqz.CaJ() != null) {
            AbstractC72046XLm.A1T(yqz.CaJ(), A1I);
        }
        if (yqz.Cdh() != null) {
            AbstractC72046XLm.A1U(yqz.Cdh(), A1I);
        }
        if (yqz.getMediaType() != null) {
            AbstractC37300Gc1.A19(yqz.getMediaType(), A1I);
        }
        if (yqz.Bpa() != null) {
            AbstractC37303Gc4.A1M(yqz.Bpa(), A1I);
        }
        if (yqz.Bzq() != null) {
            AbstractC37303Gc4.A1O(yqz.Bzq(), A1I);
        }
        if (yqz.C0i() != null) {
            AbstractC72046XLm.A1a(yqz.C0i(), A1I);
        }
        if (yqz.C3Y() != null) {
            AbstractC72046XLm.A1b(AbstractC72046XLm.A05(yqz.C3Y()), A1I);
        }
        if (yqz.C4I() != null) {
            StickerTraySurface C4I = yqz.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            AbstractC72046XLm.A1R(str, A1I);
        }
        if (yqz.CHf() != null) {
            AbstractC37303Gc4.A1K(yqz.CHf(), A1I);
        }
        if (yqz.CI1() != null) {
            AbstractC37302Gc3.A1V(yqz.CI1(), A1I);
        }
        if (yqz.CIa() != null) {
            AbstractC37303Gc4.A1I(yqz.CIa(), A1I);
        }
        if (yqz.CIh() != null) {
            AbstractC37303Gc4.A1J(yqz.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
