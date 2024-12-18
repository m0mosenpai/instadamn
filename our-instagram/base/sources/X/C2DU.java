package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.systrace.Systrace;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.store.ThreadMetadataOverrideStore;
import com.instagram.direct.lockedchat.LockedChatKillSwitch;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.user.model.User;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.2DU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DU implements C2DS, InterfaceC13050lr {
    public static final C2DV A0S = new Object();
    public C44117Jeh A00;
    public C43990Jcd A01;
    public C43986JcZ A02;
    public Boolean A03;
    public Long A04;
    public final C18920wW A05;
    public final C25671My A06;
    public final C42201xA A07;
    public final C2ES A08;
    public final C2ES A09;
    public final UserSession A0A;
    public final C5G2 A0B;
    public final C46922Dg A0C;
    public final C2EV A0D;
    public final C2EM A0E;
    public final C2EA A0F;
    public final C2EW A0G;
    public final C28741aC A0H;
    public final HashMap A0I;
    public final java.util.Set A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final Context A0M;
    public final Handler A0N;
    public final InterfaceC41501vz A0O;
    public final ThreadMetadataOverrideStore A0P;
    public final C2DT A0Q;
    public final ArrayList A0R;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.2EM, X.2EO] */
    public C2DU(Context context, UserSession userSession, InterfaceC14020nS interfaceC14020nS, InterfaceC37208GaJ interfaceC37208GaJ, C2DT c2dt, List list) {
        C5G2 c5g2;
        this.A0M = context;
        this.A0A = userSession;
        this.A0Q = c2dt;
        C0KV c0kv = C28741aC.A0N;
        if (c0kv == null) {
            C14360o3.A0F("pendingMutationHandlerProvider");
            throw C00O.createAndThrow();
        }
        C28741aC c28741aC = new C28741aC(userSession, interfaceC14020nS, (C28711a9) c0kv.AXR(userSession), this);
        this.A0H = c28741aC;
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        this.A06 = A00;
        this.A0R = new ArrayList(list);
        this.A0J = Collections.synchronizedSet(new HashSet());
        this.A0K = AbstractC09440dt.A01(new C9E1(this, 13));
        this.A0L = AbstractC09440dt.A01(new C9E1(this, 14));
        this.A0C = new C46922Dg(context, A00, userSession, this, c28741aC, this);
        this.A0F = new C2EA(userSession);
        this.A0E = new C2EO();
        this.A09 = C2EP.A00();
        this.A08 = C2EP.A00();
        this.A07 = AbstractC42021ws.A00();
        this.A0I = new HashMap();
        this.A0N = new Handler(Looper.getMainLooper());
        if (LockedChatKillSwitch.isLockedChatEnabled(userSession, false)) {
            c5g2 = AbstractC161117Jw.A00(userSession);
        } else {
            c5g2 = null;
        }
        this.A0B = c5g2;
        InterfaceC41501vz interfaceC41501vz = new InterfaceC41501vz() { // from class: X.2EU
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-250533030);
                C42281xI c42281xI = (C42281xI) obj;
                int A032 = C0f9.A03(-434647096);
                C14360o3.A0B(c42281xI, 0);
                if (c42281xI.A00.CYY()) {
                    C2DU c2du = C2DU.this;
                    ((Handler) c2du.A0K.getValue()).post(new M4S(c2du, c42281xI));
                }
                C0f9.A0A(968057281, A032);
                C0f9.A0A(-1628960081, A03);
            }
        };
        this.A0O = interfaceC41501vz;
        this.A0D = new C2EV(this);
        this.A0G = new C2EW(userSession);
        this.A0P = ThreadMetadataOverrideStore.Companion.getInstance(userSession);
        this.A05 = C18U.A06(C06090Tz.A05, userSession, 36325291496322026L) ? AbstractC12220kQ.A02(userSession) : null;
        A00.A01(interfaceC41501vz, C42281xI.class);
        if (interfaceC37208GaJ != null) {
            interfaceC37208GaJ.start();
            interfaceC37208GaJ.ChV();
            C41761wQ.A00().A02(interfaceC37208GaJ.ANf(), new C24234Ap0(this));
        }
    }

    /* JADX WARN: Type inference failed for: r12v7, types: [X.JWO, java.lang.Object] */
    public static final C81663kb A01(C126455ng c126455ng, EnumC46982Dm enumC46982Dm, InterfaceC50443MOx interfaceC50443MOx, C2DU c2du, C4GV c4gv, C2EB c2eb, boolean z, boolean z2) {
        C81663kb c81663kb;
        C4GV c4gv2;
        ArrayList A03;
        Integer num;
        List emptyList;
        boolean booleanValue;
        C4H4 c4h4;
        List unmodifiableList;
        int i;
        List list = null;
        List list2 = null;
        List list3 = null;
        C11T.A05("This operation can't be run on UI thread.");
        DirectThreadKey directThreadKey = null;
        if (c4gv == null) {
            UserSession userSession = c2du.A0A;
            c81663kb = AbstractC81673kc.A00(userSession, c126455ng);
            c4gv2 = new C4GV(userSession, c81663kb, null);
        } else {
            c81663kb = c4gv.A0I;
            directThreadKey = c81663kb.BKb();
            AbstractC31407DrC.A00(c126455ng, c81663kb);
            c4gv2 = c4gv;
        }
        A0C(enumC46982Dm, c81663kb, c2du, c4gv2, c2eb, directThreadKey);
        C81663kb c81663kb2 = c4gv2.A0I;
        C14360o3.A07(c81663kb2);
        C83693oE A00 = AbstractC83823oR.A00(c81663kb2.BKb());
        boolean z3 = false;
        List list4 = null;
        if (interfaceC50443MOx != null) {
            JWO jwo = JWO.A00;
            JWO jwo2 = jwo;
            if (jwo == null) {
                ?? obj = new Object();
                JWO.A00 = obj;
                jwo2 = obj;
            }
            Context context = c2du.A0M;
            UserSession userSession2 = c2du.A0A;
            C43707JUs c43707JUs = (C43707JUs) interfaceC50443MOx;
            jwo2.A01(context, userSession2, c4gv, A00, c43707JUs.A06, c126455ng.A0I);
            C2DV.A00(userSession2, c81663kb2, interfaceC50443MOx);
            synchronized (c4gv2) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                K8O k8o = c43707JUs.A01;
                if (k8o != null) {
                    emptyList = k8o.A04;
                } else {
                    emptyList = Collections.emptyList();
                }
                ArrayList arrayList5 = new ArrayList(emptyList);
                Comparator comparator = C93394Gs.A04;
                Collections.sort(arrayList5, comparator);
                ArrayList arrayList6 = new ArrayList(c43707JUs.A06);
                Collections.sort(arrayList6, comparator);
                ArrayList arrayList7 = new ArrayList(c43707JUs.A07);
                Collections.sort(arrayList7, comparator);
                List A02 = AnonymousClass483.A02(comparator, arrayList6, arrayList7);
                ArrayList A022 = AnonymousClass483.A02(comparator, arrayList5, A02);
                C83403nh c83403nh = c43707JUs.A00;
                if (c83403nh != null) {
                    A022 = AnonymousClass483.A02(comparator, A022, Collections.singletonList(c83403nh));
                }
                String str = c43707JUs.A05;
                boolean CLR = interfaceC50443MOx.CLR();
                C93404Gt c93404Gt = C93404Gt.A00;
                String A01 = C93404Gt.A01(str, CLR, true);
                String str2 = c43707JUs.A04;
                Boolean bool = c43707JUs.A02;
                if (bool == null) {
                    booleanValue = false;
                } else {
                    booleanValue = bool.booleanValue();
                }
                C4H4 c4h42 = new C4H4(c93404Gt, A01, C93404Gt.A00(str2, booleanValue));
                if (k8o != null) {
                    c4h4 = C93394Gs.A02(k8o);
                } else {
                    c4h4 = new C4H4(c93404Gt, c93404Gt.A01, c93404Gt.A00);
                }
                if (!z2) {
                    c4h42 = c4h42.A00(c81663kb2.A04());
                    c4h4 = c4h4.A00(c81663kb2.A05());
                    A022 = AnonymousClass483.A02(comparator, A022, c4gv2.A0K);
                    A02 = C4H5.A03(c4h42, C93394Gs.A00, A022);
                }
                C4GV.A0D(c4gv2, c4gv2.A0K, A022, arrayList, arrayList2, arrayList3);
                C4GV.A07(c4h42, (C83403nh) AnonymousClass483.A00(c4gv2.A07, arrayList7), c81663kb2, A02);
                C4GV.A08(C4GV.A01(c4h4, c4h42), c81663kb2, A022);
                C4GV.A0B(c4gv2, arrayList, arrayList4);
                arrayList3.addAll(arrayList4);
                C4GV.A0A(c4gv2);
                c4gv2.A0T();
                c81663kb2.A07(0);
                list = Collections.unmodifiableList(arrayList);
                list2 = Collections.unmodifiableList(arrayList2);
                list3 = Collections.unmodifiableList(arrayList3);
                unmodifiableList = Collections.unmodifiableList(arrayList4);
            }
            z3 = true;
            boolean z4 = false;
            if (enumC46982Dm == EnumC46982Dm.A07) {
                z4 = true;
            }
            if (((Boolean) c81663kb2.A05.getValue()).booleanValue()) {
                ReentrantReadWriteLock reentrantReadWriteLock = c81663kb2.A03;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int i2 = 0;
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    i = reentrantReadWriteLock.getReadHoldCount();
                    for (int i3 = 0; i3 < i; i3++) {
                        readLock.unlock();
                    }
                } else {
                    i = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    c81663kb2.A01.A2i = z4;
                } finally {
                    while (i2 < i) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            } else {
                C80693iy c80693iy = c81663kb2.A01;
                synchronized (c80693iy) {
                    c80693iy.A2i = z4;
                }
            }
            c81663kb2.A0H(z);
            if (unmodifiableList != null) {
                A0H(c2du, A00, unmodifiableList, c81663kb2.C7g());
            }
            c2du.A09.accept(new C2Io(c81663kb2.BKb(), C05F.A0D, list, C4GV.A03(list2, false), list3, true));
        }
        C25671My c25671My = c2du.A06;
        DirectThreadKey BKb = c81663kb2.BKb();
        List list5 = null;
        if (!z3) {
            A03 = null;
            num = C05F.A0E;
        } else {
            list4 = list;
            A03 = C4GV.A03(list2, false);
            list5 = list3;
            num = C05F.A0D;
        }
        c25671My.E4s(new C2Io(BKb, num, list4, A03, list5, true));
        return c81663kb2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r0 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized X.C81663kb A06(java.lang.String r6, java.util.List r7) {
        /*
            r5 = this;
            r4 = r5
            monitor-enter(r4)
            java.lang.String r0 = "DirectThreadStoreImpl.getThread"
            X.0lu r3 = X.AbstractC13090lv.A00(r0)     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L10
            X.3kb r0 = r5.A0N(r6)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L23
        L10:
            java.lang.String r0 = "DirectThreadStoreImpl.getCanonicalThreadSummary"
            X.0lu r2 = X.AbstractC13090lv.A00(r0)     // Catch: java.lang.Throwable -> L2f
            r0 = 1
            X.4GV r1 = r5.A07(r7, r0)     // Catch: java.lang.Throwable -> L28
            r0 = 0
            if (r1 == 0) goto L20
            X.3kb r0 = r1.A0I     // Catch: java.lang.Throwable -> L28
        L20:
            r2.close()     // Catch: java.lang.Throwable -> L2f
        L23:
            r3.close()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r4)
            return r0
        L28:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L2a
        L2a:
            r0 = move-exception
            X.C20I.A00(r2, r1)     // Catch: java.lang.Throwable -> L2f
            throw r0     // Catch: java.lang.Throwable -> L2f
        L2f:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L31
        L31:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L33
        L33:
            r0 = move-exception
            X.C20I.A00(r3, r1)     // Catch: java.lang.Throwable -> L38
            throw r0     // Catch: java.lang.Throwable -> L38
        L38:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2DU.A06(java.lang.String, java.util.List):X.3kb");
    }

    private final synchronized C4GV A08(List list, boolean z) {
        C13080lu A00 = AbstractC13090lv.A00("DirectThreadStoreImpl.getThreadEntryBySortedUserIds");
        try {
            Iterator it = this.A0F.A08().iterator();
            while (it.hasNext()) {
                C4GV c4gv = (C4GV) ((Map.Entry) it.next()).getValue();
                C81663kb c81663kb = c4gv.A0I;
                C14360o3.A07(c81663kb);
                ArrayList A002 = DirectThreadKey.A00(c81663kb.BSH());
                Collections.sort(A002);
                if (C14360o3.A0K(list, A002) && (!z || c81663kb.CRD())) {
                    C81613kW Aic = c81663kb.Aic();
                    if (Aic == null || (Aic.A01 & 4) != 4) {
                        A00.close();
                        return c4gv;
                    }
                }
            }
            A00.close();
            return null;
        } finally {
        }
    }

    public static final synchronized void A0A(C2ED c2ed, C2DU c2du) {
        synchronized (c2du) {
            C4GV A0P = c2du.A0P(c2ed.BKb());
            if (A0P != null) {
                A0P.A0S();
                A0G(c2du, c2ed.BKb(), C05F.A06, true, true);
            }
        }
    }

    public static final synchronized void A0C(EnumC46982Dm enumC46982Dm, C81663kb c81663kb, C2DU c2du, C4GV c4gv, C2EB c2eb, DirectThreadKey directThreadKey) {
        int i;
        int i2;
        synchronized (c2du) {
            DirectThreadKey BKb = c81663kb.BKb();
            if (directThreadKey != null) {
                if (enumC46982Dm == EnumC46982Dm.A06) {
                    UserSession userSession = c2du.A0A;
                    if (C2E8.A00(userSession) || AbstractC1337462f.A0C(userSession, false)) {
                        C2EA c2ea = c2du.A0F;
                        ReentrantReadWriteLock reentrantReadWriteLock = c2ea.A02;
                        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                        int i3 = 0;
                        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                            i2 = reentrantReadWriteLock.getReadHoldCount();
                            for (int i4 = 0; i4 < i2; i4++) {
                                readLock.unlock();
                            }
                        } else {
                            i2 = 0;
                        }
                        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.lock();
                        try {
                            for (C2EB c2eb2 : C2EB.values()) {
                                java.util.Set set = C2EA.A00(c2ea, c2eb2).A00;
                                if (set.remove(directThreadKey)) {
                                    set.add(BKb);
                                }
                            }
                            C4GV A02 = C2EA.A02(c2ea, directThreadKey);
                            if (A02 != null) {
                                C2EA.A03(c2ea, A02, BKb);
                            }
                        } finally {
                            while (i3 < i2) {
                                readLock.lock();
                                i3++;
                            }
                            writeLock.unlock();
                        }
                    }
                }
                if (enumC46982Dm == EnumC46982Dm.A07 && AbstractC1337462f.A0A(c2du.A0A, false)) {
                    C2EA c2ea2 = c2du.A0F;
                    ReentrantReadWriteLock reentrantReadWriteLock2 = c2ea2.A02;
                    ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock2.readLock();
                    int i5 = 0;
                    if (reentrantReadWriteLock2.getWriteHoldCount() == 0) {
                        i = reentrantReadWriteLock2.getReadHoldCount();
                        for (int i6 = 0; i6 < i; i6++) {
                            readLock2.unlock();
                        }
                    } else {
                        i = 0;
                    }
                    ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
                    writeLock2.lock();
                    try {
                        Iterator it = C2EA.A06.iterator();
                        while (it.hasNext()) {
                            java.util.Set set2 = C2EA.A01(c2ea2, (C2EB) it.next()).A00;
                            if (set2.remove(directThreadKey)) {
                                set2.add(BKb);
                            }
                        }
                        C4GV A022 = C2EA.A02(c2ea2, directThreadKey);
                        if (A022 != null) {
                            C2EA.A03(c2ea2, A022, BKb);
                        }
                        while (i5 < i) {
                            readLock2.lock();
                            i5++;
                        }
                        writeLock2.unlock();
                    } catch (Throwable th) {
                        while (i5 < i) {
                            readLock2.lock();
                            i5++;
                        }
                        writeLock2.unlock();
                        throw th;
                    }
                } else {
                    c2du.A0F.A06(directThreadKey);
                }
            }
            c2du.A0F.A0C(enumC46982Dm, c4gv, c2eb, BKb);
            A0D(c81663kb, c2du);
            if (!c81663kb.isPending()) {
                c2du.A0E.A02(c81663kb);
            }
        }
    }

    public static final synchronized void A0G(C2DU c2du, DirectThreadKey directThreadKey, Integer num, boolean z, boolean z2) {
        synchronized (c2du) {
            C4GV A0P = c2du.A0P(directThreadKey);
            if (A0P != null) {
                C2Io c2Io = new C2Io(directThreadKey, num, null, null, null, z2);
                c2du.A06.E4s(c2Io);
                c2du.A09.accept(c2Io);
                if (z) {
                    A0F(c2du, A0P);
                }
            }
        }
    }

    public static final synchronized boolean A0L(C83403nh c83403nh, C2DU c2du, DirectThreadKey directThreadKey, boolean z) {
        boolean z2;
        synchronized (c2du) {
            C4GV A0P = c2du.A0P(directThreadKey);
            String A0h = c83403nh.A0h();
            z2 = false;
            if (A0P != null && A0h != null && A0P.A0I(A0h) == null) {
                c2du.A9n(c83403nh, directThreadKey, true, z);
                if (A0P.A0I(A0h) == c83403nh) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final synchronized C81663kb A0M(C126455ng c126455ng, boolean z) {
        C81663kb A01;
        EnumC46982Dm enumC46982Dm = c126455ng.A0q;
        A0B(c126455ng, this, "update");
        A01 = A01(c126455ng, enumC46982Dm, null, this, A0O(c126455ng), C2EB.A04, false, false);
        C46922Dg c46922Dg = this.A0C;
        c46922Dg.A0Q(A01, true, true, false);
        C5G2 c5g2 = this.A0B;
        if (c5g2 != null) {
            int i = c126455ng.A07;
            String str = c126455ng.A1E;
            if (i == 1) {
                if (str != null) {
                    c5g2.A03.add(str);
                }
            } else if (str != null) {
                c5g2.A03.remove(str);
            }
        }
        if (z) {
            c46922Dg.A0R(enumC46982Dm);
        }
        return A01;
    }

    public final synchronized C4GV A0O(C126455ng c126455ng) {
        C4GV A04;
        boolean booleanValue;
        C81613kW c81613kW;
        C14360o3.A0B(c126455ng, 0);
        A04 = this.A0F.A04(new DirectThreadKey(c126455ng.A1E));
        if (A04 == null) {
            Boolean bool = c126455ng.A11;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                booleanValue = false;
            }
            if (booleanValue) {
                String str = c126455ng.A1E;
                C14360o3.A07(str);
                if (str.length() > 0) {
                    A04 = null;
                }
            }
            if (c126455ng.A1e && ((c81613kW = c126455ng.A0a) == null || (c81613kW.A01 & 4) != 4)) {
                List unmodifiableList = Collections.unmodifiableList(c126455ng.A1d);
                C14360o3.A07(unmodifiableList);
                A04 = A07(C4GO.A01(unmodifiableList), true);
            }
            A04 = null;
        }
        return A04;
    }

    public final C4GV A0P(DirectThreadKey directThreadKey) {
        C4GV A05;
        C14360o3.A0B(directThreadKey, 0);
        if (A0K()) {
            return this.A0F.A05(directThreadKey);
        }
        synchronized (this) {
            A05 = this.A0F.A05(directThreadKey);
        }
        return A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x01c4, code lost:
    
        if (r4 == 1000) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01d3, code lost:
    
        if (r2.AvH() == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0213, code lost:
    
        if (r0.A00 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
    
        if (r3 == 1000) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0115, code lost:
    
        if (r0 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0104, code lost:
    
        if (r0 != false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x021c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A0Q(X.C2EB r21, X.C4I3 r22, java.util.Comparator r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2DU.A0Q(X.2EB, X.4I3, java.util.Comparator, java.util.List):java.util.ArrayList");
    }

    public final synchronized List A0S(C81663kb c81663kb, List list, boolean z) {
        List list2;
        if (c81663kb == null) {
            list2 = C16930sl.A00;
        } else {
            C4GV A0P = A0P(c81663kb.BKb());
            if (A0P != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C83403nh A0G = A0P.A0G((C83403nh) it.next(), true, false);
                    C14360o3.A07(A0G);
                    if (A0G.A1U()) {
                        arrayList2.add(new C9Q7(A0G.A10, false, C05F.A00, A0G.A0h()));
                    } else {
                        arrayList.add(A0G);
                    }
                }
                if (!z) {
                    DirectThreadKey BKb = c81663kb.BKb();
                    UserSession userSession = this.A0A;
                    String str = c81663kb.BKb().A00;
                    if (str == null) {
                        str = "";
                    }
                    AbstractC161587Lt.A02(userSession, BKb, str, arrayList);
                }
                C2Io c2Io = new C2Io(c81663kb.BKb(), C05F.A0N, null, arrayList2, arrayList, false);
                this.A06.E4s(c2Io);
                this.A09.accept(c2Io);
                EnumC46982Dm C4i = c81663kb.C4i();
                C14360o3.A07(C4i);
                this.A0C.A0R(C4i);
                list2 = arrayList;
            } else {
                throw new IllegalStateException("directThreadEntry should not be null");
            }
        }
        return list2;
    }

    public final synchronized void A0T(C4GV c4gv, DirectThreadKey directThreadKey) {
        C81663kb c81663kb = c4gv.A0I;
        EnumC46982Dm C4i = c81663kb.C4i();
        UserSession userSession = this.A0A;
        if (!C18U.A06(C06090Tz.A05, userSession, 36330033140417160L) || !this.A0F.A0F(directThreadKey)) {
            if (C4i == EnumC46982Dm.A06 && C2E8.A00(userSession)) {
                c81663kb.A0H(A0V(C4i, directThreadKey.A00, c4gv.A0M(false)));
            }
            C2EA c2ea = this.A0F;
            C14360o3.A0A(C4i);
            c2ea.A0C(C4i, c4gv, C2EB.A04, directThreadKey);
            if ((C4i == EnumC46982Dm.A05 || C4i == EnumC46982Dm.A04) && !c81663kb.isPending()) {
                this.A0E.A02(c81663kb);
            }
        }
    }

    public final synchronized void A0U(DirectThreadKey directThreadKey) {
        int i;
        C4GV A0P = A0P(directThreadKey);
        if (A0P != null) {
            C81663kb c81663kb = A0P.A0I;
            C14360o3.A07(c81663kb);
            if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
                ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int i2 = 0;
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    i = reentrantReadWriteLock.getReadHoldCount();
                    for (int i3 = 0; i3 < i; i3++) {
                        readLock.unlock();
                    }
                } else {
                    i = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    c81663kb.A01.A0F = 0;
                    DirectThreadKey BKb = c81663kb.BKb();
                    EnumC46982Dm C4i = c81663kb.C4i();
                    C14360o3.A07(C4i);
                    A0C(C4i, c81663kb, this, A0P, C2EB.A04, BKb);
                    AbstractC25651Mw.A00(this.A0A).E4s(new C2Io(directThreadKey, C05F.A07, null, null, null, false));
                } finally {
                    while (i2 < i) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            } else {
                C80693iy c80693iy = c81663kb.A01;
                synchronized (c80693iy) {
                    try {
                        c80693iy.A0F = 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                DirectThreadKey BKb2 = c81663kb.BKb();
                EnumC46982Dm C4i2 = c81663kb.C4i();
                C14360o3.A07(C4i2);
                A0C(C4i2, c81663kb, this, A0P, C2EB.A04, BKb2);
                AbstractC25651Mw.A00(this.A0A).E4s(new C2Io(directThreadKey, C05F.A07, null, null, null, false));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4.A05, 36311912675214140L) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0V(X.EnumC46982Dm r12, java.lang.String r13, java.util.List r14) {
        /*
            r11 = this;
            r7 = 0
            r1 = 1
            X.C14360o3.A0B(r14, r1)
            X.2Dm r0 = X.EnumC46982Dm.A06
            r10 = 0
            if (r12 != r0) goto L56
            com.instagram.common.session.UserSession r5 = r11.A0A
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager r4 = X.AbstractC2042992d.A00(r5)
            if (r4 == 0) goto L56
            boolean r0 = r4.A08()
            if (r0 != r1) goto L56
            boolean r0 = r4.A02
            if (r0 != 0) goto L33
            java.util.Set r0 = r4.A0D
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4d
            com.instagram.common.session.UserSession r3 = r4.A05
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36311912675214140(0x81017e001f033c, double:3.02713801991707E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L4d
        L33:
            X.9Bv r0 = new X.9Bv
            r0.<init>()
        L38:
            boolean r9 = r0.A00
            java.lang.String r8 = r0.A02
            r6 = r13
            if (r13 == 0) goto L4c
            X.3kb r0 = r11.A0N(r13)
            if (r0 == 0) goto L49
            boolean r10 = r0.CVQ()
        L49:
            X.C162337Ov.A0q(r5, r6, r7, r8, r9, r10)
        L4c:
            return r9
        L4d:
            X.0e4 r0 = com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager.A04(r4, r14)
            java.lang.Object r0 = r0.A01
            X.9Bv r0 = (X.C206389Bv) r0
            goto L38
        L56:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2DU.A0V(X.2Dm, java.lang.String, java.util.List):boolean");
    }

    @Override // X.C2DS
    public final synchronized void A7C(DirectThreadKey directThreadKey) {
        ReentrantReadWriteLock.ReadLock readLock;
        int i;
        ReentrantReadWriteLock.WriteLock writeLock;
        C43777JXq A00;
        C81663kb c81663kb;
        int i2;
        C14360o3.A0B(directThreadKey, 0);
        C4GV A0P = A0P(directThreadKey);
        if (A0P != null && (c81663kb = A0P.A0I) != null) {
            if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
                ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
                readLock = reentrantReadWriteLock.readLock();
                int i3 = 0;
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    i2 = reentrantReadWriteLock.getReadHoldCount();
                    for (int i4 = 0; i4 < i2; i4++) {
                        readLock.unlock();
                    }
                } else {
                    i2 = 0;
                }
                writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    c81663kb.A01.A2g = false;
                } finally {
                    while (i3 < i) {
                        readLock.lock();
                        i3++;
                    }
                    writeLock.unlock();
                }
            } else {
                C80693iy c80693iy = c81663kb.A01;
                synchronized (c80693iy) {
                    try {
                        c80693iy.A2g = false;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        C2EA c2ea = this.A0F;
        ReentrantReadWriteLock reentrantReadWriteLock2 = c2ea.A02;
        readLock = reentrantReadWriteLock2.readLock();
        int i5 = 0;
        if (reentrantReadWriteLock2.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock2.getReadHoldCount();
            for (int i6 = 0; i6 < i; i6++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        writeLock = reentrantReadWriteLock2.writeLock();
        writeLock.lock();
        try {
            c2ea.A09(EnumC46982Dm.A05, C2EB.A04).add(directThreadKey);
            for (C2EB c2eb : C2EB.values()) {
                C2EA.A00(c2ea, c2eb).A00.remove(directThreadKey);
            }
            while (i5 < i) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
            String str = directThreadKey.A00;
            if (str != null && (A00 = JYM.A00(this.A0A, EnumC132075xi.A0E)) != null) {
                A00.A00(str);
            }
            FCS(directThreadKey);
        } finally {
            while (i5 < i) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
        }
    }

    @Override // X.C2DS
    public final synchronized boolean A8E(C83403nh c83403nh, DirectThreadKey directThreadKey) {
        C14360o3.A0B(c83403nh, 1);
        return A0L(c83403nh, this, directThreadKey, true);
    }

    @Override // X.C2DS
    public final synchronized void A8i(DirectThreadKey directThreadKey, boolean z) {
        C4GV A0P = A0P(directThreadKey);
        if (A0P != null) {
            C81663kb c81663kb = A0P.A0I;
            C14360o3.A07(c81663kb);
            c81663kb.A01.A2P = z;
            FCS(directThreadKey);
        }
    }

    @Override // X.C2DS
    public final synchronized void A8w(DirectThreadKey directThreadKey, String str) {
        C4GV A0P = A0P(directThreadKey);
        if (A0P != null) {
            C81663kb c81663kb = A0P.A0I;
            C14360o3.A07(c81663kb);
            c81663kb.A01.A1m = str;
            FCS(directThreadKey);
        }
    }

    @Override // X.C2DS
    public final synchronized void A9l(C83403nh c83403nh, DirectThreadKey directThreadKey, boolean z) {
        A9n(c83403nh, directThreadKey, z, true);
    }

    @Override // X.C2DS
    public final void AF1(C2ED c2ed, String str, String str2) {
        boolean A01;
        int i;
        C81663kb c81663kb = (C81663kb) c2ed;
        if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i2 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
                for (int i3 = 0; i3 < i; i3++) {
                    readLock.unlock();
                }
            } else {
                i = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                C80693iy c80693iy = c81663kb.A01;
                C51755Mte c51755Mte = c80693iy.A0W;
                if (c51755Mte == null) {
                    c51755Mte = new C51755Mte((C50679MYx) null, (DefaultConstructorMarker) null, 1, 16);
                }
                if (c51755Mte == null) {
                    c80693iy.A0W = c51755Mte;
                }
                A01 = c51755Mte.A01(str, str2);
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        } else {
            C80693iy c80693iy2 = c81663kb.A01;
            synchronized (c80693iy2) {
                C51755Mte c51755Mte2 = c80693iy2.A0W;
                if (c51755Mte2 == null) {
                    c51755Mte2 = new C51755Mte((C50679MYx) null, (DefaultConstructorMarker) null, 1, 16);
                }
                if (c51755Mte2 == null) {
                    c80693iy2.A0W = c51755Mte2;
                }
                A01 = c51755Mte2.A01(str, str2);
            }
        }
        if (A01) {
            FCS(c2ed.BKb());
            C28741aC c28741aC = this.A0H;
            c28741aC.A02.ATO(new KM1(c28741aC, c2ed.BKb()));
        }
    }

    @Override // X.C2DS
    public final synchronized void AVL(String str, java.util.Set set, java.util.Set set2) {
        if (str.length() == 0) {
            Iterator it = this.A0F.A07(EnumC46982Dm.A05, C2EB.A04).iterator();
            while (it.hasNext()) {
                C81663kb c81663kb = ((C4GV) it.next()).A0I;
                C14360o3.A07(c81663kb);
                if (c81663kb.CZH()) {
                    set.add(c81663kb);
                } else {
                    set2.add(c81663kb);
                }
            }
        } else {
            C2EM c2em = this.A0E;
            java.util.Set<C2EC> set3 = (java.util.Set) c2em.A01[Character.toLowerCase(str.charAt(0)) % 30];
            if (set3 != null) {
                for (C2EC c2ec : set3) {
                    C14360o3.A0A(c2ec);
                    if (c2ec.CZH()) {
                        String C7l = c2ec.C7l();
                        C14360o3.A0A(C7l);
                        if (AbstractC13670mt.A0H(C7l, str)) {
                            set.add(c2ec);
                        }
                    }
                    for (User user : c2ec.BSH()) {
                        String username = user.getUsername();
                        String fullName = user.A03.getFullName();
                        if (AbstractC13670mt.A0I(username, str, 0) || (fullName != null && fullName.length() != 0 && AbstractC13670mt.A0H(fullName, str))) {
                            set2.add(c2ec);
                            break;
                        }
                    }
                }
            }
        }
    }

    @Override // X.C2DS
    public final ArrayList Ab7(DirectThreadKey directThreadKey, boolean z) {
        ArrayList arrayList;
        C14360o3.A0B(directThreadKey, 0);
        if (A0K()) {
            C4GV A0P = A0P(directThreadKey);
            if (A0P != null) {
                return A0P.A0M(z);
            }
            return new ArrayList();
        }
        synchronized (this) {
            C4GV A0P2 = A0P(directThreadKey);
            if (A0P2 != null) {
                arrayList = A0P2.A0M(z);
            } else {
                arrayList = new ArrayList();
            }
        }
        return arrayList;
    }

    @Override // X.C2DS
    public final synchronized AbstractC80713j1 Asr(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                abstractC80713j1 = A00.A01.A14;
                C14360o3.A06(abstractC80713j1);
            } finally {
                readLock.unlock();
            }
        } else {
            C80693iy c80693iy = A00.A01;
            synchronized (c80693iy) {
                try {
                    abstractC80713j1 = c80693iy.A14;
                    C14360o3.A06(abstractC80713j1);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final C81663kb B3U(DirectThreadKey directThreadKey) {
        C14360o3.A0B(directThreadKey, 0);
        return A03(this, directThreadKey);
    }

    @Override // X.C2DS
    public final synchronized C81663kb B3V(long j) {
        C81663kb c81663kb;
        Iterator it = this.A0F.A08().iterator();
        while (true) {
            if (it.hasNext()) {
                c81663kb = ((C4GV) ((Map.Entry) it.next()).getValue()).A0I;
                C14360o3.A07(c81663kb);
                Long C7O = c81663kb.C7O();
                if (C7O != null && j == C7O.longValue() && c81663kb.C7I() != null) {
                    break;
                }
            } else {
                c81663kb = null;
                break;
            }
        }
        return c81663kb;
    }

    @Override // X.C2DS
    public final synchronized C81663kb B3W(List list) {
        C81663kb c81663kb;
        C4GV A07 = A07(list, false);
        if (A07 != null) {
            c81663kb = A07.A0I;
        } else {
            c81663kb = null;
        }
        return c81663kb;
    }

    @Override // X.C2DS
    public final synchronized C83403nh BM0(DirectThreadKey directThreadKey) {
        C83403nh c83403nh;
        C14360o3.A0B(directThreadKey, 0);
        C4GV A0P = A0P(directThreadKey);
        if (A0P != null) {
            c83403nh = (C83403nh) AnonymousClass483.A01(A0P.A02, A0P.A0K);
        } else {
            c83403nh = null;
        }
        return c83403nh;
    }

    @Override // X.C2DS
    public final synchronized C83403nh BSf(DirectThreadKey directThreadKey, C2EY c2ey, String str) {
        C83403nh c83403nh;
        C14360o3.A0B(directThreadKey, 0);
        C4GV A0P = A0P(directThreadKey);
        if (A0P != null) {
            c83403nh = A0P.A0H(c2ey, str);
        } else {
            c83403nh = null;
        }
        return c83403nh;
    }

    @Override // X.C2DS
    public final synchronized C83403nh BSg(DirectThreadKey directThreadKey, String str) {
        C83403nh c83403nh;
        C14360o3.A0B(directThreadKey, 0);
        C14360o3.A0B(str, 1);
        C4GV A0P = A0P(directThreadKey);
        if (A0P != null) {
            c83403nh = A0P.A0J(str);
        } else {
            c83403nh = null;
        }
        return c83403nh;
    }

    @Override // X.C2DS
    public final synchronized C83403nh BSh(DirectThreadKey directThreadKey, String str) {
        C83403nh c83403nh;
        C14360o3.A0B(directThreadKey, 0);
        C4GV A0P = A0P(directThreadKey);
        if (A0P != null && str != null) {
            c83403nh = A0P.A0I(str);
        } else {
            c83403nh = null;
        }
        return c83403nh;
    }

    @Override // X.C2DS
    public final synchronized List BTB(InterfaceC28041Xi interfaceC28041Xi, DirectThreadKey directThreadKey, String str) {
        List list;
        C4H4 A04;
        C14360o3.A0B(interfaceC28041Xi, 1);
        C4GV A0P = A0P(directThreadKey);
        if (A0P != null) {
            synchronized (A0P) {
                if (str != null) {
                    C4H4 A042 = A0P.A0I.A04();
                    A04 = new C4H4(A042.A00, str, A042.A01);
                } else {
                    A04 = A0P.A0I.A04();
                }
                list = AnonymousClass483.A03(interfaceC28041Xi, C4H5.A03(A04, C93394Gs.A00, A0P.A0K));
            }
        } else {
            list = null;
        }
        return list;
    }

    @Override // X.C2DS
    public final synchronized Long BX2(DirectThreadKey directThreadKey) {
        Long l;
        C133205zm BIW;
        Long l2;
        long micros;
        Long valueOf;
        C1118752z Ay9;
        Long l3;
        C14360o3.A0B(directThreadKey, 0);
        C4GV A0P = A0P(directThreadKey);
        if (A0P == null) {
            l = null;
        } else {
            synchronized (A0P) {
                List A04 = C4GV.A04(A0P);
                C14360o3.A0B(A04, 0);
                C83403nh c83403nh = (C83403nh) AbstractC001800i.A0L(A04);
                if (c83403nh != null) {
                    l = Long.valueOf(c83403nh.C8i());
                } else {
                    l = null;
                }
            }
            UserSession userSession = this.A0A;
            C81663kb c81663kb = A0P.A0I;
            C14360o3.A07(c81663kb);
            if (C6X6.A0Q(userSession, c81663kb) && (Ay9 = c81663kb.Ay9()) != null && (l3 = Ay9.A05) != null) {
                long micros2 = TimeUnit.MILLISECONDS.toMicros(l3.longValue());
                if (l == null || micros2 > l.longValue()) {
                    l = Long.valueOf(micros2);
                }
            }
            if (C18U.A06(C06090Tz.A05, C4KS.A00(userSession).A00, 2342165362954152112L) && (BIW = c81663kb.BIW()) != null && (l2 = BIW.A00) != null && (valueOf = Long.valueOf((micros = TimeUnit.MILLISECONDS.toMicros(l2.longValue())))) != null && (l == null || micros > l.longValue())) {
                l = valueOf;
            }
        }
        return l;
    }

    @Override // X.C2DS
    public final /* bridge */ /* synthetic */ C81663kb BZQ(DirectShareTarget directShareTarget) {
        C83693oE c83693oE;
        C14360o3.A0B(directShareTarget, 0);
        InterfaceC83713oG A01 = directShareTarget.A01();
        String str = null;
        if ((A01 instanceof C83693oE) && (c83693oE = (C83693oE) A01) != null) {
            str = c83693oE.A00;
        }
        List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
        C14360o3.A07(unmodifiableList);
        String str2 = directShareTarget.A0I;
        if (str2 == null) {
            str2 = "";
        }
        return A02(directShareTarget.A04, str, str2, unmodifiableList, directShareTarget.A0R);
    }

    @Override // X.C2DS
    public final /* bridge */ /* synthetic */ C81663kb BZR(CreatorBroadcastThreadInfo creatorBroadcastThreadInfo, String str, String str2, List list) {
        C14360o3.A0B(list, 1);
        return A02(creatorBroadcastThreadInfo, str, str2, list, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    @Override // X.C2DS
    public final List Bkx(DirectThreadKey directThreadKey, boolean z) {
        ArrayList arrayList;
        C14360o3.A0B(directThreadKey, 0);
        if (A0K()) {
            ArrayList Ab7 = Ab7(directThreadKey, true);
            if (Ab7.size() > 20) {
                int size = Ab7.size();
                return Ab7.subList(size - 20, size);
            }
            return Ab7;
        }
        synchronized (this) {
            ArrayList Ab72 = Ab7(directThreadKey, true);
            int size2 = Ab72.size();
            arrayList = Ab72;
            if (size2 > 20) {
                int size3 = Ab72.size();
                arrayList = Ab72.subList(size3 - 20, size3);
            }
        }
        return arrayList;
    }

    @Override // X.C2DS
    public final synchronized HashSet Bkz() {
        HashSet hashSet;
        List singletonList = Collections.singletonList(C47032Dr.A00);
        C14360o3.A07(singletonList);
        C2EB c2eb = C2EB.A04;
        ArrayList A0Q = A0Q(c2eb, C4I3.A03, c2eb.A01, singletonList);
        hashSet = new HashSet();
        if (A0Q.size() <= 20) {
            Iterator it = A0Q.iterator();
            while (it.hasNext()) {
                hashSet.add(((C81663kb) it.next()).BKb());
            }
        } else {
            Iterator it2 = A0Q.subList(0, 20).iterator();
            while (it2.hasNext()) {
                hashSet.add(((C81663kb) it2.next()).BKb());
            }
        }
        return hashSet;
    }

    @Override // X.C2DS
    public final synchronized ArrayList Bn1(DirectThreadKey directThreadKey, String str) {
        ArrayList arrayList;
        C14360o3.A0B(directThreadKey, 0);
        arrayList = new ArrayList();
        Iterator it = Ab7(directThreadKey, false).iterator();
        while (it.hasNext()) {
            C83403nh c83403nh = (C83403nh) it.next();
            AnonymousClass442 A0P = c83403nh.A0P();
            if (A0P != null && (C14360o3.A0K(A0P.A0T, str) || C14360o3.A0K(A0P.A0R, str))) {
                arrayList.add(c83403nh);
            }
        }
        return arrayList;
    }

    @Override // X.C2DS
    public final synchronized List Byz(C2EB c2eb) {
        List unmodifiableList;
        C14360o3.A0B(c2eb, 0);
        List singletonList = Collections.singletonList(C2057398y.A00);
        C14360o3.A07(singletonList);
        unmodifiableList = Collections.unmodifiableList(A0Q(c2eb, C4I3.A03, c2eb.A01, singletonList));
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }

    @Override // X.C2DS
    public final C81663kb C76(String str) {
        C14360o3.A0B(str, 0);
        C13080lu A00 = AbstractC13090lv.A00("DirectThreadStoreImpl.getThread");
        try {
            C81663kb A0N = A0N(str);
            A00.close();
            return A0N;
        } finally {
        }
    }

    @Override // X.C2DS
    public final synchronized Map CCx() {
        Map unmodifiableMap;
        HashMap hashMap = new HashMap();
        Iterator it = this.A0F.A08().iterator();
        while (it.hasNext()) {
            C4GV c4gv = (C4GV) ((Map.Entry) it.next()).getValue();
            if (c4gv != null) {
                List A0N = c4gv.A0N();
                C14360o3.A07(A0N);
                if (!A0N.isEmpty()) {
                    hashMap.put(c4gv.A0I, A0N);
                }
            }
        }
        unmodifiableMap = Collections.unmodifiableMap(hashMap);
        C14360o3.A07(unmodifiableMap);
        return unmodifiableMap;
    }

    @Override // X.C2DS
    public final synchronized List CCz(DirectThreadKey directThreadKey, String str) {
        List list;
        C4H4 A05;
        C14360o3.A0B(directThreadKey, 0);
        C4GV A0P = A0P(directThreadKey);
        if (A0P != null) {
            synchronized (A0P) {
                if (str != null) {
                    C4H4 A052 = A0P.A0I.A05();
                    A05 = new C4H4(A052.A00, str, A052.A01);
                } else {
                    A05 = A0P.A0I.A05();
                }
                list = AnonymousClass483.A03(A0P.A0C, C4H5.A03(A05, C93394Gs.A00, A0P.A0K));
            }
        } else {
            list = null;
        }
        return list;
    }

    @Override // X.C2DS
    public final synchronized List CGt(DirectThreadKey directThreadKey, String str) {
        ArrayList arrayList;
        C4GV A0P = A0P(directThreadKey);
        if (A0P != null) {
            synchronized (A0P) {
                List A03 = C4H5.A03(A0P.A0I.A05(), C93394Gs.A00, A0P.A0K);
                C14360o3.A0B(A03, 0);
                arrayList = new ArrayList();
                for (Object obj : A03) {
                    if (((C83403nh) obj).A1g(A0P.A0H, str)) {
                        arrayList.add(obj);
                    }
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList;
    }

    @Override // X.C2DS
    public final void CoS(String str) {
        C14360o3.A0B(str, 0);
        A0I(this, true, false);
        C43986JcZ c43986JcZ = this.A02;
        if (c43986JcZ != null) {
            if (C18U.A06(C06090Tz.A05, this.A0A, 36322516947904791L)) {
                C69613Av c69613Av = c43986JcZ.A00;
                if (c69613Av != null) {
                    c69613Av.A08(null);
                }
                this.A0H.A00 = new C47420KxB(this);
            }
        }
        this.A0H.A0J(false, str);
        A0I(this, false, false);
    }

    @Override // X.C2DS
    public final synchronized void EFl(DirectThreadKey directThreadKey, String str, String str2) {
        C14360o3.A0B(directThreadKey, 0);
        EFm(directThreadKey, C05F.A00, str, str2, true);
    }

    @Override // X.C2DS
    public final synchronized void EFm(DirectThreadKey directThreadKey, Integer num, String str, String str2, boolean z) {
        String str3;
        Boolean bool;
        C83403nh A0I;
        C14360o3.A0B(directThreadKey, 0);
        C4GV A0P = A0P(directThreadKey);
        if (str == null) {
            if (str2 != null) {
                str3 = str2;
            } else {
                throw new IllegalStateException("Client context should not be null if messageId is null.");
            }
        } else {
            str3 = str;
        }
        if (A0P != null) {
            C2EY c2ey = null;
            if (str != null && (A0I = A0P.A0I(str)) != null) {
                boolean z2 = false;
                if (!A0I.A1j(C17060sy.A01.A01(this.A0A))) {
                    z2 = true;
                }
                bool = Boolean.valueOf(z2);
                c2ey = A0I.A10;
            } else {
                bool = null;
            }
            C9Q7 c9q7 = new C9Q7(c2ey, bool, num, str3);
            A0P.A0U(str3);
            C28741aC c28741aC = this.A0H;
            c28741aC.A02.ATO(new KMN(c28741aC, directThreadKey, str, str2));
            List singletonList = Collections.singletonList(c9q7);
            C14360o3.A07(singletonList);
            C2Io c2Io = new C2Io(directThreadKey, C05F.A0Y, null, singletonList, null, true);
            this.A06.E4s(c2Io);
            this.A09.accept(c2Io);
            if (z) {
                A0F(this, A0P);
            }
        }
    }

    @Override // X.C2DS
    public final synchronized void EGR(DirectThreadKey directThreadKey, boolean z, boolean z2) {
        C43777JXq A00;
        C14360o3.A0B(directThreadKey, 0);
        C2EA c2ea = this.A0F;
        C4GV A06 = c2ea.A06(directThreadKey);
        ArrayList arrayList = new ArrayList();
        if (A06 != null) {
            C81663kb c81663kb = A06.A0I;
            EnumC46982Dm C4i = c81663kb.C4i();
            C14360o3.A07(C4i);
            arrayList.add(C4i);
            A0D(c81663kb, this);
        }
        Iterator it = c2ea.A08().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            DirectThreadKey directThreadKey2 = (DirectThreadKey) entry.getKey();
            C81663kb c81663kb2 = ((C4GV) entry.getValue()).A0I;
            C14360o3.A07(c81663kb2);
            if (C14360o3.A0K(c81663kb2.BKb(), directThreadKey)) {
                c2ea.A06(directThreadKey2);
                A0D(c81663kb2, this);
                EnumC46982Dm C4i2 = c81663kb2.C4i();
                C14360o3.A07(C4i2);
                arrayList.add(C4i2);
                break;
            }
        }
        List list = null;
        if (A06 != null) {
            list = A06.A0I.BSF();
        }
        UserSession userSession = this.A0A;
        AbstractC22714A0k.A00(userSession, directThreadKey.A00);
        String str = directThreadKey.A00;
        if (str != null && (A00 = JYM.A00(userSession, EnumC132075xi.A0E)) != null) {
            A00.A00(str);
        }
        if (z2) {
            C28741aC c28741aC = this.A0H;
            c28741aC.A02.ATO(new KM0(c28741aC, directThreadKey));
        }
        C25671My c25671My = this.A06;
        String str2 = directThreadKey.A00;
        if (str2 != null) {
            c25671My.E4s(new C48032Iq(new C83693oE(str2), list));
            if (A06 != null) {
                C46922Dg c46922Dg = this.A0C;
                C81663kb c81663kb3 = A06.A0I;
                C14360o3.A07(c81663kb3);
                c46922Dg.A0Q(c81663kb3, false, false, true);
            }
            if (z) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    this.A0C.A0R((EnumC46982Dm) it2.next());
                }
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.C2DS
    public final synchronized void EYs(DirectMessageIdentifier directMessageIdentifier, InterfaceC83713oG interfaceC83713oG, Integer num, String str) {
        C83403nh A0J;
        C14360o3.A0B(interfaceC83713oG, 0);
        String str2 = directMessageIdentifier.A02;
        if ((str2 != null || directMessageIdentifier.A00 != null) && str != null && num != null) {
            C4GV A0P = A0P(AbstractC140956Yx.A01(AbstractC140946Yw.A01(interfaceC83713oG)));
            if (A0P == null) {
                C0w9.A03("Null thread entry", "Entry should exist before function call");
            } else {
                synchronized (A0P) {
                    if (str2 != null) {
                        A0J = A0P.A0I(str2);
                    } else {
                        String str3 = directMessageIdentifier.A00;
                        if (str3 != null) {
                            A0J = A0P.A0J(str3);
                        }
                        C18950wb.A00.AEp("Message is missing from thread entry", 20134884).report();
                    }
                    if (A0J != null) {
                        if (num.intValue() == -1) {
                            C18950wb.A00.AEp("Incorrect/insufficient data to update the thread entry", 20134884).report();
                        } else {
                            A0J.A1J(str, num);
                            this.A06.E4s(new C2Io(A0P.A0I.BKb(), C05F.A0M, null, null, Collections.singletonList(A0J), false));
                        }
                    }
                    C18950wb.A00.AEp("Message is missing from thread entry", 20134884).report();
                }
            }
        }
    }

    @Override // X.C2DS
    public final synchronized void EZ5(C206209Bd c206209Bd, DirectThreadKey directThreadKey, String str) {
        C2Io c2Io;
        C4GV A0P = A0P(directThreadKey);
        if (A0P == null) {
            C0w9.A03("Null thread entry", "Entry should exist before function call");
        } else {
            synchronized (A0P) {
                C83403nh A0I = A0P.A0I(str);
                if (A0I == null) {
                    C18950wb.A00.AEp("Message is missing from thread entry", 20134884);
                    c2Io = null;
                } else {
                    synchronized (A0I) {
                        if (!AbstractC50102Ry.A00(c206209Bd, A0I.A05)) {
                            A0I.A05 = c206209Bd;
                            A0I.A2C = true;
                        }
                    }
                    c2Io = new C2Io(A0P.A0I.BKb(), C05F.A0C, null, null, Collections.singletonList(A0I), false);
                }
            }
            if (c2Io != null) {
                this.A06.E4s(c2Io);
            }
        }
    }

    @Override // X.C2DS
    public final synchronized void EaV(DirectThreadKey directThreadKey, String str, boolean z) {
        C2Io c2Io;
        C4GV A0P = A0P(directThreadKey);
        if (A0P == null) {
            C0w9.A03("Null thread entry", "Entry should exist before function call");
        } else {
            synchronized (A0P) {
                C83403nh A0I = A0P.A0I(str);
                if (A0I == null) {
                    C18950wb.A00.AEp("Message is missing from thread entry", 20134884);
                    c2Io = null;
                } else {
                    synchronized (A0I) {
                        C9B5 c9b5 = A0I.A04;
                        if (c9b5 != null) {
                            c9b5.A00 = z;
                        } else {
                            A0I.A04 = new C9B5(z, 2);
                        }
                    }
                    c2Io = new C2Io(A0P.A0I.BKb(), C05F.A0C, null, null, Collections.singletonList(A0I), false);
                }
            }
            if (c2Io != null) {
                this.A06.E4s(c2Io);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r13.intValue() != 3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r13.intValue() == 3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d0, code lost:
    
        if (r13.intValue() != 3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c7, code lost:
    
        if (r13.intValue() == 3) goto L56;
     */
    @Override // X.C2DS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void Efj(com.instagram.model.direct.DirectThreadKey r12, java.lang.Integer r13, java.lang.Integer r14) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2DU.Efj(com.instagram.model.direct.DirectThreadKey, java.lang.Integer, java.lang.Integer):void");
    }

    @Override // X.C2DS
    public final synchronized void Ego(DirectThreadKey directThreadKey, String str, String str2, boolean z, boolean z2) {
        int i;
        C4GV A0P = A0P(directThreadKey);
        if (A0P != null) {
            C81663kb c81663kb = A0P.A0I;
            if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
                ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int i2 = 0;
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    i = reentrantReadWriteLock.getReadHoldCount();
                    for (int i3 = 0; i3 < i; i3++) {
                        readLock.unlock();
                    }
                } else {
                    i = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    C80693iy c80693iy = c81663kb.A01;
                    c80693iy.A1v = str;
                    c80693iy.A1w = str2;
                    c80693iy.A2K = z;
                    A0G(this, directThreadKey, C05F.A0D, z2, false);
                } finally {
                    while (i2 < i) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            } else {
                C80693iy c80693iy2 = c81663kb.A01;
                synchronized (c80693iy2) {
                    try {
                        c80693iy2.A1v = str;
                        c80693iy2.A1w = str2;
                        c80693iy2.A2K = z;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                A0G(this, directThreadKey, C05F.A0D, z2, false);
            }
        }
    }

    @Override // X.C2DS
    public final synchronized List FAw(List list, String str) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(str, 1);
        return A0S(A0N(str), list, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.1vN] */
    @Override // X.C2DS
    public final synchronized List FAx(List list, String str) {
        List A0S2;
        A0S2 = A0S(A0N(str), list, true);
        this.A06.E4s(new Object());
        return A0S2;
    }

    @Override // X.C2DS
    public final /* bridge */ /* synthetic */ C81663kb FBa(C126455ng c126455ng, EnumC46982Dm enumC46982Dm, InterfaceC50443MOx interfaceC50443MOx, boolean z) {
        C81663kb A01;
        synchronized (this) {
            A0B(c126455ng, this, "single_fetch");
            A01 = A01(c126455ng, enumC46982Dm, interfaceC50443MOx, this, A0O(c126455ng), C2EB.A04, A0V(enumC46982Dm, c126455ng.A1E, ((C43707JUs) interfaceC50443MOx).A06), z);
            C46922Dg c46922Dg = this.A0C;
            c46922Dg.A0Q(A01, true, true, true);
            c46922Dg.A0R(enumC46982Dm);
        }
        return A01;
    }

    @Override // X.C2DS
    public final /* bridge */ /* synthetic */ C81663kb FBb(C126455ng c126455ng) {
        C81663kb A0M;
        synchronized (this) {
            C14360o3.A0B(c126455ng, 0);
            A0M = A0M(c126455ng, true);
        }
        return A0M;
    }

    @Override // X.C2DS
    public final void FCS(DirectThreadKey directThreadKey) {
        C14360o3.A0B(directThreadKey, 0);
        A0G(this, directThreadKey, C05F.A0D, true, false);
    }

    @Override // X.C2DS
    public final void FCU(C106414qv c106414qv, DirectThreadKey directThreadKey, boolean z) {
        int i;
        C4GV A0P = A0P(directThreadKey);
        if (A0P != null) {
            C81663kb c81663kb = A0P.A0I;
            if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
                ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int i2 = 0;
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    i = reentrantReadWriteLock.getReadHoldCount();
                    for (int i3 = 0; i3 < i; i3++) {
                        readLock.unlock();
                    }
                } else {
                    i = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    c81663kb.A01.A10 = c106414qv;
                } finally {
                    while (i2 < i) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            } else {
                C80693iy c80693iy = c81663kb.A01;
                synchronized (c80693iy) {
                    c80693iy.A10 = c106414qv;
                }
            }
            if (z) {
                A0F(this, A0P);
            }
            C2Io c2Io = new C2Io(directThreadKey, C05F.A0D, null, null, null, false);
            this.A06.E4s(c2Io);
            this.A09.accept(c2Io);
        }
    }

    @Override // X.C2DS
    public final void FCW(DirectThreadKey directThreadKey, int i) {
        C4GV A0P;
        int i2;
        if (i != -1 && (A0P = A0P(directThreadKey)) != null) {
            C81663kb c81663kb = A0P.A0I;
            C14360o3.A07(c81663kb);
            if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
                ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int i3 = 0;
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    i2 = reentrantReadWriteLock.getReadHoldCount();
                    for (int i4 = 0; i4 < i2; i4++) {
                        readLock.unlock();
                    }
                } else {
                    i2 = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    c81663kb.A01.A06 = i;
                    return;
                } finally {
                    while (i3 < i2) {
                        readLock.lock();
                        i3++;
                    }
                    writeLock.unlock();
                }
            }
            C80693iy c80693iy = c81663kb.A01;
            synchronized (c80693iy) {
                c80693iy.A06 = i;
            }
        }
    }

    @Override // X.C2DS
    public final void FCX(C51755Mte c51755Mte, DirectThreadKey directThreadKey) {
        int i;
        C14360o3.A0B(directThreadKey, 0);
        C4GV A0P = A0P(directThreadKey);
        if (A0P != null) {
            C81663kb c81663kb = A0P.A0I;
            C14360o3.A07(c81663kb);
            if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
                ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int i2 = 0;
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    i = reentrantReadWriteLock.getReadHoldCount();
                    for (int i3 = 0; i3 < i; i3++) {
                        readLock.unlock();
                    }
                } else {
                    i = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    c81663kb.A01.A0X = c51755Mte;
                } finally {
                    while (i2 < i) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            } else {
                C80693iy c80693iy = c81663kb.A01;
                synchronized (c80693iy) {
                    c80693iy.A0X = c51755Mte;
                }
            }
            FCS(directThreadKey);
        }
    }

    @Override // X.C2DS
    public final void FCZ(DirectThreadThemeInfo directThreadThemeInfo, DirectThreadKey directThreadKey, boolean z) {
        int i;
        C4GV A0P = A0P(directThreadKey);
        if (A0P != null) {
            C81663kb c81663kb = A0P.A0I;
            if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
                ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int i2 = 0;
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    i = reentrantReadWriteLock.getReadHoldCount();
                    for (int i3 = 0; i3 < i; i3++) {
                        readLock.unlock();
                    }
                } else {
                    i = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    c81663kb.A01.A1N.A03(directThreadThemeInfo);
                } finally {
                    while (i2 < i) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            } else {
                C80693iy c80693iy = c81663kb.A01;
                synchronized (c80693iy) {
                    c80693iy.A1N.A03(directThreadThemeInfo);
                }
            }
            if (z) {
                A0F(this, A0P);
            }
            C2Io c2Io = new C2Io(directThreadKey, C05F.A0D, null, null, null, false);
            this.A06.E4s(c2Io);
            this.A09.accept(c2Io);
        }
    }

    @Override // X.C2DS
    public final synchronized void FD6(DirectThreadKey directThreadKey, String str, String str2, boolean z) {
        C2Io c2Io;
        int i;
        C101584hT c101584hT;
        C14360o3.A0B(directThreadKey, 0);
        C4GV A0P = A0P(directThreadKey);
        if (A0P == null) {
            C0w9.A03("Null thread entry", "Entry should exist before function call");
        } else {
            synchronized (A0P) {
                try {
                    C83403nh A0I = A0P.A0I(str);
                    if (A0I != null && (c101584hT = A0I.A0e) != null) {
                        int i2 = c101584hT.A00;
                        c101584hT.A00 = Math.max(i2 + 1, i2);
                        A0I.A2C = true;
                        if (!z) {
                            boolean z2 = false;
                            if (A0I.A10 == C2EY.A0q) {
                                z2 = true;
                            }
                            C18C.A0E(z2);
                            A0I.A1w = str2;
                        }
                        C81663kb c81663kb = A0P.A0I;
                        C83403nh BYi = c81663kb.BYi();
                        if (c101584hT.A00 == 1 && BYi != null && C93404Gt.A01.compare(BYi.A0h(), str) == 0) {
                            A0P.A0T();
                        }
                        c2Io = new C2Io(c81663kb.BKb(), C05F.A03, null, null, Collections.singletonList(A0I), true);
                    } else {
                        C18950wb.A00.AEp("Visual message is missing from thread entry", 20134884).report();
                        c2Io = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            A0F(this, A0P);
            if (c2Io != null) {
                this.A06.E4s(c2Io);
                this.A09.accept(c2Io);
            }
            if (!z) {
                C81663kb c81663kb2 = A0P.A0I;
                int i3 = 0;
                if (((Boolean) c81663kb2.A05.getValue()).booleanValue()) {
                    ReentrantReadWriteLock reentrantReadWriteLock = c81663kb2.A03;
                    ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                    if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                        i = reentrantReadWriteLock.getReadHoldCount();
                        for (int i4 = 0; i4 < i; i4++) {
                            readLock.unlock();
                        }
                    } else {
                        i = 0;
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        c81663kb2.A01.A0M = Math.max(0, r1.A0M - 1);
                    } finally {
                        while (i3 < i) {
                            readLock.lock();
                            i3++;
                        }
                        writeLock.unlock();
                    }
                } else {
                    C80693iy c80693iy = c81663kb2.A01;
                    synchronized (c80693iy) {
                        c80693iy.A0M = Math.max(0, c80693iy.A0M - 1);
                    }
                }
            }
            if (C18U.A06(C06090Tz.A05, this.A0A, 36330853478974518L)) {
                C28741aC c28741aC = this.A0H;
                c28741aC.A02.ATO(new KM1(c28741aC, directThreadKey));
            }
        }
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        C2EA c2ea;
        if (!z) {
            C28741aC c28741aC = this.A0H;
            c28741aC.A02.ATO(new C127205oy(new C47421KxC(this), c28741aC));
        } else {
            synchronized (this) {
                c2ea = this.A0F;
                ReentrantReadWriteLock.ReadLock readLock = c2ea.A02.readLock();
                readLock.lock();
                try {
                    java.util.Set keySet = c2ea.A01.keySet();
                    readLock.unlock();
                    Iterator it = keySet.iterator();
                    while (it.hasNext()) {
                        AbstractC22714A0k.A00(this.A0A, ((DirectThreadKey) it.next()).A00);
                    }
                } catch (Throwable th) {
                    readLock.unlock();
                    throw th;
                }
            }
            synchronized (this) {
                c2ea.A0A();
                this.A0E.A01();
            }
        }
        this.A06.A02(this.A0O, C42281xI.class);
        C28741aC c28741aC2 = this.A0H;
        if (z) {
            if (C18U.A06(C06090Tz.A05, c28741aC2.A01, 36319952851967854L)) {
                c28741aC2.A02.ATO(new C45699KLc(c28741aC2));
            } else {
                C28741aC.A0B(c28741aC2);
            }
        }
    }

    public static final C81663kb A00(C2ED c2ed, C2DU c2du) {
        if (c2ed instanceof C81663kb) {
            return (C81663kb) c2ed;
        }
        C0w9.A04("DirectThreadStoreImpl_unexpectedThreadType", AnonymousClass001.A0R("DirectThreadStore should only be passed in DirectThreadSummaries as DirectThreads during transition period. Instead received a ", c2ed.getClass().getSimpleName()), 1);
        C81663kb A03 = A03(c2du, c2ed.BKb());
        if (A03 != null) {
            return A03;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
    
        if (r141.length() == 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized X.C81663kb A02(com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r139, java.lang.String r140, java.lang.String r141, java.util.List r142, boolean r143) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2DU.A02(com.instagram.direct.model.thread.CreatorBroadcastThreadInfo, java.lang.String, java.lang.String, java.util.List, boolean):X.3kb");
    }

    public static final C81663kb A04(C2DU c2du, String str, String str2) {
        Object obj;
        Map.Entry entry;
        C4GV c4gv;
        Object obj2;
        Object obj3;
        ThreadMetadataOverrideStore threadMetadataOverrideStore = c2du.A0P;
        if (threadMetadataOverrideStore.get(str) != null) {
            return threadMetadataOverrideStore.get(str);
        }
        if (C18U.A06(C06090Tz.A05, c2du.A0A, 36318033005385565L)) {
            C2EA c2ea = c2du.A0F;
            C81663kb c81663kb = null;
            if (str == null && str2 == null) {
                return null;
            }
            ReentrantReadWriteLock.ReadLock readLock = c2ea.A02.readLock();
            readLock.lock();
            try {
                java.util.Set entrySet = c2ea.A01.entrySet();
                if (str != null) {
                    if (str2 != null) {
                        Iterator it = entrySet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj3 = it.next();
                                C81663kb c81663kb2 = ((C4GV) ((Map.Entry) obj3).getValue()).A0I;
                                if (C14360o3.A0K(c81663kb2.C7I(), str) || C14360o3.A0K(c81663kb2.C7q(), str2)) {
                                    break;
                                }
                            } else {
                                obj3 = null;
                                break;
                            }
                        }
                        entry = (Map.Entry) obj3;
                    } else {
                        Iterator it2 = entrySet.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                if (C14360o3.A0K(((C4GV) ((Map.Entry) obj2).getValue()).A0I.C7I(), str)) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        entry = (Map.Entry) obj2;
                    }
                } else {
                    Iterator it3 = entrySet.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj = it3.next();
                            if (C14360o3.A0K(((C4GV) ((Map.Entry) obj).getValue()).A0I.C7q(), str2)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    entry = (Map.Entry) obj;
                }
                if (entry != null && (c4gv = (C4GV) entry.getValue()) != null) {
                    c81663kb = c4gv.A0I;
                }
                return c81663kb;
            } finally {
                readLock.unlock();
            }
        }
        synchronized (c2du) {
            if (str != null || str2 != null) {
                Iterator it4 = c2du.A0F.A08().iterator();
                while (it4.hasNext()) {
                    C81663kb c81663kb3 = ((C4GV) ((Map.Entry) it4.next()).getValue()).A0I;
                    C14360o3.A07(c81663kb3);
                    if ((str != null && str.equals(c81663kb3.C7I())) || (str2 != null && str2.equals(c81663kb3.C7q()))) {
                        return c81663kb3;
                    }
                }
            }
            return null;
        }
    }

    private final C81663kb A05(DirectThreadKey directThreadKey) {
        C4GV A08;
        C81663kb A0N;
        C4GV A04 = this.A0F.A04(directThreadKey);
        if (A04 != null) {
            C81663kb c81663kb = A04.A0I;
            C14360o3.A07(c81663kb);
            if (directThreadKey.A00 != null || c81663kb.C7g() != 29) {
                return c81663kb;
            }
        }
        String str = directThreadKey.A00;
        if (str != null && (A0N = A0N(str)) != null) {
            return A0N;
        }
        List list = directThreadKey.A02;
        if (list != null && (A08 = A08(list, true)) != null) {
            return A08.A0I;
        }
        return null;
    }

    private final C4GV A07(List list, boolean z) {
        C13080lu A00 = AbstractC13090lv.A00("DirectThreadStoreImpl.getThreadEntry");
        try {
            ArrayList A002 = DirectThreadKey.A00(AbstractC81683kd.A07(this.A0A, list));
            Collections.sort(A002);
            C4GV A08 = A08(A002, z);
            A00.close();
            return A08;
        } finally {
        }
    }

    private final ArrayList A09(DirectThreadKey directThreadKey) {
        C2EY c2ey;
        C910143t c910143t;
        Number number;
        C910143t c910143t2;
        String str;
        ArrayList arrayList = new ArrayList();
        UserSession userSession = this.A0A;
        java.util.Set C2v = AbstractC23021Ah.A00(userSession).A01.C2v("direct_reels_watched_set");
        HashMap A02 = C23031Ai.A02(AbstractC23021Ah.A00(userSession), "direct_reels_impression_map");
        List<C83403nh> Bkx = Bkx(directThreadKey, true);
        HashSet hashSet = new HashSet();
        for (C83403nh c83403nh : Bkx) {
            if (!c83403nh.A1j(C17060sy.A01.A01(userSession)) && c83403nh.A0h() != null && ((c2ey = c83403nh.A10) == C2EY.A0W || c2ey == C2EY.A1r)) {
                ImmutableList A0H = c83403nh.A0H();
                if (A0H != null && (c910143t = (C910143t) AbstractC001800i.A0J(A0H)) != null && c910143t.A0w != null) {
                    ImmutableList A0H2 = c83403nh.A0H();
                    if (A0H2 != null && (c910143t2 = (C910143t) AbstractC001800i.A0J(A0H2)) != null && (str = c910143t2.A0w) != null) {
                        android.net.Uri A03 = AbstractC08820cl.A03(str);
                        C14360o3.A07(A03);
                        String queryParameter = A03.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        if (queryParameter != null) {
                            if (!hashSet.contains(queryParameter)) {
                                hashSet.add(queryParameter);
                            }
                        }
                    }
                    String A0h = c83403nh.A0h();
                    if (A0h == null || (number = (Number) A02.get(A0h)) == null || number.doubleValue() < 3.0d) {
                        if (!C2v.contains(c83403nh.A0h())) {
                            arrayList.add(c83403nh);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final void A0B(C126455ng c126455ng, C2DU c2du, String str) {
        long j;
        String str2 = c126455ng.A1E;
        C14360o3.A07(str2);
        C4GV A04 = c2du.A0F.A04(new DirectThreadKey(str2));
        C81613kW c81613kW = c126455ng.A0a;
        C18920wW c18920wW = c2du.A05;
        if (c18920wW != null) {
            boolean A02 = C161867Mw.A02(c81613kW);
            if (A04 == null) {
                if (A02) {
                    C162337Ov.A0e(c18920wW, str2, "new_thread", A02);
                }
            } else if (C161867Mw.A02(A04.A0I.Aic()) != A02) {
                C162337Ov.A0e(c18920wW, str2, str, A02);
            }
        }
        C81613kW c81613kW2 = c126455ng.A0a;
        if (c18920wW != null) {
            long j2 = 0;
            if (c81613kW2 != null) {
                j = c81613kW2.A03;
            } else {
                j = 0;
            }
            if (A04 == null) {
                if (j > 0) {
                    C162337Ov.A0b(c18920wW, str2, "new_thread", j);
                }
            } else {
                C81613kW Aic = A04.A0I.Aic();
                if (Aic != null) {
                    j2 = Aic.A03;
                }
                if (j2 != j) {
                    C162337Ov.A0b(c18920wW, str2, str, j);
                }
            }
        }
        C1118752z c1118752z = c126455ng.A0o;
        if (c18920wW != null) {
            boolean z = true;
            if (c1118752z == null || !c1118752z.A08) {
                z = false;
            }
            if (A04 == null) {
                if (z) {
                    C162337Ov.A0d(c18920wW, str2, "new_thread", z);
                }
            } else {
                if (A04.A0I.Ay8() == z) {
                    return;
                }
                C162337Ov.A0d(c18920wW, str2, str, z);
            }
        }
    }

    public static final void A0E(C2Io c2Io, C2DU c2du, boolean z) {
        if (c2Io != null) {
            c2du.A06.E4s(c2Io);
            c2du.A09.accept(c2Io);
            if (z) {
                A0F(c2du, c2du.A0P(c2Io.A00));
            }
        }
    }

    public static final void A0F(C2DU c2du, C4GV c4gv) {
        EnumC46982Dm enumC46982Dm;
        C46922Dg c46922Dg = c2du.A0C;
        if (c4gv != null) {
            enumC46982Dm = c4gv.A0I.C4i();
            C14360o3.A07(enumC46982Dm);
        } else {
            enumC46982Dm = EnumC46982Dm.A05;
        }
        c46922Dg.A0R(enumC46982Dm);
    }

    public static final void A0I(C2DU c2du, boolean z, boolean z2) {
        C43990Jcd c43990Jcd = c2du.A01;
        if (c43990Jcd != null) {
            if (z) {
                C69613Av c69613Av = c43990Jcd.A00;
                if (c69613Av != null) {
                    c69613Av.A08(null);
                    c69613Av.A01.A0K("retrieve_thread_async", z2);
                    return;
                }
                return;
            }
            C69613Av c69613Av2 = c43990Jcd.A00;
            if (c69613Av2 != null) {
                c69613Av2.A05();
            }
            c43990Jcd.A01.invoke();
        }
    }

    public static final void A0J(C4GV c4gv, List list) {
        int i;
        C81663kb c81663kb = c4gv.A0I;
        C14360o3.A07(c81663kb);
        if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i2 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
                for (int i3 = 0; i3 < i; i3++) {
                    readLock.unlock();
                }
            } else {
                i = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                c81663kb.A01.A2C = list;
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy = c81663kb.A01;
        synchronized (c80693iy) {
            c80693iy.A2C = list;
        }
    }

    private final boolean A0K() {
        return C18U.A06(C06090Tz.A05, this.A0A, 36322516948822306L);
    }

    public final C81663kb A0N(String str) {
        C13080lu A00 = AbstractC13090lv.A00("DirectThreadStoreImpl.getThreadSummary");
        try {
            C81663kb A04 = A04(this, str, null);
            A00.close();
            return A04;
        } finally {
        }
    }

    public final ArrayList A0R(List list) {
        ArrayList arrayList;
        C13080lu A00 = AbstractC13090lv.A00("DirectThreadStoreImpl.getSortedCopyOfThreadSummaries");
        try {
            if (A0K()) {
                C2EA c2ea = this.A0F;
                ReentrantReadWriteLock.ReadLock readLock = c2ea.A02.readLock();
                readLock.lock();
                try {
                    arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AnonymousClass016.A16(c2ea.A07((EnumC46982Dm) it.next(), C2EB.A04), arrayList2);
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        C81663kb c81663kb = ((C4GV) it2.next()).A0I;
                        C14360o3.A07(c81663kb);
                        if (!c2ea.A0E(c81663kb)) {
                            arrayList.add(c81663kb);
                        }
                    }
                    Comparator comparator = C2EB.A04.A01;
                    if (comparator != null) {
                        c2ea.A0D(arrayList, comparator);
                        A00.close();
                        return arrayList;
                    }
                    throw new IllegalStateException("Required value was null.");
                } finally {
                    readLock.unlock();
                }
            }
            synchronized (this) {
                try {
                    arrayList = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        AnonymousClass016.A16(this.A0F.A07((EnumC46982Dm) it3.next(), C2EB.A04), arrayList3);
                    }
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        C81663kb c81663kb2 = ((C4GV) it4.next()).A0I;
                        C14360o3.A07(c81663kb2);
                        if (!this.A0F.A0E(c81663kb2)) {
                            arrayList.add(c81663kb2);
                        }
                    }
                    Comparator comparator2 = C2EB.A04.A01;
                    if (comparator2 != null) {
                        C01T.A1D(arrayList, comparator2);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            A00.close();
            return arrayList;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C20I.A00(A00, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd A[Catch: all -> 0x0170, TRY_LEAVE, TryCatch #1 {all -> 0x0170, blocks: (B:24:0x00c7, B:26:0x00cd, B:31:0x00ea, B:32:0x00eb, B:34:0x00f1, B:36:0x00f7, B:38:0x00fd, B:39:0x0101, B:41:0x0110, B:43:0x0117, B:45:0x0128, B:48:0x0137, B:49:0x013a, B:50:0x013d, B:51:0x012e, B:60:0x0151, B:61:0x0152, B:28:0x00ce, B:54:0x00d8, B:56:0x00e0, B:57:0x00e3), top: B:23:0x00c7, inners: #0 }] */
    @Override // X.C2DS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A9m(X.C83403nh r17, X.C114675Fx r18, com.instagram.model.direct.DirectThreadKey r19, java.lang.Integer r20) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2DU.A9m(X.3nh, X.5Fx, com.instagram.model.direct.DirectThreadKey, java.lang.Integer):void");
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [X.JWO, java.lang.Object] */
    @Override // X.C2DS
    public final synchronized void A9n(C83403nh c83403nh, DirectThreadKey directThreadKey, boolean z, boolean z2) {
        List singletonList;
        List list;
        Integer num;
        C4GV A0P = A0P(directThreadKey);
        if (A0P != null) {
            C2EW c2ew = this.A0G;
            C81663kb c81663kb = A0P.A0I;
            C14360o3.A07(c81663kb);
            if (!c2ew.A00(c83403nh, c81663kb)) {
                C81613kW Aic = c81663kb.Aic();
                if (Aic != null && Aic.A02() && c81663kb.C7V() == null) {
                    c81663kb.A0E((String) C93404Gt.A00.A01);
                }
                C83403nh A0F = A0P.A0F(c83403nh, z2);
                C14360o3.A07(A0F);
                boolean z3 = false;
                if (A0F == c83403nh) {
                    z3 = true;
                }
                if (z3) {
                    list = Collections.singletonList(A0F);
                    C14360o3.A07(list);
                    List singletonList2 = Collections.singletonList(c83403nh);
                    C14360o3.A07(singletonList2);
                    UserSession userSession = this.A0A;
                    String str = directThreadKey.A00;
                    if (str == null) {
                        str = "";
                    }
                    AbstractC161587Lt.A02(userSession, directThreadKey, str, singletonList2);
                    if (C18U.A06(C06090Tz.A05, userSession, 36328366692974057L)) {
                        JWO jwo = JWO.A00;
                        JWO jwo2 = jwo;
                        if (jwo == null) {
                            ?? obj = new Object();
                            JWO.A00 = obj;
                            jwo2 = obj;
                        }
                        Context context = this.A0M;
                        List singletonList3 = Collections.singletonList(c83403nh);
                        C14360o3.A07(singletonList3);
                        jwo2.A01(context, userSession, A0P, AbstractC83823oR.A00(directThreadKey), singletonList3, c81663kb.C7g());
                    }
                    singletonList = null;
                } else {
                    singletonList = Collections.singletonList(A0F);
                    C14360o3.A07(singletonList);
                    list = null;
                    A0H(this, AbstractC83823oR.A00(directThreadKey), singletonList, c81663kb.C7g());
                }
                if (c83403nh.A1S()) {
                    C28741aC c28741aC = this.A0H;
                    List singletonList4 = Collections.singletonList(c83403nh);
                    C14360o3.A07(singletonList4);
                    Map A0M = AbstractC16850sd.A0M(new C09530e4(directThreadKey, singletonList4));
                    C16920sk c16920sk = C16920sk.A00;
                    C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                    c28741aC.A0I(A0M, c16920sk);
                }
                if (z3) {
                    num = C05F.A01;
                } else {
                    num = C05F.A0C;
                }
                C2Io c2Io = new C2Io(directThreadKey, num, list, null, singletonList, true);
                this.A06.E4s(c2Io);
                this.A09.accept(c2Io);
                if (z) {
                    A0F(this, A0P);
                }
                if (c81663kb.C7g() == 29 && z3) {
                    A0U(directThreadKey);
                }
            }
        }
    }

    @Override // X.C2DS
    public final synchronized void A9x(C43707JUs c43707JUs, DirectThreadKey directThreadKey, String str) {
        List emptyList;
        int i;
        List subList;
        int i2;
        List subList2;
        List unmodifiableList;
        List unmodifiableList2;
        List unmodifiableList3;
        List unmodifiableList4;
        int i3;
        List subList3;
        C4GV A0P = A0P(directThreadKey);
        if (A0P == null) {
            C0w9.A03("Null thread entry", "Entry should exist before function call");
        } else {
            List list = c43707JUs.A1c;
            if (list != null) {
                A0J(A0P, list);
            }
            UserSession userSession = this.A0A;
            C81663kb c81663kb = A0P.A0I;
            C14360o3.A07(c81663kb);
            C2DV.A00(userSession, c81663kb, c43707JUs);
            synchronized (A0P) {
                String C7V = c81663kb.C7V();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList(c43707JUs.A06);
                Comparator comparator = C93394Gs.A04;
                Collections.sort(arrayList5, comparator);
                ArrayList arrayList6 = new ArrayList();
                String str2 = c43707JUs.A05;
                String A04 = C93394Gs.A04(str2, arrayList5);
                String A03 = C93394Gs.A03(str2, arrayList5);
                if (C7V != null) {
                    String obj = new BigInteger(C7V).subtract(BigInteger.ONE).toString();
                    List list2 = A0P.A0K;
                    C14360o3.A0B(list2, 0);
                    if (A04 != null) {
                        i3 = C93394Gs.A00(A04, list2);
                        if (i3 < 0) {
                            i3 ^= -1;
                        }
                    } else {
                        i3 = 0;
                    }
                    int A01 = C93394Gs.A01(obj, list2);
                    if (i3 > A01) {
                        subList3 = Collections.emptyList();
                        C14360o3.A07(subList3);
                    } else {
                        subList3 = list2.subList(i3, A01);
                    }
                    emptyList = new ArrayList(subList3);
                } else {
                    emptyList = Collections.emptyList();
                }
                List list3 = A0P.A0K;
                C14360o3.A0B(list3, 0);
                if (A04 != null) {
                    i = C93394Gs.A00(A04, list3);
                    if (i < 0) {
                        i ^= -1;
                    }
                } else {
                    i = 0;
                }
                int A012 = C93394Gs.A01(A03, list3);
                if (i > A012) {
                    subList = Collections.emptyList();
                    C14360o3.A07(subList);
                } else {
                    subList = list3.subList(i, A012);
                }
                if (A04 != null) {
                    i2 = C93394Gs.A00(A04, arrayList5);
                    if (i2 < 0) {
                        i2 ^= -1;
                    }
                } else {
                    i2 = 0;
                }
                int A013 = C93394Gs.A01(A03, arrayList5);
                if (i2 > A013) {
                    subList2 = Collections.emptyList();
                    C14360o3.A07(subList2);
                } else {
                    subList2 = arrayList5.subList(i2, A013);
                }
                C4GV.A0D(A0P, subList, subList2, arrayList6, arrayList2, arrayList3);
                arrayList.addAll(AnonymousClass483.A02(comparator, arrayList6, emptyList));
                C4GV.A0B(A0P, arrayList, arrayList4);
                arrayList3.addAll(arrayList4);
                boolean z = true;
                String A042 = C93394Gs.A04(str2, arrayList5);
                String C7V2 = c81663kb.C7V();
                if (A042 == null || (C7V2 != null && C93394Gs.A02.compare(A042, C7V2) >= 0)) {
                    A042 = C7V2;
                }
                c81663kb.A0E(A042);
                if (!c43707JUs.CLR()) {
                    z = false;
                }
                c81663kb.A0J(z);
                C93404Gt c93404Gt = C93404Gt.A00;
                C4GV.A06(new C4H4(c93404Gt, C93404Gt.A01(str2, z, false), (String) c93404Gt.A00), (C83403nh) AnonymousClass483.A00(A0P.A07, list3), c81663kb);
                A0P.A0R();
                A0P.A0Q();
                unmodifiableList = Collections.unmodifiableList(arrayList);
                unmodifiableList2 = Collections.unmodifiableList(arrayList2);
                unmodifiableList3 = Collections.unmodifiableList(arrayList3);
                unmodifiableList4 = Collections.unmodifiableList(arrayList4);
            }
            if (unmodifiableList4 != null) {
                A0H(this, AbstractC83823oR.A00(directThreadKey), unmodifiableList4, c81663kb.C7g());
            }
            if (unmodifiableList != null) {
                String str3 = directThreadKey.A00;
                if (str3 == null) {
                    str3 = "";
                }
                AbstractC161587Lt.A02(userSession, directThreadKey, str3, unmodifiableList);
            }
            C2Io c2Io = new C2Io(c81663kb.BKb(), C05F.A0D, unmodifiableList, C4GV.A03(unmodifiableList2, false), unmodifiableList3, false);
            this.A09.accept(c2Io);
            this.A06.E4s(c2Io);
            A0F(this, A0P);
        }
    }

    @Override // X.C2DS
    public final int BdL(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        HashMap hashMap = new HashMap();
        Iterator it = this.A0F.A07(EnumC46982Dm.A05, C2EB.A04).iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            C81663kb c81663kb = ((C4GV) it.next()).A0I;
            if (c81663kb.CaK()) {
                int B7A = c81663kb.B7A();
                Integer valueOf = Integer.valueOf(B7A);
                Number number = (Number) hashMap.get(valueOf);
                if (number != null) {
                    i4 = number.intValue();
                } else {
                    i4 = 0;
                }
                hashMap.put(valueOf, Integer.valueOf(i4 + 1));
                if (B7A == 3) {
                    boolean z2 = false;
                    if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
                        ReentrantReadWriteLock.ReadLock readLock = c81663kb.A03.readLock();
                        readLock.lock();
                        try {
                            C81543kP c81543kP = c81663kb.A01.A0t;
                            if (c81543kP != null) {
                                z2 = c81543kP.A0L;
                            }
                        } finally {
                            readLock.unlock();
                        }
                    } else {
                        C80693iy c80693iy = c81663kb.A01;
                        synchronized (c80693iy) {
                            C81543kP c81543kP2 = c80693iy.A0t;
                            if (c81543kP2 != null) {
                                z2 = c81543kP2.A0L;
                            }
                        }
                    }
                    if (!z2) {
                        Number number2 = (Number) hashMap.get(0);
                        if (number2 != null) {
                            i5 = number2.intValue();
                        } else {
                            i5 = 0;
                        }
                        hashMap.put(0, Integer.valueOf(i5 + 1));
                    }
                } else {
                    continue;
                }
            }
        }
        Number number3 = (Number) hashMap.get(Integer.valueOf(i));
        if (number3 != null) {
            i3 = number3.intValue();
        } else {
            i3 = 0;
        }
        Number number4 = (Number) hashMap.get(0);
        if (number4 != null) {
            i2 = number4.intValue();
        }
        if (z) {
            return Math.max(i3, i2);
        }
        return i3;
    }

    @Override // X.C2DS
    public final ArrayList CD3(DirectThreadKey directThreadKey) {
        ArrayList A09;
        C13080lu A00 = AbstractC13090lv.A00("DirectThreadStoreImpl.getUnwatchedClipsFromThread");
        try {
            if (A0K()) {
                A09 = A09(directThreadKey);
            } else {
                synchronized (this) {
                    A09 = A09(directThreadKey);
                }
            }
            A00.close();
            return A09;
        } finally {
        }
    }

    @Override // X.C2DS
    public final void CoR(final boolean z, final String str) {
        final C5G7 c5g7;
        UserSession userSession = this.A0A;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36322516947642643L);
        final C28741aC c28741aC = this.A0H;
        if (A06) {
            c5g7 = new C5G7(this);
        } else {
            c5g7 = null;
        }
        UserSession userSession2 = c28741aC.A01;
        final boolean A062 = C18U.A06(c06090Tz, userSession2, 36327486225660535L);
        InterfaceC14020nS interfaceC14020nS = c28741aC.A02;
        final int i = 4;
        if (C18U.A06(c06090Tz, userSession2, 36330050320089743L)) {
            i = 2;
        }
        interfaceC14020nS.ATO(new AbstractRunnableC14200nk(c5g7, c28741aC, str, i, A062, z) { // from class: X.2JE
            public final /* synthetic */ C5G7 A00;
            public final /* synthetic */ C28741aC A01;
            public final /* synthetic */ String A02;
            public final /* synthetic */ boolean A03;
            public final /* synthetic */ boolean A04;

            {
                this.A04 = A062;
                this.A03 = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Integer num;
                int i2;
                int i3;
                if (this.A04) {
                    num = 0;
                } else {
                    num = null;
                }
                C5G7 c5g72 = this.A00;
                C28741aC c28741aC2 = this.A01;
                boolean z2 = this.A03;
                String str2 = this.A02;
                if (num != null) {
                    int threadPriority = Process.getThreadPriority(Process.myTid());
                    int intValue = num.intValue();
                    if (intValue >= threadPriority) {
                        if (Systrace.A0E(1L)) {
                            C0fO.A01("DirectSQLiteDiskIO.maybeRetrieveInboxFromDiskAsync", -1968937339);
                        }
                        if (c5g72 != null) {
                            try {
                                C2DU.A0I(c5g72.A00, true, true);
                            } catch (Throwable th) {
                                th = th;
                                if (Systrace.A0E(1L)) {
                                    i2 = -562723425;
                                    C0fO.A00(i2);
                                    throw th;
                                }
                                throw th;
                            }
                        }
                        c28741aC2.A0J(z2, str2);
                        if (c5g72 != null) {
                            C2DU.A0I(c5g72.A00, false, true);
                        }
                        if (Systrace.A0E(1L)) {
                            i3 = 657039282;
                        } else {
                            return;
                        }
                    } else {
                        if (Systrace.A0E(1L)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("ScopedBoost priority=");
                            sb.append(num);
                            C0fO.A01(sb.toString(), -383275855);
                        }
                        Process.setThreadPriority(intValue);
                        try {
                            if (Systrace.A0E(1L)) {
                                C0fO.A01("DirectSQLiteDiskIO.maybeRetrieveInboxFromDiskAsync", 960189654);
                            }
                            if (c5g72 != null) {
                                try {
                                    C2DU.A0I(c5g72.A00, true, true);
                                } catch (Throwable th2) {
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A00(2019261466);
                                    }
                                    throw th2;
                                }
                            }
                            c28741aC2.A0J(z2, str2);
                            if (c5g72 != null) {
                                C2DU.A0I(c5g72.A00, false, true);
                            }
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(712214928);
                            }
                            Process.setThreadPriority(threadPriority);
                            if (Systrace.A0E(1L)) {
                                i3 = 1151676194;
                            } else {
                                return;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            Process.setThreadPriority(threadPriority);
                            if (Systrace.A0E(1L)) {
                                i2 = 737490841;
                                C0fO.A00(i2);
                                throw th;
                            }
                            throw th;
                        }
                    }
                } else {
                    if (Systrace.A0E(1L)) {
                        C0fO.A01("DirectSQLiteDiskIO.maybeRetrieveInboxFromDiskAsync", -1204323400);
                    }
                    if (c5g72 != null) {
                        try {
                            C2DU.A0I(c5g72.A00, true, true);
                        } catch (Throwable th4) {
                            th = th4;
                            if (Systrace.A0E(1L)) {
                                i2 = 1714734106;
                                C0fO.A00(i2);
                                throw th;
                            }
                            throw th;
                        }
                    }
                    c28741aC2.A0J(z2, str2);
                    if (c5g72 != null) {
                        C2DU.A0I(c5g72.A00, false, true);
                    }
                    if (Systrace.A0E(1L)) {
                        i3 = 472515690;
                    } else {
                        return;
                    }
                }
                C0fO.A00(i3);
            }
        });
    }

    @Override // X.C2DS
    public final void ELj() {
        C28741aC c28741aC = this.A0H;
        c28741aC.A02.ATO(new C127205oy(null, c28741aC));
    }

    @Override // X.C2DS
    public final void ELu(DirectThreadKey directThreadKey) {
        C28741aC c28741aC = this.A0H;
        c28741aC.A02.ATO(new KM1(c28741aC, directThreadKey));
    }

    @Override // X.C2DS
    public final void Ean(C2ED c2ed, boolean z) {
        long j;
        int i;
        if (z) {
            j = System.currentTimeMillis() / 1000;
        } else {
            j = 0;
        }
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = A00.A03;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i2 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
                for (int i3 = 0; i3 < i; i3++) {
                    readLock.unlock();
                }
            } else {
                i = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                C80693iy c80693iy = A00.A01;
                c80693iy.A1b = Boolean.valueOf(z);
                c80693iy.A0O = j;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        } else {
            C80693iy c80693iy2 = A00.A01;
            synchronized (c80693iy2) {
                c80693iy2.A1b = Boolean.valueOf(z);
                c80693iy2.A0O = j;
            }
        }
        ELj();
    }

    @Override // X.C2DS
    public final void Efk(C9BH c9bh, C2ED c2ed) {
        int i;
        if (c2ed instanceof C81663kb) {
            C81663kb c81663kb = (C81663kb) c2ed;
            if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
                ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int i2 = 0;
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    i = reentrantReadWriteLock.getReadHoldCount();
                    for (int i3 = 0; i3 < i; i3++) {
                        readLock.unlock();
                    }
                } else {
                    i = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    c81663kb.A01.A0P = c9bh;
                    return;
                } finally {
                    while (i2 < i) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            }
            C80693iy c80693iy = c81663kb.A01;
            synchronized (c80693iy) {
                c80693iy.A0P = c9bh;
            }
        }
    }

    @Override // X.C2DS
    public final void F8e(DirectThreadKey directThreadKey) {
        Boolean bool;
        if (directThreadKey != null) {
            C4GV A0P = A0P(directThreadKey);
            if (A0P != null) {
                bool = Boolean.valueOf(A0P.A0X(false));
            } else {
                bool = null;
            }
            if (C14360o3.A0K(bool, true)) {
                A0F(this, A0P);
            }
        }
    }

    @Override // X.C2DS
    public final void FCT(C81613kW c81613kW, DirectThreadKey directThreadKey, String str) {
        int i;
        C18920wW c18920wW;
        C4GV A0P = A0P(directThreadKey);
        if (A0P != null) {
            String str2 = directThreadKey.A00;
            if (str2 != null && (c18920wW = this.A05) != null) {
                boolean A02 = C161867Mw.A02(c81613kW);
                C81663kb c81663kb = A0P.A0I;
                if (C161867Mw.A02(c81663kb.Aic()) != A02) {
                    C162337Ov.A0e(c18920wW, str2, str, A02);
                }
                long j = 0;
                long j2 = c81613kW.A03;
                C81613kW Aic = c81663kb.Aic();
                if (Aic != null) {
                    j = Aic.A03;
                }
                if (j != j2) {
                    C162337Ov.A0b(c18920wW, str2, str, j2);
                }
            }
            synchronized (A0P) {
                C81663kb c81663kb2 = A0P.A0I;
                if (((Boolean) c81663kb2.A05.getValue()).booleanValue()) {
                    ReentrantReadWriteLock reentrantReadWriteLock = c81663kb2.A03;
                    ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                    int i2 = 0;
                    if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                        i = reentrantReadWriteLock.getReadHoldCount();
                        for (int i3 = 0; i3 < i; i3++) {
                            readLock.unlock();
                        }
                    } else {
                        i = 0;
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        c81663kb2.A01.A0f = c81613kW;
                        while (i2 < i) {
                            readLock.lock();
                            i2++;
                        }
                        writeLock.unlock();
                    } catch (Throwable th) {
                        while (i2 < i) {
                            readLock.lock();
                            i2++;
                        }
                        writeLock.unlock();
                        throw th;
                    }
                } else {
                    C80693iy c80693iy = c81663kb2.A01;
                    synchronized (c80693iy) {
                        try {
                            c80693iy.A0f = c81613kW;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            if (C18U.A06(C06090Tz.A05, this.A0A, 36318007231780625L)) {
                C2Io c2Io = new C2Io(directThreadKey, C05F.A0D, null, null, null, false);
                this.A06.E4s(c2Io);
                A0F(this, A0P);
                this.A09.accept(c2Io);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[Catch: all -> 0x00ea, TryCatch #3 {, blocks: (B:5:0x0005, B:7:0x000d, B:9:0x0024, B:11:0x0031, B:13:0x0038, B:15:0x003f, B:19:0x004f, B:21:0x006d, B:22:0x0070, B:24:0x007c, B:26:0x0089, B:28:0x0090, B:30:0x0097, B:34:0x00a9, B:36:0x00af, B:38:0x00c9, B:39:0x00cc, B:43:0x00b6, B:45:0x00e4, B:46:0x00e7, B:49:0x00bc, B:51:0x00c6, B:60:0x0058, B:62:0x005e, B:65:0x0063, B:66:0x0065, B:69:0x006b, B:54:0x00e2, B:50:0x00bd, B:68:0x0066, B:32:0x009e, B:17:0x0046), top: B:4:0x0005, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9 A[Catch: all -> 0x00ea, TryCatch #3 {, blocks: (B:5:0x0005, B:7:0x000d, B:9:0x0024, B:11:0x0031, B:13:0x0038, B:15:0x003f, B:19:0x004f, B:21:0x006d, B:22:0x0070, B:24:0x007c, B:26:0x0089, B:28:0x0090, B:30:0x0097, B:34:0x00a9, B:36:0x00af, B:38:0x00c9, B:39:0x00cc, B:43:0x00b6, B:45:0x00e4, B:46:0x00e7, B:49:0x00bc, B:51:0x00c6, B:60:0x0058, B:62:0x005e, B:65:0x0063, B:66:0x0065, B:69:0x006b, B:54:0x00e2, B:50:0x00bd, B:68:0x0066, B:32:0x009e, B:17:0x0046), top: B:4:0x0005, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bc A[Catch: all -> 0x00ea, TRY_LEAVE, TryCatch #3 {, blocks: (B:5:0x0005, B:7:0x000d, B:9:0x0024, B:11:0x0031, B:13:0x0038, B:15:0x003f, B:19:0x004f, B:21:0x006d, B:22:0x0070, B:24:0x007c, B:26:0x0089, B:28:0x0090, B:30:0x0097, B:34:0x00a9, B:36:0x00af, B:38:0x00c9, B:39:0x00cc, B:43:0x00b6, B:45:0x00e4, B:46:0x00e7, B:49:0x00bc, B:51:0x00c6, B:60:0x0058, B:62:0x005e, B:65:0x0063, B:66:0x0065, B:69:0x006b, B:54:0x00e2, B:50:0x00bd, B:68:0x0066, B:32:0x009e, B:17:0x0046), top: B:4:0x0005, inners: #0, #1, #2 }] */
    @Override // X.C2DS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void FCV(com.instagram.model.direct.DirectThreadKey r18, java.lang.String r19, int r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2DU.FCV(com.instagram.model.direct.DirectThreadKey, java.lang.String, int, boolean, boolean):void");
    }

    public static final C81663kb A03(C2DU c2du, DirectThreadKey directThreadKey) {
        C81663kb A05;
        if (c2du.A0K()) {
            return c2du.A05(directThreadKey);
        }
        synchronized (c2du) {
            A05 = c2du.A05(directThreadKey);
        }
        return A05;
    }

    public static final void A0D(C81663kb c81663kb, C2DU c2du) {
        if (!c81663kb.isPending()) {
            c2du.A0E.A03(c81663kb);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0H(C2DU c2du, InterfaceC83713oG interfaceC83713oG, List list, int i) {
        List list2;
        EnumC33398EpV enumC33398EpV;
        String A0g;
        String A0h;
        C45035JwQ c45035JwQ;
        InterfaceC83713oG interfaceC83713oG2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C83403nh c83403nh = (C83403nh) it.next();
            Iterator it2 = c2du.A0R.iterator();
            C14360o3.A07(it2);
            while (it2.hasNext()) {
                it2.next();
                UserSession userSession = c2du.A0A;
                C14360o3.A0B(c83403nh, 1);
                String str = c83403nh.A1f;
                if (str != null) {
                    c83403nh.A1f = null;
                    C26141Ov.A01(userSession).A08(str, c83403nh.A0h(), c83403nh.A0g());
                    userSession.A01(C27667CIm.class, DC7.A00);
                    if (C4GR.A06(i) && (A0g = c83403nh.A0g()) != null && (A0h = c83403nh.A0h()) != null) {
                        C2r0 A00 = AbstractC61362qy.A00(userSession);
                        java.util.Set set = A00.A03;
                        if (set.contains(A0g)) {
                            List<C45035JwQ> A002 = A00.A00(A0g);
                            boolean z = false;
                            for (C45035JwQ c45035JwQ2 : A002) {
                                InterfaceC83713oG interfaceC83713oG3 = c45035JwQ2.A00;
                                if (interfaceC83713oG3 == null) {
                                    interfaceC83713oG3 = interfaceC83713oG;
                                    if (interfaceC83713oG == null) {
                                    }
                                }
                                C2DS A003 = C2JD.A00(userSession);
                                DirectMessageIdentifier A0V = c83403nh.A0V();
                                String str2 = c45035JwQ2.A03;
                                int i2 = c45035JwQ2.A01;
                                A003.EYs(A0V, interfaceC83713oG3, Integer.valueOf(i2), str2);
                                if (i2 == 1) {
                                    z = true;
                                }
                                AbstractC165967bO.A00(userSession).A0J(interfaceC83713oG3, A0h, str2, i2);
                                A00.A01(c45035JwQ2);
                            }
                            if (z && (c45035JwQ = (C45035JwQ) AbstractC001800i.A0O(A002, 0)) != null && (interfaceC83713oG2 = c45035JwQ.A00) != null) {
                                new C43689JTy(userSession).A03(interfaceC83713oG2, A0h);
                            }
                            synchronized (A00) {
                                set.remove(A0g);
                            }
                        } else if (A00.A05(A0g)) {
                            PendingMediaStore A004 = C25A.A00(userSession);
                            for (C45035JwQ c45035JwQ3 : A00.A00(A0g)) {
                                InterfaceC83713oG interfaceC83713oG4 = c45035JwQ3.A00;
                                if (interfaceC83713oG4 == null) {
                                    interfaceC83713oG4 = interfaceC83713oG;
                                    if (interfaceC83713oG == null) {
                                    }
                                }
                                String str3 = c45035JwQ3.A03;
                                C47Z A03 = A004.A03(str3);
                                if (A03 != null) {
                                    if (A03.A5D) {
                                        str3 = LLT.A06(String.valueOf(A03.A2N));
                                    } else {
                                        str3 = String.valueOf(A03.A2I);
                                    }
                                }
                                if (str3 != null && str3.length() != 0 && !str3.equals("0")) {
                                    C2DS A005 = C2JD.A00(userSession);
                                    DirectMessageIdentifier A0V2 = c83403nh.A0V();
                                    int i3 = c45035JwQ3.A01;
                                    A005.EYs(A0V2, interfaceC83713oG4, Integer.valueOf(i3), str3);
                                    AbstractC165967bO.A00(userSession).A0J(interfaceC83713oG4, A0h, str3, i3);
                                    A00.A01(c45035JwQ3);
                                }
                            }
                            synchronized (A00) {
                                A00.A02.remove(A0g);
                            }
                            C48506Lcx c48506Lcx = (C48506Lcx) userSession.A01(C48506Lcx.class, new C50159MDm(userSession, 0));
                            synchronized (c48506Lcx) {
                                c48506Lcx.A00.remove(A0g);
                            }
                        }
                    }
                    userSession.A01(C27661CIg.class, DC4.A00);
                    if (C18U.A06(C06090Tz.A05, userSession, 36324071725936504L)) {
                        ImmutableList A0H = c83403nh.A0H();
                        Object obj = c83403nh.A1T;
                        if ((obj instanceof List) && (list2 = (List) obj) != null && A0H != null && A0H.size() != 0 && list2.size() <= 1) {
                            String str4 = ((C910143t) A0H.get(0)).A0w;
                            String str5 = ((C910143t) A0H.get(0)).A1Q;
                            if (str4 != null) {
                                android.net.Uri A032 = AbstractC08820cl.A03(str4);
                                C14360o3.A07(A032);
                                String queryParameter = A032.getQueryParameter("collection_type");
                                String queryParameter2 = A032.getQueryParameter("collection_id");
                                if (queryParameter != null) {
                                    EnumC33398EpV[] values = EnumC33398EpV.values();
                                    int length = values.length;
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < length) {
                                            enumC33398EpV = values[i4];
                                            if (C14360o3.A0K(enumC33398EpV.A00, queryParameter)) {
                                                break;
                                            } else {
                                                i4++;
                                            }
                                        } else {
                                            enumC33398EpV = EnumC33398EpV.A08;
                                            break;
                                        }
                                    }
                                    if (enumC33398EpV == EnumC33398EpV.A05 && queryParameter2 != null) {
                                        AbstractC25651Mw.A00(userSession).E4s(new C160957Je(queryParameter2, str5));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // X.C2DS
    public final AbstractC80713j1 Aa1(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                AbstractC80713j1 abstractC80713j12 = A00.A01.A19;
                C14360o3.A06(abstractC80713j12);
                return abstractC80713j12;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = A00.A01;
        synchronized (c80693iy) {
            abstractC80713j1 = c80693iy.A19;
            C14360o3.A06(abstractC80713j1);
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final AbstractC80713j1 Aoe(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                AbstractC80713j1 abstractC80713j12 = A00.A01.A13;
                C14360o3.A06(abstractC80713j12);
                return abstractC80713j12;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = A00.A01;
        synchronized (c80693iy) {
            abstractC80713j1 = c80693iy.A13;
            C14360o3.A06(abstractC80713j1);
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final AbstractC80713j1 AvI(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                AbstractC80713j1 abstractC80713j12 = A00.A01.A15;
                C14360o3.A06(abstractC80713j12);
                return abstractC80713j12;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = A00.A01;
        synchronized (c80693iy) {
            abstractC80713j1 = c80693iy.A15;
            C14360o3.A06(abstractC80713j1);
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final AbstractC80713j1 AyA(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                AbstractC80713j1 abstractC80713j12 = A00.A01.A16;
                C14360o3.A06(abstractC80713j12);
                return abstractC80713j12;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = A00.A01;
        synchronized (c80693iy) {
            abstractC80713j1 = c80693iy.A16;
            C14360o3.A06(abstractC80713j1);
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final C81663kb B3T(DirectShareTarget directShareTarget) {
        C83693oE c83693oE;
        InterfaceC83713oG A01 = directShareTarget.A01();
        String str = null;
        if ((A01 instanceof C83693oE) && (c83693oE = (C83693oE) A01) != null) {
            str = c83693oE.A00;
        }
        List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
        C14360o3.A07(unmodifiableList);
        return A06(str, unmodifiableList);
    }

    @Override // X.C2DS
    public final AbstractC80713j1 BJj(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                AbstractC80713j1 abstractC80713j12 = A00.A01.A17;
                C14360o3.A06(abstractC80713j12);
                return abstractC80713j12;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = A00.A01;
        synchronized (c80693iy) {
            abstractC80713j1 = c80693iy.A17;
            C14360o3.A06(abstractC80713j1);
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final AbstractC80713j1 BJk(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                AbstractC80713j1 abstractC80713j12 = A00.A01.A2p;
                C14360o3.A06(abstractC80713j12);
                return abstractC80713j12;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = A00.A01;
        synchronized (c80693iy) {
            abstractC80713j1 = c80693iy.A2p;
            C14360o3.A06(abstractC80713j1);
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final AbstractC80713j1 BJl(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                AbstractC80713j1 abstractC80713j12 = A00.A01.A1A;
                C14360o3.A06(abstractC80713j12);
                return abstractC80713j12;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = A00.A01;
        synchronized (c80693iy) {
            abstractC80713j1 = c80693iy.A1A;
            C14360o3.A06(abstractC80713j1);
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final AbstractC80713j1 BJn(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                AbstractC80713j1 abstractC80713j12 = A00.A01.A1B;
                C14360o3.A06(abstractC80713j12);
                return abstractC80713j12;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = A00.A01;
        synchronized (c80693iy) {
            abstractC80713j1 = c80693iy.A1B;
            C14360o3.A06(abstractC80713j1);
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final AbstractC80713j1 BJp(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                AbstractC80713j1 abstractC80713j12 = A00.A01.A1G;
                C14360o3.A06(abstractC80713j12);
                return abstractC80713j12;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = A00.A01;
        synchronized (c80693iy) {
            abstractC80713j1 = c80693iy.A1G;
            C14360o3.A06(abstractC80713j1);
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final AbstractC80713j1 BJr(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                AbstractC80713j1 abstractC80713j12 = A00.A01.A1C;
                C14360o3.A06(abstractC80713j12);
                return abstractC80713j12;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = A00.A01;
        synchronized (c80693iy) {
            abstractC80713j1 = c80693iy.A1C;
            C14360o3.A06(abstractC80713j1);
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final AbstractC80713j1 BJw(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                AbstractC80713j1 abstractC80713j12 = A00.A01.A1D;
                C14360o3.A06(abstractC80713j12);
                return abstractC80713j12;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = A00.A01;
        synchronized (c80693iy) {
            abstractC80713j1 = c80693iy.A1D;
            C14360o3.A06(abstractC80713j1);
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final AbstractC80713j1 BJx(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                AbstractC80713j1 abstractC80713j12 = A00.A01.A1E;
                C14360o3.A06(abstractC80713j12);
                return abstractC80713j12;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = A00.A01;
        synchronized (c80693iy) {
            abstractC80713j1 = c80693iy.A1E;
            C14360o3.A06(abstractC80713j1);
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final AbstractC80713j1 BuV(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                AbstractC80713j1 abstractC80713j12 = A00.A01.A1I;
                C14360o3.A06(abstractC80713j12);
                return abstractC80713j12;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = A00.A01;
        synchronized (c80693iy) {
            abstractC80713j1 = c80693iy.A1I;
            C14360o3.A06(abstractC80713j1);
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final AbstractC80713j1 BuW(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                AbstractC80713j1 abstractC80713j12 = A00.A01.A1J;
                C14360o3.A06(abstractC80713j12);
                return abstractC80713j12;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = A00.A01;
        synchronized (c80693iy) {
            abstractC80713j1 = c80693iy.A1J;
            C14360o3.A06(abstractC80713j1);
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final AbstractC80713j1 C7F(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                AbstractC80713j1 abstractC80713j12 = A00.A01.A1L;
                C14360o3.A06(abstractC80713j12);
                return abstractC80713j12;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = A00.A01;
        synchronized (c80693iy) {
            abstractC80713j1 = c80693iy.A1L;
            C14360o3.A06(abstractC80713j1);
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final AbstractC80713j1 C7G(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                AbstractC80713j1 abstractC80713j12 = A00.A01.A1M;
                C14360o3.A06(abstractC80713j12);
                return abstractC80713j12;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = A00.A01;
        synchronized (c80693iy) {
            abstractC80713j1 = c80693iy.A1M;
            C14360o3.A06(abstractC80713j1);
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final AbstractC80713j1 C7T(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                AbstractC80713j1 abstractC80713j12 = A00.A01.A2q;
                C14360o3.A06(abstractC80713j12);
                return abstractC80713j12;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = A00.A01;
        synchronized (c80693iy) {
            abstractC80713j1 = c80693iy.A2q;
            C14360o3.A06(abstractC80713j1);
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final AbstractC80713j1 C7a(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                AbstractC80713j1 abstractC80713j12 = A00.A01.A1F;
                C14360o3.A06(abstractC80713j12);
                return abstractC80713j12;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = A00.A01;
        synchronized (c80693iy) {
            abstractC80713j1 = c80693iy.A1F;
            C14360o3.A06(abstractC80713j1);
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final AbstractC80713j1 C7k(C2ED c2ed) {
        AbstractC80713j1 abstractC80713j1;
        C81663kb A00 = A00(c2ed, this);
        if (((Boolean) A00.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = A00.A03.readLock();
            readLock.lock();
            try {
                AbstractC80713j1 abstractC80713j12 = A00.A01.A1N;
                C14360o3.A06(abstractC80713j12);
                return abstractC80713j12;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = A00.A01;
        synchronized (c80693iy) {
            abstractC80713j1 = c80693iy.A1N;
            C14360o3.A06(abstractC80713j1);
        }
        return abstractC80713j1;
    }

    @Override // X.C2DS
    public final void CoT(EnumC81843l3 enumC81843l3, DirectThreadKey directThreadKey) {
        int i;
        C4GV A0P = A0P(directThreadKey);
        if (A0P != null) {
            C81663kb c81663kb = A0P.A0I;
            C14360o3.A07(c81663kb);
            if (enumC81843l3 != c81663kb.Aiu()) {
                if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
                    ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
                    ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                    int i2 = 0;
                    if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                        i = reentrantReadWriteLock.getReadHoldCount();
                        for (int i3 = 0; i3 < i; i3++) {
                            readLock.unlock();
                        }
                    } else {
                        i = 0;
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        C80693iy c80693iy = c81663kb.A01;
                        if (c80693iy.A1O != enumC81843l3) {
                            c81663kb.EVH(true);
                        }
                        c80693iy.A1O = enumC81843l3;
                    } finally {
                        while (i2 < i) {
                            readLock.lock();
                            i2++;
                        }
                        writeLock.unlock();
                    }
                } else {
                    C80693iy c80693iy2 = c81663kb.A01;
                    synchronized (c80693iy2) {
                        if (c80693iy2.A1O != enumC81843l3) {
                            c81663kb.EVH(true);
                        }
                        c80693iy2.A1O = enumC81843l3;
                    }
                }
                FCS(directThreadKey);
            }
        }
    }

    @Override // X.C2DS
    public final void FBR(DirectThreadKey directThreadKey, String str, int i) {
        C83403nh BSh = BSh(directThreadKey, str);
        if (BSh != null) {
            synchronized (BSh) {
                List list = BSh.A26;
                if (list != null && !list.isEmpty()) {
                    ((C910143t) BSh.A26.get(0)).A0k = Integer.valueOf(i);
                } else {
                    BSh.A1G = Integer.valueOf(i);
                }
            }
        }
    }

    @Override // X.C2DS
    public final void FBU(String str, String str2, String str3) {
        C81663kb A0N = A0N(str);
        if (A0N != null) {
            C80693iy c80693iy = A0N.A01;
            Map map = c80693iy.A2E;
            if (map == null) {
                c80693iy.A2E = AbstractC06930Yk.A07(new C09530e4(str2, str3));
            } else if (str3.length() == 0) {
                map.remove(str2);
            } else {
                map.put(str2, str3);
            }
        }
        User A02 = AnonymousClass189.A00(this.A0A).A02(str2);
        if (A02 != null) {
            this.A06.E4s(new C36098FwY(A02, str3));
        }
    }

    @Override // X.C2DS
    public final void FBV(String str, String str2, String str3) {
        C81663kb A0N = A0N(str);
        if (A0N != null) {
            C80693iy c80693iy = A0N.A01;
            Map map = c80693iy.A2F;
            if (map == null) {
                c80693iy.A2F = AbstractC06930Yk.A07(new C09530e4(str2, str3));
            } else {
                map.put(str2, str3);
            }
        }
        this.A06.E4s(new C36086FwM(str3));
    }
}
