package com.facebook.mobileconfig;

import X.C09270dc;
import X.C0K8;
import X.C72779Xmy;
import X.YKO;
import android.os.ParcelFileDescriptor;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.HashSet;

/* loaded from: classes.dex */
public class MobileConfigSharedMemory {
    public static String TAG = "MobileConfigSharedMemory";
    public static final ReferenceQueue mBufferQueue;
    public static final HashSet references;

    public static native int closeMemoryFile(int i);

    public static native int closeMemoryMap(long j, int i);

    public static native Object createByteBufferFromMap(long j, int i);

    public static native int createNewSharedMemoryRegion(int i, String str);

    public static native long memoryMapRegion(int i, int i2);

    public static synchronized void cleanupUnusedBuffers() {
        synchronized (MobileConfigSharedMemory.class) {
            while (true) {
                Reference poll = mBufferQueue.poll();
                if (poll != null) {
                    YKO yko = (YKO) poll;
                    references.remove(yko);
                    int i = yko.A00;
                    long j = yko.A02;
                    int i2 = yko.A01;
                    String str = yko.A03;
                    if (!closeMemoryResources(i, j, i2, str)) {
                        C0K8.A0O(TAG, "Failed to close memory resources %d %s", Integer.valueOf(i), str);
                    }
                    poll.clear();
                }
            }
        }
    }

    public static C72779Xmy fromFd(ParcelFileDescriptor parcelFileDescriptor, int i, String str) {
        if (parcelFileDescriptor == null) {
            return null;
        }
        return new C72779Xmy(parcelFileDescriptor.detachFd(), i, str);
    }

    public static synchronized ByteBuffer getByteBuffer(C72779Xmy c72779Xmy) {
        ByteBuffer byteBuffer;
        synchronized (MobileConfigSharedMemory.class) {
            byteBuffer = null;
            if (c72779Xmy == null) {
                C0K8.A0C(TAG, "Failed to create buffer. Invalid memory info");
            } else if (c72779Xmy.A00 > 0) {
                C0K8.A0C(TAG, "Failed to create buffer. Buffer already created for shared memory region");
            } else {
                int i = c72779Xmy.A02;
                int i2 = c72779Xmy.A01;
                long memoryMapRegion = memoryMapRegion(i, i2);
                if (memoryMapRegion < 0) {
                    C0K8.A0O(TAG, "Failed to create memory region for shared memory %d %s", Integer.valueOf(i2), c72779Xmy.A03);
                } else {
                    c72779Xmy.A00 = memoryMapRegion;
                    byteBuffer = (ByteBuffer) createByteBufferFromMap(memoryMapRegion, i);
                    references.add(new YKO(c72779Xmy.A03, mBufferQueue, byteBuffer, i2, i, c72779Xmy.A00));
                }
            }
        }
        return byteBuffer;
    }

    public static ParcelFileDescriptor getParcelFileDescriptor(C72779Xmy c72779Xmy) {
        if (c72779Xmy == null) {
            return null;
        }
        return ParcelFileDescriptor.fromFd(c72779Xmy.A01);
    }

    static {
        C09270dc.A03("mobileconfig-jni");
        mBufferQueue = new ReferenceQueue();
        references = new HashSet();
    }

    public static boolean closeMemoryResources(int i, long j, int i2, String str) {
        String str2;
        Object[] objArr;
        String str3;
        int closeMemoryMap = closeMemoryMap(j, i2);
        if (closeMemoryMap != 0) {
            str2 = TAG;
            objArr = new Object[]{Integer.valueOf(i), str, Integer.valueOf(closeMemoryMap)};
            str3 = "Failed to close mmap %d %s result: %d";
        } else {
            int closeMemoryFile = closeMemoryFile(i);
            if (closeMemoryFile == 0) {
                return true;
            }
            str2 = TAG;
            objArr = new Object[]{Integer.valueOf(i), str, Integer.valueOf(closeMemoryFile)};
            str3 = "Failed to close file %d %s result: %d";
        }
        C0K8.A0O(str2, str3, objArr);
        return false;
    }

    public static C72779Xmy createSharedMemory(int i, String str) {
        int createNewSharedMemoryRegion = createNewSharedMemoryRegion(i, str);
        if (createNewSharedMemoryRegion < 0) {
            C0K8.A0O(TAG, "Failed to create shared memory region %s Error: %d", str, Integer.valueOf(createNewSharedMemoryRegion));
            return null;
        }
        return new C72779Xmy(createNewSharedMemoryRegion, i, str);
    }
}
