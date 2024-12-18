package com.facebook.profilo.provider.device_info;

import X.AbstractC04090Ka;
import X.AbstractC19980yS;
import X.AnonymousClass001;
import X.C04100Kb;
import X.C20020yW;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import java.io.File;

/* loaded from: classes.dex */
public final class DeviceInfoProvider extends AbstractC19980yS {
    public final Context A00;

    public DeviceInfoProvider(Context context) {
        super(null);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null && (context instanceof Application)) {
            this.A00 = context;
        } else {
            this.A00 = applicationContext;
        }
    }

    public static void A00(Buffer buffer, int i, long j) {
        BufferLogger.writeStandardEntry(buffer, 6, 52, 0L, 0, i, 0, j);
    }

    public static void A01(Buffer buffer, String str, String str2, int i) {
        BufferLogger.writeBytesEntry(buffer, 0, 57, BufferLogger.writeBytesEntry(buffer, 0, 56, BufferLogger.writeStandardEntry(buffer, 6, 52, 0L, 0, i, 0, 0L), str), str2);
    }

    @Override // X.AbstractC19980yS
    public final void logOnTraceEnd(TraceContext traceContext, C20020yW c20020yW) {
        long j;
        Buffer buffer = traceContext.A09;
        A01(buffer, "os_ver", Build.VERSION.RELEASE, 8126483);
        A01(buffer, "device_type", Build.MODEL, 8126478);
        A01(buffer, "brand", Build.BRAND, 8126479);
        A01(buffer, "manufacturer", Build.MANUFACTURER, 8126480);
        Context context = this.A00;
        A01(buffer, "year_class", Integer.toString(C04100Kb.A00(context)), 8126481);
        A01(buffer, "os_sdk", Integer.toString(Build.VERSION.SDK_INT), 8126537);
        A00(buffer, 8126503, AbstractC04090Ka.A00());
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        A00(buffer, 8126502, memoryInfo.totalMem);
        try {
            A01(buffer, "Kernel version", System.getProperty("os.version", "undefined"), 8126527);
        } catch (SecurityException e) {
            Log.w("Profilo/DeviceInfo", AnonymousClass001.A0R("SecurityException: ", e.getMessage()));
        }
        if (new File("/proc/sys/kernel/perf_event_paranoid").exists()) {
            j = 1;
        } else {
            j = 0;
        }
        A00(buffer, 8126490, j);
    }

    static {
        ProvidersRegistry.A00.A02("device_info");
    }
}
