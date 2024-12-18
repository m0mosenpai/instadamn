package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.On8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55623On8 implements CallerContextable {
    public static final String __redex_internal_original_name = "AutoXpostingMutationController";
    public final UserSession A00;

    public static final void A00(C55623On8 c55623On8, Integer num, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OTO oto = (OTO) it.next();
            String str = oto.A00;
            boolean z = oto.A01;
            int hashCode = str.hashCode();
            if (hashCode != 2153886) {
                if (hashCode != 77853049) {
                    if (hashCode == 79233237 && str.equals("STORY")) {
                        C195918ld.A05.A01(c55623On8.A00, num, "upsell", z, true);
                    }
                } else if (str.equals("REELS")) {
                    C200108tF.A0A(c55623On8.A00, "mutation", z, false);
                }
            } else if (str.equals("FEED")) {
                C196208mB.A03.A01(c55623On8.A00, num, "upsell", z, false);
            }
        }
    }

    public final void A01(List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        AbstractC167017dG.A1S(interfaceC16820sZ, interfaceC16820sZ2);
        UserSession userSession = this.A00;
        CallerContext callerContext = C180377zR.A00;
        int intValue = AbstractC196078lx.A00(userSession).intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                OVK.A00.A00(userSession, new PG2(this, list, interfaceC16820sZ, interfaceC16820sZ2), list);
                return;
            }
            return;
        }
        MY8.A00.A01(userSession, new PG3(this, list, interfaceC16820sZ, interfaceC16820sZ2), list);
    }

    public C55623On8(UserSession userSession) {
        this.A00 = userSession;
    }
}
