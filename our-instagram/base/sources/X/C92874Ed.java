package X;

import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.friendmap.data.FriendMapRepository;
import com.instagram.spotlight.fetch.SpotlightFetchRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Predicate;

/* renamed from: X.4Ed, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92874Ed extends AbstractC52922bZ {
    public Integer A00;
    public final UserSession A01;
    public final C4F0 A02;
    public final NotesRepository A03;
    public final C92904Eg A04;
    public final FriendMapRepository A05;
    public final SpotlightFetchRepository A06;
    public final String A07;
    public final SortedMap A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC19390xP A0B;
    public final InterfaceC19390xP A0C;
    public final C05A A0D;
    public final InterfaceC15070pN A0E;
    public final InterfaceC15070pN A0F;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r1 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C206289Bl A00(X.C26084BgD r8, X.C4F3 r9, X.C92874Ed r10, java.lang.String r11, java.util.List r12, java.util.List r13) {
        /*
            com.instagram.common.session.UserSession r3 = r10.A01
            boolean r0 = X.C4AC.A03(r3)
            r6 = 0
            if (r0 == 0) goto L32
            X.4Eg r2 = r10.A04
            java.lang.String r1 = r3.userId
            monitor-enter(r2)
            r0 = 0
            X.C14360o3.A0B(r1, r0)     // Catch: java.lang.Throwable -> L1b
            java.util.Map r0 = r2.A01     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1b
            X.4F5 r0 = (X.C4F5) r0     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L1e:
            monitor-exit(r2)
            if (r0 != 0) goto L32
            com.instagram.user.model.User r1 = X.C6C8.A05(r3)
            com.instagram.user.model.User r0 = X.C6C8.A05(r3)
            boolean r0 = X.AbstractC43643JSb.A00(r0)
            X.4FL r6 = new X.4FL
            r6.<init>(r1, r11, r0)
        L32:
            X.4Eg r0 = r10.A04
            com.instagram.direct.inbox.notes.NotesRepository r2 = r0.A06
            X.0UO r5 = r2.A0l
            java.lang.Object r0 = r5.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            r4 = 0
            if (r0 == 0) goto L48
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L49
        L48:
            r0 = 1
        L49:
            r7 = 0
            if (r0 != 0) goto L89
            X.0UO r0 = r2.A0p
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L59:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r0 = r3.next()
            X.6C9 r0 = (X.C6C9) r0
            X.67s r0 = r0.A0A
            if (r0 == 0) goto L82
            X.67y r0 = r0.A0B
            if (r0 == 0) goto L82
            java.lang.String r1 = r0.A02
        L6f:
            java.lang.Object r0 = r5.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r4)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L85
            int r2 = r2 + 1
            goto L59
        L82:
            r1 = r7
            goto L6f
        L84:
            r2 = -1
        L85:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
        L89:
            X.9Bl r3 = new X.9Bl
            r4 = r8
            r5 = r9
            r8 = r12
            r9 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92874Ed.A00(X.BgD, X.4F3, X.4Ed, java.lang.String, java.util.List, java.util.List):X.9Bl");
    }

    public static final List A01(List list, Map map) {
        Boolean bool;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C4FM c4fm = (C4FM) it.next();
                if (map == null || (bool = (Boolean) map.get(c4fm.A08)) == null) {
                    bool = c4fm.A07;
                }
                String str = c4fm.A0A;
                User user = c4fm.A06;
                boolean z = c4fm.A0G;
                Map map2 = c4fm.A0E;
                int i = c4fm.A02;
                boolean z2 = c4fm.A0F;
                List list2 = c4fm.A0D;
                int i2 = c4fm.A01;
                int i3 = c4fm.A03;
                int i4 = c4fm.A04;
                String str2 = c4fm.A0C;
                String str3 = c4fm.A0B;
                String str4 = c4fm.A08;
                String str5 = c4fm.A09;
                NoteCustomThemeImpl noteCustomThemeImpl = c4fm.A05;
                C14360o3.A0B(str, 0);
                C14360o3.A0B(user, 1);
                C14360o3.A0B(map2, 3);
                arrayList.add(new C4FM(noteCustomThemeImpl, user, bool, str, str2, str3, str4, str5, list2, map2, i, i2, i3, i4, z, z2));
            }
            return arrayList;
        }
        return null;
    }

    public final void A02(long j) {
        if (j != 0) {
            this.A03.A0E(j, null);
        }
    }

    public final void A03(long j) {
        if (j != 0) {
            this.A03.A0G(j, null);
        }
    }

    public final void A04(C4F5 c4f5, boolean z) {
        C4F5 c4f52;
        if (c4f5.A08 != null) {
            if (z) {
                Integer num = c4f5.A02;
                if (num != null) {
                    this.A08.put(num, c4f5);
                }
            } else {
                java.util.Set entrySet = this.A08.entrySet();
                if (entrySet != null) {
                    final C50354MLg c50354MLg = new C50354MLg(c4f5, 4);
                    entrySet.removeIf(new Predicate() { // from class: X.B1u
                        @Override // java.util.function.Predicate
                        public final /* synthetic */ boolean test(Object obj) {
                            return AbstractC166987dD.A1a(InterfaceC16660sJ.this.invoke(obj));
                        }
                    });
                }
            }
            Collection values = this.A08.values();
            Integer num2 = null;
            if (values != null) {
                c4f52 = (C4F5) AbstractC001800i.A0A(values);
                if (c4f52 != null) {
                    num2 = c4f52.A02;
                }
            } else {
                c4f52 = null;
            }
            this.A00 = num2;
            this.A04.A0J.Egh(c4f52);
        }
    }

    public final void A05(Integer num, Runnable runnable, boolean z) {
        this.A04.A02(num, runnable, z);
        if (C3LA.A02(this.A01)) {
            this.A05.A09(null, null, new C9EL(this, 24), false, false);
        }
    }

    public final boolean A06() {
        Integer num;
        Object obj;
        C4F5 c4f5;
        Integer num2;
        int i;
        SortedMap sortedMap = this.A08;
        java.util.Set entrySet = sortedMap.entrySet();
        C14360o3.A07(entrySet);
        Iterator it = entrySet.iterator();
        while (true) {
            num = null;
            if (it.hasNext()) {
                obj = it.next();
                int intValue = ((Number) ((Map.Entry) obj).getKey()).intValue();
                Integer num3 = this.A00;
                if (num3 != null) {
                    i = num3.intValue();
                } else {
                    i = -1;
                }
                if (intValue > i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (c4f5 = (C4F5) entry.getValue()) == null) {
            Collection values = sortedMap.values();
            C14360o3.A07(values);
            c4f5 = (C4F5) AbstractC001800i.A0A(values);
        }
        Integer num4 = this.A00;
        if (c4f5 != null) {
            num2 = c4f5.A02;
        } else {
            num2 = null;
        }
        if (C14360o3.A0K(num4, num2)) {
            return false;
        }
        if (c4f5 != null) {
            num = c4f5.A02;
        }
        this.A00 = num;
        this.A04.A0J.Egh(c4f5);
        return true;
    }

    public C92874Ed(UserSession userSession, C4F0 c4f0, NotesRepository notesRepository, C92904Eg c92904Eg, FriendMapRepository friendMapRepository, SpotlightFetchRepository spotlightFetchRepository, String str) {
        this.A01 = userSession;
        this.A04 = c92904Eg;
        this.A03 = notesRepository;
        this.A05 = friendMapRepository;
        this.A06 = spotlightFetchRepository;
        this.A02 = c4f0;
        this.A07 = str;
        User A01 = C17060sy.A01.A01(userSession);
        C16930sl c16930sl = C16930sl.A00;
        this.A0D = new C008002u(new C4F3(A01, null, c16930sl, c16930sl, 0, false));
        this.A09 = AbstractC09440dt.A01(new C206869Dr(this, 16));
        this.A0F = notesRepository.A0j;
        this.A0E = notesRepository.A0c;
        this.A0A = AbstractC09440dt.A01(new C206869Dr(this, 17));
        this.A08 = new TreeMap();
        this.A0B = c92904Eg.A0E;
        this.A0C = c92904Eg.A0F;
    }
}
