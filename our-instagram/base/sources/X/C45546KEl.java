package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KEl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45546KEl extends C1P1 {
    public final /* synthetic */ C7O4 A00;
    public final /* synthetic */ String A01;

    public C45546KEl(C7O4 c7o4, String str) {
        this.A00 = c7o4;
        this.A01 = str;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        List subList;
        int i2;
        List subList2;
        List unmodifiableList;
        List unmodifiableList2;
        List unmodifiableList3;
        String str;
        int A03 = C0f9.A03(-1526659386);
        EBT ebt = (EBT) obj;
        int A032 = C0f9.A03(778875146);
        C14360o3.A0B(ebt, 0);
        C43707JUs c43707JUs = ebt.A00;
        if (c43707JUs != null) {
            C7O4 c7o4 = this.A00;
            if (c7o4.A06 != null && c7o4.A02 != null) {
                Iterator it = c43707JUs.A06.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C83403nh c83403nh = (C83403nh) AbstractC166997dE.A0l(it);
                    if (AbstractC13670mt.A0G(c83403nh.A0h(), c7o4.A06)) {
                        c83403nh.A0H = c7o4.A02;
                        break;
                    }
                }
            }
            C2DS c2ds = c7o4.A0B;
            C2EY c2ey = null;
            DirectThreadKey directThreadKey = new DirectThreadKey(this.A01, null);
            C2DU c2du = (C2DU) c2ds;
            synchronized (c2du) {
                C4GV A0P = c2du.A0P(directThreadKey);
                if (A0P == null) {
                    C0w9.A03("DirectThreadStore", "Null thread entry, Entry should exist before function call");
                } else {
                    synchronized (A0P) {
                        ArrayList A1E = AbstractC166987dD.A1E();
                        ArrayList A1E2 = AbstractC166987dD.A1E();
                        ArrayList A1E3 = AbstractC166987dD.A1E();
                        ArrayList A1F = AbstractC166987dD.A1F(c43707JUs.A06);
                        Collections.sort(A1F, C93394Gs.A04);
                        String str2 = c43707JUs.A05;
                        String A04 = C93394Gs.A04(str2, A1F);
                        String A033 = C93394Gs.A03(str2, A1F);
                        List list = A0P.A0K;
                        C14360o3.A0B(list, 0);
                        if (A04 != null) {
                            i = C93394Gs.A00(A04, list);
                            if (i < 0) {
                                i ^= -1;
                            }
                        } else {
                            i = 0;
                        }
                        int A01 = C93394Gs.A01(A033, list);
                        if (i > A01) {
                            subList = Collections.emptyList();
                            C14360o3.A07(subList);
                        } else {
                            subList = list.subList(i, A01);
                        }
                        if (A04 != null) {
                            i2 = C93394Gs.A00(A04, A1F);
                            if (i2 < 0) {
                                i2 ^= -1;
                            }
                        } else {
                            i2 = 0;
                        }
                        int A012 = C93394Gs.A01(A033, A1F);
                        if (i2 > A012) {
                            subList2 = Collections.emptyList();
                            C14360o3.A07(subList2);
                        } else {
                            subList2 = A1F.subList(i2, A012);
                        }
                        C4GV.A0D(A0P, subList, subList2, A1E, A1E2, A1E3);
                        unmodifiableList = Collections.unmodifiableList(A1E);
                        unmodifiableList2 = Collections.unmodifiableList(A1E2);
                        unmodifiableList3 = Collections.unmodifiableList(A1E3);
                    }
                    C2Io c2Io = new C2Io(A0P.A0I.BKb(), C05F.A0D, unmodifiableList, C4GV.A03(unmodifiableList2, false), unmodifiableList3, false);
                    c2du.A09.accept(c2Io);
                    c2du.A06.E4s(c2Io);
                    C2DU.A0F(c2du, A0P);
                }
            }
            L3Q l3q = c7o4.A04;
            if (l3q != null) {
                C15370ps c15370ps = l3q.A04;
                C48257LXg c48257LXg = l3q.A01;
                C2DS c2ds2 = (C2DS) c48257LXg.A07.getValue();
                DirectThreadKey BKb = l3q.A02.BKb();
                L4Z l4z = c48257LXg.A02;
                if (l4z != null) {
                    str = l4z.A02;
                } else {
                    str = null;
                }
                c15370ps.A00 = c2ds2.BSh(BKb, String.valueOf(str));
                C48256LXf A00 = AbstractC46705KlO.A00(c48257LXg.A04);
                String str3 = l3q.A03;
                C83403nh c83403nh2 = (C83403nh) c15370ps.A00;
                if (c83403nh2 != null) {
                    c2ey = c83403nh2.A10;
                }
                String valueOf = String.valueOf(c2ey);
                long j = l3q.A00;
                C14360o3.A0B(valueOf, 1);
                InterfaceC02590Ai A0H = JQ0.A0H(A00.A00, "direct_pinned_message_impression", str3, valueOf);
                A0H.A9K("position_index", Long.valueOf(j));
                A0H.Cht();
            }
        }
        C0f9.A0A(-568292473, A032);
        C0f9.A0A(-418849623, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1086464241);
        C7O4 c7o4 = this.A00;
        c7o4.A08 = false;
        c7o4.A07 = c7o4.A06;
        C7OT c7ot = c7o4.A03;
        if (c7ot != null) {
            c7ot.A00.post(new RunnableC49861M0g(c7ot.A01));
        }
        C0f9.A0A(1364507055, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-2084068101);
        C7O4 c7o4 = this.A00;
        c7o4.A08 = true;
        C7OT c7ot = c7o4.A03;
        if (c7ot != null) {
            c7ot.A00.post(new RunnableC49862M0h(c7ot.A01));
        }
        C0f9.A0A(-1915578518, A03);
    }
}
