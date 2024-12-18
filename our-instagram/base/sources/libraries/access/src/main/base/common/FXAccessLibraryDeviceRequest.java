package libraries.access.src.main.base.common;

import X.C55344OhA;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class FXAccessLibraryDeviceRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(90);
    public final List A00;

    public FXAccessLibraryDeviceRequest(List list) {
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.A00);
    }

    public FXAccessLibraryDeviceRequest(Parcel parcel) {
        ArrayList createTypedArrayList = parcel.createTypedArrayList(FXAccessLibraryDeviceRequestItem.CREATOR);
        if (createTypedArrayList != null) {
            this.A00 = createTypedArrayList;
            return;
        }
        throw new ParcelFormatException("Did not find expected field");
    }
}
