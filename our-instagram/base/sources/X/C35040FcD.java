package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectMessageSearchThread;
import com.instagram.model.direct.DirectSearchMetaAIResponse;
import com.instagram.model.direct.DirectSearchPrompt;
import com.instagram.model.direct.DirectSearchResharedContent;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.FcD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35040FcD {
    public static final C2n2 A0C = new C31354DqJ(4);
    public C5e4 A00;
    public C31798DyI A02;
    public FPY A03;
    public final UserSession A06;
    public final C34549FKj A09;
    public final HashSet A08 = AbstractC166987dD.A1H();
    public final HashSet A07 = AbstractC166987dD.A1H();
    public final HashSet A0B = AbstractC166987dD.A1H();
    public final HashSet A0A = AbstractC166987dD.A1H();
    public ArrayList A05 = AbstractC166987dD.A1E();
    public FJ3 A04 = new FJ3(AbstractC166987dD.A1E(), new C012504o());
    public C121305eT A01 = null;

    public final ArrayList A00(boolean z) {
        this.A08.clear();
        this.A07.clear();
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        FJ3 fj3 = this.A04;
        ArrayList A17 = AbstractC25225BEi.A17(size + fj3.A00.size());
        if (z) {
            A03(A17, arrayList);
            arrayList = fj3.A00;
        }
        A03(A17, arrayList);
        return A17;
    }

    public final void A02(String str, String str2, String str3) {
        Integer num;
        ArrayList arrayList = this.A05;
        arrayList.clear();
        HashSet hashSet = this.A0B;
        hashSet.clear();
        HashSet hashSet2 = this.A0A;
        hashSet2.clear();
        if (this.A00 != null && !TextUtils.isEmpty(str)) {
            FPY fpy = this.A03;
            if (fpy != null && (num = fpy.A00) != null) {
                fpy.A01.cacheQueryStart(num.intValue(), "banyan");
            }
            C121305eT A02 = this.A00.A02(str3, str2, str, hashSet, hashSet2);
            this.A01 = A02;
            arrayList.addAll(A02.A02);
            if (fpy != null) {
                fpy.A00(false, this.A01.A02.size());
            }
            UserSession userSession = this.A06;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36321941421893542L) && str3.equals("direct_user_search_nullstate")) {
                arrayList.addAll(this.A00.A02(null, "direct_ibc_nullstate", str, hashSet, hashSet2).A02);
            }
            C34549FKj c34549FKj = this.A09;
            C012504o c012504o = new C012504o();
            C012504o c012504o2 = new C012504o();
            c34549FKj.A02.AVL(str, c012504o, c012504o2);
            HashSet A1H = AbstractC166987dD.A1H();
            ArrayList A17 = AbstractC25225BEi.A17(c012504o.size() + c012504o2.size());
            Iterator it = c012504o.iterator();
            while (it.hasNext()) {
                C2ED c2ed = (C2ED) it.next();
                A1H.add(c2ed.BKb().A00);
                A17.add(c2ed);
            }
            Iterator it2 = c012504o2.iterator();
            while (it2.hasNext()) {
                C2ED c2ed2 = (C2ED) it2.next();
                if (!A1H.contains(c2ed2.BKb().A00)) {
                    A17.add(c2ed2);
                }
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it3 = A17.iterator();
            while (it3.hasNext()) {
                C2ED c2ed3 = (C2ED) it3.next();
                if (c2ed3.C7g() != 29 || c2ed3.BI1() == 0) {
                    A1E.add(c2ed3);
                }
            }
            UserSession userSession2 = c34549FKj.A01;
            if (!C18U.A06(c06090Tz, userSession2, 36325081045021388L)) {
                ArrayList A1E2 = AbstractC166987dD.A1E();
                Iterator it4 = A1E.iterator();
                while (it4.hasNext()) {
                    C2ED c2ed4 = (C2ED) it4.next();
                    if (!C4GR.A07(Integer.valueOf(c2ed4.C7g()))) {
                        A1E2.add(c2ed4);
                    }
                }
                A1E = A1E2;
            }
            Collections.sort(A1E, new C31460Ds4(c34549FKj, 10));
            ArrayList A172 = AbstractC25225BEi.A17(Math.min(50, A1E.size()));
            HashSet A1H2 = AbstractC166987dD.A1H();
            Iterator it5 = A1E.iterator();
            int i = 0;
            while (it5.hasNext()) {
                C2EC c2ec = (C2EC) it5.next();
                if (i > 50) {
                    break;
                }
                if (!c2ec.CX1()) {
                    DirectShareTarget A00 = AbstractC31677Dvi.A00(c34549FKj.A00, userSession2, c2ec);
                    if (!A00.A0P()) {
                        A172.add(A00);
                        A1H2.add(c2ec.BKb().A00);
                        i++;
                    }
                }
            }
            this.A04 = new FJ3(A172, A1H2);
        }
    }

    public C35040FcD(Context context, C5e4 c5e4, UserSession userSession, C2DS c2ds) {
        this.A06 = userSession;
        this.A00 = c5e4;
        if (c5e4 == null) {
            C1GJ.A06(AbstractC121115e3.A01(userSession, new EZ9(this, 12)), 1967622104, 2, false, false);
        }
        this.A09 = new C34549FKj(context, userSession, c2ds);
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36320382348894619L)) {
            this.A03 = C37058GUs.A00(userSession);
        }
    }

    public final List A01(List list, String str) {
        ArrayList A00 = A00(AbstractC166987dD.A1b(list));
        if (!list.isEmpty()) {
            ArrayList A17 = AbstractC25225BEi.A17(AbstractC31172DnG.A02(list, A00.size()));
            A17.addAll(A00);
            A03(A17, list);
            UserSession userSession = this.A06;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36325712403117360L) || C18U.A06(c06090Tz, userSession, 36325712403182897L)) {
                HashSet A1H = AbstractC166987dD.A1H();
                Iterator it = A17.iterator();
                while (it.hasNext()) {
                    DirectSearchResult A0M = AbstractC31171DnF.A0M(it);
                    if (A0M instanceof DirectShareTarget) {
                        A1H.add(((DirectShareTarget) A0M).A09());
                    }
                }
                if (!A1H.isEmpty()) {
                    boolean A06 = C18U.A06(c06090Tz, userSession, 36325712403117360L);
                    ArrayList A1E = AbstractC166987dD.A1E();
                    if (A06) {
                        boolean A062 = C18U.A06(c06090Tz, userSession, 36325712403248434L);
                        C18A A002 = AnonymousClass189.A00(userSession);
                        if (!A062) {
                            User user = (User) A002.A02.get(str);
                            if (user != null) {
                                DirectShareTarget directShareTarget = new DirectShareTarget(user);
                                if (!A1H.contains(directShareTarget.A09())) {
                                    A1E.add(directShareTarget);
                                    A1H.add(directShareTarget.A09());
                                }
                            }
                        } else {
                            Iterator A15 = AbstractC166997dE.A15(A002.A01);
                            while (A15.hasNext()) {
                                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                                String A172 = AbstractC31172DnG.A17(A1K);
                                User user2 = (User) A1K.getValue();
                                if (user2 != null && A172 != null && A172.toLowerCase(Locale.getDefault()).startsWith(str.toLowerCase(Locale.getDefault()))) {
                                    DirectShareTarget directShareTarget2 = new DirectShareTarget(user2);
                                    if (!A1H.contains(directShareTarget2.A09())) {
                                        A1E.add(directShareTarget2);
                                        A1H.add(directShareTarget2.A09());
                                    }
                                }
                            }
                        }
                    }
                    boolean A063 = C18U.A06(c06090Tz, userSession, 36325712403182897L);
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    if (A063) {
                        Iterator it2 = A17.iterator();
                        while (it2.hasNext()) {
                            DirectSearchResult A0M2 = AbstractC31171DnF.A0M(it2);
                            if (A0M2 instanceof DirectShareTarget) {
                                DirectShareTarget directShareTarget3 = (DirectShareTarget) A0M2;
                                if (directShareTarget3.A0M()) {
                                    Iterator A13 = AbstractC31174DnI.A13(directShareTarget3.A0Q);
                                    while (A13.hasNext()) {
                                        PendingRecipient A0p = AbstractC31172DnG.A0p(A13);
                                        if (A0p.A0f.toLowerCase(Locale.getDefault()).startsWith(str.toLowerCase(Locale.getDefault())) && A0p.A0O) {
                                            DirectShareTarget directShareTarget4 = new DirectShareTarget(A0p);
                                            if (!A1H.contains(directShareTarget4.A09())) {
                                                A1E2.add(directShareTarget4);
                                                A1H.add(directShareTarget4.A09());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ArrayList A1E3 = AbstractC166987dD.A1E();
                    A1E3.addAll(A1E2);
                    A1E3.addAll(A1E);
                    if (!A1E3.isEmpty()) {
                        User A10 = AbstractC166987dD.A10(userSession);
                        if (C18U.A06(c06090Tz, userSession, 36325712403313971L) && !A10.isVerified()) {
                            ArrayList A1E4 = AbstractC166987dD.A1E();
                            Iterator it3 = A1E3.iterator();
                            while (it3.hasNext()) {
                                DirectSearchResult A0M3 = AbstractC31171DnF.A0M(it3);
                                if ((A0M3 instanceof DirectShareTarget) && !((DirectShareTarget) A0M3).A0U()) {
                                    A1E4.add(A0M3);
                                }
                            }
                            A1E3 = A1E4;
                        }
                        ArrayList A1E5 = AbstractC166987dD.A1E();
                        A1E5.addAll(A17);
                        A1E5.addAll(A1E3);
                        return A1E5;
                    }
                }
            }
            return A17;
        }
        return A00;
    }

    public final void A03(ArrayList arrayList, List list) {
        HashSet A1H = AbstractC166987dD.A1H();
        HashSet A1H2 = AbstractC166987dD.A1H();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectSearchResult A0M = AbstractC31171DnF.A0M(it);
            if (A0M instanceof DirectShareTarget) {
                DirectShareTarget directShareTarget = (DirectShareTarget) A0M;
                if (!directShareTarget.A0S) {
                    Object apply = A0C.apply(directShareTarget);
                    String A08 = directShareTarget.A08();
                    if (directShareTarget.A07 != EnumC46982Dm.A04 && (directShareTarget.A04 == null || this.A07.contains(A08))) {
                        if (!this.A08.contains(apply) && !this.A07.contains(A08)) {
                            if (apply != null) {
                                arrayList.add(A0M);
                                A1H.add(apply);
                            } else if (A08 != null) {
                                if (!directShareTarget.A0R && directShareTarget.A0Q.isEmpty()) {
                                }
                            }
                        }
                    }
                    arrayList.add(A0M);
                    A1H2.add(A08);
                } else {
                    arrayList.add(A0M);
                }
            } else {
                if (!(A0M instanceof DirectMessageSearchMessage) && !(A0M instanceof DirectMessageSearchThread) && !(A0M instanceof DirectSearchResharedContent) && !(A0M instanceof DirectSearchPrompt) && !(A0M instanceof DirectSearchMetaAIResponse)) {
                }
                arrayList.add(A0M);
            }
        }
        this.A08.addAll(A1H);
        this.A07.addAll(A1H2);
    }
}
