package com.facebook.profilo.provider.mappings;

import X.C0VQ;
import X.C0f9;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.MultiBufferLogger;

/* loaded from: classes.dex */
public final class MemoryMappingsProvider extends C0VQ {
    public static final int PROVIDER_MAPPINGS = ProvidersRegistry.A00.A02("memory_mappings");

    public static native void nativeLogMappings(MultiBufferLogger multiBufferLogger);

    @Override // X.C0VQ
    public int getSupportedProviders() {
        return PROVIDER_MAPPINGS;
    }

    @Override // X.C0VQ
    public int getTracingProviders() {
        return PROVIDER_MAPPINGS;
    }

    public MemoryMappingsProvider() {
        super("profilo_mappings");
    }

    @Override // X.C0VQ
    public void disable() {
        int A03 = C0f9.A03(-885041157);
        nativeLogMappings(A02());
        C0f9.A0A(2064528385, A03);
    }

    @Override // X.C0VQ
    public void enable() {
        C0f9.A0A(-704850538, C0f9.A03(-1170798414));
    }
}
