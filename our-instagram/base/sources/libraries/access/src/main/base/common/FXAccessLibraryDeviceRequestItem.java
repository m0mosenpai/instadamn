package libraries.access.src.main.base.common;

import X.C55344OhA;
import X.EnumC200808uN;
import X.EnumC46133KbX;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public class FXAccessLibraryDeviceRequestItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(91);
    public final EnumC200808uN A00;
    public final EnumC46133KbX A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00.toString());
        parcel.writeString(this.A01.toString());
        parcel.writeString(this.A02);
    }

    public FXAccessLibraryDeviceRequestItem(Parcel parcel) {
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (readString != null && readString2 != null && readString3 != null) {
            this.A00 = EnumC200808uN.valueOf(readString);
            this.A01 = EnumC46133KbX.valueOf(readString2);
            this.A02 = readString3;
            return;
        }
        throw new ParcelFormatException("Did not find expected field");
    }

    public FXAccessLibraryDeviceRequestItem(EnumC200808uN enumC200808uN, EnumC46133KbX enumC46133KbX) {
        this.A00 = enumC200808uN;
        this.A01 = enumC46133KbX;
        this.A02 = "";
    }
}
