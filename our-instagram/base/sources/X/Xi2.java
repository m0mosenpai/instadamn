package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.StoryThenAndNowStickerDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class Xi2 {
    public static Map A00(YR1 yr1) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (yr1.AdC() != null) {
            AbstractC72046XLm.A1V(yr1.AdC(), A1I);
        }
        if (yr1.AdO() != null) {
            AbstractC72046XLm.A1Y(yr1.AdO(), A1I);
        }
        String str = null;
        if (yr1.Afs() != null) {
            StoryThenAndNowStickerDictIntf Afs = yr1.Afs();
            if (Afs != null) {
                treeUpdaterJNI = Afs.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(1977), treeUpdaterJNI);
        }
        if (yr1.AvN() != null) {
            AbstractC72046XLm.A1Z(yr1.AvN(), A1I);
        }
        if (yr1.Ayd() != null) {
            AbstractC72046XLm.A1W(yr1.Ayd(), A1I);
        }
        if (yr1.B29() != null) {
            AbstractC37303Gc4.A1N(yr1.B29(), A1I);
        }
        if (yr1.BDR() != null) {
            AbstractC37303Gc4.A1L(yr1.BDR(), A1I);
        }
        if (yr1.getId() != null) {
            AbstractC37300Gc1.A12(yr1.getId(), A1I);
        }
        if (yr1.CUY() != null) {
            AbstractC72046XLm.A1X(yr1.CUY(), A1I);
        }
        if (yr1.CVk() != null) {
            AbstractC72046XLm.A1S(yr1.CVk(), A1I);
        }
        if (yr1.CaJ() != null) {
            AbstractC72046XLm.A1T(yr1.CaJ(), A1I);
        }
        if (yr1.Cdh() != null) {
            AbstractC72046XLm.A1U(yr1.Cdh(), A1I);
        }
        if (yr1.getMediaType() != null) {
            AbstractC37300Gc1.A19(yr1.getMediaType(), A1I);
        }
        if (yr1.Bpa() != null) {
            AbstractC37303Gc4.A1M(yr1.Bpa(), A1I);
        }
        if (yr1.Bzq() != null) {
            AbstractC37303Gc4.A1O(yr1.Bzq(), A1I);
        }
        if (yr1.C0i() != null) {
            AbstractC72046XLm.A1a(yr1.C0i(), A1I);
        }
        if (yr1.C3Y() != null) {
            AbstractC72046XLm.A1b(AbstractC72046XLm.A05(yr1.C3Y()), A1I);
        }
        if (yr1.C4I() != null) {
            StickerTraySurface C4I = yr1.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            AbstractC72046XLm.A1R(str, A1I);
        }
        if (yr1.CHf() != null) {
            AbstractC37303Gc4.A1K(yr1.CHf(), A1I);
        }
        if (yr1.CI1() != null) {
            AbstractC37302Gc3.A1V(yr1.CI1(), A1I);
        }
        if (yr1.CIa() != null) {
            AbstractC37303Gc4.A1I(yr1.CIa(), A1I);
        }
        if (yr1.CIh() != null) {
            AbstractC37303Gc4.A1J(yr1.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
