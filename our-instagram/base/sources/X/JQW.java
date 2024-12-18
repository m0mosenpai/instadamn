package X;

import android.content.Intent;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* loaded from: classes8.dex */
public abstract class JQW {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (r6.A1S != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C19280xC A01(X.C116155Nu r6, java.lang.String r7, java.util.List r8) {
        /*
            r2 = 1
            java.lang.String r3 = r6.A0g
            java.lang.String r1 = r6.A1A
            java.lang.String r0 = r6.A0u
            X.0xC r4 = A03(r7, r3, r1, r0)
            com.instagram.common.notifications.push.intf.PushChannelType r3 = r6.A0B
            if (r3 != 0) goto L11
            com.instagram.common.notifications.push.intf.PushChannelType r3 = com.instagram.common.notifications.push.intf.PushChannelType.A0D
        L11:
            java.lang.String r5 = r6.A12
            java.lang.String r1 = "empty-or-null-ig4a"
            if (r5 != 0) goto L18
            r5 = r1
        L18:
            java.lang.String r0 = "pi"
            r4.A0C(r0, r5)
            if (r8 != 0) goto L23
            java.util.List r8 = X.AbstractC166987dD.A1J(r5)
        L23:
            java.lang.String r0 = "push_ids"
            r4.A0D(r0, r8)
            java.lang.String r0 = r6.A11
            if (r0 == 0) goto L2d
            r1 = r0
        L2d:
            java.lang.String r0 = "push_category"
            r4.A0C(r0, r1)
            java.lang.String r0 = r6.A0j
            boolean r0 = X.C50C.A02(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_bg_account"
            r4.A09(r0, r1)
            java.lang.String r1 = r6.A0j
            java.lang.String r0 = "recipient_id"
            r4.A0C(r0, r1)
            java.lang.String r1 = r3.name()
            java.lang.String r0 = "push_channel_type"
            r4.A0C(r0, r1)
            boolean r0 = r6.A1U
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_vm_active"
            r4.A09(r0, r1)
            boolean r0 = r6.A05()
            if (r0 != 0) goto L67
            boolean r1 = r6.A1S
            r0 = 0
            if (r1 == 0) goto L68
        L67:
            r0 = 1
        L68:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_e2ee"
            r4.A09(r0, r1)
            java.lang.Long r1 = r6.A0L
            java.lang.String r0 = "occamadillo_thread_id"
            if (r1 == 0) goto L7a
            r4.A0B(r0, r1)
        L7a:
            java.lang.String r1 = A04(r6)
            java.lang.String r0 = "thread_id"
            r4.A0C(r0, r1)
            java.util.ArrayList r1 = X.AbstractC166987dD.A1E()
            X.Jxr r0 = r6.A05
            if (r0 == 0) goto L96
            boolean r0 = r0.A00()
            if (r0 != r2) goto L96
            X.KeY r0 = X.EnumC46302KeY.A04
            r1.add(r0)
        L96:
            boolean r0 = r6.A1U
            if (r0 == 0) goto L9f
            X.KeY r0 = X.EnumC46302KeY.A0G
            r1.add(r0)
        L9f:
            boolean r0 = X.AbstractC25226BEj.A1b(r1)
            if (r0 == 0) goto Lc5
            X.0x9 r3 = new X.0x9
            r3.<init>()
            java.util.Iterator r2 = r1.iterator()
        Lae:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lc0
            java.lang.Object r0 = r2.next()
            X.KeY r0 = (X.EnumC46302KeY) r0
            long r0 = r0.A00
            r3.A02(r0)
            goto Lae
        Lc0:
            java.lang.String r0 = "feature_tags"
            r4.A06(r3, r0)
        Lc5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JQW.A01(X.5Nu, java.lang.String, java.util.List):X.0xC");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r7.A1S != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(android.content.Intent r6, X.C116155Nu r7) {
        /*
            r3 = 1
            com.instagram.common.notifications.push.intf.PushChannelType r4 = r7.A0B
            if (r4 != 0) goto L7
            com.instagram.common.notifications.push.intf.PushChannelType r4 = com.instagram.common.notifications.push.intf.PushChannelType.A0D
        L7:
            java.lang.String r1 = r4.name()
            java.lang.String r0 = "from_notification_push_channel_type"
            r6.putExtra(r0, r1)
            boolean r1 = r7.A1U
            java.lang.String r0 = "is_vm_active"
            r6.putExtra(r0, r1)
            boolean r0 = r7.A05()
            if (r0 != 0) goto L22
            boolean r0 = r7.A1S
            r1 = 0
            if (r0 == 0) goto L23
        L22:
            r1 = 1
        L23:
            java.lang.String r0 = "is_e2ee"
            r6.putExtra(r0, r1)
            boolean r1 = r7.A1S
            java.lang.String r0 = "is_instamadillo"
            r6.putExtra(r0, r1)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "notification_in_tray_timestamp"
            r6.putExtra(r0, r1)
            java.lang.String r1 = r7.A0T
            java.lang.String r0 = "armadillo_thread_id"
            r6.putExtra(r0, r1)
            java.util.HashMap r1 = r7.A1J
            if (r1 != 0) goto L47
            java.util.Map r1 = java.util.Collections.emptyMap()
        L47:
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = X.AbstractC166987dD.A1A(r0, r1)
            if (r1 != 0) goto L53
            java.lang.String r1 = ""
        L53:
            java.lang.String r0 = "token_fb_id"
            r6.putExtra(r0, r1)
            java.lang.String r1 = A04(r7)
            java.lang.String r0 = "thread_id"
            r6.putExtra(r0, r1)
            java.lang.Long r0 = r7.A0L
            if (r0 == 0) goto L6e
            long r1 = r0.longValue()
            java.lang.String r0 = "occamadillo_thread_id"
            r6.putExtra(r0, r1)
        L6e:
            java.util.ArrayList r5 = X.AbstractC166987dD.A1E()
            X.Jxr r0 = r7.A05
            if (r0 == 0) goto L81
            boolean r0 = r0.A00()
            if (r0 != r3) goto L81
            r0 = 15
            X.AbstractC166997dE.A1X(r5, r0)
        L81:
            boolean r0 = r7.A1U
            if (r0 == 0) goto L8a
            r0 = 23
            X.AbstractC166997dE.A1X(r5, r0)
        L8a:
            int r0 = r7.A02
            if (r0 != r3) goto L93
            r0 = 63
            X.AbstractC166997dE.A1X(r5, r0)
        L93:
            long r3 = r7.A04
            r1 = 4
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto La1
            r0 = 64
            X.AbstractC166997dE.A1X(r5, r0)
        La1:
            boolean r0 = X.AbstractC25226BEj.A1b(r5)
            if (r0 == 0) goto Lb0
            long[] r1 = X.AbstractC001800i.A0y(r5)
            java.lang.String r0 = "feature_tags"
            r6.putExtra(r0, r1)
        Lb0:
            X.5f9 r0 = r7.A0A
            if (r0 == 0) goto Lbd
            java.lang.String r1 = r0.A07
            if (r1 == 0) goto Lbd
            java.lang.String r0 = "push_infra_notification_id"
            r6.putExtra(r0, r1)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JQW.A05(android.content.Intent, X.5Nu):void");
    }

    public static final C19280xC A00(Intent intent, String str, String str2) {
        C19280xC A03 = A03(str, intent.getStringExtra("landing_path"), intent.getStringExtra("sender_id"), null);
        A03.A09("is_e2ee", Boolean.valueOf(intent.getBooleanExtra("is_e2ee", false)));
        long longExtra = intent.getLongExtra("occamadillo_thread_id", 0L);
        if (longExtra != 0) {
            A03.A0B("occamadillo_thread_id", Long.valueOf(longExtra));
        }
        if (str2 != null) {
            A03.A0C("recipient_id", str2);
        }
        String stringExtra = intent.getStringExtra(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        if (stringExtra != null) {
            A03.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, stringExtra);
        }
        A03.A09("is_vm_active", Boolean.valueOf(intent.getBooleanExtra("is_vm_active", false)));
        A03.A08(2, "render_target");
        long[] longArrayExtra = intent.getLongArrayExtra("feature_tags");
        if (longArrayExtra != null) {
            C0x9 c0x9 = new C0x9();
            for (long j : longArrayExtra) {
                c0x9.A02(j);
            }
            A03.A06(c0x9, "feature_tags");
        }
        return A03;
    }

    public static final C19280xC A02(String str) {
        String str2;
        "push_notification".getClass();
        C19280xC A01 = C19280xC.A01("push_notification", null);
        A01.A0C(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A01.A0C("app_startup_type", C1CC.A09.toString());
        if (C218914p.A08()) {
            str2 = AppStateModule.APP_STATE_BACKGROUND;
        } else {
            str2 = "foreground";
        }
        A01.A0C("app_state", str2);
        return A01;
    }

    public static final String A04(C116155Nu c116155Nu) {
        String str = c116155Nu.A1G;
        if (str == null) {
            str = c116155Nu.A1F;
        }
        if (str == null) {
            str = "";
        }
        String str2 = c116155Nu.A0g;
        if (str.length() == 0 && str2 != null && str2.length() != 0) {
            String A01 = AbstractC43609JQq.A01(AbstractC25227BEk.A0B(str2));
            if (A01 == null) {
                return "";
            }
            return A01;
        }
        return str;
    }

    public static final C19280xC A03(String str, String str2, String str3, String str4) {
        C19280xC A02 = A02(str);
        C19260xA c19260xA = new C19260xA();
        if (str2 != null) {
            C19260xA.A00(c19260xA, str2, "landing_path");
        }
        if (str3 != null) {
            C19260xA.A00(c19260xA, str3, "sender_id");
        }
        Long A0n = AbstractC25233BEq.A0n(str4);
        if (A0n != null) {
            C19260xA.A00(c19260xA, A0n, "message_timestamp_ms");
        }
        Long valueOf = Long.valueOf(AbstractC37300Gc1.A00(AbstractC19750y3.A01("direct_sync_notification_preferences").getLong("account_switch_timestamp", 0L)));
        if (valueOf != null) {
            C19260xA.A00(c19260xA, valueOf, "since_acct_switch_ms");
        }
        A02.A05(c19260xA, "extra_data");
        return A02;
    }
}
