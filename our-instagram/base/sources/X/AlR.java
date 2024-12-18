package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes4.dex */
public final class AlR implements InterfaceC169117gk {
    public final C195218kN A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    @Override // X.InterfaceC169117gk
    public final Object E7Q(String str) {
        C14360o3.A0B(str, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C195218kN c195218kN = this.A00;
        String str2 = this.A02;
        c195218kN.A08(null, str2, str, linkedHashSet);
        List list = this.A04;
        if (list != null) {
            AbstractC169147gn.A00(null, str, list, linkedHashSet);
        }
        ArrayList A0U = AbstractC001800i.A0U(linkedHashSet);
        c195218kN.A09(str2, A0U);
        return new C22869A6p(A0U, linkedHashSet);
    }

    public AlR(UserSession userSession, String str, String str2, List list) {
        this.A01 = userSession;
        this.A02 = str;
        this.A04 = list;
        this.A03 = str2;
        C195218kN A00 = C195218kN.A00(userSession);
        C14360o3.A07(A00);
        this.A00 = A00;
    }

    @Override // X.InterfaceC169117gk
    public final /* bridge */ /* synthetic */ Object AIV(Object obj, Object obj2) {
        List list = (List) obj2;
        UserSession userSession = this.A01;
        String str = this.A03;
        C01L A1I = C0eM.A1I();
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj3 : list) {
                if ((obj3 instanceof C9ZB) && obj3 != null) {
                    A1E.add(obj3);
                }
            }
            A6B a6b = (A6B) userSession.A01(A6B.class, B85.A00);
            synchronized (a6b) {
                a6b.A00.put(str, A1E);
            }
            A1I.add(new C31335Dq0(2131954834));
            A1I.add(new C51756Mtf((List) A1E, 28));
        }
        if (obj != null && (obj instanceof C22869A6p)) {
            A1I.add(new C31335Dq0(2131969515));
            A1I.addAll(((C22869A6p) obj).A00);
        }
        return C0eM.A1J(A1I);
    }

    @Override // X.InterfaceC169117gk
    public final /* bridge */ /* synthetic */ Object ARP() {
        return C16930sl.A00;
    }
}
