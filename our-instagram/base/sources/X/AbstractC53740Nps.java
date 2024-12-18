package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import com.facebook.R;

/* renamed from: X.Nps, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53740Nps {
    public static final boolean A00(PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, Context context, XN9 xn9, C55093Ob4 c55093Ob4, String str, String str2) {
        boolean A1V = AbstractC167007dF.A1V(str);
        if (c55093Ob4.A03().A0B) {
            String str3 = Build.MANUFACTURER;
            C14360o3.A08(str3);
            String A0f = AbstractC31178DnM.A0f(str3);
            if (pendingIntent != null && pendingIntent2 != null && AbstractC001900j.A0a(A0f, "samsung", false) && Build.VERSION.SDK_INT < 31) {
                OXE.A00.A03("CustomNotificationContentHelper", "Creating custom notification content for Samsung", null);
                RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.custom_incoming_notif_content);
                remoteViews.setTextViewText(R.id.content_title, str);
                remoteViews.setTextViewText(R.id.content_subtitle, str2);
                RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.custom_incoming_notif_content);
                remoteViews2.setTextViewText(R.id.content_title, str);
                remoteViews2.setTextViewText(R.id.content_subtitle, str2);
                RemoteViews remoteViews3 = new RemoteViews(context.getPackageName(), R.layout.custom_incoming_notif_buttons);
                remoteViews3.setTextViewText(R.id.accept_button, context.getText(2131972649));
                remoteViews3.setTextViewCompoundDrawablesRelative(R.id.accept_button, R.drawable.call, 0, 0, 0);
                remoteViews3.setTextViewText(R.id.decline_button, context.getText(2131972653));
                remoteViews3.setTextViewCompoundDrawablesRelative(R.id.decline_button, 0, 0, 0, 0);
                remoteViews3.setOnClickPendingIntent(R.id.decline_button, pendingIntent);
                if (pendingIntent3 != null) {
                    remoteViews3.setViewVisibility(R.id.accept_video_button, 0);
                    remoteViews3.setTextViewText(R.id.accept_video_button, context.getText(2131972650));
                    remoteViews3.setTextViewCompoundDrawablesRelative(R.id.accept_video_button, R.drawable.instagram_video_chat_outline_24, 0, 0, 0);
                    remoteViews3.setOnClickPendingIntent(R.id.accept_video_button, pendingIntent2);
                    remoteViews3.setOnClickPendingIntent(R.id.accept_button, pendingIntent3);
                } else {
                    remoteViews3.setOnClickPendingIntent(R.id.accept_button, pendingIntent2);
                }
                remoteViews2.addView(R.id.content_container, remoteViews3);
                xn9.A0H = remoteViews;
                xn9.A0G = remoteViews2;
                xn9.A0I = remoteViews2;
                xn9.A0A(new AbstractC72869Xpo());
                return A1V;
            }
        }
        return false;
    }
}
