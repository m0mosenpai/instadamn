package com.instagram.sup.voltron;

import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC195978lm;
import X.AbstractC43592JPx;
import X.AnonymousClass001;
import X.AnonymousClass139;
import X.AnonymousClass194;
import X.AnonymousClass197;
import X.C05F;
import X.C12L;
import X.C12N;
import X.C14360o3;
import X.C195988ln;
import X.C19L;
import X.C1RQ;
import X.C57473Pf9;
import X.EnumC27091Ti;
import X.InterfaceC09390do;
import X.InterfaceC57996Png;
import X.InterfaceC58078Pp3;
import X.InterfaceC58079Pp4;
import X.InterfaceC58127Ppq;
import X.InterfaceC58187Pqt;
import X.InterfaceC58276PsU;
import X.MSY;
import X.MTC;
import X.MTD;
import X.P4P;
import X.PYq;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class SUPMediaStreamControllerDownloader {
    public InterfaceC58276PsU A00;
    public InterfaceC58078Pp3 A01;
    public InterfaceC58127Ppq A02;
    public InterfaceC58079Pp4 A03;
    public InterfaceC58187Pqt A04;
    public final AtomicBoolean A05;
    public final InterfaceC09390do A06;
    public final C19L A07;
    public final AnonymousClass139 A08;

    public SUPMediaStreamControllerDownloader(C12N c12n) {
        C14360o3.A0B(c12n, 1);
        this.A08 = new AnonymousClass139();
        this.A07 = AnonymousClass194.A02(new AnonymousClass197(null).plus(AbstractC43592JPx.A0W(c12n, 730193652)));
        this.A05 = new AtomicBoolean();
        this.A06 = AbstractC09440dt.A01(C57473Pf9.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #0 {all -> 0x00a1, blocks: (B:11:0x005b, B:12:0x0067, B:14:0x006d, B:21:0x0080, B:24:0x008c, B:16:0x007b), top: B:10:0x005b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(android.content.Context r10, com.instagram.common.session.UserSession r11, com.instagram.sup.voltron.SUPMediaStreamControllerDownloader r12, X.InterfaceC23621Ds r13) {
        /*
            r4 = 30
            boolean r0 = X.MAP.A02(r13, r4)
            if (r0 == 0) goto L38
            r3 = r13
            X.MAP r3 = (X.MAP) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r1 = r3.A05
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r5 = 0
            java.lang.String r8 = "sup:MediaStreamControllerDownloader"
            r6 = 1
            if (r0 == 0) goto L43
            if (r0 != r6) goto L3e
            java.lang.Object r4 = r3.A04
            X.139 r4 = (X.AnonymousClass139) r4
            java.lang.Object r11 = r3.A03
            com.instagram.common.session.UserSession r11 = (com.instagram.common.session.UserSession) r11
            java.lang.Object r10 = r3.A02
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r12 = r3.A01
            com.instagram.sup.voltron.SUPMediaStreamControllerDownloader r12 = (com.instagram.sup.voltron.SUPMediaStreamControllerDownloader) r12
            X.AbstractC09560e7.A00(r1)
            goto L5b
        L38:
            X.MAP r3 = new X.MAP
            r3.<init>(r12, r13, r4)
            goto L16
        L3e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L43:
            X.AbstractC09560e7.A00(r1)
            X.8ln r1 = X.AbstractC195978lm.A02
            java.lang.String r0 = "Successfully downloaded module"
            r1.A01(r8, r0)
            X.139 r4 = r12.A08
            r3.A01 = r12
            X.MAP.A00(r10, r11, r4, r3, r6)
            java.lang.Object r0 = X.AnonymousClass139.A00(r3, r4)
            if (r0 != r2) goto L5b
            return r2
        L5b:
            X.0do r7 = r12.A06     // Catch: java.lang.Throwable -> La1
            java.lang.Object r0 = X.AbstractC166987dD.A17(r7)     // Catch: java.lang.Throwable -> La1
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> La1
            java.util.Iterator r9 = X.AbstractC166997dE.A15(r0)     // Catch: java.lang.Throwable -> La1
        L67:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L8c
            java.util.Map$Entry r0 = X.AbstractC166987dD.A1K(r9)     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = X.AbstractC31172DnG.A17(r0)     // Catch: java.lang.Throwable -> La1
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> La1
            X.Png r0 = (X.InterfaceC57996Png) r0     // Catch: java.lang.Throwable -> La1
            A01(r10, r11, r0, r12)     // Catch: java.lang.Throwable -> L7f
            goto L67
        L7f:
            r2 = move-exception
            X.8ln r1 = X.AbstractC195978lm.A02     // Catch: java.lang.Throwable -> La1
            java.lang.String r0 = "error executing callback with callerId "
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r3)     // Catch: java.lang.Throwable -> La1
            r1.A05(r8, r0, r2)     // Catch: java.lang.Throwable -> La1
            goto L67
        L8c:
            java.lang.Object r0 = X.AbstractC166987dD.A17(r7)     // Catch: java.lang.Throwable -> La1
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> La1
            r0.clear()     // Catch: java.lang.Throwable -> La1
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.A05     // Catch: java.lang.Throwable -> La1
            r0 = 0
            r1.compareAndSet(r6, r0)     // Catch: java.lang.Throwable -> La1
            r4.A04(r5)
            X.0eB r2 = X.C0eB.A00
            return r2
        La1:
            r0 = move-exception
            r4.A04(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.sup.voltron.SUPMediaStreamControllerDownloader.A00(android.content.Context, com.instagram.common.session.UserSession, com.instagram.sup.voltron.SUPMediaStreamControllerDownloader, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc A[Catch: IllegalAccessException -> 0x00f7, ClassNotFoundException -> 0x00fd, ExceptionInInitializerError -> 0x0103, LinkageError -> 0x0109, InstantiationException -> 0x010f, TryCatch #6 {ClassNotFoundException -> 0x00fd, ExceptionInInitializerError -> 0x0103, IllegalAccessException -> 0x00f7, InstantiationException -> 0x010f, LinkageError -> 0x0109, blocks: (B:115:0x00b5, B:72:0x00c8, B:74:0x00cc, B:75:0x00df, B:77:0x00e3), top: B:114:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e3 A[Catch: IllegalAccessException -> 0x00f7, ClassNotFoundException -> 0x00fd, ExceptionInInitializerError -> 0x0103, LinkageError -> 0x0109, InstantiationException -> 0x010f, TRY_LEAVE, TryCatch #6 {ClassNotFoundException -> 0x00fd, ExceptionInInitializerError -> 0x0103, IllegalAccessException -> 0x00f7, InstantiationException -> 0x010f, LinkageError -> 0x0109, blocks: (B:115:0x00b5, B:72:0x00c8, B:74:0x00cc, B:75:0x00df, B:77:0x00e3), top: B:114:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.content.Context r4, com.instagram.common.session.UserSession r5, X.InterfaceC57996Png r6, com.instagram.sup.voltron.SUPMediaStreamControllerDownloader r7) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.sup.voltron.SUPMediaStreamControllerDownloader.A01(android.content.Context, com.instagram.common.session.UserSession, X.Png, com.instagram.sup.voltron.SUPMediaStreamControllerDownloader):void");
    }

    public final void A02(Context context, UserSession userSession, InterfaceC57996Png interfaceC57996Png, String str) {
        String str2;
        C195988ln c195988ln = AbstractC195978lm.A02;
        c195988ln.A03("sup:MediaStreamControllerDownloader", "Attempt to load Voltron module");
        if (((Map) AbstractC166987dD.A17(this.A06)).containsKey(str)) {
            c195988ln.A06("sup:MediaStreamControllerDownloader", AnonymousClass001.A0g("Warning! Callback ID ", str, " already exists.  Adding a callback with the same ID will overwrite the existing one"), null);
        }
        if (!MSY.A1T(context, userSession)) {
            c195988ln.A06("sup:MediaStreamControllerDownloader", "Sup plugin not available, failed DL", null);
            return;
        }
        AtomicBoolean atomicBoolean = this.A05;
        if (atomicBoolean.get()) {
            str2 = "Skip download request, currently downloading";
        } else {
            C1RQ A00 = C1RQ.A00();
            EnumC27091Ti enumC27091Ti = EnumC27091Ti.A1G;
            if (!A00.A05(enumC27091Ti)) {
                c195988ln.A01("sup:MediaStreamControllerDownloader", "start downloading request");
                c195988ln.A03("sup:MediaStreamControllerDownloader", "Handling AddCallback");
                AbstractC166987dD.A1Z(new PYq(context, userSession, interfaceC57996Png, this, str, null), this.A07);
                atomicBoolean.compareAndSet(false, true);
                C1RQ A002 = C1RQ.A00();
                MTC mtc = new MTC(enumC27091Ti);
                mtc.A03 = C05F.A00;
                mtc.A02 = new P4P(context, userSession, this);
                A002.A03(userSession, new MTD(mtc));
                return;
            }
            if (!C1RQ.A00().A06(enumC27091Ti) && !C1RQ.A00().A07(enumC27091Ti)) {
                str2 = "Module not loaded";
            } else {
                A01(context, userSession, interfaceC57996Png, this);
                return;
            }
        }
        c195988ln.A01("sup:MediaStreamControllerDownloader", str2);
        c195988ln.A03("sup:MediaStreamControllerDownloader", "Handling AddCallback");
        AbstractC166987dD.A1Z(new PYq(context, userSession, interfaceC57996Png, this, str, null), this.A07);
    }

    public SUPMediaStreamControllerDownloader() {
        this(C12L.A00);
    }
}
