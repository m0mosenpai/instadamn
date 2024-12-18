package X;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.proxygen.TraceEventType;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.notifications.push.ClearNotificationReceiver;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.OeW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55212OeW {
    public static final InterfaceC08100bW A00 = new C1QF("IgSecureUriParser").A00;
    public static final java.util.Set A01 = new HashSet(Arrays.asList(EnumC47122Ee.A08, EnumC47122Ee.A0S, EnumC47122Ee.A0Q));

    public static XN9 A04(Context context, C116155Nu c116155Nu, UserSession userSession, String str, String str2) {
        return A03(context, C92I.A00(context, c116155Nu.A07, userSession, str, c116155Nu.A11, c116155Nu.A0X), c116155Nu, userSession, str, str2, false);
    }

    public static boolean A07(C116155Nu c116155Nu) {
        String str = c116155Nu.A0g;
        if (str == null) {
            return false;
        }
        if (!str.startsWith("bloks") && !str.startsWith("bloks_action") && !str.startsWith(AbstractC111324zv.A00(4017))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.core.app.NotificationCompat$BigPictureStyle, X.Xpo] */
    public static Notification A00(Context context, XN9 xn9, List list, boolean z, boolean z2) {
        C25821No A002;
        ImageUrl imageUrl;
        Bitmap bitmap;
        List emptyList;
        Bitmap A0G;
        IconCompat A02;
        C116155Nu c116155Nu = (C116155Nu) list.get(AbstractC25226BEj.A05(list));
        if (z) {
            if (c116155Nu.A0E != null) {
                A002 = C25821No.A00();
                imageUrl = c116155Nu.A0E;
                bitmap = A002.A0G(C3ZL.A00(context, imageUrl));
            }
            bitmap = null;
        } else {
            if (c116155Nu.A0D != null) {
                A002 = C25821No.A00();
                imageUrl = c116155Nu.A0D;
                bitmap = A002.A0G(C3ZL.A00(context, imageUrl));
            }
            bitmap = null;
        }
        String str = c116155Nu.A0t;
        if (str != null) {
            emptyList = Arrays.asList(str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1));
        } else {
            emptyList = Collections.emptyList();
        }
        SpannableString spannableString = new SpannableString(c116155Nu.A0r);
        Iterator it = emptyList.iterator();
        while (it.hasNext()) {
            String[] split = AbstractC166987dD.A1B(it).split("\\|");
            String str2 = split[0];
            int i = 1;
            String[] split2 = split[1].split(":");
            int parseInt = Integer.parseInt(split2[0]);
            int parseInt2 = Integer.parseInt(split2[1]);
            if (parseInt >= 0 && parseInt < spannableString.length() && parseInt2 >= 0 && parseInt2 < spannableString.length()) {
                if (!str2.equals("b")) {
                    if (str2.equals("i")) {
                        i = 2;
                    }
                }
                spannableString.setSpan(new StyleSpan(i), parseInt, parseInt2, 33);
            }
        }
        if (bitmap != null) {
            ?? abstractC72869Xpo = new AbstractC72869Xpo();
            abstractC72869Xpo.A02(xn9);
            abstractC72869Xpo.A01 = IconCompat.A02(bitmap);
            abstractC72869Xpo.A02 = XN9.A01(spannableString);
            abstractC72869Xpo.A03 = true;
            if (z2 && c116155Nu.A0C != null && (A0G = C25821No.A00().A0G(c116155Nu.A0C)) != null) {
                Bitmap A022 = A02(context, A0G);
                if (A022 == null) {
                    A02 = null;
                } else {
                    A02 = IconCompat.A02(A022);
                }
                abstractC72869Xpo.A00 = A02;
                abstractC72869Xpo.A02 = true;
            }
            XN9 xn92 = abstractC72869Xpo.A00;
            if (xn92 != null) {
                return xn92.A03();
            }
            return null;
        }
        return xn9.A03();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0159, code lost:
    
        if (X.C2I7.A00(r8.A11, "post") == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.app.PendingIntent A01(android.content.Context r6, android.os.Bundle r7, X.C116155Nu r8, com.instagram.common.session.UserSession r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55212OeW.A01(android.content.Context, android.os.Bundle, X.5Nu, com.instagram.common.session.UserSession, java.lang.String):android.app.PendingIntent");
    }

    public static Bitmap A02(Context context, Bitmap bitmap) {
        try {
            float min = Math.min(context.getResources().getDimension(R.dimen.notification_large_icon_width) / bitmap.getWidth(), context.getResources().getDimension(R.dimen.notification_large_icon_height) / bitmap.getHeight());
            if (min < 1.0f && min > 0.0f) {
                int width = (int) (bitmap.getWidth() * min);
                int height = (int) (bitmap.getHeight() * min);
                try {
                    bitmap = C0fK.A00(bitmap, width, height, true);
                } catch (RuntimeException e) {
                    C0w9.A07("NotificationDelegateHelper_error_creating_bitamp", e);
                    bitmap.setPremultiplied(true);
                    try {
                        bitmap = C0fK.A00(bitmap, width, height, true);
                    } catch (RuntimeException e2) {
                        C0w9.A07(" NotificationDelegateHelper_error_after_premultiplying_bitamp", e2);
                    }
                }
            }
        } catch (Resources.NotFoundException unused) {
        }
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
        Canvas A06 = AbstractC43592JPx.A06(createBitmap);
        C73053Pg c73053Pg = new C73053Pg(bitmap, false);
        c73053Pg.setBounds(0, 0, width2, height2);
        c73053Pg.draw(A06);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(com.facebook.R.style.Avatar, new int[]{com.facebook.R.attr.strokeColor, com.facebook.R.attr.strokeWidth});
        int color = obtainStyledAttributes.getColor(0, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        if (dimensionPixelSize != 0) {
            C58932mr c58932mr = new C58932mr(dimensionPixelSize, color);
            c58932mr.setBounds(0, 0, width2, height2);
            c58932mr.draw(A06);
        }
        return createBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [androidx.core.app.NotificationCompat$BigTextStyle, X.Xpo] */
    public static XN9 A03(Context context, EnumC47122Ee enumC47122Ee, C116155Nu c116155Nu, UserSession userSession, String str, String str2, boolean z) {
        Bitmap A02;
        PackageManager packageManager;
        int i;
        C06090Tz c06090Tz;
        long j;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(AbstractC43591JPw.A00(857), c116155Nu.A12);
        A0b.putString(AbstractC43591JPw.A00(856), c116155Nu.A11);
        A0b.putString("com.instagram.android.igns.logging.ig_action", c116155Nu.A0g);
        A0b.putString("com.instagram.android.igns.logging.intended_recipient_id", c116155Nu.A0j);
        A0b.putString(AbstractC43591JPw.A00(858), c116155Nu.A1A);
        A0b.putString("com.instagram.android.igns.logging.revoked_id", c116155Nu.A16);
        A0b.putString("com.instagram.android.igns.logging.collapse_key", c116155Nu.A0X);
        A0b.putBoolean("com.instagram.android.igns.logging.has_message", TextUtils.isEmpty(c116155Nu.A0r));
        PushChannelType pushChannelType = c116155Nu.A0B;
        if (pushChannelType == null) {
            pushChannelType = PushChannelType.A0D;
        }
        A0b.putString("com.instagram.android.igns.logging.channel_type", pushChannelType.name());
        Long l = c116155Nu.A0J;
        if (l != null) {
            A0b.putLong(AbstractC43591JPw.A00(859), l.longValue());
        }
        String str3 = c116155Nu.A12;
        Intent A08 = MSW.A08(context, ClearNotificationReceiver.class);
        A08.putExtras(A0b);
        A08.setData(AbstractC54066NvQ.A00(str, str2));
        A08.putExtra("push_id", str3);
        A08.putExtra("push_category", str);
        A08.putExtra("channel", TraceEventType.Push);
        A08.putExtra("trace_id", c116155Nu.A13);
        A08.putExtra("landing_path", c116155Nu.A0g);
        A08.putExtra("recipient_id", c116155Nu.A0j);
        A08.putExtra("sender_id", c116155Nu.A1A);
        A08.putExtra("notification_type", c116155Nu.A11);
        A08.putExtra("entry_point_push", true);
        JQW.A05(A08, c116155Nu);
        A08.setAction(str3);
        PendingIntent A022 = MSZ.A0R(context, A08).A02(context, 64278, 268435456);
        Bitmap bitmap = null;
        PendingIntent A012 = A01(context, A0b, c116155Nu, userSession, null);
        String str4 = c116155Nu.A1V;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = c116155Nu.A1I;
        if (str5 == null) {
            str5 = AbstractC13180m4.A00(context);
        }
        boolean equals = RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(str);
        XN9 xn9 = new XN9(context, enumC47122Ee.A00);
        xn9.A0C = A012;
        xn9.A0E(true);
        xn9.A0C(AnonymousClass001.A0R(str4, str5));
        xn9.A0B(c116155Nu.A0r);
        Notification notification = xn9.A0A;
        notification.deleteIntent = A022;
        String str6 = c116155Nu.A1H;
        if (str6 == null) {
            str6 = c116155Nu.A0r;
        }
        xn9.A0D(str6);
        int i2 = com.facebook.R.drawable.notification_icon;
        int A0H = AbstractC53242c7.A0H(context, com.facebook.R.attr.defaultNotificationIcon);
        if (A0H != 0) {
            i2 = A0H;
        }
        xn9.A04(i2);
        xn9.A0F = A0b;
        ?? abstractC72869Xpo = new AbstractC72869Xpo();
        abstractC72869Xpo.A06(c116155Nu.A0r);
        xn9.A0A(abstractC72869Xpo);
        String str7 = c116155Nu.A1D;
        if (str7 != null && str7.length() > 0) {
            xn9.A0R = XN9.A01(str7);
        }
        String str8 = c116155Nu.A0d;
        if (str8 != null && str8.startsWith("[ug]-")) {
            xn9.A0f = true;
        }
        if (!equals && userSession != null) {
            C06090Tz c06090Tz2 = C06090Tz.A05;
            if (C18U.A06(c06090Tz2, userSession, 36322693041170842L)) {
                if ((!TextUtils.isEmpty(c116155Nu.A0d)) && C18U.A06(c06090Tz2, userSession, 36320575622292146L)) {
                    xn9.A0V = AbstractC53671NoM.A00("-", new CharSequence[]{c116155Nu.A0j, c116155Nu.A0d});
                } else {
                    xn9.A0V = AbstractC53876Ns8.A00(enumC47122Ee, c116155Nu.A0j, str);
                }
            }
        }
        if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT.equals(c116155Nu.A1C)) {
            notification.defaults = 1;
        }
        if (!TextUtils.isEmpty(c116155Nu.A1B)) {
            xn9.A0X = c116155Nu.A1B;
        }
        if (z) {
            if (c116155Nu.A0D != null) {
                A02 = C25821No.A00().A0G(c116155Nu.A0D);
                if (A02 != null && !AbstractC43609JQq.A03(c116155Nu, userSession)) {
                    xn9.A07(A02);
                }
            }
            A02 = bitmap;
        } else {
            String str9 = c116155Nu.A0g;
            if (str9 != null && str9.startsWith("draft_post_capture_page")) {
                LinkedHashMap A002 = C50C.A00(str9);
                String A003 = AbstractC111324zv.A00(542);
                A02 = null;
                if (A002.containsKey(A003)) {
                    int dimension = (int) context.getResources().getDimension(com.facebook.R.dimen.ai_sticker_creation_suggested_prompt_pill_height);
                    A02 = C25821No.A00().A0H(AbstractC25225BEi.A0t(AbstractC31171DnF.A0h(A003, A002)), null);
                    if (A02 != null) {
                        C8FY c8fy = new C8FY(context.getResources(), C0fK.A00(A02, dimension, dimension, true));
                        c8fy.A02(context.getResources().getDimension(com.facebook.R.dimen.abc_button_inset_vertical_material));
                        int i3 = c8fy.A02;
                        int i4 = c8fy.A01;
                        A02 = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                        Canvas A06 = AbstractC43592JPx.A06(A02);
                        c8fy.setBounds(0, 0, i3, i4);
                        c8fy.draw(A06);
                    }
                }
            } else {
                if (c116155Nu.A0C != null && (bitmap = C25821No.A00().A0G(c116155Nu.A0C)) != null) {
                    A02 = A02(context, bitmap);
                }
                A02 = bitmap;
            }
            if (A02 != null) {
                xn9.A07(A02);
            }
        }
        if (enumC47122Ee.equals(EnumC47122Ee.A0W)) {
            xn9.A05 = 1;
            notification.vibrate = MTN.A04;
        }
        if (userSession != null) {
            try {
                if (Build.MANUFACTURER.equalsIgnoreCase("samsung") && (packageManager = context.getPackageManager()) != null && ((packageManager.hasSystemFeature("com.samsung.feature.samsung_experience_mobile") || packageManager.hasSystemFeature("com.samsung.feature.samsung_experience_mobile_lite")) && (i = Build.VERSION.class.getDeclaredField("SEM_PLATFORM_INT").getInt(null) - 90000) >= 0)) {
                    if (i / 10000 >= 3 && A01.contains(enumC47122Ee)) {
                        if (C18U.A06(C06090Tz.A06, userSession, 36325265726714824L)) {
                            if (enumC47122Ee != EnumC47122Ee.A08) {
                                c06090Tz = C06090Tz.A05;
                                j = 36325265726649287L;
                            }
                        } else {
                            c06090Tz = C06090Tz.A05;
                            j = 36325265726583750L;
                        }
                        if (C18U.A06(c06090Tz, userSession, j)) {
                            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), com.facebook.R.layout.notification_heads_up_single_media_layout);
                            String A0R = AnonymousClass001.A0R(str4, str5);
                            C14360o3.A0B(A0R, 0);
                            String str10 = c116155Nu.A0r;
                            C14360o3.A0B(str10, 0);
                            remoteViews.setTextViewText(com.facebook.R.id.title, A0R);
                            remoteViews.setTextViewText(com.facebook.R.id.text, str10);
                            if (A02 != null) {
                                remoteViews.setImageViewBitmap(com.facebook.R.id.image, A02);
                                remoteViews.setViewVisibility(com.facebook.R.id.image, 0);
                            }
                            xn9.A0I = remoteViews;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        xn9.A0j = c116155Nu.A1M;
        return xn9;
    }

    public static XN9 A05(Context context, UserSession userSession, String str, String str2, List list) {
        XN9 A04 = A04(context, (C116155Nu) list.get(AbstractC25226BEj.A05(list)), userSession, str, str2);
        if (!list.isEmpty()) {
            A04.A04 = list.size();
        }
        return A04;
    }

    public static List A06(List list, int i) {
        ArrayList A17 = AbstractC25225BEi.A17(Math.min(list.size(), i));
        int size = list.size();
        for (int max = Math.max(0, size - i); max < size; max++) {
            C116155Nu c116155Nu = (C116155Nu) list.get(max);
            if (c116155Nu != null && !TextUtils.isEmpty(c116155Nu.A12)) {
                A17.add(c116155Nu.A12);
            }
        }
        return Collections.unmodifiableList(A17);
    }
}
