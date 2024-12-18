package X;

import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0xA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19260xA implements InterfaceC11310in {
    public final C11420j0 A00;

    public static synchronized void A00(C19260xA c19260xA, Object obj, String str) {
        synchronized (c19260xA) {
            C11420j0 c11420j0 = c19260xA.A00;
            if (str != null && !str.isEmpty()) {
                if (obj instanceof Float) {
                    float floatValue = ((Float) obj).floatValue();
                    if (!Float.isNaN(floatValue)) {
                        if (Float.isInfinite(floatValue)) {
                        }
                    }
                }
                if (obj instanceof Double) {
                    double doubleValue = ((Double) obj).doubleValue();
                    if (!Double.isNaN(doubleValue)) {
                        if (Double.isInfinite(doubleValue)) {
                        }
                    }
                }
                ArrayList arrayList = c11420j0.A01;
                arrayList.add(str);
                arrayList.add(obj);
                c11420j0.A00++;
            }
        }
    }

    public final synchronized void A07(C0CA c0ca) {
        C11420j0 c11420j0 = this.A00;
        int i = c11420j0.A00;
        for (int i2 = 0; i2 < i; i2++) {
            String A03 = c11420j0.A03(i2);
            if (!TextUtils.isEmpty(A03)) {
                Object A01 = c11420j0.A01(i2);
                if (A01 instanceof Number) {
                    C0CA.A00(c0ca, (Number) A01, A03);
                } else if (A01 instanceof String) {
                    C0CA.A00(c0ca, (String) A01, A03);
                } else if (A01 instanceof Boolean) {
                    C0CA.A00(c0ca, (Boolean) A01, A03);
                } else if (A01 instanceof C19260xA) {
                    ((C19260xA) A01).A07(c0ca.A0B(A03));
                } else if (A01 instanceof C0x9) {
                    C0CW A012 = ((AbstractC04050Jw) c0ca).A01.A01();
                    c0ca.A0E(A012, A03);
                    ((C0x9) A01).A03(A012);
                } else {
                    C0CA.A00(c0ca, (String) A01, A03);
                }
            }
        }
    }

    public final void A0B(StringBuilder sb, String str) {
        int i = 0;
        while (true) {
            C11420j0 c11420j0 = this.A00;
            if (i < c11420j0.A00) {
                sb.append(str);
                sb.append(c11420j0.A03(i));
                sb.append(" = ");
                AbstractC11490j8.A07(sb, str, c11420j0.A01(i));
                sb.append('\n');
                i++;
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC11310in
    public final AnalyticsEventDebugInfo EqF() {
        AnalyticsEventDebugInfo analyticsEventDebugInfo = new AnalyticsEventDebugInfo(2);
        int i = 0;
        while (true) {
            C11420j0 c11420j0 = this.A00;
            if (i < c11420j0.A00) {
                AbstractC11490j8.A05(analyticsEventDebugInfo, c11420j0.A01(i), c11420j0.A03(i));
                i++;
            } else {
                return analyticsEventDebugInfo;
            }
        }
    }

    public final Boolean A01(String str) {
        Object A02 = this.A00.A02(str);
        if (A02 != null) {
            if (A02 instanceof Boolean) {
                return (Boolean) A02;
            }
            C0K8.A0C("ExtraBundle", AnonymousClass001.A0g("You are trying get value as Boolean from key: ", str, " but the value type is not Boolean. Please check again if you use it to log USL."));
            return null;
        }
        return null;
    }

    public final Double A02(String str) {
        Object A02 = this.A00.A02(str);
        if (A02 != null) {
            if (A02 instanceof Double) {
                return (Double) A02;
            }
            C0K8.A0C("ExtraBundle", AnonymousClass001.A0g("You are trying get value as Double from key: ", str, " but the value type is not Double. Please check again if you use it to log USL."));
            return null;
        }
        return null;
    }

    public final Integer A03(String str) {
        Object A02 = this.A00.A02(str);
        if (A02 != null) {
            if (A02 instanceof Integer) {
                return (Integer) A02;
            }
            C0K8.A0C("ExtraBundle", AnonymousClass001.A0g("You are trying get value as Integer from key: ", str, " but the value type is not Integer. Please check again if you use it to log USL."));
            return null;
        }
        return null;
    }

    public final Long A04(String str) {
        Object A02 = this.A00.A02(str);
        if (A02 != null) {
            if (A02 instanceof Long) {
                return (Long) A02;
            }
            C0K8.A0C("ExtraBundle", AnonymousClass001.A0g("You are trying get value as Long from key: ", str, " but the value type is not Long. Please check again if you use it to log USL."));
            return null;
        }
        return null;
    }

    public final String A05(String str) {
        Object A02 = this.A00.A02(str);
        if (A02 != null) {
            if (A02 instanceof String) {
                return (String) A02;
            }
            C0K8.A0C("ExtraBundle", AnonymousClass001.A0g("You are trying get value as String from key: ", str, " but the value type is not String. Please check again if you use it to log USL."));
            return null;
        }
        return null;
    }

    public final ArrayList A06(String str) {
        C0x9 c0x9 = (C0x9) this.A00.A02(str);
        if (c0x9 != null) {
            return c0x9.A00;
        }
        return null;
    }

    @Deprecated
    public final void A08(String str, List list) {
        C0x9 c0x9 = new C0x9();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c0x9.A04((String) it.next());
        }
        A00(this, c0x9, str);
    }

    public final void A09(String str, List list) {
        C0x9 c0x9 = new C0x9();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c0x9.A00.add(((C11520jB) it.next()).A00());
        }
        A00(this, c0x9, str);
    }

    public final void A0A(String str, List list) {
        C0x9 c0x9 = new C0x9();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            C19260xA c19260xA = new C19260xA();
            c19260xA.A0C(map);
            c0x9.A00.add(c19260xA);
        }
        A00(this, c0x9, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19260xA)) {
            return false;
        }
        return C02O.A00(this.A00, ((C19260xA) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String str;
        StringWriter stringWriter = new StringWriter();
        stringWriter.append((CharSequence) "{");
        int i = 0;
        while (true) {
            C11420j0 c11420j0 = this.A00;
            if (i < c11420j0.A00) {
                Object A01 = c11420j0.A01(i);
                if (A01 != null) {
                    str = A01.toString();
                } else {
                    str = "";
                }
                StringWriter append = stringWriter.append((CharSequence) c11420j0.A03(i)).append((CharSequence) InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                if (str.isEmpty()) {
                    str = "null";
                }
                append.append((CharSequence) str);
                if (i < c11420j0.A00 - 1) {
                    stringWriter.append((CharSequence) ", ");
                }
                i++;
            } else {
                stringWriter.append((CharSequence) "}");
                return stringWriter.toString();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.0j0] */
    public C19260xA() {
        ?? obj = new Object();
        obj.A01 = new ArrayList(32);
        this.A00 = obj;
    }

    public final void A0C(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            A00(this, entry.getValue(), (String) entry.getKey());
        }
    }

    public final void A0D(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            A00(this, entry.getValue(), entry.getKey().toString());
        }
    }

    public final void A0E(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            A08(entry.getKey().toString(), arrayList);
        }
    }

    public final void A0F(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            A00(this, entry.getValue(), entry.getKey().toString());
        }
    }

    public final void A0G(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            A00(this, entry.getValue(), (String) entry.getKey());
        }
    }

    public final void A0H(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            A08((String) entry.getKey(), (List) entry.getValue());
        }
    }
}
