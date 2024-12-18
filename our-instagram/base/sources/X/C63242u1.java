package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2u1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63242u1 implements C2u2 {
    public String A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;

    @Override // X.C2u2
    public final /* bridge */ /* synthetic */ void DNT(Object obj, int i, int i2) {
        String str;
        C3XG c3xg = (C3XG) obj;
        C14360o3.A0B(c3xg, 0);
        String str2 = this.A00;
        boolean z = false;
        if (str2 != null) {
            z = AbstractC001900j.A0a(str2, c3xg.A09, false);
        }
        C38321qM A02 = C3XH.A02(c3xg.A05);
        if (A02 != null) {
            if (C1XV.A0Y == c3xg.A06) {
                UserSession userSession = this.A01;
                C5SE c5se = new C5SE(userSession, A02);
                InterfaceC60442pS interfaceC60442pS = this.A02;
                C32U.A0N(userSession, c5se, A02, interfaceC60442pS, C05F.A01, "delivery");
                if (A02.CdW() && !AbstractC61652rS.A08(userSession, AbstractC23021Ah.A00(userSession))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("duplicate_ad_inserted");
                    if (z) {
                        arrayList.add("duplicate_ad_in_view_state");
                    }
                    List singletonList = Collections.singletonList("duplicate_ad_received");
                    C14360o3.A07(singletonList);
                    C32U.A0O(userSession, c5se, A02, interfaceC60442pS, Integer.valueOf(A02.A0n()), "duplicate_ad_received", A02.A2w(), arrayList, singletonList);
                    C3YM.A00(userSession).A06(interfaceC60442pS, c3xg.A07);
                }
            }
            if (A02.CdW()) {
                return;
            }
        }
        C3YO A00 = C3YM.A00(this.A01);
        C3YP c3yp = C3YP.A05;
        Integer num = C05F.A00;
        if (A02 == null || (str = A02.getId()) == null) {
            str = "";
        }
        A00.A07(new C25615BUc(c3yp, num, Integer.valueOf(i2), Integer.valueOf(i), null, null, null, str));
    }

    public C63242u1(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
    }
}
