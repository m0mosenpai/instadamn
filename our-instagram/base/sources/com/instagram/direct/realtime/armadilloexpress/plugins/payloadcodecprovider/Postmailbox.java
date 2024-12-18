package com.instagram.direct.realtime.armadilloexpress.plugins.payloadcodecprovider;

import X.AbstractC166997dE;
import X.AbstractC25233BEq;
import X.AbstractC46904Kol;
import X.AbstractC72314XbC;
import X.AbstractC72315XbD;
import X.AbstractC72316XbE;
import X.AbstractC72317XbF;
import X.C06090Tz;
import X.C14360o3;
import X.C18U;
import X.LJg;
import com.facebook.mcrypto.mcc.AccountContext;
import com.facebook.msys.mci.AccountSession;
import com.facebook.simplejni.NativeHolder;
import com.facebook.valueholder.ValueHolder;
import com.instagram.common.session.UserSession;
import com.mcftypeholder.McfTypeHolder;
import com.mcrypto.MessengerCoreCryptoMCFBridgejniDispatcher;
import com.mcrypto.MessengerEncryptedMessagingCQLModelsMCFBridgejniDispatcher;
import com.mcrypto.MessengerEncryptedMessagingMCFBridgejniDispatcher;

/* loaded from: classes12.dex */
public abstract class Postmailbox {
    public UserSession mAppContext;
    public AccountSession mPluginContext;

    public void IGPayloadCodecProviderImplExtensionsDestroy() {
        this.mPluginContext = null;
    }

    public abstract boolean IGPayloadCodecProviderImpl_MEMPayloadCodecProviderHandleDecryptedPayload(AccountContext accountContext, AbstractC72314XbC abstractC72314XbC, AbstractC72316XbE abstractC72316XbE, AbstractC72315XbD abstractC72315XbD, Object obj, byte[] bArr, boolean z, AbstractC72317XbF abstractC72317XbF, ValueHolder valueHolder, ValueHolder valueHolder2, long j);

    public abstract byte[] IGPayloadCodecProviderImpl_MEMPayloadCodecProviderSerializedMsgApplicationCreateFromGroupInviteMessage(AccountContext accountContext, String str, String str2, Number number, String str3);

    private boolean IGPayloadCodecProviderImpl_MEMPayloadCodecProviderHandleDecryptedPayloadJNI(AccountContext accountContext, NativeHolder nativeHolder, NativeHolder nativeHolder2, NativeHolder nativeHolder3, Object obj, byte[] bArr, boolean z, NativeHolder nativeHolder4, ValueHolder valueHolder, ValueHolder valueHolder2, long j) {
        int i;
        McfTypeHolder mcfTypeHolder = McfTypeHolder.$redex_init_class;
        IGPayloadCodecProviderImplPostmailbox iGPayloadCodecProviderImplPostmailbox = (IGPayloadCodecProviderImplPostmailbox) this;
        AbstractC25233BEq.A0x(0, accountContext, obj, bArr);
        C14360o3.A0B(valueHolder2, 9);
        NativeHolder MEMDecryptedPayloadContextGetThreadIDNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetThreadIDNative(nativeHolder3);
        if (MEMDecryptedPayloadContextGetThreadIDNative == null) {
            throw AbstractC166997dE.A0g();
        }
        long MEMThreadIDGetTransportIDNative = MessengerEncryptedMessagingCQLModelsMCFBridgejniDispatcher.MEMThreadIDGetTransportIDNative(MEMDecryptedPayloadContextGetThreadIDNative);
        long MCCDeviceJIDGetUserIDInt64ValueNative = MessengerCoreCryptoMCFBridgejniDispatcher.MCCDeviceJIDGetUserIDInt64ValueNative(MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetSenderJIDNative(nativeHolder3));
        int MEMDecryptedPayloadContextGetThreadTypeNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetThreadTypeNative(nativeHolder3);
        long MEMDecryptedPayloadContextGetTimestampInSecNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetTimestampInSecNative(nativeHolder3);
        String MEMDecryptedPayloadContextGetMessageIdNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetMessageIdNative(nativeHolder3);
        C14360o3.A07(MEMDecryptedPayloadContextGetMessageIdNative);
        String MEMDecryptedPayloadContextGetMessageTraceIdNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetMessageTraceIdNative(nativeHolder3);
        Number MEMDecryptedPayloadContextGetPayloadVersionNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetPayloadVersionNative(nativeHolder3);
        if (MEMDecryptedPayloadContextGetPayloadVersionNative != null) {
            i = MEMDecryptedPayloadContextGetPayloadVersionNative.intValue();
        } else {
            i = 2;
        }
        int MEMDecryptedPayloadContextGetThreadModeNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetThreadModeNative(nativeHolder3);
        int MEMDecryptedPayloadContextGetThreadTypeTagNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetThreadTypeTagNative(nativeHolder3);
        long MEMDecryptedPayloadContextGetOfflineQueueMessageIndexNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetOfflineQueueMessageIndexNative(nativeHolder3);
        if (j != 0) {
            UserSession userSession = iGPayloadCodecProviderImplPostmailbox.userSession;
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36318861938072271L)) {
                AbstractC46904Kol.A00(iGPayloadCodecProviderImplPostmailbox.userSession).A01(j);
                return true;
            }
        }
        LJg.A01(iGPayloadCodecProviderImplPostmailbox.userSession, MEMDecryptedPayloadContextGetMessageIdNative, MEMDecryptedPayloadContextGetMessageTraceIdNative, bArr, MEMDecryptedPayloadContextGetThreadModeNative, MEMDecryptedPayloadContextGetThreadTypeNative, MEMDecryptedPayloadContextGetThreadTypeTagNative, i, j, MEMThreadIDGetTransportIDNative, MCCDeviceJIDGetUserIDInt64ValueNative, MEMDecryptedPayloadContextGetTimestampInSecNative, MEMDecryptedPayloadContextGetOfflineQueueMessageIndexNative);
        return true;
    }

    public Postmailbox(AccountSession accountSession, UserSession userSession) {
        this.mPluginContext = accountSession;
        this.mAppContext = userSession;
    }

    private byte[] IGPayloadCodecProviderImpl_MEMPayloadCodecProviderSerializedMsgApplicationCreateFromGroupInviteMessageJNI(AccountContext accountContext, String str, String str2, Number number, String str3) {
        return null;
    }
}
