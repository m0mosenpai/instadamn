package X;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat$InboxStyle;
import com.facebook.R;
import com.google.common.collect.EvictingQueue;
import com.google.common.collect.Synchronized$SynchronizedObject;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.3Ka, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71773Ka {
    public final C1X8 A00;
    public final Queue A01 = new Synchronized$SynchronizedObject(new EvictingQueue(25));

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        this.A01.add(str);
    }

    public final void A00() {
        Object obj;
        try {
            HashSet A0V = AbstractC001800i.A0V(this.A01);
            C1X8 c1x8 = this.A00;
            HashMap A01 = c1x8.A01();
            Collection values = A01.values();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : values) {
                if (((StatusBarNotification) obj2).getNotification().getChannelId().equals("ig_direct")) {
                    arrayList.add(obj2);
                }
            }
            try {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((StatusBarNotification) obj3).isGroup()) {
                        arrayList2.add(obj3);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : arrayList2) {
                    String group = ((StatusBarNotification) obj4).getNotification().getGroup();
                    if (group == null) {
                        group = "";
                    }
                    Object obj5 = linkedHashMap.get(group);
                    if (obj5 == null) {
                        obj5 = new ArrayList();
                        linkedHashMap.put(group, obj5);
                    }
                    ((List) obj5).add(obj4);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Iterator it = ((Iterable) entry.getValue()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            StatusBarNotification statusBarNotification = (StatusBarNotification) obj;
                            if (C14360o3.A0K(statusBarNotification.getTag(), statusBarNotification.getNotification().getGroup())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    StatusBarNotification statusBarNotification2 = (StatusBarNotification) obj;
                    if (statusBarNotification2 != null) {
                        arrayList3.add(new C09530e4(statusBarNotification2, entry.getValue()));
                    }
                }
                for (Map.Entry entry2 : AbstractC06930Yk.A08(arrayList3).entrySet()) {
                    if (((List) entry2.getValue()).size() <= 1) {
                        c1x8.A03(null, ((StatusBarNotification) entry2.getKey()).getTag(), ((StatusBarNotification) entry2.getKey()).getId());
                    } else {
                        Context context = AbstractC12290kX.A00;
                        C14360o3.A07(context);
                        StatusBarNotification statusBarNotification3 = (StatusBarNotification) entry2.getKey();
                        List list = (List) entry2.getValue();
                        C14360o3.A0B(statusBarNotification3, 1);
                        C14360o3.A0B(list, 2);
                        Bundle bundle = statusBarNotification3.getNotification().extras;
                        if (C14360o3.A0K(bundle.getString("category"), RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING)) {
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj6 : list) {
                                StatusBarNotification statusBarNotification4 = (StatusBarNotification) obj6;
                                if (!C14360o3.A0K(statusBarNotification4.getTag(), statusBarNotification4.getNotification().getGroup())) {
                                    arrayList4.add(obj6);
                                }
                            }
                            int i = 0;
                            Iterator it2 = arrayList4.iterator();
                            while (it2.hasNext()) {
                                i += ((StatusBarNotification) it2.next()).getNotification().number;
                            }
                            int size = arrayList4.size();
                            String A00 = AbstractC43591JPw.A00(419);
                            if (bundle.getInt(A00) != i || bundle.getInt("chat_count") != size) {
                                String quantityString = context.getResources().getQuantityString(R.plurals.direct_messages, i, Integer.valueOf(i));
                                C14360o3.A07(quantityString);
                                String quantityString2 = context.getResources().getQuantityString(R.plurals.direct_threads, size, Integer.valueOf(size));
                                C14360o3.A07(quantityString2);
                                String string = context.getString(2131963388, quantityString, quantityString2);
                                C14360o3.A07(string);
                                Bundle bundle2 = statusBarNotification3.getNotification().extras;
                                bundle2.putInt(A00, i);
                                bundle2.putInt("chat_count", size);
                                XN9 xn9 = new XN9(statusBarNotification3.getNotification(), context);
                                NotificationCompat$InboxStyle notificationCompat$InboxStyle = new NotificationCompat$InboxStyle();
                                notificationCompat$InboxStyle.A02 = XN9.A01(string);
                                notificationCompat$InboxStyle.A03 = true;
                                xn9.A0A(notificationCompat$InboxStyle);
                                xn9.A0F = bundle2;
                                XN9.A02(xn9, 8, true);
                                Notification A03 = xn9.A03();
                                if (A03 != null) {
                                    c1x8.A00.A00(statusBarNotification3.getTag(), statusBarNotification3.getId(), A03);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                new C09540e5(th);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry3 : A01.entrySet()) {
                StatusBarNotification statusBarNotification5 = (StatusBarNotification) entry3.getValue();
                if (statusBarNotification5.isGroup() && !statusBarNotification5.getNotification().getChannelId().equals("ig_direct")) {
                    linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                }
            }
            for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                String str = (String) entry4.getKey();
                String group2 = ((StatusBarNotification) entry4.getValue()).getNotification().getGroup();
                if (group2 == null) {
                    group2 = "";
                }
                Object obj7 = linkedHashMap2.get(group2);
                if (obj7 == null) {
                    obj7 = 0;
                    linkedHashMap2.put(group2, obj7);
                }
                int intValue = ((Number) obj7).intValue();
                if (!C14360o3.A0K(str, group2) && !A0V.contains(str)) {
                    linkedHashMap2.put(group2, Integer.valueOf(intValue + 1));
                }
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry5 : linkedHashMap2.entrySet()) {
                if (((Number) entry5.getValue()).intValue() == 0) {
                    linkedHashMap4.put(entry5.getKey(), entry5.getValue());
                }
            }
            Iterator it3 = linkedHashMap4.entrySet().iterator();
            while (it3.hasNext()) {
                StatusBarNotification statusBarNotification6 = (StatusBarNotification) A01.get((String) ((Map.Entry) it3.next()).getKey());
                if (statusBarNotification6 != null) {
                    c1x8.A03(null, statusBarNotification6.getTag(), statusBarNotification6.getId());
                }
            }
        } catch (Throwable th2) {
            new C09540e5(th2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.collect.Synchronized$SynchronizedObject, java.util.Queue] */
    public C71773Ka(C1X8 c1x8) {
        this.A00 = c1x8;
    }
}
