package com.instagram.direct.realtime.armadilloexpress.plugins.messagereceivedlogging;

import X.AbstractC167017dG;
import X.AbstractC31178DnM;
import X.C06090Tz;
import X.C14360o3;
import X.C46907Koo;
import X.LJA;
import com.facebook.msys.mci.AccountSession;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class IGMessageReceivedLoggingImplPostmailbox extends Postmailbox {
    public static final C46907Koo Companion = new Object();
    public static final String TAG = "IGMessageReceivedLoggingImplPostmailbox";
    public final LJA logger;
    public final UserSession userSession;

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.messagereceivedlogging.Postmailbox
    public void IGMessageReceivedLoggingImpl_MEMMessageReceivedLog(String str, long j, long j2, int i, int i2) {
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.messagereceivedlogging.Postmailbox
    public void IGMessageReceivedLoggingImpl_MEMMessageReceivedLoggingStart(String str, int i, boolean z) {
        C14360o3.A0B(str, 0);
        if (AbstractC31178DnM.A1X(C06090Tz.A05, this.userSession, 36326154787567315L)) {
            this.logger.A02(str);
            this.logger.A05(str, "message_otid", str);
            this.logger.A06(str, "is_background_account", z);
            this.logger.A04(str, "message_type", i);
        }
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.messagereceivedlogging.Postmailbox
    public void IGMessageReceivedLoggingImpl_MEMUpdateLatestNotificationPayloadContent(Object obj) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IGMessageReceivedLoggingImplPostmailbox(AccountSession accountSession, UserSession userSession) {
        super(accountSession, userSession);
        AbstractC167017dG.A1P(accountSession, userSession);
        this.userSession = userSession;
        this.logger = new LJA();
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.messagereceivedlogging.Postmailbox
    public void IGMessageReceivedLoggingImpl_MEMMessageReceivedLoggingMarkerPoint(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.logger.A03(str, str2);
    }
}
