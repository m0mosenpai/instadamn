package com.facebook.profilo.provider.constants;

import X.C0VQ;
import X.C0f9;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.MultiBufferLogger;

/* loaded from: classes.dex */
public final class ExternalProvider extends C0VQ {
    public MultiBufferLoggerLike A00;
    public final int A01;
    public final String A02;
    public volatile int A03;

    /* loaded from: classes.dex */
    public final class MultiBufferLoggerLike {
        public MultiBufferLogger A00;

        public final int A00(int i, int i2, int i3, long j, int i4) {
            MultiBufferLogger multiBufferLogger = this.A00;
            if (multiBufferLogger == null) {
                return 0;
            }
            return multiBufferLogger.writeStandardEntry(i, i2, 0L, 0, i3, i4, j);
        }

        public final int A01(int i, int i2, int i3, String str) {
            MultiBufferLogger multiBufferLogger = this.A00;
            if (multiBufferLogger == null) {
                return 0;
            }
            return multiBufferLogger.writeBytesEntry(i, i2, i3, str);
        }
    }

    public ExternalProvider(String str) {
        super(null);
        this.A01 = ProvidersRegistry.A00.A02(str);
        this.A02 = str;
    }

    @Override // X.C0VQ
    public final boolean A06() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike, java.lang.Object] */
    public final MultiBufferLoggerLike A07() {
        if (this.A03 != 2) {
            if (this.A05) {
                MultiBufferLogger A02 = A02();
                ?? obj = new Object();
                obj.A00 = A02;
                this.A00 = obj;
                this.A03 = 2;
            } else if (this.A03 == 0) {
                ?? obj2 = new Object();
                obj2.A00 = null;
                this.A00 = obj2;
                this.A03 = 1;
            }
        }
        return this.A00;
    }

    @Override // X.C0VQ
    public final int getSupportedProviders() {
        return this.A01;
    }

    @Override // X.C0VQ
    public final int getTracingProviders() {
        return this.A01 & TraceEvents.sProviders;
    }

    @Override // X.C0VQ
    public final void disable() {
        C0f9.A0A(1916978890, C0f9.A03(1185053069));
    }

    @Override // X.C0VQ
    public final void enable() {
        C0f9.A0A(863822343, C0f9.A03(-1882151981));
    }
}
