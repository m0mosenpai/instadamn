package com.facebook.cameracore.util.memory;

import X.APM;
import X.AbstractC111324zv;
import X.C0K8;
import X.C14360o3;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory;
import android.system.OsConstants;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class VersionedSharedMemory implements Parcelable {
    public static final APM CREATOR = new Object();
    public static final Class TAG = VersionedSharedMemory.class;
    public static volatile boolean isLibraryLoaded;
    public final SharedMemory androidSharedMemory;
    public long bufferPtr;
    public final int fd;
    public final String name;
    public final int size;

    public VersionedSharedMemory(int i, SharedMemory sharedMemory, int i2, String str) {
        C14360o3.A0B(str, 4);
        this.fd = i;
        this.androidSharedMemory = sharedMemory;
        this.size = i2;
        this.name = str;
        this.bufferPtr = -1L;
        APM.A00(CREATOR);
    }

    public static final native int closeMemoryFile(int i);

    public static final native int closeMemoryMap(long j, int i);

    public static final native Object createByteBufferFromMap(long j, int i);

    public static final native int createNewSharedMemoryRegion(String str, int i);

    public static final native int getSharedMemoryRegionSize(int i);

    public static final native long memoryMapRegion(int i, int i2, int i3);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.androidSharedMemory, i);
        parcel.writeString(this.name);
    }

    public static final Class getTAG() {
        return TAG;
    }

    private final ByteBuffer map(int i) {
        if (this.bufferPtr > 0) {
            C0K8.A02(TAG, "Failed to create buffer. Buffer already created for shared memory region");
            return null;
        }
        long memoryMapRegion = memoryMapRegion(this.fd, this.size, i);
        if (memoryMapRegion < 0) {
            C0K8.A09(TAG, "Failed to create memory region for shared memory %d %s", Integer.valueOf(this.fd), this.name);
            return null;
        }
        this.bufferPtr = memoryMapRegion;
        Object createByteBufferFromMap = createByteBufferFromMap(memoryMapRegion, this.size);
        C14360o3.A0C(createByteBufferFromMap, AbstractC111324zv.A00(1148));
        return (ByteBuffer) createByteBufferFromMap;
    }

    public final void close() {
        SharedMemory sharedMemory = this.androidSharedMemory;
        if (sharedMemory != null) {
            sharedMemory.close();
            return;
        }
        int closeMemoryFile = closeMemoryFile(this.fd);
        if (closeMemoryFile == 0) {
            return;
        }
        C0K8.A09(TAG, "Failed to close file %d %s result: %d", Integer.valueOf(this.fd), this.name, Integer.valueOf(closeMemoryFile));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        SharedMemory sharedMemory = this.androidSharedMemory;
        if (sharedMemory != null) {
            return sharedMemory.describeContents();
        }
        return 1;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSize() {
        return this.size;
    }

    public final ByteBuffer mapReadOnly() {
        SharedMemory sharedMemory = this.androidSharedMemory;
        if (sharedMemory != null) {
            return sharedMemory.mapReadOnly();
        }
        return map(OsConstants.PROT_READ);
    }

    public final ByteBuffer mapReadWrite() {
        SharedMemory sharedMemory = this.androidSharedMemory;
        if (sharedMemory != null) {
            return sharedMemory.mapReadWrite();
        }
        return map(OsConstants.PROT_READ | OsConstants.PROT_WRITE);
    }

    public final void unmap(ByteBuffer byteBuffer) {
        if (this.androidSharedMemory != null) {
            if (byteBuffer != null) {
                SharedMemory.unmap(byteBuffer);
                return;
            }
            return;
        }
        long j = this.bufferPtr;
        if (j < 0) {
            return;
        }
        int closeMemoryMap = closeMemoryMap(j, this.size);
        this.bufferPtr = -1L;
        if (closeMemoryMap == 0) {
            return;
        }
        C0K8.A09(TAG, "Failed to close mmap %d %s result: %d", Integer.valueOf(this.fd), this.name, Integer.valueOf(closeMemoryMap));
    }
}
