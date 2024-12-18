package X;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.systrace.Systrace;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.3lQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82043lQ {
    public String A00;
    public boolean A01;
    public final UserSession A02;
    public final AbstractC82033lP A03;
    public final java.util.Set A04;
    public final InterfaceC09390do A05;
    public final C3G5 A06;
    public final Map A07;

    public C82043lQ(UserSession userSession, C3G5 c3g5, AbstractC82033lP abstractC82033lP, String str, Map map, java.util.Set set) {
        boolean containsKey;
        C14360o3.A0B(userSession, 4);
        C14360o3.A0B(str, 5);
        C14360o3.A0B(c3g5, 6);
        this.A04 = set;
        this.A03 = abstractC82033lP;
        this.A07 = map;
        this.A02 = userSession;
        this.A06 = c3g5;
        this.A05 = AbstractC09440dt.A01(C82063lS.A00);
        if (Systrace.A0E(1L)) {
            C0fO.A01("ReelLoader.init", 414337165);
        }
        if (map == null) {
            containsKey = false;
        } else {
            try {
                containsKey = map.containsKey("force_load_from_network");
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-1804172878);
                }
                throw th;
            }
        }
        this.A01 = containsKey;
        if (map != null && map.containsKey("obfuscate_request")) {
            java.util.Set entrySet = map.entrySet();
            BA1 ba1 = BA1.A00;
            C14360o3.A0B(entrySet, 0);
            C14360o3.A0B(ba1, 1);
            AnonymousClass016.A19(entrySet, ba1, false);
            this.A00 = "unknown";
        } else {
            this.A00 = str;
        }
        if (Systrace.A0E(1L)) {
            C0fO.A00(-1113043302);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C85773s6 A00(X.C1ET r16, X.C82043lQ r17, final java.util.Set r18) {
        /*
            r5 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L10
            r1 = 1751143465(0x68605429, float:4.2374503E24)
            java.lang.String r0 = "ReelLoader.createNetworkTask"
            X.C0fO.A01(r0, r1)
        L10:
            r4 = r17
            com.instagram.common.session.UserSession r8 = r4.A02     // Catch: java.lang.Throwable -> L9b
            X.0Tz r2 = X.C06090Tz.A05     // Catch: java.lang.Throwable -> L9b
            r0 = 36313716559448283(0x810322000008db, double:3.028278803570401E-306)
            boolean r0 = X.C18U.A06(r2, r8, r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r3 = "source"
            r12 = r18
            if (r0 == 0) goto L5a
            java.lang.String r10 = r4.A00     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L93
            java.lang.String r0 = "push_notification"
            r1 = 0
            boolean r0 = X.AbstractC001900j.A0a(r10, r0, r1)     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L5a
            java.lang.String r0 = "activity_feed"
            boolean r0 = X.AbstractC001900j.A0a(r10, r0, r1)     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L5a
            java.util.Map r11 = r4.A07     // Catch: java.lang.Throwable -> L9b
            X.3G5 r9 = r4.A06     // Catch: java.lang.Throwable -> L9b
            boolean r13 = r4.A05()     // Catch: java.lang.Throwable -> L9b
            r7 = r16
            X.1Hw r2 = X.C5N9.A00(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L9b
            X.3s6 r3 = new X.3s6     // Catch: java.lang.Throwable -> L9b
            r3.<init>(r9, r10, r12)     // Catch: java.lang.Throwable -> L9b
            r3.A01 = r2     // Catch: java.lang.Throwable -> L9b
            X.3lP r1 = r4.A03     // Catch: java.lang.Throwable -> L9b
            X.53X r0 = new X.53X     // Catch: java.lang.Throwable -> L9b
            r0.<init>(r8, r3, r1, r12)     // Catch: java.lang.Throwable -> L9b
            r2.A02(r0)     // Catch: java.lang.Throwable -> L9b
            goto L86
        L5a:
            java.util.Map r2 = r4.A07     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = r4.A00     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L93
            X.3G5 r14 = r4.A06     // Catch: java.lang.Throwable -> L9b
            boolean r0 = r4.A05()     // Catch: java.lang.Throwable -> L9b
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L9b
            r13 = r8
            r17 = r2
            r16 = r1
            X.3s6 r3 = X.C25401Lu.A07(r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L9b
            X.1ON r2 = r3.A00     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto L86
            X.3lP r1 = r4.A03     // Catch: java.lang.Throwable -> L9b
            boolean r0 = r4.A01     // Catch: java.lang.Throwable -> L9b
            X.HGU r7 = new X.HGU     // Catch: java.lang.Throwable -> L9b
            r9 = r3
            r10 = r1
            r11 = r12
            r12 = r0
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L9b
            r2.A00 = r7     // Catch: java.lang.Throwable -> L9b
        L86:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L92
            r0 = 830997514(0x3188040a, float:3.95858E-9)
            X.C0fO.A00(r0)
        L92:
            return r3
        L93:
            X.C14360o3.A0F(r3)     // Catch: java.lang.Throwable -> L9b
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.Throwable -> L9b
            throw r0     // Catch: java.lang.Throwable -> L9b
        L9b:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto La8
            r0 = -1076197417(0xffffffffbfda87d7, float:-1.7072705)
            X.C0fO.A00(r0)
        La8:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82043lQ.A00(X.1ET, X.3lQ, java.util.Set):X.3s6");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7.A02, 36317491838522608L) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Set A01() {
        /*
            r7 = this;
            java.lang.String r5 = r7.A00
            java.lang.String r0 = "source"
            if (r5 != 0) goto Le
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            java.lang.String r0 = "push_notification"
            r4 = 0
            boolean r0 = X.AbstractC001900j.A0a(r5, r0, r4)
            if (r0 == 0) goto L26
            com.instagram.common.session.UserSession r3 = r7.A02
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317491838522608(0x810691002b14f0, double:3.0306663052588326E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L78
        L26:
            java.lang.String r0 = "activity_feed"
            boolean r0 = X.AbstractC001900j.A0a(r5, r0, r4)
            if (r0 != 0) goto L78
            boolean r0 = r7.A01
            if (r0 != 0) goto L78
            X.1KH r0 = X.AbstractC25061Kk.A00()
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L78
            X.1KH r0 = X.AbstractC25061Kk.A00()
            boolean r0 = r0.A0D()
            if (r0 != 0) goto L78
            com.instagram.common.session.UserSession r6 = r7.A02
            com.instagram.reels.store.ReelStore r5 = com.instagram.reels.store.ReelStore.A03(r6)
            X.C14360o3.A07(r5)
            java.util.Set r0 = r7.A04
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L5a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r2 = r3.next()
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
            com.instagram.model.reels.Reel r0 = r5.A0M(r0)
            r1 = 1
            if (r0 == 0) goto L5a
            boolean r0 = r0.A19(r6)
            if (r0 != r1) goto L5a
            r4.add(r2)
            goto L5a
        L78:
            X.0sj r4 = X.C16910sj.A00
        L7a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82043lQ.A01():java.util.Set");
    }

    public static final void A02(Context context, AbstractC018607g abstractC018607g, C85773s6 c85773s6) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("ReelLoader.scheduleTaskOnLoader", 1940462510);
        }
        try {
            C11R c11r = c85773s6.A00;
            if (c11r != null || (c11r = c85773s6.A01) != null) {
                C1GJ.A00(context, abstractC018607g, c11r);
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-165201866);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(717614229);
            }
            throw th;
        }
    }

    private final void A03(C1ET c1et, AbstractC82093lV abstractC82093lV) {
        int i;
        if (Systrace.A0E(1L)) {
            C0fO.A01("ReelLoader.loadReelsFromDiskAndGetFetchRemainingNetworkTask", -1464700537);
        }
        try {
            try {
            } catch (IOException e) {
                C0K8.A0G(FEG.A00, "Failed to create a reels media network task", e);
            }
            if (A01().isEmpty()) {
                java.util.Set set = this.A04;
                if (!set.isEmpty()) {
                    abstractC82093lV.A00(A00(c1et, this, set));
                }
                if (Systrace.A0E(1L)) {
                    i = 2074023543;
                    C0fO.A00(i);
                }
                return;
            }
            C82113lX c82113lX = C82103lW.A02;
            final UserSession userSession = this.A02;
            final java.util.Set A01 = A01();
            final C82133lZ c82133lZ = new C82133lZ(c1et, abstractC82093lV, this);
            C82103lW.A01.ATO(new AbstractRunnableC14200nk() { // from class: X.3la
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(331, 3, false, false);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v0, types: [java.util.AbstractMap, java.util.HashMap] */
                /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Map] */
                /* JADX WARN: Type inference failed for: r6v2, types: [X.0sk] */
                @Override // java.lang.Runnable
                public final void run() {
                    final ?? hashMap;
                    C82113lX c82113lX2 = C82103lW.A02;
                    C82103lW A00 = C82113lX.A00(UserSession.this);
                    java.util.Set set2 = A01;
                    set2.size();
                    C96494Vi c96494Vi = A00.A00;
                    HashSet hashSet = new HashSet(set2);
                    Map map = c96494Vi.A07;
                    hashSet.retainAll(map.keySet());
                    if (hashSet.isEmpty()) {
                        hashMap = AbstractC06930Yk.A0E();
                    } else {
                        hashMap = new HashMap();
                        try {
                            C96534Vo c96534Vo = c96494Vi.A05;
                            long max = Math.max(c96494Vi.A03, System.currentTimeMillis() - c96494Vi.A02);
                            StringBuilder sb = new StringBuilder();
                            sb.append("\n");
                            sb.append("    SELECT *");
                            sb.append("\n");
                            sb.append("    FROM user_reel_medias");
                            sb.append("\n");
                            sb.append("    WHERE id in (");
                            int size = set2.size();
                            AbstractC73723Sa.A00(sb, size);
                            sb.append(")");
                            sb.append("\n");
                            sb.append("      AND stored_time > ");
                            sb.append("?");
                            String obj = sb.toString();
                            int i2 = size + 1;
                            TreeMap treeMap = C37581ov.A08;
                            C37581ov A002 = AbstractC37591ow.A00(obj, i2);
                            Iterator it = set2.iterator();
                            int i3 = 1;
                            while (it.hasNext()) {
                                A002.ADp(i3, (String) it.next());
                                i3++;
                            }
                            A002.ADi(i2, max);
                            C1YP c1yp = c96534Vo.A01;
                            c1yp.assertNotSuspendingTransaction();
                            Cursor query = c1yp.query(A002, (CancellationSignal) null);
                            try {
                                int A012 = AbstractC37601ox.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                int A013 = AbstractC37601ox.A01(query, "media_ids");
                                int A014 = AbstractC37601ox.A01(query, "data");
                                int A015 = AbstractC37601ox.A01(query, "stored_time");
                                ArrayList arrayList = new ArrayList(query.getCount());
                                while (query.moveToNext()) {
                                    arrayList.add(new C97084Xt(query.getString(A012), query.getString(A013), query.getBlob(A014), query.getLong(A015)));
                                }
                                query.close();
                                A002.A00();
                                arrayList.size();
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    C97084Xt c97084Xt = (C97084Xt) it2.next();
                                    String str = c97084Xt.A01;
                                    byte[] bArr = c97084Xt.A03;
                                    C96504Vj c96504Vj = c96494Vi.A04;
                                    C14360o3.A0B(bArr, 0);
                                    List list = AbstractC97094Xu.parseFromJson(C07950bF.A04.A02(c96504Vj.A00, bArr)).A00;
                                    list.size();
                                    hashMap.put(str, list);
                                }
                                Iterator it3 = hashSet.iterator();
                                while (it3.hasNext()) {
                                    Object next = it3.next();
                                    if (!hashMap.containsKey(next)) {
                                        map.remove(next);
                                    }
                                }
                            } catch (Throwable th) {
                                query.close();
                                A002.A00();
                                throw th;
                            }
                        } catch (Exception e2) {
                            C0K8.A0F("UserReelMediasRoom", "Failed to load user reel blob", e2);
                            C0w9.A03("UserReelMediasRoom", AnonymousClass001.A0R("Failed to load user reel blob: ", e2.getMessage()));
                        }
                    }
                    C82133lZ c82133lZ2 = c82133lZ;
                    final C82043lQ c82043lQ = c82133lZ2.A02;
                    Handler handler = (Handler) c82043lQ.A05.getValue();
                    final AbstractC82093lV abstractC82093lV2 = c82133lZ2.A01;
                    final C1ET c1et2 = c82133lZ2.A00;
                    handler.post(new Runnable() { // from class: X.4Xw
                        @Override // java.lang.Runnable
                        public final void run() {
                            C82043lQ c82043lQ2 = c82043lQ;
                            Map map2 = hashMap;
                            if (Systrace.A0E(1L)) {
                                C0fO.A01("ReelLoader.loadStoredMedias", -449916886);
                            }
                            try {
                                HashMap hashMap2 = new HashMap();
                                for (Map.Entry entry : map2.entrySet()) {
                                    String str2 = (String) entry.getKey();
                                    List list2 = (List) entry.getValue();
                                    UserSession userSession2 = c82043lQ2.A02;
                                    Reel A0M = ReelStore.A03(userSession2).A0M(str2);
                                    if (A0M != null) {
                                        if (!list2.isEmpty()) {
                                            synchronized (A0M.A1n) {
                                                if (A0M.A19.isEmpty()) {
                                                    A0M.A0X(list2);
                                                    ArrayList arrayList2 = A0M.A0t;
                                                    if (arrayList2 != null) {
                                                        Reel.A01(A0M, new HashSet(arrayList2));
                                                    }
                                                    A0M.A1N = true;
                                                }
                                            }
                                        }
                                        if (A0M.A0z(userSession2)) {
                                            hashMap2.put(str2, A0M);
                                        }
                                    }
                                }
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(741090116);
                                }
                                if (!hashMap2.isEmpty()) {
                                    c82043lQ2.A03.A02(hashMap2);
                                }
                                HashSet hashSet2 = new HashSet(c82043lQ2.A04);
                                hashSet2.removeAll(hashMap2.keySet());
                                try {
                                    if (!hashSet2.isEmpty()) {
                                        abstractC82093lV2.A00(C82043lQ.A00(c1et2, c82043lQ2, hashSet2));
                                    }
                                } catch (IOException e3) {
                                    C0K8.A0G(FEG.A00, "Failed to create a reels media network task", e3);
                                }
                            } catch (Throwable th2) {
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(1902026462);
                                }
                                throw th2;
                            }
                        }
                    });
                }
            });
            if (Systrace.A0E(1L)) {
                i = -2101233973;
                C0fO.A00(i);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(310061446);
            }
            throw th;
        }
    }

    public static final void A04(C85773s6 c85773s6, C82043lQ c82043lQ) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("ReelLoader.scheduleTaskOnPool", 975475790);
        }
        try {
            C11R c11r = c85773s6.A00;
            if (c11r != null || (c11r = c85773s6.A01) != null) {
                if (C18U.A06(C06090Tz.A05, AbstractC25351Lp.A00(c82043lQ.A02).A00, 36317491839177976L)) {
                    C1GJ.A06(c11r, 307591348, 1, true, true);
                } else {
                    C1GJ.A03(c11r);
                }
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-581855022);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(2089354200);
            }
            throw th;
        }
    }

    private final boolean A05() {
        switch (this.A06.ordinal()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
                String A04 = C18U.A04(C06090Tz.A05, AbstractC25351Lp.A00(this.A02).A00, 36887537075225351L);
                String str = this.A00;
                if (str == null) {
                    C14360o3.A0F(CacheBehaviorLogger.SOURCE);
                    throw C00O.createAndThrow();
                }
                return AbstractC001900j.A0a(A04, str, false);
            case 1:
            case 6:
            default:
                return false;
        }
    }

    public final void A06(Context context, AbstractC018607g abstractC018607g, C1ET c1et) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("ReelLoader.load.loaderManager", 791233338);
        }
        try {
            if (C18U.A06(C06090Tz.A05, this.A02, 36310624183189717L)) {
                A03(c1et, new C33083Eig(context, abstractC018607g, this));
            } else {
                java.util.Set set = this.A04;
                if (!set.isEmpty()) {
                    try {
                        A02(context, abstractC018607g, A00(c1et, this, set));
                    } catch (IOException e) {
                        C0K8.A0G(FEG.A00, "Failed to create a reels media network task", e);
                    }
                }
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1668489123);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1718970756);
            }
            throw th;
        }
    }

    public final void A07(C1ET c1et) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("ReelLoader.load.Threadpool", 626691636);
        }
        try {
            if (C18U.A06(C06090Tz.A05, this.A02, 36310624183189717L)) {
                A03(c1et, new C82083lU(this));
            } else {
                java.util.Set set = this.A04;
                if (!set.isEmpty()) {
                    try {
                        A04(A00(c1et, this, set), this);
                    } catch (IOException e) {
                        C0K8.A0G(FEG.A00, "Failed to create a reels media network task", e);
                    }
                }
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(259379261);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1286900724);
            }
            throw th;
        }
    }
}
