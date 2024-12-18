package X;

import android.util.Pair;
import com.facebook.flexiblesampling.SamplingResult;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import com.instagram.common.analytics.intf.AnalyticsEventEntry;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.0xC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19280xC implements InterfaceC11310in {
    public long A00;
    public SamplingResult A01;
    public Integer A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final C19260xA A06 = new C19260xA();
    public final EnumSet A07 = EnumSet.noneOf(EnumC11440j2.class);

    public final void A04(C19260xA c19260xA) {
        int i = 0;
        while (true) {
            int i2 = i;
            C11420j0 c11420j0 = c19260xA.A00;
            if (i < c11420j0.A00) {
                String A03 = c11420j0.A03(i);
                i++;
                Pair pair = new Pair(A03, c11420j0.A01(i2));
                Object obj = pair.second;
                if (obj instanceof String) {
                    A0C((String) pair.first, (String) obj);
                } else if (obj instanceof Integer) {
                    A08((Integer) obj, (String) pair.first);
                } else if (obj instanceof Double) {
                    A0A((String) pair.first, (Double) obj);
                } else if (obj instanceof Long) {
                    A0B((String) pair.first, (Long) obj);
                } else if (obj instanceof Float) {
                    C19260xA.A00(this.A06, obj, (String) pair.first);
                } else if (obj instanceof Boolean) {
                    A09((String) pair.first, (Boolean) obj);
                } else if (obj instanceof C0x9) {
                    A06((C0x9) obj, (String) pair.first);
                } else if (obj instanceof C19260xA) {
                    A05((C19260xA) obj, (String) pair.first);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.instagram.common.analytics.intf.AnalyticsEventEntry, java.lang.Object] */
    @Override // X.InterfaceC11310in
    public final AnalyticsEventDebugInfo EqF() {
        AnalyticsEventDebugInfo analyticsEventDebugInfo = new AnalyticsEventDebugInfo(1);
        AnalyticsEventDebugInfo EqF = this.A06.EqF();
        ?? obj = new Object();
        obj.A02 = "extra";
        obj.A00 = EqF;
        List list = analyticsEventDebugInfo.A01;
        list.add(obj);
        list.add(new AnalyticsEventEntry("module", this.A03));
        list.add(new AnalyticsEventEntry("event", this.A04));
        Integer num = this.A02;
        if (num != null) {
            list.add(new AnalyticsEventEntry("sample_rate", num));
        }
        EnumSet enumSet = this.A07;
        if (!enumSet.isEmpty()) {
            list.add(new AnalyticsEventEntry("tags", enumSet));
        }
        StringBuilder sb = new StringBuilder();
        long j = this.A00;
        sb.append(j);
        sb.append(" (");
        sb.append(AbstractC11490j8.A00.format(new Date(j)));
        sb.append(")");
        list.add(new AnalyticsEventEntry("time", sb.toString()));
        analyticsEventDebugInfo.A00 = this.A04;
        return analyticsEventDebugInfo;
    }

    public final Float A02(String str) {
        Object A02 = this.A06.A00.A02(str);
        if (A02 != null) {
            if (A02 instanceof Float) {
                return (Float) A02;
            }
            C0K8.A0C("ExtraBundle", AnonymousClass001.A0g("You are trying get value as Float from key: ", str, " but the value type is not Float. Please check again if you use it to log USL."));
            return null;
        }
        return null;
    }

    public final String A03() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ");
        sb.append(this.A04);
        sb.append("; ModuleName: ");
        sb.append(this.A03);
        sb.append("; Extra: ");
        sb.append(this.A06.toString());
        Integer num = this.A02;
        if (num != null) {
            sb.append("; Sample Rate: ");
            sb.append(num);
        }
        EnumSet enumSet = this.A07;
        if (enumSet != null) {
            sb.append("; Tags: ");
            sb.append(enumSet);
        }
        return sb.toString();
    }

    public final void A05(C19260xA c19260xA, String str) {
        C19260xA.A00(this.A06, c19260xA, str);
    }

    public final void A06(C0x9 c0x9, String str) {
        C19260xA.A00(this.A06, c0x9, str);
    }

    public final void A07(C11500j9 c11500j9, String str) {
        A0C(c11500j9.A01, str);
    }

    public final void A08(Integer num, String str) {
        C19260xA.A00(this.A06, num, str);
    }

    public final void A09(String str, Boolean bool) {
        C19260xA.A00(this.A06, bool, str);
    }

    public final void A0A(String str, Double d) {
        C19260xA.A00(this.A06, d, str);
    }

    public final void A0B(String str, Long l) {
        C19260xA.A00(this.A06, l, str);
    }

    public final void A0C(String str, String str2) {
        C19260xA.A00(this.A06, str2, str);
    }

    public final void A0D(String str, List list) {
        this.A06.A08(str, list);
    }

    public final void A0E(String str, String[] strArr) {
        C19260xA c19260xA = this.A06;
        C0x9 c0x9 = new C0x9();
        for (String str2 : strArr) {
            c0x9.A04(str2);
        }
        C19260xA.A00(c19260xA, c0x9, str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("| extra = {\n");
        this.A06.A0B(sb, "|   ");
        sb.append("| }");
        sb.append("\n| module = ");
        sb.append(this.A03);
        sb.append("\n| name = ");
        sb.append(this.A04);
        sb.append("\n| time = ");
        long j = this.A00;
        sb.append(j);
        sb.append(" (");
        sb.append(AbstractC11490j8.A00.format(new Date(j)));
        sb.append(")");
        Integer num = this.A02;
        if (num != null) {
            sb.append("\n| sample_rate = ");
            sb.append(num);
        }
        EnumSet enumSet = this.A07;
        if (!enumSet.isEmpty()) {
            sb.append("\n| tags = ");
            sb.append(enumSet);
        }
        sb.append("\n}");
        return sb.toString();
    }

    @Deprecated
    public static C19280xC A00(InterfaceC11380iw interfaceC11380iw, String str) {
        String moduleName;
        str.getClass();
        if (interfaceC11380iw == null) {
            moduleName = null;
        } else {
            moduleName = interfaceC11380iw.getModuleName();
        }
        return A01(str, moduleName);
    }

    @Deprecated
    public static C19280xC A01(String str, String str2) {
        str.getClass();
        C19280xC c19280xC = new C19280xC();
        c19280xC.A05 = false;
        c19280xC.A04 = str;
        c19280xC.A03 = str2;
        return c19280xC;
    }

    public final void A0F(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                A08((Integer) value, str);
            } else if (value instanceof String) {
                A0C(str, (String) value);
            } else if (value instanceof Double) {
                A0A(str, (Double) value);
            } else if (value instanceof Long) {
                A0B(str, (Long) value);
            } else if (value instanceof Boolean) {
                A09(str, (Boolean) value);
            } else if (value != null) {
                C0w9.A03("AnalyticsEvent", AnonymousClass001.A0R("Unsupported value type: ", value.getClass().getName()));
            }
        }
    }
}
