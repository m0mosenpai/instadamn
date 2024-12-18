package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4xr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110224xr implements InterfaceC12870lZ {
    public final InterfaceC02550Ad A00;
    public final boolean A01;
    public final C2IZ A02;
    public final C110234xs A03;
    public final C19740y2 A04;
    public final C23031Ai A05;
    public final InterfaceC16820sZ A06;

    public C110224xr(InterfaceC02550Ad interfaceC02550Ad, UserSession userSession, C2IZ c2iz, C19740y2 c19740y2, C23031Ai c23031Ai, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(c19740y2, 3);
        C14360o3.A0B(c23031Ai, 4);
        this.A00 = interfaceC02550Ad;
        this.A04 = c19740y2;
        this.A05 = c23031Ai;
        this.A02 = c2iz;
        this.A06 = interfaceC16820sZ;
        this.A03 = new C110234xs(this);
        this.A01 = C18U.A06(C06090Tz.A06, userSession, 36320803255559072L);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        C0f9.A0A(16047155, C0f9.A03(-794487918));
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        Long l;
        Long l2;
        Boolean bool;
        long j;
        int i;
        boolean z;
        C0Zx c0Zx;
        int A03 = C0f9.A03(355545625);
        Context context = (Context) this.A06.invoke();
        C18920wW c18920wW = (C18920wW) this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_android_badge");
        if (!A00.isSampled()) {
            i = 441235914;
        } else {
            A00.A8R(EnumC93504Hp.APP_BADGE, "badge_type");
            A00.A8R(EnumC93514Hq.USER_ENTERED_APP, "badge_event");
            long j2 = this.A05.A01.getInt("num_unseen_activities", 0);
            InterfaceC19630xq interfaceC19630xq = this.A04.A00;
            boolean z2 = interfaceC19630xq.getBoolean("launcher_badge_supported", false);
            int i2 = interfaceC19630xq.getInt("launcher_badge_count", 0);
            if (i2 >= 0) {
                l = Long.valueOf(i2);
            } else {
                l = null;
            }
            HashMap hashMap = new HashMap();
            if (interfaceC19630xq.getInt("armadillo_thread_count_for_launcher_badge", -1) != -1) {
                hashMap.put(C4JT.E2EE, Long.valueOf(interfaceC19630xq.getInt("armadillo_thread_count_for_launcher_badge", -1)));
            }
            if (interfaceC19630xq.getInt("open_thread_count_for_launcher_badge", -1) != -1) {
                hashMap.put(C4JT.OPEN_MESSAGE, Long.valueOf(interfaceC19630xq.getInt("open_thread_count_for_launcher_badge", -1)));
            }
            A00.A7v("is_device_badge_count_capable", Boolean.valueOf(z2));
            A00.A9K("badge_value_set", l);
            A00.A9M("badge_value_set_map", hashMap);
            A00.A9K("unseen_activity_count", Long.valueOf(j2));
            A00.A7v("excludes_muted", Boolean.valueOf(this.A01));
            List<C54J> list = this.A02.A00().A01;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            for (C54J c54j : list) {
                if (c54j instanceof C5NQ) {
                    c0Zx = new C0Zx();
                    C9ZG c9zg = ((C5NQ) c54j).A00;
                    MsysThreadId msysThreadId = c9zg.A02;
                    c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, String.valueOf(msysThreadId.A00));
                    c0Zx.A06("v2_id", null);
                    c0Zx.A03(TraceFieldType.IsSecure, true);
                    c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, msysThreadId.A01.A00);
                    c0Zx.A01(AbstractC46626Kk3.A00(c9zg.A01.A00), "thread_sub_type");
                } else {
                    C3o9 c3o9 = c54j.A00;
                    C14360o3.A0C(c3o9, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadKey");
                    DirectThreadKey directThreadKey = (DirectThreadKey) c3o9;
                    c0Zx = new C0Zx();
                    c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, directThreadKey.A00);
                    c0Zx.A06("v2_id", directThreadKey.A01);
                    c0Zx.A03(TraceFieldType.IsSecure, Boolean.valueOf(c54j.A08));
                    c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, EnumC92794Ds.A05.A00);
                }
                c0Zx.A03("is_muted", Boolean.valueOf(c54j.A0A));
                arrayList.add(c0Zx);
            }
            A00.A9K("unread_threads_count", Long.valueOf(arrayList.size()));
            A00.AAk("unread_threads", arrayList);
            C110234xs c110234xs = this.A03;
            boolean z3 = false;
            C14360o3.A0B(context, 0);
            Object systemService = context.getSystemService("notification");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            boolean areNotificationsEnabled = notificationManager.areNotificationsEnabled();
            ContentResolver contentResolver = context.getContentResolver();
            boolean z4 = true;
            if (Settings.Global.getInt(contentResolver, "notification_badging", 1) != 1) {
                z4 = false;
            }
            if (areNotificationsEnabled) {
                ImmutableList.Builder builder = new ImmutableList.Builder();
                StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                C14360o3.A07(activeNotifications);
                ArrayList arrayList2 = new ArrayList();
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    Notification notification = statusBarNotification.getNotification();
                    C14360o3.A07(notification);
                    if ((notification.flags & 64) == 0) {
                        arrayList2.add(statusBarNotification);
                    }
                }
                Iterator it = arrayList2.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    StatusBarNotification statusBarNotification2 = (StatusBarNotification) it.next();
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(statusBarNotification2.getNotification().getChannelId());
                    if (notificationChannel != null) {
                        z = notificationChannel.canShowBadge();
                    } else {
                        z = false;
                    }
                    C0Zx c0Zx2 = new C0Zx();
                    c0Zx2.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf(statusBarNotification2.getId()));
                    c0Zx2.A06("tag", statusBarNotification2.getTag());
                    c0Zx2.A03("affects_badging", Boolean.valueOf(z));
                    c0Zx2.A06("channel_id", statusBarNotification2.getNotification().getChannelId());
                    builder.add((Object) c0Zx2);
                    if (z) {
                        i3++;
                    }
                }
                if (i3 != 0) {
                    ImmutableList build = builder.build();
                    if (z4 && i3 > 0) {
                        if (!z2 || i2 > 0) {
                            z3 = true;
                        }
                        bool = Boolean.valueOf(z3);
                    } else {
                        bool = null;
                    }
                    if (C14360o3.A0K(bool, true)) {
                        l2 = Long.valueOf(z2 ? i2 : i3);
                    } else {
                        l2 = null;
                    }
                    A00.AAk("unread_notifs", build);
                    j = build.size();
                } else {
                    l2 = null;
                    A00.AAk("unread_notifs", null);
                    A00.A9K("unread_notifs_count", null);
                    A00.A7v("was_badge_showing", null);
                    A00.A9K("current_badge_value_showing", l2);
                    A00.A7v("is_badging_enabled_on_device", Boolean.valueOf(z4));
                    A00.A7v("excludes_muted", Boolean.valueOf(c110234xs.A00.A01));
                    A00.Cht();
                    i = 1727399799;
                }
            } else {
                l2 = null;
                if (z2) {
                    bool = null;
                } else {
                    bool = false;
                }
                A00.AAk("unread_notifs", null);
                j = 0;
            }
            A00.A9K("unread_notifs_count", Long.valueOf(j));
            A00.A7v("was_badge_showing", bool);
            A00.A9K("current_badge_value_showing", l2);
            A00.A7v("is_badging_enabled_on_device", Boolean.valueOf(z4));
            A00.A7v("excludes_muted", Boolean.valueOf(c110234xs.A00.A01));
            A00.Cht();
            i = 1727399799;
        }
        C0f9.A0A(i, A03);
    }
}
