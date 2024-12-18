package com.meta.cal;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public abstract class AudioSessionUtils {

    /* loaded from: classes9.dex */
    public final class CppProxy extends AudioSessionUtils {
        public final AtomicBoolean destroyed = AbstractC166997dE.A17();
        public final long nativeRef;

        public static native int getModelVersion();

        private native void nativeDestroy(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw AbstractC166987dD.A18("nativeRef is zero");
        }

        public void finalize() {
            _djinni_private_destroy();
        }
    }

    public static int getModelVersion() {
        return CppProxy.getModelVersion();
    }
}
