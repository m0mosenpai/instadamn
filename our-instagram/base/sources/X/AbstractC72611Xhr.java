package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.model.shopping.reels.ProductStickerIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Xhr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC72611Xhr {
    public static Map A00(InterfaceC73630YQs interfaceC73630YQs) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC73630YQs.AdC() != null) {
            AbstractC72046XLm.A1V(interfaceC73630YQs.AdC(), A1I);
        }
        if (interfaceC73630YQs.AdO() != null) {
            AbstractC72046XLm.A1Y(interfaceC73630YQs.AdO(), A1I);
        }
        if (interfaceC73630YQs.AvN() != null) {
            AbstractC72046XLm.A1Z(interfaceC73630YQs.AvN(), A1I);
        }
        if (interfaceC73630YQs.Ayd() != null) {
            AbstractC72046XLm.A1W(interfaceC73630YQs.Ayd(), A1I);
        }
        if (interfaceC73630YQs.B29() != null) {
            AbstractC37303Gc4.A1N(interfaceC73630YQs.B29(), A1I);
        }
        if (interfaceC73630YQs.BDR() != null) {
            AbstractC37303Gc4.A1L(interfaceC73630YQs.BDR(), A1I);
        }
        if (interfaceC73630YQs.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC73630YQs.getId(), A1I);
        }
        if (interfaceC73630YQs.CUY() != null) {
            AbstractC72046XLm.A1X(interfaceC73630YQs.CUY(), A1I);
        }
        if (interfaceC73630YQs.CVk() != null) {
            AbstractC72046XLm.A1S(interfaceC73630YQs.CVk(), A1I);
        }
        if (interfaceC73630YQs.CaJ() != null) {
            AbstractC72046XLm.A1T(interfaceC73630YQs.CaJ(), A1I);
        }
        if (interfaceC73630YQs.Cdh() != null) {
            AbstractC72046XLm.A1U(interfaceC73630YQs.Cdh(), A1I);
        }
        if (interfaceC73630YQs.getMediaType() != null) {
            AbstractC37300Gc1.A19(interfaceC73630YQs.getMediaType(), A1I);
        }
        String str = null;
        if (interfaceC73630YQs.BhJ() != null) {
            ProductStickerIntf BhJ = interfaceC73630YQs.BhJ();
            if (BhJ != null) {
                treeUpdaterJNI = BhJ.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(5106), treeUpdaterJNI);
        }
        if (interfaceC73630YQs.Bpa() != null) {
            AbstractC37303Gc4.A1M(interfaceC73630YQs.Bpa(), A1I);
        }
        if (interfaceC73630YQs.Bzq() != null) {
            AbstractC37303Gc4.A1O(interfaceC73630YQs.Bzq(), A1I);
        }
        if (interfaceC73630YQs.C0i() != null) {
            AbstractC72046XLm.A1a(interfaceC73630YQs.C0i(), A1I);
        }
        if (interfaceC73630YQs.C3Y() != null) {
            AbstractC72046XLm.A1b(AbstractC72046XLm.A05(interfaceC73630YQs.C3Y()), A1I);
        }
        if (interfaceC73630YQs.C4I() != null) {
            StickerTraySurface C4I = interfaceC73630YQs.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            AbstractC72046XLm.A1R(str, A1I);
        }
        if (interfaceC73630YQs.CHf() != null) {
            AbstractC37303Gc4.A1K(interfaceC73630YQs.CHf(), A1I);
        }
        if (interfaceC73630YQs.CI1() != null) {
            AbstractC37302Gc3.A1V(interfaceC73630YQs.CI1(), A1I);
        }
        if (interfaceC73630YQs.CIa() != null) {
            AbstractC37303Gc4.A1I(interfaceC73630YQs.CIa(), A1I);
        }
        if (interfaceC73630YQs.CIh() != null) {
            AbstractC37303Gc4.A1J(interfaceC73630YQs.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
