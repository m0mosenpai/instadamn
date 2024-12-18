package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.XhR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC72587XhR {
    public static Map A00(YQW yqw) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (yqw.AdC() != null) {
            AbstractC72046XLm.A1V(yqw.AdC(), A1I);
        }
        if (yqw.AdO() != null) {
            AbstractC72046XLm.A1Y(yqw.AdO(), A1I);
        }
        if (yqw.AvN() != null) {
            AbstractC72046XLm.A1Z(yqw.AvN(), A1I);
        }
        if (yqw.Ayd() != null) {
            AbstractC72046XLm.A1W(yqw.Ayd(), A1I);
        }
        if (yqw.B29() != null) {
            AbstractC37303Gc4.A1N(yqw.B29(), A1I);
        }
        if (yqw.BDR() != null) {
            AbstractC37303Gc4.A1L(yqw.BDR(), A1I);
        }
        if (yqw.getId() != null) {
            AbstractC37300Gc1.A12(yqw.getId(), A1I);
        }
        if (yqw.CUY() != null) {
            AbstractC72046XLm.A1X(yqw.CUY(), A1I);
        }
        if (yqw.CVk() != null) {
            AbstractC72046XLm.A1S(yqw.CVk(), A1I);
        }
        if (yqw.CaJ() != null) {
            AbstractC72046XLm.A1T(yqw.CaJ(), A1I);
        }
        if (yqw.Cdh() != null) {
            AbstractC72046XLm.A1U(yqw.Cdh(), A1I);
        }
        String str = null;
        if (yqw.BKQ() != null) {
            JMI BKQ = yqw.BKQ();
            if (BKQ != null) {
                treeUpdaterJNI = BKQ.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(462), treeUpdaterJNI);
        }
        if (yqw.getMediaType() != null) {
            AbstractC37300Gc1.A19(yqw.getMediaType(), A1I);
        }
        if (yqw.Bpa() != null) {
            AbstractC37303Gc4.A1M(yqw.Bpa(), A1I);
        }
        if (yqw.Bzq() != null) {
            AbstractC37303Gc4.A1O(yqw.Bzq(), A1I);
        }
        if (yqw.C0i() != null) {
            AbstractC72046XLm.A1a(yqw.C0i(), A1I);
        }
        if (yqw.C3Y() != null) {
            AbstractC72046XLm.A1b(AbstractC72046XLm.A05(yqw.C3Y()), A1I);
        }
        if (yqw.C4I() != null) {
            StickerTraySurface C4I = yqw.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            AbstractC72046XLm.A1R(str, A1I);
        }
        if (yqw.CHf() != null) {
            AbstractC37303Gc4.A1K(yqw.CHf(), A1I);
        }
        if (yqw.CI1() != null) {
            AbstractC37302Gc3.A1V(yqw.CI1(), A1I);
        }
        if (yqw.CIa() != null) {
            AbstractC37303Gc4.A1I(yqw.CIa(), A1I);
        }
        if (yqw.CIh() != null) {
            AbstractC37303Gc4.A1J(yqw.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
