package com.instagram.direct.realtime.armadilloexpress.plugins.adapter;

import X.AbstractC111324zv;
import X.AbstractC120975dp;
import X.AbstractC166987dD;
import X.AbstractC47885LDf;
import X.C14360o3;
import X.LJg;
import com.facebook.mcrypto.mem.OutgoingMessage;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class Premailbox {
    public UserSession mAppContext;

    private Number ArmadilloExpressMCPPluginAndroidAdapter_HandleCreateAppDataThreadIDForPersistenceStoreJNI(byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        Long A00 = LJg.A00(bArr);
        if (A00 == null) {
            return null;
        }
        return A00;
    }

    private boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleParticipantDeviceChangeJNI(long j, String str, int i, long j2, String str2, boolean z, boolean z2) {
        if (str == null) {
            str = null;
        }
        if (str2 == null) {
            str2 = null;
        }
        return ArmadilloExpressMCPPluginAndroidAdapter_HandleParticipantDeviceChange(j, str, i, j2, str2, z, z2);
    }

    private boolean ArmadilloExpressMCPPluginAndroidAdapter_ShouldMovePeerDeviceAdminMessageToSettingJNI() {
        return AbstractC120975dp.A00(((InstagramAdapterPluginPremailbox) this).userSession);
    }

    public abstract boolean ArmadilloExpressMCPPluginAndroidAdapter_CheckMessageExists(long j, String str);

    public abstract void ArmadilloExpressMCPPluginAndroidAdapter_ExecuteTask(String str);

    public abstract Number ArmadilloExpressMCPPluginAndroidAdapter_HandleCreateAppDataThreadIDForPersistenceStore(byte[] bArr);

    public abstract boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleIncomingPayload(long j, int i, int i2, long j2, long j3, String str, String str2, byte[] bArr, int i3, long j4);

    public abstract boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleInsertPlaceholder(long j, int i, int i2, int i3, long j2, long j3, String str, int i4, long j4);

    public abstract OutgoingMessage ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageCreateRetryMessageBinaryContent(long j, int i, String str);

    public abstract int ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageGetThreadMode(long j, String str);

    public abstract boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageMarkMessageDelivered(String str, long j);

    public abstract boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageUpdateMessageStatus(long j, String str, int i, long j2, long j3, long j4);

    public abstract boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleParticipantDeviceChange(long j, String str, int i, long j2, String str2, boolean z, boolean z2);

    public abstract boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleParticipantICDCEvent(int i, long j, long j2);

    public abstract boolean ArmadilloExpressMCPPluginAndroidAdapter_HandlePeerDeviceChangeEvent(int i, int i2, int i3, Number number, String str, String str2, String str3, Number number2, Number number3, boolean z);

    public abstract boolean ArmadilloExpressMCPPluginAndroidAdapter_ShouldMovePeerDeviceAdminMessageToSetting();

    public abstract boolean ArmadilloExpressMCPPluginAndroidAdapter_ShouldPersistContactDeviceChangeAlert();

    public abstract boolean ArmadilloExpressMCPPluginAndroidAdapter_ShouldPersistPeerDeviceChangeAlert();

    public abstract void InstagramAdapterPluginPremailboxExtensionsDestroy();

    private boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleIncomingPayloadJNI(long j, int i, int i2, long j2, long j3, String str, String str2, byte[] bArr, int i3, long j4) {
        throw AbstractC166987dD.A18(AbstractC111324zv.A00(87));
    }

    private boolean ArmadilloExpressMCPPluginAndroidAdapter_HandlePeerDeviceChangeEventJNI(int i, int i2, int i3, Number number, String str, String str2, String str3, Number number2, Number number3, boolean z) {
        Number number4 = number3;
        Number number5 = number2;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        Number number6 = number;
        if (number == null) {
            number6 = null;
        }
        if (str == null) {
            str6 = null;
        }
        if (str2 == null) {
            str5 = null;
        }
        if (str3 == null) {
            str4 = null;
        }
        if (number2 == null) {
            number5 = null;
        }
        if (number3 == null) {
            number4 = null;
        }
        return AbstractC47885LDf.A01(((InstagramAdapterPluginPremailbox) this).userSession, number6, number5, number4, str6, str5, str4, i, i2, i3);
    }

    public Premailbox(UserSession userSession) {
        this.mAppContext = userSession;
    }

    private boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleInsertPlaceholderJNI(long j, int i, int i2, int i3, long j2, long j3, String str, int i4, long j4) {
        return ArmadilloExpressMCPPluginAndroidAdapter_HandleInsertPlaceholder(j, i, i2, i3, j2, j3, str, i4, j4);
    }

    private OutgoingMessage ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageCreateRetryMessageBinaryContentJNI(long j, int i, String str) {
        OutgoingMessage ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageCreateRetryMessageBinaryContent = ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageCreateRetryMessageBinaryContent(j, i, str);
        if (ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageCreateRetryMessageBinaryContent == null) {
            return null;
        }
        return ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageCreateRetryMessageBinaryContent;
    }

    private boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageMarkMessageDeliveredJNI(String str, long j) {
        return ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageMarkMessageDelivered(str, j);
    }

    private boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageUpdateMessageStatusJNI(long j, String str, int i, long j2, long j3, long j4) {
        return ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageUpdateMessageStatus(j, str, i, j2, j3, j4);
    }

    private boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleParticipantICDCEventJNI(int i, long j, long j2) {
        return ArmadilloExpressMCPPluginAndroidAdapter_HandleParticipantICDCEvent(i, j, j2);
    }

    private boolean ArmadilloExpressMCPPluginAndroidAdapter_ShouldPersistContactDeviceChangeAlertJNI() {
        return ArmadilloExpressMCPPluginAndroidAdapter_ShouldPersistContactDeviceChangeAlert();
    }

    private boolean ArmadilloExpressMCPPluginAndroidAdapter_ShouldPersistPeerDeviceChangeAlertJNI() {
        return ArmadilloExpressMCPPluginAndroidAdapter_ShouldPersistPeerDeviceChangeAlert();
    }

    private void ArmadilloExpressMCPPluginAndroidAdapter_ExecuteTaskJNI(String str) {
        ArmadilloExpressMCPPluginAndroidAdapter_ExecuteTask(str);
    }

    private boolean ArmadilloExpressMCPPluginAndroidAdapter_CheckMessageExistsJNI(long j, String str) {
        return false;
    }

    private int ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageGetThreadModeJNI(long j, String str) {
        return 5;
    }
}
