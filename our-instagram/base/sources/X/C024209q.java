package X;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/* renamed from: X.09q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C024209q {
    public int A00;
    public C08I A01;
    public Throwable A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;

    public final void A01(C10860hv c10860hv, int i) {
        A02(c10860hv, Long.valueOf(i));
    }

    public final void A00(C10870hw c10870hw, boolean z) {
        this.A03.put(c10870hw, Boolean.valueOf(z));
    }

    public final void A02(C10860hv c10860hv, Long l) {
        Map map = this.A08;
        if (l == null) {
            map.remove(c10860hv);
        } else {
            map.put(c10860hv, l);
        }
    }

    public final void A03(C10850hu c10850hu, String str) {
        C08I c08i;
        int length;
        int i = this.A00;
        if (i > 0 && (c08i = this.A01) != null && str != null && (length = str.length()) > i) {
            String str2 = c10850hu.A00;
            HashMap hashMap = new HashMap();
            hashMap.put("collector", C0LX.A00(c08i.A00));
            hashMap.put("key", str2);
            hashMap.put("length", String.valueOf(length));
            C0PC.A00().DEh("PropertyValueTooLarge", null, hashMap);
            C0K8.A0O("lacrima", "PropertyValueTooLarge - %s", hashMap.toString());
            if (c08i.A02) {
                str = str.substring(0, c08i.A01);
            }
        }
        Map map = this.A09;
        if (str == null) {
            str = "unknown";
        }
        map.put(c10850hu, str);
    }

    public final void A04(C0LP c0lp, C0M6 c0m6, File file) {
        Map map;
        StringBuilder sb;
        String str;
        String obj;
        if (c0m6 == C0M6.CRITICAL_REPORT) {
            map = this.A04;
            str = c0lp.A01;
            if (str.equals("__")) {
                obj = c0lp.A00;
                map.put(obj, file.getPath());
            }
            sb = new StringBuilder();
        } else {
            map = this.A06;
            sb = new StringBuilder();
            str = c0lp.A01;
        }
        sb.append(str);
        sb.append(c0lp.A00);
        obj = sb.toString();
        map.put(obj, file.getPath());
    }

    @Deprecated
    public final void A05(String str, String str2) {
        C08I c08i;
        int length;
        int i = this.A00;
        if (i > 0 && (c08i = this.A01) != null && str2 != null && (length = str2.length()) > i) {
            HashMap hashMap = new HashMap();
            hashMap.put("collector", C0LX.A00(c08i.A00));
            hashMap.put("key", str);
            hashMap.put("length", String.valueOf(length));
            C0PC.A00().DEh("PropertyValueTooLarge", null, hashMap);
            C0K8.A0O("lacrima", "PropertyValueTooLarge - %s", hashMap.toString());
            if (c08i.A02) {
                str2 = str2.substring(0, c08i.A01);
            }
        }
        Map map = this.A05;
        if (str2 == null) {
            str2 = "unknown";
        }
        map.put(str, str2);
    }

    public final void A06(Properties properties) {
        properties.putAll(this.A05);
        for (Map.Entry entry : this.A09.entrySet()) {
            properties.put(((C0LE) entry.getKey()).A00, entry.getValue());
        }
        for (Map.Entry entry2 : this.A08.entrySet()) {
            properties.put(((C0LE) entry2.getKey()).A00, entry2.getValue().toString());
        }
        for (Map.Entry entry3 : this.A03.entrySet()) {
            properties.put(((C0LE) entry3.getKey()).A00, entry3.getValue().toString());
        }
        Iterator it = this.A07.entrySet().iterator();
        if (it.hasNext()) {
            ((Map.Entry) it.next()).getKey();
            throw new NullPointerException("getName");
        }
    }

    public C024209q(Throwable th) {
        this.A05 = new HashMap();
        this.A09 = new HashMap();
        this.A08 = new HashMap();
        this.A03 = new HashMap();
        this.A07 = new HashMap();
        this.A04 = new HashMap();
        this.A06 = new HashMap();
        this.A02 = th;
    }

    public C024209q() {
        this(null);
    }
}
