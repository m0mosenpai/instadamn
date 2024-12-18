package X;

import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.android.gms.internal.gtm.zzbk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SZ8 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final List A03;
    public final Map A04;
    public final boolean A05;
    public final String A06;

    public static String A00(AbstractC63371Sic abstractC63371Sic, Object obj) {
        if (obj != null) {
            String obj2 = obj.toString();
            if (obj2.startsWith("&")) {
                obj2 = obj2.substring(1);
            }
            int length = obj2.length();
            if (length > 256) {
                obj2 = AbstractC58318PtA.A0j(obj2, 256);
                abstractC63371Sic.A0C(Integer.valueOf(length), obj2, "Hit param name is too long and will be trimmed");
            }
            if (!TextUtils.isEmpty(obj2)) {
                return obj2;
            }
        }
        return null;
    }

    public SZ8(AbstractC63371Sic abstractC63371Sic, List list, Map map, int i, long j, long j2, boolean z) {
        List emptyList;
        String str;
        String obj;
        String A00;
        String obj2;
        C3U5.A02(abstractC63371Sic);
        C3U5.A02(map);
        this.A02 = j;
        this.A05 = z;
        this.A01 = j2;
        this.A00 = i;
        if (list != null) {
            emptyList = list;
        } else {
            emptyList = Collections.emptyList();
        }
        this.A03 = emptyList;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbk zzbkVar = (zzbk) it.next();
                if ("appendVersion".equals(zzbkVar.A01)) {
                    str = zzbkVar.A00;
                    break;
                }
            }
        }
        str = null;
        this.A06 = TextUtils.isEmpty(str) ? null : str;
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            Object key = A1K.getKey();
            if (key != null && key.toString().startsWith("&") && (A00 = A00(abstractC63371Sic, A1K.getKey())) != null) {
                Object value = A1K.getValue();
                if (value == null) {
                    obj2 = "";
                } else {
                    obj2 = value.toString();
                }
                int length = obj2.length();
                if (length > 8192) {
                    obj2 = AbstractC58318PtA.A0j(obj2, 8192);
                    abstractC63371Sic.A0C(Integer.valueOf(length), obj2, "Hit param value is too long and will be trimmed");
                }
                A1G.put(A00, obj2);
            }
        }
        Iterator A152 = AbstractC166997dE.A15(map);
        while (A152.hasNext()) {
            Map.Entry A1K2 = AbstractC166987dD.A1K(A152);
            Object key2 = A1K2.getKey();
            if (key2 == null || !key2.toString().startsWith("&")) {
                String A002 = A00(abstractC63371Sic, A1K2.getKey());
                if (A002 != null) {
                    Object value2 = A1K2.getValue();
                    if (value2 == null) {
                        obj = "";
                    } else {
                        obj = value2.toString();
                    }
                    int length2 = obj.length();
                    if (length2 > 8192) {
                        obj = AbstractC58318PtA.A0j(obj, 8192);
                        abstractC63371Sic.A0C(Integer.valueOf(length2), obj, "Hit param value is too long and will be trimmed");
                    }
                    A1G.put(A002, obj);
                }
            }
        }
        if (!TextUtils.isEmpty(this.A06)) {
            AbstractC63066Sbn.A02(A1G, "_v", this.A06);
            String str2 = this.A06;
            if (str2.equals("ma4.0.0") || str2.equals("ma4.0.1")) {
                A1G.remove("adid");
            }
        }
        this.A04 = Collections.unmodifiableMap(A1G);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ht=");
        A1C.append(this.A02);
        long j = this.A01;
        if (j != 0) {
            A1C.append(", dbId=");
            A1C.append(j);
        }
        int i = this.A00;
        if (i != 0) {
            A1C.append(", appUID=");
            A1C.append(i);
        }
        Map map = this.A04;
        ArrayList A1F = AbstractC166987dD.A1F(map.keySet());
        Collections.sort(A1F);
        int size = A1F.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = A1F.get(i2);
            i2++;
            String str = (String) obj;
            AbstractC58318PtA.A1S(A1C);
            A1C.append(str);
            A1C.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
            A1C.append(AbstractC166987dD.A1A(str, map));
        }
        return A1C.toString();
    }
}
