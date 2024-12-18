package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.StoryGroupMentionTappableDataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Xhi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC72602Xhi {
    public static Map A00(InterfaceC73622YQk interfaceC73622YQk) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC73622YQk.AdC() != null) {
            AbstractC72046XLm.A1V(interfaceC73622YQk.AdC(), A1I);
        }
        if (interfaceC73622YQk.AdO() != null) {
            AbstractC72046XLm.A1Y(interfaceC73622YQk.AdO(), A1I);
        }
        if (interfaceC73622YQk.AvN() != null) {
            AbstractC72046XLm.A1Z(interfaceC73622YQk.AvN(), A1I);
        }
        if (interfaceC73622YQk.Ayd() != null) {
            AbstractC72046XLm.A1W(interfaceC73622YQk.Ayd(), A1I);
        }
        if (interfaceC73622YQk.B29() != null) {
            AbstractC37303Gc4.A1N(interfaceC73622YQk.B29(), A1I);
        }
        String str = null;
        if (interfaceC73622YQk.BAa() != null) {
            StoryGroupMentionTappableDataIntf BAa = interfaceC73622YQk.BAa();
            if (BAa != null) {
                treeUpdaterJNI = BAa.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(4519), treeUpdaterJNI);
        }
        if (interfaceC73622YQk.BDR() != null) {
            AbstractC37303Gc4.A1L(interfaceC73622YQk.BDR(), A1I);
        }
        if (interfaceC73622YQk.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC73622YQk.getId(), A1I);
        }
        if (interfaceC73622YQk.CUY() != null) {
            AbstractC72046XLm.A1X(interfaceC73622YQk.CUY(), A1I);
        }
        if (interfaceC73622YQk.CVk() != null) {
            AbstractC72046XLm.A1S(interfaceC73622YQk.CVk(), A1I);
        }
        if (interfaceC73622YQk.CaJ() != null) {
            AbstractC72046XLm.A1T(interfaceC73622YQk.CaJ(), A1I);
        }
        if (interfaceC73622YQk.Cdh() != null) {
            AbstractC72046XLm.A1U(interfaceC73622YQk.Cdh(), A1I);
        }
        if (interfaceC73622YQk.getMediaType() != null) {
            AbstractC37300Gc1.A19(interfaceC73622YQk.getMediaType(), A1I);
        }
        if (interfaceC73622YQk.Bpa() != null) {
            AbstractC37303Gc4.A1M(interfaceC73622YQk.Bpa(), A1I);
        }
        if (interfaceC73622YQk.Bzq() != null) {
            AbstractC37303Gc4.A1O(interfaceC73622YQk.Bzq(), A1I);
        }
        if (interfaceC73622YQk.C0i() != null) {
            AbstractC72046XLm.A1a(interfaceC73622YQk.C0i(), A1I);
        }
        if (interfaceC73622YQk.C3Y() != null) {
            AbstractC72046XLm.A1b(AbstractC72046XLm.A05(interfaceC73622YQk.C3Y()), A1I);
        }
        if (interfaceC73622YQk.C4I() != null) {
            StickerTraySurface C4I = interfaceC73622YQk.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            AbstractC72046XLm.A1R(str, A1I);
        }
        if (interfaceC73622YQk.CHf() != null) {
            AbstractC37303Gc4.A1K(interfaceC73622YQk.CHf(), A1I);
        }
        if (interfaceC73622YQk.CI1() != null) {
            AbstractC37302Gc3.A1V(interfaceC73622YQk.CI1(), A1I);
        }
        if (interfaceC73622YQk.CIa() != null) {
            AbstractC37303Gc4.A1I(interfaceC73622YQk.CIa(), A1I);
        }
        if (interfaceC73622YQk.CIh() != null) {
            AbstractC37303Gc4.A1J(interfaceC73622YQk.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
