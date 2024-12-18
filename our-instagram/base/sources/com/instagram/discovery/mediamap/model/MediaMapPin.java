package com.instagram.discovery.mediamap.model;

import X.AbstractC111024zE;
import X.AbstractC128065qa;
import X.AbstractC221915u;
import X.AbstractC38741r6;
import X.AbstractC50102Ry;
import X.AbstractC69973Vyo;
import X.C0K8;
import X.C111034zF;
import X.C120985dq;
import X.C17z;
import X.C37771pE;
import X.C38321qM;
import X.EnumC68146VDo;
import X.InterfaceC66482zP;
import X.InterfaceC72044XLa;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class MediaMapPin implements InterfaceC66482zP, Parcelable, InterfaceC72044XLa {
    public static final Parcelable.Creator CREATOR = new LNL(62);
    public int A00;
    public long A01;
    public LatLng A02;
    public C111034zF A03;
    public ImageUrl A04;
    public ImageUrl A05;
    public LocationPageInformation A06;
    public EnumC68146VDo A07;
    public C37771pE A08;
    public LocationDict A09;
    public Double A0A;
    public Double A0B;
    public String A0C;
    public String A0D;
    public ArrayList A0E;
    public boolean A0F;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MediaMapPin mediaMapPin = (MediaMapPin) obj;
            if (!AbstractC50102Ry.A00(this.A0A, mediaMapPin.A0A) || !AbstractC50102Ry.A00(this.A0B, mediaMapPin.A0B) || !AbstractC50102Ry.A00(AbstractC69973Vyo.A00(this.A09), AbstractC69973Vyo.A00(mediaMapPin.A09)) || !AbstractC50102Ry.A00(this.A0D, mediaMapPin.A0D) || !AbstractC50102Ry.A00(this.A05, mediaMapPin.A05) || !AbstractC50102Ry.A00(this.A06, mediaMapPin.A06) || !AbstractC50102Ry.A00(this.A02, mediaMapPin.A02) || !AbstractC50102Ry.A00(Long.valueOf(this.A01), Long.valueOf(mediaMapPin.A01)) || !AbstractC50102Ry.A00(Integer.valueOf(this.A00), Integer.valueOf(mediaMapPin.A00)) || !AbstractC50102Ry.A00(this.A0E, mediaMapPin.A0E) || !AbstractC50102Ry.A00(this.A0C, mediaMapPin.A0C) || !AbstractC50102Ry.A00(this.A04, mediaMapPin.A04) || !AbstractC50102Ry.A00(this.A08, mediaMapPin.A08) || !AbstractC50102Ry.A00(this.A03, mediaMapPin.A03) || !AbstractC50102Ry.A00(this.A07, mediaMapPin.A07)) {
                return false;
            }
        }
        return true;
    }

    public final ImageUrl A00() {
        C38321qM c38321qM;
        C111034zF c111034zF = this.A03;
        if (c111034zF != null && (c38321qM = c111034zF.A00) != null) {
            if (c38321qM.A1S() != null) {
                return c38321qM.A1S();
            }
            return c38321qM.A1n();
        }
        ImageUrl imageUrl = this.A04;
        if (imageUrl != null) {
            return imageUrl;
        }
        return this.A05;
    }

    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final MediaMapPin clone() {
        C120985dq c120985dq;
        Double d = this.A0A;
        Double d2 = this.A0B;
        LocationDict locationDict = this.A09;
        String str = this.A0D;
        ImageUrl imageUrl = this.A05;
        long j = this.A01;
        int i = this.A00;
        ArrayList arrayList = this.A0E;
        String str2 = this.A0C;
        ImageUrl imageUrl2 = this.A04;
        C37771pE c37771pE = this.A08;
        EnumC68146VDo enumC68146VDo = this.A07;
        LocationPageInformation locationPageInformation = this.A06;
        boolean z = this.A0F;
        C111034zF c111034zF = this.A03;
        if (c111034zF != null) {
            c120985dq = AbstractC128065qa.A02(c111034zF);
        } else {
            c120985dq = null;
        }
        return new MediaMapPin(c120985dq, imageUrl, imageUrl2, locationPageInformation, enumC68146VDo, c37771pE, locationDict, d, d2, str, str2, arrayList, i, j, z);
    }

    @Override // X.InterfaceC71945XBu
    public final LatLng Bea() {
        LatLng latLng = this.A02;
        if (latLng == null) {
            LatLng latLng2 = new LatLng(this.A0A.doubleValue(), this.A0B.doubleValue());
            this.A02 = latLng2;
            return latLng2;
        }
        return latLng;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = this.A00;
        int i2 = ((MediaMapPin) obj).A00;
        if (i == i2) {
            return 0;
        }
        if (i >= i2) {
            return 1;
        }
        return -1;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0A, this.A0B, AbstractC69973Vyo.A00(this.A09), this.A0D, this.A05, this.A06, this.A02, Long.valueOf(this.A01), Integer.valueOf(this.A00), this.A0E, this.A0C, this.A04, this.A08, this.A03, this.A07});
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC69973Vyo.A01((MediaMapPin) obj).equals(AbstractC69973Vyo.A01(this));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        double doubleValue;
        parcel.writeParcelable(this.A09, i);
        Double d = this.A0A;
        double d2 = 0.0d;
        if (d == null) {
            doubleValue = 0.0d;
        } else {
            doubleValue = d.doubleValue();
        }
        parcel.writeDouble(doubleValue);
        Double d3 = this.A0B;
        if (d3 != null) {
            d2 = d3.doubleValue();
        }
        parcel.writeDouble(d2);
        parcel.writeString(this.A0D);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeList(this.A0E);
        parcel.writeString(this.A0C);
        parcel.writeParcelable(this.A04, i);
        C37771pE c37771pE = this.A08;
        String str = null;
        if (c37771pE != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                AbstractC38741r6.A00(A0A, c37771pE);
                A0A.close();
                str = stringWriter.toString();
            } catch (IOException unused) {
            }
        }
        parcel.writeString(str);
        C111034zF c111034zF = this.A03;
        String str2 = null;
        if (c111034zF != null) {
            try {
                StringWriter stringWriter2 = new StringWriter();
                C17z A0A2 = AbstractC221915u.A00.A0A(stringWriter2);
                AbstractC111024zE.A00(A0A2, c111034zF);
                A0A2.close();
                str2 = stringWriter2.toString();
            } catch (IOException e) {
                C0K8.A0G("MediaMapPin", "failed to parcel clips item to json", e);
            }
        }
        parcel.writeString(str2);
        parcel.writeString(this.A07.A00);
        parcel.writeInt(this.A0F ? 1 : 0);
    }

    public MediaMapPin(C120985dq c120985dq, ImageUrl imageUrl, ImageUrl imageUrl2, LocationPageInformation locationPageInformation, EnumC68146VDo enumC68146VDo, C37771pE c37771pE, LocationDict locationDict, Double d, Double d2, String str, String str2, ArrayList arrayList, int i, long j, boolean z) {
        double doubleValue;
        if (d == null) {
            doubleValue = 0.0d;
        } else {
            doubleValue = d.doubleValue();
        }
        this.A0A = Double.valueOf(doubleValue);
        this.A0B = Double.valueOf(d2 != null ? d2.doubleValue() : 0.0d);
        this.A09 = locationDict;
        this.A0D = str;
        this.A05 = imageUrl;
        this.A01 = j;
        this.A00 = i;
        this.A0E = arrayList;
        this.A0C = str2;
        this.A04 = imageUrl2;
        this.A08 = c37771pE;
        this.A07 = enumC68146VDo;
        this.A06 = locationPageInformation;
        this.A0F = z;
        this.A03 = AbstractC128065qa.A00(c120985dq);
    }

    @Override // X.InterfaceC71945XBu
    public final String getId() {
        return AbstractC69973Vyo.A01(this);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AbstractC69973Vyo.A01(this);
    }

    public MediaMapPin(ImageUrl imageUrl, LocationPageInformation locationPageInformation, EnumC68146VDo enumC68146VDo, Venue venue, Double d, Double d2, String str, long j) {
        this(null, imageUrl, null, locationPageInformation, enumC68146VDo, null, venue.A00.F6g(), d, d2, str, null, null, 0, j, false);
    }

    public MediaMapPin() {
    }
}
