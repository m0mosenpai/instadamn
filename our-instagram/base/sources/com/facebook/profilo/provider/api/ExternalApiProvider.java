package com.facebook.profilo.provider.api;

import X.AnonymousClass001;
import X.C0VQ;
import X.C0f9;
import X.C20020yW;
import android.util.Log;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;

/* loaded from: classes.dex */
public final class ExternalApiProvider extends C0VQ {
    public static final int PROVIDERS_MASK;
    public static final ExternalProvider[] PROVIDERS_TO_REGISTER;

    static {
        int i = 0;
        ExternalProvider[] externalProviderArr = {ExternalProviders.A00, ExternalProviders.A01};
        PROVIDERS_TO_REGISTER = externalProviderArr;
        int i2 = 0;
        do {
            i2 |= externalProviderArr[i].A01;
            i++;
        } while (i < 2);
        PROVIDERS_MASK = i2;
    }

    public static native void addLogger(String str, MultiBufferLogger multiBufferLogger);

    @Override // X.C0VQ
    public int getSupportedProviders() {
        return PROVIDERS_MASK;
    }

    @Override // X.C0VQ
    public int getTracingProviders() {
        return PROVIDERS_MASK & TraceEvents.sProviders;
    }

    public ExternalApiProvider() {
        super("profilo_apiimpl");
        A03();
    }

    @Override // X.C0VQ
    public void disable() {
        C0f9.A0A(-454096347, C0f9.A03(-2142347049));
    }

    @Override // X.C0VQ
    public void enable() {
        C0f9.A0A(-1163784042, C0f9.A03(-1353531035));
    }

    @Override // X.C0VQ
    public void onTraceStarted(TraceContext traceContext, C20020yW c20020yW) {
        int A03 = C0f9.A03(-1673852710);
        ExternalProvider[] externalProviderArr = PROVIDERS_TO_REGISTER;
        int i = 0;
        do {
            ExternalProvider externalProvider = externalProviderArr[i];
            if ((traceContext.A02 & externalProvider.A01) != 0) {
                MultiBufferLogger multiBufferLogger = externalProvider.A07().A00;
                if (multiBufferLogger == null) {
                    Log.w("Profilo/ExternalApi", AnonymousClass001.A0g("logger for ", externalProvider.A02, " is null, is that provider initialized before ExternalApiProvider?"));
                } else {
                    addLogger(externalProvider.A02, multiBufferLogger);
                }
            }
            i++;
        } while (i < 2);
        C0f9.A0A(-2114073775, A03);
    }
}
