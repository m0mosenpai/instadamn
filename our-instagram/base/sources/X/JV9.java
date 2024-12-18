package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class JV9 {
    public final UserSession A00;
    public final JV0 A01;
    public final C4KV A02;
    public final int A03;
    public final C4KN A04;

    public JV9(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AbstractC44195Jfy.A00(userSession);
        this.A03 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36592309613429174L);
        this.A04 = (C4KN) userSession.A01(C4KN.class, MHJ.A00(userSession, 37));
        this.A02 = (C4KV) userSession.A01(C4KV.class, MHJ.A00(userSession, 39));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0163, code lost:
    
        if (X.C11T.A08() != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(com.instagram.common.session.UserSession r31, X.AnonymousClass776 r32, X.C99Z r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JV9.A01(com.instagram.common.session.UserSession, X.776, X.99Z, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final void A02(UserSession userSession, AnonymousClass776 anonymousClass776, C43707JUs c43707JUs, String str, String str2, int i) {
        List list;
        int i2;
        int i3;
        List list2;
        boolean A1b = AbstractC43593JPy.A1b(c43707JUs);
        C0K8.A0D("ArmadilloExpressSnapshotInterceptManager", "makeupDirectThreadPagedResult");
        JV0 jv0 = this.A01;
        if (jv0 != null) {
            jv0.A01(c43707JUs, str2, true);
        }
        List list3 = c43707JUs.A06;
        if (list3 != null) {
            list = AbstractC001800i.A0X(list3);
        } else {
            list = null;
        }
        C4KV c4kv = this.A02;
        if (list != null) {
            i2 = list.size();
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = AbstractC43592JPx.A0e(it).A1Y;
                if (str3 != null) {
                    A1E.add(str3);
                }
            }
            i3 = A1E.size();
            list2 = AbstractC167017dG.A0q(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String A0h = AbstractC43592JPx.A0e(it2).A0h();
                if (A0h == null) {
                    A0h = "";
                }
                list2.add(A0h);
            }
        } else {
            i2 = -1;
            i3 = 0;
            list2 = C16930sl.A00;
        }
        c4kv.A0G(anonymousClass776, list2, i2, i3, c43707JUs.A00().longValue(), c43707JUs.A03(), c43707JUs.A04(userSession));
        DirectThreadKey directThreadKey = new DirectThreadKey(c43707JUs.A1E, null);
        List A19 = AbstractC31172DnG.A19(c43707JUs.A1d);
        C14360o3.A0K(c43707JUs.A0z, true);
        C7OH c7oh = new C7OH(directThreadKey, A19);
        AbstractC207749He.A00();
        JVE.A01(userSession).A0B(c7oh, anonymousClass776, c43707JUs, str, null, i, c43707JUs.A00().longValue(), 600000L, true);
        List list4 = c43707JUs.A06;
        C14360o3.A07(list4);
        c43707JUs.A06 = list4;
        if (jv0 != null) {
            jv0.A01(c43707JUs, str2, A1b);
        }
        c4kv.A0F(anonymousClass776);
    }

    public final ArrayList A00(C43707JUs c43707JUs) {
        String A0l;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (c43707JUs != null) {
            for (Object obj : c43707JUs.A06) {
                C14360o3.A07(obj);
                C83403nh c83403nh = (C83403nh) obj;
                if (c83403nh.A10 == C2EY.A0n && (A0l = c83403nh.A0l()) != null && !AbstractC001900j.A0a(A0l, "locally marked as deleted", false)) {
                    A1E.add(c83403nh);
                }
            }
        }
        return A1E;
    }
}
