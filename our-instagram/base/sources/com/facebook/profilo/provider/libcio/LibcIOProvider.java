package com.facebook.profilo.provider.libcio;

import X.C0VQ;
import X.C0f9;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.MultiBufferLogger;

/* loaded from: classes.dex */
public final class LibcIOProvider extends C0VQ {
    public static final int PROVIDER_LIBC_IO = ProvidersRegistry.A00.A02("libc_io");

    public native void nativeCleanup();

    public native void nativeInitialize(MultiBufferLogger multiBufferLogger);

    public native boolean nativeIsTracingEnabled();

    @Override // X.C0VQ
    public int getSupportedProviders() {
        return PROVIDER_LIBC_IO;
    }

    public LibcIOProvider() {
        super("profilo_libcio");
    }

    @Override // X.C0VQ
    public void disable() {
        int A03 = C0f9.A03(-50977711);
        nativeCleanup();
        C0f9.A0A(-1560096535, A03);
    }

    @Override // X.C0VQ
    public void enable() {
        int A03 = C0f9.A03(1483191554);
        nativeInitialize(A02());
        C0f9.A0A(25905291, A03);
    }

    @Override // X.C0VQ
    public int getTracingProviders() {
        if (nativeIsTracingEnabled()) {
            return PROVIDER_LIBC_IO;
        }
        return 0;
    }
}
