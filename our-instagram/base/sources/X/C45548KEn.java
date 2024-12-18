package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KEn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45548KEn extends C1P1 {
    public final long A00;
    public final UserSession A01;
    public final C7OH A02;
    public final String A03;
    public final List A04;

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(682826046);
        C7BA c7ba = (C7BA) obj;
        int A032 = C0f9.A03(-803768012);
        C14360o3.A0B(c7ba, 0);
        String str = this.A03;
        C28891aS A00 = AbstractC207749He.A00();
        UserSession userSession = this.A01;
        A00.A00(userSession);
        long j = this.A00;
        C7OH c7oh = this.A02;
        List list = this.A04;
        AbstractC25233BEq.A0v(0, userSession, c7oh, list);
        C14360o3.A0B(str, 5);
        if (j != -1 && c7ba.A00 != null) {
            AbstractC207749He.A00();
            JV6 A01 = JVE.A01(userSession);
            List list2 = c7ba.A00;
            ArrayList A10 = AbstractC31174DnI.A10(list2);
            for (Object obj2 : list2) {
                if (((C83403nh) obj2).A10 == C2EY.A0n) {
                    A10.add(obj2);
                }
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = A10.iterator();
            while (it.hasNext()) {
                String str2 = AbstractC43592JPx.A0e(it).A1Y;
                if (str2 != null) {
                    A1E.add(str2);
                }
            }
            c7ba.A00.addAll((Collection) A01.A09(c7oh, str, "intercept_message_response", list, A1E, 0, j, 1000L).A00);
            List list3 = c7ba.A00;
            C14360o3.A07(list3);
            if (list3.size() > 1) {
                JUD.A01(20, list3);
            }
        }
        C0f9.A0A(300306610, A032);
        C0f9.A0A(1828736619, A03);
    }

    public C45548KEn(UserSession userSession, C7OH c7oh, String str, List list, long j) {
        this.A01 = userSession;
        this.A00 = j;
        this.A04 = list;
        this.A02 = c7oh;
        this.A03 = str;
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        C0f9.A0A(-589932423, C0f9.A03(-1585069703));
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(555824184);
        this.A04.size();
        C0f9.A0A(-1451564944, A03);
    }
}
