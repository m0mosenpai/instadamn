package com.instagram.banyan;

import X.A84;
import X.ADE;
import X.ADK;
import X.AbstractC001800i;
import X.AbstractC06930Yk;
import X.AbstractC09440dt;
import X.AbstractC121315eU;
import X.AbstractC121365ec;
import X.AbstractC121385ee;
import X.AbstractC122135g5;
import X.AbstractC13590ml;
import X.AbstractC221815t;
import X.AbstractC24641Ih;
import X.AbstractC25651Mw;
import X.AnonymousClass001;
import X.AnonymousClass170;
import X.C006802i;
import X.C012504o;
import X.C06090Tz;
import X.C07950bF;
import X.C0K8;
import X.C0fO;
import X.C0w9;
import X.C121125e6;
import X.C121135e7;
import X.C121155eE;
import X.C121165eF;
import X.C121175eG;
import X.C121255eO;
import X.C121285eR;
import X.C121295eS;
import X.C121305eT;
import X.C121325eV;
import X.C121335eW;
import X.C121375ed;
import X.C121395ef;
import X.C122035fv;
import X.C122045fw;
import X.C122065fy;
import X.C124055jK;
import X.C14120nc;
import X.C14360o3;
import X.C15500q5;
import X.C16V;
import X.C18U;
import X.C1ON;
import X.C214309eU;
import X.C218914p;
import X.C25621Ms;
import X.C25671My;
import X.C2IP;
import X.C3MC;
import X.C42281xI;
import X.C46g;
import X.C48032Iq;
import X.C50154MDh;
import X.C5e8;
import X.C9F8;
import X.EnumC09460dv;
import X.EnumC220415e;
import X.InterfaceC09390do;
import X.InterfaceC12870lZ;
import X.InterfaceC14020nS;
import X.InterfaceC19610xo;
import X.InterfaceC19630xq;
import X.InterfaceC41501vz;
import X.V3U;
import X.V6F;
import X.V6G;
import X.V6H;
import X.V6I;
import android.os.Parcelable;
import com.facebook.systrace.Systrace;
import com.instagram.banyan.BanyanCoordinator;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes3.dex */
public final class BanyanCoordinator {
    public static final String[] A0T = {"reshare_share_sheet", "story_share_sheet", "forwarding_recipient_sheet", "direct_ibc_nullstate"};
    public int A00;
    public long A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public C121135e7 A05;
    public final int A06;
    public final C5e8 A07;
    public final C121175eG A08;
    public final C121125e6 A09;
    public final C121165eF A0A;
    public final C121155eE A0B;
    public final InterfaceC41501vz A0C;
    public final InterfaceC41501vz A0D;
    public final InterfaceC41501vz A0E;
    public final InterfaceC41501vz A0F;
    public final InterfaceC41501vz A0G;
    public final InterfaceC41501vz A0H;
    public final UserSession A0I;
    public final InterfaceC14020nS A0J;
    public final HashMap A0K = new HashMap();
    public final ReentrantReadWriteLock A0L = new ReentrantReadWriteLock();
    public final InterfaceC09390do A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final C121255eO A0P;
    public final InterfaceC12870lZ A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public HashMap cachedClickstreamTokenResults;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.banyan.BanyanCoordinator r7, X.InterfaceC23621Ds r8) {
        /*
            r1 = 0
            r4 = 13
            boolean r0 = X.C9CY.A00(r8, r4)
            if (r0 == 0) goto La7
            r6 = r8
            X.9CY r6 = (X.C9CY) r6
            int r3 = r6.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto La7
            int r3 = r3 - r2
            r6.A00 = r3
        L17:
            java.lang.Object r4 = r6.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r6.A00
            r5 = 1
            if (r0 == 0) goto L97
            if (r0 != r5) goto Lae
            java.lang.Object r7 = r6.A01
            com.instagram.banyan.BanyanCoordinator r7 = (com.instagram.banyan.BanyanCoordinator) r7
            X.AbstractC09560e7.A00(r4)
        L29:
            X.QqZ r4 = (X.C59889QqZ) r4
            if (r4 == 0) goto L6f
            java.lang.Class<X.QqY> r3 = X.C59888QqY.class
            java.lang.String r2 = "get_paginated_ig_share_sheet_ranking_query(input:$input)"
            r0 = 846393017(0x3272eeb9, float:1.4140533E-8)
            X.2JS r2 = r4.A03(r3, r2, r0)
            if (r2 == 0) goto L40
            java.lang.String r0 = "status"
            java.lang.String r1 = r2.A09(r0)
        L40:
            java.lang.String r0 = "ok"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6f
            X.5fw r4 = X.AbstractC34760FSz.A00(r4)
            java.util.List r3 = r4.A03
            com.instagram.common.session.UserSession r0 = r7.A0I
            X.5eV r2 = X.AbstractC121315eU.A00(r0)
            X.5eW r1 = r2.A00
            if (r1 == 0) goto L67
            r0 = 0
            r1.A04 = r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "graphql_fetch_end"
            X.C121325eV.A02(r1, r0, r3)
            X.C121325eV.A00(r2)
        L67:
            java.lang.String r0 = "GraphQL"
            r7.A0C(r4, r0, r5)
        L6c:
            X.0eB r2 = X.C0eB.A00
            return r2
        L6f:
            com.instagram.common.session.UserSession r0 = r7.A0I
            X.5eV r4 = X.AbstractC121315eU.A00(r0)
            java.util.List r3 = java.util.Collections.emptyList()
            X.C14360o3.A07(r3)
            r2 = 0
            X.5eW r0 = r4.A00
            if (r0 == 0) goto L6c
            r0.A04 = r2
            java.util.List r1 = r0.A01
            java.lang.String r0 = "graphql_fetch_failed"
            r1.add(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "graphql_fetch_end"
            X.C121325eV.A02(r1, r0, r3)
            X.C121325eV.A00(r4)
            goto L6c
        L97:
            X.AbstractC09560e7.A00(r4)
            r6.A01 = r7
            r6.A00 = r5
            java.lang.String r0 = "reshare_share_sheet"
            java.lang.Object r4 = A01(r7, r0, r6)
            if (r4 != r2) goto L29
            return r2
        La7:
            X.9CY r6 = new X.9CY
            r6.<init>(r7, r8, r4)
            goto L17
        Lae:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.banyan.BanyanCoordinator.A02(com.instagram.banyan.BanyanCoordinator, X.1Ds):java.lang.Object");
    }

    public final C121305eT A07(String str) {
        C121305eT A00;
        C012504o c012504o = new C012504o(0);
        C012504o c012504o2 = new C012504o(0);
        if (str.equals("forwarding_recipient_sheet") || str.equals("story_share_sheet")) {
            if (C18U.A06(C06090Tz.A05, this.A0I, 36324290768941130L)) {
                A00 = A00(this, null, "reshare_share_sheet", null, c012504o, c012504o2);
                if (str.equals("direct_user_search_nullstate") && A00.A02.isEmpty()) {
                    A04(this);
                }
                return A00;
            }
        }
        A00 = A00(this, null, str, null, c012504o, c012504o2);
        if (str.equals("direct_user_search_nullstate")) {
            A04(this);
        }
        return A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r30.A0I, 36329844161659435L) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r8 == null) goto L19;
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x02f5: INVOKE (r11v0 ?? I:com.instagram.banyan.BanyanCoordinator), (r10 I:java.lang.String), (r0 I:java.lang.String) DIRECT call: com.instagram.banyan.BanyanCoordinator.A06(java.lang.String, java.lang.String):void A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:757), block:B:150:0x02ec */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x02f5: INVOKE (r11 I:com.instagram.banyan.BanyanCoordinator), (r10 I:java.lang.String), (r0 I:java.lang.String) DIRECT call: com.instagram.banyan.BanyanCoordinator.A06(java.lang.String, java.lang.String):void A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:757), block:B:150:0x02ec */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C121305eT A00(com.instagram.banyan.BanyanCoordinator r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.util.Set r34, java.util.Set r35) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.banyan.BanyanCoordinator.A00(com.instagram.banyan.BanyanCoordinator, java.lang.String, java.lang.String, java.lang.String, java.util.Set, java.util.Set):X.5eT");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.banyan.BanyanCoordinator r9, java.lang.String r10, X.InterfaceC23621Ds r11) {
        /*
            r3 = 13
            boolean r0 = X.C9CW.A00(r11, r3)
            if (r0 == 0) goto L24
            r5 = r11
            X.9CW r5 = (X.C9CW) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r8 = X.C1JX.A02
            int r0 = r5.A00
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L34
            if (r0 != r6) goto L2c
            goto Lb9
        L24:
            r0 = 42
            X.9CW r5 = new X.9CW
            r5.<init>(r9, r11, r3, r0)
            goto L16
        L2c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L34:
            X.AbstractC09560e7.A00(r1)
            X.2JO r4 = new X.2JO
            r4.<init>()
            java.util.List r1 = java.util.Collections.singletonList(r10)
            X.C14360o3.A07(r1)
            java.lang.String r0 = "views"
            r4.A05(r0, r1)
            com.instagram.common.session.UserSession r3 = r9.A0I
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36604820852905093(0x820be400011485, double:3.212374330935391E-306)
            long r0 = X.C18U.A01(r2, r3, r0)
            int r9 = (int) r0
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r9)
            java.lang.String r0 = "count_per_page"
            r4.A07(r1, r0)
            java.lang.String r0 = "page_max_id"
            r4.A09(r7, r0)
            r0 = 36320721651311444(0x81098100032354, double:3.032708851871905E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto Lab
            r0 = 36602196627886705(0x82098100011271, double:3.2107147604668565E-306)
            long r0 = X.C18U.A01(r2, r3, r0)
            int r9 = (int) r0
            r0 = 36602196627821168(0x82098100001270, double:3.2107147604254106E-306)
            long r0 = X.C18U.A01(r2, r3, r0)
            int r10 = (int) r0
            if (r9 <= 0) goto Lab
            if (r10 <= 0) goto Lab
            X.0Jx r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r10)
            java.lang.String r0 = "position"
            X.0CA r2 = r2.A02()
            X.C0CA.A00(r2, r1, r0)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r9)
            java.lang.String r0 = "size"
            X.C0CA.A00(r2, r1, r0)
            java.lang.String r1 = "ibc_share_sheet_params"
            X.0CA r0 = r4.A02()
            r0.A0E(r2, r1)
        Lab:
            r0 = 0
            com.google.common.util.concurrent.SettableFuture r0 = X.C122035fv.A00(r4, r3, r0)     // Catch: java.lang.Exception -> Lc5
            r5.A00 = r6     // Catch: java.lang.Exception -> Lc5
            java.lang.Object r1 = X.AbstractC47129KsO.A00(r0, r5)     // Catch: java.lang.Exception -> Lc5
            if (r1 != r8) goto Lbc
            return r8
        Lb9:
            X.AbstractC09560e7.A00(r1)     // Catch: java.lang.Exception -> Lc5
        Lbc:
            X.436 r1 = (X.AnonymousClass436) r1     // Catch: java.lang.Exception -> Lc5
            java.lang.Object r0 = r1.Bos()     // Catch: java.lang.Exception -> Lc5
            X.QqZ r0 = (X.C59889QqZ) r0     // Catch: java.lang.Exception -> Lc5
            return r0
        Lc5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.banyan.BanyanCoordinator.A01(com.instagram.banyan.BanyanCoordinator, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r8.isEmpty() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.XFO r11, com.instagram.banyan.BanyanCoordinator r12) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.banyan.BanyanCoordinator.A03(X.XFO, com.instagram.banyan.BanyanCoordinator):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(com.instagram.banyan.BanyanCoordinator r24) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.banyan.BanyanCoordinator.A04(com.instagram.banyan.BanyanCoordinator):void");
    }

    public static final void A05(BanyanCoordinator banyanCoordinator, User user) {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = banyanCoordinator.A09.A00;
            if (reentrantReadWriteLock.writeLock().tryLock(1L, TimeUnit.SECONDS)) {
                try {
                    if (user.CYY() || user.isRestricted()) {
                        C5e8 c5e8 = banyanCoordinator.A07;
                        C121125e6 c121125e6 = c5e8.A02;
                        c121125e6.A00();
                        if (c5e8.A0A.remove(user.getId()) != null) {
                            Iterator it = c5e8.A07.values().iterator();
                            while (it.hasNext()) {
                                ((C121395ef) it.next()).A04.remove(user.getId());
                            }
                        }
                        c121125e6.A00();
                        Iterator it2 = c5e8.A08.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            Object key = entry.getKey();
                            C121375ed c121375ed = (C121375ed) entry.getValue();
                            if (c121375ed != null) {
                                List unmodifiableList = Collections.unmodifiableList(c121375ed.A0B);
                                C14360o3.A07(unmodifiableList);
                                if (AbstractC001800i.A0u(unmodifiableList, user)) {
                                    it2.remove();
                                    Iterator it3 = c5e8.A07.values().iterator();
                                    while (it3.hasNext()) {
                                        C15500q5.A04(((C121395ef) it3.next()).A04).remove(key);
                                    }
                                }
                            }
                        }
                    }
                    C5e8 c5e82 = banyanCoordinator.A07;
                    c5e82.A02.A00();
                    C5e8.A00(c5e82, null);
                    reentrantReadWriteLock.writeLock().unlock();
                    return;
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            throw new InterruptedException("Failed to claim lock after 1 seconds");
        } catch (InterruptedException e) {
            C0K8.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
        }
    }

    private final void A06(String str, String str2) {
        if (str.equals("reshare_share_sheet")) {
            C006802i.A0p.markerPoint(145755797, str2);
        }
    }

    public final DirectShareTarget A08(String str) {
        Lock writeLock;
        DirectShareTarget directShareTarget;
        try {
            C121125e6 c121125e6 = this.A09;
            if (c121125e6.A01) {
                writeLock = c121125e6.A00.readLock();
            } else {
                writeLock = c121125e6.A00.writeLock();
            }
            if (writeLock.tryLock(1L, TimeUnit.SECONDS)) {
                try {
                    C5e8 c5e8 = this.A07;
                    c5e8.A02.A00();
                    C121375ed c121375ed = (C121375ed) c5e8.A08.get(str);
                    if (c121375ed != null) {
                        directShareTarget = AbstractC122135g5.A00(null, c121375ed, this.A0I, null, null, null);
                    } else {
                        directShareTarget = null;
                    }
                    return directShareTarget;
                } finally {
                    writeLock.unlock();
                }
            }
            throw new InterruptedException("Failed to claim lock after 1 seconds");
        } catch (IOException e) {
            C0K8.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
            return null;
        } catch (InterruptedException e2) {
            C0K8.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e2);
            return null;
        }
    }

    public final String A09(String str) {
        Lock writeLock;
        try {
            C121125e6 c121125e6 = this.A09;
            if (c121125e6.A01) {
                writeLock = c121125e6.A00.readLock();
            } else {
                writeLock = c121125e6.A00.writeLock();
            }
            if (writeLock.tryLock(1L, TimeUnit.SECONDS)) {
                try {
                    C121395ef A02 = this.A07.A02(str);
                    if (A02 != null) {
                        String str2 = A02.A02;
                        writeLock.unlock();
                        return str2;
                    }
                    writeLock.unlock();
                    return null;
                } catch (Throwable th) {
                    writeLock.unlock();
                    throw th;
                }
            }
            throw new InterruptedException("Failed to claim lock after 1 seconds");
        } catch (IOException | InterruptedException e) {
            C0K8.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
            return null;
        }
    }

    public final void A0A() {
        ArrayList arrayList;
        Lock writeLock;
        int i;
        C121325eV A00;
        ArrayList arrayList2;
        C121125e6 c121125e6;
        ReentrantReadWriteLock reentrantReadWriteLock;
        User A002;
        UserSession userSession = this.A0I;
        C121325eV.A01(AbstractC121315eU.A00(userSession));
        C5e8 c5e8 = this.A07;
        AtomicBoolean atomicBoolean = c5e8.A0C;
        if (!atomicBoolean.get()) {
            AtomicBoolean atomicBoolean2 = c5e8.A0B;
            if (!atomicBoolean2.get()) {
                atomicBoolean2.set(true);
                if (Systrace.A0E(1L)) {
                    C0fO.A01("BanyanCache::loadFromDisk", -786678983);
                }
                try {
                    if (AbstractC121315eU.A00(userSession).A00 != null) {
                        C006802i.A0p.markerPoint(135806945, "disk_fetch_start");
                    }
                    try {
                        try {
                            c121125e6 = c5e8.A02;
                            reentrantReadWriteLock = c121125e6.A00;
                        } catch (Throwable th) {
                            atomicBoolean2.set(false);
                            C121325eV A003 = AbstractC121315eU.A00(userSession);
                            ArrayList arrayList3 = new ArrayList(c5e8.A07.values());
                            if (A003.A00 != null) {
                                C121325eV.A02(true, "disk_fetch_end", arrayList3);
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        C0w9.A06("BanyanCache", "IOException occurred loading banyan", e);
                        c5e8.A04(true);
                        atomicBoolean.set(false);
                        atomicBoolean2.set(false);
                        A00 = AbstractC121315eU.A00(userSession);
                        arrayList2 = new ArrayList(c5e8.A07.values());
                    } catch (InterruptedException e2) {
                        C0K8.A0F("BanyanCache", "Unable to acquire lock for executing this block.", e2);
                        atomicBoolean2.set(false);
                        A00 = AbstractC121315eU.A00(userSession);
                        arrayList2 = new ArrayList(c5e8.A07.values());
                    }
                    if (reentrantReadWriteLock.writeLock().tryLock(1L, TimeUnit.SECONDS)) {
                        try {
                            c121125e6.A00();
                            c5e8.A04(false);
                            if (Systrace.A0E(1L)) {
                                C0fO.A01("BanyanCache::loadFromSharedPreferences", -1907660100);
                            }
                            try {
                                for (Map.Entry entry : c5e8.A05.getAll().entrySet()) {
                                    String str = (String) entry.getKey();
                                    Object value = entry.getValue();
                                    if (str != null && value != null) {
                                        C14360o3.A0B("user:", 1);
                                        if (str.startsWith("user:")) {
                                            if (C18U.A06(C06090Tz.A05, c5e8.A03, 36320382350401966L)) {
                                                A002 = AbstractC221815t.A00((String) value);
                                            } else {
                                                A002 = AnonymousClass170.A00(C07950bF.A04.A01(userSession, (String) value));
                                            }
                                            C14360o3.A07(A002);
                                            Parcelable.Creator creator = User.CREATOR;
                                            User user = new User(A002.getId(), A002.getUsername());
                                            user.A0h(userSession, A002, false);
                                            c5e8.A0A.put(A002.getId(), user);
                                            C46g c46g = c5e8.A01;
                                            String fullName = user.getFullName();
                                            if (fullName == null) {
                                                fullName = "";
                                            }
                                            c46g.E6z(AnonymousClass001.A0T(fullName, user.getUsername(), ' '), user.getId());
                                        } else {
                                            C14360o3.A0B("thread:", 1);
                                            if (str.startsWith("thread:")) {
                                                C121375ed parseFromJson = AbstractC121365ec.parseFromJson(C07950bF.A04.A01(userSession, (String) value));
                                                if (parseFromJson != null) {
                                                    c5e8.A08.put(parseFromJson.A09, parseFromJson);
                                                    C5e8.A01(c5e8, parseFromJson);
                                                }
                                            } else {
                                                C14360o3.A0B("ranking_store:", 1);
                                                if (str.startsWith("ranking_store:")) {
                                                    C121395ef parseFromJson2 = AbstractC121385ee.parseFromJson(C16V.A00((String) value));
                                                    c5e8.A07.put(parseFromJson2.A03, parseFromJson2);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(-1337041578);
                                }
                                atomicBoolean.set(true);
                                reentrantReadWriteLock.writeLock().unlock();
                                atomicBoolean2.set(false);
                                A00 = AbstractC121315eU.A00(userSession);
                                arrayList2 = new ArrayList(c5e8.A07.values());
                                if (A00.A00 != null) {
                                    C121325eV.A02(true, "disk_fetch_end", arrayList2);
                                }
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(844609465);
                                }
                            } catch (Throwable th2) {
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(386685478);
                                }
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            reentrantReadWriteLock.writeLock().unlock();
                            throw th3;
                        }
                    } else {
                        throw new InterruptedException("Failed to claim lock after 1 seconds");
                    }
                } catch (Throwable th4) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(1520067387);
                        throw th4;
                    }
                    throw th4;
                }
            }
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36328813369507636L)) {
            C121155eE c121155eE = this.A0B;
            AtomicBoolean atomicBoolean3 = c121155eE.A04;
            if (!atomicBoolean3.get()) {
                AtomicBoolean atomicBoolean4 = c121155eE.A03;
                if (!atomicBoolean4.get()) {
                    atomicBoolean4.set(true);
                    if (Systrace.A0E(1L)) {
                        C0fO.A01("BanyanCache::loadFromDisk", -561990904);
                    }
                    C121135e7 c121135e7 = c121155eE.A00;
                    ReentrantReadWriteLock.ReadLock readLock = c121135e7.readLock();
                    int i2 = 0;
                    if (c121135e7.getWriteHoldCount() == 0) {
                        i = c121135e7.getReadHoldCount();
                        for (int i3 = 0; i3 < i; i3++) {
                            readLock.unlock();
                        }
                    } else {
                        i = 0;
                    }
                    ReentrantReadWriteLock.WriteLock writeLock2 = c121135e7.writeLock();
                    writeLock2.lock();
                    try {
                        c121155eE.A02.clear();
                        while (i2 < i) {
                            readLock.lock();
                            i2++;
                        }
                        writeLock2.unlock();
                        c121155eE.A00();
                        atomicBoolean3.set(true);
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(1569076635);
                        }
                        atomicBoolean4.set(false);
                    } catch (Throwable th5) {
                        while (i2 < i) {
                            readLock.lock();
                            i2++;
                        }
                        writeLock2.unlock();
                        throw th5;
                    }
                }
            }
        }
        try {
            C121125e6 c121125e62 = this.A09;
            if (c121125e62.A01) {
                writeLock = c121125e62.A00.readLock();
            } else {
                writeLock = c121125e62.A00.writeLock();
            }
        } catch (IOException | InterruptedException e3) {
            C0K8.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e3);
            arrayList = new ArrayList();
        }
        if (writeLock.tryLock(1L, TimeUnit.SECONDS)) {
            try {
                c5e8.A02.A00();
                LinkedList linkedList = new LinkedList();
                Iterator it = c5e8.A06.iterator();
                C14360o3.A07(it);
                while (it.hasNext()) {
                    Object next = it.next();
                    C14360o3.A07(next);
                    Map map = c5e8.A07;
                    if (map.containsKey(next)) {
                        Object obj = map.get(next);
                        C14360o3.A0A(obj);
                        if (((C121395ef) obj).A01 < System.currentTimeMillis()) {
                        }
                    }
                    linkedList.add(next);
                }
                List unmodifiableList = Collections.unmodifiableList(linkedList);
                C14360o3.A07(unmodifiableList);
                ArrayList arrayList4 = new ArrayList(unmodifiableList);
                arrayList = new ArrayList(AbstractC001800i.A0X(arrayList4));
                boolean A06 = C18U.A06(c06090Tz, userSession, 36313441681737735L);
                String[] strArr = A0T;
                int i4 = 0;
                do {
                    String str2 = strArr[i4];
                    if (arrayList4.contains(str2) && c5e8.A02(str2) != null && A06) {
                        arrayList.remove(str2);
                    }
                    i4++;
                } while (i4 < 4);
                writeLock.unlock();
                this.A02 = arrayList;
                this.A00 = 0;
                A04(this);
                if (C18U.A06(c06090Tz, userSession, 36328813369507636L)) {
                    InterfaceC19630xq interfaceC19630xq = this.A0B.A01;
                    if (interfaceC19630xq.getLong("last_sync_timestamp_sec", -1L) < System.currentTimeMillis() || interfaceC19630xq.getAll().isEmpty()) {
                        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                        List singletonList = Collections.singletonList("shortcut");
                        C14360o3.A07(singletonList);
                        c25621Ms.A06();
                        c25621Ms.A03();
                        c25621Ms.A0B("api/v1/stories/private_stories/friend_lists/");
                        c25621Ms.A0R(C214309eU.class, ADE.class);
                        c25621Ms.A9s("list_types", AbstractC13590ml.A00(singletonList));
                        C1ON A0N = c25621Ms.A0N();
                        A0N.A00 = new V3U(this);
                        AbstractC24641Ih.A00().schedule(A0N);
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th6) {
                writeLock.unlock();
                throw th6;
            }
        }
        throw new InterruptedException("Failed to claim lock after 1 seconds");
    }

    public final void A0B() {
        int i;
        C1ON A01;
        ReentrantReadWriteLock.ReadLock readLock;
        int i2;
        ReentrantReadWriteLock.WriteLock writeLock;
        UserSession userSession = this.A0I;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36321941421828005L)) {
            C121175eG c121175eG = this.A08;
            ReentrantReadWriteLock.WriteLock writeLock2 = c121175eG.writeLock();
            C14360o3.A07(writeLock2);
            if (writeLock2.tryLock()) {
                try {
                    ReentrantReadWriteLock reentrantReadWriteLock = this.A0L;
                    ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
                    readLock2.lock();
                    try {
                        HashMap hashMap = this.A0K;
                        Map A0B = AbstractC06930Yk.A0B(hashMap);
                        readLock2.unlock();
                        Set keySet = A0B.keySet();
                        int i3 = 0;
                        if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                            Iterator it = keySet.iterator();
                            while (it.hasNext()) {
                                if (((Set) it.next()).contains("direct_ibc_nullstate")) {
                                    break;
                                }
                            }
                        }
                        ReentrantReadWriteLock.ReadLock readLock3 = c121175eG.readLock();
                        int i4 = 0;
                        if (c121175eG.getWriteHoldCount() == 0) {
                            i = c121175eG.getReadHoldCount();
                            for (int i5 = 0; i5 < i; i5++) {
                                readLock3.unlock();
                            }
                        } else {
                            i = 0;
                        }
                        ReentrantReadWriteLock.WriteLock writeLock3 = c121175eG.writeLock();
                        writeLock3.lock();
                        try {
                            InterfaceC09390do interfaceC09390do = this.A0M;
                            try {
                                if (((A84) interfaceC09390do.getValue()).A01.getLong("timestamp", -1L) != -1) {
                                    if ((System.currentTimeMillis() / 1000) - r15 <= C18U.A00(c06090Tz, userSession, 37166366352146865L)) {
                                        for (int i6 = 0; i6 < i; i6++) {
                                            readLock3.lock();
                                        }
                                        writeLock3.unlock();
                                        writeLock2.unlock();
                                        return;
                                    }
                                    while (i4 < i) {
                                        readLock3.lock();
                                        i4++;
                                    }
                                } else {
                                    while (i4 < i) {
                                        readLock3.lock();
                                        i4++;
                                    }
                                }
                                Set singleton = Collections.singleton("direct_ibc_nullstate");
                                C14360o3.A07(singleton);
                                hashMap.put(singleton, A01);
                                while (i3 < i2) {
                                    readLock.lock();
                                    i3++;
                                }
                                writeLock.unlock();
                                A84 a84 = (A84) interfaceC09390do.getValue();
                                if (a84.A00.writeLock().isHeldByCurrentThread()) {
                                    try {
                                        InterfaceC19610xo ARD = a84.A01.ARD();
                                        ARD.AHW();
                                        ARD.E7G("timestamp", System.currentTimeMillis() / 1000);
                                        ARD.apply();
                                    } catch (IOException e) {
                                        C0w9.A06("IBCCache", "Unable to save to disk", e);
                                    }
                                    writeLock2.unlock();
                                    return;
                                }
                                throw new IllegalStateException("Check failed.");
                            } catch (Throwable th) {
                                while (i3 < i2) {
                                    readLock.lock();
                                    i3++;
                                }
                                writeLock.unlock();
                                throw th;
                            }
                            writeLock3.unlock();
                            List singletonList = Collections.singletonList("direct_ibc_nullstate");
                            C14360o3.A07(singletonList);
                            A01 = C122035fv.A01(userSession, false, null, singletonList, null, false);
                            A01.A00 = new C122065fy(this);
                            AbstractC24641Ih.A00().schedule(A01);
                            readLock = reentrantReadWriteLock.readLock();
                            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                                i2 = reentrantReadWriteLock.getReadHoldCount();
                                for (int i7 = 0; i7 < i2; i7++) {
                                    readLock.unlock();
                                }
                            } else {
                                i2 = 0;
                            }
                            writeLock = reentrantReadWriteLock.writeLock();
                            writeLock.lock();
                        } catch (Throwable th2) {
                            while (i4 < i) {
                                readLock3.lock();
                                i4++;
                            }
                            writeLock3.unlock();
                        }
                    } catch (Throwable th3) {
                        readLock2.unlock();
                    }
                } catch (Throwable th4) {
                    writeLock2.unlock();
                    throw th4;
                }
            }
        }
    }

    public final void A0C(C122045fw c122045fw, String str, boolean z) {
        C124055jK c124055jK;
        C121325eV A00 = AbstractC121315eU.A00(this.A0I);
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A09.A00;
            if (reentrantReadWriteLock.writeLock().tryLock(1L, TimeUnit.SECONDS)) {
                if (!z) {
                    try {
                        for (C121395ef c121395ef : c122045fw.A03) {
                            C121395ef A02 = this.A07.A02(c121395ef.A03);
                            C14360o3.A0A(A02);
                            ADK.A00(A02, c121395ef);
                        }
                    } catch (Throwable th) {
                        reentrantReadWriteLock.writeLock().unlock();
                        throw th;
                    }
                }
                C5e8 c5e8 = this.A07;
                c5e8.A03(c122045fw);
                if (str.equals("GraphQL")) {
                    c5e8.A02.A00();
                    ArrayList arrayList = new ArrayList(c5e8.A07.values());
                    C121335eW c121335eW = A00.A00;
                    if (c121335eW != null) {
                        C121325eV.A02(null, "disk_persist_gql_start", arrayList);
                        c121335eW.A00.add("GraphQL");
                    }
                }
                if (str.length() > 0) {
                    c124055jK = new C124055jK(this, str);
                } else {
                    c124055jK = null;
                }
                c5e8.A02.A00();
                C5e8.A00(c5e8, c124055jK);
                reentrantReadWriteLock.writeLock().unlock();
            }
        } catch (InterruptedException e) {
            C0K8.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
        }
    }

    public final void A0D(String str) {
        if (this.A0R) {
            try {
                ReentrantReadWriteLock reentrantReadWriteLock = this.A09.A00;
                if (reentrantReadWriteLock.writeLock().tryLock(1L, TimeUnit.SECONDS)) {
                    try {
                        C5e8 c5e8 = this.A07;
                        c5e8.A04.ATO(new V6F(c5e8, str));
                        reentrantReadWriteLock.writeLock().unlock();
                    } catch (Throwable th) {
                        reentrantReadWriteLock.writeLock().unlock();
                        throw th;
                    }
                }
            } catch (InterruptedException e) {
                C0K8.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
            }
        }
    }

    public final void A0E(String str) {
        if (this.A0S) {
            try {
                ReentrantReadWriteLock reentrantReadWriteLock = this.A09.A00;
                if (reentrantReadWriteLock.writeLock().tryLock(1L, TimeUnit.SECONDS)) {
                    try {
                        C5e8 c5e8 = this.A07;
                        c5e8.A04.ATO(new V6G(c5e8, str));
                        reentrantReadWriteLock.writeLock().unlock();
                    } catch (Throwable th) {
                        reentrantReadWriteLock.writeLock().unlock();
                        throw th;
                    }
                }
            } catch (InterruptedException e) {
                C0K8.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
            }
        }
    }

    public final void A0F(String str) {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A09.A00;
            if (reentrantReadWriteLock.writeLock().tryLock(1L, TimeUnit.SECONDS)) {
                try {
                    C5e8 c5e8 = this.A07;
                    c5e8.A04.ATO(new V6H(c5e8, str));
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
        } catch (InterruptedException e) {
            C0K8.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void A0H(boolean z) {
        int i;
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A09.A00;
            if (reentrantReadWriteLock.writeLock().tryLock(1L, TimeUnit.SECONDS)) {
                try {
                    ReentrantReadWriteLock reentrantReadWriteLock2 = this.A0L;
                    ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock2.readLock();
                    if (reentrantReadWriteLock2.getWriteHoldCount() == 0) {
                        i = reentrantReadWriteLock2.getReadHoldCount();
                        for (int i2 = 0; i2 < i; i2++) {
                            readLock.unlock();
                        }
                    } else {
                        i = 0;
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock2.writeLock();
                    writeLock.lock();
                    try {
                        HashMap hashMap = this.A0K;
                        if (!hashMap.isEmpty()) {
                            for (Object obj : hashMap.values()) {
                                C14360o3.A07(obj);
                                ((C1ON) obj).cancel();
                            }
                            hashMap.clear();
                        }
                        for (int i3 = 0; i3 < i; i3++) {
                            readLock.lock();
                        }
                        writeLock.unlock();
                        C25671My A00 = AbstractC25651Mw.A00(this.A0I);
                        A00.A02(this.A0F, C42281xI.class);
                        A00.A02(this.A0H, C121285eR.class);
                        A00.A02(this.A0G, C3MC.class);
                        A00.A02(this.A0E, C48032Iq.class);
                        A00.A02(this.A0D, C121295eS.class);
                        A00.A02(this.A0C, C2IP.class);
                        C218914p c218914p = C218914p.A08;
                        C218914p.A06(this.A0Q);
                        this.A07.A04(z);
                        this.A02 = null;
                        this.A04 = false;
                        reentrantReadWriteLock.writeLock().unlock();
                    } catch (Throwable th) {
                        for (int i4 = 0; i4 < i; i4++) {
                            readLock.lock();
                        }
                        writeLock.unlock();
                        throw th;
                    }
                } catch (Throwable th2) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th2;
                }
            }
        } catch (InterruptedException e) {
            C0K8.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.concurrent.locks.ReentrantReadWriteLock, X.5eG] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.locks.ReentrantReadWriteLock, X.5e7] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.concurrent.locks.ReentrantReadWriteLock, X.5eF] */
    public BanyanCoordinator(final UserSession userSession) {
        this.A0I = userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        C121125e6 c121125e6 = new C121125e6(C18U.A06(c06090Tz, userSession, 36323294336593038L));
        this.A09 = c121125e6;
        this.A05 = new ReentrantReadWriteLock();
        this.A07 = new C5e8(c121125e6, userSession);
        this.A0B = new C121155eE(this.A05, userSession);
        this.A0A = new ReentrantReadWriteLock();
        this.A0M = AbstractC09440dt.A00(EnumC09460dv.A03, new C9F8(33, userSession, this));
        this.A08 = new ReentrantReadWriteLock();
        this.A0O = C18U.A06(c06090Tz, userSession, 36320721651311444L);
        this.A0N = C18U.A06(c06090Tz, userSession, 36320721651245907L);
        this.A0R = C18U.A06(c06090Tz, userSession, 36317496130868497L);
        this.A0S = C18U.A06(c06090Tz, userSession, 36317496131392787L);
        this.A06 = (int) C18U.A01(c06090Tz, userSession, 36598971107904867L);
        this.A0F = new InterfaceC41501vz() { // from class: X.5eH
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(717024446);
                C42281xI c42281xI = (C42281xI) obj;
                int A032 = C0f9.A03(846321018);
                C14360o3.A0B(c42281xI, 0);
                InterfaceC14020nS A00 = C14120nc.A00();
                C14360o3.A07(A00);
                A00.ATO(new C32652EZa(BanyanCoordinator.this, c42281xI));
                C0f9.A0A(448730300, A032);
                C0f9.A0A(-148026920, A03);
            }
        };
        this.A0H = new InterfaceC41501vz() { // from class: X.5eI
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-1496211350);
                C121285eR c121285eR = (C121285eR) obj;
                int A032 = C0f9.A03(-261931875);
                C14360o3.A0B(c121285eR, 0);
                InterfaceC14020nS A00 = C14120nc.A00();
                C14360o3.A07(A00);
                A00.ATO(new C32653EZb(BanyanCoordinator.this, c121285eR));
                C0f9.A0A(-1015850820, A032);
                C0f9.A0A(2033946410, A03);
            }
        };
        this.A0G = new InterfaceC41501vz() { // from class: X.5eJ
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-1742170902);
                C3MC c3mc = (C3MC) obj;
                int A032 = C0f9.A03(-25909334);
                C14360o3.A0B(c3mc, 0);
                InterfaceC14020nS A00 = C14120nc.A00();
                C14360o3.A07(A00);
                A00.ATO(new V6K(BanyanCoordinator.this, c3mc));
                C0f9.A0A(-717641783, A032);
                C0f9.A0A(-533272018, A03);
            }
        };
        this.A0E = new InterfaceC41501vz() { // from class: X.5eK
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(736445097);
                C48032Iq c48032Iq = (C48032Iq) obj;
                int A032 = C0f9.A03(1971181319);
                C14360o3.A0B(c48032Iq, 0);
                if (c48032Iq.A00 instanceof C83693oE) {
                    InterfaceC14020nS A00 = C14120nc.A00();
                    C14360o3.A07(A00);
                    A00.ATO(new V6J(BanyanCoordinator.this, c48032Iq));
                }
                C0f9.A0A(-1233039504, A032);
                C0f9.A0A(-798297005, A03);
            }
        };
        this.A0D = new InterfaceC41501vz(this) { // from class: X.5eL
            public final /* synthetic */ BanyanCoordinator A00;

            {
                this.A00 = this;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1684122280);
                int A032 = C0f9.A03(648962707);
                if (!C18U.A06(C06090Tz.A05, userSession, 36324290769072204L) || System.currentTimeMillis() - this.A00.A01 > TimeUnit.SECONDS.toMillis(30L)) {
                    this.A00.A0G(null);
                }
                C0f9.A0A(510372786, A032);
                C0f9.A0A(-1849468874, A03);
            }
        };
        this.A0C = new InterfaceC41501vz(this) { // from class: X.5eM
            public final /* synthetic */ BanyanCoordinator A00;

            {
                this.A00 = this;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(659799369);
                int A032 = C0f9.A03(1054477479);
                if (!C18U.A06(C06090Tz.A05, userSession, 36324290769072204L) || System.currentTimeMillis() - this.A00.A01 > TimeUnit.SECONDS.toMillis(30L)) {
                    this.A00.A0G(null);
                }
                C0f9.A0A(-455920883, A032);
                C0f9.A0A(527072282, A03);
            }
        };
        InterfaceC12870lZ interfaceC12870lZ = new InterfaceC12870lZ() { // from class: X.5eN
            @Override // X.InterfaceC12870lZ
            public final void onAppBackgrounded() {
                int A03 = C0f9.A03(-735594862);
                BanyanCoordinator.this.A03 = true;
                C0f9.A0A(-1086820214, A03);
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppForegrounded() {
                Lock writeLock;
                int A03 = C0f9.A03(1509606034);
                BanyanCoordinator banyanCoordinator = BanyanCoordinator.this;
                if (banyanCoordinator.A03) {
                    if (C18U.A06(C06090Tz.A05, banyanCoordinator.A0I, 36324290769006667L)) {
                        banyanCoordinator.A0A();
                    }
                }
                if (C18U.A06(C06090Tz.A05, userSession, 36324290769137741L)) {
                    try {
                        C121125e6 c121125e62 = banyanCoordinator.A09;
                        if (c121125e62.A01) {
                            writeLock = c121125e62.A00.readLock();
                        } else {
                            writeLock = c121125e62.A00.writeLock();
                        }
                        if (writeLock.tryLock(1L, TimeUnit.SECONDS)) {
                            try {
                                C5e8 c5e8 = banyanCoordinator.A07;
                                c5e8.A02.A00();
                                if (c5e8.A07.containsKey("reshare_share_sheet")) {
                                    C121395ef A02 = c5e8.A02("reshare_share_sheet");
                                    if (A02 == null) {
                                        writeLock.unlock();
                                    } else {
                                        for (Object obj : A02.A04.values()) {
                                            C14360o3.A07(obj);
                                            if (((C121415eh) obj).A00 == 0.0d) {
                                                writeLock.unlock();
                                            }
                                        }
                                        writeLock.unlock();
                                    }
                                } else {
                                    writeLock.unlock();
                                }
                                C19K A022 = AnonymousClass194.A02(C12L.A00.AOT(839557200, 3));
                                AbstractC23641Du.A05(AnonymousClass191.A00, new MBq(banyanCoordinator, null, 30), A022);
                                break;
                            } catch (Throwable th) {
                                writeLock.unlock();
                                throw th;
                            }
                        }
                        throw new InterruptedException("Failed to claim lock after 1 seconds");
                    } catch (IOException | InterruptedException e) {
                        C0K8.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
                    }
                }
                banyanCoordinator.A03 = false;
                C0f9.A0A(-391251910, A03);
            }
        };
        this.A0Q = interfaceC12870lZ;
        this.A0J = C14120nc.A00();
        this.A0P = (C121255eO) userSession.A01(C121255eO.class, new C50154MDh(userSession, 2));
        C218914p.A03(EnumC220415e.A03, interfaceC12870lZ);
    }

    public final void A0G(ArrayList arrayList) {
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        A00.ATO(new V6I(this, arrayList));
    }
}
