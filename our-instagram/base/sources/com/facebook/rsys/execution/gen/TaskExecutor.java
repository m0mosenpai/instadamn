package com.facebook.rsys.execution.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class TaskExecutor {
    public static C2N9 CONVERTER = YAN.A00(50);

    /* loaded from: classes12.dex */
    public final class CProxy extends TaskExecutor {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native TaskExecutor createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.execution.gen.TaskExecutor
        public native void execute(Task task, long j);

        public native int hashCode();

        @Override // com.facebook.rsys.execution.gen.TaskExecutor
        public native boolean isCurrent();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof TaskExecutor)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void execute(Task task, long j);

    public abstract boolean isCurrent();
}
