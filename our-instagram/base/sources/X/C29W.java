package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.TimeZone;

/* renamed from: X.29W, reason: invalid class name */
/* loaded from: classes.dex */
public final class C29W {
    public final UserSession A00;

    public C29W(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r5 > 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A00() {
        /*
            r9 = this;
            X.0cb r1 = X.C17060sy.A01
            com.instagram.common.session.UserSession r7 = r9.A00
            com.instagram.user.model.User r0 = r1.A01(r7)
            X.17P r0 = r0.A03
            java.lang.Integer r0 = r0.AvT()
            if (r0 == 0) goto L68
            int r0 = r0.intValue()
        L14:
            long r3 = (long) r0
            X.282 r8 = X.AnonymousClass280.A01
            com.instagram.user.model.User r0 = r1.A01(r7)
            X.17P r0 = r0.A03
            X.16s r0 = r0.C45()
            if (r0 == 0) goto L5b
            java.lang.Integer r0 = r0.Bqo()
            if (r0 == 0) goto L5b
            int r0 = r0.intValue()
            if (r0 < 0) goto L5b
            long r5 = (long) r0
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5b
        L36:
            boolean r0 = r8.A0C(r7)
            if (r0 != 0) goto L6a
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342156721479878874(0x20810321001a08da, double:4.060254415335687E-152)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            r7 = 0
            if (r0 == 0) goto L56
            r1 = -1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L55
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L6a
        L55:
            return r3
        L56:
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L55
            return r5
        L5b:
            X.0xq r5 = r8.A06(r7)
            java.lang.String r2 = "DAILY_QUOTA"
            r0 = 0
            long r5 = r5.getLong(r2, r0)
            goto L36
        L68:
            r0 = 0
            goto L14
        L6a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29W.A00():long");
    }

    public final long A01() {
        int i;
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A00;
        Integer AiA = c08730cb.A01(userSession).A03.AiA();
        if (AiA != null) {
            i = AiA.intValue();
        } else {
            i = 0;
        }
        long j = i;
        long j2 = AnonymousClass280.A01.A06(userSession).getLong("TAKE_A_BREAK", 0L);
        if (!C18U.A06(C06090Tz.A05, userSession, 2342156721479878874L) ? j2 <= 0 : j2 == -1 || j > 0) {
            return j;
        }
        return j2;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0ps, java.lang.Object] */
    public final void A02(Fragment fragment, long j) {
        ?? obj = new Object();
        UserSession userSession = this.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 2342156721479878874L)) {
            obj.A00 = new FK0(this, j);
        } else {
            InterfaceC19610xo ARD = AnonymousClass280.A01.A06(userSession).ARD();
            ARD.E7G("DAILY_QUOTA", j);
            ARD.apply();
        }
        C18920wW A01 = AbstractC12220kQ.A01(null, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_time_spent_action");
        if (A00.isSampled()) {
            A00.AAP("action", "ig_ts_reminder_setting_client_upload");
            A00.AAP("entrypoint", null);
            boolean z = false;
            if (j > 0) {
                z = true;
            }
            A00.A7v("is_reminder_set", Boolean.valueOf(z));
            A00.AAP("reminder_type", "daily_limit");
            A00.A9K("current_reminder_seconds", Long.valueOf(j));
            A00.A9K("previous_reminder_seconds", null);
            A00.A8I("usage_seconds", Double.valueOf(C461529z.A00()));
            A00.A9K("bar_idx", null);
            A00.A8I("session_length", null);
            A00.Cht();
        }
        if (fragment != null) {
            AbstractC23641Du.A05(AnonymousClass191.A00, new C50121MBv(obj, this, null, 15, j), C07Y.A00(fragment.getViewLifecycleOwner()));
        }
        C17060sy.A01.A01(userSession).A03.ESr(Integer.valueOf((int) j));
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [X.0ps, java.lang.Object] */
    public final void A03(Fragment fragment, long j) {
        ?? obj = new Object();
        UserSession userSession = this.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 2342156721479878874L)) {
            obj.A00 = new FK1(this, j);
        } else {
            InterfaceC19610xo ARD = AnonymousClass280.A01.A06(userSession).ARD();
            ARD.E7G("TAKE_A_BREAK", j);
            ARD.apply();
        }
        Double d = null;
        C18920wW A01 = AbstractC12220kQ.A01(null, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_time_spent_action");
        if (A00.isSampled()) {
            ArrayList A04 = C123815iv.A00.A04(userSession);
            A00.AAP("action", "ig_ts_reminder_setting_client_upload");
            A00.AAP("entrypoint", null);
            boolean z = false;
            if (j > 0) {
                z = true;
            }
            A00.A7v("is_reminder_set", Boolean.valueOf(z));
            A00.AAP("reminder_type", "take_break");
            A00.A9K("current_reminder_seconds", Long.valueOf(j));
            A00.A9K("previous_reminder_seconds", null);
            A00.A8I("usage_seconds", Double.valueOf(C461529z.A00()));
            A00.A9K("bar_idx", null);
            A00.A8I("session_length", null);
            A00.AAP("timezone", TimeZone.getDefault().getID());
            if (((Number) AbstractC001800i.A0O(A04, A04.size() - 1)) != null) {
                d = Double.valueOf(r0.longValue());
            }
            A00.A8I("aggregated_screen_time_today", d);
            A00.Cht();
        }
        if (fragment != null) {
            AbstractC23641Du.A05(AnonymousClass191.A00, new C50121MBv(obj, this, null, 16, j), C07Y.A00(fragment.getViewLifecycleOwner()));
        }
        C17060sy.A01.A01(userSession).A03.EQX(Integer.valueOf((int) j));
    }

    public final boolean A04() {
        long A00 = A00();
        AnonymousClass282 anonymousClass282 = AnonymousClass280.A01;
        UserSession userSession = this.A00;
        boolean A0C = anonymousClass282.A0C(userSession);
        long A02 = C461529z.A02(userSession) - anonymousClass282.A04(userSession);
        if (A00 > 0 && A0C && A02 >= A00) {
            return true;
        }
        return false;
    }
}
