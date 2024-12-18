package com.instagram.direct.rtc.chatd;

import X.AbstractC001800i;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25229BEm;
import X.AbstractC27671Vv;
import X.AbstractC54155Nwr;
import X.C06090Tz;
import X.C0K8;
import X.C14360o3;
import X.C16930sl;
import X.C18U;
import X.C27661Vu;
import X.C3ER;
import X.C55144Od3;
import X.InterfaceC58275PsT;
import X.OX7;
import android.content.Context;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.AccountSession;
import com.facebook.rsys.chatdtransportsender.gen.ChatDPublishDataContainer;
import com.facebook.rsys.transport.gen.SendMessageStats;
import com.facebook.rsys.transport.gen.SignalingTransportCallback;
import com.facebook.rsys.transport.gen.SignalingTransportCallbackExt;
import com.facebook.rtc.chatd.utils.JavaCppHelper;
import com.facebook.wamsys.wcc.TransferStats;
import com.facebook.wamsys.wcc.XMPPStats;
import com.facebook.wamsys.wcp.MultiwayNotificationResult;
import com.facebook.wamsys.wcp.MultiwaySendResult;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class IGDAndroidMsysMultiwaydPluginPostmailbox extends Postmailbox {
    public final JavaCppHelper javaCppHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IGDAndroidMsysMultiwaydPluginPostmailbox(AccountSession accountSession, UserSession userSession, JavaCppHelper javaCppHelper) {
        super(accountSession, userSession);
        C14360o3.A0B(javaCppHelper, 3);
        this.javaCppHelper = javaCppHelper;
    }

    @Override // com.instagram.direct.rtc.chatd.Postmailbox
    public boolean IGDAndroidMsysMultiwaydPluginPostmailboxImpl_MEMHandleInMultiwaySessionedNotification(MultiwayNotificationResult multiwayNotificationResult) {
        int i;
        int intValue;
        XMPPStats xmppStats;
        C14360o3.A0B(multiwayNotificationResult, 0);
        byte[] data = multiwayNotificationResult.getData();
        TransferStats incomingStats = multiwayNotificationResult.getIncomingStats();
        if (incomingStats != null && (xmppStats = incomingStats.getXmppStats()) != null) {
            i = xmppStats.getEncryptedBytes();
        } else {
            i = 0;
        }
        if (data != null) {
            AbstractC27671Vv A00 = C3ER.A00();
            UserSession userSession = this.mAppContext;
            C14360o3.A06(userSession);
            C27661Vu c27661Vu = (C27661Vu) A00;
            if (C18U.A06(C06090Tz.A05, userSession, 36317470361261248L)) {
                c27661Vu.A05.A0F(userSession, data, 21, i);
                return true;
            }
            Context context = c27661Vu.A00;
            C55144Od3 c55144Od3 = new C55144Od3(new OX7(context).A03(data), null);
            Integer A03 = c55144Od3.A03();
            if (A03 != null && A03.intValue() == 5) {
                c27661Vu.A00(context, userSession).A08(c55144Od3);
            }
            Integer A032 = c55144Od3.A03();
            if (A032 != null && ((intValue = A032.intValue()) == 5 || intValue == 4)) {
                InterfaceC58275PsT Eng = AbstractC54155Nwr.A00(userSession).A01.Eng();
                Eng.CnT("notification_source", "CHATD");
                c27661Vu.A05.A0E(Eng, userSession, c55144Od3, 21);
            }
            c27661Vu.A00(context, userSession).A0B(data, 21, i, false);
            return true;
        }
        return true;
    }

    @Override // com.instagram.direct.rtc.chatd.Postmailbox
    public void IGDAndroidMsysMultiwaydPluginPostmailboxImpl_MEMMultiwayMessageSessionedHandler(MultiwaySendResult multiwaySendResult, Object obj) {
        long j;
        int i;
        XMPPStats xmppStats;
        C14360o3.A0B(multiwaySendResult, 0);
        MsysError error = multiwaySendResult.getError();
        TransferStats outgoingStats = multiwaySendResult.getOutgoingStats();
        if (outgoingStats != null && (xmppStats = outgoingStats.getXmppStats()) != null) {
            j = xmppStats.getEncryptedBytes();
        } else {
            j = 0;
        }
        if (obj != null) {
            List convertUserData = convertUserData(obj);
            if (AbstractC166987dD.A1b(convertUserData)) {
                boolean z = false;
                Object obj2 = convertUserData.get(0);
                C14360o3.A0C(obj2, "null cannot be cast to non-null type com.facebook.rsys.chatdtransportsender.gen.ChatDPublishDataContainer");
                ChatDPublishDataContainer chatDPublishDataContainer = (ChatDPublishDataContainer) obj2;
                SignalingTransportCallbackExt signalingTransportCallbackExt = chatDPublishDataContainer.extCallbacks;
                if (signalingTransportCallbackExt != null) {
                    if (error != null) {
                        i = error.getCode();
                    } else {
                        i = 0;
                    }
                    if (error == null) {
                        z = true;
                    }
                    signalingTransportCallbackExt.sendCompleteCallbackExt(new SendMessageStats((short) 1, j, 0L, 0L, z, i, null, 21));
                }
                SignalingTransportCallback signalingTransportCallback = chatDPublishDataContainer.callbacks;
                if (signalingTransportCallback != null) {
                    if (error == null) {
                        signalingTransportCallback.sendSuccessCallback();
                        return;
                    } else {
                        signalingTransportCallback.sendFailureCallback();
                        return;
                    }
                }
                return;
            }
            C0K8.A0C("IGDAndroidMsysMultiwaydPlugin", "MEMMultiwayMessageSessionedHandler: Failed to parse userdata");
        }
    }

    private final List convertUserData(Object obj) {
        if (obj instanceof McfReference) {
            ArrayList convertPackedParamsToArrayList = this.javaCppHelper.convertPackedParamsToArrayList((McfReference) obj);
            C14360o3.A0A(convertPackedParamsToArrayList);
            return convertPackedParamsToArrayList;
        }
        if (obj instanceof ArrayList) {
            return AbstractC001800i.A0a((Iterable) obj);
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Could not convert user data of type: ");
        C0K8.A0C("IGDAndroidMsysMultiwaydPlugin", AbstractC166997dE.A0v(AbstractC25229BEm.A0r(obj), A1C));
        return C16930sl.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.rtc.chatd.utils.JavaCppHelper] */
    public IGDAndroidMsysMultiwaydPluginPostmailbox(AccountSession accountSession, UserSession userSession) {
        this(accountSession, userSession, new Object());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ IGDAndroidMsysMultiwaydPluginPostmailbox(AccountSession accountSession, UserSession userSession, JavaCppHelper javaCppHelper, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(accountSession, userSession, (i & 4) != 0 ? new Object() : javaCppHelper);
    }
}
