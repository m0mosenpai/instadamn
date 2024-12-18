package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.5u5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130005u5 {
    public final C64X A00;
    public final C129955u0 A01;
    public final C129985u3 A02;
    public final C129965u1 A03;
    public final C129995u4 A04;

    public final void A00(InterfaceC138736Qd interfaceC138736Qd, C6PT c6pt, C5M1 c5m1, C5M4 c5m4, Object obj, List list) {
        int size;
        C41181vS c41181vS;
        C38321qM c38321qM;
        IgShowreelNativeAnimationIntf Bx7;
        C64X c64x = this.A00;
        if (c64x.CWq() && (size = list.size()) > 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int indexOf = list.indexOf(obj);
            C1341564a c1341564a = (C1341564a) c64x;
            UserSession A00 = C1341564a.A00(c1341564a);
            C06090Tz c06090Tz = C06090Tz.A05;
            int max = Math.max(0, indexOf - ((int) C18U.A01(c06090Tz, A00, 36592245191868799L)));
            int min = Math.min(indexOf + ((int) C18U.A01(c06090Tz, C1341564a.A00(c1341564a), 36592245191803262L)), size - 1);
            if (max <= min) {
                while (true) {
                    Object obj2 = list.get(max);
                    if ((obj2 instanceof C41181vS) && (c41181vS = (C41181vS) obj2) != null && (c38321qM = c41181vS.A0b) != null && (Bx7 = c38321qM.A0C.Bx7()) != null) {
                        linkedHashSet.add(AbstractC37415Gdv.A00(Bx7));
                    }
                    if (max == min) {
                        break;
                    } else {
                        max++;
                    }
                }
            }
            Map map = ((AbstractC115825Lw) c5m4).A0O;
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                if (!linkedHashSet.contains(it.next())) {
                    it.remove();
                    hashCode();
                    map.keySet().size();
                }
            }
            linkedHashSet.removeAll(map.keySet());
            linkedHashSet.remove(c6pt);
            if (!linkedHashSet.isEmpty()) {
                C14120nc.A00().ATO(new C216679iO(1866586969, new RunnableC71544Wvt(interfaceC138736Qd, c5m1, linkedHashSet)));
            }
        }
    }

    public C130005u5(C64X c64x, C129955u0 c129955u0, C129985u3 c129985u3, C129965u1 c129965u1, C129995u4 c129995u4) {
        this.A03 = c129965u1;
        this.A00 = c64x;
        this.A02 = c129985u3;
        this.A04 = c129995u4;
        this.A01 = c129955u0;
    }
}
