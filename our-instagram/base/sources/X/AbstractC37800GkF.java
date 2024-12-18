package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.GkF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37800GkF {
    public static final int A00(UserSession userSession, AbstractC39459Hbl abstractC39459Hbl, List list, List list2, int i, boolean z, boolean z2) {
        int size;
        int size2;
        int A0B = abstractC39459Hbl.A0B();
        if (A0B == 0) {
            if (z2) {
                return A0B;
            }
        } else if (z2) {
            size = list2.size();
            size2 = ((A0B - size) - abstractC39459Hbl.A0L(EnumC129395t1.A08).size()) - i;
            if (!z && C18U.A06(C06090Tz.A05, userSession, 36317835433612922L)) {
                int i2 = (A0B - (A0B - size2)) - 1;
                List A0J = abstractC39459Hbl.A0J();
                int i3 = 0;
                if (0 < i2) {
                    i3 = i2;
                }
                List subList = A0J.subList(i3, abstractC39459Hbl.A0B() - 1);
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj : subList) {
                    if (((C120985dq) obj).A03 == C05F.A01) {
                        A1E.add(obj);
                    }
                }
                return size2 - A1E.size();
            }
        }
        size = list.size();
        size2 = ((A0B - size) - abstractC39459Hbl.A0L(EnumC129395t1.A08).size()) - i;
        return !z ? size2 : size2;
    }

    public static final C37801GkG A03(UserSession userSession, AnonymousClass318 anonymousClass318, AbstractC39459Hbl abstractC39459Hbl, Boolean bool, String str, String str2, List list, int i, boolean z, boolean z2, boolean z3) {
        String str3;
        Object obj;
        C38321qM c38321qM;
        Object obj2;
        C40971v4 c40971v4;
        C38321qM c38321qM2;
        int i2;
        int i3;
        int i4;
        String str4;
        String str5;
        if (!A08(userSession, abstractC39459Hbl, bool, str, str2, i, z2, z3)) {
            ArrayList A04 = A04(abstractC39459Hbl, i, z2);
            ArrayList A05 = A05(abstractC39459Hbl, list, A04, z2);
            List A0e = abstractC39459Hbl.A0e(AbstractC16830sb.A06(EnumC129395t1.A02, EnumC129395t1.A03, EnumC129395t1.A0A));
            ListIterator listIterator = A05.listIterator(A05.size());
            while (true) {
                str3 = null;
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    if (((C120985dq) obj).A07() == null) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C120985dq c120985dq = (C120985dq) obj;
            if (c120985dq != null) {
                c38321qM = c120985dq.A02;
            } else {
                c38321qM = null;
            }
            ListIterator listIterator2 = A05.listIterator(A05.size());
            while (true) {
                if (listIterator2.hasPrevious()) {
                    obj2 = listIterator2.previous();
                    if (((C120985dq) obj2).A07() != null) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            C120985dq c120985dq2 = (C120985dq) obj2;
            if (c120985dq2 != null) {
                c40971v4 = c120985dq2.A07();
                c38321qM2 = c120985dq2.A02;
            } else {
                c40971v4 = null;
                c38321qM2 = null;
            }
            int size = abstractC39459Hbl.A0L(EnumC129395t1.A0L).size();
            int A00 = A00(userSession, abstractC39459Hbl, list, A04, size, true, z2);
            if (anonymousClass318 != null) {
                anonymousClass318.A0H = Integer.valueOf(A00 - i);
            }
            if (C1LE.A09(userSession)) {
                abstractC39459Hbl.A0f(A00);
            }
            if (c38321qM != null) {
                i2 = A01(abstractC39459Hbl, abstractC39459Hbl.A0D(c38321qM));
            } else {
                i2 = -1;
            }
            if (AbstractC166987dD.A1b(A0e)) {
                i3 = A01(abstractC39459Hbl, abstractC39459Hbl.A0C((C120985dq) AbstractC001800i.A0K(A0e)));
            } else {
                i3 = -1;
            }
            if (c38321qM2 != null) {
                i4 = A01(abstractC39459Hbl, abstractC39459Hbl.A0D(c38321qM2));
            } else {
                i4 = -1;
            }
            A06(userSession, abstractC39459Hbl, list, A00, i2, size);
            A07(userSession, abstractC39459Hbl, list, A04, A00, i2, i3, i4, z, true, z2);
            if ((!z2 || ((A00 != 1 || i != 0) && (!z3 || !str2.equals("clips_viewer_clips_tab")))) && c38321qM != null) {
                String id = c38321qM.getId();
                if (id != null) {
                    C120985dq c120985dq3 = (C120985dq) AbstractC001800i.A0L(A0e);
                    if (c120985dq3 != null) {
                        if (c120985dq3.A0G()) {
                            str4 = ((C40971v4) C42159Im7.A01(c120985dq3).get(0)).A0S;
                        } else {
                            str4 = c120985dq3.getId();
                        }
                    } else {
                        str4 = null;
                    }
                    if (c40971v4 != null) {
                        str5 = c40971v4.A0S;
                    } else {
                        str5 = null;
                    }
                    if (c38321qM2 != null) {
                        str3 = c38321qM2.getId();
                    }
                    return new C37801GkG(id, str4, str5, str3, A00, i2, i3, i4);
                }
                throw AbstractC166997dE.A0g();
            }
        }
        return new C37801GkG("", null, null, null, 0, -1, -1, -1);
    }

    public static final boolean A08(UserSession userSession, AbstractC39459Hbl abstractC39459Hbl, Boolean bool, String str, String str2, int i, boolean z, boolean z2) {
        String str3;
        C38321qM c38321qM;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36318526923151601L) && !z && z2 && str != null && !abstractC39459Hbl.A0Z()) {
            C120985dq A0F = abstractC39459Hbl.A0F(0);
            if (A0F != null && (c38321qM = A0F.A02) != null) {
                str3 = c38321qM.getId();
            } else {
                str3 = null;
            }
            if (C14360o3.A0K(str3, str)) {
                if (!C18U.A06(c06090Tz, userSession, 36318526923479286L) || (i == 0 && C14360o3.A0K(bool, false) && !A09(abstractC39459Hbl, "reels list already contains ads when preparing page token for headload", str2))) {
                    return true;
                }
                return false;
            }
        }
        return C18U.A06(c06090Tz, userSession, 36318526923544823L) && !z && z2 && C14360o3.A0K(bool, false) && str == null && i == 0 && !abstractC39459Hbl.A0Z() && abstractC39459Hbl.A0F(0).A03 == C05F.A01 && !A09(abstractC39459Hbl, "reels list already contains ads when preparing page token for headload", str2);
    }

    public static final boolean A09(AbstractC39459Hbl abstractC39459Hbl, String str, String str2) {
        Iterator A08 = AbstractC37552Gg8.A08(abstractC39459Hbl);
        while (A08.hasNext()) {
            EnumC129395t1 enumC129395t1 = ((C120985dq) A08.next()).A01;
            if (enumC129395t1 == EnumC129395t1.A02 || enumC129395t1 == EnumC129395t1.A0B) {
                C0f5 AEp = C18950wb.A01.AEp(str, 817903207);
                AEp.ABW("Container Module", str2);
                AEp.report();
                return true;
            }
        }
        return false;
    }

    public static final int A01(AbstractC39459Hbl abstractC39459Hbl, int i) {
        List A0L = abstractC39459Hbl.A0L(EnumC129395t1.A0L);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A0L) {
            if (abstractC39459Hbl.A0C((C120985dq) obj) > i) {
                break;
            }
            A1E.add(obj);
        }
        return i - A1E.size();
    }

    public static final C37801GkG A02(UserSession userSession, AnonymousClass318 anonymousClass318, AbstractC39459Hbl abstractC39459Hbl, Boolean bool, String str, String str2, List list, int i, boolean z, boolean z2) {
        C38321qM c38321qM;
        int i2;
        int i3;
        if (!A08(userSession, abstractC39459Hbl, bool, str, str2, i, z, z2)) {
            ArrayList A04 = A04(abstractC39459Hbl, i, z);
            ArrayList A05 = A05(abstractC39459Hbl, list, A04, z);
            List A0e = abstractC39459Hbl.A0e(AbstractC16830sb.A06(EnumC129395t1.A02, EnumC129395t1.A03, EnumC129395t1.A0A));
            C120985dq c120985dq = (C120985dq) AbstractC001800i.A0L(A05);
            String str3 = null;
            if (c120985dq != null) {
                c38321qM = c120985dq.A02;
            } else {
                c38321qM = null;
            }
            int size = abstractC39459Hbl.A0L(EnumC129395t1.A0L).size();
            int A00 = A00(userSession, abstractC39459Hbl, list, A04, size, true, z);
            if (anonymousClass318 != null) {
                anonymousClass318.A0H = Integer.valueOf(A00 - i);
            }
            if (C1LE.A09(userSession)) {
                abstractC39459Hbl.A0f(A00);
            }
            if (c38321qM != null) {
                i2 = A01(abstractC39459Hbl, abstractC39459Hbl.A0D(c38321qM));
            } else {
                i2 = -1;
            }
            if (AbstractC166987dD.A1b(A0e)) {
                i3 = A01(abstractC39459Hbl, abstractC39459Hbl.A0C((C120985dq) AbstractC001800i.A0K(A0e)));
            } else {
                i3 = -1;
            }
            A06(userSession, abstractC39459Hbl, list, A00, i2, size);
            A07(userSession, abstractC39459Hbl, list, A04, A00, i2, i3, -1, false, false, z);
            if ((!z || ((A00 != 1 || i != 0) && (!z2 || !str2.equals("clips_viewer_clips_tab")))) && c38321qM != null) {
                String id = c38321qM.getId();
                if (id != null) {
                    if (AbstractC166987dD.A1b(A0e)) {
                        str3 = ((C120985dq) AbstractC001800i.A0K(A0e)).getId();
                    }
                    return new C37801GkG(id, str3, null, null, A00, i2, i3, -1);
                }
                throw AbstractC166997dE.A0g();
            }
        }
        return new C37801GkG("", null, null, null, 0, -1, -1, -1);
    }

    public static final ArrayList A05(AbstractC39459Hbl abstractC39459Hbl, List list, List list2, boolean z) {
        List A0L = abstractC39459Hbl.A0L(EnumC129395t1.A0G);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A0L.iterator();
        if (z) {
            while (it.hasNext()) {
                Object next = it.next();
                if (!list2.contains(((C120985dq) next).getId())) {
                    A1E.add(next);
                }
            }
        } else {
            while (it.hasNext()) {
                Object next2 = it.next();
                if (!list.contains(((C120985dq) next2).getId())) {
                    A1E.add(next2);
                }
            }
        }
        return A1E;
    }

    public static final void A06(UserSession userSession, AbstractC39459Hbl abstractC39459Hbl, List list, int i, int i2, int i3) {
        if (i <= i2) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Number of Surveys: ");
            A1C.append(i3);
            A1C.append(" \nLast Organic Position: ");
            A1C.append(i2);
            A1C.append(" \nTotal Number of Items: ");
            A1C.append(i);
            A1C.append(" \nNewly Delivered Items: ");
            A1C.append(list.size());
            String A0x = AbstractC166997dE.A0x(" \n", A1C);
            Iterator A08 = AbstractC37552Gg8.A08(abstractC39459Hbl);
            while (A08.hasNext()) {
                C120985dq c120985dq = (C120985dq) A08.next();
                StringBuilder sb = new StringBuilder();
                sb.append(A0x);
                sb.append(abstractC39459Hbl.A0C(c120985dq));
                sb.append(' ');
                sb.append(c120985dq.A01);
                sb.append(": ");
                sb.append(c120985dq.getId());
                sb.append('\n');
                A0x = sb.toString();
            }
            int i4 = 1000;
            if (C18U.A06(C06090Tz.A05, userSession, 36312393709519973L)) {
                i4 = 1;
            }
            C0w9.A04("clips_ads_fetch", A0x, i4);
        }
    }

    public static final void A07(UserSession userSession, AbstractC39459Hbl abstractC39459Hbl, List list, List list2, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        Object obj;
        if (i2 < i && i3 < i && i4 < i) {
            return;
        }
        C0f5 A00 = C18950wb.A00("Pagination token has incorrect item position(s)", 817903207, true);
        A00.ABU("total_number_of_previous_page_items", i);
        A00.ABU("total_number_of_previous_page_items_with_flash_cache", A00(userSession, abstractC39459Hbl, list, list2, abstractC39459Hbl.A0L(EnumC129395t1.A0L).size(), false, z3));
        A00.ABU("last_pure_organic_position", i2);
        A00.ABU("last_sponsored_position", i3);
        A00.ABU("last_overlay_ad_position", i4);
        List A0J = abstractC39459Hbl.A0J();
        ArrayList A0q = AbstractC167017dG.A0q(A0J);
        int i5 = 0;
        for (Object obj2 : A0J) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            C120985dq c120985dq = (C120985dq) obj2;
            StringBuilder sb = new StringBuilder();
            sb.append(i5);
            sb.append(" : ");
            if (c120985dq.A07() != null) {
                obj = "OVERLAY_AD";
            } else {
                obj = c120985dq.A01;
            }
            sb.append(obj);
            sb.append(" : ");
            sb.append(c120985dq.getId());
            A0q.add(sb.toString());
            i5 = i6;
        }
        A00.ABW("raw_item_types", AbstractC001800i.A0P("\n", "", "", A0q, null));
        A00.ABW("new_page_organic_items", AbstractC001800i.A0P("\n", "", "", list, null));
        A00.ABX("is_overlay_ads_request", z);
        A00.ABX("is_v2_pagination_token", z2);
        A00.ABX("is_sync_flow_enabled", z3);
        A00.report();
    }

    public static final ArrayList A04(AbstractC39459Hbl abstractC39459Hbl, int i, boolean z) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if (z && i != -1) {
            int i2 = 0;
            for (Object obj : abstractC39459Hbl.A0J()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                C120985dq c120985dq = (C120985dq) obj;
                if (i2 > i && c120985dq.A03 == C05F.A01) {
                    A1E.add(c120985dq.getId());
                } else if (i2 > i && c120985dq.A03 != C05F.A01 && c120985dq.A01 != EnumC129395t1.A08) {
                    A1E.clear();
                }
                i2 = i3;
            }
        }
        return A1E;
    }
}
