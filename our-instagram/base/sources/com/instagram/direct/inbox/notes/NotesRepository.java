package com.instagram.direct.inbox.notes;

import X.AbstractC001800i;
import X.AbstractC06930Yk;
import X.AbstractC06950Ym;
import X.AbstractC115105If;
import X.AbstractC16850sd;
import X.AbstractC16960so;
import X.AbstractC208910l;
import X.AbstractC23641Du;
import X.AbstractC25651Mw;
import X.AbstractC40110Hqd;
import X.AbstractC40691uc;
import X.AbstractC43591JPw;
import X.AbstractC76433bn;
import X.AnonymousClass016;
import X.AnonymousClass057;
import X.AnonymousClass189;
import X.AnonymousClass191;
import X.AnonymousClass195;
import X.AnonymousClass688;
import X.AnonymousClass689;
import X.C006802i;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C06090Tz;
import X.C06160Ug;
import X.C06860Yd;
import X.C0K8;
import X.C0UO;
import X.C10E;
import X.C10M;
import X.C1348267y;
import X.C14360o3;
import X.C16930sl;
import X.C18A;
import X.C18U;
import X.C19L;
import X.C1DV;
import X.C1DY;
import X.C1ZV;
import X.C1ZX;
import X.C206649Cv;
import X.C206709Db;
import X.C207189Ex;
import X.C23671Dx;
import X.C25A;
import X.C37761pD;
import X.C38705H2q;
import X.C45052Jwh;
import X.C45099JxT;
import X.C45103JxX;
import X.C47Z;
import X.C4A7;
import X.C4A8;
import X.C4AA;
import X.C4AB;
import X.C4AC;
import X.C50111MAj;
import X.C50113MAm;
import X.C50246MHb;
import X.C50359MLl;
import X.C67R;
import X.C67s;
import X.C6C8;
import X.C6C9;
import X.C73163Pr;
import X.C9D3;
import X.IN4;
import X.INC;
import X.ING;
import X.InterfaceC06180Ui;
import X.InterfaceC1347967p;
import X.InterfaceC15070pN;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.JJD;
import X.JZ1;
import X.LG6;
import X.LYO;
import android.content.Context;
import com.instagram.api.schemas.NoteEmojiReactionInfo;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteCreationSource;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class NotesRepository extends C4A7 {
    public int A00;
    public long A01;
    public LG6 A02;
    public HashMap A03;
    public HashSet A04;
    public List A05;
    public C73163Pr A06;
    public AnonymousClass195 A07;
    public AnonymousClass195 A08;
    public AnonymousClass195 A09;
    public final Context A0A;
    public final UserSession A0B;
    public final NotesApi A0C;
    public final C4AA A0D;
    public final C4AB A0E;
    public final PendingMediaStore A0F;
    public final C18A A0G;
    public final HashMap A0H;
    public final HashMap A0I;
    public final Map A0J;
    public final InterfaceC06180Ui A0K;
    public final InterfaceC06180Ui A0L;
    public final InterfaceC06180Ui A0M;
    public final InterfaceC06180Ui A0N;
    public final InterfaceC06180Ui A0O;
    public final InterfaceC06180Ui A0P;
    public final InterfaceC06180Ui A0Q;
    public final InterfaceC06180Ui A0R;
    public final InterfaceC06180Ui A0S;
    public final C05A A0T;
    public final C05A A0U;
    public final C05A A0V;
    public final C05A A0W;
    public final C05A A0X;
    public final C05A A0Y;
    public final C05A A0Z;
    public final C05A A0a;
    public final C05A A0b;
    public final InterfaceC15070pN A0c;
    public final InterfaceC15070pN A0d;
    public final InterfaceC15070pN A0e;
    public final InterfaceC15070pN A0f;
    public final InterfaceC15070pN A0g;
    public final InterfaceC15070pN A0h;
    public final InterfaceC15070pN A0i;
    public final InterfaceC15070pN A0j;
    public final InterfaceC15070pN A0k;
    public final C0UO A0l;
    public final C0UO A0m;
    public final C0UO A0n;
    public final C0UO A0o;
    public final C0UO A0p;
    public final C0UO A0q;
    public final C0UO A0r;
    public final C0UO A0s;
    public final C0UO A0t;

    public static final synchronized void A01(C6C9 c6c9, NotesRepository notesRepository, String str, String str2, List list, Map map) {
        List singletonList;
        synchronized (notesRepository) {
            C18A c18a = notesRepository.A0G;
            UserSession userSession = notesRepository.A0B;
            User A02 = c18a.A02(userSession.userId);
            if (A02 != null) {
                if (str2 == null) {
                    singletonList = C16930sl.A00;
                } else {
                    singletonList = Collections.singletonList(new NoteEmojiReactionInfo(null, A02, null, str2));
                    C14360o3.A07(singletonList);
                }
                AnonymousClass688 anonymousClass688 = c6c9.A07;
                if (anonymousClass688 != null) {
                    ING ing = new ING(c6c9);
                    ing.A07 = AbstractC40110Hqd.A00(anonymousClass688, anonymousClass688.A00(), singletonList);
                    list.set(list.indexOf(c6c9), C6C8.A02(ing.A00(), userSession));
                    C45052Jwh c45052Jwh = (C45052Jwh) map.get(str);
                    if (c45052Jwh != null) {
                        String str3 = c45052Jwh.A03;
                        String str4 = c45052Jwh.A04;
                        User user = c45052Jwh.A00;
                        String str5 = c45052Jwh.A02;
                        String str6 = c45052Jwh.A01;
                        C14360o3.A0B(str3, 0);
                        C14360o3.A0B(str4, 1);
                        map.put(str, new C45052Jwh(user, str3, str4, str5, str6, list));
                    }
                }
            }
        }
    }

    public static final synchronized void A02(C6C9 c6c9, NotesRepository notesRepository, String str, List list, Map map) {
        String str2;
        C45052Jwh c45052Jwh;
        C1348267y c1348267y;
        synchronized (notesRepository) {
            if (list != null) {
                AnonymousClass016.A1A(list, new C50359MLl(notesRepository, 49));
                list.add(0, c6c9);
                C45052Jwh c45052Jwh2 = (C45052Jwh) map.get(str);
                if (c45052Jwh2 != null) {
                    String str3 = c45052Jwh2.A03;
                    String str4 = c45052Jwh2.A04;
                    User user = c45052Jwh2.A00;
                    String str5 = c45052Jwh2.A02;
                    String str6 = c45052Jwh2.A01;
                    C14360o3.A0B(str3, 0);
                    C14360o3.A0B(str4, 1);
                    c45052Jwh = new C45052Jwh(user, str3, str4, str5, str6, list);
                }
            } else {
                C67s c67s = c6c9.A0A;
                if (c67s == null || (c1348267y = c67s.A0B) == null || (str2 = c1348267y.A03) == null) {
                    str2 = "";
                }
                UserSession userSession = notesRepository.A0B;
                c45052Jwh = new C45052Jwh(AnonymousClass189.A00(userSession).A02(userSession.userId), str, str2, null, null, AbstractC16960so.A1N(c6c9));
            }
            map.put(str, c45052Jwh);
        }
    }

    public static final boolean A04(List list) {
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C47Z) next).A11()) {
                if (next == null) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public final int A05(String str) {
        C14360o3.A0B(str, 0);
        Iterable iterable = (Iterable) this.A0p.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            C6C9 c6c9 = (C6C9) obj;
            if (!C14360o3.A0K(c6c9.A0K, str) || c6c9.A01 == NoteStyle.A0C.A00) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    public final C6C9 A06(String str) {
        Object obj;
        C14360o3.A0B(str, 0);
        Collection values = this.A0I.values();
        C14360o3.A07(values);
        Iterator it = values.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C6C9) obj).A0H, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C6C9) obj;
    }

    public final C6C9 A07(String str, String str2) {
        List list;
        C14360o3.A0B(str2, 1);
        C45052Jwh c45052Jwh = (C45052Jwh) ((Map) this.A0r.getValue()).get(str);
        Object obj = null;
        if (c45052Jwh == null || (list = c45052Jwh.A05) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (C14360o3.A0K(((C6C9) next).A0H, str2)) {
                obj = next;
                break;
            }
        }
        return (C6C9) obj;
    }

    public final synchronized C6C9 A08(String str, List list, List list2, int i, boolean z) {
        C6C9 c6c9;
        Object obj;
        C05A c05a = this.A0X;
        ArrayList A0U = AbstractC001800i.A0U((Collection) c05a.getValue());
        Iterator it = ((Iterable) c05a.getValue()).iterator();
        while (true) {
            c6c9 = null;
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C6C9) obj).A0H, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C6C9 c6c92 = (C6C9) obj;
        if (c6c92 != null) {
            int indexOf = A0U.indexOf(c6c92);
            if (indexOf < 0) {
                indexOf = 0;
            }
            ArrayList arrayList = new ArrayList(list2);
            if (z) {
                User A05 = C6C8.A05(this.A0B);
                new C1DY((C1DV) new C37761pD(null), 6, false);
                C38705H2q c38705H2q = new C38705H2q(A05, i);
                int i2 = c38705H2q.A00;
                User user = c38705H2q.A01;
                new C1DY((C1DV) new C37761pD(null), 6, false);
                arrayList.add(new C38705H2q(user, i2));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (!C14360o3.A0K(AbstractC76433bn.A00((User) obj2), this.A0B.userId)) {
                    arrayList2.add(obj2);
                }
            }
            ING ing = new ING(c6c92);
            C1DY c1dy = new C1DY((C1DV) new C37761pD(null), 6, false);
            ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((JJD) it2.next()).EsJ(c1dy));
            }
            AnonymousClass689 anonymousClass689 = new AnonymousClass689(arrayList3, arrayList2);
            List list3 = anonymousClass689.A00;
            List list4 = anonymousClass689.A01;
            C1DY c1dy2 = new C1DY((C1DV) new C37761pD(null), 6, false);
            ArrayList arrayList4 = new ArrayList(AbstractC06950Ym.A1E(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((JJD) it3.next()).EsJ(c1dy2));
            }
            ing.A04 = new AnonymousClass689(arrayList4, list4);
            C6C9 A02 = C6C8.A02(ing.A00(), this.A0B);
            HashMap hashMap = this.A0I;
            String str2 = c6c92.A0K;
            C6C9 c6c93 = (C6C9) hashMap.remove(str2);
            if (c6c93 != null) {
                A0U.remove(c6c93);
            }
            hashMap.put(str2, A02);
            A0U.add(indexOf, A02);
            c6c9 = c6c92;
        }
        c05a.Egh(A0U);
        return c6c9;
    }

    public final synchronized void A0D() {
        UserSession userSession = this.A0B;
        if (C18U.A06(C06090Tz.A05, userSession, 36323178372475961L) && this.A02 == null) {
            this.A02 = (LG6) userSession.A01(LG6.class, new C50246MHb(userSession, 45));
            C19L c19l = super.A01;
            C206649Cv c206649Cv = new C206649Cv(this, null, 10);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, c19l);
        }
    }

    public final void A0F(long j, String str) {
        C19L c19l = super.A01;
        AbstractC23641Du.A05(AnonymousClass191.A00, new C50111MAj(this, str, null, 1, j), c19l);
    }

    public final void A0G(long j, String str) {
        int i;
        boolean A06 = C18U.A06(C06090Tz.A05, this.A0B, 36323586394828176L);
        C19L c19l = super.A01;
        if (A06) {
            i = 2;
        } else {
            i = 3;
        }
        AbstractC23641Du.A05(AnonymousClass191.A00, new C50111MAj(this, str, null, i, j), c19l);
    }

    public final synchronized void A0H(C45103JxX c45103JxX, C6C9 c6c9, Integer num) {
        if (c6c9 != null) {
            AbstractC25651Mw.A00(this.A0B).E4s(new LYO(c45103JxX, c6c9, num));
        }
    }

    public final synchronized void A0I(C6C9 c6c9) {
        C05A c05a = this.A0X;
        ArrayList A0U = AbstractC001800i.A0U((Collection) c05a.getValue());
        HashMap hashMap = this.A0I;
        UserSession userSession = this.A0B;
        C6C9 c6c92 = (C6C9) hashMap.remove(userSession.userId);
        if (c6c92 != null) {
            A0U.remove(c6c92);
        }
        if (c6c9 != null) {
            hashMap.put(userSession.userId, c6c9);
            A0U.add(0, c6c9);
        }
        c05a.Egh(A0U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        if (r1.get(r6.A0B.userId) != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A0J(X.C6C9 r7, java.lang.Integer r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            r5 = 1
            r4 = 0
            X.05A r3 = r6.A0X     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r3.getValue()     // Catch: java.lang.Throwable -> L6a
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L6a
            java.util.ArrayList r2 = X.AbstractC001800i.A0U(r0)     // Catch: java.lang.Throwable -> L6a
            int r0 = r8.intValue()     // Catch: java.lang.Throwable -> L6a
            if (r0 == r4) goto L3b
            if (r0 == r5) goto L38
            java.util.HashMap r1 = r6.A0I     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "2"
            java.lang.Object r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L6a
            X.6C9 r0 = (X.C6C9) r0     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L26
            r2.remove(r0)     // Catch: java.lang.Throwable -> L6a
        L26:
            if (r7 == 0) goto L65
            java.lang.String r0 = r7.A0H     // Catch: java.lang.Throwable -> L6a
            r1.put(r0, r7)     // Catch: java.lang.Throwable -> L6a
            com.instagram.common.session.UserSession r0 = r6.A0B     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r0.userId     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L52
            goto L4e
        L38:
            if (r7 == 0) goto L65
            goto L56
        L3b:
            if (r7 == 0) goto L65
            java.util.HashMap r1 = r6.A0I     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r7.A0H     // Catch: java.lang.Throwable -> L6a
            r1.put(r0, r7)     // Catch: java.lang.Throwable -> L6a
            com.instagram.common.session.UserSession r0 = r6.A0B     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r0.userId     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L52
        L4e:
            r2.add(r5, r7)     // Catch: java.lang.Throwable -> L6a
            goto L65
        L52:
            r2.add(r4, r7)     // Catch: java.lang.Throwable -> L6a
            goto L65
        L56:
            java.util.HashMap r1 = r6.A0I     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r7.A0H     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L6a
            X.6C9 r0 = (X.C6C9) r0     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L65
            r2.remove(r0)     // Catch: java.lang.Throwable -> L6a
        L65:
            r3.Egh(r2)     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r6)
            return
        L6a:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.NotesRepository.A0J(X.6C9, java.lang.Integer):void");
    }

    public final void A0K(C6C9 c6c9, String str) {
        C05A c05a = this.A0X;
        ArrayList A0U = AbstractC001800i.A0U((Collection) c05a.getValue());
        if (c6c9 == null) {
            Object remove = this.A0I.remove(str);
            if (remove != null) {
                A0U.remove(remove);
            }
        } else {
            HashMap hashMap = this.A0I;
            C6C9 c6c92 = (C6C9) hashMap.get(str);
            if (c6c92 == null) {
                hashMap.put(str, c6c9);
                A0U.add(c6c9);
            } else if (c6c92.A02 <= c6c9.A02) {
                hashMap.put(str, c6c9);
                int indexOf = A0U.indexOf(c6c92);
                if (indexOf < 0) {
                    indexOf = 0;
                }
                A0U.set(indexOf, c6c9);
            }
        }
        c05a.Egh(A0U);
    }

    public final synchronized void A0L(C6C9 c6c9, String str, int i) {
        List list;
        C05A c05a = this.A0X;
        ArrayList A0U = AbstractC001800i.A0U((Collection) c05a.getValue());
        String str2 = null;
        if (str == null) {
            HashMap hashMap = this.A0I;
            if (c6c9 != null) {
                str2 = c6c9.A0K;
            }
            C6C9 c6c92 = (C6C9) hashMap.remove(String.valueOf(str2));
            if (c6c92 != null) {
                A0U.remove(c6c92);
            }
            if (c6c9 != null) {
                hashMap.put(c6c9.A0K, c6c9);
                A0U.add(i, c6c9);
            }
        } else {
            C05A c05a2 = this.A0Z;
            LinkedHashMap A03 = AbstractC06930Yk.A03((Map) c05a2.getValue());
            C45052Jwh c45052Jwh = (C45052Jwh) ((Map) c05a2.getValue()).get(str);
            if (c45052Jwh != null && (list = c45052Jwh.A05) != null) {
                ArrayList arrayList = new ArrayList(list);
                if (c6c9 != null) {
                    arrayList.set(i, c6c9);
                    C45052Jwh c45052Jwh2 = (C45052Jwh) A03.get(str);
                    if (c45052Jwh2 != null) {
                        String str3 = c45052Jwh2.A03;
                        String str4 = c45052Jwh2.A04;
                        User user = c45052Jwh2.A00;
                        String str5 = c45052Jwh2.A02;
                        String str6 = c45052Jwh2.A01;
                        C14360o3.A0B(str3, 0);
                        C14360o3.A0B(str4, 1);
                        A03.put(str, new C45052Jwh(user, str3, str4, str5, str6, arrayList));
                    }
                }
            }
        }
        c05a.Egh(A0U);
    }

    public final void A0M(NoteAudience noteAudience, C45099JxT c45099JxT, NoteCreationSource noteCreationSource, NoteStyle noteStyle, String str, List list, int i, boolean z) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(noteAudience, 2);
        C14360o3.A0B(noteCreationSource, 4);
        C14360o3.A0B(list, 6);
        AnonymousClass195 anonymousClass195 = this.A09;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        C19L c19l = super.A01;
        this.A09 = AbstractC23641Du.A04(AnonymousClass191.A00, new NotesRepository$postNote$1(this, noteAudience, c45099JxT, noteCreationSource, noteStyle, str, list, null, i, z), c19l);
    }

    public final void A0N(Integer num, Runnable runnable, boolean z, boolean z2) {
        AnonymousClass195 anonymousClass195 = this.A07;
        if ((anonymousClass195 != null && anonymousClass195.isActive()) || !A0T(z)) {
            return;
        }
        C19L c19l = super.A01;
        NotesRepository$fetchNotes$1 notesRepository$fetchNotes$1 = new NotesRepository$fetchNotes$1(this, num, null, z2, z);
        C23671Dx A03 = AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, notesRepository$fetchNotes$1, c19l);
        A03.CPD(new C207189Ex(13, this, runnable));
        this.A07 = A03;
    }

    public final synchronized void A0O(String str) {
        C14360o3.A0B(str, 0);
        A00(str, C16930sl.A00, (Map) this.A0V.getValue());
    }

    public final synchronized void A0P(String str) {
        C1348267y c1348267y;
        List list;
        C05A c05a = this.A0X;
        ArrayList A0U = AbstractC001800i.A0U((Collection) c05a.getValue());
        HashMap hashMap = this.A0I;
        C6C9 c6c9 = (C6C9) hashMap.get(str);
        if (c6c9 != null) {
            int indexOf = A0U.indexOf(c6c9);
            C67s c67s = c6c9.A0A;
            if (c67s != null && (c1348267y = c67s.A0B) != null && C14360o3.A0K(c1348267y.A00, true)) {
                C45052Jwh c45052Jwh = (C45052Jwh) ((Map) this.A0Z.getValue()).get(str);
                if (c45052Jwh != null && (list = c45052Jwh.A05) != null) {
                    ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C6C9) it.next()).A0H);
                    }
                    C19L c19l = super.A01;
                    AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C9D3(this, arrayList, (InterfaceC23621Ds) null, 49), c19l);
                }
                IN4 in4 = new IN4(c1348267y);
                in4.A00 = false;
                InterfaceC1347967p A01 = in4.A01();
                INC inc = new INC(c67s);
                inc.A0B = A01;
                C67R A012 = inc.A01();
                if (A012 != null) {
                    ING ing = new ING(c6c9);
                    ing.A0A = A012;
                    C6C9 A02 = C6C8.A02(ing.A00(), this.A0B);
                    hashMap.put(str, A02);
                    if (indexOf != -1) {
                        A0U.set(indexOf, A02);
                    }
                    c05a.Egh(A0U);
                }
            }
        }
    }

    public final synchronized void A0Q(String str, String str2) {
        List list;
        Object obj;
        C14360o3.A0B(str, 0);
        C05A c05a = this.A0Z;
        LinkedHashMap A03 = AbstractC06930Yk.A03((Map) c05a.getValue());
        C45052Jwh c45052Jwh = (C45052Jwh) ((Map) c05a.getValue()).get(str2);
        if (c45052Jwh != null && (list = c45052Jwh.A05) != null) {
            ArrayList arrayList = new ArrayList(list);
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (C14360o3.A0K(((C6C9) obj).A0H, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C6C9 c6c9 = (C6C9) obj;
            if (c6c9 != null && c6c9.A0R) {
                ING ing = new ING(c6c9);
                ing.A0R = false;
                arrayList.set(arrayList.indexOf(c6c9), C6C8.A02(ing.A00(), this.A0B));
                C45052Jwh c45052Jwh2 = (C45052Jwh) A03.get(str2);
                if (c45052Jwh2 != null) {
                    String str3 = c45052Jwh2.A03;
                    String str4 = c45052Jwh2.A04;
                    User user = c45052Jwh2.A00;
                    String str5 = c45052Jwh2.A02;
                    String str6 = c45052Jwh2.A01;
                    C14360o3.A0B(str3, 0);
                    C14360o3.A0B(str4, 1);
                    A03.put(str2, new C45052Jwh(user, str3, str4, str5, str6, arrayList));
                }
                c05a.Egh(A03);
                C05A c05a2 = this.A0X;
                c05a2.Egh(AbstractC001800i.A0U((Collection) c05a2.getValue()));
            }
        }
    }

    public final void A0R(String str, String str2, String str3, boolean z) {
        Object obj;
        C6C9 c6c9;
        C19L c19l;
        int i;
        JZ1 jz1;
        AnonymousClass688 anonymousClass688;
        List list;
        Object obj2;
        AnonymousClass195 anonymousClass195 = this.A08;
        if (anonymousClass195 != null && anonymousClass195.isActive()) {
            return;
        }
        if (str2 != null) {
            C45052Jwh c45052Jwh = (C45052Jwh) ((Map) this.A0Z.getValue()).get(str2);
            if (c45052Jwh == null || (list = c45052Jwh.A05) == null) {
                return;
            }
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (C14360o3.A0K(((C6C9) obj2).A0H, str)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            c6c9 = (C6C9) obj2;
        } else {
            Iterator it2 = ((Iterable) this.A0X.getValue()).iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (C14360o3.A0K(((C6C9) obj).A0H, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            c6c9 = (C6C9) obj;
        }
        if (c6c9 == null || c6c9.A01 == NoteStyle.A0B.A00) {
            return;
        }
        String str4 = c6c9.A0H;
        if (z) {
            boolean A06 = C18U.A06(C06090Tz.A05, this.A0B, 36323586394697102L);
            c19l = super.A01;
            if (A06) {
                jz1 = new JZ1(this, c6c9, null, str2, null, 7);
            } else {
                jz1 = new JZ1(this, c6c9, null, str2, null, 8);
            }
        } else if (str3 == null && (anonymousClass688 = c6c9.A07) != null) {
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C206709Db(this, anonymousClass688, str4, null, 3), super.A01);
            return;
        } else {
            boolean A062 = C18U.A06(C06090Tz.A05, this.A0B, 36323586394697102L);
            c19l = super.A01;
            if (A062) {
                i = 7;
            } else {
                i = 8;
            }
            jz1 = new JZ1(this, c6c9, str3, str2, null, i);
        }
        this.A08 = AbstractC23641Du.A04(AnonymousClass191.A00, jz1, c19l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        if (r18 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        r10 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0080, code lost:
    
        if (r18 != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A0S(java.lang.String r14, java.util.List r15, boolean r16, boolean r17, boolean r18) {
        /*
            r13 = this;
            r12 = r13
            monitor-enter(r12)
            java.util.HashMap r9 = r13.A0I     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object r8 = r9.get(r14)     // Catch: java.lang.Throwable -> Lcd
            X.6C9 r8 = (X.C6C9) r8     // Catch: java.lang.Throwable -> Lcd
            if (r8 == 0) goto Lcb
            int r7 = r15.indexOf(r8)     // Catch: java.lang.Throwable -> Lcd
            X.67s r6 = r8.A0A     // Catch: java.lang.Throwable -> Lcd
            if (r6 == 0) goto Lc3
            X.67y r5 = r6.A0B     // Catch: java.lang.Throwable -> Lcd
            if (r5 == 0) goto Lc3
            java.util.List r0 = r5.A04     // Catch: java.lang.Throwable -> Lcd
            if (r0 == 0) goto L22
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcd
            r4.<init>(r0)     // Catch: java.lang.Throwable -> Lcd
            goto L27
        L22:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcd
            r4.<init>()     // Catch: java.lang.Throwable -> Lcd
        L27:
            X.18A r1 = r13.A0G     // Catch: java.lang.Throwable -> Lc1
            com.instagram.common.session.UserSession r3 = r13.A0B     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = r3.userId     // Catch: java.lang.Throwable -> Lc1
            com.instagram.user.model.User r2 = r1.A02(r0)     // Catch: java.lang.Throwable -> Lc1
            java.util.Iterator r11 = r4.iterator()     // Catch: java.lang.Throwable -> Lc1
        L35:
            boolean r0 = r11.hasNext()     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L53
            java.lang.Object r1 = r11.next()     // Catch: java.lang.Throwable -> Lc1
            r0 = r1
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r10 = r0.getId()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = r3.userId     // Catch: java.lang.Throwable -> Lc1
            boolean r0 = X.C14360o3.A0K(r10, r0)     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L35
        L4e:
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1     // Catch: java.lang.Throwable -> Lc1
            if (r2 == 0) goto L6d
            goto L55
        L53:
            r1 = 0
            goto L4e
        L55:
            r0 = 0
            if (r16 == 0) goto L60
            if (r17 != 0) goto L6d
            if (r18 == 0) goto L6a
            r4.remove(r2)     // Catch: java.lang.Throwable -> Lc1
            goto L6d
        L60:
            if (r18 != 0) goto L6a
            java.util.Collection r0 = X.C15500q5.A00(r4)     // Catch: java.lang.Throwable -> Lc1
            r0.remove(r1)     // Catch: java.lang.Throwable -> Lc1
            goto L6d
        L6a:
            r4.add(r0, r2)     // Catch: java.lang.Throwable -> Lc1
        L6d:
            java.lang.Integer r0 = r5.A01     // Catch: java.lang.Throwable -> Lcd
            if (r0 == 0) goto L76
            int r10 = r0.intValue()     // Catch: java.lang.Throwable -> Lcd
            goto L77
        L76:
            r10 = 0
        L77:
            if (r16 == 0) goto L80
            if (r17 != 0) goto L84
            if (r18 == 0) goto L82
        L7d:
            int r10 = r10 + (-1)
            goto L84
        L80:
            if (r18 == 0) goto L7d
        L82:
            int r10 = r10 + 1
        L84:
            X.IN4 r1 = new X.IN4     // Catch: java.lang.Throwable -> Lcd
            r1.<init>(r5)     // Catch: java.lang.Throwable -> Lcd
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> Lcd
            r1.A01 = r0     // Catch: java.lang.Throwable -> Lcd
            r1.A04 = r4     // Catch: java.lang.Throwable -> Lcd
            X.67p r2 = r1.A01()     // Catch: java.lang.Throwable -> Lcd
            X.ING r1 = new X.ING     // Catch: java.lang.Throwable -> Lcd
            r1.<init>(r8)     // Catch: java.lang.Throwable -> Lcd
            X.INC r0 = new X.INC     // Catch: java.lang.Throwable -> Lcd
            r0.<init>(r6)     // Catch: java.lang.Throwable -> Lcd
            r0.A0B = r2     // Catch: java.lang.Throwable -> Lcd
            X.67R r0 = r0.A01()     // Catch: java.lang.Throwable -> Lcd
            r1.A0A = r0     // Catch: java.lang.Throwable -> Lcd
            X.6C9 r0 = r1.A00()     // Catch: java.lang.Throwable -> Lcd
            X.6C9 r1 = X.C6C8.A02(r0, r3)     // Catch: java.lang.Throwable -> Lcd
            r9.put(r14, r1)     // Catch: java.lang.Throwable -> Lcd
            r0 = -1
            if (r7 == r0) goto Lb8
            r15.set(r7, r1)     // Catch: java.lang.Throwable -> Lcd
        Lb8:
            if (r10 != 0) goto Lcb
            r9.remove(r14)     // Catch: java.lang.Throwable -> Lcd
            r15.remove(r1)     // Catch: java.lang.Throwable -> Lcd
            goto Lcb
        Lc1:
            r1 = move-exception
            goto Lca
        Lc3:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lcd
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lcd
        Lca:
            throw r1     // Catch: java.lang.Throwable -> Lcd
        Lcb:
            monitor-exit(r12)
            return
        Lcd:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.NotesRepository.A0S(java.lang.String, java.util.List, boolean, boolean, boolean):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotesRepository(UserSession userSession) {
        super("Direct", C4A8.A01(4599877, C18U.A06(C06090Tz.A05, userSession, 36323178372607035L) ? 2 : 3));
        Context A06 = userSession.deviceSession.A06();
        PendingMediaStore A00 = C25A.A00(userSession);
        this.A0B = userSession;
        this.A0A = A06;
        this.A0F = A00;
        this.A0C = new NotesApi(userSession, AbstractC40691uc.A01(userSession));
        this.A0I = new HashMap();
        C16930sl c16930sl = C16930sl.A00;
        C008002u A002 = C10E.A00(c16930sl);
        this.A0X = A002;
        Integer num = C05F.A00;
        AnonymousClass057 A003 = C10M.A00(num, 0, 0);
        this.A0M = A003;
        this.A0e = new C06160Ug(null, A003);
        AnonymousClass057 A004 = C10M.A00(num, 0, 0);
        this.A0O = A004;
        this.A0g = new C06160Ug(null, A004);
        C008002u A005 = C10E.A00(AbstractC06930Yk.A0E());
        this.A0Z = A005;
        this.A0r = AbstractC208910l.A02(A005);
        C008002u A006 = C10E.A00(c16930sl);
        this.A0b = A006;
        this.A0t = AbstractC208910l.A02(A006);
        C008002u A007 = C10E.A00(c16930sl);
        this.A0T = A007;
        this.A0l = AbstractC208910l.A02(A007);
        Integer num2 = C05F.A0C;
        AnonymousClass057 A008 = C10M.A00(num2, 0, 1);
        this.A0S = A008;
        this.A0k = new C06160Ug(null, A008);
        AnonymousClass057 A009 = C10M.A00(num2, 0, 1);
        this.A0R = A009;
        this.A0j = new C06160Ug(null, A009);
        this.A0p = AbstractC208910l.A02(A002);
        this.A0G = AnonymousClass189.A00(userSession);
        this.A0D = new C4AA(userSession);
        this.A0H = new HashMap();
        C008002u A0010 = C10E.A00(AbstractC06930Yk.A0E());
        this.A0V = A0010;
        this.A0n = AbstractC208910l.A02(A0010);
        this.A0J = new LinkedHashMap();
        C008002u c008002u = new C008002u(false);
        this.A0W = c008002u;
        this.A0o = AbstractC208910l.A02(c008002u);
        AnonymousClass057 A0011 = C10M.A00(num2, 0, 1);
        this.A0L = A0011;
        this.A0d = new C06160Ug(null, A0011);
        C008002u A0012 = C10E.A00(null);
        this.A0a = A0012;
        this.A0s = AbstractC208910l.A02(A0012);
        C008002u c008002u2 = new C008002u(false);
        this.A0Y = c008002u2;
        this.A0q = AbstractC208910l.A02(c008002u2);
        this.A06 = new C73163Pr();
        C008002u A0013 = C10E.A00(null);
        this.A0U = A0013;
        this.A0m = AbstractC208910l.A02(A0013);
        AnonymousClass057 A0014 = C10M.A00(num, 0, 0);
        this.A0Q = A0014;
        this.A0i = new C06160Ug(null, A0014);
        AnonymousClass057 A0015 = C10M.A00(num, 0, 0);
        this.A0P = A0015;
        this.A0h = new C06160Ug(null, A0015);
        AnonymousClass057 A0016 = C10M.A00(num2, 0, 1);
        this.A0K = A0016;
        this.A0c = new C06160Ug(null, A0016);
        this.A0E = new C4AB();
        this.A03 = new HashMap();
        this.A04 = new HashSet();
        AnonymousClass057 A0017 = C10M.A00(C05F.A01, 0, 1);
        this.A0N = A0017;
        this.A0f = new C06160Ug(null, A0017);
    }

    public static final Map A00(Object obj, Object obj2, Map map) {
        C06860Yd c06860Yd = new C06860Yd();
        c06860Yd.putAll(map);
        c06860Yd.put(obj, obj2);
        return AbstractC16850sd.A0N(c06860Yd);
    }

    public static final void A03(AbstractC115105If abstractC115105If, NotesRepository notesRepository) {
        String A00 = AbstractC43591JPw.A00(677);
        StringBuilder sb = new StringBuilder();
        sb.append("Fetch Notes error: ");
        sb.append(abstractC115105If);
        C0K8.A0C(A00, sb.toString());
        C4AA c4aa = notesRepository.A0D;
        String obj = abstractC115105If.toString();
        C14360o3.A0B(obj, 0);
        C006802i c006802i = c4aa.A00;
        c006802i.markerPoint(275915771, "notes_fetch_server_failure");
        c006802i.markerAnnotate(275915771, "error_message", obj);
        c006802i.markerEnd(275915771, (short) 3);
        C1ZX A01 = C1ZV.A00(notesRepository.A0B).A01(C05F.A0N, C05F.A0K, true);
        A01.A03("error_message: ", abstractC115105If.toString());
        A01.A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[PHI: r0
      0x0029: PHI (r0v15 java.lang.Object) = (r0v14 java.lang.Object), (r0v1 java.lang.Object) binds: [B:17:0x00a9, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A09(X.C45103JxX r12, java.lang.String r13, java.util.List r14, X.InterfaceC23621Ds r15) {
        /*
            r11 = this;
            r3 = 35
            boolean r0 = X.MAF.A01(r15, r3)
            if (r0 == 0) goto Lac
            r5 = r15
            X.MAF r5 = (X.MAF) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lac
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A02
            X.1JX r6 = X.C1JX.A02
            int r1 = r5.A00
            r2 = 0
            r4 = 2
            r3 = 0
            r7 = 1
            if (r1 == 0) goto L30
            if (r1 == r7) goto L2a
            if (r1 != r4) goto Lb3
            X.AbstractC09560e7.A00(r0)
        L29:
            return r0
        L2a:
            java.lang.Object r7 = r5.A01
            X.AbstractC09560e7.A00(r0)
            goto L90
        L30:
            X.AbstractC09560e7.A00(r0)
            java.util.Iterator r10 = r14.iterator()
            r9 = 0
        L38:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r8 = r10.next()
            X.1qM r8 = (X.C38321qM) r8
            X.1tc r1 = r8.BRp()
            X.1tc r0 = X.EnumC40111tc.A0Q
            if (r1 == r0) goto L54
            X.1tc r1 = r8.BRp()
            X.1tc r0 = X.EnumC40111tc.A0a
            if (r1 != r0) goto L38
        L54:
            r9 = 1
            goto L38
        L56:
            if (r9 != 0) goto Lbb
            if (r12 != 0) goto Lbb
            if (r13 != 0) goto Lbb
            android.content.Context r1 = r11.A0A
            X.1CM r0 = new X.1CM
            r0.<init>(r1)
            boolean r0 = r0.A07(r2)
            if (r0 != 0) goto Lbb
            com.instagram.common.session.UserSession r8 = r11.A0B
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326300813637436(0x810e940000373c, double:3.0362371365923455E-306)
            boolean r0 = X.C18U.A06(r2, r8, r0)
            if (r0 == 0) goto Lbb
            X.3Pr r0 = new X.3Pr
            r0.<init>()
            r11.A06 = r0
            X.05A r1 = r11.A0Y
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r5.A01 = r11
            r5.A00 = r7
            java.lang.Object r0 = r1.emit(r0, r5)
            if (r0 == r6) goto Lab
            r7 = r11
        L90:
            X.12L r2 = X.C12L.A00
            r1 = 480314591(0x1ca104df, float:1.0655345E-21)
            r0 = 3
            X.0nZ r2 = r2.CPG(r1, r0)
            r1 = 38
            X.GSR r0 = new X.GSR
            r0.<init>(r7, r3, r1)
            r5.A01 = r3
            r5.A00 = r4
            java.lang.Object r0 = X.AbstractC23641Du.A00(r5, r2, r0)
            if (r0 != r6) goto L29
        Lab:
            return r6
        Lac:
            X.MAF r5 = new X.MAF
            r5.<init>(r11, r15, r3)
            goto L16
        Lb3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lbb:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.NotesRepository.A09(X.JxX, java.lang.String, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0A(com.instagram.common.session.UserSession r6, java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r5 = this;
            r3 = 18
            boolean r0 = X.MAK.A01(r8, r3)
            if (r0 == 0) goto L4a
            r4 = r8
            X.MAK r4 = (X.MAK) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L74
            java.lang.Object r7 = r4.A02
            java.lang.Object r3 = r4.A01
            com.instagram.direct.inbox.notes.NotesRepository r3 = (com.instagram.direct.inbox.notes.NotesRepository) r3
            X.AbstractC09560e7.A00(r1)
        L2a:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L7d
            monitor-enter(r3)
            goto L50
        L30:
            X.AbstractC09560e7.A00(r1)
            X.1ud r1 = X.AbstractC40691uc.A01(r6)
            com.instagram.direct.inbox.notes.NotesApi r0 = new com.instagram.direct.inbox.notes.NotesApi
            r0.<init>(r6, r1)
            r4.A01 = r5
            r4.A02 = r7
            r4.A00 = r2
            java.lang.Object r1 = r0.A05(r7, r4)
            if (r1 == r3) goto L7f
            r3 = r5
            goto L2a
        L4a:
            X.MAK r4 = new X.MAK
            r4.<init>(r5, r8, r3)
            goto L16
        L50:
            r0 = 0
            X.C14360o3.A0B(r7, r0)     // Catch: java.lang.Throwable -> L71
            X.05A r2 = r3.A0X     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r2.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L71
            java.util.ArrayList r1 = X.AbstractC001800i.A0U(r0)     // Catch: java.lang.Throwable -> L71
            java.util.HashMap r0 = r3.A0I     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.remove(r7)     // Catch: java.lang.Throwable -> L71
            X.6C9 r0 = (X.C6C9) r0     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L7c
            r1.remove(r0)     // Catch: java.lang.Throwable -> L71
            r2.Egh(r1)     // Catch: java.lang.Throwable -> L71
            goto L7c
        L71:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L74:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L7c:
            monitor-exit(r3)
        L7d:
            X.0eB r3 = X.C0eB.A00
        L7f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.NotesRepository.A0A(com.instagram.common.session.UserSession, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:254:0x05d6, code lost:
    
        if (r14 == false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01cf, code lost:
    
        if (r5 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01d4, code lost:
    
        if (r5 != null) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:409:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0288  */
    /* JADX WARN: Type inference failed for: r10v7, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0B(X.InterfaceC23621Ds r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 2015
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.NotesRepository.A0B(X.1Ds, boolean):java.lang.Object");
    }

    public final void A0C() {
        C19L c19l = super.A01;
        C206649Cv c206649Cv = new C206649Cv(this, null, 13);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, c19l);
    }

    public final void A0E(long j, String str) {
        InterfaceC16620sF c50113MAm;
        boolean A06 = C18U.A06(C06090Tz.A05, this.A0B, 36323586394566028L);
        C19L c19l = super.A01;
        if (A06) {
            c50113MAm = new NotesRepository$createNoteEmojiReaction$1(this, "❤️", str, null, j);
        } else {
            c50113MAm = new C50113MAm(this, str, "❤️", null, 1, j);
        }
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c50113MAm, c19l);
    }

    public final boolean A0T(boolean z) {
        UserSession userSession = this.A0B;
        if (C4AC.A03(userSession)) {
            long A01 = C18U.A01(C06090Tz.A05, userSession, 36603562427487184L);
            boolean z2 = false;
            if (this.A01 + TimeUnit.SECONDS.toMillis(A01) >= System.currentTimeMillis()) {
                z2 = true;
                C006802i c006802i = this.A0D.A00;
                c006802i.markerStart(275915771);
                c006802i.markerPoint(275915771, "notes_fetch_cooldown_enforced");
                c006802i.markerEnd(275915771, (short) 2);
            }
            AnonymousClass195 anonymousClass195 = this.A09;
            if ((anonymousClass195 == null || !anonymousClass195.isActive()) && (z || !z2)) {
                return true;
            }
        }
        return false;
    }
}
