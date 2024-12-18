package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.XhS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC72588XhS {
    public static Map A00(YQX yqx) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (yqx.AdC() != null) {
            AbstractC72046XLm.A1V(yqx.AdC(), A1I);
        }
        if (yqx.AdO() != null) {
            AbstractC72046XLm.A1Y(yqx.AdO(), A1I);
        }
        if (yqx.AvN() != null) {
            AbstractC72046XLm.A1Z(yqx.AvN(), A1I);
        }
        if (yqx.Ayd() != null) {
            AbstractC72046XLm.A1W(yqx.Ayd(), A1I);
        }
        if (yqx.B29() != null) {
            AbstractC37303Gc4.A1N(yqx.B29(), A1I);
        }
        if (yqx.BDR() != null) {
            AbstractC37303Gc4.A1L(yqx.BDR(), A1I);
        }
        if (yqx.getId() != null) {
            AbstractC37300Gc1.A12(yqx.getId(), A1I);
        }
        if (yqx.CUY() != null) {
            AbstractC72046XLm.A1X(yqx.CUY(), A1I);
        }
        if (yqx.CVk() != null) {
            AbstractC72046XLm.A1S(yqx.CVk(), A1I);
        }
        if (yqx.CaJ() != null) {
            AbstractC72046XLm.A1T(yqx.CaJ(), A1I);
        }
        if (yqx.Cdh() != null) {
            AbstractC72046XLm.A1U(yqx.Cdh(), A1I);
        }
        if (yqx.getMediaType() != null) {
            AbstractC37300Gc1.A19(yqx.getMediaType(), A1I);
        }
        String str = null;
        if (yqx.Bj5() != null) {
            JJX Bj5 = yqx.Bj5();
            if (Bj5 != null) {
                treeUpdaterJNI = Bj5.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(506), treeUpdaterJNI);
        }
        if (yqx.Bpa() != null) {
            AbstractC37303Gc4.A1M(yqx.Bpa(), A1I);
        }
        if (yqx.Bzq() != null) {
            AbstractC37303Gc4.A1O(yqx.Bzq(), A1I);
        }
        if (yqx.C0i() != null) {
            AbstractC72046XLm.A1a(yqx.C0i(), A1I);
        }
        if (yqx.C3Y() != null) {
            AbstractC72046XLm.A1b(AbstractC72046XLm.A05(yqx.C3Y()), A1I);
        }
        if (yqx.C4I() != null) {
            StickerTraySurface C4I = yqx.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            AbstractC72046XLm.A1R(str, A1I);
        }
        if (yqx.CHf() != null) {
            AbstractC37303Gc4.A1K(yqx.CHf(), A1I);
        }
        if (yqx.CI1() != null) {
            AbstractC37302Gc3.A1V(yqx.CI1(), A1I);
        }
        if (yqx.CIa() != null) {
            AbstractC37303Gc4.A1I(yqx.CIa(), A1I);
        }
        if (yqx.CIh() != null) {
            AbstractC37303Gc4.A1J(yqx.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
