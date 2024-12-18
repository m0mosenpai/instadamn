package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.model.shopping.reels.MultiProductStickerIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Xhl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC72605Xhl {
    public static Map A00(InterfaceC73624YQm interfaceC73624YQm) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC73624YQm.AdC() != null) {
            AbstractC72046XLm.A1V(interfaceC73624YQm.AdC(), A1I);
        }
        if (interfaceC73624YQm.AdO() != null) {
            AbstractC72046XLm.A1Y(interfaceC73624YQm.AdO(), A1I);
        }
        if (interfaceC73624YQm.AvN() != null) {
            AbstractC72046XLm.A1Z(interfaceC73624YQm.AvN(), A1I);
        }
        if (interfaceC73624YQm.Ayd() != null) {
            AbstractC72046XLm.A1W(interfaceC73624YQm.Ayd(), A1I);
        }
        if (interfaceC73624YQm.B29() != null) {
            AbstractC37303Gc4.A1N(interfaceC73624YQm.B29(), A1I);
        }
        if (interfaceC73624YQm.BDR() != null) {
            AbstractC37303Gc4.A1L(interfaceC73624YQm.BDR(), A1I);
        }
        if (interfaceC73624YQm.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC73624YQm.getId(), A1I);
        }
        if (interfaceC73624YQm.CUY() != null) {
            AbstractC72046XLm.A1X(interfaceC73624YQm.CUY(), A1I);
        }
        if (interfaceC73624YQm.CVk() != null) {
            AbstractC72046XLm.A1S(interfaceC73624YQm.CVk(), A1I);
        }
        if (interfaceC73624YQm.CaJ() != null) {
            AbstractC72046XLm.A1T(interfaceC73624YQm.CaJ(), A1I);
        }
        if (interfaceC73624YQm.Cdh() != null) {
            AbstractC72046XLm.A1U(interfaceC73624YQm.Cdh(), A1I);
        }
        if (interfaceC73624YQm.getMediaType() != null) {
            AbstractC37300Gc1.A19(interfaceC73624YQm.getMediaType(), A1I);
        }
        String str = null;
        if (interfaceC73624YQm.BVP() != null) {
            MultiProductStickerIntf BVP = interfaceC73624YQm.BVP();
            if (BVP != null) {
                treeUpdaterJNI = BVP.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(2728), treeUpdaterJNI);
        }
        if (interfaceC73624YQm.Bpa() != null) {
            AbstractC37303Gc4.A1M(interfaceC73624YQm.Bpa(), A1I);
        }
        if (interfaceC73624YQm.Bzq() != null) {
            AbstractC37303Gc4.A1O(interfaceC73624YQm.Bzq(), A1I);
        }
        if (interfaceC73624YQm.C0i() != null) {
            AbstractC72046XLm.A1a(interfaceC73624YQm.C0i(), A1I);
        }
        if (interfaceC73624YQm.C3Y() != null) {
            AbstractC72046XLm.A1b(AbstractC72046XLm.A05(interfaceC73624YQm.C3Y()), A1I);
        }
        if (interfaceC73624YQm.C4I() != null) {
            StickerTraySurface C4I = interfaceC73624YQm.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            AbstractC72046XLm.A1R(str, A1I);
        }
        if (interfaceC73624YQm.CHf() != null) {
            AbstractC37303Gc4.A1K(interfaceC73624YQm.CHf(), A1I);
        }
        if (interfaceC73624YQm.CI1() != null) {
            AbstractC37302Gc3.A1V(interfaceC73624YQm.CI1(), A1I);
        }
        if (interfaceC73624YQm.CIa() != null) {
            AbstractC37303Gc4.A1I(interfaceC73624YQm.CIa(), A1I);
        }
        if (interfaceC73624YQm.CIh() != null) {
            AbstractC37303Gc4.A1J(interfaceC73624YQm.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
