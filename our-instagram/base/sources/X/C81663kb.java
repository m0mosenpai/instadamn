package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.3kb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81663kb implements C2EC {
    public DirectThreadKey A00;
    public final C80693iy A01;
    public final C80693iy A02;
    public final ReentrantReadWriteLock A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;

    public C81663kb(UserSession userSession, C80693iy c80693iy) {
        C14360o3.A0B(userSession, 1);
        EnumC09460dv enumC09460dv = EnumC09460dv.A03;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C9E3(userSession, 4));
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new C9E3(userSession, 5));
        this.A01 = c80693iy;
        this.A05 = A00;
        this.A04 = A002;
        this.A03 = new ReentrantReadWriteLock();
        this.A02 = c80693iy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0140, code lost:
    
        if (r12.compare(r10, r9) < 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0148, code lost:
    
        if (X.C93404Gt.A01.compare(r10, r9) <= 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0158, code lost:
    
        if (r2 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x015b, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x015f, code lost:
    
        r19.A02 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x015d, code lost:
    
        r0 = r2.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0139, code lost:
    
        if (r9 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
    
        if (r14.compare(r13, r12) < 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        if (X.C93404Gt.A01.compare(r13, r12) <= 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        if (r8 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b9, code lost:
    
        r19.A02 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        r0 = r8.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0089, code lost:
    
        if (r12 == null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016f A[Catch: all -> 0x017d, TryCatch #1 {, blocks: (B:87:0x00f1, B:89:0x00fb, B:91:0x00ff, B:92:0x0101, B:94:0x0105, B:97:0x0110, B:99:0x0114, B:100:0x0116, B:102:0x011a, B:104:0x0120, B:106:0x012c, B:111:0x013c, B:113:0x0142, B:118:0x015f, B:119:0x015d, B:122:0x0165, B:125:0x016f, B:126:0x0171, B:127:0x0173, B:133:0x014f), top: B:86:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9 A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:11:0x003f, B:13:0x004b, B:15:0x004f, B:16:0x0051, B:18:0x0055, B:21:0x0060, B:23:0x0064, B:24:0x0066, B:26:0x006a, B:28:0x0070, B:30:0x007c, B:35:0x008c, B:37:0x0092, B:42:0x00b9, B:43:0x00b7, B:46:0x00bf, B:49:0x00c9, B:50:0x00cb, B:51:0x00cd, B:61:0x009f), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7 A[LOOP:1: B:52:0x00d5->B:53:0x00d7, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0N(X.C80993jT r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81663kb.A0N(X.3jT, java.lang.String):boolean");
    }

    public final boolean A0O(C80993jT c80993jT, String str, String str2) {
        int i;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c80993jT, 1);
        C14360o3.A0B(str2, 2);
        boolean z = true;
        int i2 = 0;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
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
                C81703kf c81703kf = c80993jT.A02;
                if (!C4GQ.A0B(this, str, ((AbstractC81003jU) c80993jT).A02, str2) || (c81703kf != null && !C4GQ.A0A(this, str, ((AbstractC81003jU) c80993jT).A02))) {
                    this.A01.A0w = c80993jT;
                } else {
                    z = false;
                }
                return z;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C81703kf c81703kf2 = c80993jT.A02;
            if (!C4GQ.A0B(this, str, ((AbstractC81003jU) c80993jT).A02, str2) || (c81703kf2 != null && !C4GQ.A0A(this, str, ((AbstractC81003jU) c80993jT).A02))) {
                c80693iy.A0w = c80993jT;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // X.C2EE
    public final String AzI(UserSession userSession) {
        String string;
        String string2;
        C14360o3.A0B(userSession, 0);
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                String str = this.A01.A1q;
                if (str != null) {
                    string2 = AbstractC23021Ah.A00(userSession).A01.getString(AnonymousClass001.A0R("direct_thread_draft_", str), null);
                } else {
                    string2 = null;
                }
                return string2;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            String str2 = c80693iy.A1q;
            if (str2 != null) {
                string = AbstractC23021Ah.A00(userSession).A01.getString(AnonymousClass001.A0R("direct_thread_draft_", str2), null);
            } else {
                string = null;
            }
        }
        return string;
    }

    @Override // X.C2EH
    public final boolean CLz(UserSession userSession) {
        Long l;
        C80993jT c80993jT;
        Long l2;
        C80993jT c80993jT2;
        boolean z = false;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C80693iy c80693iy = this.A01;
                C1118752z c1118752z = c80693iy.A1R;
                if (c1118752z != null && (l2 = c1118752z.A05) != null) {
                    long longValue = l2.longValue();
                    if (!C14360o3.A0K(c80693iy.A1U.getId(), c1118752z.A07)) {
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if ((C18U.A06(c06090Tz, userSession, 2342163292781551917L) || C18U.A06(c06090Tz, userSession, 36320283568775475L)) && ((c80993jT2 = c80693iy.A0w) != null || (c80993jT2 = (C80993jT) c80693iy.A21.get(c80693iy.A1U.getId())) != null)) {
                            String A02 = C4H6.A02(longValue, c1118752z.A08);
                            String str = ((AbstractC81003jU) c80993jT2).A02;
                            C14360o3.A07(str);
                            z = false;
                            if (AbstractC93414Gu.A00.compare(A02, str) > 0) {
                                z = true;
                            }
                        }
                    }
                }
                return z;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy2 = this.A01;
        synchronized (c80693iy2) {
            C1118752z c1118752z2 = c80693iy2.A1R;
            if (c1118752z2 != null && (l = c1118752z2.A05) != null) {
                long longValue2 = l.longValue();
                if (!C14360o3.A0K(c80693iy2.A1U.getId(), c1118752z2.A07)) {
                    C06090Tz c06090Tz2 = C06090Tz.A05;
                    if ((C18U.A06(c06090Tz2, userSession, 2342163292781551917L) || C18U.A06(c06090Tz2, userSession, 36320283568775475L)) && ((c80993jT = c80693iy2.A0w) != null || (c80993jT = (C80993jT) c80693iy2.A21.get(c80693iy2.A1U.getId())) != null)) {
                        String A022 = C4H6.A02(longValue2, c1118752z2.A08);
                        String str2 = ((AbstractC81003jU) c80993jT).A02;
                        C14360o3.A07(str2);
                        z = false;
                        if (AbstractC93414Gu.A00.compare(A022, str2) > 0) {
                            z = true;
                        }
                    }
                }
            }
        }
        return z;
    }

    @Override // X.C2EE
    public final boolean CWj(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        boolean z = true;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C81613kW c81613kW = this.A01.A0f;
                if (c81613kW != null) {
                    if (c81613kW.A03(userSession)) {
                        return z;
                    }
                }
                z = false;
                return z;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C81613kW c81613kW2 = c80693iy.A0f;
            if (c81613kW2 != null) {
                if (c81613kW2.A03(userSession)) {
                }
            }
            z = false;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        if (CWj(r4) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (CWj(r4) != false) goto L9;
     */
    @Override // X.C2EE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CWk(com.instagram.common.session.UserSession r4) {
        /*
            r3 = this;
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            X.0do r0 = r3.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto L32
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r1.lock()
            boolean r0 = r3.CWl()     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L28
            boolean r0 = r3.CWj(r4)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L29
        L28:
            r2 = 1
        L29:
            r1.unlock()
            return r2
        L2d:
            r0 = move-exception
            r1.unlock()
            throw r0
        L32:
            X.3iy r1 = r3.A01
            monitor-enter(r1)
            boolean r0 = r3.CWl()     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L41
            boolean r0 = r3.CWj(r4)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L42
        L41:
            r2 = 1
        L42:
            monitor-exit(r1)
            return r2
        L44:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81663kb.CWk(com.instagram.common.session.UserSession):boolean");
    }

    @Override // X.C2ED
    public final boolean Ccc(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str3, 2);
        return C4GQ.A0B(this, str, str2, str3);
    }

    @Override // X.C2EH
    public final boolean Cf8(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        boolean z = false;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                z = !C18U.A06(C06090Tz.A05, userSession, 36326399597885289L) ? true : true;
                return z;
            } finally {
                readLock.unlock();
            }
        }
        synchronized (this.A01) {
            z = !C18U.A06(C06090Tz.A05, userSession, 36326399597885289L) ? true : true;
        }
        return z;
    }

    @Override // X.C2EE
    public final boolean CfH(String str) {
        C14360o3.A0B(str, 0);
        return this.A01.A22.contains(str);
    }

    @Override // X.C2EE
    public final void EWN(boolean z) {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
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
                this.A01.A2X = true;
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c80693iy.A2X = true;
        }
    }

    private final C50679MYx A00() {
        String str;
        String str2;
        C50679MYx c50679MYx = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C50679MYx BLU = BLU();
                if (BLU != null && (str2 = BLU.A01) != null && BLU.A00 != null) {
                    if (!Ccc(this.A01.A1U.getId(), BLU.A00, str2)) {
                        c50679MYx = BLU;
                    }
                }
                return c50679MYx;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C50679MYx BLU2 = BLU();
            if (BLU2 != null && (str = BLU2.A01) != null && BLU2.A00 != null) {
                if (!Ccc(c80693iy.A1U.getId(), BLU2.A00, str)) {
                    c50679MYx = BLU2;
                }
            }
        }
        return c50679MYx;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.instagram.model.direct.DirectThreadKey, java.lang.Object] */
    private final DirectThreadKey A01() {
        C80693iy c80693iy = this.A01;
        String str = c80693iy.A1q;
        String str2 = c80693iy.A1t;
        List list = c80693iy.A29;
        C14360o3.A06(list);
        ArrayList A00 = DirectThreadKey.A00(C4GO.A01(list));
        ?? obj = new Object();
        obj.A00 = str;
        obj.A02 = A00;
        Collections.sort(A00);
        obj.A01 = str2;
        return obj;
    }

    private final HashMap A02() {
        HashMap hashMap;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return new HashMap(this.A01.A2G);
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            hashMap = new HashMap(c80693iy.A2G);
        }
        return hashMap;
    }

    public static final HashSet A03(UserSession userSession, C81663kb c81663kb, String str, String str2) {
        User CDl;
        String str3 = userSession.userId;
        HashSet hashSet = new HashSet();
        if (str2 != null) {
            for (Object obj : c81663kb.A01.A21.entrySet()) {
                C14360o3.A07(obj);
                Map.Entry entry = (Map.Entry) obj;
                AbstractC81003jU abstractC81003jU = (AbstractC81003jU) entry.getValue();
                if (!C14360o3.A0K(entry.getKey(), str3) && !C14360o3.A0K(entry.getKey(), str) && abstractC81003jU != null && C93404Gt.A01.compare(str2, abstractC81003jU.A02) <= 0 && ((CDl = c81663kb.CDl((String) entry.getKey())) != null || (CDl = AnonymousClass189.A00(userSession).A02((String) entry.getKey())) != null)) {
                    String A08 = AbstractC101904i3.A08(CDl);
                    C14360o3.A07(A08);
                    hashSet.add(new C206419By(CDl.Bhu(), A08, ((AbstractC81003jU) entry.getValue()).A00));
                }
            }
        }
        return hashSet;
    }

    public final C4H4 A04() {
        C4H4 c4h4;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C93404Gt c93404Gt = C93404Gt.A00;
                C80693iy c80693iy = this.A01;
                return new C4H4(c93404Gt, C93404Gt.A01(c80693iy.A1r, c80693iy.A2O, false), c93404Gt.A00);
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy2 = this.A01;
        synchronized (c80693iy2) {
            C93404Gt c93404Gt2 = C93404Gt.A00;
            c4h4 = new C4H4(c93404Gt2, C93404Gt.A01(c80693iy2.A1r, c80693iy2.A2O, false), c93404Gt2.A00);
        }
        return c4h4;
    }

    public final C4H4 A05() {
        C4H4 c4h4;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C93404Gt c93404Gt = C93404Gt.A00;
                Object obj = c93404Gt.A01;
                C80693iy c80693iy = this.A01;
                return new C4H4(c93404Gt, obj, C93404Gt.A00(c80693iy.A1x, c80693iy.A2M));
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy2 = this.A01;
        synchronized (c80693iy2) {
            C93404Gt c93404Gt2 = C93404Gt.A00;
            c4h4 = new C4H4(c93404Gt2, c93404Gt2.A01, C93404Gt.A00(c80693iy2.A1x, c80693iy2.A2M));
        }
        return c4h4;
    }

    public final C83403nh A06() {
        C83403nh c83403nh;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0j;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c83403nh = c80693iy.A0j;
        }
        return c83403nh;
    }

    public final void A07(int i) {
        int i2;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
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
                this.A01.A0M = i;
                return;
            } finally {
                while (i3 < i2) {
                    readLock.lock();
                    i3++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c80693iy.A0M = i;
        }
    }

    public final void A09(C83403nh c83403nh) {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
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
                this.A01.A0g = c83403nh;
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c80693iy.A0g = c83403nh;
        }
    }

    public final void A0A(C83403nh c83403nh) {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
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
                this.A01.A0h = c83403nh;
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c80693iy.A0h = c83403nh;
        }
    }

    public final void A0B(C83403nh c83403nh) {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
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
                this.A01.A0i = c83403nh;
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c80693iy.A0i = c83403nh;
        }
    }

    public final void A0C(C83403nh c83403nh) {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
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
                this.A01.A0k = c83403nh;
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c80693iy.A0k = c83403nh;
        }
    }

    public final void A0D(String str) {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
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
                C80693iy c80693iy = this.A01;
                if (!C14360o3.A0K(c80693iy.A1q, str)) {
                    c80693iy.A1q = str;
                    this.A00 = null;
                    FPI fpi = c80693iy.A0d;
                    if (fpi != null) {
                        fpi.A00();
                    }
                }
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy2 = this.A01;
        synchronized (c80693iy2) {
            if (!C14360o3.A0K(c80693iy2.A1q, str)) {
                c80693iy2.A1q = str;
                this.A00 = null;
                FPI fpi2 = c80693iy2.A0d;
                if (fpi2 != null) {
                    fpi2.A00();
                }
            }
        }
    }

    public final void A0E(String str) {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
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
                this.A01.A1r = str;
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c80693iy.A1r = str;
        }
    }

    public final void A0F(String str) {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
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
                this.A01.A1x = str;
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c80693iy.A1x = str;
        }
    }

    public final void A0G(List list) {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
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
                this.A01.A24 = list;
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c80693iy.A24 = list;
        }
    }

    public final void A0H(boolean z) {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
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
                this.A01.A2J = z;
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c80693iy.A2J = z;
        }
    }

    public final void A0I(boolean z) {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
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
                this.A01.A2M = z;
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c80693iy.A2M = z;
        }
    }

    public final void A0J(boolean z) {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
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
                this.A01.A2O = z;
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c80693iy.A2O = z;
        }
    }

    public final void A0K(boolean z) {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
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
                this.A01.A2f = z;
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c80693iy.A2f = z;
        }
    }

    public final void A0L(boolean z) {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
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
                this.A01.A1I.A03(Boolean.valueOf(z));
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c80693iy.A1I.A03(Boolean.valueOf(z));
        }
    }

    public final boolean A0M() {
        boolean z = false;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C81613kW c81613kW = this.A01.A0f;
                if (c81613kW != null) {
                    z = c81613kW.A02();
                }
                return z;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C81613kW c81613kW2 = c80693iy.A0f;
            if (c81613kW2 != null) {
                z = c81613kW2.A02();
            }
        }
        return z;
    }

    @Override // X.C2ED
    public final int AYp() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A00;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            i = c80693iy.A00;
        }
        return i;
    }

    @Override // X.C2EF
    public final C111214zj AZ7() {
        C111214zj c111214zj;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0u;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c111214zj = c80693iy.A0u;
        }
        return c111214zj;
    }

    @Override // X.C2ED, X.C2EE
    public final List Aa2() {
        List list;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                List list2 = this.A01.A22;
                C14360o3.A06(list2);
                return list2;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            list = c80693iy.A22;
            C14360o3.A06(list);
        }
        return list;
    }

    @Override // X.C2EF
    public final int Aaf() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A01;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            i = c80693iy.A01;
        }
        return i;
    }

    @Override // X.C2EE
    public final int AdZ() {
        int i = 0;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C81543kP c81543kP = this.A01.A0t;
                if (c81543kP != null) {
                    i = c81543kP.A00;
                }
                return i;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C81543kP c81543kP2 = c80693iy.A0t;
            if (c81543kP2 != null) {
                i = c81543kP2.A00;
            }
        }
        return i;
    }

    @Override // X.C2EF
    public final C81613kW Aic() {
        C81613kW c81613kW;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0f;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c81613kW = c80693iy.A0f;
        }
        return c81613kW;
    }

    @Override // X.C2EE
    public final EnumC81843l3 Aiu() {
        EnumC81843l3 enumC81843l3;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1O;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            enumC81843l3 = c80693iy.A1O;
        }
        return enumC81843l3;
    }

    @Override // X.C2EE
    public final Boolean An1() {
        Boolean bool = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C81543kP c81543kP = this.A01.A0t;
                if (c81543kP != null) {
                    bool = Boolean.valueOf(c81543kP.A0H);
                }
                return bool;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C81543kP c81543kP2 = c80693iy.A0t;
            if (c81543kP2 != null) {
                bool = Boolean.valueOf(c81543kP2.A0H);
            }
        }
        return bool;
    }

    @Override // X.C2EE
    public final C32067E6t An6() {
        return this.A01.A11;
    }

    @Override // X.C2EE, X.C2EF
    public final boolean Aqm() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2J;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            z = c80693iy.A2J;
        }
        return z;
    }

    @Override // X.C2EE
    public final String Asv() {
        String str = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C81543kP c81543kP = this.A01.A0t;
                if (c81543kP != null) {
                    str = c81543kP.A07;
                }
                return str;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C81543kP c81543kP2 = c80693iy.A0t;
            if (c81543kP2 != null) {
                str = c81543kP2.A07;
            }
        }
        return str;
    }

    @Override // X.C2EE
    public final ImageUrl At1() {
        ImageUrl imageUrl = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C81543kP c81543kP = this.A01.A0t;
                if (c81543kP != null) {
                    imageUrl = c81543kP.A04;
                }
                return imageUrl;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C81543kP c81543kP2 = c80693iy.A0t;
            if (c81543kP2 != null) {
                imageUrl = c81543kP2.A04;
            }
        }
        return imageUrl;
    }

    @Override // X.C2EF
    public final CreatorSubscriberThreadInfo At4() {
        CreatorSubscriberThreadInfo creatorSubscriberThreadInfo;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1Q;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            creatorSubscriberThreadInfo = c80693iy.A1Q;
        }
        return creatorSubscriberThreadInfo;
    }

    @Override // X.C2EE
    public final User At5() {
        User user = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C81543kP c81543kP = this.A01.A0t;
                if (c81543kP != null) {
                    user = (User) A02().get(c81543kP.A07);
                }
                return user;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C81543kP c81543kP2 = c80693iy.A0t;
            if (c81543kP2 != null) {
                user = (User) A02().get(c81543kP2.A07);
            }
        }
        return user;
    }

    @Override // X.C2EE
    public final String At6() {
        String str = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C81543kP c81543kP = this.A01.A0t;
                if (c81543kP != null) {
                    str = c81543kP.A08;
                }
                return str;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C81543kP c81543kP2 = c80693iy.A0t;
            if (c81543kP2 != null) {
                str = c81543kP2.A08;
            }
        }
        return str;
    }

    @Override // X.C2EE
    public final C9BW Atx() {
        C9BW c9bw;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0R;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c9bw = c80693iy.A0R;
        }
        return c9bw;
    }

    @Override // X.C2EE
    public final boolean Av2() {
        Boolean CZk = this.A01.A1U.A03.CZk();
        if (CZk != null) {
            return CZk.booleanValue();
        }
        return false;
    }

    @Override // X.C2ED
    public final C80993jT Av3(String str) {
        C80993jT c80993jT;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C80693iy c80693iy = this.A01;
                C80993jT c80993jT2 = (C80993jT) c80693iy.A21.get(str);
                if (c80993jT2 != null && c80993jT2.A01()) {
                    C80993jT c80993jT3 = c80693iy.A0w;
                    if (c80993jT3 != null) {
                        if (C93404Gt.A01.compare(((AbstractC81003jU) c80993jT3).A02, ((AbstractC81003jU) c80993jT2).A02) >= 0) {
                            c80993jT2 = c80993jT3;
                        }
                    }
                } else {
                    c80993jT2 = c80693iy.A0w;
                }
                return c80993jT2;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy2 = this.A01;
        synchronized (c80693iy2) {
            c80993jT = (C80993jT) c80693iy2.A21.get(str);
            if (c80993jT != null && c80993jT.A01()) {
                C80993jT c80993jT4 = c80693iy2.A0w;
                if (c80993jT4 != null) {
                    if (C93404Gt.A01.compare(((AbstractC81003jU) c80993jT4).A02, ((AbstractC81003jU) c80993jT).A02) >= 0) {
                        c80993jT = c80993jT4;
                    }
                }
            } else {
                c80993jT = c80693iy2.A0w;
            }
        }
        return c80993jT;
    }

    @Override // X.C2EF
    public final String AvH() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return (String) this.A01.A15.A01();
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            str = (String) c80693iy.A15.A01();
        }
        return str;
    }

    @Override // X.C2EF
    public final C125805mV Axa() {
        C125805mV c125805mV;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0s;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c125805mV = c80693iy.A0s;
        }
        return c125805mV;
    }

    @Override // X.C2EF
    public final List Axh() {
        List list;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A23;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            list = c80693iy.A23;
        }
        return list;
    }

    @Override // X.C2EE, X.C2EF
    public final boolean Ay8() {
        boolean z = false;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C1118752z c1118752z = this.A01.A1R;
                if (c1118752z != null) {
                    z = c1118752z.A08;
                }
                return z;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C1118752z c1118752z2 = c80693iy.A1R;
            if (c1118752z2 != null) {
                z = c1118752z2.A08;
            }
        }
        return z;
    }

    @Override // X.C2EE, X.C2EF
    public final C1118752z Ay9() {
        C1118752z c1118752z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1R;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c1118752z = c80693iy.A1R;
        }
        return c1118752z;
    }

    @Override // X.C2EF
    public final L1W B2W() {
        Long l;
        Long l2;
        L1W l1w = null;
        Long l3 = null;
        L1W A00 = null;
        Long l4 = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C1118752z c1118752z = this.A01.A1R;
                if (c1118752z != null && c1118752z.A08) {
                    if (c1118752z.A02 != null) {
                        l2 = Long.valueOf(r0.intValue());
                    } else {
                        l2 = null;
                    }
                    if (c1118752z.A03 != null) {
                        l3 = Long.valueOf(r0.intValue());
                    }
                    A00 = LC9.A01(l2, l3);
                } else if (CWO()) {
                    A00 = LC9.A00();
                }
                return A00;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C1118752z c1118752z2 = c80693iy.A1R;
            if (c1118752z2 != null && c1118752z2.A08) {
                if (c1118752z2.A02 != null) {
                    l = Long.valueOf(r0.intValue());
                } else {
                    l = null;
                }
                if (c1118752z2.A03 != null) {
                    l4 = Long.valueOf(r0.intValue());
                }
                l1w = LC9.A01(l, l4);
            } else if (CWO()) {
                l1w = LC9.A00();
            }
        }
        return l1w;
    }

    @Override // X.C2ED
    public final int B7A() {
        int intValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A01 = this.A01.A1L.A01();
                C14360o3.A07(A01);
                return ((Number) A01).intValue();
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            Object A012 = c80693iy.A1L.A01();
            C14360o3.A07(A012);
            intValue = ((Number) A012).intValue();
        }
        return intValue;
    }

    @Override // X.C2EE
    public final C45127Jxw B8D(UserSession userSession) {
        C45127Jxw A00;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return C7DH.A00(userSession, this.A01.A1q);
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            A00 = C7DH.A00(userSession, c80693iy.A1q);
        }
        return A00;
    }

    @Override // X.C2EE, X.C2EF
    public final String BAY() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1k;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            str = c80693iy.A1k;
        }
        return str;
    }

    @Override // X.C2EE
    public final boolean BBH() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2L;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            z = c80693iy.A2L;
        }
        return z;
    }

    @Override // X.C2EE
    public final boolean BBy() {
        boolean z = true;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                if (this.A01.A0g == null) {
                    z = false;
                }
                return z;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            if (c80693iy.A0g == null) {
                z = false;
            }
        }
        return z;
    }

    @Override // X.C2EE
    public final boolean BCW() {
        return this.A01.A2P;
    }

    @Override // X.C2ED, X.C2EE
    public final int BI1() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A06;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            i = c80693iy.A06;
        }
        return i;
    }

    @Override // X.C2EF
    public final C133205zm BIW() {
        C133205zm c133205zm;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0z;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c133205zm = c80693iy.A0z;
        }
        return c133205zm;
    }

    @Override // X.C2EE
    public final List BJR() {
        List list = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C81543kP c81543kP = this.A01.A0t;
                if (c81543kP != null) {
                    list = c81543kP.A0B;
                }
                return list;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C81543kP c81543kP2 = c80693iy.A0t;
            if (c81543kP2 != null) {
                list = c81543kP2.A0B;
            }
        }
        return list;
    }

    @Override // X.C2EE
    public final List BJS() {
        List list = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C81543kP c81543kP = this.A01.A0t;
                if (c81543kP != null) {
                    list = c81543kP.A0C;
                }
                return list;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C81543kP c81543kP2 = c80693iy.A0t;
            if (c81543kP2 != null) {
                list = c81543kP2.A0C;
            }
        }
        return list;
    }

    @Override // X.C2EF
    public final List BJT() {
        List list;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A25;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            list = c80693iy.A25;
        }
        return list;
    }

    @Override // X.C2EG
    public final User BJV() {
        User user;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1V;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            user = c80693iy.A1V;
        }
        return user;
    }

    @Override // X.C2ED
    public final Boolean BJZ() {
        Boolean bool;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A01 = this.A01.A18.A01();
                C14360o3.A07(A01);
                return (Boolean) A01;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            Object A012 = c80693iy.A18.A01();
            C14360o3.A07(A012);
            bool = (Boolean) A012;
        }
        return bool;
    }

    @Override // X.C2EE
    public final boolean BJf() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2X;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            z = c80693iy.A2X;
        }
        return z;
    }

    @Override // X.C2EE
    public final List BKM() {
        List list = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C81543kP c81543kP = this.A01.A0t;
                if (c81543kP != null) {
                    list = c81543kP.A0D;
                }
                return list;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C81543kP c81543kP2 = c80693iy.A0t;
            if (c81543kP2 != null) {
                list = c81543kP2.A0D;
            }
        }
        return list;
    }

    @Override // X.C2EE
    public final List BKN() {
        List list = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C81543kP c81543kP = this.A01.A0t;
                if (c81543kP != null) {
                    list = c81543kP.A0E;
                }
                return list;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C81543kP c81543kP2 = c80693iy.A0t;
            if (c81543kP2 != null) {
                list = c81543kP2.A0E;
            }
        }
        return list;
    }

    @Override // X.C2EE
    /* renamed from: BKa, reason: merged with bridge method [inline-methods] */
    public final DirectThreadKey BKb() {
        DirectThreadKey A01;
        DirectThreadKey A012;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                if (((Boolean) this.A04.getValue()).booleanValue()) {
                    A012 = this.A00;
                    if (A012 == null) {
                        A012 = A01();
                        this.A00 = A012;
                    }
                } else {
                    A012 = A01();
                }
                return A012;
            } finally {
                readLock.unlock();
            }
        }
        synchronized (this.A01) {
            if (((Boolean) this.A04.getValue()).booleanValue()) {
                A01 = this.A00;
                if (A01 == null) {
                    A01 = A01();
                    this.A00 = A01;
                }
            } else {
                A01 = A01();
            }
        }
        return A01;
    }

    @Override // X.C2EH
    public final long BLF() {
        long j;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0N;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            j = c80693iy.A0N;
        }
        return j;
    }

    @Override // X.C2EE
    public final E6W BLR() {
        return this.A01.A12;
    }

    @Override // X.C2EH
    public final C50679MYx BLU() {
        C50679MYx c50679MYx = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C51755Mte c51755Mte = this.A01.A0W;
                if (c51755Mte != null) {
                    c50679MYx = (C50679MYx) c51755Mte.A00;
                }
                return c50679MYx;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C51755Mte c51755Mte2 = c80693iy.A0W;
            if (c51755Mte2 != null) {
                c50679MYx = (C50679MYx) c51755Mte2.A00;
            }
        }
        return c50679MYx;
    }

    @Override // X.C2ED
    public final String BLW() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1l;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            str = c80693iy.A1l;
        }
        return str;
    }

    @Override // X.C2EH
    public final C83403nh BLX() {
        C83403nh c83403nh;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0g;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c83403nh = c80693iy.A0g;
        }
        return c83403nh;
    }

    @Override // X.C2EH
    public final C83403nh BLY() {
        C83403nh c83403nh;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0h;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c83403nh = c80693iy.A0h;
        }
        return c83403nh;
    }

    @Override // X.C2EH
    public final C83403nh BLr() {
        C83403nh c83403nh;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0k;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c83403nh = c80693iy.A0k;
        }
        return c83403nh;
    }

    @Override // X.C2EH
    public final C83403nh BLs() {
        C83403nh c83403nh;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0l;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c83403nh = c80693iy.A0l;
        }
        return c83403nh;
    }

    @Override // X.C2EH
    public final C83403nh BM6() {
        C83403nh c83403nh;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0p;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c83403nh = c80693iy.A0p;
        }
        return c83403nh;
    }

    @Override // X.C2EF
    public final List BMx() {
        List unmodifiableList;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                List unmodifiableList2 = Collections.unmodifiableList(this.A01.A26);
                C14360o3.A07(unmodifiableList2);
                return unmodifiableList2;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            unmodifiableList = Collections.unmodifiableList(c80693iy.A26);
            C14360o3.A07(unmodifiableList);
        }
        return unmodifiableList;
    }

    @Override // X.C2ED, X.C2EE
    public final Integer BN6() {
        Integer num;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Integer num2 = this.A01.A1h;
                C14360o3.A06(num2);
                return num2;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            num = c80693iy.A1h;
            C14360o3.A06(num);
        }
        return num;
    }

    @Override // X.C2EE
    public final String BNA() {
        return this.A01.A1m;
    }

    @Override // X.C2EF
    public final int BOU() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A07;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            i = c80693iy.A07;
        }
        return i;
    }

    @Override // X.C2ED
    public final int BSB() {
        int i = 1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                if (C7g() == 29) {
                    C81543kP c81543kP = this.A01.A0t;
                    if (c81543kP == null) {
                        C0K8.A0E("DirectThreadSummary", "Metadata should not be null for broadcast channels");
                    } else {
                        i = c81543kP.A02;
                    }
                } else {
                    i = 1 + BSH().size();
                }
                return i;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            if (C7g() == 29) {
                C81543kP c81543kP2 = c80693iy.A0t;
                if (c81543kP2 == null) {
                    C0K8.A0E("DirectThreadSummary", "Metadata should not be null for broadcast channels");
                } else {
                    i = c81543kP2.A02;
                }
            } else {
                i = 1 + BSH().size();
            }
        }
        return i;
    }

    @Override // X.C2ED
    public final List BSD() {
        List list;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                List list2 = this.A01.A27;
                C14360o3.A06(list2);
                return list2;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            list = c80693iy.A27;
            C14360o3.A06(list);
        }
        return list;
    }

    @Override // X.C2ED
    public final ArrayList BSE() {
        ArrayList arrayList;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : this.A01.A27) {
                    C14360o3.A07(obj);
                    arrayList2.add(Long.valueOf(Long.parseLong((String) obj)));
                }
                return arrayList2;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            arrayList = new ArrayList();
            for (Object obj2 : c80693iy.A27) {
                C14360o3.A07(obj2);
                arrayList.add(Long.valueOf(Long.parseLong((String) obj2)));
            }
        }
        return arrayList;
    }

    @Override // X.C2ED
    public final List BSF() {
        List list;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                List list2 = this.A01.A28;
                C14360o3.A06(list2);
                return list2;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            list = c80693iy.A28;
            C14360o3.A06(list);
        }
        return list;
    }

    @Override // X.C2EE, X.C2EF, X.C2EG
    public final List BSH() {
        List list;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                List list2 = this.A01.A29;
                C14360o3.A06(list2);
                return list2;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            list = c80693iy.A29;
            C14360o3.A06(list);
        }
        return list;
    }

    @Override // X.C2EE
    public final User BT1() {
        User A05;
        User A052;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                if (CVQ()) {
                    A052 = BJV();
                } else {
                    A052 = C4GQ.A05(this);
                }
                return A052;
            } finally {
                readLock.unlock();
            }
        }
        synchronized (this.A01) {
            if (CVQ()) {
                A05 = BJV();
            } else {
                A05 = C4GQ.A05(this);
            }
        }
        return A05;
    }

    @Override // X.C2ED, X.C2EE
    public final int BT2() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A08;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            i = c80693iy.A08;
        }
        return i;
    }

    @Override // X.C2EE
    public final Map BX8() {
        return this.A01.A2E;
    }

    @Override // X.C2ED
    public final int BXP() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A09;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            i = c80693iy.A09;
        }
        return i;
    }

    @Override // X.C2EF
    public final C9BO BXU() {
        C9BO c9bo;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0Q;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c9bo = c80693iy.A0Q;
        }
        return c9bo;
    }

    @Override // X.C2ED
    public final int BYJ() {
        int size;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A29.size() + 1;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            size = c80693iy.A29.size() + 1;
        }
        return size;
    }

    @Override // X.C2EH
    public final C83403nh BYi() {
        C83403nh c83403nh;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0q;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c83403nh = c80693iy.A0q;
        }
        return c83403nh;
    }

    @Override // X.C2EE, X.C2EF
    public final C50679MYx BYw() {
        C50679MYx c50679MYx;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0b;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c50679MYx = c80693iy.A0b;
        }
        return c50679MYx;
    }

    @Override // X.C2EE
    public final User Ba5() {
        User A05;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return C4GQ.A05(this);
            } finally {
                readLock.unlock();
            }
        }
        synchronized (this.A01) {
            A05 = C4GQ.A05(this);
        }
        return A05;
    }

    @Override // X.C2EE
    public final String Ba7() {
        String str = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                User A05 = C4GQ.A05(this);
                if (A05 != null) {
                    str = A05.getFullName();
                }
                return str;
            } finally {
                readLock.unlock();
            }
        }
        synchronized (this.A01) {
            User A052 = C4GQ.A05(this);
            if (A052 != null) {
                str = A052.getFullName();
            }
        }
        return str;
    }

    @Override // X.C2EE
    public final String Ba8() {
        String str = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                User A05 = C4GQ.A05(this);
                if (A05 != null) {
                    str = A05.B8y();
                }
                return str;
            } finally {
                readLock.unlock();
            }
        }
        synchronized (this.A01) {
            User A052 = C4GQ.A05(this);
            if (A052 != null) {
                str = A052.B8y();
            }
        }
        return str;
    }

    @Override // X.C2EE
    public final String BaA() {
        String str = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                User A05 = C4GQ.A05(this);
                if (A05 != null) {
                    str = A05.getId();
                }
                return str;
            } finally {
                readLock.unlock();
            }
        }
        synchronized (this.A01) {
            User A052 = C4GQ.A05(this);
            if (A052 != null) {
                str = A052.getId();
            }
        }
        return str;
    }

    @Override // X.C2EF
    public final C9BW Bcb() {
        C9BW c9bw;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0S;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c9bw = c80693iy.A0S;
        }
        return c9bw;
    }

    @Override // X.C2ED
    public final List BdI() {
        List list;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2A;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            list = c80693iy.A2A;
        }
        return list;
    }

    @Override // X.C2ED
    public final long BdM() {
        long j;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0O;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            j = c80693iy.A0O;
        }
        return j;
    }

    @Override // X.C2EF
    public final C31200Dnj BhT() {
        C31200Dnj c31200Dnj;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0Y;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c31200Dnj = c80693iy.A0Y;
        }
        return c31200Dnj;
    }

    @Override // X.C2EF
    public final int Bkp() {
        int intValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A01 = this.A01.A1H.A01();
                C14360o3.A07(A01);
                return ((Number) A01).intValue();
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            Object A012 = c80693iy.A1H.A01();
            C14360o3.A07(A012);
            intValue = ((Number) A012).intValue();
        }
        return intValue;
    }

    @Override // X.C2EE, X.C2EF
    public final List Bky() {
        List list;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2B;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            list = c80693iy.A2B;
        }
        return list;
    }

    @Override // X.C2EE
    public final String BlE() {
        return this.A01.A1n;
    }

    @Override // X.C2EF
    public final int BmF() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0B;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            i = c80693iy.A0B;
        }
        return i;
    }

    @Override // X.C2EE
    public final int BqW() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0E;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            i = c80693iy.A0E;
        }
        return i;
    }

    @Override // X.C2ED
    public final int Bs9() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0F;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            i = c80693iy.A0F;
        }
        return i;
    }

    @Override // X.C2EF
    public final String BuX() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return (String) this.A01.A1J.A01();
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            str = (String) c80693iy.A1J.A01();
        }
        return str;
    }

    @Override // X.C2EF
    public final int BuY() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0G;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            i = c80693iy.A0G;
        }
        return i;
    }

    @Override // X.C2EE, X.C2EF
    public final SmartSuggestion Bxt() {
        SmartSuggestion smartSuggestion;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1T;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            smartSuggestion = c80693iy.A1T;
        }
        return smartSuggestion;
    }

    @Override // X.C2ED
    public final C9BH ByD() {
        C9BH c9bh;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0P;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c9bh = c80693iy.A0P;
        }
        return c9bh;
    }

    @Override // X.C2EE
    public final List ByV() {
        List list = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C81543kP c81543kP = this.A01.A0t;
                if (c81543kP != null) {
                    list = c81543kP.A0F;
                }
                return list;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C81543kP c81543kP2 = c80693iy.A0t;
            if (c81543kP2 != null) {
                list = c81543kP2.A0F;
            }
        }
        return list;
    }

    @Override // X.C2EF
    public final EnumC46982Dm C4i() {
        EnumC46982Dm enumC46982Dm;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1S;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            enumC46982Dm = c80693iy.A1S;
        }
        return enumC46982Dm;
    }

    @Override // X.C2EF
    public final C51593Mql C58() {
        C51593Mql c51593Mql;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0V;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c51593Mql = c80693iy.A0V;
        }
        return c51593Mql;
    }

    @Override // X.C2EF
    public final DirectThreadThemeInfo C72() {
        DirectThreadThemeInfo directThreadThemeInfo;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A01 = this.A01.A1N.A01();
                C14360o3.A07(A01);
                DirectThreadThemeInfo directThreadThemeInfo2 = (DirectThreadThemeInfo) A01;
                if (C14360o3.A0K(directThreadThemeInfo2.A0o, AbstractC125795mU.A00().A0o)) {
                    directThreadThemeInfo2 = AbstractC125795mU.A00();
                } else if (directThreadThemeInfo2.A02() == 0) {
                    C0w9.A03("DirectThreadSummary", "Theme's light fallback color is not set, returning default theme");
                    directThreadThemeInfo2 = AbstractC125795mU.A00();
                }
                return directThreadThemeInfo2;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            Object A012 = c80693iy.A1N.A01();
            C14360o3.A07(A012);
            directThreadThemeInfo = (DirectThreadThemeInfo) A012;
            if (C14360o3.A0K(directThreadThemeInfo.A0o, AbstractC125795mU.A00().A0o)) {
                directThreadThemeInfo = AbstractC125795mU.A00();
            } else if (directThreadThemeInfo.A02() == 0) {
                C0w9.A03("DirectThreadSummary", "Theme's light fallback color is not set, returning default theme");
                directThreadThemeInfo = AbstractC125795mU.A00();
            }
        }
        return directThreadThemeInfo;
    }

    @Override // X.C2ED
    public final List C7A() {
        List list;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2C;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            list = c80693iy.A2C;
        }
        return list;
    }

    @Override // X.C2EE
    public final int C7C() {
        int B7A;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return B7A();
            } finally {
                readLock.unlock();
            }
        }
        synchronized (this.A01) {
            B7A = B7A();
        }
        return B7A;
    }

    @Override // X.C2ED, X.C2EE, X.C2EF
    public final String C7I() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1q;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            str = c80693iy.A1q;
        }
        return str;
    }

    @Override // X.C2ED
    public final C106414qv C7L() {
        C106414qv c106414qv;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A10;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c106414qv = c80693iy.A10;
        }
        return c106414qv;
    }

    @Override // X.C2ED
    public final Long C7O() {
        long j;
        Long valueOf;
        Long l;
        long j2;
        Long l2;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                if (!CVQ()) {
                    C81613kW Aic = Aic();
                    boolean z = true;
                    if (Aic == null || (Aic.A01 & 4) != 4) {
                        z = false;
                    }
                    if (!z) {
                        if (Ccj()) {
                            Long BTC = this.A01.A1U.BTC();
                            if (BTC == null) {
                                BTC = C2ED.A00;
                            }
                            C14360o3.A0A(BTC);
                            j2 = BTC.longValue();
                        } else {
                            String str = (String) AbstractC001800i.A0J(BSF());
                            if (CRD() && !CX1() && !CPl() && !CS1() && BSF().size() == 1 && str != null) {
                                l2 = AbstractC003100w.A0k(10, str);
                                if (l2 == null) {
                                    l2 = C2ED.A00;
                                }
                            } else {
                                l2 = C2ED.A00;
                            }
                            C14360o3.A0A(l2);
                            j2 = l2.longValue();
                        }
                        return Long.valueOf(j2);
                    }
                }
                Long l3 = this.A01.A1i;
                if (l3 != null) {
                    j2 = l3.longValue();
                    if (j2 > 0) {
                        return Long.valueOf(j2);
                    }
                }
                C14360o3.A0A(C2ED.A00);
                j2 = -1;
                return Long.valueOf(j2);
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            if (!CVQ()) {
                C81613kW Aic2 = Aic();
                boolean z2 = true;
                if (Aic2 == null || (Aic2.A01 & 4) != 4) {
                    z2 = false;
                }
                if (!z2) {
                    if (Ccj()) {
                        Long BTC2 = c80693iy.A1U.BTC();
                        if (BTC2 == null) {
                            BTC2 = C2ED.A00;
                        }
                        C14360o3.A0A(BTC2);
                        j = BTC2.longValue();
                    } else {
                        String str2 = (String) AbstractC001800i.A0J(BSF());
                        if (CRD() && !CX1() && !CPl() && !CS1() && BSF().size() == 1 && str2 != null) {
                            l = AbstractC003100w.A0k(10, str2);
                            if (l == null) {
                                l = C2ED.A00;
                            }
                        } else {
                            l = C2ED.A00;
                        }
                        C14360o3.A0A(l);
                        j = l.longValue();
                    }
                    valueOf = Long.valueOf(j);
                }
            }
            Long l4 = c80693iy.A1i;
            if (l4 != null) {
                j = l4.longValue();
                if (j > 0) {
                    valueOf = Long.valueOf(j);
                }
            }
            C14360o3.A0A(C2ED.A00);
            j = -1;
            valueOf = Long.valueOf(j);
        }
        return valueOf;
    }

    @Override // X.C2ED
    public final int C7S() {
        int intValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A01 = this.A01.A2q.A01();
                C14360o3.A07(A01);
                return ((Number) A01).intValue();
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            Object A012 = c80693iy.A2q.A01();
            C14360o3.A07(A012);
            intValue = ((Number) A012).intValue();
        }
        return intValue;
    }

    @Override // X.C2ED
    public final String C7V() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1r;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            str = c80693iy.A1r;
        }
        return str;
    }

    @Override // X.C2ED, X.C2EE
    public final int C7g() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0I;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            i = c80693iy.A0I;
        }
        return i;
    }

    @Override // X.C2ED, X.C2EE, X.C2EF
    public final String C7l() {
        String str;
        Map map;
        String str2;
        Map map2;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C80693iy c80693iy = this.A01;
                if (C14360o3.A0K(c80693iy.A1Z, false) && c80693iy.A29.size() == 1 && (map2 = c80693iy.A2E) != null && !map2.isEmpty()) {
                    str2 = (String) c80693iy.A2E.get(((User) c80693iy.A29.get(0)).getId());
                } else {
                    str2 = c80693iy.A1s;
                }
                return str2;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy2 = this.A01;
        synchronized (c80693iy2) {
            if (C14360o3.A0K(c80693iy2.A1Z, false) && c80693iy2.A29.size() == 1 && (map = c80693iy2.A2E) != null && !map.isEmpty()) {
                str = (String) c80693iy2.A2E.get(((User) c80693iy2.A29.get(0)).getId());
            } else {
                str = c80693iy2.A1s;
            }
        }
        return str;
    }

    @Override // X.C2EF
    public final HashMap C7n() {
        HashMap hashMap;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A20;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            hashMap = c80693iy.A20;
        }
        return hashMap;
    }

    @Override // X.C2ED, X.C2EE, X.C2EF
    public final String C7q() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1t;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            str = c80693iy.A1t;
        }
        return str;
    }

    @Override // X.C2EF
    public final int CBz() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0K;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            i = c80693iy.A0K;
        }
        return i;
    }

    @Override // X.C2EE, X.C2EF
    public final Long CCq() {
        Long l = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                String str = this.A01.A1u;
                if (str != null) {
                    l = AbstractC003100w.A0k(10, str);
                }
                return l;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            String str2 = c80693iy.A1u;
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            }
        }
        return l;
    }

    @Override // X.C2ED
    public final int CD0() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0M;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            i = c80693iy.A0M;
        }
        return i;
    }

    @Override // X.C2ED, X.C2EG
    public final User CDl(String str) {
        User user;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return (User) this.A01.A2G.get(str);
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            user = (User) c80693iy.A2G.get(str);
        }
        return user;
    }

    @Override // X.C2EG
    public final User CDm(String str, String str2) {
        User user = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                if (str != null) {
                    user = CDl(str);
                } else if (str2 != null) {
                    for (Object obj : this.A01.A2G.values()) {
                        C14360o3.A07(obj);
                        User user2 = (User) obj;
                        if (str2.equals(String.valueOf(user2.BTC()))) {
                            return user2;
                        }
                    }
                }
                return user;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            if (str != null) {
                user = CDl(str);
            } else if (str2 != null) {
                for (Object obj2 : c80693iy.A2G.values()) {
                    C14360o3.A07(obj2);
                    User user3 = (User) obj2;
                    if (str2.equals(String.valueOf(user3.BTC()))) {
                        return user3;
                    }
                }
            }
            return user;
        }
    }

    @Override // X.C2EF
    public final HashMap CDu() {
        HashMap hashMap;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return new HashMap(this.A01.A21);
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            hashMap = new HashMap(c80693iy.A21);
        }
        return hashMap;
    }

    @Override // X.C2ED
    public final String CEx() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1v;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            str = c80693iy.A1v;
        }
        return str;
    }

    @Override // X.C2ED
    public final String CEy() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1w;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            str = c80693iy.A1w;
        }
        return str;
    }

    @Override // X.C2ED
    public final String CGs() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1x;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            str = c80693iy.A1x;
        }
        return str;
    }

    @Override // X.C2EE
    public final Integer CIW() {
        Integer num = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C81543kP c81543kP = this.A01.A0t;
                if (c81543kP != null) {
                    num = c81543kP.A06;
                }
                return num;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C81543kP c81543kP2 = c80693iy.A0t;
            if (c81543kP2 != null) {
                num = c81543kP2.A06;
            }
        }
        return num;
    }

    @Override // X.C2EE
    public final List CIX() {
        List list = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C81543kP c81543kP = this.A01.A0t;
                if (c81543kP != null) {
                    list = c81543kP.A0G;
                }
                return list;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C81543kP c81543kP2 = c80693iy.A0t;
            if (c81543kP2 != null) {
                list = c81543kP2.A0G;
            }
        }
        return list;
    }

    @Override // X.C2EE
    public final boolean CL1() {
        String str;
        C80693iy c80693iy = this.A01;
        C34498FIk c34498FIk = c80693iy.A0e;
        if (c34498FIk != null) {
            str = c34498FIk.A01;
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            List list = c80693iy.A24;
            if (list == null || list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!"General".equals(((C105954q9) it.next()).A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C2ED
    public final boolean CLS() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2O;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            z = c80693iy.A2O;
        }
        return z;
    }

    @Override // X.C2EF
    public final boolean CLj() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2Q;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            z = c80693iy.A2Q;
        }
        return z;
    }

    @Override // X.C2EH
    public final boolean CM1() {
        C80693iy c80693iy = this.A01;
        C83403nh c83403nh = c80693iy.A0m;
        if (c83403nh != null && !C4GQ.A0A(this, c80693iy.A1U.getId(), c83403nh.A0h())) {
            return true;
        }
        return false;
    }

    @Override // X.C2EH
    public final boolean CM2() {
        boolean z = true;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C80693iy c80693iy = this.A01;
                C83403nh c83403nh = c80693iy.A0k;
                if (c83403nh != null) {
                    String id = c80693iy.A1U.getId();
                    String A0h = c83403nh.A0h();
                    String str = c83403nh.A1u;
                    C14360o3.A07(str);
                    if (!Ccc(id, A0h, str)) {
                        return z;
                    }
                }
                z = false;
                return z;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy2 = this.A01;
        synchronized (c80693iy2) {
            C83403nh c83403nh2 = c80693iy2.A0k;
            if (c83403nh2 != null) {
                String id2 = c80693iy2.A1U.getId();
                String A0h2 = c83403nh2.A0h();
                String str2 = c83403nh2.A1u;
                C14360o3.A07(str2);
                if (!Ccc(id2, A0h2, str2)) {
                }
            }
            z = false;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
    
        if (r1.A0r != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r3.A01.A0r != null) goto L9;
     */
    @Override // X.C2EH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CM3() {
        /*
            r3 = this;
            X.0do r0 = r3.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto L2e
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r1.lock()
            boolean r0 = r3.CM1()     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L24
            X.3iy r0 = r3.A01     // Catch: java.lang.Throwable -> L29
            X.3nh r0 = r0.A0r     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L25
        L24:
            r2 = 1
        L25:
            r1.unlock()
            return r2
        L29:
            r0 = move-exception
            r1.unlock()
            throw r0
        L2e:
            X.3iy r1 = r3.A01
            monitor-enter(r1)
            boolean r0 = r3.CM1()     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L3b
            X.3nh r0 = r1.A0r     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3c
        L3b:
            r2 = 1
        L3c:
            monitor-exit(r1)
            return r2
        L3e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81663kb.CM3():boolean");
    }

    @Override // X.C2EH
    public final boolean CM5() {
        boolean z = true;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                if (this.A01.A0q == null) {
                    z = false;
                }
                return z;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            if (c80693iy.A0q == null) {
                z = false;
            }
        }
        return z;
    }

    @Override // X.C2EF
    public final boolean CMC() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2R;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            z = c80693iy.A2R;
        }
        return z;
    }

    @Override // X.C2EH
    public final boolean CNW() {
        String A0h;
        String A0h2;
        boolean z = true;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C50679MYx A00 = A00();
                if (A00 == null) {
                    return false;
                }
                C83403nh A01 = C4GQ.A01(this);
                if (A01 != null && (A0h2 = A01.A0h()) != null) {
                    String str = A00.A00;
                    if (str != null) {
                        if (AbstractC93414Gu.A00.compare(str, A0h2) > 0) {
                        }
                    }
                    z = false;
                }
                return z;
            } finally {
                readLock.unlock();
            }
        }
        synchronized (this.A01) {
            C50679MYx A002 = A00();
            if (A002 == null) {
                return false;
            }
            C83403nh A012 = C4GQ.A01(this);
            if (A012 != null && (A0h = A012.A0h()) != null) {
                String str2 = A002.A00;
                if (str2 != null) {
                    if (AbstractC93414Gu.A00.compare(str2, A0h) > 0) {
                    }
                }
                z = false;
            }
            return z;
        }
    }

    @Override // X.C2ED, X.C2EE
    public final boolean CPZ() {
        boolean z = true;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C81543kP c81543kP = this.A01.A0t;
                if (c81543kP != null) {
                    if (c81543kP.A0I) {
                        return z;
                    }
                }
                z = false;
                return z;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C81543kP c81543kP2 = c80693iy.A0t;
            if (c81543kP2 != null) {
                if (c81543kP2.A0I) {
                }
            }
            z = false;
        }
        return z;
    }

    @Override // X.C2EF
    public final boolean CPc() {
        boolean booleanValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A01 = this.A01.A19.A01();
                C14360o3.A07(A01);
                return ((Boolean) A01).booleanValue();
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            Object A012 = c80693iy.A19.A01();
            C14360o3.A07(A012);
            booleanValue = ((Boolean) A012).booleanValue();
        }
        return booleanValue;
    }

    @Override // X.C2ED
    public final boolean CPl() {
        return C4GR.A07(Integer.valueOf(this.A01.A0I));
    }

    @Override // X.C2EF
    public final boolean CQx() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2V;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            z = c80693iy.A2V;
        }
        return z;
    }

    @Override // X.C2ED
    public final boolean CRD() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2W;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            z = c80693iy.A2W;
        }
        return z;
    }

    @Override // X.C2EF
    public final ImmutableMap CRw() {
        ImmutableMap copyOf;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A01 = this.A01.A14.A01();
                C14360o3.A07(A01);
                ImmutableMap copyOf2 = ImmutableMap.copyOf((Map) A01);
                C14360o3.A07(copyOf2);
                return copyOf2;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            Object A012 = c80693iy.A14.A01();
            C14360o3.A07(A012);
            copyOf = ImmutableMap.copyOf((Map) A012);
            C14360o3.A07(copyOf);
        }
        return copyOf;
    }

    @Override // X.C2EF
    public final boolean CRz() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2Y;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            z = c80693iy.A2Y;
        }
        return z;
    }

    @Override // X.C2ED
    public final boolean CS1() {
        return C4GR.A08(Integer.valueOf(this.A01.A0I));
    }

    @Override // X.C2EF
    public final boolean CS3() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2Z;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            z = c80693iy.A2Z;
        }
        return z;
    }

    @Override // X.C2ED
    public final boolean CSF() {
        boolean A0K;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return C14360o3.A0K(this.A01.A1Y, true);
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            A0K = C14360o3.A0K(c80693iy.A1Y, true);
        }
        return A0K;
    }

    @Override // X.C2EE
    public final Boolean CTd() {
        Boolean bool = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C81543kP c81543kP = this.A01.A0t;
                if (c81543kP != null) {
                    bool = Boolean.valueOf(c81543kP.A0S);
                }
                return bool;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C81543kP c81543kP2 = c80693iy.A0t;
            if (c81543kP2 != null) {
                bool = Boolean.valueOf(c81543kP2.A0S);
            }
        }
        return bool;
    }

    @Override // X.C2EF
    public final boolean CUM() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2a;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            z = c80693iy.A2a;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    @Override // X.C2ED, X.C2EE, X.C2EF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CVQ() {
        /*
            r5 = this;
            X.0do r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L45
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            r2.lock()
            X.3iy r1 = r5.A01     // Catch: java.lang.Throwable -> L40
            java.lang.Boolean r0 = r1.A1Z     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L2c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L3c
        L25:
            X.2Dm r1 = r1.A1S     // Catch: java.lang.Throwable -> L40
            X.2Dm r0 = X.EnumC46982Dm.A04     // Catch: java.lang.Throwable -> L40
            if (r1 == r0) goto L3c
            goto L3b
        L2c:
            java.util.List r0 = r1.A27     // Catch: java.lang.Throwable -> L40
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L40
            if (r0 > r3) goto L25
            boolean r0 = r5.CRD()     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L3c
            goto L25
        L3b:
            r4 = 1
        L3c:
            r2.unlock()
            return r4
        L40:
            r0 = move-exception
            r2.unlock()
            throw r0
        L45:
            X.3iy r2 = r5.A01
            monitor-enter(r2)
            java.lang.Boolean r0 = r2.A1Z     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L59
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L69
        L52:
            X.2Dm r1 = r2.A1S     // Catch: java.lang.Throwable -> L6b
            X.2Dm r0 = X.EnumC46982Dm.A04     // Catch: java.lang.Throwable -> L6b
            if (r1 == r0) goto L69
            goto L68
        L59:
            java.util.List r0 = r2.A27     // Catch: java.lang.Throwable -> L6b
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L6b
            if (r0 > r3) goto L52
            boolean r0 = r5.CRD()     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L69
            goto L52
        L68:
            r4 = 1
        L69:
            monitor-exit(r2)
            return r4
        L6b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81663kb.CVQ():boolean");
    }

    @Override // X.C2EF
    public final boolean CVT() {
        boolean z = false;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Integer num = (Integer) this.A01.A1M.A01();
                if (num != null) {
                    if (num.intValue() == 1) {
                        z = true;
                    }
                }
                return z;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            Integer num2 = (Integer) c80693iy.A1M.A01();
            if (num2 != null) {
                if (num2.intValue() == 1) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // X.C2EE, X.C2EF
    public final boolean CWO() {
        boolean booleanValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A01 = this.A01.A1I.A01();
                C14360o3.A07(A01);
                return ((Boolean) A01).booleanValue();
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            Object A012 = c80693iy.A1I.A01();
            C14360o3.A07(A012);
            booleanValue = ((Boolean) A012).booleanValue();
        }
        return booleanValue;
    }

    @Override // X.C2EE
    public final boolean CWl() {
        boolean z = true;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C81613kW c81613kW = this.A01.A0f;
                if (c81613kW == null) {
                    return false;
                }
                if (!c81613kW.A01()) {
                    z = false;
                    if ((c81613kW.A04.A00 & 42) == 42) {
                        z = true;
                    }
                }
                return z;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            C81613kW c81613kW2 = c80693iy.A0f;
            if (c81613kW2 == null) {
                return false;
            }
            if (!c81613kW2.A01()) {
                z = false;
                if ((c81613kW2.A04.A00 & 42) == 42) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // X.C2EE, X.C2EG
    public final boolean CX1() {
        boolean A0K;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return C14360o3.A0K(this.A01.A1e, true);
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            A0K = C14360o3.A0K(c80693iy.A1e, true);
        }
        return A0K;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r0.length() == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0050, code lost:
    
        if (r0.length() == 0) goto L33;
     */
    @Override // X.C2EE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CXF() {
        /*
            r5 = this;
            X.0do r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L3b
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            r2.lock()
            X.3iy r0 = r5.A01     // Catch: java.lang.Throwable -> L36
            X.3nh r1 = r0.A0g     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L23
            r2.unlock()
            return r3
        L23:
            boolean r0 = r1.A2N     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L31
            java.lang.String r0 = r1.A1q     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L31
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L32
        L31:
            r4 = 0
        L32:
            r2.unlock()
            return r4
        L36:
            r0 = move-exception
            r2.unlock()
            throw r0
        L3b:
            X.3iy r2 = r5.A01
            monitor-enter(r2)
            X.3nh r1 = r2.A0g     // Catch: java.lang.Throwable -> L55
            if (r1 != 0) goto L44
            monitor-exit(r2)
            return r3
        L44:
            boolean r0 = r1.A2N     // Catch: java.lang.Throwable -> L55
            if (r0 != 0) goto L52
            java.lang.String r0 = r1.A1q     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L52
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L55
            if (r0 != 0) goto L53
        L52:
            r4 = 0
        L53:
            monitor-exit(r2)
            return r4
        L55:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81663kb.CXF():boolean");
    }

    @Override // X.C2ED
    public final boolean CXT() {
        boolean A0K;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return C14360o3.A0K(this.A01.A1a, true);
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            A0K = C14360o3.A0K(c80693iy.A1a, true);
        }
        return A0K;
    }

    @Override // X.C2ED
    public final boolean CXo() {
        boolean z = false;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                if (this.A01.A07 == 1) {
                    z = true;
                }
                return z;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            if (c80693iy.A07 == 1) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.C2ED
    public final boolean CXz() {
        boolean booleanValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A01 = this.A01.A2p.A01();
                C14360o3.A07(A01);
                return ((Boolean) A01).booleanValue();
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            Object A012 = c80693iy.A2p.A01();
            C14360o3.A07(A012);
            booleanValue = ((Boolean) A012).booleanValue();
        }
        return booleanValue;
    }

    @Override // X.C2ED
    public final boolean CYQ() {
        boolean booleanValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A01 = this.A01.A1A.A01();
                C14360o3.A07(A01);
                return ((Boolean) A01).booleanValue();
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            Object A012 = c80693iy.A1A.A01();
            C14360o3.A07(A012);
            booleanValue = ((Boolean) A012).booleanValue();
        }
        return booleanValue;
    }

    @Override // X.C2ED
    public final boolean CZH() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2e;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            z = c80693iy.A2e;
        }
        return z;
    }

    @Override // X.C2ED
    public final boolean CaK() {
        boolean A0K;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return C14360o3.A0K(this.A01.A1b, true);
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            A0K = C14360o3.A0K(c80693iy.A1b, true);
        }
        return A0K;
    }

    @Override // X.C2EE, X.C2EF
    public final boolean CbK() {
        C81543kP c81543kP;
        C81543kP c81543kP2;
        boolean z = true;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                if (CVQ() && (c81543kP2 = this.A01.A0t) != null) {
                    if (c81543kP2.A0Q) {
                        return z;
                    }
                }
                z = false;
                return z;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            if (CVQ() && (c81543kP = c80693iy.A0t) != null) {
                if (c81543kP.A0Q) {
                }
            }
            z = false;
        }
        return z;
    }

    @Override // X.C2EF
    public final boolean CbX() {
        boolean booleanValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A01 = this.A01.A1C.A01();
                C14360o3.A07(A01);
                return ((Boolean) A01).booleanValue();
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            Object A012 = c80693iy.A1C.A01();
            C14360o3.A07(A012);
            booleanValue = ((Boolean) A012).booleanValue();
        }
        return booleanValue;
    }

    @Override // X.C2EE
    public final boolean Cc2() {
        boolean z = true;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                List list = this.A01.A29;
                C14360o3.A06(list);
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((User) it.next()).isRestricted()) {
                            break;
                        }
                    }
                }
                z = false;
                return z;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            List list2 = c80693iy.A29;
            C14360o3.A06(list2);
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((User) it2.next()).isRestricted()) {
                        break;
                    }
                }
            }
            z = false;
        }
        return z;
    }

    @Override // X.C2EE, X.C2EF
    public final boolean CcR() {
        C45127Jxw c45127Jxw;
        C45127Jxw c45127Jxw2;
        boolean z = true;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C80693iy c80693iy = this.A01;
                C81543kP c81543kP = c80693iy.A0t;
                if (c81543kP != null && c81543kP.A00 == 5 && (c45127Jxw2 = c80693iy.A0Z) != null) {
                    if (c45127Jxw2.A01 != null) {
                        return z;
                    }
                }
                z = false;
                return z;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy2 = this.A01;
        synchronized (c80693iy2) {
            C81543kP c81543kP2 = c80693iy2.A0t;
            if (c81543kP2 != null && c81543kP2.A00 == 5 && (c45127Jxw = c80693iy2.A0Z) != null) {
                if (c45127Jxw.A01 != null) {
                }
            }
            z = false;
        }
        return z;
    }

    @Override // X.C2EF
    public final boolean Cd4() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2o;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            z = c80693iy.A2o;
        }
        return z;
    }

    @Override // X.C2EE, X.C2EF
    public final boolean CdS() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2i;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            z = c80693iy.A2i;
        }
        return z;
    }

    @Override // X.C2EF
    public final boolean Cel() {
        boolean booleanValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A01 = this.A01.A1D.A01();
                C14360o3.A07(A01);
                return ((Boolean) A01).booleanValue();
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            Object A012 = c80693iy.A1D.A01();
            C14360o3.A07(A012);
            booleanValue = ((Boolean) A012).booleanValue();
        }
        return booleanValue;
    }

    @Override // X.C2ED
    public final boolean Cfh() {
        boolean booleanValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A01 = this.A01.A1E.A01();
                C14360o3.A07(A01);
                return ((Boolean) A01).booleanValue();
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            Object A012 = c80693iy.A1E.A01();
            C14360o3.A07(A012);
            booleanValue = ((Boolean) A012).booleanValue();
        }
        return booleanValue;
    }

    @Override // X.C2EE
    public final boolean CgC() {
        return C14360o3.A0K(this.A01.A1d, true);
    }

    @Override // X.C2EE
    public final void EVH(boolean z) {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
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
                this.A01.A2L = z;
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            c80693iy.A2L = z;
        }
    }

    @Override // X.C2EF
    public final boolean Ek7() {
        boolean z = false;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Boolean bool = this.A01.A1f;
                if (bool != null) {
                    if (bool.equals(true)) {
                        z = true;
                    }
                }
                return z;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            Boolean bool2 = c80693iy.A1f;
            if (bool2 != null) {
                if (bool2.equals(true)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // X.C2ED
    public final boolean isMuted() {
        boolean booleanValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A01 = this.A01.A1B.A01();
                C14360o3.A07(A01);
                return ((Boolean) A01).booleanValue();
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            Object A012 = c80693iy.A1B.A01();
            C14360o3.A07(A012);
            booleanValue = ((Boolean) A012).booleanValue();
        }
        return booleanValue;
    }

    @Override // X.C2ED, X.C2EE
    public final boolean isPending() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2g;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            z = c80693iy.A2g;
        }
        return z;
    }

    @Override // X.C2EF
    public final boolean isStale() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2j;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = this.A01;
        synchronized (c80693iy) {
            z = c80693iy.A2j;
        }
        return z;
    }

    @Override // X.C2EE
    public final Boolean Ba6() {
        User A05 = C4GQ.A05(this);
        if (A05 != null) {
            return A05.A03.CZk();
        }
        return null;
    }

    @Override // X.C2EE
    public final boolean CKh() {
        if (AZ7() == null) {
            return false;
        }
        return true;
    }

    @Override // X.C2ED
    public final boolean CYg() {
        User A05 = C4GQ.A05(this);
        if (A05 != null) {
            return A05.A1U();
        }
        return false;
    }

    @Override // X.C2ED
    public final boolean CZe() {
        if (!CVQ() && this.A01.A1S != EnumC46982Dm.A04 && BSB() == 2) {
            return true;
        }
        return false;
    }

    @Override // X.C2EE
    public final boolean Ccj() {
        if (CRD() && BSH().isEmpty()) {
            return true;
        }
        return false;
    }

    public final void A08(C9BH c9bh, C9BO c9bo, C9BW c9bw, C9BW c9bw2, C9BW c9bw3, C9BW c9bw4, C51593Mql c51593Mql, C51755Mte c51755Mte, C31200Dnj c31200Dnj, C45127Jxw c45127Jxw, C50679MYx c50679MYx, C50679MYx c50679MYx2, C34498FIk c34498FIk, C81613kW c81613kW, C125805mV c125805mV, C81543kP c81543kP, C111214zj c111214zj, C81563kR c81563kR, DirectThreadThemeInfo directThreadThemeInfo, FGH fgh, C133205zm c133205zm, C106414qv c106414qv, C32067E6t c32067E6t, E6W e6w, EnumC81843l3 enumC81843l3, CreatorBroadcastThreadInfo creatorBroadcastThreadInfo, CreatorSubscriberThreadInfo creatorSubscriberThreadInfo, C1118752z c1118752z, EnumC46982Dm enumC46982Dm, SmartSuggestion smartSuggestion, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Integer num, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, HashMap hashMap, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, Map map, Map map2, Map map3, Map map4, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24) {
        int i22;
        Map map5 = map2;
        C14360o3.A0B(list, 6);
        C14360o3.A0B(list2, 7);
        C14360o3.A0B(list3, 8);
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i22 = reentrantReadWriteLock.getReadHoldCount();
                for (int i23 = 0; i23 < i22; i23++) {
                    readLock.unlock();
                }
            } else {
                i22 = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                A0D(str);
                if (this.A00 != null) {
                    C80693iy c80693iy = this.A01;
                    if (!C14360o3.A0K(str2, c80693iy.A1t) || c80693iy.A29 != list) {
                        this.A00 = null;
                    }
                }
                C80693iy c80693iy2 = this.A01;
                c80693iy2.A1t = str2;
                c80693iy2.A1i = l;
                c80693iy2.A1l = str3;
                c80693iy2.A1h = num;
                c80693iy2.A1V = user;
                c80693iy2.A26 = new ArrayList(list2);
                c80693iy2.A29 = new ArrayList(list);
                c80693iy2.A22 = new ArrayList(list3);
                c80693iy2.A01();
                c80693iy2.A1s = str4;
                c80693iy2.A10 = c106414qv;
                for (Map.Entry entry : map.entrySet()) {
                    A0N((C80993jT) entry.getValue(), (String) entry.getKey());
                }
                c80693iy2.A0D = i;
                c80693iy2.A0C = i2;
                c80693iy2.A03 = i3;
                c80693iy2.A02 = i4;
                c80693iy2.A2g = z;
                c80693iy2.A2i = z2;
                c80693iy2.A2e = z10;
                c80693iy2.A2q.A03(Integer.valueOf(i5));
                c80693iy2.A2p.A03(Boolean.valueOf(z3));
                c80693iy2.A1B.A03(Boolean.valueOf(z4));
                c80693iy2.A1A.A03(Boolean.valueOf(z5));
                c80693iy2.A1C.A03(Boolean.valueOf(z6));
                c80693iy2.A2h = z6;
                c80693iy2.A1E.A03(Boolean.valueOf(z8));
                c80693iy2.A1D.A03(Boolean.valueOf(z9));
                c80693iy2.A1L.A03(Integer.valueOf(i6));
                c80693iy2.A15.A03(str7);
                c80693iy2.A2W = z11;
                c80693iy2.A2T = z12;
                c80693iy2.A2Q = z13;
                c80693iy2.A1v = str5;
                c80693iy2.A1w = str6;
                c80693iy2.A2K = z7;
                c80693iy2.A04 = i6;
                c80693iy2.A1j = str7;
                c80693iy2.A06 = i7;
                c80693iy2.A0I = i8;
                c80693iy2.A0F = i9;
                c80693iy2.A00 = i10;
                c80693iy2.A1I.A03(Boolean.valueOf(z14));
                c80693iy2.A2o = z15;
                c80693iy2.A1J.A03(str8);
                c80693iy2.A16.A03(c1118752z);
                c80693iy2.A0s = c125805mV;
                c80693iy2.A1N.A03(directThreadThemeInfo);
                c80693iy2.A0y = fgh;
                c80693iy2.A08 = i11;
                c80693iy2.A25 = list6;
                c80693iy2.A0P = c9bh;
                c80693iy2.A18.A03(Boolean.valueOf(z19));
                c80693iy2.A0u = c111214zj;
                c80693iy2.A0Y = c31200Dnj;
                c80693iy2.A0X = c51755Mte;
                if (list4 != null) {
                    c80693iy2.A2C = list4;
                }
                if (str9 != null) {
                    c80693iy2.A1o = str9;
                }
                if (list5 != null) {
                    c80693iy2.A24 = list5;
                }
                if (c9bw != null) {
                    c80693iy2.A0U = c9bw;
                }
                if (c34498FIk != null) {
                    c80693iy2.A0e = c34498FIk;
                }
                c80693iy2.A1X = bool;
                c80693iy2.A1Z = bool2;
                c80693iy2.A1e = bool5;
                c80693iy2.A1d = bool4;
                c80693iy2.A1g = bool3;
                c80693iy2.A1c = bool6;
                c80693iy2.A2a = z16;
                c80693iy2.A2Z = z17;
                c80693iy2.A2V = z18;
                c80693iy2.A1Q = creatorSubscriberThreadInfo;
                c80693iy2.A1P = creatorBroadcastThreadInfo;
                c80693iy2.A1O = enumC81843l3;
                c80693iy2.A1a = bool7;
                c80693iy2.A23 = list7;
                c80693iy2.A1S = enumC46982Dm;
                c80693iy2.A20 = hashMap;
                c80693iy2.A0J = i12;
                c80693iy2.A0S = c9bw2;
                c80693iy2.A1Y = bool8;
                c80693iy2.A0t = c81543kP;
                c80693iy2.A0Z = c45127Jxw;
                c80693iy2.A11 = c32067E6t;
                c80693iy2.A12 = e6w;
                c80693iy2.A1n = str12;
                c80693iy2.A1M.A03(Integer.valueOf(i13));
                c80693iy2.A1k = str10;
                c80693iy2.A1T = smartSuggestion;
                if (bool9 != null) {
                    c80693iy2.A1G.A03(bool9);
                }
                if (bool10 != null) {
                    c80693iy2.A17.A03(bool10);
                }
                if (bool11 != null) {
                    c80693iy2.A13.A03(bool11);
                }
                c80693iy2.A0a = c50679MYx;
                if (bool12 != null) {
                    c80693iy2.A2U = bool12.booleanValue();
                }
                c80693iy2.A1f = bool13;
                c80693iy2.A0v = c81563kR;
                c80693iy2.A0G = i14;
                c80693iy2.A0f = c81613kW;
                c80693iy2.A1R = c1118752z;
                c80693iy2.A0V = c51593Mql;
                c80693iy2.A1H.A03(Integer.valueOf(i15));
                c80693iy2.A0K = i16;
                c80693iy2.A07 = i17;
                c80693iy2.A09 = i18;
                if (l2 != null) {
                    c80693iy2.A0N = l2.longValue();
                }
                c80693iy2.A1u = str11;
                c80693iy2.A2Y = z20;
                c80693iy2.A01 = i19;
                AbstractC80713j1 abstractC80713j1 = c80693iy2.A14;
                if (map2 == null) {
                    map5 = RegularImmutableMap.A02;
                }
                abstractC80713j1.A03(map5);
                c80693iy2.A2R = z21;
                c80693iy2.A2j = z22;
                c80693iy2.A1b = Boolean.valueOf(z23);
                c80693iy2.A0O = j;
                c80693iy2.A0z = c133205zm;
                c80693iy2.A0R = c9bw3;
                c80693iy2.A0B = i20;
                c80693iy2.A2A = list8;
                c80693iy2.A1m = str13;
                c80693iy2.A2P = z24;
                c80693iy2.A2B = list9;
                c80693iy2.A2E = map3;
                c80693iy2.A2F = map4;
                c80693iy2.A0T = c9bw4;
                c80693iy2.A0Q = c9bo;
                c80693iy2.A0b = c50679MYx2;
                c80693iy2.A0E = i21;
                for (int i24 = 0; i24 < i22; i24++) {
                    readLock.lock();
                }
                writeLock.unlock();
                return;
            } catch (Throwable th) {
                for (int i25 = 0; i25 < i22; i25++) {
                    readLock.lock();
                }
                writeLock.unlock();
                throw th;
            }
        }
        C80693iy c80693iy3 = this.A01;
        synchronized (c80693iy3) {
            A0D(str);
            if (this.A00 != null && (!C14360o3.A0K(str2, c80693iy3.A1t) || c80693iy3.A29 != list)) {
                this.A00 = null;
            }
            c80693iy3.A1t = str2;
            c80693iy3.A1i = l;
            c80693iy3.A1l = str3;
            c80693iy3.A1h = num;
            c80693iy3.A1V = user;
            c80693iy3.A26 = new ArrayList(list2);
            c80693iy3.A29 = new ArrayList(list);
            c80693iy3.A22 = new ArrayList(list3);
            c80693iy3.A01();
            c80693iy3.A1s = str4;
            c80693iy3.A10 = c106414qv;
            for (Map.Entry entry2 : map.entrySet()) {
                A0N((C80993jT) entry2.getValue(), (String) entry2.getKey());
            }
            c80693iy3.A0D = i;
            c80693iy3.A0C = i2;
            c80693iy3.A03 = i3;
            c80693iy3.A02 = i4;
            c80693iy3.A2g = z;
            c80693iy3.A2i = z2;
            c80693iy3.A2e = z10;
            c80693iy3.A2q.A03(Integer.valueOf(i5));
            c80693iy3.A2p.A03(Boolean.valueOf(z3));
            c80693iy3.A1B.A03(Boolean.valueOf(z4));
            c80693iy3.A1A.A03(Boolean.valueOf(z5));
            c80693iy3.A1C.A03(Boolean.valueOf(z6));
            c80693iy3.A2h = z6;
            c80693iy3.A1E.A03(Boolean.valueOf(z8));
            c80693iy3.A1D.A03(Boolean.valueOf(z9));
            c80693iy3.A1L.A03(Integer.valueOf(i6));
            c80693iy3.A15.A03(str7);
            c80693iy3.A2W = z11;
            c80693iy3.A2T = z12;
            c80693iy3.A2Q = z13;
            c80693iy3.A1v = str5;
            c80693iy3.A1w = str6;
            c80693iy3.A2K = z7;
            c80693iy3.A04 = i6;
            c80693iy3.A1j = str7;
            c80693iy3.A06 = i7;
            c80693iy3.A0I = i8;
            c80693iy3.A0F = i9;
            c80693iy3.A00 = i10;
            c80693iy3.A1I.A03(Boolean.valueOf(z14));
            c80693iy3.A2o = z15;
            c80693iy3.A1J.A03(str8);
            c80693iy3.A16.A03(c1118752z);
            c80693iy3.A0s = c125805mV;
            c80693iy3.A1N.A03(directThreadThemeInfo);
            c80693iy3.A0y = fgh;
            c80693iy3.A08 = i11;
            c80693iy3.A25 = list6;
            c80693iy3.A0P = c9bh;
            c80693iy3.A18.A03(Boolean.valueOf(z19));
            c80693iy3.A0u = c111214zj;
            c80693iy3.A0Y = c31200Dnj;
            c80693iy3.A0X = c51755Mte;
            if (list4 != null) {
                c80693iy3.A2C = list4;
            }
            if (str9 != null) {
                c80693iy3.A1o = str9;
            }
            if (list5 != null) {
                c80693iy3.A24 = list5;
            }
            if (c9bw != null) {
                c80693iy3.A0U = c9bw;
            }
            if (c34498FIk != null) {
                c80693iy3.A0e = c34498FIk;
            }
            c80693iy3.A1X = bool;
            c80693iy3.A1Z = bool2;
            c80693iy3.A1e = bool5;
            c80693iy3.A1d = bool4;
            c80693iy3.A1g = bool3;
            c80693iy3.A1c = bool6;
            c80693iy3.A2a = z16;
            c80693iy3.A2Z = z17;
            c80693iy3.A2V = z18;
            c80693iy3.A1Q = creatorSubscriberThreadInfo;
            c80693iy3.A1P = creatorBroadcastThreadInfo;
            c80693iy3.A1O = enumC81843l3;
            c80693iy3.A1a = bool7;
            c80693iy3.A23 = list7;
            c80693iy3.A1S = enumC46982Dm;
            c80693iy3.A20 = hashMap;
            c80693iy3.A0J = i12;
            c80693iy3.A0S = c9bw2;
            c80693iy3.A1Y = bool8;
            c80693iy3.A0t = c81543kP;
            c80693iy3.A0Z = c45127Jxw;
            c80693iy3.A11 = c32067E6t;
            c80693iy3.A12 = e6w;
            c80693iy3.A1n = str12;
            c80693iy3.A1M.A03(Integer.valueOf(i13));
            c80693iy3.A1k = str10;
            c80693iy3.A1T = smartSuggestion;
            if (bool9 != null) {
                c80693iy3.A1G.A03(bool9);
            }
            if (bool10 != null) {
                c80693iy3.A17.A03(bool10);
            }
            if (bool11 != null) {
                c80693iy3.A13.A03(bool11);
            }
            c80693iy3.A0a = c50679MYx;
            if (bool12 != null) {
                c80693iy3.A2U = bool12.booleanValue();
            }
            c80693iy3.A1f = bool13;
            c80693iy3.A0v = c81563kR;
            c80693iy3.A0G = i14;
            c80693iy3.A0f = c81613kW;
            c80693iy3.A1R = c1118752z;
            c80693iy3.A0V = c51593Mql;
            c80693iy3.A1H.A03(Integer.valueOf(i15));
            c80693iy3.A0K = i16;
            c80693iy3.A07 = i17;
            c80693iy3.A09 = i18;
            if (l2 != null) {
                c80693iy3.A0N = l2.longValue();
            }
            c80693iy3.A1u = str11;
            c80693iy3.A2Y = z20;
            c80693iy3.A01 = i19;
            AbstractC80713j1 abstractC80713j12 = c80693iy3.A14;
            if (map2 == null) {
                map5 = RegularImmutableMap.A02;
            }
            abstractC80713j12.A03(map5);
            c80693iy3.A2R = z21;
            c80693iy3.A2j = z22;
            c80693iy3.A1b = Boolean.valueOf(z23);
            c80693iy3.A0O = j;
            c80693iy3.A0z = c133205zm;
            c80693iy3.A0R = c9bw3;
            c80693iy3.A0B = i20;
            c80693iy3.A2A = list8;
            c80693iy3.A1m = str13;
            c80693iy3.A2P = z24;
            c80693iy3.A2B = list9;
            c80693iy3.A2E = map3;
            c80693iy3.A2F = map4;
            c80693iy3.A0T = c9bw4;
            c80693iy3.A0Q = c9bo;
            c80693iy3.A0b = c50679MYx2;
            c80693iy3.A0E = i21;
        }
    }
}
