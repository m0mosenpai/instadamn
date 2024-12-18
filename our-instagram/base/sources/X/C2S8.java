package X;

/* renamed from: X.2S8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2S8 {
    public final C2S9 A00 = new C2S9();

    public final void A00() {
        InterfaceC19610xo ARD = this.A00.A00.ARD();
        ARD.AHW();
        ARD.apply();
    }

    public final void A01(C2SE c2se) {
        String str;
        C2S9 c2s9 = this.A00;
        if (c2se.A09 != null) {
            if (c2se.A07 != null) {
                InterfaceC19610xo ARD = c2s9.A00.ARD();
                ARD.E7D("version", 1);
                ARD.E7K("uid", c2se.A0G);
                ARD.E7K("file_name", String.valueOf(c2se.A09));
                ARD.E7G("maximum_heap_size", c2se.A05);
                ARD.E7K("navigation_module", c2se.A0E);
                ARD.E77("was_ever_foregrounded", c2se.A0I);
                ARD.E77("is_backgrounded", c2se.A0H);
                ARD.E7K("dump_cause", c2se.A0C);
                ARD.E7K("dump_id", String.valueOf(c2se.A07));
                String str2 = c2se.A0B;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                ARD.E7K("dump_cause_details", str2);
                ARD.E7K("endpoint", c2se.A0D);
                CharSequence charSequence = c2se.A08;
                if (charSequence == null) {
                    str = "";
                } else {
                    str = String.valueOf(charSequence);
                }
                ARD.E7K("endpoint_history", str);
                ARD.E7K("asl_session_id", c2se.A0A);
                String str4 = c2se.A0F;
                if (str4 == null) {
                    str4 = "";
                }
                ARD.E7K("trace_id", str4);
                ARD.E7D("attempts_to_upload", c2se.A00);
                ARD.E7D("build_id", c2se.A0J);
                ARD.E7K("app_version_name", c2se.A0K);
                ARD.E7D("number_of_chunks", c2se.A02);
                ARD.E7D("current_chunk_index", c2se.A01);
                String str5 = c2se.A0L;
                if (str5 != null) {
                    str3 = str5;
                }
                ARD.E7K("report_source_ref", str3);
                ARD.E7G("dump_time_millis", c2se.A03);
                ARD.E7G("dump_uptime_millis", c2se.A04);
                ARD.E7G("oom_time_millis", c2se.A06);
                ARD.apply();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
