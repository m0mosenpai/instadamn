package com.facebook.profilo.logger.api;

import com.facebook.common.dextricks.classid.ClassId;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.api.ProfiloLogger;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;

/* loaded from: classes.dex */
public final class ProfiloLogger {
    public static volatile boolean A00;

    public static int A00(int i, String str, String str2) {
        if (A00) {
            ExternalProvider externalProvider = ExternalProviders.A03;
            return externalProvider.A07().A01(0, 57, externalProvider.A07().A01(0, 56, i, str), str2);
        }
        return -1;
    }

    public static int classLoadEnd(Class cls) {
        if (A00) {
            ExternalProvider externalProvider = ExternalProviders.A00;
            if ((externalProvider.A01 & TraceEvents.sProviders) != 0 && ClassId.sInitialized) {
                return externalProvider.A07().A00(6, 81, 0, ClassId.getClassId(cls), 0);
            }
            return -1;
        }
        return -1;
    }

    public static int classLoadFailed() {
        if (A00) {
            ExternalProvider externalProvider = ExternalProviders.A00;
            if ((externalProvider.A01 & TraceEvents.sProviders) != 0 && ClassId.sInitialized) {
                return externalProvider.A07().A00(6, 82, 0, 0L, 0);
            }
            return -1;
        }
        return -1;
    }

    public static int classLoadStart() {
        if (A00) {
            ExternalProvider externalProvider = ExternalProviders.A00;
            if ((externalProvider.A01 & TraceEvents.sProviders) != 0 && ClassId.sInitialized) {
                return externalProvider.A07().A00(6, 80, 0, 0L, 0);
            }
            return -1;
        }
        return -1;
    }

    public static void installClassLoadTracer() {
        int i = 0;
        String[] strArr = {"com.facebook.profilo.core.ProvidersRegistry", "com.facebook.profilo.core.TraceEvents", "com.facebook.profilo.entries.EntryType", "com.facebook.profilo.logger.ClassLoadLogger", "com.facebook.profilo.logger.BufferLogger", "com.facebook.profilo.logger.Logger", "com.facebook.profilo.logger.MultiBufferLogger", "com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike", "com.facebook.profilo.provider.constants.ExternalProvider", "com.facebook.profilo.provider.constants.ExternalProviders"};
        do {
            try {
                Class.forName(strArr[i]);
            } catch (ClassNotFoundException unused) {
            }
            i++;
        } while (i < 10);
        ProfiloClassLoadTracer.sTracer = new ProfiloClassLoadTracer() { // from class: X.0yo
            @Override // com.facebook.profilo.logger.api.ProfiloClassLoadTracer
            public final void classLoadFailed() {
                ProfiloLogger.classLoadFailed();
            }

            @Override // com.facebook.profilo.logger.api.ProfiloClassLoadTracer
            public final void classLoadStart() {
                ProfiloLogger.classLoadStart();
            }

            @Override // com.facebook.profilo.logger.api.ProfiloClassLoadTracer
            public final void classLoadEnd(Class cls) {
                ProfiloLogger.classLoadEnd(cls);
            }
        };
    }
}
