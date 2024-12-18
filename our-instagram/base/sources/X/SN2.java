package X;

import android.os.Debug;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class SN2 {
    public long A01;
    public long A02;
    public long A04;
    public long A06;
    public String A0A;
    public String A0B;
    public String A0C;
    public List A0D;
    public Map A0E;
    public long A05 = 0;
    public long A08 = -1;
    public long A03 = -1;
    public long A07 = -1;
    public int A00 = -1;
    public Debug.MemoryInfo A09 = null;

    public void A00(JSONObject jSONObject) {
        try {
            int i = this.A00;
            if (i != -1) {
                jSONObject.put("queuing_msg_count", i);
            }
            Object obj = this.A0B;
            if (obj != null) {
                jSONObject.put("thread_cpu_usage", obj);
            }
            Object obj2 = this.A0A;
            if (obj2 != null) {
                jSONObject.put("proc_cpu_usage", obj2);
            }
            if (this.A0D != null) {
                JSONArray A0p = AbstractC31171DnF.A0p();
                Iterator it = this.A0D.iterator();
                while (it.hasNext()) {
                    A0p.put(AbstractC166987dD.A1B(it));
                }
                jSONObject.put("whole_cpu_usage", A0p);
            }
            Object obj3 = this.A0C;
            if (obj3 != null) {
                jSONObject.put("thread_sched_stat", obj3);
            }
            if (this.A05 > 0) {
                boolean z = false;
                long j = this.A04;
                if (j != 0) {
                    jSONObject.put("gc_count", j);
                    jSONObject.put("gc_time", this.A06);
                    z = true;
                }
                long j2 = this.A01;
                if (j2 != 0) {
                    jSONObject.put("blocking_gc_count", j2);
                    jSONObject.put("blocking_gc_time", this.A02);
                } else if (z) {
                }
                jSONObject.put("gc_monitor_interval", this.A05);
            }
            if (this.A08 != -1) {
                jSONObject.put("max_java_heap_size", this.A07);
                jSONObject.put("current_java_heap_size", this.A08);
                jSONObject.put("available_java_heap", this.A03);
                jSONObject.put("total_available_java_heap", (this.A07 - this.A08) + this.A03);
                long j3 = this.A08;
                jSONObject.put("java_heap_usage_percentage", ((j3 - this.A03) * 100) / j3);
            }
            if (this.A0E != null) {
                JSONObject A0q = AbstractC31171DnF.A0q();
                Iterator A12 = AbstractC43593JPy.A12(this.A0E);
                while (A12.hasNext()) {
                    InterfaceC100084eW interfaceC100084eW = (InterfaceC100084eW) A12.next();
                    A0q.put(interfaceC100084eW.getName(), this.A0E.get(interfaceC100084eW));
                }
                jSONObject.put("monitor_duration", A0q);
            }
            if (this.A09 != null) {
                JSONObject A0q2 = AbstractC31171DnF.A0q();
                Iterator A15 = AbstractC166997dE.A15(this.A09.getMemoryStats());
                while (A15.hasNext()) {
                    AbstractC50523MSb.A1T(A15, A0q2);
                }
                jSONObject.put("meminfo", A0q2);
            }
        } catch (Throwable unused) {
        }
    }
}
