package X;

import com.instagram.api.schemas.CollectionPrivacyModeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Fzp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36295Fzp implements InterfaceC13000lm {
    public static long A07 = -1;
    public boolean A01;
    public final C0JO A02;
    public final boolean A05;
    public final List A06;
    public final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();
    public LinkedList A00 = new LinkedList();

    private final synchronized C34930FaG A00(String str) {
        C34930FaG c34930FaG;
        EnumC33416Epn enumC33416Epn = (EnumC33416Epn) this.A03.get(str);
        if (enumC33416Epn != null) {
            c34930FaG = (C34930FaG) this.A04.get(enumC33416Epn);
        } else {
            c34930FaG = null;
        }
        return c34930FaG;
    }

    private final synchronized void A01() {
        if (this.A05) {
            this.A00.clear();
        } else {
            this.A03.clear();
            for (EnumC33416Epn enumC33416Epn : EnumC33416Epn.values()) {
                this.A04.put(enumC33416Epn, new C34930FaG());
            }
        }
        this.A01 = false;
    }

    public final synchronized List A02(List list, List list2) {
        ArrayList A1E;
        LinkedList<SavedCollection> linkedList;
        if (list == null) {
            EnumC33416Epn[] values = EnumC33416Epn.values();
            list = AbstractC16960so.A1Q(Arrays.copyOf(values, values.length));
        }
        if (list2 == null) {
            EnumC33380EpD[] values2 = EnumC33380EpD.values();
            list2 = AbstractC16960so.A1Q(Arrays.copyOf(values2, values2.length));
        }
        A1E = AbstractC166987dD.A1E();
        if (this.A05) {
            for (SavedCollection savedCollection : this.A00) {
                EnumC33380EpD enumC33380EpD = savedCollection.A06;
                if (enumC33380EpD == null || AbstractC001800i.A0u(list2, enumC33380EpD)) {
                    if (list.contains(savedCollection.A07)) {
                        A1E.add(savedCollection);
                    }
                }
            }
        } else {
            for (EnumC33416Epn enumC33416Epn : this.A06) {
                if (list.contains(enumC33416Epn)) {
                    Object obj = this.A04.get(enumC33416Epn);
                    if (obj != null) {
                        C34930FaG c34930FaG = (C34930FaG) obj;
                        synchronized (c34930FaG) {
                            try {
                                linkedList = c34930FaG.A00;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        for (SavedCollection savedCollection2 : linkedList) {
                            EnumC33380EpD enumC33380EpD2 = savedCollection2.A06;
                            if (enumC33380EpD2 == null || AbstractC001800i.A0u(list2, enumC33380EpD2)) {
                                A1E.add(savedCollection2);
                            }
                        }
                    } else {
                        throw AbstractC25227BEk.A0n();
                    }
                }
            }
        }
        return AbstractC31172DnG.A19(A1E);
    }

    public final synchronized void A03(CollectionPrivacyModeEnum collectionPrivacyModeEnum, C38321qM c38321qM, Integer num, String str, String str2) {
        C14360o3.A0B(str, 0);
        if (this.A05) {
            Iterator A13 = AbstractC166997dE.A13(this.A00);
            while (true) {
                if (!A13.hasNext()) {
                    break;
                }
                SavedCollection savedCollection = (SavedCollection) AbstractC166997dE.A0l(A13);
                if (C14360o3.A0K(savedCollection.A0F, str)) {
                    if (str2 != null) {
                        savedCollection.A0G = str2;
                    }
                    if (num != null) {
                        savedCollection.A0E = Integer.valueOf(num.intValue());
                    }
                    if (c38321qM != null) {
                        savedCollection.A0H = c38321qM.getId();
                        savedCollection.A04 = c38321qM;
                    }
                    if (collectionPrivacyModeEnum != null) {
                        savedCollection.A00 = collectionPrivacyModeEnum;
                    }
                    this.A00.remove(savedCollection);
                    this.A00.add(0, savedCollection);
                }
            }
        } else {
            C34930FaG A00 = A00(str);
            if (A00 != null) {
                if (str2 != null) {
                    synchronized (A00) {
                        try {
                            int A002 = C34930FaG.A00(A00, str);
                            if (A002 != -1) {
                                LinkedList linkedList = A00.A00;
                                SavedCollection savedCollection2 = (SavedCollection) linkedList.get(A002);
                                if (savedCollection2 != null) {
                                    savedCollection2.A0G = str2;
                                    if (num != null) {
                                        savedCollection2.A0E = Integer.valueOf(num.intValue());
                                    }
                                    if (c38321qM != null) {
                                        savedCollection2.A0H = c38321qM.getId();
                                        savedCollection2.A04 = c38321qM;
                                    }
                                    if (collectionPrivacyModeEnum != null) {
                                        savedCollection2.A00 = collectionPrivacyModeEnum;
                                    }
                                    linkedList.remove(savedCollection2);
                                    linkedList.add(0, savedCollection2);
                                }
                            }
                        } catch (Throwable th) {
                        }
                    }
                } else {
                    throw AbstractC25227BEk.A0n();
                }
            }
        }
    }

    public final synchronized void A04(SavedCollection savedCollection) {
        if (this.A05) {
            this.A00.addFirst(savedCollection);
        } else {
            this.A03.put(savedCollection.A0F, savedCollection.A07);
            C34930FaG c34930FaG = (C34930FaG) this.A04.get(savedCollection.A07);
            if (c34930FaG != null) {
                synchronized (c34930FaG) {
                    c34930FaG.A00.add(0, savedCollection);
                }
            }
        }
    }

    public final synchronized void A05(String str) {
        C14360o3.A0B(str, 0);
        if (this.A05) {
            LinkedList linkedList = new LinkedList();
            for (SavedCollection savedCollection : this.A00) {
                if (!C14360o3.A0K(savedCollection.A0F, str)) {
                    linkedList.add(savedCollection);
                }
            }
            this.A00 = linkedList;
        } else {
            C34930FaG A00 = A00(str);
            if (A00 != null) {
                synchronized (A00) {
                    int A002 = C34930FaG.A00(A00, str);
                    if (A002 != -1) {
                        A00.A00.remove(A002);
                    }
                }
                this.A03.remove(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A06(java.util.List r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            r7 = r8
            monitor-enter(r7)
            if (r10 == 0) goto L7
            r8.A01()     // Catch: java.lang.Throwable -> La4
        L7:
            boolean r0 = r9.isEmpty()     // Catch: java.lang.Throwable -> La4
            r3 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L28
            if (r11 == 0) goto L28
            java.util.ArrayList r9 = X.AbstractC166987dD.A1F(r9)     // Catch: java.lang.Throwable -> La4
            java.lang.String r4 = "my_favs"
            java.lang.String r2 = "Favorites"
            X.Epn r0 = X.EnumC33416Epn.A0A     // Catch: java.lang.Throwable -> La4
            com.instagram.save.model.SavedCollection r1 = new com.instagram.save.model.SavedCollection     // Catch: java.lang.Throwable -> La4
            r1.<init>(r0, r4, r2)     // Catch: java.lang.Throwable -> La4
            com.instagram.api.schemas.CollectionPrivacyModeEnum r0 = com.instagram.api.schemas.CollectionPrivacyModeEnum.A06     // Catch: java.lang.Throwable -> La4
            r1.A00 = r0     // Catch: java.lang.Throwable -> La4
            r9.add(r3, r1)     // Catch: java.lang.Throwable -> La4
        L28:
            java.util.Iterator r6 = r9.iterator()     // Catch: java.lang.Throwable -> La4
        L2c:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L98
            java.lang.Object r4 = r6.next()     // Catch: java.lang.Throwable -> La4
            com.instagram.save.model.SavedCollection r4 = (com.instagram.save.model.SavedCollection) r4     // Catch: java.lang.Throwable -> La4
            boolean r5 = r8.A05     // Catch: java.lang.Throwable -> La4
            if (r5 == 0) goto L64
            java.util.LinkedList r1 = r8.A00     // Catch: java.lang.Throwable -> La4
            boolean r0 = r1 instanceof java.util.Collection     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L49
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L49
            goto L6e
        L49:
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> La4
        L4d:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> La4
            com.instagram.save.model.SavedCollection r0 = (com.instagram.save.model.SavedCollection) r0     // Catch: java.lang.Throwable -> La4
            java.lang.String r1 = r0.A0F     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = r4.A0F     // Catch: java.lang.Throwable -> La4
            boolean r0 = X.C14360o3.A0K(r1, r0)     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L4d
            goto L2c
        L64:
            java.util.concurrent.ConcurrentHashMap r1 = r8.A03     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = r4.A0F     // Catch: java.lang.Throwable -> La4
            boolean r0 = r1.containsKey(r0)     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto L2c
        L6e:
            if (r5 == 0) goto L76
            java.util.LinkedList r0 = r8.A00     // Catch: java.lang.Throwable -> L96
            r0.add(r4)     // Catch: java.lang.Throwable -> L96
            goto L2c
        L76:
            java.util.concurrent.ConcurrentHashMap r2 = r8.A03     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = r4.A0F     // Catch: java.lang.Throwable -> L96
            X.Epn r0 = r4.A07     // Catch: java.lang.Throwable -> L96
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L96
            java.util.concurrent.ConcurrentHashMap r1 = r8.A04     // Catch: java.lang.Throwable -> L96
            X.Epn r0 = r4.A07     // Catch: java.lang.Throwable -> L96
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L96
            X.FaG r1 = (X.C34930FaG) r1     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto L2c
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L96
            java.util.LinkedList r0 = r1.A00     // Catch: java.lang.Throwable -> L93
            r0.add(r4)     // Catch: java.lang.Throwable -> L93
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L96
            goto L2c
        L93:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L96
            throw r0     // Catch: java.lang.Throwable -> L96
        L96:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> La4
        L98:
            X.0JO r0 = r8.A02     // Catch: java.lang.Throwable -> La4
            long r0 = r0.now()     // Catch: java.lang.Throwable -> La4
            X.C36295Fzp.A07 = r0     // Catch: java.lang.Throwable -> La4
            r8.A01 = r3     // Catch: java.lang.Throwable -> La4
            monitor-exit(r7)
            return
        La4:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36295Fzp.A06(java.util.List, boolean, boolean):void");
    }

    public final synchronized boolean A07() {
        int size;
        int size2;
        long now = this.A02.now();
        long j = A07;
        if (j != -1 && now >= j && now - j <= 120000) {
            if (this.A05) {
                LinkedList linkedList = this.A00;
                if (!(linkedList instanceof Collection) || !linkedList.isEmpty()) {
                    Iterator it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((SavedCollection) it.next()).A07 == EnumC33416Epn.A0A) {
                            LinkedList linkedList2 = this.A00;
                            if (!(linkedList2 instanceof Collection) || !linkedList2.isEmpty()) {
                                Iterator it2 = linkedList2.iterator();
                                while (it2.hasNext()) {
                                    if (((SavedCollection) it2.next()).A07 == EnumC33416Epn.A05) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                ConcurrentHashMap concurrentHashMap = this.A04;
                Object obj = concurrentHashMap.get(EnumC33416Epn.A0A);
                C14360o3.A0A(obj);
                C34930FaG c34930FaG = (C34930FaG) obj;
                synchronized (c34930FaG) {
                    size = c34930FaG.A00.size();
                }
                if (size > 0) {
                    Object obj2 = concurrentHashMap.get(EnumC33416Epn.A05);
                    C14360o3.A0A(obj2);
                    C34930FaG c34930FaG2 = (C34930FaG) obj2;
                    synchronized (c34930FaG2) {
                        size2 = c34930FaG2.A00.size();
                    }
                    if (size2 == 0) {
                    }
                }
            }
        }
        A01();
        return this.A01;
    }

    public C36295Fzp(C0JO c0jo, UserSession userSession) {
        this.A02 = c0jo;
        boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36321142558106791L);
        this.A05 = A06;
        if (!A06) {
            for (EnumC33416Epn enumC33416Epn : EnumC33416Epn.values()) {
                this.A04.put(enumC33416Epn, new C34930FaG());
            }
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(EnumC33416Epn.A0D);
        A1E.add(EnumC33416Epn.A05);
        A1E.add(EnumC33416Epn.A0C);
        A1E.add(EnumC33416Epn.A09);
        A1E.add(EnumC33416Epn.A06);
        A1E.add(EnumC33416Epn.A08);
        A1E.add(EnumC33416Epn.A0A);
        this.A06 = AbstractC31172DnG.A19(A1E);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A01();
    }
}
