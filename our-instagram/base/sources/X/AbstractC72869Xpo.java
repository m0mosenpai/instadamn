package X;

import android.app.Notification;
import android.app.Person;
import android.os.Bundle;
import androidx.core.app.NotificationCompat$BigPictureStyle;
import androidx.core.app.NotificationCompat$BigTextStyle;
import androidx.core.app.NotificationCompat$DecoratedCustomViewStyle;
import androidx.core.app.NotificationCompat$InboxStyle;
import androidx.core.app.NotificationCompat$MessagingStyle;
import java.util.Iterator;

/* renamed from: X.Xpo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72869Xpo {
    public XN9 A00;
    public CharSequence A01;
    public CharSequence A02;
    public boolean A03 = false;

    public void A01(Bundle bundle) {
        bundle.remove("android.summaryText");
        bundle.remove("android.title.big");
        bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
    }

    public final void A02(XN9 xn9) {
        if (this.A00 != xn9) {
            this.A00 = xn9;
            xn9.A0A(this);
        }
    }

    public void A03(Bundle bundle) {
        String str;
        if (this.A03) {
            bundle.putCharSequence("android.summaryText", this.A02);
        }
        CharSequence charSequence = this.A01;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        if (this instanceof NotificationCompat$MessagingStyle) {
            str = "androidx.core.app.NotificationCompat$MessagingStyle";
        } else if (this instanceof NotificationCompat$BigTextStyle) {
            str = "androidx.core.app.NotificationCompat$BigTextStyle";
        } else if (this instanceof NotificationCompat$InboxStyle) {
            str = "androidx.core.app.NotificationCompat$InboxStyle";
        } else if (this instanceof NotificationCompat$BigPictureStyle) {
            str = "androidx.core.app.NotificationCompat$BigPictureStyle";
        } else if (this instanceof NotificationCompat$DecoratedCustomViewStyle) {
            str = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        } else {
            str = "androidx.core.app.NotificationCompat$CallStyle";
        }
        bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", str);
    }

    public void A04(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.A02 = bundle.getCharSequence("android.summaryText");
            this.A03 = true;
        }
        this.A01 = bundle.getCharSequence("android.title.big");
    }

    public void A05(YM2 ym2) {
        if (this instanceof NotificationCompat$MessagingStyle) {
            NotificationCompat$MessagingStyle notificationCompat$MessagingStyle = (NotificationCompat$MessagingStyle) this;
            XN9 xn9 = ((AbstractC72869Xpo) notificationCompat$MessagingStyle).A00;
            boolean z = false;
            if (xn9 != null && xn9.A0E.getApplicationInfo().targetSdkVersion < 28 && notificationCompat$MessagingStyle.A01 == null) {
                if (notificationCompat$MessagingStyle.A02 != null) {
                    z = true;
                }
            } else {
                Boolean bool = notificationCompat$MessagingStyle.A01;
                if (bool != null) {
                    z = bool.booleanValue();
                }
            }
            notificationCompat$MessagingStyle.A01 = Boolean.valueOf(z);
            Notification.MessagingStyle messagingStyle = new Notification.MessagingStyle(AbstractC72875Xq9.A00(notificationCompat$MessagingStyle.A00));
            for (Y3W y3w : notificationCompat$MessagingStyle.A04) {
                Y3n y3n = y3w.A04;
                Person person = null;
                CharSequence charSequence = y3w.A05;
                long j = y3w.A03;
                if (y3n != null) {
                    person = AbstractC72875Xq9.A00(y3n);
                }
                Notification.MessagingStyle.Message message = new Notification.MessagingStyle.Message(charSequence, j, person);
                String str = y3w.A02;
                if (str != null) {
                    message.setData(str, y3w.A00);
                }
                messagingStyle.addMessage(message);
            }
            for (Y3W y3w2 : notificationCompat$MessagingStyle.A03) {
                Y3n y3n2 = y3w2.A04;
                Person person2 = null;
                CharSequence charSequence2 = y3w2.A05;
                long j2 = y3w2.A03;
                if (y3n2 != null) {
                    person2 = AbstractC72875Xq9.A00(y3n2);
                }
                Notification.MessagingStyle.Message message2 = new Notification.MessagingStyle.Message(charSequence2, j2, person2);
                String str2 = y3w2.A02;
                if (str2 != null) {
                    message2.setData(str2, y3w2.A00);
                }
                messagingStyle.addHistoricMessage(message2);
            }
            messagingStyle.setConversationTitle(notificationCompat$MessagingStyle.A02);
            messagingStyle.setGroupConversation(notificationCompat$MessagingStyle.A01.booleanValue());
            messagingStyle.setBuilder(((XNA) ym2).A04);
            return;
        }
        if (this instanceof NotificationCompat$BigTextStyle) {
            NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = (NotificationCompat$BigTextStyle) this;
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(((XNA) ym2).A04).setBigContentTitle(notificationCompat$BigTextStyle.A01).bigText(notificationCompat$BigTextStyle.A00);
            if (notificationCompat$BigTextStyle.A03) {
                bigText.setSummaryText(notificationCompat$BigTextStyle.A02);
                return;
            }
            return;
        }
        if (this instanceof NotificationCompat$InboxStyle) {
            NotificationCompat$InboxStyle notificationCompat$InboxStyle = (NotificationCompat$InboxStyle) this;
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((XNA) ym2).A04).setBigContentTitle(notificationCompat$InboxStyle.A01);
            if (notificationCompat$InboxStyle.A03) {
                bigContentTitle.setSummaryText(notificationCompat$InboxStyle.A02);
            }
            Iterator it = notificationCompat$InboxStyle.A00.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
            return;
        }
        ((XNA) ym2).A04.setStyle(new Notification.DecoratedCustomViewStyle());
    }
}
