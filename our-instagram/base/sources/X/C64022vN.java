package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.2vN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64022vN {
    public String A00;
    public String A01;
    public String A02 = UUID.randomUUID().toString();
    public HashMap A04 = new HashMap();
    public HashMap A06 = new HashMap();
    public HashMap A03 = new HashMap();
    public HashMap A05 = new HashMap();
    public List A07 = new ArrayList();
    public Map A08 = new HashMap();

    public static String A00(HashMap hashMap) {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            for (Map.Entry entry : hashMap.entrySet()) {
                A0A.A0r((String) entry.getKey());
                C6XA c6xa = (C6XA) entry.getValue();
                A0A.A0c();
                for (int i = 0; i < c6xa.A00.size(); i++) {
                    C6X9 c6x9 = (C6X9) c6xa.A00.get(i);
                    String str = c6x9.A04;
                    if (str == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(c6x9.A01);
                        sb.append("_");
                        sb.append(c6x9.A00);
                        str = sb.toString();
                        c6x9.A04 = str;
                    }
                    A0A.A0u(str);
                }
                A0A.A0Z();
            }
            A0A.A0a();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException e) {
            C0K8.A0G("PendingReelSeenState", "Failed to serialize seen state to json", e);
            return null;
        }
    }

    public static String A01(HashMap hashMap) {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            for (Map.Entry entry : hashMap.entrySet()) {
                A0A.A0S((String) entry.getKey(), (String) entry.getValue());
            }
            A0A.A0a();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException e) {
            C0K8.A0G("PendingReelSeenState", "Failed to serialize nuxes seen state to json", e);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.6X9] */
    public static void A02(User user, String str, String str2, HashMap hashMap, long j) {
        StringBuilder sb;
        if (user != null && str2 != null) {
            String id = user.getId();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            ?? obj = new Object();
            obj.A05 = str;
            obj.A02 = str2;
            obj.A06 = id;
            obj.A01 = j;
            obj.A00 = currentTimeMillis;
            String str3 = obj.A03;
            if (str3 == null) {
                if ("SUPERLATIVE".equals(str2)) {
                    sb = new StringBuilder();
                    sb.append(id);
                    sb.append("_superlative:");
                    sb.append(str);
                    sb.append("_superlativeReel:");
                } else {
                    int indexOf = str2.indexOf(95);
                    if (indexOf != -1) {
                        str2 = str2.substring(0, indexOf);
                    }
                    sb = new StringBuilder();
                    sb.append(str2);
                    sb.append("_");
                    sb.append(obj.A06);
                    sb.append("_");
                    id = obj.A05;
                }
                sb.append(id);
                str3 = sb.toString();
                obj.A03 = str3;
            }
            C6XA c6xa = (C6XA) hashMap.get(str3);
            if (c6xa == null) {
                c6xa = new C6XA();
                hashMap.put(str3, c6xa);
            }
            c6xa.A00.add(obj);
        }
    }

    public final C1ON A03(UserSession userSession) {
        String str;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A09(C05F.A01);
        if (this.A03.size() > 0) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        c25621Ms.A0L("media/seen/?reel=%s&live_vod=0", str);
        c25621Ms.A0P = true;
        String A00 = A00(this.A03);
        String A002 = A00(this.A05);
        String A01 = A01(this.A04);
        String A012 = A01(this.A06);
        if (A00 != null) {
            c25621Ms.AA6("reels", A00);
        }
        if (A002 != null) {
            c25621Ms.AA6("reel_media_skipped", A002);
        }
        if (A01 != null) {
            c25621Ms.AA6("nuxes", A01);
        }
        if (A012 != null) {
            c25621Ms.AA6("nuxes_skipped", A012);
        }
        List list = this.A07;
        if (list != null) {
            c25621Ms.AA6("force_seen_story_ids", list.toString());
        }
        String str2 = this.A01;
        if (str2 != null) {
            c25621Ms.A9s("container_module", str2);
        }
        String str3 = this.A00;
        if (str3 != null) {
            c25621Ms.A9s("notification_type", str3);
        }
        Map map = this.A08;
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                c25621Ms.AA6((String) entry.getKey(), (String) entry.getValue());
            }
            c25621Ms.A0G("X_IG_PERF_QPL_JOIN_ID", String.valueOf(map.toString().hashCode()));
            c25621Ms.A0G("X_IG_PERF_QPL_MARKER_ID", "823333654");
        }
        c25621Ms.A0V = true;
        c25621Ms.A0S(C40781ul.class, C55702hA.class);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public final C64022vN A04() {
        C64022vN c64022vN = new C64022vN();
        c64022vN.A04 = new HashMap(this.A04);
        c64022vN.A06 = new HashMap(this.A06);
        c64022vN.A01 = this.A01;
        c64022vN.A00 = this.A00;
        Iterator it = this.A03.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Object obj = this.A03.get(next);
            obj.getClass();
            C6XA c6xa = (C6XA) obj;
            C6XA c6xa2 = new C6XA();
            for (int i = 0; i < c6xa.A00.size(); i++) {
                c6xa2.A00.add(c6xa.A00.get(i));
            }
            c64022vN.A03.put(next, c6xa2);
        }
        for (Object obj2 : this.A05.keySet()) {
            Object obj3 = this.A05.get(obj2);
            obj3.getClass();
            C6XA c6xa3 = (C6XA) obj3;
            C6XA c6xa4 = new C6XA();
            for (int i2 = 0; i2 < c6xa3.A00.size(); i2++) {
                c6xa4.A00.add(c6xa3.A00.get(i2));
            }
            c64022vN.A05.put(obj2, c6xa4);
        }
        c64022vN.A07.addAll(this.A07);
        for (Object obj4 : this.A08.keySet()) {
            c64022vN.A08.put(obj4, this.A08.get(obj4));
        }
        return c64022vN;
    }

    public final void A05() {
        this.A04.clear();
        this.A03.clear();
        this.A08.clear();
        this.A07.clear();
    }

    public final boolean A07() {
        if (this.A04.isEmpty() && this.A03.isEmpty() && this.A07.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void A06(String str, UserSession userSession, C38321qM c38321qM) {
        String id = c38321qM.getId();
        A02(c38321qM.A2E(userSession), str, id, this.A03, c38321qM.A1B());
    }
}
