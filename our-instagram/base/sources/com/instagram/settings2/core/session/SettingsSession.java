package com.instagram.settings2.core.session;

import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.AbstractC25231BEo;
import X.AbstractC43593JPy;
import X.AbstractC55145Od4;
import X.C008002u;
import X.C05A;
import X.C0K8;
import X.C19L;
import X.C43171J6q;
import X.C57714Pj3;
import X.InterfaceC15070pN;
import X.InterfaceC16660sJ;
import X.JEZ;
import X.MSX;
import com.instagram.common.session.UserSession;
import com.instagram.settings2.core.data.SettingsRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes9.dex */
public final class SettingsSession {
    public final UserSession A00;
    public final SettingsRepository A01;
    public final String A02;
    public final Map A03;
    public final ReentrantReadWriteLock A04;
    public final C05A A05;
    public final C05A A06;
    public final InterfaceC15070pN A07;
    public final InterfaceC15070pN A08;

    /* JADX WARN: Finally extract failed */
    public static final void A00(SettingsSession settingsSession, InterfaceC16660sJ interfaceC16660sJ) {
        int i;
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = settingsSession.A04;
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
                Map map = settingsSession.A03;
                map.size();
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator A12 = AbstractC43593JPy.A12(map);
                while (A12.hasNext()) {
                    AbstractC55145Od4 abstractC55145Od4 = (AbstractC55145Od4) A12.next();
                    if (AbstractC25231BEo.A1a(abstractC55145Od4, interfaceC16660sJ)) {
                        A1E.add(abstractC55145Od4);
                    }
                }
                Iterator it = A1E.iterator();
                while (it.hasNext()) {
                    map.remove((AbstractC55145Od4) it.next());
                }
                map.size();
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                A0p.unlock();
                settingsSession.A06.Egh(new Date());
            } catch (Throwable th) {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                A0p.unlock();
                throw th;
            }
        } catch (Exception e) {
            C0K8.A0F("SettingsSession", "Error while invalidating values", e);
            settingsSession.A05.Egh(new Date());
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.util.List r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 42
            boolean r0 = X.PXC.A03(r7, r3)
            if (r0 == 0) goto L36
            r4 = r7
            X.PXC r4 = (X.PXC) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L36
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L2a
            if (r1 != r0) goto L3c
            X.AbstractC09560e7.A00(r3)
        L24:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<T of com.instagram.settings2.core.session.SettingsSession.resolveList>"
            X.C14360o3.A0C(r3, r0)
            return r3
        L2a:
            X.AbstractC09560e7.A00(r3)
            r4.A00 = r0
            java.lang.Object r3 = r5.A02(r6, r4)
            if (r3 != r2) goto L24
            return r2
        L36:
            X.PXC r4 = new X.PXC
            r4.<init>(r5, r7, r3, r3)
            goto L16
        L3c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.session.SettingsSession.A01(java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0099 A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:12:0x00be, B:13:0x00c1, B:15:0x0093, B:17:0x0099, B:19:0x00a1, B:25:0x00c6, B:28:0x00d1), top: B:11:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6 A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:12:0x00be, B:13:0x00c1, B:15:0x0093, B:17:0x0099, B:19:0x00a1, B:25:0x00c6, B:28:0x00d1), top: B:11:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7 A[Catch: Exception -> 0x0101, LOOP:1: B:39:0x00f5->B:40:0x00f7, LOOP_END, TRY_ENTER, TryCatch #3 {Exception -> 0x0101, blocks: (B:30:0x00d7, B:32:0x00dd, B:34:0x00e6, B:40:0x00f7, B:42:0x00fd, B:43:0x0100), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00b9 -> B:13:0x00c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00bc -> B:13:0x00c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.util.List r21, X.InterfaceC23621Ds r22) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.session.SettingsSession.A02(java.util.List, X.1Ds):java.lang.Object");
    }

    public final void A03() {
        this.A01.A0C();
        A00(this, C57714Pj3.A00);
    }

    public /* synthetic */ SettingsSession(UserSession userSession, SettingsRepository settingsRepository, String str, C19L c19l) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        this.A00 = userSession;
        this.A01 = settingsRepository;
        this.A02 = str;
        this.A03 = A1I;
        AbstractC43593JPy.A1X(new C43171J6q(this, null, 18), c19l, settingsRepository.A0M);
        this.A04 = new ReentrantReadWriteLock();
        C008002u A1H = AbstractC25225BEi.A1H(new Date());
        this.A06 = A1H;
        this.A08 = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(new Date());
        this.A05 = A1H2;
        this.A07 = A1H2;
    }

    public final void A04(Set set) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("invalidate settings (");
        A1C.append(set);
        A1C.append(')');
        A1C.toString();
        A00(this, new JEZ(set, 30));
    }
}
