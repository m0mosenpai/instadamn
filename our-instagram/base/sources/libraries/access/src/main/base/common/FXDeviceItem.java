package libraries.access.src.main.base.common;

import X.C55344OhA;
import X.EnumC200808uN;
import X.EnumC46133KbX;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes8.dex */
public class FXDeviceItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(92);
    public EnumC200808uN A00;
    public final Long A01;
    public final String A02;
    public final EnumC46133KbX A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            FXDeviceItem fXDeviceItem = (FXDeviceItem) obj;
            if (this.A00 == fXDeviceItem.A00) {
                String str = this.A02;
                String str2 = fXDeviceItem.A02;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                if (this.A03 == fXDeviceItem.A03) {
                    Long l = this.A01;
                    Long l2 = fXDeviceItem.A01;
                    if (l != null) {
                        return l.equals(l2);
                    }
                    if (l2 != null) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A03, this.A01});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String obj;
        long longValue;
        EnumC200808uN enumC200808uN = this.A00;
        String str = null;
        if (enumC200808uN == null) {
            obj = null;
        } else {
            obj = enumC200808uN.toString();
        }
        parcel.writeString(obj);
        EnumC46133KbX enumC46133KbX = this.A03;
        if (enumC46133KbX != null) {
            str = enumC46133KbX.toString();
        }
        parcel.writeString(str);
        parcel.writeString(this.A02);
        Long l = this.A01;
        if (l == null) {
            longValue = -1;
        } else {
            longValue = l.longValue();
        }
        parcel.writeLong(longValue);
    }

    public FXDeviceItem(Parcel parcel) {
        EnumC200808uN valueOf;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (readString == null) {
            valueOf = null;
        } else {
            valueOf = EnumC200808uN.valueOf(readString);
        }
        this.A00 = valueOf;
        this.A03 = readString2 != null ? EnumC46133KbX.valueOf(readString2) : null;
        this.A02 = parcel.readString();
        this.A01 = Long.valueOf(parcel.readLong());
    }

    public FXDeviceItem(Long l, String str, EnumC200808uN enumC200808uN, EnumC46133KbX enumC46133KbX) {
        this.A00 = enumC200808uN;
        this.A03 = enumC46133KbX;
        this.A02 = str;
        this.A01 = l;
    }
}
