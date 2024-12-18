package com.instagram.settings2.core.data;

import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC37303Gc4;
import X.AbstractC50522MSa;
import X.AbstractC54195NxZ;
import X.AnonymousClass057;
import X.B4Z;
import X.C00O;
import X.C05A;
import X.C05F;
import X.C09530e4;
import X.C0YZ;
import X.C10E;
import X.C10M;
import X.C12W;
import X.C141786av;
import X.C14360o3;
import X.C19L;
import X.C1AT;
import X.C1AV;
import X.C37061GUv;
import X.C38687GzS;
import X.C47979LIr;
import X.C51718Msv;
import X.C51757Mtg;
import X.C51921Mx3;
import X.C51922Mx4;
import X.C51923Mx5;
import X.C51924Mx6;
import X.C51925Mx7;
import X.C56721PFn;
import X.InterfaceC06180Ui;
import X.InterfaceC09390do;
import X.InterfaceC15070pN;
import X.InterfaceC23621Ds;
import X.InterfaceC57866PlW;
import X.InterfaceC57989PnZ;
import X.InterfaceC58156PqL;
import X.InterfaceC58302Psu;
import X.InterfaceC58303Psv;
import X.MSX;
import X.MSZ;
import X.OMF;
import X.XVa;
import com.instagram.api.schemas.RemoteBooleanSettingId;
import com.instagram.api.schemas.RemoteStringSettingId;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes9.dex */
public final class SettingsRepository {
    public C09530e4 A00;
    public final UserSession A01;
    public final SettingsNetworkInteractor A02;
    public final OMF A03;
    public final C47979LIr A04;
    public final String A05;
    public final Map A06;
    public final Map A07;
    public final ReentrantReadWriteLock A08;
    public final InterfaceC09390do A09;
    public final C12W A0A;
    public final C19L A0B;
    public final InterfaceC06180Ui A0C;
    public final InterfaceC06180Ui A0D;
    public final InterfaceC06180Ui A0E;
    public final InterfaceC06180Ui A0F;
    public final InterfaceC06180Ui A0G;
    public final InterfaceC06180Ui A0H;
    public final InterfaceC06180Ui A0I;
    public final InterfaceC06180Ui A0J;
    public final InterfaceC06180Ui A0K;
    public final C05A A0L;
    public final InterfaceC15070pN A0M;
    public final InterfaceC15070pN A0N;
    public final InterfaceC15070pN A0O;
    public final InterfaceC15070pN A0P;
    public final InterfaceC15070pN A0Q;
    public final InterfaceC15070pN A0R;
    public final InterfaceC15070pN A0S;
    public final InterfaceC15070pN A0T;
    public final InterfaceC15070pN A0U;

    public final C51757Mtg A02(InterfaceC57989PnZ interfaceC57989PnZ) {
        C14360o3.A0B(interfaceC57989PnZ, 0);
        InterfaceC58156PqL A0d = AbstractC50522MSa.A0d(this.A04, interfaceC57989PnZ);
        if (A0d != null) {
            return A0d.C0q();
        }
        throw AbstractC37303Gc4.A0M(interfaceC57989PnZ, "No setting model found for ID ", AbstractC166987dD.A1C());
    }

