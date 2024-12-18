package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.XhQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC72586XhQ {
    public static Map A00(YQV yqv) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (yqv.AdC() != null) {
            AbstractC72046XLm.A1V(yqv.AdC(), A1I);
        }
        if (yqv.AdO() != null) {
            AbstractC72046XLm.A1Y(yqv.AdO(), A1I);
        }
        if (yqv.AvN() != null) {
            AbstractC72046XLm.A1Z(yqv.AvN(), A1I);
        }
        if (yqv.Ayd() != null) {
            AbstractC72046XLm.A1W(yqv.Ayd(), A1I);
        }
        if (yqv.B29() != null) {
            AbstractC37303Gc4.A1N(yqv.B29(), A1I);
        }
        String str = null;
        if (yqv.B3O() != null) {
            JJM B3O = yqv.B3O();
            if (B3O != null) {
                treeUpdaterJNI = B3O.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(920), treeUpdaterJNI);
        }
        if (yqv.BDR() != null) {
            AbstractC37303Gc4.A1L(yqv.BDR(), A1I);
        }
        if (yqv.getId() != null) {
            AbstractC37300Gc1.A12(yqv.getId(), A1I);
        }
        if (yqv.CUY() != null) {
            AbstractC72046XLm.A1X(yqv.CUY(), A1I);
        }
        if (yqv.CVk() != null) {
            AbstractC72046XLm.A1S(yqv.CVk(), A1I);
        }
        if (yqv.CaJ() != null) {
            AbstractC72046XLm.A1T(yqv.CaJ(), A1I);
        }
        if (yqv.Cdh() != null) {
            AbstractC72046XLm.A1U(yqv.Cdh(), A1I);
        }
        if (yqv.getMediaType() != null) {
            AbstractC37300Gc1.A19(yqv.getMediaType(), A1I);
        }
        if (yqv.Bpa() != null) {
            AbstractC37303Gc4.A1M(yqv.Bpa(), A1I);
        }
        if (yqv.Bzq() != null) {
            AbstractC37303Gc4.A1O(yqv.Bzq(), A1I);
        }
        if (yqv.C0i() != null) {
            AbstractC72046XLm.A1a(yqv.C0i(), A1I);
        }
        if (yqv.C3Y() != null) {
            AbstractC72046XLm.A1b(AbstractC72046XLm.A05(yqv.C3Y()), A1I);
        }
        if (yqv.C4I() != null) {
            StickerTraySurface C4I = yqv.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            AbstractC72046XLm.A1R(str, A1I);
        }
        if (yqv.CHf() != null) {
            AbstractC37303Gc4.A1K(yqv.CHf(), A1I);
        }
        if (yqv.CI1() != null) {
            AbstractC37302Gc3.A1V(yqv.CI1(), A1I);
        }
        if (yqv.CIa() != null) {
            AbstractC37303Gc4.A1I(yqv.CIa(), A1I);
        }
        if (yqv.CIh() != null) {
            AbstractC37303Gc4.A1J(yqv.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
