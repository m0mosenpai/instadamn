package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.graphics.drawable.Icon;

/* loaded from: classes12.dex */
public abstract class Y6w {
    public static Notification.CallStyle A00(Person person, PendingIntent pendingIntent) {
        return Notification.CallStyle.forOngoingCall(person, pendingIntent);
    }

    public static Notification.CallStyle A01(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
    }

    public static Notification.CallStyle A02(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
    }

    public static void A03(Notification.CallStyle callStyle, int i) {
        callStyle.setAnswerButtonColorHint(i);
    }

    public static void A04(Notification.CallStyle callStyle, int i) {
        callStyle.setDeclineButtonColorHint(i);
    }

    public static void A05(Notification.CallStyle callStyle, Icon icon) {
        callStyle.setVerificationIcon(icon);
    }

    public static void A06(Notification.CallStyle callStyle, CharSequence charSequence) {
        callStyle.setVerificationText(charSequence);
    }

    public static void A07(Notification.CallStyle callStyle, boolean z) {
        callStyle.setIsVideo(z);
    }
}
