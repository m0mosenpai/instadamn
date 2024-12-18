package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/* renamed from: X.0gE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10010gE extends AbstractC19070wo implements C0V9 {
    public final ThreadLocal A01 = new ThreadLocal() { // from class: X.0VA
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ Object initialValue() {
            return new Random();
        }
    };
    public final Map A00 = new TreeMap();

    @Override // X.AbstractC06400Vg
    public final int A01(InterfaceC06330Uz interfaceC06330Uz, Object obj, long j) {
        Iterator it = ((C0VC) A06(interfaceC06330Uz)).A00.iterator();
        while (it.hasNext()) {
            C0VB c0vb = (C0VB) it.next();
            if (A04(j, null, null, c0vb.A02)) {
                if (((Random) this.A01.get()).nextInt(c0vb.A00) == 0) {
                    return c0vb.A01;
                }
                return -101;
            }
        }
        return -100;
    }

    @Override // X.AbstractC06400Vg
    public final boolean A03() {
        return true;
    }

    @Override // X.AbstractC06400Vg
    public final boolean A04(long j, Object obj, Object obj2, long j2) {
        if (((int) (j >> 32)) != ((int) (j2 >> 32))) {
            return false;
        }
        int i = (int) j;
        int i2 = (int) j2;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        return true;
    }

    @Override // X.C0V9
    public final String ACd(long j) {
        StringBuilder sb;
        String str;
        int i = (int) (j >> 32);
        if (i == 0) {
            sb = new StringBuilder();
            str = "";
        } else {
            sb = new StringBuilder();
            String str2 = (String) this.A00.get(Integer.valueOf(i));
            if (str2 == null) {
                str2 = "?";
            }
            sb.append(str2);
            str = ":";
        }
        sb.append(str);
        sb.append((int) j);
        return sb.toString();
    }

    @Override // X.AbstractC19070wo
    public final /* bridge */ /* synthetic */ Object A05(InterfaceC06330Uz interfaceC06330Uz) {
        int[] traceConfigIdxs = interfaceC06330Uz.getTraceConfigIdxs("startup", "start");
        C0VC c0vc = new C0VC();
        ArrayList arrayList = new ArrayList(traceConfigIdxs.length);
        for (int i : traceConfigIdxs) {
            C0VB c0vb = new C0VB();
            if (!interfaceC06330Uz.optTraceConfigParamBool(i, "trace_config.is_cold_start", false) && interfaceC06330Uz.optTraceConfigParamBool(i, "trace_config.is_black_box", false)) {
                c0vb.A01 = i;
                String optTraceConfigParamString = interfaceC06330Uz.optTraceConfigParamString(i, "trace_config.blackbox_type", "");
                if (optTraceConfigParamString == null) {
                    optTraceConfigParamString = "";
                }
                c0vb.A02 = interfaceC06330Uz.optTraceConfigTriggerParamInt(i, "qpl", "stop", "trigger.qpl.marker", 0) | (optTraceConfigParamString.hashCode() << 32);
                c0vb.A03 = optTraceConfigParamString;
                c0vb.A00 = interfaceC06330Uz.getTraceConfigParamInt(i, "trace_config.coinflip_sample_rate");
                arrayList.add(c0vb);
            }
        }
        c0vc.A00 = arrayList;
        Map map = this.A00;
        map.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0VB c0vb2 = (C0VB) it.next();
            int i2 = (int) (c0vb2.A02 >> 32);
            String str = c0vb2.A03;
            Integer valueOf = Integer.valueOf(i2);
            if (!map.containsKey(valueOf)) {
                map.put(valueOf, str);
            } else if (!str.equals(map.get(valueOf))) {
                android.util.Log.w("Profilo", AnonymousClass001.A0u("Blackbox type collision: ", str, " and ", (String) map.get(valueOf)));
            }
        }
        return c0vc;
    }
}
