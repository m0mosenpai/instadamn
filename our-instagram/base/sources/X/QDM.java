package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class QDM extends SN2 {
    public String A04;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String[] A0D;
    public String[] A0E;
    public long A02 = -1;
    public long A01 = -1;
    public long A00 = -1;
    public long A03 = -1;
    public String A05 = null;

    @Override // X.SN2
    public final void A00(JSONObject jSONObject) {
        super.A00(jSONObject);
        try {
            if (this.A08 != null) {
                JSONArray A0p = AbstractC31171DnF.A0p();
                for (String str : this.A08.split("\n")) {
                    A0p.put(str);
                }
                jSONObject.put("native_stack_trace", A0p);
            }
            if (this.A0A != null) {
                JSONArray A0p2 = AbstractC31171DnF.A0p();
                for (String str2 : this.A0A.split("\n")) {
                    A0p2.put(str2);
                }
                jSONObject.put("render_thread_native_stack_trace", A0p2);
            }
            Object obj = this.A0B;
            if (obj != null) {
                jSONObject.put("render_thread_sched_stat", obj);
            }
            Object obj2 = this.A09;
            if (obj2 != null) {
                jSONObject.put("render_thread_cpu_usage", obj2);
            }
            Object obj3 = this.A07;
            if (obj3 != null) {
                jSONObject.put("litho_layout_thread_name", obj3);
            }
            if (this.A0D != null) {
                JSONArray A0p3 = AbstractC31171DnF.A0p();
                for (String str3 : this.A0D) {
                    A0p3.put(str3);
                }
                jSONObject.put("litho_layout_thread_stack", A0p3);
            }
            Object obj4 = this.A06;
            if (obj4 != null) {
                jSONObject.put("memory_red_java", obj4);
            }
            Object obj5 = this.A0C;
            if (obj5 != null) {
                jSONObject.put("memory_red_system", obj5);
            }
            Object obj6 = this.A04;
            if (obj6 != null) {
                jSONObject.put("memory_red_address_space", obj6);
            }
            long j = this.A02;
            if (j != -1) {
                jSONObject.put("swap_total", j);
            }
            long j2 = this.A01;
            if (j2 != -1) {
                jSONObject.put("swap_free", j2);
            }
            long j3 = this.A00;
            if (j3 != -1) {
                jSONObject.put("swap_cached", j3);
            }
            long j4 = this.A03;
            if (j4 != -1) {
                jSONObject.put("vm_swap", j4);
            }
            if (this.A0E != null) {
                JSONArray A0p4 = AbstractC31171DnF.A0p();
                for (String str4 : this.A0E) {
                    if (str4 != null) {
                        A0p4.put(str4);
                    }
                }
                jSONObject.put("memory_pressure", A0p4);
            }
            Object obj7 = this.A05;
            if (obj7 != null) {
                jSONObject.put("endpoint", obj7);
            }
        } catch (Throwable unused) {
        }
    }
}
