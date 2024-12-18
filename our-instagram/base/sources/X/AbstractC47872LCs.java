package X;

import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;

/* renamed from: X.LCs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47872LCs {
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        if (r0 == false) goto L35;
     */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.60L, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(com.facebook.pushlite.model.PushInfraMetaData r18, X.C116155Nu r19, com.instagram.common.notifications.push.intf.PushChannelType r20, com.instagram.common.session.UserSession r21) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC47872LCs.A00(com.facebook.pushlite.model.PushInfraMetaData, X.5Nu, com.instagram.common.notifications.push.intf.PushChannelType, com.instagram.common.session.UserSession):void");
    }

    public static final void A01(C116155Nu c116155Nu, PushChannelType pushChannelType, UserSession userSession, String str) {
        if (c116155Nu == null) {
            C0K8.A0E("logReceivedFromPushIntent", "Notification is null");
            return;
        }
        AbstractC19330xH A00 = AbstractC11060iN.A00(userSession);
        C19280xC A01 = JQW.A01(c116155Nu, str, null);
        A01.A0C("push_channel_type", pushChannelType.name());
        A01.A0C("message_id", AbstractC43609JQq.A02(c116155Nu));
        A00.EHW(A01);
        JQU jqu = JQU.A01;
        C43606JQm A012 = JQO.A0R.A01(c116155Nu);
        A012.A02 = pushChannelType;
        jqu.A08(new JQO(A012), "duplicate_dropped");
    }
}
