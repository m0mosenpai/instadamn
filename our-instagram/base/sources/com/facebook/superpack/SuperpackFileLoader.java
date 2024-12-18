package com.facebook.superpack;

import X.AbstractC09200dV;
import X.InterfaceC09130dL;
import com.facebook.breakpad.BreakpadManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class SuperpackFileLoader implements InterfaceC09130dL {
    public static boolean sLoadedSuperpack;
    public final Runtime mRuntime = Runtime.getRuntime();
    public static final String[] COMPRESSION_EXTENSIONS = {".lz4", ".zst", ".xz", ".zstd", ".br", ".spo"};
    public static final Map sPendingMappings = Collections.synchronizedMap(new HashMap());
    public static final Set HOLDOUT_LIBRARIES = new HashSet(Arrays.asList("libliger.so"));
    public static final String[] SIGMUX_LIB = {"libdistractmerged.so", "libsigmux.so"};
    public static final String[] SIGMUX_SOLOADER_LIB = {"distractmerged", "sigmux"};

    public static native boolean canLoadInMemoryNative();

    public static native MappingInfo[] loadBytesNative(String str, byte[] bArr);

    public static native MappingInfo[] loadFdNative(String str, int i, long j, long j2);

    public static native void loadFileNative(String str);

    /* loaded from: classes.dex */
    public class MappingInfo {
        public final byte[] buildId;
        public final long fileOffset;
        public final long mappingSize;
        public final String name;
        public final long startAddress;

        public MappingInfo(String str, byte[] bArr, long j, long j2, long j3) {
            this.name = str;
            this.buildId = bArr;
            this.startAddress = j;
            this.mappingSize = j2;
            this.fileOffset = j3;
        }
    }

    @Override // X.InterfaceC09130dL
    public void load(String str, int i) {
        if (sLoadedSuperpack) {
            try {
                loadFileNative(str);
            } catch (UnsatisfiedLinkError e) {
                if (!(!str.endsWith(".so"))) {
                    System.load(str);
                } else {
                    throw e;
                }
            }
            if (BreakpadManager.initialized) {
                Map map = sPendingMappings;
                if (!map.isEmpty()) {
                    ArrayList arrayList = new ArrayList(map.size());
                    synchronized (map) {
                        Iterator it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            arrayList.add((MappingInfo) ((Map.Entry) it.next()).getValue());
                            it.remove();
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        MappingInfo mappingInfo = (MappingInfo) it2.next();
                        String str2 = mappingInfo.name;
                        byte[] bArr = mappingInfo.buildId;
                        BreakpadManager.addMappingInfo(str2, bArr, bArr.length, mappingInfo.startAddress, mappingInfo.mappingSize, mappingInfo.fileOffset);
                    }
                    return;
                }
                return;
            }
            return;
        }
        System.load(str);
        if (str.regionMatches(str.lastIndexOf(File.separatorChar) + 1, "libsuperpack-jni.so", 0, 19)) {
            sLoadedSuperpack = true;
        }
    }

    public SuperpackFileLoader() {
        AbstractC09200dV.A02();
    }
}
