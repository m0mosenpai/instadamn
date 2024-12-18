package X;

import com.instagram.api.schemas.InstapalCharacterType;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Xhj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC72603Xhj {
    public static Map A00(YR6 yr6) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (yr6.AdC() != null) {
            AbstractC72046XLm.A1V(yr6.AdC(), A1I);
        }
        if (yr6.AdO() != null) {
            AbstractC72046XLm.A1Y(yr6.AdO(), A1I);
        }
        String str2 = null;
        if (yr6.AnA() != null) {
            InstapalCharacterType AnA = yr6.AnA();
            if (AnA != null) {
                str = AnA.A00;
            } else {
                str = null;
            }
            A1I.put(AbstractC111324zv.A00(184), str);
        }
        if (yr6.AvN() != null) {
            AbstractC72046XLm.A1Z(yr6.AvN(), A1I);
        }
        if (yr6.Ayd() != null) {
            AbstractC72046XLm.A1W(yr6.Ayd(), A1I);
        }
        if (yr6.B29() != null) {
            AbstractC37303Gc4.A1N(yr6.B29(), A1I);
        }
        if (yr6.BDR() != null) {
            AbstractC37303Gc4.A1L(yr6.BDR(), A1I);
        }
        if (yr6.getId() != null) {
            AbstractC37300Gc1.A12(yr6.getId(), A1I);
        }
        if (yr6.CUY() != null) {
            AbstractC72046XLm.A1X(yr6.CUY(), A1I);
        }
        if (yr6.CVk() != null) {
            AbstractC72046XLm.A1S(yr6.CVk(), A1I);
        }
        if (yr6.CaJ() != null) {
            AbstractC72046XLm.A1T(yr6.CaJ(), A1I);
        }
        if (yr6.Cdh() != null) {
            AbstractC72046XLm.A1U(yr6.Cdh(), A1I);
        }
        if (yr6.getMediaType() != null) {
            AbstractC37300Gc1.A19(yr6.getMediaType(), A1I);
        }
        if (yr6.Bpa() != null) {
            AbstractC37303Gc4.A1M(yr6.Bpa(), A1I);
        }
        if (yr6.Bzq() != null) {
            AbstractC37303Gc4.A1O(yr6.Bzq(), A1I);
        }
        if (yr6.C0i() != null) {
            AbstractC72046XLm.A1a(yr6.C0i(), A1I);
        }
        if (yr6.C3Y() != null) {
            AbstractC72046XLm.A1b(AbstractC72046XLm.A05(yr6.C3Y()), A1I);
        }
        if (yr6.C4I() != null) {
            StickerTraySurface C4I = yr6.C4I();
            if (C4I != null) {
                str2 = C4I.A00;
            }
            AbstractC72046XLm.A1R(str2, A1I);
        }
        if (yr6.getText() != null) {
            A1I.put("text", yr6.getText());
        }
        if (yr6.CHf() != null) {
            AbstractC37303Gc4.A1K(yr6.CHf(), A1I);
        }
        if (yr6.CI1() != null) {
            AbstractC37302Gc3.A1V(yr6.CI1(), A1I);
        }
        if (yr6.CIa() != null) {
            AbstractC37303Gc4.A1I(yr6.CIa(), A1I);
        }
        if (yr6.CIh() != null) {
            AbstractC37303Gc4.A1J(yr6.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
