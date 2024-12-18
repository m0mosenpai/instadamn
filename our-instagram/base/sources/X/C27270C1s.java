package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.C1s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27270C1s extends C4A7 {
    public EnumC193878i8 A00;
    public C183978Ee A01;
    public final UserSession A02;
    public final Map A03;
    public final Map A04;
    public final C05A A05;

    public static final C28175CbN A00(C27270C1s c27270C1s) {
        EnumC193878i8 enumC193878i8 = c27270C1s.A00;
        if (enumC193878i8 != null) {
            C183978Ee c183978Ee = c27270C1s.A01;
            if (c183978Ee != null) {
                C183978Ee c183978Ee2 = c183978Ee.A0M;
                if (c183978Ee2 == null) {
                    c183978Ee2 = c183978Ee;
                }
                String str = c183978Ee2.A0h;
                Map map = c27270C1s.A04;
                C45127Jxw c45127Jxw = new C45127Jxw(enumC193878i8, str);
                Object obj = map.get(c45127Jxw);
                if (obj == null) {
                    obj = new C28175CbN();
                    map.put(c45127Jxw, obj);
                }
                return (C28175CbN) obj;
            }
            throw AbstractC166987dD.A12("No photo set");
        }
        throw AbstractC166987dD.A12("No MagicMod Tool set");
    }

    public final C28224CcU A02() {
        C183978Ee c183978Ee = this.A01;
        if (c183978Ee != null) {
            C183978Ee c183978Ee2 = c183978Ee.A0M;
            if (c183978Ee2 == null) {
                c183978Ee2 = c183978Ee;
            }
            return (C28224CcU) this.A03.get(c183978Ee2.A0h);
        }
        return null;
    }

    public final void A03() {
        this.A05.Egh(A02());
        C28175CbN A00 = A00(this);
        A00.A01 = null;
        A00.A02.Egh(C5HZ.A01);
    }

    public final boolean A06() {
        if (this.A00 == null) {
            return false;
        }
        return !((Collection) A00(this).A02.getValue()).isEmpty();
    }

    public /* synthetic */ C27270C1s(UserSession userSession) {
        super("MagicMod", C4A8.A00(1530208012));
        this.A02 = userSession;
        this.A03 = AbstractC166987dD.A1I();
        this.A04 = AbstractC166987dD.A1I();
        this.A05 = AbstractC25227BEk.A0z();
    }

    public final int A01(String str) {
        Iterator A1J = AbstractC25226BEj.A1J(A00(this).A02.getValue());
        int i = 0;
        while (A1J.hasNext()) {
            if (!C14360o3.A0K(((C28224CcU) A1J.next()).A04, str)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public final void A04(C50627MWo c50627MWo, List list) {
        C28175CbN A00 = A00(this);
        C28224CcU c28224CcU = (C28224CcU) AbstractC001800i.A0J(list);
        C28175CbN.A00(A00, c28224CcU);
        A00.A01 = c28224CcU;
        A00.A00 = c50627MWo;
        if (list.size() > 1) {
            Iterator it = list.subList(1, list.size()).iterator();
            while (it.hasNext()) {
                C28175CbN.A00(A00, (C28224CcU) it.next());
            }
        }
        A05((C28224CcU) AbstractC001800i.A0J(list));
    }

    public final void A05(C28224CcU c28224CcU) {
        C28175CbN A00 = A00(this);
        C28175CbN.A00(A00, c28224CcU);
        A00.A01 = c28224CcU;
        this.A05.Egh(c28224CcU);
    }
}
