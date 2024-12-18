package com.instagram.direct.realtime.armadilloexpress.plugins.backupupdategenerator;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.wamsys.wce.MessageBackupDirective;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class Postmailbox {
    public UserSession mAppContext;
    public AccountSession mPluginContext;

    private MessageBackupDirective IGBackupUpdateGeneratorPluginImpl_MEMBackupUpdateGeneratorCreateMessageBackupDirectiveJNI(PrivacyContext privacyContext, long j, String str, long j2, int i, Number number, Object obj, byte[] bArr) {
        if (number == null) {
            number = null;
        }
        return IGBackupUpdateGeneratorPluginImpl_MEMBackupUpdateGeneratorCreateMessageBackupDirective(privacyContext, j, str, j2, i, number, obj, bArr);
    }

    public void IGBackupUpdateGeneratorPluginImplExtensionsDestroy() {
        this.mPluginContext = null;
    }

    public abstract MessageBackupDirective IGBackupUpdateGeneratorPluginImpl_MEMBackupUpdateGeneratorCreateMessageBackupDirective(PrivacyContext privacyContext, long j, String str, long j2, int i, Number number, Object obj, byte[] bArr);

    public Postmailbox(AccountSession accountSession, UserSession userSession) {
        this.mPluginContext = accountSession;
        this.mAppContext = userSession;
    }
}
