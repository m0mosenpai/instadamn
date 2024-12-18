package X;

import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.L5j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47722L5j {
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0Zx, X.Jtp] */
    public final C44875Jtp A00(List list) {
        if (AbstractC166987dD.A1a(AbstractC20070ye.A00(18312658218400014L).A00())) {
            ?? c0Zx = new C0Zx();
            c0Zx.A05("count", AbstractC31171DnF.A0V(list.size()));
            HashMap A1G = AbstractC166987dD.A1G();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                StatusBarNotification statusBarNotification = (StatusBarNotification) it.next();
                String groupKey = statusBarNotification.getGroupKey();
                C14360o3.A0A(groupKey);
                if (A1G.containsKey(groupKey)) {
                    List list2 = (List) A1G.get(groupKey);
                    if (list2 != null) {
                        list2.add(statusBarNotification);
                    }
                } else {
                    A1G.put(groupKey, AbstractC16960so.A1N(statusBarNotification));
                }
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            java.util.Set entrySet = A1G.entrySet();
            C14360o3.A07(entrySet);
            List A00 = JUD.A00(entrySet, 7);
            HashMap A1G2 = AbstractC166987dD.A1G();
            HashMap A1G3 = AbstractC166987dD.A1G();
            Iterator it2 = A00.iterator();
            long j = 0;
            long j2 = 0;
            long j3 = 0;
            while (it2.hasNext()) {
                Object A0j = AbstractC31176DnK.A0j(it2);
                C14360o3.A07(A0j);
                List<StatusBarNotification> list3 = (List) A0j;
                if (list3.size() > 1) {
                    JUD.A01(6, list3);
                }
                for (StatusBarNotification statusBarNotification2 : list3) {
                    C0Zx c0Zx2 = new C0Zx();
                    Bundle bundle = statusBarNotification2.getNotification().extras;
                    String string = bundle.getString("com.instagram.android.igns.logging.push_category");
                    String string2 = bundle.getString("com.instagram.android.igns.logging.push_id");
                    if (!A1G2.containsKey(string2)) {
                        A1G2.put(string2, Long.valueOf(j));
                        j++;
                    }
                    c0Zx2.A05("user_local_id", Long.valueOf(j));
                    String groupKey2 = statusBarNotification2.getGroupKey();
                    C14360o3.A0A(groupKey2);
                    if (!A1G3.containsKey(groupKey2)) {
                        Long valueOf = Long.valueOf(j2);
                        String groupKey3 = statusBarNotification2.getGroupKey();
                        C14360o3.A0A(groupKey3);
                        A1G3.put(groupKey3, valueOf);
                        j2++;
                    }
                    String groupKey4 = statusBarNotification2.getGroupKey();
                    C14360o3.A0A(groupKey4);
                    c0Zx2.A05("group_local_id", (Long) A1G3.get(groupKey4));
                    c0Zx2.A03("is_group_summary", AbstractC43593JPy.A0n(statusBarNotification2.getGroupKey(), statusBarNotification2.getTag()));
                    c0Zx2.A03("is_grouped", Boolean.valueOf(statusBarNotification2.isGroup()));
                    c0Zx2.A05("user_local_id", (Long) A1G2.get(string2));
                    c0Zx2.A06("notification_type", string);
                    c0Zx2.A05("displayed_timestamp", Long.valueOf(statusBarNotification2.getPostTime()));
                    c0Zx2.A05("tray_position", Long.valueOf(j3));
                    A1E.add(c0Zx2);
                    j3++;
                }
            }
            c0Zx.A05("group_count", AbstractC31171DnF.A0V(A1G.keySet().size()));
            c0Zx.A07("tray_context", A1E);
            return c0Zx;
        }
        return null;
    }
}
