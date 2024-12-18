package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.Dwo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31735Dwo extends BroadcastReceiver {
    public final AbstractC12990ll A00;
    public final GY5 A01;
    public final String A02;
    public final Map A03;

    public C31735Dwo(AbstractC12990ll abstractC12990ll, GY5 gy5, String str) {
        this.A03 = new C20030yX();
        this.A00 = abstractC12990ll;
        this.A02 = str;
        this.A01 = gy5;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        String displayOriginatingAddress;
        int A01 = C0f9.A01(-804451650);
        C0fM.A01(this, context, intent);
        AbstractC167017dG.A1N(context, intent);
        if (!"android.provider.Telephony.SMS_RECEIVED".equals(intent.getAction())) {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Registered to wrong action - expected action: %s, received action: %s", "android.provider.Telephony.SMS_RECEIVED", intent.getAction());
            C14360o3.A07(formatStrLocaleSafe);
            C0w9.A03("SmsReceivedBroadcastReceiver", formatStrLocaleSafe);
            i = 1087811695;
        } else {
            SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
            if (messagesFromIntent != null) {
                boolean z = false;
                for (SmsMessage smsMessage : messagesFromIntent) {
                    String messageBody = smsMessage.getMessageBody();
                    if (messageBody == null) {
                        break;
                    }
                    Pattern pattern = C35118FeL.A03;
                    C14360o3.A08(pattern);
                    String A00 = C35118FeL.A00(messageBody, pattern);
                    if (A00 == null) {
                        Pattern pattern2 = C35118FeL.A01;
                        C14360o3.A08(pattern2);
                        String A002 = C35118FeL.A00(messageBody, pattern2);
                        if (A002 != null) {
                            String displayOriginatingAddress2 = smsMessage.getDisplayOriginatingAddress();
                            if (displayOriginatingAddress2 != null) {
                                Map map = this.A03;
                                if ("#ig".equals(map.get(displayOriginatingAddress2))) {
                                    this.A01.Dhw(context, A002, this.A02);
                                    z = true;
                                    break;
                                }
                                map.put(displayOriginatingAddress2, A002);
                            } else {
                                continue;
                            }
                        } else if (messageBody.length() != 0 && ((messageBody.equals("#ig") || AbstractC002300n.A0f(messageBody, " #ig", false) || AbstractC002300n.A0f(messageBody, "。#ig", false)) && (displayOriginatingAddress = smsMessage.getDisplayOriginatingAddress()) != null)) {
                            Map map2 = this.A03;
                            A00 = AbstractC166987dD.A1A(displayOriginatingAddress, map2);
                            if (A00 == null) {
                                map2.put(displayOriginatingAddress, "#ig");
                            }
                        }
                    }
                    this.A01.Dhw(context, A00, this.A02);
                    z = true;
                    break;
                }
                C35037FcA A06 = C1Q9.A0F.A02(this.A00).A06(EnumC33445EqI.A06, null);
                A06.A05("code_found", z);
                A06.A04("locale", C1Q2.A02().toString());
                A06.A02();
            }
            i = 296864560;
        }
        C0f9.A0E(i, A01, intent);
    }

    public C31735Dwo() {
    }
}