    public final Boolean A03(InterfaceC58302Psu interfaceC58302Psu) {
        Boolean bool;
        C14360o3.A0B(interfaceC58302Psu, 0);
        ReentrantReadWriteLock.ReadLock readLock = this.A08.readLock();
        readLock.lock();
        try {
            Object obj = this.A06.get(interfaceC58302Psu);
            if (obj != null) {
                bool = (Boolean) obj;
            } else {
                bool = null;
            }
            return bool;
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0A(X.InterfaceC23621Ds r6) {
        /*
            r5 = this;
            r4 = 1
            boolean r0 = X.C57146PWy.A01(r6, r4)
            if (r0 == 0) goto L70
            r3 = r6
            X.PWy r3 = (X.C57146PWy) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r3.A00 = r2
        L15:
            java.lang.Object r1 = r3.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            if (r0 == 0) goto L58
            if (r0 != r4) goto L7b
            java.lang.Object r3 = r3.A01
            com.instagram.settings2.core.data.SettingsRepository r3 = (com.instagram.settings2.core.data.SettingsRepository) r3
            X.AbstractC09560e7.A00(r1)
        L26:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L4f
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r2 = r1.A00
            java.util.List r2 = (java.util.List) r2
            X.05A r1 = r3.A0L
            X.Mwy r0 = new X.Mwy
            r0.<init>(r2)
            X.3NX r1 = X.AbstractC43593JPy.A0m(r0, r1)
        L3d:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L4c
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L76
            X.05A r1 = r3.A0L
            X.PFm r0 = X.C56720PFm.A00
            r1.Egh(r0)
        L4c:
            X.0eB r2 = X.C0eB.A00
        L4e:
            return r2
        L4f:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L3d
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L58:
            X.AbstractC09560e7.A00(r1)
            X.05A r1 = r5.A0L
            X.PFo r0 = X.C56722PFo.A00
            r1.Egh(r0)
            com.instagram.settings2.core.data.SettingsNetworkInteractor r0 = r5.A02
            r3.A01 = r5
            r3.A00 = r4
            java.lang.Object r1 = r0.A05(r3)
            if (r1 == r2) goto L4e
            r3 = r5
            goto L26
        L70:
            X.PWy r3 = new X.PWy
            r3.<init>(r5, r6, r4)
            goto L15
        L76:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L7b:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsRepository.A0A(X.1Ds):java.lang.Object");
    }

    public final String A0B(InterfaceC58303Psv interfaceC58303Psv) {
        String str;
        C14360o3.A0B(interfaceC58303Psv, 0);
        ReentrantReadWriteLock.ReadLock readLock = this.A08.readLock();
        readLock.lock();
        try {
            Object obj = this.A06.get(interfaceC58303Psv);
            if (obj != null) {
                str = (String) obj;
            } else {
                str = null;
            }
            return str;
        } finally {
            readLock.unlock();
        }
    }

    public static ClassCastException A00(Class cls, Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(", from ");
        sb.append(obj2);
        sb.append(", is not instance of ");
        sb.append(new C0YZ(cls));
        return new ClassCastException(sb.toString());
    }

    public static final Integer A01(SettingsRepository settingsRepository, InterfaceC57989PnZ interfaceC57989PnZ) {
        Object A0l = MSZ.A0l(interfaceC57989PnZ, settingsRepository.A04.A05);
        if (A0l != null) {
            if (A0l instanceof C51922Mx4) {
                return C05F.A00;
            }
            if (A0l instanceof C51923Mx5) {
                return C05F.A01;
            }
            if (A0l instanceof C51921Mx3) {
                return C05F.A0C;
            }
            if (A0l instanceof C51924Mx6) {
                return C05F.A0N;
            }
            throw B4Z.A00();
        }
        throw AbstractC37303Gc4.A0M(interfaceC57989PnZ, "No setting model found for ID ", AbstractC166987dD.A1C());
    }

    public final Object A04(C51757Mtg c51757Mtg, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC57866PlW interfaceC57866PlW = (InterfaceC57866PlW) c51757Mtg.A01;
        if (XVa.A03(interfaceC57866PlW, 1)) {
            C51718Msv c51718Msv = (C51718Msv) ((XVa) interfaceC57866PlW).A01;
            if (C51718Msv.A00(c51718Msv, 0)) {
                SettingsNetworkInteractor settingsNetworkInteractor = this.A02;
                C14360o3.A0C(c51718Msv, "null cannot be cast to non-null type com.instagram.settings2.core.model.Storage.RemoteSettingId.Boolean");
                return settingsNetworkInteractor.A01((RemoteBooleanSettingId) c51718Msv.A01, interfaceC23621Ds);
            }
            throw AbstractC31172DnG.A0u();
        }
        if (interfaceC57866PlW instanceof C51925Mx7) {
            return AbstractC25225BEi.A0z(new C38687GzS(Boolean.valueOf(AbstractC31172DnG.A1a(AbstractC31174DnI.A0g(C1AT.A01(this.A01), C1AV.A3X, this), ((C51925Mx7) interfaceC57866PlW).A00))));
        }
        if (XVa.A03(interfaceC57866PlW, 0)) {
            return AbstractC54195NxZ.A00().A00(this.A01, (Integer) ((XVa) interfaceC57866PlW).A01).Btx(interfaceC23621Ds);
        }
        throw B4Z.A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0 A[Catch: all -> 0x00e6, TryCatch #0 {all -> 0x00e6, blocks: (B:22:0x00ac, B:24:0x00b0, B:26:0x00c4, B:33:0x00d5, B:34:0x00d9, B:35:0x00cc, B:37:0x00d0), top: B:21:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc A[DONT_GENERATE, LOOP:1: B:28:0x00da->B:29:0x00dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc A[Catch: all -> 0x00e6, TryCatch #0 {all -> 0x00e6, blocks: (B:22:0x00ac, B:24:0x00b0, B:26:0x00c4, B:33:0x00d5, B:34:0x00d9, B:35:0x00cc, B:37:0x00d0), top: B:21:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(X.C51757Mtg r10, X.InterfaceC23621Ds r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsRepository.A05(X.Mtg, X.1Ds):java.lang.Object");
    }

    public final Object A06(C51757Mtg c51757Mtg, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC57866PlW interfaceC57866PlW = (InterfaceC57866PlW) c51757Mtg.A01;
        if (XVa.A03(interfaceC57866PlW, 1)) {
            C51718Msv c51718Msv = (C51718Msv) ((XVa) interfaceC57866PlW).A01;
            if (C51718Msv.A00(c51718Msv, 1)) {
                SettingsNetworkInteractor settingsNetworkInteractor = this.A02;
                C14360o3.A0C(c51718Msv, "null cannot be cast to non-null type com.instagram.settings2.core.model.Storage.RemoteSettingId.String");
                return settingsNetworkInteractor.A04((RemoteStringSettingId) c51718Msv.A01, interfaceC23621Ds);
            }
            throw AbstractC31172DnG.A0u();
        }
        if (!(interfaceC57866PlW instanceof C51925Mx7)) {
            if (XVa.A03(interfaceC57866PlW, 0)) {
                AbstractC54195NxZ.A00().A01((Integer) ((XVa) interfaceC57866PlW).A01);
                throw C00O.createAndThrow();
            }
            throw B4Z.A00();
        }
        throw new C141786av("An operation is not implemented.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae A[Catch: all -> 0x00e4, TryCatch #0 {all -> 0x00e4, blocks: (B:22:0x00aa, B:24:0x00ae, B:26:0x00c2, B:33:0x00d3, B:34:0x00d7, B:35:0x00ca, B:37:0x00ce), top: B:21:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da A[DONT_GENERATE, LOOP:1: B:28:0x00d8->B:29:0x00da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca A[Catch: all -> 0x00e4, TryCatch #0 {all -> 0x00e4, blocks: (B:22:0x00aa, B:24:0x00ae, B:26:0x00c2, B:33:0x00d3, B:34:0x00d7, B:35:0x00ca, B:37:0x00ce), top: B:21:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(X.C51757Mtg r10, X.InterfaceC23621Ds r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsRepository.A07(X.Mtg, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00be A[Catch: all -> 0x00ff, TryCatch #1 {all -> 0x00ff, blocks: (B:22:0x00ba, B:24:0x00be, B:26:0x00d2, B:36:0x00e3, B:37:0x00e7, B:38:0x00da, B:40:0x00de), top: B:21:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ea A[DONT_GENERATE, LOOP:1: B:28:0x00e8->B:29:0x00ea, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da A[Catch: all -> 0x00ff, TryCatch #1 {all -> 0x00ff, blocks: (B:22:0x00ba, B:24:0x00be, B:26:0x00d2, B:36:0x00e3, B:37:0x00e7, B:38:0x00da, B:40:0x00de), top: B:21:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r11v3, types: [X.PnZ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A08(X.InterfaceC58302Psu r11, X.InterfaceC23621Ds r12) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsRepository.A08(X.Psu, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc A[Catch: all -> 0x00fd, TryCatch #0 {all -> 0x00fd, blocks: (B:22:0x00b8, B:24:0x00bc, B:26:0x00d0, B:36:0x00e1, B:37:0x00e5, B:38:0x00d8, B:40:0x00dc), top: B:21:0x00b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8 A[DONT_GENERATE, LOOP:1: B:28:0x00e6->B:29:0x00e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8 A[Catch: all -> 0x00fd, TryCatch #0 {all -> 0x00fd, blocks: (B:22:0x00b8, B:24:0x00bc, B:26:0x00d0, B:36:0x00e1, B:37:0x00e5, B:38:0x00d8, B:40:0x00dc), top: B:21:0x00b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r11v3, types: [X.PnZ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A09(X.InterfaceC58303Psv r11, X.InterfaceC23621Ds r12) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsRepository.A09(X.Psv, X.1Ds):java.lang.Object");
    }

    public final void A0C() {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A08;
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
        ReentrantReadWriteLock.WriteLock A0p = MSX.A0p(reentrantReadWriteLock);
        try {
            this.A07.clear();
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            A0p.unlock();
        }
    }

    public /* synthetic */ SettingsRepository(UserSession userSession, C47979LIr c47979LIr, String str, C19L c19l) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        this.A01 = userSession;
        this.A0B = c19l;
        this.A04 = c47979LIr;
        this.A07 = A1I;
        this.A05 = str;
        Integer num = C05F.A00;
        AnonymousClass057 A00 = C10M.A00(num, 0, 0);
        this.A0H = A00;
        this.A0Q = A00;
        AnonymousClass057 A002 = C10M.A00(num, 0, 0);
        this.A0E = A002;
        this.A0O = A002;
        AnonymousClass057 A003 = C10M.A00(num, 0, 0);
        this.A0D = A003;
        this.A0N = A003;
        AnonymousClass057 A004 = C10M.A00(num, 0, 0);
        this.A0C = A004;
        this.A0M = A004;
        AnonymousClass057 A005 = C10M.A00(num, 0, 0);
        this.A0F = A005;
        this.A0P = A005;
        AnonymousClass057 A006 = C10M.A00(num, 0, 0);
        this.A0G = A006;
        this.A0U = A006;
        AnonymousClass057 A007 = C10M.A00(num, 0, 0);
        this.A0K = A007;
        this.A0T = A007;
        AnonymousClass057 A008 = C10M.A00(num, 0, 0);
        this.A0J = A008;
        this.A0S = A008;
        AnonymousClass057 A009 = C10M.A00(num, 0, 0);
        this.A0I = A009;
        this.A0R = A009;
        this.A08 = new ReentrantReadWriteLock();
        this.A06 = AbstractC166987dD.A1I();
        this.A09 = AbstractC09440dt.A01(new C37061GUv(this, 46));
        this.A03 = (OMF) userSession.A01(OMF.class, new C37061GUv(userSession, 45));
        this.A02 = (SettingsNetworkInteractor) userSession.A01(SettingsNetworkInteractor.class, new C37061GUv(userSession, 44));
        this.A0A = c19l.Arv();
        this.A0L = C10E.A00(C56721PFn.A00);
    }
}
