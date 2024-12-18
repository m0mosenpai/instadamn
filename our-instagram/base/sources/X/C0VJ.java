package X;

import com.facebook.profilo.ipc.TraceConfigExtras;
import com.facebook.react.bridge.BaseJavaModule;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.0VJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0VJ {
    public static final List A02 = Arrays.asList(BaseJavaModule.METHOD_TYPE_ASYNC, "atrace", "qpl", "other", "liger", "fbsystrace", "liger_http2", "system_counters", "stack_trace", "high_freq_main_thread_counters", "transient_network_data", "frames", "main_thread_messages", "libc_io", "memory_allocation", "class_load");
    public final TraceConfigExtras A00;
    public final List A01;

    public C0VJ(TraceConfigExtras traceConfigExtras, List list) {
        TreeMap treeMap;
        this.A01 = list == null ? A02 : list;
        TreeMap treeMap2 = new TreeMap();
        treeMap2.put("trace_config.logger_priority", 0);
        TreeMap treeMap3 = new TreeMap();
        treeMap3.put("trace_config.buffer_sizes", new int[]{30000});
        TreeMap treeMap4 = null;
        TreeMap treeMap5 = null;
        TraceConfigExtras traceConfigExtras2 = new TraceConfigExtras(treeMap2, null, treeMap3, null, null);
        if (traceConfigExtras != null) {
            if (traceConfigExtras2.A01 == null && traceConfigExtras.A01 == null) {
                TreeMap treeMap6 = traceConfigExtras2.A04;
                treeMap4 = (treeMap6 == null && traceConfigExtras.A04 == null) ? treeMap4 : new TreeMap();
                TreeMap treeMap7 = traceConfigExtras2.A02;
                treeMap5 = (treeMap7 == null && traceConfigExtras.A02 == null) ? treeMap5 : new TreeMap();
                TreeMap treeMap8 = traceConfigExtras2.A03;
                if (treeMap8 == null && traceConfigExtras.A03 == null) {
                    treeMap = null;
                } else {
                    treeMap = new TreeMap();
                }
                TreeMap treeMap9 = traceConfigExtras2.A05;
                TreeMap treeMap10 = (treeMap9 == null && traceConfigExtras.A05 == null) ? null : new TreeMap();
                TreeMap treeMap11 = traceConfigExtras2.A06;
                TreeMap treeMap12 = (treeMap11 == null && traceConfigExtras.A05 == null) ? null : new TreeMap();
                if (treeMap6 != null) {
                    treeMap4.putAll(treeMap6);
                }
                TreeMap treeMap13 = traceConfigExtras.A04;
                if (treeMap13 != null) {
                    treeMap4.putAll(treeMap13);
                }
                if (treeMap7 != null) {
                    treeMap5.putAll(treeMap7);
                }
                TreeMap treeMap14 = traceConfigExtras.A02;
                if (treeMap14 != null) {
                    treeMap5.putAll(treeMap14);
                }
                if (treeMap8 != null) {
                    treeMap.putAll(treeMap8);
                }
                TreeMap treeMap15 = traceConfigExtras.A03;
                if (treeMap15 != null) {
                    treeMap.putAll(treeMap15);
                }
                if (treeMap9 != null) {
                    treeMap10.putAll(treeMap9);
                }
                TreeMap treeMap16 = traceConfigExtras.A05;
                if (treeMap16 != null) {
                    treeMap10.putAll(treeMap16);
                }
                if (treeMap11 != null) {
                    treeMap12.putAll(treeMap11);
                }
                TreeMap treeMap17 = traceConfigExtras.A06;
                if (treeMap17 != null) {
                    treeMap12.putAll(treeMap17);
                }
                traceConfigExtras2 = new TraceConfigExtras(treeMap4, treeMap5, treeMap, treeMap10, treeMap12);
            } else {
                throw new IllegalStateException("One or both extras are configuration backed");
            }
        }
        this.A00 = traceConfigExtras2;
    }
}
