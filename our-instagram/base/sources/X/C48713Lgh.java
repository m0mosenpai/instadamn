package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.comments.DirectMessageComments;
import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lgh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48713Lgh implements C7V0, C7V1, C7V2 {
    public C7TT A00;
    public C2EC A01;
    public final UserSession A03;
    public final AnonymousClass988 A04;
    public final C17060sy A06;
    public final C164097Vy A07;
    public final C98K A08;
    public final C7VF A09;
    public final C42201xA A02 = AbstractC42021ws.A00();
    public final C163507Tn A05 = new C163507Tn(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3);

    /* JADX WARN: Multi-variable type inference failed */
    public C48713Lgh(UserSession userSession, C98K c98k, AnonymousClass988 anonymousClass988, C7VF c7vf) {
        this.A03 = userSession;
        this.A09 = c7vf;
        this.A04 = anonymousClass988;
        this.A08 = c98k;
        this.A06 = C08730cb.A00(userSession);
        this.A07 = (C164097Vy) userSession.A01(C164097Vy.class, new C50252MHh(userSession, 15));
    }

    @Override // X.C7V1
    public final void DTN(List list) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.7M2] */
    @Override // X.C7V1
    public final void DTO(C7TT c7tt, List list, long j) {
        C14360o3.A0B(c7tt, 0);
        C163507Tn c163507Tn = this.A05;
        c163507Tn.A01.clear();
        c163507Tn.A00.clear();
        ArrayList A01 = A01(list);
        ?? obj = new Object();
        obj.A00(0);
        obj.A00(A01.size() - 1);
        A02(obj, A01);
        this.A02.accept(A00(A01));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, X.7M2] */
    @Override // X.C7V2
    public final void DxD(C7TT c7tt, Integer num, List list, List list2, List list3) {
        List list4;
        List list5;
        int size;
        ArrayList A1E = AbstractC166987dD.A1E();
        C42201xA c42201xA = this.A02;
        C51758Mth c51758Mth = (C51758Mth) c42201xA.A0W();
        if (c51758Mth == null || (list4 = (List) c51758Mth.A00) == null) {
            list4 = C16930sl.A00;
        }
        if (list != null) {
            list5 = A01(list);
        } else {
            list5 = C16930sl.A00;
        }
        ?? obj = new Object();
        int i = 0;
        if (list5.isEmpty()) {
            A1E.addAll(list4);
        } else {
            if (list4.isEmpty()) {
                A1E.addAll(list5);
            } else {
                C162297Or c162297Or = ((C160787Im) list5.get(AbstractC31172DnG.A03(list5, 1))).A0F;
                C162297Or c162297Or2 = ((C160787Im) list4.get(0)).A0F;
                long j = c162297Or.A00;
                long j2 = c162297Or2.A00;
                if (j == j2) {
                    j = c162297Or.A01;
                    j2 = c162297Or2.A01;
                }
                if (C14360o3.A01(j, j2) < 0) {
                    A1E.addAll(list5);
                    A1E.addAll(list4);
                } else {
                    C162297Or c162297Or3 = ((C160787Im) list5.get(0)).A0F;
                    C162297Or c162297Or4 = ((C160787Im) list4.get(AbstractC31172DnG.A03(list4, 1))).A0F;
                    long j3 = c162297Or3.A00;
                    long j4 = c162297Or4.A00;
                    if (j3 == j4) {
                        j3 = c162297Or3.A01;
                        j4 = c162297Or4.A01;
                    }
                    if (C14360o3.A01(j3, j4) > 0) {
                        A1E.addAll(list4);
                        A1E.addAll(list5);
                        obj.A00(list4.size());
                        size = list4.size() + A1E.size();
                        obj.A00(size - 1);
                    } else {
                        C0f5 AEp = C18950wb.A01.AEp("on_update_thread_event_ready_for_UI_error", 20134884);
                        if (AbstractC166987dD.A1b(list5)) {
                            AEp.ABW("time_stamp_of_last_element_of_filtered_added_message", ((C160787Im) list5.get(AbstractC25226BEj.A05(list5))).A0F.toString());
                            AEp.ABW("time_stamp_of_first_element_of_filtered_added_message", ((C160787Im) list5.get(0)).A0F.toString());
                        }
                        if (AbstractC166987dD.A1b(list4)) {
                            AEp.ABW("time_stamp_of_first_element_of_current_message", ((C160787Im) list4.get(0)).A0F.toString());
                            AEp.ABW("time_stamp_of_last_element_of_current_message", ((C160787Im) list4.get(AbstractC25226BEj.A05(list4))).A0F.toString());
                        }
                        AEp.report();
                        A1E.addAll(list4);
                        A1E.addAll(list5);
                        if (A1E.size() > 1) {
                            JUD.A01(33, A1E);
                        }
                    }
                }
            }
            obj.A00(0);
            size = A1E.size();
            obj.A00(size - 1);
        }
        if (list3 != null) {
            A01(list3);
        }
        if (list2 != null) {
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                boolean A0u = AbstractC001800i.A0u(list2, ((C160787Im) next).A0e.A0h());
                if (A0u) {
                    obj.A02(i);
                    if (!(!A0u)) {
                        i = i2;
                    }
                }
                A1E2.add(next);
                i = i2;
            }
            A1E = AbstractC001800i.A0U(A1E2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it2);
                C163507Tn c163507Tn = this.A05;
                C160787Im A01 = c163507Tn.A01(A1B);
                if (A01 != null) {
                    c163507Tn.A03(A01);
                }
            }
        }
        A02(obj, A1E);
        c42201xA.accept(A00(A1E));
    }

    @Override // X.C7V0
    public final ArrayList EqQ(C7TT c7tt, List list) {
        C14360o3.A0B(c7tt, 0);
        InterfaceC83733oI interfaceC83733oI = c7tt.A0P;
        if (interfaceC83733oI != null && AbstractC140946Yw.A08(interfaceC83733oI)) {
            if (!c7tt.equals(this.A00)) {
                this.A00 = c7tt;
                C83693oE A01 = AbstractC1345466e.A01(interfaceC83733oI);
                C2DS A00 = AbstractC28761aE.A00(this.A03);
                String str = A01.A00;
                C14360o3.A0B(str, 0);
                this.A01 = ((C2DU) A00).A0N(str);
            }
            C164097Vy c164097Vy = this.A07;
            C2EC c2ec = this.A01;
            C7VF c7vf = this.A09;
            return c164097Vy.A00(this.A08, this.A04, (C7VV) C47896LDq.A00.getValue(), c7tt, c2ec, c7vf, list);
        }
        throw AbstractC166987dD.A14("threadMetadata's threadId is not an open thread id");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (X.C14360o3.A0K(r1, r0) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C51758Mth A00(java.util.List r4) {
        /*
            r3 = this;
            X.1xA r0 = r3.A02
            java.lang.Object r0 = r0.A0W()
            X.Mth r0 = (X.C51758Mth) r0
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L18
            boolean r0 = r0.A01
            if (r0 != r2) goto L18
        L10:
            r1 = 23
            X.Mth r0 = new X.Mth
            r0.<init>(r1, r2, r4)
            return r0
        L18:
            X.2EC r0 = r3.A01
            if (r0 == 0) goto L45
            boolean r0 = r0.CLS()
            if (r0 != 0) goto L45
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L10
            java.lang.Object r0 = r4.get(r1)
            X.7Im r0 = (X.C160787Im) r0
            X.3nh r0 = r0.A0e
            java.lang.String r1 = r0.A0h()
            X.2EC r0 = r3.A01
            if (r0 == 0) goto L43
            java.lang.String r0 = r0.C7V()
        L3c:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L45
            goto L10
        L43:
            r0 = 0
            goto L3c
        L45:
            r2 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48713Lgh.A00(java.util.List):X.Mth");
    }

    private final void A02(C7M2 c7m2, List list) {
        Number number;
        Number number2;
        C83403nh c83403nh;
        boolean z;
        DirectMessageComments directMessageComments;
        C09530e4 c09530e4 = c7m2.A00;
        if (c09530e4 != null && (number = (Number) c09530e4.A00) != null && (number2 = (Number) c09530e4.A01) != null) {
            int intValue = number.intValue();
            int intValue2 = number2.intValue();
            int max = Math.max(intValue - 1, 0);
            int min = Math.min(intValue2 + 1, list.size());
            if (max > min) {
                return;
            }
            while (true) {
                C160787Im c160787Im = (C160787Im) AbstractC001800i.A0O(list, max);
                if (c160787Im != null) {
                    C83403nh c83403nh2 = c160787Im.A0e;
                    C14360o3.A07(c83403nh2);
                    C160787Im c160787Im2 = (C160787Im) AbstractC001800i.A0O(list, max + 1);
                    if (c160787Im2 != null) {
                        c83403nh = c160787Im2.A0e;
                    } else {
                        c83403nh = null;
                    }
                    C7P8 A0f = AbstractC43594JPz.A0f(c83403nh2);
                    MessagingUser A00 = MessagingUser.A00(this.A06.A00());
                    if (!c83403nh2.A1O() && ((directMessageComments = c83403nh2.A0q) == null || directMessageComments.A00 <= 0)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    int A002 = AbstractC162557Ps.A00(A00, c83403nh2, c83403nh, A0f, z, true);
                    if (c160787Im.A00 != A002) {
                        c160787Im.A00 = A002;
                    }
                }
                if (max != min) {
                    max++;
                } else {
                    return;
                }
            }
        }
    }

    private final ArrayList A01(List list) {
        C83693oE c83693oE;
        InterfaceC83733oI interfaceC83733oI;
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList<C160787Im> A1E2 = AbstractC166987dD.A1E();
        for (Object obj : list) {
            AbstractC25228BEl.A1Q(obj, A1E2, ((C160787Im) obj).A0e.A2D ? 1 : 0);
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1E2);
        for (C160787Im c160787Im : A1E2) {
            C83403nh c83403nh = c160787Im.A0e;
            C14360o3.A07(c83403nh);
            C163507Tn c163507Tn = this.A05;
            C160787Im A00 = c163507Tn.A00(c83403nh);
            if (A00 != null) {
                C83403nh c83403nh2 = A00.A0e;
                C14360o3.A07(c83403nh2);
                if (!c83403nh2.equals(c83403nh)) {
                    UserSession userSession = this.A03;
                    C7TT c7tt = this.A00;
                    if (c7tt != null && (interfaceC83733oI = c7tt.A0P) != null) {
                        c83693oE = AbstractC1345466e.A02(interfaceC83733oI);
                    } else {
                        c83693oE = null;
                    }
                    c83403nh2.A11(userSession, c83403nh, c83693oE);
                }
                String A0h = c83403nh.A0h();
                if (A0h != null) {
                    if (A0h.length() != 0) {
                        if (c163507Tn.A01.containsKey(A0h)) {
                        }
                    }
                }
                A0q.add(C0eB.A00);
            } else {
                A1E.add(c160787Im);
            }
            c163507Tn.A02(c160787Im);
            A0q.add(C0eB.A00);
        }
        return A1E;
    }
}
