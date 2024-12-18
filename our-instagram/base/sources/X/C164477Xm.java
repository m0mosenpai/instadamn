package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.7Xm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164477Xm {
    public final UserSession A00;
    public final AnonymousClass983 A01;
    public final C2056598p A02;
    public final C164387Xb A03;
    public final Runnable A04;
    public final Runnable A05;
    public final WeakReference A06;
    public final InterfaceC08830cm A07;
    public final Handler A09;
    public final C13920nI A0A;
    public volatile C45085JxF A0B;
    public volatile C66057Tyu A0C;
    public volatile C2056698q A0D = C2056698q.A01;
    public final InterfaceC09390do A08 = AbstractC09440dt.A01(new C9ED(this, 28));

    private final boolean A01() {
        C2EE Aq4;
        C7U0 c7u0 = (C7U0) this.A07.get();
        if (c7u0 == null || (Aq4 = c7u0.Aq4()) == null || Aq4.BI1() != 7) {
            return false;
        }
        return true;
    }

    public final long A02() {
        String str;
        Integer num;
        C45085JxF c45085JxF;
        Long l;
        C66057Tyu c66057Tyu = this.A0C;
        EnumC44104JeT enumC44104JeT = null;
        if (c66057Tyu != null) {
            str = c66057Tyu.A06;
        } else {
            str = null;
        }
        if ("IG_SAFETY_EDUCATION_NOTICE_COMPOSER_BLOCK".equalsIgnoreCase(str)) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36317161123484493L)) {
                C66057Tyu c66057Tyu2 = this.A0C;
                if (c66057Tyu2 == null || (l = c66057Tyu2.A05) == null) {
                    return 0L;
                }
                return l.longValue();
            }
        }
        C45085JxF c45085JxF2 = this.A0B;
        if (c45085JxF2 != null) {
            num = c45085JxF2.A02;
        } else {
            num = null;
        }
        if (num != C05F.A00) {
            return 0L;
        }
        C45085JxF c45085JxF3 = this.A0B;
        if (c45085JxF3 != null) {
            enumC44104JeT = c45085JxF3.A01;
        }
        if (enumC44104JeT != EnumC44104JeT.A05 || (c45085JxF = this.A0B) == null) {
            return 0L;
        }
        return c45085JxF.A00;
    }

    public final String A03() {
        Integer num;
        EnumC44104JeT enumC44104JeT;
        C45085JxF c45085JxF;
        C45085JxF c45085JxF2 = this.A0B;
        if (c45085JxF2 != null) {
            num = c45085JxF2.A02;
        } else {
            num = null;
        }
        if (num != C05F.A00) {
            return null;
        }
        C45085JxF c45085JxF3 = this.A0B;
        if (c45085JxF3 != null) {
            enumC44104JeT = c45085JxF3.A01;
        } else {
            enumC44104JeT = null;
        }
        if (enumC44104JeT != EnumC44104JeT.A05) {
            return null;
        }
        if (C18U.A06(C06090Tz.A05, this.A00, 36317161123484493L) || (c45085JxF = this.A0B) == null) {
            return null;
        }
        return c45085JxF.A03;
    }

    public final boolean A05() {
        if (this.A0D.A00 <= System.currentTimeMillis() / 1000) {
            return false;
        }
        return true;
    }

    public final boolean A06() {
        String BNA;
        C2EE Aq4 = ((C7U0) this.A07.get()).Aq4();
        if (Aq4 == null || (BNA = Aq4.BNA()) == null || BNA.length() <= 0) {
            return false;
        }
        return true;
    }

    public C164477Xm(Handler handler, UserSession userSession, C13920nI c13920nI, AnonymousClass983 anonymousClass983, C2056598p c2056598p, C164387Xb c164387Xb, Runnable runnable, Runnable runnable2, WeakReference weakReference, InterfaceC08830cm interfaceC08830cm) {
        this.A00 = userSession;
        this.A06 = weakReference;
        this.A09 = handler;
        this.A07 = interfaceC08830cm;
        this.A01 = anonymousClass983;
        this.A04 = runnable;
        this.A05 = runnable2;
        this.A02 = c2056598p;
        this.A03 = c164387Xb;
        this.A0A = c13920nI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r13.A06() != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C164477Xm r13) {
        /*
            boolean r0 = r13.A04()
            if (r0 == 0) goto L7b
            boolean r0 = r13.A01()
            if (r0 != 0) goto L7b
            long r0 = r13.A02()
            java.lang.String r6 = r13.A03()
            com.instagram.common.session.UserSession r5 = r13.A00
            X.0Tz r4 = X.C06090Tz.A05
            r2 = 36317161123484493(0x8106440004134d, double:3.030457159737046E-306)
            boolean r2 = X.C18U.A06(r4, r5, r2)
            r7 = 0
            if (r2 == 0) goto L2e
            X.Tyu r2 = r13.A0C
            if (r2 == 0) goto L2e
            X.Tyv r2 = r2.A03
            if (r2 == 0) goto L2e
            java.lang.String r7 = r2.A00
        L2e:
            X.0cm r2 = r13.A07
            java.lang.Object r3 = r2.get()
            X.7U0 r3 = (X.C7U0) r3
            X.2EE r5 = r3.Aq4()
            X.7DI r4 = X.C7DI.A08
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r11 = r3.toMillis(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r0
            r8 = 0
            r10 = 0
            X.7DC r3 = new X.7DC
            r9 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
        L4f:
            java.lang.Object r0 = r2.get()
            X.7U0 r0 = (X.C7U0) r0
            X.7Uv r2 = r0.BDF()
            boolean r0 = r13.A05()
            if (r0 != 0) goto L6c
            boolean r0 = r13.A04()
            if (r0 != 0) goto L6c
            boolean r1 = r13.A06()
            r0 = 0
            if (r1 == 0) goto L6d
        L6c:
            r0 = 1
        L6d:
            r2.DGQ(r0)
            android.os.Handler r1 = r13.A09
            X.AwO r0 = new X.AwO
            r0.<init>(r13, r3)
            r1.post(r0)
        L7a:
            return
        L7b:
            boolean r0 = r13.A05()
            if (r0 == 0) goto Laf
            boolean r0 = r13.A01()
            if (r0 != 0) goto Laf
            X.98q r0 = r13.A0D
            long r0 = r0.A00
            X.0cm r2 = r13.A07
            java.lang.Object r3 = r2.get()
            X.7U0 r3 = (X.C7U0) r3
            X.2EE r5 = r3.Aq4()
            X.7DI r4 = X.C7DI.A0A
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r11 = r3.toMillis(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r0
            r6 = 0
            r10 = 0
            X.7DC r3 = new X.7DC
            r7 = r6
            r8 = r6
            r9 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L4f
        Laf:
            boolean r0 = r13.A06()
            if (r0 == 0) goto L7a
            boolean r0 = r13.A01()
            if (r0 != 0) goto L7a
            X.0cm r2 = r13.A07
            java.lang.Object r0 = r2.get()
            X.7U0 r0 = (X.C7U0) r0
            X.2EE r0 = r0.Aq4()
            if (r0 == 0) goto Led
            java.lang.String r8 = r0.BNA()
        Lcd:
            java.lang.Object r0 = r2.get()
            X.7U0 r0 = (X.C7U0) r0
            X.2EE r5 = r0.Aq4()
            X.7DI r4 = X.C7DI.A0B
            if (r5 == 0) goto Leb
            java.lang.String r9 = r5.C7I()
        Ldf:
            r6 = 0
            r11 = 0
            r10 = 0
            X.7DC r3 = new X.7DC
            r7 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L4f
        Leb:
            r9 = 0
            goto Ldf
        Led:
            r8 = 0
            goto Lcd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164477Xm.A00(X.7Xm):void");
    }

    public final boolean A04() {
        if (A02() <= System.currentTimeMillis() / 1000) {
            return false;
        }
        return true;
    }
}
