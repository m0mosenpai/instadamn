package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import fxcache.model.FxCalAccountWithSwitcherInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Dt2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31518Dt2 implements CallerContextable {
    public static final String __redex_internal_original_name = "CompanyIdentitySwitcherHelper";
    public static final AtomicLong A01 = new AtomicLong();
    public static final CallerContext A00 = CallerContext.A00(C31518Dt2.class);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(android.content.Context r20, X.EnumC31512Dsw r21, final com.instagram.common.session.UserSession r22, java.lang.Integer r23) {
        /*
            r5 = 1
            r1 = r22
            if (r23 == 0) goto L5e
            int r2 = X.AbstractC71963Ku.A00(r1)
            X.3Kt r0 = X.C3Ks.A01
            int r0 = r0.A03(r1, r5)
            if (r2 > 0) goto L13
            if (r0 <= 0) goto L5e
        L13:
            r13 = 1
        L14:
            boolean r3 = X.AbstractC54472f1.A03()
            int r2 = X.AbstractC71963Ku.A00(r1)
            X.3Kt r0 = X.C3Ks.A01
            int r0 = r0.A03(r1, r5)
            if (r3 == 0) goto L25
            int r2 = r2 + r0
        L25:
            long r2 = (long) r2
        L26:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = r1.userId
            java.lang.Long r9 = X.AbstractC25228BEl.A13(r0)
            java.lang.Long r10 = X.AbstractC25228BEl.A13(r0)
            r4 = r21
            r6 = r4
            r7 = r1
            r11 = r2
            java.util.HashMap r2 = X.C31514Dsy.A02(r6, r7, r8, r9, r10, r11, r13)
            java.lang.String r0 = "event_session_id"
            java.lang.String r8 = X.AbstractC31171DnF.A0h(r0, r2)
            java.lang.String r3 = ""
            java.util.regex.Pattern r0 = X.AbstractC13670mt.A01
            if (r8 != 0) goto L4a
            r8 = r3
        L4a:
            java.lang.String r7 = r4.A00
            java.lang.String r0 = "entry_point"
            java.lang.String r2 = X.AbstractC31171DnF.A0h(r0, r2)
            if (r2 != 0) goto L55
            r2 = r3
        L55:
            java.lang.String r0 = "native_FoA"
            X.C31514Dsy.A04(r1, r2, r0)
            java.lang.Class<X.Dsy> r4 = X.C31514Dsy.class
            monitor-enter(r4)
            goto L64
        L5e:
            r13 = 0
            if (r23 != 0) goto L14
            r2 = 0
            goto L26
        L64:
            X.02i r3 = X.C006802i.A0p     // Catch: java.lang.Throwable -> Ld8
            X.C14360o3.A07(r3)     // Catch: java.lang.Throwable -> Ld8
            r2 = 857814227(0x332134d3, float:3.7533777E-8)
            r6 = 0
            boolean r0 = r3.isMarkerOn(r2, r6)     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L78
            java.lang.String r0 = "is_native_foa_xmds_switcher"
            r3.markerAnnotate(r2, r0, r5)     // Catch: java.lang.Throwable -> Ld8
        L78:
            monitor-exit(r4)
            r2 = 1579841632(0x5e2a7860, float:3.0709184E18)
            java.lang.String r0 = "CompanyIdentitySwitcherHelper.openSwitcherV1"
            X.AbstractC09800fd.A01(r0, r2)
            com.instagram.foa.session.IgMetaSessionImpl r5 = new com.instagram.foa.session.IgMetaSessionImpl     // Catch: java.lang.Throwable -> Ld0
            r5.<init>(r1)     // Catch: java.lang.Throwable -> Ld0
            X.CRq r4 = new X.CRq     // Catch: java.lang.Throwable -> Ld0
            r4.<init>(r5, r7, r8)     // Catch: java.lang.Throwable -> Ld0
            X.0Tz r0 = X.C06090Tz.A05     // Catch: java.lang.Throwable -> Ld0
            r2 = 18301933688525074(0x41058300351112, double:1.8937080899545633E-307)
            boolean r0 = X.C1AD.A06(r0, r2)     // Catch: java.lang.Throwable -> Ld0
            X.U6H r15 = X.U6H.A06     // Catch: java.lang.Throwable -> Ld0
            r9 = 0
            java.lang.Integer r17 = X.C05F.A0C     // Catch: java.lang.Throwable -> Ld0
            X.U6G r14 = X.C65981Txa.A0R     // Catch: java.lang.Throwable -> Ld0
            X.VFx r10 = X.C65981Txa.A0N     // Catch: java.lang.Throwable -> Ld0
            X.VFt r13 = X.C65981Txa.A0Q     // Catch: java.lang.Throwable -> Ld0
            X.VFs r12 = X.EnumC68200VFs.A04     // Catch: java.lang.Throwable -> Ld0
            com.meta.foa.cds.CdsBottomSheetDimmingBehaviour$Default r8 = com.meta.foa.cds.CdsBottomSheetDimmingBehaviour.Default.A00     // Catch: java.lang.Throwable -> Ld0
            X.W1X r7 = new X.W1X     // Catch: java.lang.Throwable -> Ld0
            r11 = r9
            r16 = r9
            r18 = r9
            r19 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> Ld0
            if (r0 == 0) goto Lb6
            X.CVk r0 = X.AbstractC27806CNv.A01     // Catch: java.lang.Throwable -> Ld0
            goto Lb8
        Lb6:
            X.CVk r0 = X.AbstractC27806CNv.A00     // Catch: java.lang.Throwable -> Ld0
        Lb8:
            r2 = r20
            X.AbstractC68608VXj.A00(r2, r7, r0, r5, r4)     // Catch: java.lang.Throwable -> Ld0
            android.os.Handler r2 = X.AbstractC167007dF.A0J()     // Catch: java.lang.Throwable -> Ld0
            X.GLY r0 = new X.GLY     // Catch: java.lang.Throwable -> Ld0
            r0.<init>()     // Catch: java.lang.Throwable -> Ld0
            r2.post(r0)     // Catch: java.lang.Throwable -> Ld0
            r0 = -1814750570(0xffffffff93d51a96, float:-5.3794975E-27)
            X.AbstractC09800fd.A00(r0)
            return
        Ld0:
            r1 = move-exception
            r0 = -1949439234(0xffffffff8bcdeafe, float:-7.9316705E-32)
            X.AbstractC09800fd.A00(r0)
            throw r1
        Ld8:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31518Dt2.A03(android.content.Context, X.Dsw, com.instagram.common.session.UserSession, java.lang.Integer):void");
    }

    public static void A01(final Context context, final Fragment fragment, final EnumC31512Dsw enumC31512Dsw, final UserSession userSession, final Integer num) {
        final boolean A04;
        final boolean A06 = C1AD.A06(C06090Tz.A05, 2324144942901825807L);
        if (A06) {
            A04 = false;
        } else {
            A04 = AbstractC54472f1.A04(18301933687673096L, true);
        }
        if (AbstractC1565471c.A00(userSession).A00() == null && AbstractC1565371b.A01(userSession)) {
            AbstractC62277S4w.A00(new InterfaceC16660sJ() { // from class: X.GRq
                @Override // X.InterfaceC16660sJ
                public final Object invoke(Object obj) {
                    C31518Dt2.A03(context, enumC31512Dsw, userSession, num);
                    return null;
                }
            }, userSession);
        } else {
            A03(context, enumC31512Dsw, userSession, num);
        }
    }

    public static void A02(final Context context, final EnumC31512Dsw enumC31512Dsw, final UserSession userSession, final Integer num) {
        final boolean A04;
        final boolean A06 = C1AD.A06(C06090Tz.A05, 2324144942901825807L);
        if (A06) {
            A04 = false;
        } else {
            A04 = AbstractC54472f1.A04(18301933687673096L, true);
        }
        if (AbstractC1565471c.A00(userSession).A00() == null && AbstractC1565371b.A01(userSession)) {
            AbstractC62277S4w.A00(new InterfaceC16660sJ() { // from class: X.GRp
                @Override // X.InterfaceC16660sJ
                public final Object invoke(Object obj) {
                    C31518Dt2.A03(context, enumC31512Dsw, userSession, num);
                    return null;
                }
            }, userSession);
        } else {
            A03(context, enumC31512Dsw, userSession, num);
        }
    }

    public static ArrayList A00(UserSession userSession, List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        boolean A04 = AbstractC54472f1.A04(18301933686558975L, true);
        boolean A08 = AbstractC54472f1.A08(userSession, AbstractC49092Nc.A00(userSession).A00(A00, AbstractC111324zv.A00(115)));
        if ((!A04 || !A08) && !AbstractC1565371b.A00(userSession)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FxCalAccountWithSwitcherInfo fxCalAccountWithSwitcherInfo = (FxCalAccountWithSwitcherInfo) it.next();
                if (!fxCalAccountWithSwitcherInfo.A04.equals("INSTAGRAM")) {
                    String num = Integer.toString(fxCalAccountWithSwitcherInfo.A02);
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put("OBFUSCATED_ACCOUNT_ID", fxCalAccountWithSwitcherInfo.A07);
                    String str = "";
                    A1G.put("USER_ID", "");
                    String str2 = fxCalAccountWithSwitcherInfo.A08;
                    if (str2 == null) {
                        str2 = "";
                    }
                    A1G.put(AbstractC111324zv.A00(664), str2);
                    A1G.put(AbstractC111324zv.A00(582), fxCalAccountWithSwitcherInfo.A04);
                    String str3 = fxCalAccountWithSwitcherInfo.A0B;
                    if (str3 == null) {
                        str3 = "";
                    }
                    A1G.put("USERNAME", str3);
                    String str4 = fxCalAccountWithSwitcherInfo.A06;
                    if (str4 != null) {
                        str = str4;
                    }
                    A1G.put("NAME", str);
                    A1G.put(AbstractC111324zv.A00(591), num);
                    A1G.put("UNPACKED_NOTIFICATIONS", fxCalAccountWithSwitcherInfo.A0A);
                    A1E.add(A1G);
                }
            }
        }
        return A1E;
    }

    public static boolean A05() {
        long currentTimeMillis = System.currentTimeMillis();
        AtomicLong atomicLong = A01;
        if (currentTimeMillis - atomicLong.get() < 500) {
            return true;
        }
        atomicLong.set(currentTimeMillis);
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0049. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(androidx.fragment.app.Fragment r16, androidx.fragment.app.FragmentActivity r17, X.InterfaceC11380iw r18, com.instagram.common.session.UserSession r19, java.lang.Boolean r20, java.lang.Double r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31518Dt2.A04(androidx.fragment.app.Fragment, androidx.fragment.app.FragmentActivity, X.0iw, com.instagram.common.session.UserSession, java.lang.Boolean, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
