package com.facebook.msys.mca;

import X.AbstractC1345065z;
import X.C0J8;
import X.C137306Jk;
import X.InterfaceC135846Cm;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.msys.util.NotificationScope;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class MailboxFeature {
    public static final MailboxFeature $redex_init_class = null;
    public final InterfaceC135846Cm mMailboxApiHandleMetaProvider;

    /* loaded from: classes3.dex */
    public interface DbConnectionResolutionCallback {
        Object run(Mailbox mailbox, SqliteHolder sqliteHolder);
    }

    public static final native void safeDispatchToDbConnectionAndResolve(Mailbox mailbox, MailboxFutureImpl mailboxFutureImpl, Object obj, int i, int i2, NotificationScope notificationScope, PrivacyContext privacyContext, String str, String str2, DbConnectionResolutionCallback dbConnectionResolutionCallback);

    public static final void safeDispatchToDbConnectionAndResolve(Mailbox mailbox, MailboxFutureImpl mailboxFutureImpl, Object obj, int i, int i2, String str, String str2, DbConnectionResolutionCallback dbConnectionResolutionCallback) {
        safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj, i, i2, null, null, str, str2, dbConnectionResolutionCallback);
    }

    static {
        C137306Jk.A00();
    }

    public MailboxFeature(InterfaceC135846Cm interfaceC135846Cm) {
        this.mMailboxApiHandleMetaProvider = interfaceC135846Cm;
    }

    public static final Object getNonNullNotificationValue(AbstractC1345065z abstractC1345065z, Map map, String str, int i) {
        Object A00 = abstractC1345065z.A00(i);
        Object obj = map.get(A00);
        C0J8.A05(obj, "Failed to find required key '%s' in payload for notification '%s'. Make sure that your header annotations (MAILBOX_NOTIFICATION_CONTAINS_KEY or MAILBOX_NOTIFICATION_MAY_CONTAIN_KEY) match the behavior of your Mailbox API function.", A00, str);
        return obj;
    }
}
