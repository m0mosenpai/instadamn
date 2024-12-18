package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.V7e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68033V7e extends AbstractC38087GpG {
    public final C51042Mgs A00;

    public C68033V7e(C51042Mgs c51042Mgs) {
        C14360o3.A0B(c51042Mgs, 1);
        this.A00 = c51042Mgs;
    }

    @Override // X.InterfaceC57967PnD
    /* renamed from: A06, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C5qT BAM(AbstractC127945qN abstractC127945qN) {
        C5qT c5qT;
        C14360o3.A0B(abstractC127945qN, 0);
        Map map = (Map) this.A00.A06.A02();
        if (map == null || (c5qT = (C5qT) map.get(abstractC127945qN.getKey())) == null) {
            return new C5qT(-1, -1);
        }
        return c5qT;
    }

    public final void A08(int i, int i2, Object obj) {
        if (obj instanceof C128005qU) {
            C51042Mgs c51042Mgs = this.A00;
            C55168OdW c55168OdW = c51042Mgs.A0C;
            String str = c51042Mgs.A0F;
            String str2 = c51042Mgs.A0G;
            C55168OdW.A03(c55168OdW, str, str2, new C30174DRe(obj, i, C55168OdW.A02(c55168OdW, str, str2).getValue(), i2, 8));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Attempt to add invalid section type ");
        sb.append(obj.getClass());
        C0w9.A03("SerpRecyclerDataSource", AbstractC58320PtC.A12(" at ", sb, i));
    }

    @Override // X.XLO
    public final void EWn(C07X c07x, MTQ mtq) {
        C14360o3.A0B(mtq, 0);
        this.A00.A05.A09(new C31421DrQ(6, new C57750Pjd(46, this, mtq)));
    }

    @Override // X.AbstractC38087GpG
    public final Iterator A04() {
        Iterator it;
        List list = (List) this.A00.A05.A02();
        if (list == null || (it = list.iterator()) == null) {
            return C16930sl.A00.iterator();
        }
        return it;
    }

    public final int A05() {
        return C51042Mgs.A01(this.A00).A0H.size();
    }

    public final InterfaceC127975qQ A07(Object obj) {
        if (obj instanceof C38321qM) {
            C51042Mgs c51042Mgs = this.A00;
            C38321qM c38321qM = (C38321qM) obj;
            C14360o3.A0B(c38321qM, 0);
            List list = (List) c51042Mgs.A05.A02();
            Object obj2 = null;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if ((obj3 instanceof InterfaceC127975qQ) && obj3 != null) {
                    arrayList.add(obj3);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C14360o3.A0K(((InterfaceC127975qQ) next).BQN().getId(), c38321qM.getId())) {
                    obj2 = next;
                    break;
                }
            }
            return (InterfaceC127975qQ) obj2;
        }
        return null;
    }
}
