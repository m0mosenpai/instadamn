package com.instagram.reels.store;

import X.AbstractC108314uI;
import X.AbstractC108524ud;
import X.AbstractC221915u;
import X.AbstractC25351Lp;
import X.AbstractC25651Mw;
import X.AbstractC37741pB;
import X.AbstractC38741r6;
import X.AbstractC38851rI;
import X.AbstractC41111vK;
import X.AbstractC73313Qh;
import X.AbstractC73343Qk;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C0fO;
import X.C0w9;
import X.C105814ps;
import X.C105824pt;
import X.C108324uJ;
import X.C114855Gv;
import X.C11T;
import X.C14360o3;
import X.C15W;
import X.C16V;
import X.C17060sy;
import X.C17Y;
import X.C17z;
import X.C18B;
import X.C18U;
import X.C1DS;
import X.C1N5;
import X.C1N6;
import X.C1N9;
import X.C1NB;
import X.C1Ns;
import X.C1OP;
import X.C1ZV;
import X.C1ZX;
import X.C207479Ga;
import X.C218914p;
import X.C25371Lr;
import X.C25671My;
import X.C2Q5;
import X.C32061E6n;
import X.C37761pD;
import X.C37771pE;
import X.C37941pb;
import X.C38321qM;
import X.C38801rC;
import X.C3DH;
import X.C3NK;
import X.C3NM;
import X.C3NO;
import X.C3W0;
import X.C41131vM;
import X.C41661wG;
import X.C47Z;
import X.C50711Ma8;
import X.C74393Vv;
import X.C74413Vx;
import X.C74433Vz;
import X.C82103lW;
import X.C9GZ;
import X.EnumC109104va;
import X.EnumC76383bi;
import X.EnumC915447k;
import X.InterfaceC12870lZ;
import X.InterfaceC13000lm;
import X.InterfaceC16820sZ;
import X.InterfaceC40171tl;
import X.InterfaceC41501vz;
import X.InterfaceC74403Vw;
import X.InterfaceC74423Vy;
import android.util.LruCache;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.stash.core.Stash;
import com.facebook.systrace.Systrace;
import com.instagram.api.schemas.IGUserHighlightsTrayType;
import com.instagram.api.schemas.PendingShareToFriendsStoryBadgePreviewState;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public final class ReelStore implements InterfaceC12870lZ, InterfaceC13000lm {
    public InterfaceC41501vz A00;
    public C1N6 A02;
    public C1N6 A03;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C25671My A08;
    public final UserSession A09;
    public final C1N5 A0A;
    public final ConcurrentMap A0D;
    public final Map A0B = new HashMap();
    public final Set A0C = new HashSet();
    public ArrayList A04 = new ArrayList();
    public Reel A01 = null;

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec A[Catch: all -> 0x013c, TryCatch #0 {, blocks: (B:3:0x0001, B:4:0x000a, B:6:0x0010, B:8:0x001c, B:11:0x0030, B:60:0x0036, B:62:0x0043, B:63:0x0045, B:66:0x004b, B:69:0x004f, B:72:0x005d, B:74:0x0063, B:23:0x0097, B:25:0x00aa, B:28:0x00b2, B:30:0x00c3, B:32:0x00c9, B:50:0x00cd, B:35:0x00db, B:48:0x00df, B:43:0x00e7, B:37:0x00ec, B:39:0x00f2, B:77:0x0069, B:79:0x006d, B:82:0x0073, B:14:0x007a, B:16:0x008f, B:96:0x00f9, B:99:0x00ff, B:103:0x0119), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized X.C1N6 A02(com.instagram.reels.store.ReelStore r8, java.util.Collection r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.store.ReelStore.A02(com.instagram.reels.store.ReelStore, java.util.Collection, boolean):X.1N6");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e0, code lost:
    
        if (r1 == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.util.ArrayList A05(com.instagram.reels.store.ReelStore r12, com.instagram.user.model.User r13) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.store.ReelStore.A05(com.instagram.reels.store.ReelStore, com.instagram.user.model.User):java.util.ArrayList");
    }

    public static synchronized void A0A(Reel reel, ReelStore reelStore) {
        synchronized (reelStore) {
            UserSession userSession = reelStore.A09;
            Reel A00 = C1Ns.A00(userSession).A00(reel);
            ArrayList arrayList = new ArrayList();
            C1N6 c1n6 = reelStore.A03;
            Map map = c1n6.A00;
            for (Reel reel2 : map.values()) {
                if (reel2.A0W != null && C17060sy.A01.A01(userSession).equals(reel2.A0W.CDj())) {
                    arrayList.add(reel2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                map.remove(((Reel) it.next()).getId());
            }
            c1n6.A02(A00);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r15.equals(r2.CDj()) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void A0D(X.C1N6 r13, com.instagram.reels.store.ReelStore r14, com.instagram.user.model.User r15, java.util.List r16, java.util.List r17) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.store.ReelStore.A0D(X.1N6, com.instagram.reels.store.ReelStore, com.instagram.user.model.User, java.util.List, java.util.List):void");
    }

    public static synchronized void A0E(C1N6 c1n6, ReelStore reelStore, List list) {
        String str;
        synchronized (reelStore) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C105824pt c105824pt = (C105824pt) it.next();
                try {
                    if (c105824pt.A09 != null) {
                        c1n6.A01(reelStore.A00(c105824pt));
                    }
                } catch (RuntimeException e) {
                    C1ZX A01 = C1ZV.A00(reelStore.A09).A01(C05F.A00, C05F.A0U, false);
                    A01.A03("FAILURE_REASON", "maybeAddTrayBroadcastItems: Unable to parse response");
                    if (e.getMessage() != null) {
                        str = e.getMessage();
                    } else {
                        str = "";
                    }
                    A01.A03(DialogModule.KEY_MESSAGE, str);
                    A01.A03("logview_group_by", "FAILURE_REASON");
                    A01.A05(e);
                    A01.A00();
                }
            }
        }
    }

    @Deprecated
    public final synchronized Reel A0N(String str) {
        C1N6 c1n6;
        c1n6 = this.A03;
        C14360o3.A0B(str, 0);
        return (Reel) c1n6.A00.get(str);
    }

    public final synchronized ArrayList A0O() {
        ArrayList arrayList;
        ArrayList A00 = this.A03.A00();
        arrayList = new ArrayList();
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            if (reel.A0g()) {
                arrayList.add(reel);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList A0P() {
        C1N6 c1n6;
        c1n6 = this.A02;
        C1N6 A02 = A02(this, c1n6.A00(), false);
        c1n6.A00.clear();
        c1n6.A03(A02.A00());
        return A06(this, A04(this.A09, c1n6.A00()));
    }

    public final synchronized ArrayList A0Q(String str) {
        ArrayList A04;
        List A0U = A0U(false);
        Map map = this.A0B;
        if (map.containsKey(str) && !((List) map.get(str)).isEmpty()) {
            A0U = (List) map.get(str);
        }
        A04 = A04(this.A09, A0U);
        if (!map.containsKey(str)) {
            A04 = A06(this, A04);
            map.put(str, A04);
        }
        this.A0C.add(str);
        return A04;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    public final synchronized ArrayList A0R(String str, List list) {
        ?? arrayList;
        ArrayList A04;
        Map map = this.A0B;
        if (map.containsKey(str) && !((List) map.get(str)).isEmpty()) {
            arrayList = (List) map.get(str);
        } else {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Reel reel = (Reel) this.A0D.get((String) it.next());
                if (reel != null) {
                    arrayList.add(reel);
                }
            }
        }
        A04 = A04(this.A09, arrayList);
        if (!map.containsKey(str)) {
            A04 = A06(this, A04);
            map.put(str, A04);
        }
        return A04;
    }

    public final synchronized ArrayList A0T(List list) {
        ArrayList A04;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Reel reel = (Reel) this.A0D.get((String) it.next());
                if (reel != null) {
                    arrayList.add(reel);
                }
            }
            C1N6 c1n6 = new C1N6();
            c1n6.A03(this.A03.A00());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Reel reel2 = (Reel) it2.next();
                String id = reel2.getId();
                C14360o3.A0B(id, 0);
                Map map = c1n6.A00;
                Reel reel3 = (Reel) map.get(id);
                if (reel3 != null && reel3.equals(reel2)) {
                    map.remove(reel3.getId());
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            Map map2 = c1n6.A00;
            arrayList2.addAll(map2.values());
            map2.clear();
            Iterator it3 = arrayList2.iterator();
            C14360o3.A07(it3);
            while (it3.hasNext()) {
                Reel reel4 = (Reel) it3.next();
                map2.put(reel4.getId(), reel4);
            }
            A04 = A04(this.A09, A02(this, c1n6.A00(), true).A00());
        } else {
            A04 = A04(this.A09, A0U(true));
        }
        return A04;
    }

    public final synchronized List A0U(boolean z) {
        C1N6 c1n6;
        c1n6 = this.A03;
        C1N6 A02 = A02(this, c1n6.A00(), z);
        Map map = c1n6.A00;
        map.clear();
        c1n6.A03(A02.A00());
        if (map.isEmpty()) {
            C1ZX A01 = C1ZV.A00(this.A09).A01(C05F.A00, C05F.A0U, false);
            A01.A03("FAILURE_REASON", "main feed tray reels is empty");
            A01.A03("logview_group_by", "FAILURE_REASON");
            A01.A00();
        }
        return A07(this, c1n6.A00());
    }

    public final synchronized void A0Y(Reel reel) {
        C1N6 c1n6 = this.A03;
        if (!c1n6.A00.containsKey(reel.getId())) {
            c1n6.A01(reel);
            this.A06 = false;
            A09(reel);
        }
    }

    public final synchronized void A0Z(C37771pE c37771pE, C1OP c1op, User user, List list, List list2, int i, boolean z, boolean z2) {
        A0a(c37771pE, c1op, user, list, list2, Collections.emptyList(), i, z, z2);
    }

    public final void A0b(User user, boolean z) {
        User CDj;
        for (Reel reel : A0U(false)) {
            C1NB c1nb = reel.A0W;
            if (c1nb != null && (CDj = c1nb.CDj()) != null && CDj.equals(user)) {
                reel.A1Y = z;
            }
        }
    }

    public final synchronized void A0c(String str) {
        LruCache lruCache;
        Reel reel = (Reel) this.A0D.remove(str);
        if (reel != null) {
            C1N5 c1n5 = this.A0A;
            if (str != null && (lruCache = c1n5.A00) != null) {
                lruCache.remove(str);
            }
            this.A03.A00.remove(reel.getId());
            UserSession userSession = this.A09;
            AbstractC41111vK.A00(userSession).A00.remove(reel.getId());
            reel.A0R(userSession);
            A09(reel);
        }
    }

    public final synchronized boolean A0d() {
        boolean z;
        z = true;
        if (this.A03.A00.size() != 1) {
            z = false;
        }
        return z;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        synchronized (this) {
            this.A03.A00.clear();
            this.A0D.clear();
            LruCache lruCache = this.A0A.A00;
            if (lruCache != null) {
                lruCache.evictAll();
            }
            this.A06 = false;
            this.A07 = false;
        }
        InterfaceC41501vz interfaceC41501vz = this.A00;
        if (interfaceC41501vz != null) {
            this.A08.A02(interfaceC41501vz, C2Q5.class);
            this.A00 = null;
        }
        C218914p.A07(this);
        C218914p.A0G.remove(this);
        this.A09.A03(ReelStore.class);
    }

    public static Reel A01(C37771pE c37771pE, ReelStore reelStore, List list, boolean z) {
        C37771pE c37771pE2 = AbstractC37741pB.A00;
        C14360o3.A0B(c37771pE, 0);
        String str = c37771pE.A1V;
        if (str == null) {
            str = "";
        }
        Boolean valueOf = Boolean.valueOf(list.contains(str));
        UserSession userSession = reelStore.A09;
        C1NB A01 = AbstractC37741pB.A01(userSession, c37771pE);
        Reel A0M = reelStore.A0M(str);
        if (A0M == null) {
            A0M = new Reel(A01, str, z);
            reelStore.A0D.put(A0M.getId(), A0M);
        }
        A0M.A0T(userSession, c37771pE, valueOf);
        C1Ns.A00(userSession).A01(A0M);
        AbstractC41111vK.A00(userSession).A00(A0M);
        reelStore.A09(A0M);
        return A0M;
    }

    public static ReelStore A03(final UserSession userSession) {
        return (ReelStore) userSession.A01(ReelStore.class, new InterfaceC16820sZ() { // from class: X.1Mv
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                UserSession userSession2 = UserSession.this;
                ReelStore reelStore = new ReelStore(userSession2);
                ReelStore.A0A(new Reel((C1NB) new C1N9(C08730cb.A00(userSession2).A00()), userSession2.userId, true), reelStore);
                return reelStore;
            }
        });
    }

    public static ArrayList A04(UserSession userSession, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            if (!reel.A1a && !reel.A14(userSession) && !reel.A1K) {
                arrayList.add(reel);
            }
        }
        return arrayList;
    }

    public static ArrayList A06(ReelStore reelStore, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            if (reel.A16(reelStore.A09)) {
                arrayList2.add(reel);
            } else {
                arrayList3.add(reel);
            }
        }
        arrayList.addAll(arrayList3);
        arrayList.addAll(arrayList2);
        return new ArrayList(arrayList);
    }

    public static List A07(ReelStore reelStore, List list) {
        UserSession userSession = reelStore.A09;
        UserSession userSession2 = AbstractC25351Lp.A00(userSession).A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession2, 36320279270596859L) || C18U.A06(c06090Tz, userSession2, 36320279270662396L)) {
            ArrayList arrayList = new ArrayList();
            final HashSet hashSet = new HashSet();
            if (reelStore.A05) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Reel reel = (Reel) it.next();
                    if (reel.A0g()) {
                        arrayList.add(reel);
                        hashSet.add(reel.getId());
                    }
                }
                arrayList.addAll((Collection) reelStore.A04.stream().filter(new Predicate() { // from class: X.PUV
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return !hashSet.contains(((Reel) obj).getId());
                    }
                }).collect(Collectors.toList()));
            } else {
                C14360o3.A0B(userSession, 0);
                if (!C18U.A06(c06090Tz, userSession, 36320279270727933L)) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Reel reel2 = (Reel) it2.next();
                        if (!reel2.A0g()) {
                            arrayList.add(reel2);
                        }
                    }
                }
            }
            return arrayList;
        }
        return list;
    }

    private void A09(Reel reel) {
        this.A08.E4s(new C41131vM(reel));
    }

    public static void A0B(Reel reel, ReelStore reelStore, String str) {
        LruCache lruCache;
        C1N5 c1n5 = reelStore.A0A;
        if (str != null && (lruCache = c1n5.A00) != null) {
            lruCache.put(str, reel);
        }
        reelStore.A0D.put(str, reel);
    }

    private void A0C(Reel reel, User user, List list) {
        C38321qM c38321qM;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C50711Ma8 c50711Ma8 = (C50711Ma8) it.next();
            C47Z c47z = c50711Ma8.A00;
            InterfaceC40171tl interfaceC40171tl = c50711Ma8.A01;
            if (interfaceC40171tl != null) {
                c38321qM = (C38321qM) c47z.A45.get(String.valueOf(interfaceC40171tl.C3D()));
            } else {
                c38321qM = c47z.A1C;
            }
            EnumC915447k enumC915447k = c47z.A1f;
            if (c38321qM != null) {
                UserSession userSession = this.A09;
                if (user.equals(c38321qM.A2E(userSession))) {
                    if (!reel.A0h() && !reel.A0b() && c38321qM.A1B() + (AbstractC73343Qk.A00 / 1000) < (System.currentTimeMillis() / 1000) - 172800) {
                        C1ZX A01 = C1ZV.A00(userSession).A01(C05F.A00, C05F.A0U, false);
                        A01.A03("FAILURE_REASON", "ReelStore_sortAndSetPendingMediaForReel");
                        A01.A03(DialogModule.KEY_MESSAGE, "Old story media displayed.");
                        boolean z = false;
                        if (c47z.A1F == EnumC76383bi.A04) {
                            z = true;
                        }
                        A01.A04("is shared to close friends", z);
                        A01.A04("is own story", reel.A1a);
                        A01.A02("time created", c38321qM.A1B() + (AbstractC73343Qk.A00 / 1000));
                        String id = c38321qM.getId();
                        id.getClass();
                        A01.A03("media_id", id);
                        A01.A02("afterConfigureTtlMs", c47z.A0V);
                        A01.A03("logview_group_by", "FAILURE_REASON");
                        A01.A00();
                    } else if (enumC915447k == EnumC915447k.A02 || enumC915447k == EnumC915447k.A04) {
                        reel.A0V(c38321qM);
                        hashMap.put(c47z, c38321qM);
                    }
                }
            }
            arrayList.add(c47z);
        }
        Collections.sort(arrayList, new Comparator() { // from class: X.2Q6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return (((C47Z) obj).A0e > ((C47Z) obj2).A0e ? 1 : (((C47Z) obj).A0e == ((C47Z) obj2).A0e ? 0 : -1));
            }
        });
        synchronized (reel.A1n) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C105814ps((C47Z) it2.next()));
            }
            if (!arrayList2.isEmpty()) {
                long j = ((C105814ps) arrayList2.get(arrayList2.size() - 1)).A00.A0e;
                if (j > reel.A03) {
                    reel.A03 = j;
                }
            }
            reel.A13 = arrayList2;
            reel.A1q = true;
        }
        synchronized (C41661wG.A00(this.A09)) {
        }
    }

    public final Reel A0F(C32061E6n c32061E6n) {
        Reel A0M = A0M(c32061E6n.A02);
        if (A0M == null) {
            return null;
        }
        A0M.A1M = c32061E6n.A03;
        int i = c32061E6n.A01;
        if (i != 0) {
            A0M.A0i = Integer.valueOf(i);
        }
        UserSession userSession = this.A09;
        C1Ns.A00(userSession).A01(A0M);
        AbstractC41111vK.A00(userSession).A00(A0M);
        A09(A0M);
        return A0M;
    }

    public final Reel A0G(C105824pt c105824pt) {
        String str = c105824pt.A0X;
        str.getClass();
        Reel A0K = A0K(new C1N9(c105824pt.A03()), str, false);
        A0K.A0W(c105824pt);
        A09(A0K);
        return A0K;
    }

    public final Reel A0H(C37771pE c37771pE, C1NB c1nb, boolean z) {
        C37771pE c37771pE2 = AbstractC37741pB.A00;
        String str = c37771pE.A1V;
        if (str == null) {
            str = "";
        }
        Reel A0K = A0K(c1nb, str, z);
        UserSession userSession = this.A09;
        A0K.A0T(userSession, c37771pE, false);
        C1Ns.A00(userSession).A01(A0K);
        AbstractC41111vK.A00(userSession).A00(A0K);
        A09(A0K);
        return A0K;
    }

    public final Reel A0I(C37771pE c37771pE, boolean z) {
        C37771pE c37771pE2 = AbstractC37741pB.A00;
        C14360o3.A0B(c37771pE, 0);
        String str = c37771pE.A1V;
        if (str == null) {
            str = "";
        }
        UserSession userSession = this.A09;
        Reel A0K = A0K(AbstractC37741pB.A01(userSession, c37771pE), str, z);
        A0K.A0T(userSession, c37771pE, false);
        C1Ns.A00(userSession).A01(A0K);
        AbstractC41111vK.A00(userSession).A00(A0K);
        A09(A0K);
        return A0K;
    }

    public final Reel A0L(String str) {
        C1NB c1nb;
        C105824pt c105824pt;
        Reel reel = null;
        for (Reel reel2 : this.A0D.values()) {
            C105824pt c105824pt2 = reel2.A0H;
            if (c105824pt2 != null && (c1nb = reel2.A0W) != null && c1nb.CBs() == C05F.A01 && c1nb.getId().equals(str)) {
                EnumC109104va enumC109104va = c105824pt2.A06;
                if (enumC109104va == null) {
                    enumC109104va = EnumC109104va.A0E;
                }
                if (!enumC109104va.A00() && (reel == null || ((c105824pt = reel.A0H) != null && c105824pt.A01() < c105824pt2.A01()))) {
                    reel = reel2;
                }
            }
        }
        return reel;
    }

    public final Reel A0M(String str) {
        return (Reel) this.A0D.get(str);
    }

    public final ArrayList A0S(Collection collection) {
        String str;
        Reel A0I;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C37771pE c37771pE = (C37771pE) it.next();
            if (c37771pE != null) {
                UserSession userSession = this.A09;
                C37771pE c37771pE2 = AbstractC37741pB.A00;
                C14360o3.A0B(userSession, 1);
                ReelType reelType = c37771pE.A0N;
                if (reelType == ReelType.A04) {
                    if (!AbstractC37741pB.A08(userSession, c37771pE)) {
                        str = AbstractC37741pB.A03(userSession, c37771pE);
                    } else {
                        A0I = A0I(c37771pE, false);
                        if (A0I.A0O(userSession).size() <= 0 || A0I.A13(userSession)) {
                            arrayList.add(A0I);
                        }
                    }
                } else {
                    if (reelType == ReelType.A0W && AbstractC37741pB.A02(c37771pE) != null) {
                        A0I = A0I(c37771pE, false);
                        if (A0I.A0O(userSession).size() <= 0) {
                        }
                        arrayList.add(A0I);
                    }
                    str = AbstractC37741pB.A03(userSession, c37771pE);
                }
            } else {
                str = "NULL";
            }
            C0w9.A03("invalid_ad_or_netego_reel_response_item", str);
        }
        Collections.sort(arrayList, new Comparator() { // from class: X.5cp
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return (((Reel) obj).A04 > ((Reel) obj2).A04 ? 1 : (((Reel) obj).A04 == ((Reel) obj2).A04 ? 0 : -1));
            }
        });
        return arrayList;
    }

    public final void A0V() {
        InterfaceC41501vz interfaceC41501vz = this.A00;
        if (interfaceC41501vz != null) {
            this.A08.A02(interfaceC41501vz, C2Q5.class);
            this.A00 = null;
        }
        InterfaceC41501vz interfaceC41501vz2 = new InterfaceC41501vz() { // from class: X.2Q4
            @Override // X.InterfaceC41501vz
            public final void onEvent(Object obj) {
                ReelStore reelStore = ReelStore.this;
                UserSession userSession = reelStore.A09;
                Iterator it = ReelStore.A05(reelStore, C17060sy.A01.A01(userSession)).iterator();
                while (it.hasNext()) {
                    ((Reel) it.next()).A0R(userSession);
                }
            }
        };
        this.A00 = interfaceC41501vz2;
        this.A08.A01(interfaceC41501vz2, C2Q5.class);
        A05(this, C17060sy.A01.A01(this.A09));
    }

    public final void A0W() {
        Set A0Q;
        Set A0Q2;
        UserSession userSession = this.A09;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36310624183255254L)) {
            HashMap hashMap = new HashMap();
            C1N6 c1n6 = this.A03;
            Iterator it = c1n6.A00().iterator();
            while (it.hasNext()) {
                Reel reel = (Reel) it.next();
                if (reel.A1A(userSession) && (A0Q2 = reel.A0Q()) != null && !A0Q2.isEmpty()) {
                    hashMap.put(reel.getId(), A0Q2);
                }
            }
            for (Map.Entry entry : this.A0D.entrySet()) {
                if (((Reel) entry.getValue()).A1A(userSession) && (A0Q = ((Reel) entry.getValue()).A0Q()) != null && !A0Q.isEmpty()) {
                    hashMap.put(entry.getKey(), A0Q);
                }
            }
            hashMap.size();
            C82103lW.A02.A01(userSession, hashMap);
            if (C18U.A06(c06090Tz, userSession, 36310624183451863L)) {
                C207479Ga A00 = C9GZ.A00(userSession);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = c1n6.A00.values().iterator();
                while (it2.hasNext()) {
                    User A0D = ((Reel) it2.next()).A0D();
                    if (A0D != null) {
                        arrayList.add(A0D);
                    }
                }
                if (Systrace.A0E(1L)) {
                    C0fO.A01("ReelTrayPogUserCache.writeUsers", -1835451713);
                }
                try {
                    C14360o3.A07(String.format("ReelTrayPogUserCache.writeUsers, size: %d", Arrays.copyOf(new Object[]{Integer.valueOf(arrayList.size())}, 1)));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        User user = (User) it3.next();
                        String id = user.getId();
                        byte[] bytes = AbstractC38851rI.A07(user).getBytes(C15W.A05);
                        C14360o3.A07(bytes);
                        A00.A00.write(id, bytes);
                    }
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(307587534);
                    }
                } catch (Throwable th) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-1029460312);
                    }
                    throw th;
                }
            }
        }
    }

    public final synchronized void A0a(C37771pE c37771pE, final C1OP c1op, User user, List list, List list2, List list3, final int i, final boolean z, boolean z2) {
        Reel reel;
        Runnable runnable;
        UserSession userSession = this.A09;
        C25371Lr A00 = AbstractC25351Lp.A00(userSession);
        this.A07 = z2;
        if (c1op != null && c1op.A04 == C05F.A1F) {
            this.A06 = false;
            C1N6 c1n6 = this.A02;
            Map map = c1n6.A00;
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((Reel) it.next()).A1V = false;
            }
            map.clear();
            A0D(c1n6, this, user, list, Collections.emptyList());
            if (C11T.A08()) {
                A08(userSession, c1op, c1n6.A00(), i, z);
            } else {
                runnable = new Runnable() { // from class: X.GQd
                    @Override // java.lang.Runnable
                    public final void run() {
                        ReelStore reelStore = this;
                        C1OP c1op2 = c1op;
                        boolean z3 = z;
                        ReelStore.A08(reelStore.A09, c1op2, reelStore.A02.A00(), i, z3);
                    }
                };
                C11T.A07(false, runnable);
            }
        } else {
            C1N6 c1n62 = this.A03;
            ArrayList A002 = c1n62.A00();
            UserSession userSession2 = A00.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession2, 36317212662830011L) || i != 2) {
                this.A06 = false;
                Map map2 = c1n62.A00;
                Iterator it2 = map2.values().iterator();
                while (it2.hasNext()) {
                    ((Reel) it2.next()).A1V = false;
                }
                map2.clear();
            }
            if (!C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 36317491838784755L)) {
                A0E(c1n62, this, list2);
            }
            A0D(c1n62, this, user, list, list3);
            if (C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 36317491840750858L) && !z) {
                C3NO c3no = new C3NO(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                List AiP = c3no.AiP();
                String Aib = c3no.Aib();
                C3W0 Anv = c3no.Anv();
                String AvB = c3no.AvB();
                Boolean BCE = c3no.BCE();
                IGUserHighlightsTrayType BEC = c3no.BEC();
                Boolean Cdu = c3no.Cdu();
                Integer BPH = c3no.BPH();
                Integer BPI = c3no.BPI();
                Boolean BW1 = c3no.BW1();
                Integer BX1 = c3no.BX1();
                C3NM Bch = c3no.Bch();
                Integer Bm7 = c3no.Bm7();
                List BmL = c3no.BmL();
                List Bp5 = c3no.Bp5();
                C3NO F5T = AbstractC73313Qh.A00(Anv, BEC, c3no.BuL(), Bch, c3no.Bsz(), c3no, BCE, Cdu, BW1, c3no.C14(), BPH, BPI, BX1, Bm7, Aib, AvB, c3no.C25(), AiP, BmL, Bp5, list.subList(0, Math.min(list.size(), (int) C18U.A01(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 36598966817525084L)))).F5T(C1DS.A00(userSession));
                if (i == -1 || i == 1) {
                    C108324uJ A003 = AbstractC108314uI.A00(userSession);
                    if (Systrace.A0E(1L)) {
                        C0fO.A01("ReelTrayPerPogCache.writeTrayPogs", 1148450415);
                    }
                    try {
                        List<C37771pE> list4 = F5T.A0J;
                        if (list4 != null) {
                            list4.size();
                        }
                        System.currentTimeMillis();
                        Stash stash = A003.A00;
                        if (Systrace.A0E(1L)) {
                            C0fO.A01("ReelTrayPerPogCache.serializeToBytes", -1419169189);
                        }
                        byte[] bArr = null;
                        try {
                            try {
                                StringWriter stringWriter = new StringWriter();
                                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                                A0A.A0d();
                                List<C37941pb> list5 = F5T.A0G;
                                if (list5 != null) {
                                    C16V.A03(A0A, "broadcasts");
                                    for (C37941pb c37941pb : list5) {
                                        if (c37941pb != null) {
                                            AbstractC108524ud.A00(A0A, c37941pb);
                                        }
                                    }
                                    A0A.A0Z();
                                }
                                String str = F5T.A0D;
                                if (str != null) {
                                    A0A.A0S("btp_timestamps", str);
                                }
                                C74433Vz c74433Vz = F5T.A00;
                                if (c74433Vz != null) {
                                    A0A.A0r("client_hints");
                                    A0A.A0d();
                                    List<ExtendedImageUrl> list6 = c74433Vz.A01;
                                    if (list6 != null) {
                                        C16V.A03(A0A, "image_hints");
                                        for (ExtendedImageUrl extendedImageUrl : list6) {
                                            if (extendedImageUrl != null) {
                                                C17Y.A00(A0A, extendedImageUrl);
                                            }
                                        }
                                        A0A.A0Z();
                                    }
                                    List<InterfaceC74423Vy> list7 = c74433Vz.A02;
                                    if (list7 != null) {
                                        C16V.A03(A0A, "media");
                                        for (InterfaceC74423Vy interfaceC74423Vy : list7) {
                                            if (interfaceC74423Vy != null) {
                                                C74413Vx EwI = interfaceC74423Vy.EwI(new C37761pD(null));
                                                A0A.A0d();
                                                List<InterfaceC74403Vw> list8 = EwI.A00;
                                                if (list8 != null) {
                                                    C16V.A03(A0A, "resources");
                                                    for (InterfaceC74403Vw interfaceC74403Vw : list8) {
                                                        if (interfaceC74403Vw != null) {
                                                            C74393Vv EwV = interfaceC74403Vw.EwV(new C37761pD(null));
                                                            A0A.A0d();
                                                            ExtendedImageUrl extendedImageUrl2 = EwV.A01;
                                                            if (extendedImageUrl2 != null) {
                                                                A0A.A0r("image");
                                                                C17Y.A00(A0A, extendedImageUrl2);
                                                            }
                                                            C38321qM c38321qM = EwV.A00;
                                                            if (c38321qM != null) {
                                                                A0A.A0r(MediaStreamTrack.VIDEO_TRACK_KIND);
                                                                AtomicBoolean atomicBoolean = C38321qM.A0i;
                                                                C38801rC.A07(A0A, c38321qM);
                                                            }
                                                            A0A.A0a();
                                                        }
                                                    }
                                                    A0A.A0Z();
                                                }
                                                A0A.A0a();
                                            }
                                        }
                                        A0A.A0Z();
                                    }
                                    Integer num = c74433Vz.A00;
                                    if (num != null) {
                                        A0A.A0Q("version", num.intValue());
                                    }
                                    List<C38321qM> list9 = c74433Vz.A03;
                                    if (list9 != null) {
                                        C16V.A03(A0A, "video_hints");
                                        for (C38321qM c38321qM2 : list9) {
                                            if (c38321qM2 != null) {
                                                AtomicBoolean atomicBoolean2 = C38321qM.A0i;
                                                C38801rC.A07(A0A, c38321qM2);
                                            }
                                        }
                                        A0A.A0Z();
                                    }
                                    A0A.A0a();
                                }
                                String str2 = F5T.A0E;
                                if (str2 != null) {
                                    A0A.A0S("cursor", str2);
                                }
                                Boolean bool = F5T.A05;
                                if (bool != null) {
                                    A0A.A0T("has_new_nux_story", bool.booleanValue());
                                }
                                IGUserHighlightsTrayType iGUserHighlightsTrayType = F5T.A01;
                                if (iGUserHighlightsTrayType != null) {
                                    A0A.A0S("highlights_tray_type", iGUserHighlightsTrayType.A00);
                                }
                                Boolean bool2 = F5T.A06;
                                if (bool2 != null) {
                                    A0A.A0T("is_streaming_last_chunk", bool2.booleanValue());
                                }
                                Integer num2 = F5T.A09;
                                if (num2 != null) {
                                    A0A.A0Q("lookahead_count_tray", num2.intValue());
                                }
                                Integer num3 = F5T.A0A;
                                if (num3 != null) {
                                    A0A.A0Q("lookahead_count_viewer", num3.intValue());
                                }
                                Boolean bool3 = F5T.A07;
                                if (bool3 != null) {
                                    A0A.A0T("my_week_enabled", bool3.booleanValue());
                                }
                                Integer num4 = F5T.A0B;
                                if (num4 != null) {
                                    A0A.A0Q("next_page_size", num4.intValue());
                                }
                                C3NK c3nk = F5T.A03;
                                if (c3nk != null) {
                                    A0A.A0r("personalization_features");
                                    A0A.A0d();
                                    Float f = c3nk.A03;
                                    if (f != null) {
                                        A0A.A0P("avg_core_sessions_per_day", f.floatValue());
                                    }
                                    Integer num5 = c3nk.A04;
                                    if (num5 != null) {
                                        A0A.A0Q("follow_count", num5.intValue());
                                    }
                                    Boolean bool4 = c3nk.A00;
                                    if (bool4 != null) {
                                        A0A.A0T("is_high_me_user", bool4.booleanValue());
                                    }
                                    Boolean bool5 = c3nk.A01;
                                    if (bool5 != null) {
                                        A0A.A0T("is_high_usage_likelihood", bool5.booleanValue());
                                    }
                                    Boolean bool6 = c3nk.A02;
                                    if (bool6 != null) {
                                        A0A.A0T("is_teen", bool6.booleanValue());
                                    }
                                    Integer num6 = c3nk.A05;
                                    if (num6 != null) {
                                        A0A.A0Q("lness28_score", num6.intValue());
                                    }
                                    Integer num7 = c3nk.A06;
                                    if (num7 != null) {
                                        A0A.A0Q("stories_imp_bucket", num7.intValue());
                                    }
                                    Integer num8 = c3nk.A07;
                                    if (num8 != null) {
                                        A0A.A0Q("viewer_swipe_preload_count", num8.intValue());
                                    }
                                    Integer num9 = c3nk.A08;
                                    if (num9 != null) {
                                        A0A.A0Q("viewer_tap_preload_count", num9.intValue());
                                    }
                                    Integer num10 = c3nk.A09;
                                    if (num10 != null) {
                                        A0A.A0Q("warm_start_refresh_timer_in_seconds", num10.intValue());
                                    }
                                    A0A.A0a();
                                }
                                Integer num11 = F5T.A0C;
                                if (num11 != null) {
                                    A0A.A0Q("refresh_window_ms", num11.intValue());
                                }
                                List<String> list10 = F5T.A0H;
                                if (list10 != null) {
                                    C16V.A03(A0A, "remaining_reel_ids_to_fetch");
                                    for (String str3 : list10) {
                                        if (str3 != null) {
                                            A0A.A0u(str3);
                                        }
                                    }
                                    A0A.A0Z();
                                }
                                List<String> list11 = F5T.A0I;
                                if (list11 != null) {
                                    C16V.A03(A0A, "reusable_reel_ids");
                                    for (String str4 : list11) {
                                        if (str4 != null) {
                                            A0A.A0u(str4);
                                        }
                                    }
                                    A0A.A0Z();
                                }
                                C37771pE c37771pE2 = F5T.A04;
                                if (c37771pE2 != null) {
                                    A0A.A0r("self_pog_extra_data");
                                    AbstractC38741r6.A00(A0A, c37771pE2);
                                }
                                C114855Gv c114855Gv = F5T.A02;
                                if (c114855Gv != null) {
                                    A0A.A0r("share_to_friends_story_pending_media");
                                    A0A.A0d();
                                    PendingShareToFriendsStoryBadgePreviewState pendingShareToFriendsStoryBadgePreviewState = c114855Gv.A00;
                                    if (pendingShareToFriendsStoryBadgePreviewState != null) {
                                        A0A.A0S("badge_preview_state", pendingShareToFriendsStoryBadgePreviewState.A00);
                                    }
                                    String str5 = c114855Gv.A01;
                                    if (str5 != null) {
                                        A0A.A0S("cursor", str5);
                                    }
                                    List<C38321qM> list12 = c114855Gv.A02;
                                    if (list12 != null) {
                                        C16V.A03(A0A, "media_items");
                                        for (C38321qM c38321qM3 : list12) {
                                            if (c38321qM3 != null) {
                                                AtomicBoolean atomicBoolean3 = C38321qM.A0i;
                                                C38801rC.A07(A0A, c38321qM3);
                                            }
                                        }
                                        A0A.A0Z();
                                    }
                                    A0A.A0a();
                                }
                                Boolean bool7 = F5T.A08;
                                if (bool7 != null) {
                                    A0A.A0T("stories_viewer_gestures_nux_eligible", bool7.booleanValue());
                                }
                                String str6 = F5T.A0F;
                                if (str6 != null) {
                                    A0A.A0S("story_ranking_token", str6);
                                }
                                if (list4 != null) {
                                    C16V.A03(A0A, "tray");
                                    for (C37771pE c37771pE3 : list4) {
                                        if (c37771pE3 != null) {
                                            AbstractC38741r6.A00(A0A, c37771pE3);
                                        }
                                    }
                                    A0A.A0Z();
                                }
                                A0A.A0a();
                                A0A.close();
                                String obj = stringWriter.toString();
                                if (obj != null) {
                                    bArr = obj.getBytes(C15W.A05);
                                    C14360o3.A07(bArr);
                                }
                            } catch (IOException unused) {
                            }
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(2026395145);
                            }
                            stash.write("reel_tray_pogs", bArr);
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(2130196195);
                            }
                        } catch (Throwable th) {
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(1987961784);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(-1339813243);
                        }
                        throw th2;
                    }
                }
            }
            A002.clear();
            A05(this, user);
            Reel A0M = A0M(user.getId());
            if (A0M == null || A0M.A15(userSession)) {
                A0M = new Reel((C1NB) new C1N9(user), user.getId(), true);
                this.A0D.put(A0M.getId(), A0M);
            }
            A0A(A0M, this);
            final List A07 = A07(this, c1n62.A00());
            if (c37771pE != null) {
                reel = A0I(c37771pE, user.equals(c37771pE.A0a));
            } else {
                reel = null;
            }
            this.A01 = reel;
            if (C11T.A08()) {
                A08(userSession, c1op, A07, i, z);
            } else {
                runnable = new Runnable() { // from class: X.GQp
                    @Override // java.lang.Runnable
                    public final void run() {
                        ReelStore reelStore = this;
                        C1OP c1op2 = c1op;
                        List list13 = A07;
                        boolean z3 = z;
                        ReelStore.A08(reelStore.A09, c1op2, list13, i, z3);
                    }
                };
                C11T.A07(false, runnable);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.1N5] */
    public ReelStore(UserSession userSession) {
        this.A09 = userSession;
        this.A08 = AbstractC25651Mw.A00(userSession);
        ?? obj = new Object();
        obj.A00 = new LruCache(200);
        this.A0A = obj;
        this.A03 = new C1N6();
        this.A02 = new C1N6();
        C218914p.A08.A0B(this);
        C218914p.A0G.add(this);
        UserSession userSession2 = AbstractC25351Lp.A00(userSession).A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        int A01 = (int) C18U.A01(c06090Tz, userSession2, 36598966815690070L);
        boolean A06 = C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 36317491838915829L);
        C18B c18b = new C18B();
        c18b.A03(A01);
        if (!A06) {
            c18b.A01();
        }
        this.A0D = c18b.A00();
    }

    private Reel A00(C105824pt c105824pt) {
        c105824pt.A03();
        C1N9 c1n9 = new C1N9(c105824pt.A03());
        String str = c105824pt.A0X;
        str.getClass();
        Reel A0M = A0M(str);
        if (A0M == null) {
            A0M = new Reel((C1NB) c1n9, str, false);
            this.A0D.put(A0M.getId(), A0M);
        }
        A0M.A0W(c105824pt);
        A09(A0M);
        return A0M;
    }

    public static void A08(UserSession userSession, C1OP c1op, List list, int i, boolean z) {
        C11T.A00();
        AbstractC25651Mw.A00(userSession).A05(new C3DH(c1op, list, i, z));
    }

    public final Reel A0J(C1NB c1nb, String str, List list, boolean z) {
        Reel A0K = A0K(c1nb, str, z);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0K.A0V((C38321qM) it.next());
        }
        A0B(A0K, this, str);
        return A0K;
    }

    public final Reel A0K(C1NB c1nb, String str, boolean z) {
        Reel A0M = A0M(str);
        if (A0M == null) {
            Reel reel = new Reel(c1nb, str, z);
            A0B(reel, this, reel.getId());
            return reel;
        }
        return A0M;
    }

    public final void A0X(Reel reel) {
        A0B(reel, this, reel.getId());
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(521813399);
        if (!C18U.A06(C06090Tz.A05, AbstractC25351Lp.A00(this.A09).A00, 36317491839571196L)) {
            A0W();
        }
        C0f9.A0A(-1994120064, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(2080971768, C0f9.A03(328942721));
    }
}
