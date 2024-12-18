package com.google.android.gms.vision.barcode;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63471SlC;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class Barcode extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(87);
    public int A00;
    public int A01;
    public CalendarEvent A02;
    public ContactInfo A03;
    public DriverLicense A04;
    public Email A05;
    public GeoPoint A06;
    public Phone A07;
    public Sms A08;
    public UrlBookmark A09;
    public WiFi A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public byte[] A0E;
    public Point[] A0F;

    /* loaded from: classes10.dex */
    public class Address extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C63471SlC.A00(86);
        public int A00;
        public String[] A01;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int A04 = AbstractC58319PtB.A04(parcel);
            AbstractC128825rw.A07(parcel, 2, this.A00);
            AbstractC128825rw.A0H(parcel, this.A01, 3);
            AbstractC128825rw.A06(parcel, A04);
        }
    }

    /* loaded from: classes10.dex */
    public class CalendarDateTime extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C63471SlC.A00(88);
        public int A00;
        public int A01;
        public int A02;
        public int A03;
        public int A04;
        public int A05;
        public String A06;
        public boolean A07;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int A04 = AbstractC58319PtB.A04(parcel);
            AbstractC128825rw.A07(parcel, 2, this.A05);
            AbstractC128825rw.A07(parcel, 3, this.A03);
            AbstractC128825rw.A07(parcel, 4, this.A00);
            AbstractC128825rw.A07(parcel, 5, this.A01);
            AbstractC128825rw.A07(parcel, 6, this.A02);
            AbstractC128825rw.A07(parcel, 7, this.A04);
            AbstractC128825rw.A09(parcel, 8, this.A07);
            AbstractC128825rw.A0C(parcel, this.A06, 9, false);
            AbstractC128825rw.A06(parcel, A04);
        }
    }

    /* loaded from: classes10.dex */
    public class CalendarEvent extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C63471SlC.A00(90);
        public CalendarDateTime A00;
        public CalendarDateTime A01;
        public String A02;
        public String A03;
        public String A04;
        public String A05;
        public String A06;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int A04 = AbstractC58319PtB.A04(parcel);
            AbstractC128825rw.A0B(parcel, this.A06);
            AbstractC128825rw.A0C(parcel, this.A02, 3, false);
            AbstractC128825rw.A0C(parcel, this.A03, 4, false);
            AbstractC128825rw.A0C(parcel, this.A04, 5, false);
            AbstractC128825rw.A0C(parcel, this.A05, 6, false);
            AbstractC128825rw.A0A(parcel, this.A01, 7, i, false);
            AbstractC128825rw.A0A(parcel, this.A00, 8, i, false);
            AbstractC128825rw.A06(parcel, A04);
        }
    }

    /* loaded from: classes10.dex */
    public class ContactInfo extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C63471SlC.A00(89);
        public PersonName A00;
        public String A01;
        public String A02;
        public Address[] A03;
        public Email[] A04;
        public Phone[] A05;
        public String[] A06;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int A04 = AbstractC58319PtB.A04(parcel);
            boolean A1U = AbstractC58322PtE.A1U(parcel, this.A00, i);
            AbstractC128825rw.A0C(parcel, this.A01, 3, A1U);
            AbstractC128825rw.A0C(parcel, this.A02, 4, A1U);
            AbstractC128825rw.A0G(parcel, this.A05, 5, i);
            AbstractC128825rw.A0G(parcel, this.A04, 6, i);
            AbstractC128825rw.A0H(parcel, this.A06, 7);
            AbstractC128825rw.A0G(parcel, this.A03, 8, i);
            AbstractC128825rw.A06(parcel, A04);
        }
    }

    /* loaded from: classes10.dex */
    public class DriverLicense extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C63471SlC.A00(92);
        public String A00;
        public String A01;
        public String A02;
        public String A03;
        public String A04;
        public String A05;
        public String A06;
        public String A07;
        public String A08;
        public String A09;
        public String A0A;
        public String A0B;
        public String A0C;
        public String A0D;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int A04 = AbstractC58319PtB.A04(parcel);
            AbstractC128825rw.A0B(parcel, this.A05);
            AbstractC128825rw.A0C(parcel, this.A07, 3, false);
            AbstractC128825rw.A0C(parcel, this.A0D, 4, false);
            AbstractC128825rw.A0C(parcel, this.A0B, 5, false);
            AbstractC128825rw.A0C(parcel, this.A08, 6, false);
            AbstractC128825rw.A0C(parcel, this.A02, 7, false);
            AbstractC128825rw.A0C(parcel, this.A00, 8, false);
            AbstractC128825rw.A0C(parcel, this.A01, 9, false);
            AbstractC128825rw.A0C(parcel, this.A03, 10, false);
            AbstractC128825rw.A0C(parcel, this.A0C, 11, false);
            AbstractC128825rw.A0C(parcel, this.A09, 12, false);
            AbstractC128825rw.A0C(parcel, this.A06, 13, false);
            AbstractC128825rw.A0C(parcel, this.A04, 14, false);
            AbstractC128825rw.A0C(parcel, this.A0A, 15, false);
            AbstractC128825rw.A06(parcel, A04);
        }
    }

    /* loaded from: classes10.dex */
    public class Email extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C63471SlC.A00(91);
        public int A00;
        public String A01;
        public String A02;
        public String A03;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int A04 = AbstractC58319PtB.A04(parcel);
            AbstractC128825rw.A07(parcel, 2, this.A00);
            AbstractC128825rw.A0C(parcel, this.A01, 3, false);
            AbstractC128825rw.A0C(parcel, this.A03, 4, false);
            AbstractC128825rw.A0C(parcel, this.A02, 5, false);
            AbstractC128825rw.A06(parcel, A04);
        }
    }

    /* loaded from: classes10.dex */
    public class GeoPoint extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C63471SlC.A00(94);
        public double A00;
        public double A01;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int A04 = AbstractC58319PtB.A04(parcel);
            double d = this.A00;
            parcel.writeInt(524290);
            parcel.writeDouble(d);
            double d2 = this.A01;
            parcel.writeInt(524291);
            parcel.writeDouble(d2);
            AbstractC128825rw.A06(parcel, A04);
        }
    }

    /* loaded from: classes10.dex */
    public class PersonName extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C63471SlC.A00(93);
        public String A00;
        public String A01;
        public String A02;
        public String A03;
        public String A04;
        public String A05;
        public String A06;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int A04 = AbstractC58319PtB.A04(parcel);
            AbstractC128825rw.A0B(parcel, this.A01);
            AbstractC128825rw.A0C(parcel, this.A05, 3, false);
            AbstractC128825rw.A0C(parcel, this.A04, 4, false);
            AbstractC128825rw.A0C(parcel, this.A00, 5, false);
            AbstractC128825rw.A0C(parcel, this.A03, 6, false);
            AbstractC128825rw.A0C(parcel, this.A02, 7, false);
            AbstractC128825rw.A0C(parcel, this.A06, 8, false);
            AbstractC128825rw.A06(parcel, A04);
        }
    }

    /* loaded from: classes10.dex */
    public class Phone extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C63471SlC.A00(96);
        public int A00;
        public String A01;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int A04 = AbstractC58319PtB.A04(parcel);
            AbstractC128825rw.A07(parcel, 2, this.A00);
            AbstractC128825rw.A0C(parcel, this.A01, 3, false);
            AbstractC128825rw.A06(parcel, A04);
        }
    }

    /* loaded from: classes10.dex */
    public class Sms extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C63471SlC.A00(95);
        public String A00;
        public String A01;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int A04 = AbstractC58319PtB.A04(parcel);
            AbstractC128825rw.A0B(parcel, this.A00);
            AbstractC58319PtB.A1D(parcel, this.A01, A04, false);
        }
    }

    /* loaded from: classes10.dex */
    public class UrlBookmark extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C63471SlC.A00(98);
        public String A00;
        public String A01;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int A04 = AbstractC58319PtB.A04(parcel);
            AbstractC128825rw.A0B(parcel, this.A00);
            AbstractC58319PtB.A1D(parcel, this.A01, A04, false);
        }
    }

    /* loaded from: classes10.dex */
    public class WiFi extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C63471SlC.A00(97);
        public int A00;
        public String A01;
        public String A02;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int A04 = AbstractC58319PtB.A04(parcel);
            AbstractC128825rw.A0B(parcel, this.A02);
            AbstractC128825rw.A0C(parcel, this.A01, 3, false);
            AbstractC58322PtE.A1B(parcel, this.A00, A04);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A07(parcel, 2, this.A00);
        AbstractC128825rw.A0C(parcel, this.A0C, 3, false);
        AbstractC128825rw.A0C(parcel, this.A0B, 4, false);
        AbstractC128825rw.A07(parcel, 5, this.A01);
        AbstractC128825rw.A0G(parcel, this.A0F, 6, i);
        AbstractC128825rw.A0A(parcel, this.A05, 7, i, false);
        AbstractC128825rw.A0A(parcel, this.A07, 8, i, false);
        AbstractC128825rw.A0A(parcel, this.A08, 9, i, false);
        AbstractC128825rw.A0A(parcel, this.A0A, 10, i, false);
        AbstractC128825rw.A0A(parcel, this.A09, 11, i, false);
        AbstractC128825rw.A0A(parcel, this.A06, 12, i, false);
        AbstractC128825rw.A0A(parcel, this.A02, 13, i, false);
        AbstractC128825rw.A0A(parcel, this.A03, 14, i, false);
        AbstractC128825rw.A0A(parcel, this.A04, 15, i, false);
        AbstractC128825rw.A0F(parcel, this.A0E, 16, false);
        AbstractC128825rw.A09(parcel, 17, this.A0D);
        AbstractC128825rw.A06(parcel, A04);
    }
}
