package X;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;

/* loaded from: classes4.dex */
public final class APM implements Parcelable.Creator {
    public static final synchronized void A00(APM apm) {
        synchronized (apm) {
            if (!VersionedSharedMemory.isLibraryLoaded) {
                C09170dP.A0C("arfx-memory-jni");
                VersionedSharedMemory.isLibraryLoaded = true;
            }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object readParcelable;
        C14360o3.A0B(parcel, 0);
        A00(this);
        String str = "";
        int i = 0;
        if (Build.VERSION.SDK_INT >= 33) {
            readParcelable = parcel.readParcelable(SharedMemory.class.getClassLoader(), SharedMemory.class);
        } else {
            readParcelable = parcel.readParcelable(SharedMemory.class.getClassLoader());
        }
        SharedMemory sharedMemory = (SharedMemory) readParcelable;
        if (sharedMemory != null) {
            i = sharedMemory.getSize();
        }
        String readString = parcel.readString();
        if (readString != null) {
            str = readString;
        }
        return new VersionedSharedMemory(-1, sharedMemory, i, str);
    }

    public final VersionedSharedMemory A01(String str, int i) {
        A00(this);
        SharedMemory create = SharedMemory.create(str, i);
        C14360o3.A07(create);
        return new VersionedSharedMemory(-1, create, i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new VersionedSharedMemory[i];
    }
}
