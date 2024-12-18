package X;

import android.util.Pair;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4I7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4I7 {
    public final C18920wW A00;
    public final UserSession A01;

    public C4I7(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A01 = userSession;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public final void A01(Long l, String str, List list, List list2, Map map) {
        String str2;
        String str3;
        C14360o3.A0B(map, 5);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            C4IA c4ia = (C4IA) pair.first;
            Object obj = pair.second;
            C14360o3.A06(obj);
            C4IB c4ib = (C4IB) obj;
            if (c4ia != null) {
                int ordinal = c4ia.ordinal();
                if (ordinal != 3) {
                    if (ordinal == 5) {
                        str2 = "android.permission.RECORD_AUDIO";
                    }
                } else {
                    str2 = "android.permission.CAMERA";
                }
                EnumC172127lh enumC172127lh = (EnumC172127lh) map.get(str2);
                if (enumC172127lh != null) {
                    if (enumC172127lh.ordinal() == 0) {
                        str3 = "app_permission_grant";
                    } else {
                        str3 = "app_permission_deny";
                    }
                    A00(new C9CH(c4ia, c4ib), l, str3, str, null, list2);
                }
            }
        }
    }

    public final void A00(C9CH c9ch, Long l, String str, String str2, String str3, List list) {
        LinkedHashMap linkedHashMap;
        C14360o3.A0B(str2, 3);
        if (C18U.A06(C06090Tz.A05, this.A01, 36318015823157034L)) {
            if (str3 == null) {
                str3 = C0HM.A00().toString();
                C14360o3.A07(str3);
            }
            C18920wW c18920wW = this.A00;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "device_permissions_external");
            if (A00.isSampled()) {
                A00.AAP("external_event_type", str);
                A00.AAP("surface", "instagram_android");
                A00.AAk("permission_access_purposes", list);
                A00.AAP("experience_id", str3);
                A00.AAP(CacheBehaviorLogger.SOURCE, str2);
                if (c9ch != null) {
                    linkedHashMap = new LinkedHashMap();
                    C4IA c4ia = (C4IA) c9ch.A02;
                    if (c4ia != null) {
                        linkedHashMap.put("data_type", c4ia.A00);
                    }
                    C4IB c4ib = (C4IB) c9ch.A00;
                    if (c4ib != null) {
                        linkedHashMap.put("access_level", c4ib.A00);
                    }
                    C4IC c4ic = (C4IC) c9ch.A01;
                    if (c4ic != null) {
                        linkedHashMap.put("auth_status", c4ic.A00);
                    }
                    String str4 = c9ch.A04;
                    if (str4 != null) {
                        linkedHashMap.put(DevServerEntity.COLUMN_DESCRIPTION, str4);
                    }
                    String str5 = c9ch.A05;
                    if (str5 != null) {
                        linkedHashMap.put("network_status", str5);
                    }
                    Object obj = c9ch.A03;
                    if (obj != null) {
                        linkedHashMap.put("in_preprompt_experiment", String.valueOf(obj));
                    }
                } else {
                    linkedHashMap = null;
                }
                A00.A9M("event_data", linkedHashMap);
                A00.A9K("user_fbid", l);
                A00.Cht();
            }
        }
    }

    public C4I7() {
    }
}
