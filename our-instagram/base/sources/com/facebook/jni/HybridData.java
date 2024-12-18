package com.facebook.jni;

import X.AbstractC05860Sr;
import X.C09270dc;

/* loaded from: classes.dex */
public class HybridData {
    public static final HybridData $redex_init_class = null;
    public final Destructor mDestructor = new AbstractC05860Sr(this);

    /* loaded from: classes.dex */
    public class Destructor extends AbstractC05860Sr {
        public volatile long mNativePointer;

        public static native void deleteNative(long j);

        @Override // X.AbstractC05860Sr
        public final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0L;
        }

        public Destructor(Object obj) {
            super(obj);
        }
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }

    public boolean isValid() {
        if (this.mDestructor.mNativePointer == 0) {
            return false;
        }
        return true;
    }

    static {
        C09270dc.A03("fbjni");
    }
}
