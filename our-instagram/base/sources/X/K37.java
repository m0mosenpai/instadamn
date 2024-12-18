package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.messenger.notification.engine.MSGNotificationEngineInstagramSyncPathIntegrator;
import com.facebook.messenger.notification.engine.MSGNotificationEngineUnreadMessage;
import com.facebook.messenger.notification.engine.MSGOpenPathRenderedNotification;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class K37 extends MSGNotificationEngineInstagramSyncPathIntegrator.MSGNotificationEngineOpenPathIntegratorCallback {
    public final UserSession A00;
    public final C1WZ A01;

    public K37(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = C3J1.A00();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, X.LFc] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, X.LFc] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.0oO, java.lang.Object] */
    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineInstagramSyncPathIntegrator.MSGNotificationEngineOpenPathIntegratorCallback
    public final void onNotification(MSGOpenPathRenderedNotification mSGOpenPathRenderedNotification) {
        String str;
        ArrayList arrayList;
        EnumC117355Su enumC117355Su;
        C116155Nu A00;
        EnumC117355Su enumC117355Su2;
        C14360o3.A0B(mSGOpenPathRenderedNotification, 0);
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 1);
        String threadId = mSGOpenPathRenderedNotification.getThreadId();
        String messageId = mSGOpenPathRenderedNotification.getMessageId();
        String notificationId = mSGOpenPathRenderedNotification.getNotificationId();
        SimpleImageUrl simpleImageUrl = null;
        if (threadId != null && messageId != null && notificationId != null) {
            L8n l8n = new L8n(userSession);
            C47932LFc c47932LFc = C47932LFc.A00;
            C47932LFc c47932LFc2 = c47932LFc;
            if (c47932LFc == null) {
                ?? obj = new Object();
                C47932LFc.A00 = obj;
                c47932LFc2 = obj;
            }
            if (mSGOpenPathRenderedNotification.getIsUnsent()) {
                long A002 = LFY.A00.A00(EnumC117355Su.A08, messageId, threadId);
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("direct_v2?%s=%s&%s=%s", "did", threadId, "x", messageId);
                C14360o3.A07(formatStrLocaleSafe);
                A00 = l8n.A01(notificationId, messageId, formatStrLocaleSafe);
                A00.A1S = c47932LFc2.A00(notificationId);
                A00.A0K = Long.valueOf(A002);
            } else {
                String engineMessage = mSGOpenPathRenderedNotification.getEngineMessage();
                Long notifType = mSGOpenPathRenderedNotification.getNotifType();
                String senderPK = mSGOpenPathRenderedNotification.getSenderPK();
                if (engineMessage != null && notifType != null && senderPK != null) {
                    String formatStrLocaleSafe2 = StringFormatUtil.formatStrLocaleSafe("direct_v2?%s=%s&%s=%s", PublicKeyCredentialControllerUtility.JSON_KEY_ID, threadId, "x", messageId);
                    C14360o3.A07(formatStrLocaleSafe2);
                    long longValue = notifType.longValue();
                    String formatStrLocaleSafe3 = StringFormatUtil.formatStrLocaleSafe("%s_%s_%s_%s", threadId, messageId, String.valueOf(longValue), senderPK);
                    C14360o3.A07(formatStrLocaleSafe3);
                    ArrayList unreadMessages = mSGOpenPathRenderedNotification.getUnreadMessages();
                    if (unreadMessages != null) {
                        arrayList = AbstractC167017dG.A0q(unreadMessages);
                        Iterator it = unreadMessages.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((MSGNotificationEngineUnreadMessage) it.next()).getText());
                        }
                    } else {
                        arrayList = null;
                    }
                    int i = (int) longValue;
                    EnumC117355Su[] values = EnumC117355Su.values();
                    int length = values.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            enumC117355Su = values[i2];
                            if (enumC117355Su.A00 == i) {
                                break;
                            } else {
                                i2++;
                            }
                        } else {
                            enumC117355Su = null;
                            break;
                        }
                    }
                    String A003 = AbstractC47081Krc.A00(enumC117355Su);
                    String title = mSGOpenPathRenderedNotification.getTitle();
                    String str2 = userSession.userId;
                    String senderAvatarUrl = mSGOpenPathRenderedNotification.getSenderAvatarUrl();
                    if (senderAvatarUrl != null) {
                        simpleImageUrl = AbstractC25225BEi.A0t(senderAvatarUrl);
                    }
                    String sound = mSGOpenPathRenderedNotification.getSound();
                    if (sound == null) {
                        sound = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                    }
                    mSGOpenPathRenderedNotification.getUnreadMessagesSummary();
                    A00 = l8n.A00(simpleImageUrl, title, engineMessage, "direct_v2_message", A003, str2, formatStrLocaleSafe2, sound, formatStrLocaleSafe3, messageId, senderPK, null, arrayList, true);
                    LFY lfy = LFY.A00;
                    EnumC117355Su[] values2 = EnumC117355Su.values();
                    int length2 = values2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            enumC117355Su2 = values2[i3];
                            if (enumC117355Su2.A00 == i) {
                                break;
                            } else {
                                i3++;
                            }
                        } else {
                            enumC117355Su2 = EnumC117355Su.A07;
                            break;
                        }
                    }
                    A00.A0K = Long.valueOf(lfy.A00(enumC117355Su2, messageId, threadId));
                    A00.A0c = mSGOpenPathRenderedNotification.getExperimentMask();
                    A00.A0b = mSGOpenPathRenderedNotification.getThreadName();
                    A00.A1U = mSGOpenPathRenderedNotification.getIsVanishModeEnabled();
                    A00.A1F = mSGOpenPathRenderedNotification.getThreadId();
                    A00.A1S = c47932LFc2.A00(notificationId);
                    if (C18U.A06(C06090Tz.A06, userSession, 36314841841535849L)) {
                        A00.A1M = mSGOpenPathRenderedNotification.getIsSilentPush();
                    }
                } else {
                    str = "renderedEngineMessage or notifType or senderPK is null but should not be";
                }
            }
            this.A01.A08(A00, PushChannelType.A0F, null);
            return;
        }
        str = "threadKey or messageId or notificationId is null from the engine but should not be";
        C0K8.A0E("NotificationEngineIntegratorConverter.convertOpenNotificationToIgNotification", str);
        C60K.A00(userSession).A00(notificationId, messageId, null, null, str, 7);
        ?? obj2 = new Object();
        C47932LFc c47932LFc3 = C47932LFc.A00;
        C47932LFc c47932LFc4 = c47932LFc3;
        if (c47932LFc3 == null) {
            ?? obj3 = new Object();
            C47932LFc.A00 = obj3;
            c47932LFc4 = obj3;
        }
        String notificationId2 = mSGOpenPathRenderedNotification.getNotificationId();
        boolean z = true;
        if (notificationId2 == null || !c47932LFc4.A00(notificationId2)) {
            z = false;
        }
        obj2.A00 = z;
        if (!z) {
            return;
        }
        C60H.A02.A00(userSession, mSGOpenPathRenderedNotification.getIntendedRecipientUserId(), new C30487DbW(21, obj2, this, mSGOpenPathRenderedNotification));
    }
}
