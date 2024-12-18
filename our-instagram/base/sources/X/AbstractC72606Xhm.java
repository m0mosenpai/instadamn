package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.StoryMusicPickTappableDataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Xhm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC72606Xhm {
    public static Map A00(InterfaceC73625YQn interfaceC73625YQn) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC73625YQn.AdC() != null) {
            AbstractC72046XLm.A1V(interfaceC73625YQn.AdC(), A1I);
        }
        if (interfaceC73625YQn.AdO() != null) {
            AbstractC72046XLm.A1Y(interfaceC73625YQn.AdO(), A1I);
        }
        if (interfaceC73625YQn.AvN() != null) {
            AbstractC72046XLm.A1Z(interfaceC73625YQn.AvN(), A1I);
        }
        if (interfaceC73625YQn.Ayd() != null) {
            AbstractC72046XLm.A1W(interfaceC73625YQn.Ayd(), A1I);
        }
        if (interfaceC73625YQn.B29() != null) {
            AbstractC37303Gc4.A1N(interfaceC73625YQn.B29(), A1I);
        }
        if (interfaceC73625YQn.BDR() != null) {
            AbstractC37303Gc4.A1L(interfaceC73625YQn.BDR(), A1I);
        }
        if (interfaceC73625YQn.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC73625YQn.getId(), A1I);
        }
        if (interfaceC73625YQn.CUY() != null) {
            AbstractC72046XLm.A1X(interfaceC73625YQn.CUY(), A1I);
        }
        if (interfaceC73625YQn.CVk() != null) {
            AbstractC72046XLm.A1S(interfaceC73625YQn.CVk(), A1I);
        }
        if (interfaceC73625YQn.CaJ() != null) {
            AbstractC72046XLm.A1T(interfaceC73625YQn.CaJ(), A1I);
        }
        if (interfaceC73625YQn.Cdh() != null) {
            AbstractC72046XLm.A1U(interfaceC73625YQn.Cdh(), A1I);
        }
        if (interfaceC73625YQn.getMediaType() != null) {
            AbstractC37300Gc1.A19(interfaceC73625YQn.getMediaType(), A1I);
        }
        String str = null;
        if (interfaceC73625YQn.BVg() != null) {
            StoryMusicPickTappableDataIntf BVg = interfaceC73625YQn.BVg();
            if (BVg != null) {
                treeUpdaterJNI = BVg.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(2738), treeUpdaterJNI);
        }
        if (interfaceC73625YQn.Bpa() != null) {
            AbstractC37303Gc4.A1M(interfaceC73625YQn.Bpa(), A1I);
        }
        if (interfaceC73625YQn.Bzq() != null) {
            AbstractC37303Gc4.A1O(interfaceC73625YQn.Bzq(), A1I);
        }
        if (interfaceC73625YQn.C0i() != null) {
            AbstractC72046XLm.A1a(interfaceC73625YQn.C0i(), A1I);
        }
        if (interfaceC73625YQn.C3Y() != null) {
            AbstractC72046XLm.A1b(AbstractC72046XLm.A05(interfaceC73625YQn.C3Y()), A1I);
        }
        if (interfaceC73625YQn.C4I() != null) {
            StickerTraySurface C4I = interfaceC73625YQn.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            AbstractC72046XLm.A1R(str, A1I);
        }
        if (interfaceC73625YQn.CHf() != null) {
            AbstractC37303Gc4.A1K(interfaceC73625YQn.CHf(), A1I);
        }
        if (interfaceC73625YQn.CI1() != null) {
            AbstractC37302Gc3.A1V(interfaceC73625YQn.CI1(), A1I);
        }
        if (interfaceC73625YQn.CIa() != null) {
            AbstractC37303Gc4.A1I(interfaceC73625YQn.CIa(), A1I);
        }
        if (interfaceC73625YQn.CIh() != null) {
            AbstractC37303Gc4.A1J(interfaceC73625YQn.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
