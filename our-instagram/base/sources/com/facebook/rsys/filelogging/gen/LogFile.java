package com.facebook.rsys.filelogging.gen;

import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes9.dex */
public abstract class LogFile {
    public static C2N9 CONVERTER = C55648OnZ.A00(31);

    /* loaded from: classes9.dex */
    public final class CProxy extends LogFile {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native LogFile createFromMcfType(McfReference mcfReference);

        public static native LogFile createLogFile(String str, int i, String str2);

        public static native LogFileStats createLogFileStats(String str);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.filelogging.gen.LogFile
        public native LogFileData createFileData();

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof LogFile)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract LogFileData createFileData();
}
