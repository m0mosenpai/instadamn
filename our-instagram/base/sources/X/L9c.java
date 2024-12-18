package X;

import android.content.Intent;
import com.facebook.react.bridge.BaseJavaModule;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class L9c {
    public final C41761wQ A00;
    public final UserSession A01;

    public L9c(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC31174DnI.A0S();
    }

    public final void A01(C116155Nu c116155Nu, PushChannelType pushChannelType, String str) {
        String str2;
        EnumC117355Su enumC117355Su;
        C42221xC A0I;
        UserSession userSession = this.A01;
        if (C18U.A06(C06090Tz.A06, userSession, 36314841841011559L)) {
            if (c116155Nu != null) {
                AbstractC44086JeB.A02(c116155Nu, userSession, "onPushPathNotification: push path is disabled", null, 3);
                return;
            }
            return;
        }
        if (c116155Nu != null) {
            str2 = c116155Nu.A11;
        } else {
            str2 = null;
        }
        if (C14360o3.A0K(str2, "direct_v2_text")) {
            enumC117355Su = EnumC117355Su.A06;
        } else if (C14360o3.A0K(str2, "direct_v2_reel_share")) {
            enumC117355Su = EnumC117355Su.A05;
        } else {
            enumC117355Su = EnumC117355Su.A07;
        }
        boolean contains = AbstractC117345St.A00.contains(enumC117355Su);
        if (c116155Nu != null && contains) {
            String A02 = AbstractC43609JQq.A02(c116155Nu);
            if (A02 == null) {
                C0K8.A0Q("MsysPushNotificationRouter", "Unable to process push path notification. pushId: %s", c116155Nu.A12);
                C14360o3.A0B(PushChannelType.A0F, 3);
                AbstractC44086JeB.A02(c116155Nu, userSession, "processPushPathNotification: received notification with null message_id", BaseJavaModule.METHOD_TYPE_SYNC, 7);
            } else {
                C47458Kxn c47458Kxn = (C47458Kxn) AbstractC41851wZ.A00(userSession).A01(C47458Kxn.class, new C57518Pfs(userSession, 37));
                int i = enumC117355Su.A00;
                boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36314841842256748L);
                C47457Kxm c47457Kxm = c47458Kxn.A00;
                JQH jqh = new JQH(i, A02, 2);
                C42221xC c42221xC = c47457Kxm.A00;
                C43597JQd c43597JQd = new C43597JQd(69, jqh);
                if (A06) {
                    A0I = c42221xC.A0J(c43597JQd);
                } else {
                    A0I = c42221xC.A0I(c43597JQd);
                }
                C14360o3.A0A(A0I);
                C42221xC A0G = A0I.A0G();
                C3J1.A00().A08(c116155Nu, pushChannelType, str);
                this.A00.A02(A0G, new C49798Lz5(14, c116155Nu, pushChannelType, this));
                return;
            }
        }
        C3J1.A00().A08(c116155Nu, pushChannelType, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01af, code lost:
    
        if (r17 > r19) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C47714L4v r42) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L9c.A02(X.L4v):void");
    }

    public final void A00(Intent intent, PushChannelType pushChannelType, long j) {
        C116155Nu c116155Nu;
        String str;
        try {
            c116155Nu = C116155Nu.A00(intent, C3JG.A00(pushChannelType), C3J1.A00().A0A());
            if (c116155Nu != null) {
                c116155Nu.A0K = Long.valueOf(j);
            }
        } catch (IOException unused) {
            c116155Nu = null;
        }
        String stringExtra = intent.getStringExtra("message_type");
        if (c116155Nu != null) {
            str = c116155Nu.A0N;
        } else {
            str = null;
        }
        if (stringExtra == null) {
            stringExtra = str;
        }
        A01(c116155Nu, pushChannelType, stringExtra);
    }
}
