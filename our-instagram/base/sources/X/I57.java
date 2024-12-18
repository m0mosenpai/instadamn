package X;

import com.instagram.api.schemas.IGUserHighlightsTrayType;
import com.instagram.reels.api.ReelsTrayQueryResponseImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I57 {
    public static final C3LZ A00(ReelsTrayQueryResponseImpl reelsTrayQueryResponseImpl) {
        ArrayList arrayList;
        C74433Vz c74433Vz;
        C37771pE c37771pE;
        C114855Gv c114855Gv;
        ArrayList arrayList2;
        Object treeValue = reelsTrayQueryResponseImpl.getTreeValue(AbstractC58317Pt9.A00(1049), C73323Qi.class);
        C14360o3.A0C(treeValue, "null cannot be cast to non-null type com.instagram.model.reels.ReelTrayResponseIntf");
        C3NQ c3nq = (C3NQ) treeValue;
        C14360o3.A0B(c3nq, 1);
        List AiP = c3nq.AiP();
        String Aib = c3nq.Aib();
        C3W0 Anv = c3nq.Anv();
        String AvB = c3nq.AvB();
        Boolean BCE = c3nq.BCE();
        IGUserHighlightsTrayType BEC = c3nq.BEC();
        Boolean Cdu = c3nq.Cdu();
        Integer BPH = c3nq.BPH();
        Integer BPI = c3nq.BPI();
        Boolean BW1 = c3nq.BW1();
        Integer BX1 = c3nq.BX1();
        C3NM Bch = c3nq.Bch();
        Integer Bm7 = c3nq.Bm7();
        List BmL = c3nq.BmL();
        List Bp5 = c3nq.Bp5();
        InterfaceC37791pH Bsz = c3nq.Bsz();
        InterfaceC114865Gw BuL = c3nq.BuL();
        Boolean C14 = c3nq.C14();
        String C25 = c3nq.C25();
        List CAq = c3nq.CAq();
        C3NK c3nk = null;
        C1DY c1dy = new C1DY((C1DV) new C37761pD(null), 6, false);
        if (AiP != null) {
            arrayList = AbstractC167007dF.A0i(AiP);
            Iterator it = AiP.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC37961pd) it.next()).ErP(c1dy));
            }
        } else {
            arrayList = null;
        }
        if (Anv != null) {
            c74433Vz = Anv.Ero(c1dy);
        } else {
            c74433Vz = null;
        }
        if (Bch != null) {
            c3nk = Bch.Exv();
        }
        if (Bsz != null) {
            c37771pE = Bsz.F5R(c1dy);
        } else {
            c37771pE = null;
        }
        if (BuL != null) {
            c114855Gv = BuL.Exu(c1dy);
        } else {
            c114855Gv = null;
        }
        if (CAq != null) {
            arrayList2 = AbstractC167007dF.A0i(CAq);
            Iterator it2 = CAq.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((InterfaceC37791pH) it2.next()).F5R(c1dy));
            }
        } else {
            arrayList2 = null;
        }
        C3NO c3no = new C3NO(c74433Vz, BEC, c114855Gv, c3nk, c37771pE, BCE, Cdu, BW1, C14, BPH, BPI, BX1, Bm7, Aib, AvB, C25, arrayList, BmL, Bp5, arrayList2);
        C3LZ c3lz = new C3LZ();
        c3lz.A06 = c3no;
        return c3lz;
    }
}
