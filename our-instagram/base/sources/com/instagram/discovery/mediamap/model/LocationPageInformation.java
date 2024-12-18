package com.instagram.discovery.mediamap.model;

import X.AbstractC37302Gc3;
import X.AbstractC38851rI;
import X.C14360o3;
import X.C68757Vba;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import com.instagram.user.model.User;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class LocationPageInformation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(61);
    public String A08 = null;
    public String A09 = null;
    public String A0A = null;
    public String A06 = null;
    public Integer A03 = null;
    public String A05 = null;
    public String A07 = null;
    public Integer A04 = null;
    public String A0B = null;
    public LocationPageInfoPageOperationHourResponse A01 = null;
    public C68757Vba A00 = null;
    public boolean A0C = false;
    public Integer A02 = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        User user;
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A06);
        int i2 = -1;
        parcel.writeInt(AbstractC37302Gc3.A02(this.A03));
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeInt(AbstractC37302Gc3.A02(this.A04));
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A01, i);
        C68757Vba c68757Vba = this.A00;
        String str = null;
        if (c68757Vba != null && (user = c68757Vba.A00) != null) {
            try {
                Parcelable.Creator creator = User.CREATOR;
                str = AbstractC38851rI.A07(user);
            } catch (IOException unused) {
            }
        }
        parcel.writeString(str);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        Integer num = this.A02;
        if (num != null) {
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
    }

    public final User A00() {
        C68757Vba c68757Vba = this.A00;
        if (c68757Vba != null) {
            return c68757Vba.A00;
        }
        return null;
    }
}
