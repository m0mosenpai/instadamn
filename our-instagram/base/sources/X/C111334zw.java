package X;

import android.content.Context;
import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.4zw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C111334zw {
    public C1115750w A00;
    public C111344zx A01;
    public final UserSession A02;
    public final AnonymousClass504 A03;
    public final AnonymousClass505 A04;
    public final C111364zz A05;
    public final C111354zy A06;
    public final C111314zu A07;
    public final List A08 = new LinkedList();
    public final Context A09;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (X.AbstractC23021Ah.A00(r3).A01.getBoolean("reel_tray_personalization_is_high_me_user", false) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r6 = r11.A02;
        r5 = X.C06090Tz.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (X.C18U.A06(r5, r6, 36316203347153022L) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        if (X.AbstractC23021Ah.A00(r6).A01.getInt("reel_tray_personalization_lness28_score", 0) < X.C18U.A01(r5, r6, 36597678323927935L)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        r2 = r11.A02;
        r0 = X.C23051Ak.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        if (X.C23061Al.A00(r2).A00(X.EnumC23071Am.A08) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        if (r8.booleanValue() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        if (r7 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        if (r9 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        r2 = X.C05F.A0N;
        X.C14120nc.A00().ATO(new X.AnonymousClass509(r10, r11, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        r11.A01(r10, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
    
        if (r4 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r11.A02, 36316203347021948L) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(final X.InterfaceC111304zt r10, final X.C111334zw r11, java.lang.String r12) {
        /*
            android.content.Context r0 = r11.A09
            boolean r0 = X.AbstractC14490oL.A09(r0)
            if (r0 != 0) goto L9c
            java.lang.String r0 = "STORY"
            boolean r4 = r12.equals(r0)
            r9 = 1
            if (r4 == 0) goto L21
            com.instagram.common.session.UserSession r3 = r11.A02
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316203347021948(0x8105650017107c, double:3.0298514580454764E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L22
        L21:
            r0 = 0
        L22:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            if (r4 == 0) goto L47
            com.instagram.common.session.UserSession r3 = r11.A02
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316203347087485(0x8105650018107d, double:3.029851458086922E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L47
            X.1Ai r0 = X.AbstractC23021Ah.A00(r3)
            X.0xq r2 = r0.A01
            java.lang.String r1 = "reel_tray_personalization_is_high_me_user"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            r7 = 1
            if (r0 != 0) goto L4a
        L47:
            r7 = 0
            if (r4 == 0) goto L9d
        L4a:
            com.instagram.common.session.UserSession r6 = r11.A02
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36316203347153022(0x8105650019107e, double:3.029851458128368E-306)
            boolean r0 = X.C18U.A06(r5, r6, r0)
            if (r0 == 0) goto L9d
            X.1Ai r0 = X.AbstractC23021Ah.A00(r6)
            X.0xq r2 = r0.A01
            java.lang.String r1 = "reel_tray_personalization_lness28_score"
            r0 = 0
            int r0 = r2.getInt(r1, r0)
            long r3 = (long) r0
            r0 = 36597678323927935(0x820565001a0b7f, double:3.2078573668495806E-306)
            long r1 = X.C18U.A01(r5, r6, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L9d
        L74:
            com.instagram.common.session.UserSession r2 = r11.A02
            long r0 = X.C23051Ak.A02
            X.1Ak r1 = X.C23061Al.A00(r2)
            X.1Am r0 = X.EnumC23071Am.A08
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L9f
            boolean r0 = r8.booleanValue()
            if (r0 != 0) goto L9f
            if (r7 != 0) goto L9f
            if (r9 != 0) goto L9f
            java.lang.Integer r2 = X.C05F.A0N
            X.0nS r1 = X.C14120nc.A00()
            X.509 r0 = new X.509
            r0.<init>()
            r1.ATO(r0)
        L9c:
            return
        L9d:
            r9 = 0
            goto L74
        L9f:
            r11.A01(r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111334zw.A00(X.4zt, X.4zw, java.lang.String):void");
    }

    public final void A02(final InterfaceC111304zt interfaceC111304zt, final String str) {
        UserSession userSession = this.A02;
        if (C18U.A06(C06090Tz.A05, userSession, 36319433161055663L)) {
            interfaceC111304zt.DHJ(C05F.A0j, false);
            return;
        }
        long j = C23051Ak.A02;
        C23061Al.A00(userSession);
        if ((SystemClock.elapsedRealtime() - C23051Ak.A02) / 1000 < 300) {
            A00(interfaceC111304zt, this, str);
        } else {
            AbstractC1118452w.A00(userSession, new InterfaceC1118352v() { // from class: X.52u
                @Override // X.InterfaceC1118352v
                public final void DFf() {
                    interfaceC111304zt.DHJ(C05F.A0u, false);
                }

                @Override // X.InterfaceC1118352v
                public final void onSuccess() {
                    C111334zw.A00(interfaceC111304zt, this, str);
                }
            });
        }
    }

    public C111334zw(Context context, UserSession userSession, C111314zu c111314zu) {
        this.A09 = context;
        this.A02 = userSession;
        this.A07 = c111314zu;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36317775303743033L) && !C18U.A06(c06090Tz, userSession, 36315288519445643L) && !C18U.A06(c06090Tz, userSession, 36328508427353681L)) {
            C14360o3.A0B(context, 1);
            this.A01 = new C111344zx(context, userSession);
        }
        this.A06 = new C111354zy(context, userSession);
        this.A05 = new C111364zz(context, userSession, null);
        this.A03 = new AnonymousClass504(context, userSession, new AnonymousClass503(userSession));
        this.A04 = new AnonymousClass505(context, userSession);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00aa, code lost:
    
        if (r0 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b5, code lost:
    
        if (X.C18U.A06(r2, r3, 36316203346104431L) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
    
        r9.A07.A04(X.AnonymousClass511.A08);
        r6 = r9.A08;
        r1 = r9.A06;
        r6.add(new X.AnonymousClass513(r4, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d3, code lost:
    
        if (X.C18U.A06(r2, r3, 36320897744774120L) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d7, code lost:
    
        if (X.C36971nu.A04 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        r9.A07.A04(X.AnonymousClass511.A04);
        r9.A08.add(X.AbstractC77423dS.A00().A00(r4, r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f7, code lost:
    
        if (X.C18U.A06(r2, r3, 36315722309242363L) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f9, code lost:
    
        r9.A07.A04(X.AnonymousClass511.A07);
        r6 = r9.A08;
        r1 = r9.A05;
        r6.add(new X.C217049iz(r4, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0115, code lost:
    
        if (X.C18U.A06(r2, r3, 36319334376807612L) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0117, code lost:
    
        r9.A07.A04(X.AnonymousClass511.A03);
        r6 = r9.A08;
        r1 = r9.A03;
        r6.add(new X.AnonymousClass515(r4, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0133, code lost:
    
        if (X.C18U.A06(r2, r3, 36314085927094677L) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0135, code lost:
    
        r9.A07.A04(X.AnonymousClass511.A05);
        r2 = r9.A08;
        r1 = new X.HJP(r4, r9.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0147, code lost:
    
        if (r0 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.InterfaceC111304zt r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111334zw.A01(X.4zt, java.lang.String):void");
    }
}
