package com.instagram.direct.realtime.armadilloexpress.plugins.payloadcodecprovider;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
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
import com.mcrypto.MessengerCoreCryptoMCFBridgejniDispatcher;
import com.mcrypto.MessengerEncryptedMessagingCQLModelsMCFBridgejniDispatcher;
import com.mcrypto.MessengerEncryptedMessagingMCFBridgejniDispatcher;

/* loaded from: classes12.dex */
public final class IGPayloadCodecProviderImplPostmailbox extends Postmailbox {
    public final UserSession userSession;

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.payloadcodecprovider.Postmailbox
    public boolean IGPayloadCodecProviderImpl_MEMPayloadCodecProviderHandleDecryptedPayload(AccountContext accountContext, AbstractC72314XbC abstractC72314XbC, AbstractC72316XbE abstractC72316XbE, AbstractC72315XbD abstractC72315XbD, Object obj, byte[] bArr, boolean z, AbstractC72317XbF abstractC72317XbF, ValueHolder valueHolder, ValueHolder valueHolder2, long j) {
        int i;
        C14360o3.A0B(accountContext, 0);
        AbstractC167027dH.A0a(1, abstractC72314XbC, abstractC72316XbE, abstractC72315XbD, obj);
        AbstractC167007dF.A1H(bArr, 5, abstractC72317XbF);
        C14360o3.A0B(valueHolder2, 9);
        NativeHolder MEMDecryptedPayloadContextGetThreadIDNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetThreadIDNative(abstractC72315XbD.mNativeHolder);
        if (MEMDecryptedPayloadContextGetThreadIDNative == null) {
            throw AbstractC166997dE.A0g();
        }
        long MEMThreadIDGetTransportIDNative = MessengerEncryptedMessagingCQLModelsMCFBridgejniDispatcher.MEMThreadIDGetTransportIDNative(MEMDecryptedPayloadContextGetThreadIDNative);
        long MCCDeviceJIDGetUserIDInt64ValueNative = MessengerCoreCryptoMCFBridgejniDispatcher.MCCDeviceJIDGetUserIDInt64ValueNative(MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetSenderJIDNative(abstractC72315XbD.mNativeHolder));
        int MEMDecryptedPayloadContextGetThreadTypeNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetThreadTypeNative(abstractC72315XbD.mNativeHolder);
        long MEMDecryptedPayloadContextGetTimestampInSecNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetTimestampInSecNative(abstractC72315XbD.mNativeHolder);
        String MEMDecryptedPayloadContextGetMessageIdNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetMessageIdNative(abstractC72315XbD.mNativeHolder);
        C14360o3.A07(MEMDecryptedPayloadContextGetMessageIdNative);
        String MEMDecryptedPayloadContextGetMessageTraceIdNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetMessageTraceIdNative(abstractC72315XbD.mNativeHolder);
        Number MEMDecryptedPayloadContextGetPayloadVersionNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetPayloadVersionNative(abstractC72315XbD.mNativeHolder);
        if (MEMDecryptedPayloadContextGetPayloadVersionNative != null) {
            i = MEMDecryptedPayloadContextGetPayloadVersionNative.intValue();
        } else {
            i = 2;
        }
        int MEMDecryptedPayloadContextGetThreadModeNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetThreadModeNative(abstractC72315XbD.mNativeHolder);
        int MEMDecryptedPayloadContextGetThreadTypeTagNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetThreadTypeTagNative(abstractC72315XbD.mNativeHolder);
        long MEMDecryptedPayloadContextGetOfflineQueueMessageIndexNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetOfflineQueueMessageIndexNative(abstractC72315XbD.mNativeHolder);
        if (j != 0) {
            UserSession userSession = this.userSession;
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36318861938072271L)) {
                AbstractC46904Kol.A00(this.userSession).A01(j);
                return true;
            }
        }
        return LJg.A01(this.userSession, MEMDecryptedPayloadContextGetMessageIdNative, MEMDecryptedPayloadContextGetMessageTraceIdNative, bArr, MEMDecryptedPayloadContextGetThreadModeNative, MEMDecryptedPayloadContextGetThreadTypeNative, MEMDecryptedPayloadContextGetThreadTypeTagNative, i, j, MEMThreadIDGetTransportIDNative, MCCDeviceJIDGetUserIDInt64ValueNative, MEMDecryptedPayloadContextGetTimestampInSecNative, MEMDecryptedPayloadContextGetOfflineQueueMessageIndexNative);
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.payloadcodecprovider.Postmailbox
    public byte[] IGPayloadCodecProviderImpl_MEMPayloadCodecProviderSerializedMsgApplicationCreateFromGroupInviteMessage(AccountContext accountContext, String str, String str2, Number number, String str3) {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IGPayloadCodecProviderImplPostmailbox(AccountSession accountSession, UserSession userSession) {
        super(accountSession, userSession);
        AbstractC167017dG.A1P(accountSession, userSession);
        this.userSession = userSession;
    }
}
