package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat$CallStyle;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.facebook.location.platform.api.Location;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class XNA implements YM2 {
    public int A00;
    public RemoteViews A01;
    public RemoteViews A02;
    public RemoteViews A03;
    public final Notification.Builder A04;
    public final Context A05;
    public final XN9 A06;
    public final List A08 = AbstractC166987dD.A1E();
    public final Bundle A07 = new Bundle();

    /* JADX WARN: Multi-variable type inference failed */
    public XNA(XN9 xn9) {
        Icon A00;
        int i;
        Parcelable[] parcelableArr;
        int i2;
        Y0K A002;
        Y0K A003;
        this.A06 = xn9;
        Context context = xn9.A0E;
        this.A05 = context;
        Notification.Builder builder = new Notification.Builder(context, xn9.A0U);
        this.A04 = builder;
        Notification notification = xn9.A0A;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing(AbstractC167007dF.A1M(notification.flags & 2)).setOnlyAlertOnce(AbstractC167007dF.A1M(notification.flags & 8)).setAutoCancel(AbstractC167007dF.A1M(notification.flags & 16)).setDefaults(notification.defaults).setContentTitle(xn9.A0P).setContentText(xn9.A0O).setContentInfo(xn9.A0N).setContentIntent(xn9.A0C).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(xn9.A0D, AbstractC167007dF.A1M(notification.flags & 128)).setNumber(xn9.A04).setProgress(xn9.A07, xn9.A06, xn9.A0h);
        Notification.Builder builder2 = this.A04;
        IconCompat iconCompat = xn9.A0M;
        if (iconCompat == null) {
            A00 = null;
        } else {
            A00 = AbstractC58497PwQ.A00(context, iconCompat);
        }
        builder2.setLargeIcon(A00);
        this.A04.setSubText(xn9.A0R).setUsesChronometer(xn9.A0k).setPriority(xn9.A05);
        AbstractC72869Xpo abstractC72869Xpo = xn9.A0K;
        if (abstractC72869Xpo instanceof NotificationCompat$CallStyle) {
            NotificationCompat$CallStyle notificationCompat$CallStyle = (NotificationCompat$CallStyle) abstractC72869Xpo;
            PendingIntent pendingIntent = notificationCompat$CallStyle.A02;
            if (pendingIntent == null) {
                A002 = NotificationCompat$CallStyle.A00(notificationCompat$CallStyle.A03, notificationCompat$CallStyle, notificationCompat$CallStyle.A06, R.drawable.ic_call_decline, 2131954498, R.color.call_notification_decline_color);
            } else {
                A002 = NotificationCompat$CallStyle.A00(pendingIntent, notificationCompat$CallStyle, notificationCompat$CallStyle.A06, R.drawable.ic_call_decline, 2131954497, R.color.call_notification_decline_color);
            }
            PendingIntent pendingIntent2 = notificationCompat$CallStyle.A01;
            if (pendingIntent2 == null) {
                A003 = null;
            } else {
                boolean z = notificationCompat$CallStyle.A07;
                int i3 = R.drawable.ic_call_answer;
                int i4 = 2131954495;
                if (z) {
                    i3 = R.drawable.ic_call_answer_video;
                    i4 = 2131954496;
                }
                A003 = NotificationCompat$CallStyle.A00(pendingIntent2, notificationCompat$CallStyle, notificationCompat$CallStyle.A05, i3, i4, R.color.call_notification_answer_color);
            }
            ArrayList A17 = AbstractC25225BEi.A17(3);
            A17.add(A002);
            char c = 2;
            Iterator it = ((AbstractC72869Xpo) notificationCompat$CallStyle).A00.A0Y.iterator();
            while (it.hasNext()) {
                Y0K y0k = (Y0K) it.next();
                if (y0k.A09) {
                    A17.add(y0k);
                } else if (!y0k.A08.getBoolean("key_action_priority") && c > 1) {
                    A17.add(y0k);
                    c = 1;
                }
                if (A003 != null && c == 1) {
                    A17.add(A003);
                    c = 0;
                }
            }
            if (A003 != null && c >= 1) {
                A17.add(A003);
            }
            Iterator it2 = A17.iterator();
            while (it2.hasNext()) {
                A00((Y0K) it2.next());
            }
        } else {
            Iterator it3 = xn9.A0Y.iterator();
            while (it3.hasNext()) {
                A00((Y0K) it3.next());
            }
        }
        Bundle bundle = xn9.A0F;
        if (bundle != null) {
            this.A07.putAll(bundle);
        }
        this.A02 = xn9.A0H;
        this.A01 = xn9.A0G;
        this.A04.setShowWhen(xn9.A0i);
        int i5 = Build.VERSION.SDK_INT;
        this.A04.setLocalOnly(xn9.A0g);
        this.A04.setGroup(xn9.A0V);
        this.A04.setSortKey(xn9.A0X);
        this.A04.setGroupSummary(xn9.A0f);
        this.A00 = xn9.A03;
        this.A04.setCategory(xn9.A0T);
        this.A04.setColor(xn9.A01);
        this.A04.setVisibility(xn9.A08);
        this.A04.setPublicVersion(xn9.A0B);
        this.A04.setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList = xn9.A0a;
        if (!arrayList.isEmpty()) {
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                this.A04.addPerson((String) it4.next());
            }
        }
        this.A03 = xn9.A0I;
        ArrayList arrayList2 = xn9.A0Z;
        if (arrayList2.size() > 0) {
            Bundle bundle2 = xn9.A0F;
            if (bundle2 == null) {
                bundle2 = new Bundle();
                xn9.A0F = bundle2;
            }
            Bundle bundle3 = bundle2.getBundle("android.car.EXTENSIONS");
            Bundle bundle4 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                String num = Integer.toString(i6);
                Y0K y0k2 = (Y0K) arrayList2.get(i6);
                Bundle bundle7 = new Bundle();
                IconCompat iconCompat2 = y0k2.A02;
                if (iconCompat2 == null && (i2 = y0k2.A00) != 0) {
                    iconCompat2 = IconCompat.A01(null, "", i2);
                    y0k2.A02 = iconCompat2;
                }
                if (iconCompat2 != null) {
                    i = iconCompat2.A04();
                } else {
                    i = 0;
                }
                bundle7.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, i);
                bundle7.putCharSequence(DialogModule.KEY_TITLE, y0k2.A03);
                bundle7.putParcelable("actionIntent", y0k2.A01);
                Bundle bundle8 = new Bundle(y0k2.A08);
                bundle8.putBoolean("android.support.allowGeneratedReplies", y0k2.A04);
                bundle7.putBundle(Location.EXTRAS, bundle8);
                C72802XnP[] c72802XnPArr = y0k2.A0A;
                if (c72802XnPArr == null) {
                    parcelableArr = null;
                } else {
                    int length = c72802XnPArr.length;
                    parcelableArr = new Bundle[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        C72802XnP c72802XnP = c72802XnPArr[i7];
                        Bundle bundle9 = new Bundle();
                        bundle9.putString("resultKey", c72802XnP.A03);
                        bundle9.putCharSequence("label", c72802XnP.A02);
                        bundle9.putCharSequenceArray("choices", c72802XnP.A06);
                        bundle9.putBoolean("allowFreeFormInput", c72802XnP.A05);
                        bundle9.putBundle(Location.EXTRAS, c72802XnP.A01);
                        java.util.Set set = c72802XnP.A04;
                        if (!set.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(set.size());
                            Iterator it5 = set.iterator();
                            while (it5.hasNext()) {
                                arrayList3.add(it5.next());
                            }
                            bundle9.putStringArrayList("allowedDataTypes", arrayList3);
                        }
                        parcelableArr[i7] = bundle9;
                    }
                }
                bundle7.putParcelableArray("remoteInputs", parcelableArr);
                bundle7.putBoolean("showsUserInterface", y0k2.A06);
                bundle7.putInt("semanticAction", y0k2.A07);
                bundle6.putBundle(num, bundle7);
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            Bundle bundle10 = xn9.A0F;
            Bundle bundle11 = bundle10;
            if (bundle10 == null) {
                Bundle bundle12 = new Bundle();
                xn9.A0F = bundle12;
                bundle11 = bundle12;
            }
            bundle11.putBundle("android.car.EXTENSIONS", bundle4);
            this.A07.putBundle("android.car.EXTENSIONS", bundle5);
        }
        Object obj = xn9.A0S;
        if (obj != null) {
            this.A04.setSmallIcon((Icon) obj);
        }
        this.A04.setExtras(xn9.A0F);
        this.A04.setRemoteInputHistory(null);
        RemoteViews remoteViews = xn9.A0H;
        if (remoteViews != null) {
            this.A04.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = xn9.A0G;
        if (remoteViews2 != null) {
            this.A04.setCustomBigContentView(remoteViews2);
        }
        RemoteViews remoteViews3 = xn9.A0I;
        if (remoteViews3 != null) {
            this.A04.setCustomHeadsUpContentView(remoteViews3);
        }
        this.A04.setBadgeIconType(xn9.A00);
        this.A04.setSettingsText(xn9.A0Q);
        this.A04.setShortcutId(xn9.A0W);
        this.A04.setTimeoutAfter(xn9.A09);
        this.A04.setGroupAlertBehavior(xn9.A03);
        if (xn9.A0e) {
            this.A04.setColorized(xn9.A0d);
        }
        if (!TextUtils.isEmpty(xn9.A0U)) {
            this.A04.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it6 = xn9.A0b.iterator();
        while (it6.hasNext()) {
            this.A04.addPerson(AbstractC72875Xq9.A00((Y3n) it6.next()));
        }
        if (i5 >= 29) {
            XNC.A03(this.A04, xn9.A0c);
            XNC.A01(XND.A00(xn9.A0J), this.A04);
            Y20 y20 = xn9.A0L;
            if (y20 != null) {
                XNC.A02(this.A04, y20.A01());
            }
            if (i5 >= 31 && xn9.A02 != 0) {
                XPL.A01(this.A04);
            }
        }
        if (xn9.A0j) {
            if (this.A06.A0f) {
                this.A00 = 2;
            } else {
                this.A00 = 1;
            }
            this.A04.setVibrate(null);
            this.A04.setSound(null);
            int i8 = notification.defaults & (-2);
            notification.defaults = i8;
            int i9 = i8 & (-3);
            notification.defaults = i9;
            this.A04.setDefaults(i9);
            if (TextUtils.isEmpty(this.A06.A0V)) {
                this.A04.setGroup("silent");
            }
            this.A04.setGroupAlertBehavior(this.A00);
        }
    }

    private void A00(Y0K y0k) {
        Icon icon;
        int i;
        IconCompat iconCompat = y0k.A02;
        if (iconCompat == null && (i = y0k.A00) != 0) {
            iconCompat = IconCompat.A01(null, "", i);
            y0k.A02 = iconCompat;
        }
        if (iconCompat != null) {
            icon = AbstractC58497PwQ.A00(null, iconCompat);
        } else {
            icon = null;
        }
        Notification.Action.Builder builder = new Notification.Action.Builder(icon, y0k.A03, y0k.A01);
        C72802XnP[] c72802XnPArr = y0k.A0A;
        if (c72802XnPArr != null) {
            int length = c72802XnPArr.length;
            RemoteInput[] remoteInputArr = new RemoteInput[length];
            for (int i2 = 0; i2 < length; i2++) {
                remoteInputArr[i2] = AbstractC72876XqA.A00(c72802XnPArr[i2]);
            }
            for (int i3 = 0; i3 < length; i3++) {
                builder.addRemoteInput(remoteInputArr[i3]);
            }
        }
        Bundle bundle = new Bundle(y0k.A08);
        boolean z = y0k.A04;
        bundle.putBoolean("android.support.allowGeneratedReplies", z);
        builder.setAllowGeneratedReplies(z);
        int i4 = y0k.A07;
        bundle.putInt("android.support.action.semanticAction", i4);
        builder.setSemanticAction(i4);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            XNC.A00(builder, y0k.A09);
            if (i5 >= 31) {
                XPL.A00(builder, y0k.A05);
            }
        }
        bundle.putBoolean("android.support.action.showsUserInterface", y0k.A06);
        builder.addExtras(bundle);
        this.A04.addAction(builder.build());
    }
}
