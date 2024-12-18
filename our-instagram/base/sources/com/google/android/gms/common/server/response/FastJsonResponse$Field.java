package com.google.android.gms.common.server.response;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C62715SNe;
import X.C63474SlF;
import X.InterfaceC65252Tgi;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;

/* loaded from: classes10.dex */
public class FastJsonResponse$Field extends AbstractSafeParcelable {
    public static final C63474SlF CREATOR = C63474SlF.A01(52);
    public zan A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final InterfaceC65252Tgi A04;
    public final Class A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final int A0A;

    public static FastJsonResponse$Field A00(String str, int i) {
        return new FastJsonResponse$Field(null, str, 7, 7, i, true, true);
    }

    public final String toString() {
        C62715SNe c62715SNe = new C62715SNe(this);
        c62715SNe.A00(Integer.valueOf(this.A0A), "versionCode");
        c62715SNe.A00(Integer.valueOf(this.A01), "typeIn");
        c62715SNe.A00(Boolean.valueOf(this.A08), "typeInArray");
        c62715SNe.A00(Integer.valueOf(this.A02), "typeOut");
        c62715SNe.A00(Boolean.valueOf(this.A09), "typeOutArray");
        c62715SNe.A00(this.A06, "outputFieldName");
        c62715SNe.A00(Integer.valueOf(this.A03), "safeParcelFieldId");
        String str = this.A07;
        if (str == null) {
            str = null;
        }
        c62715SNe.A00(str, "concreteTypeName");
        Class cls = this.A05;
        if (cls != null) {
            c62715SNe.A00(cls.getCanonicalName(), "concreteType.class");
        }
        InterfaceC65252Tgi interfaceC65252Tgi = this.A04;
        if (interfaceC65252Tgi != null) {
            c62715SNe.A00(AbstractC58319PtB.A0u(interfaceC65252Tgi), "converterName");
        }
        return c62715SNe.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zaa zaaVar;
        int A06 = AbstractC58322PtE.A06(parcel, this.A0A);
        AbstractC128825rw.A07(parcel, 2, this.A01);
        AbstractC128825rw.A09(parcel, 3, this.A08);
        AbstractC128825rw.A07(parcel, 4, this.A02);
        AbstractC128825rw.A09(parcel, 5, this.A09);
        AbstractC128825rw.A0C(parcel, this.A06, 6, false);
        AbstractC128825rw.A07(parcel, 7, this.A03);
        String str = this.A07;
        if (str == null) {
            str = null;
        }
        AbstractC128825rw.A0C(parcel, str, 8, false);
        InterfaceC65252Tgi interfaceC65252Tgi = this.A04;
        if (interfaceC65252Tgi == null) {
            zaaVar = null;
        } else if (interfaceC65252Tgi instanceof StringToIntConverter) {
            zaaVar = new zaa((StringToIntConverter) interfaceC65252Tgi);
        } else {
            throw AbstractC166987dD.A12("Unsupported safe parcelable field converter class.");
        }
        AbstractC128825rw.A0A(parcel, zaaVar, 9, i, false);
        AbstractC128825rw.A06(parcel, A06);
    }

    public FastJsonResponse$Field(zaa zaaVar, String str, String str2, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A0A = i;
        this.A01 = i2;
        this.A08 = z;
        this.A02 = i3;
        this.A09 = z2;
        this.A06 = str;
        this.A03 = i4;
        StringToIntConverter stringToIntConverter = null;
        if (str2 == null) {
            this.A05 = null;
            this.A07 = null;
        } else {
            this.A05 = SafeParcelResponse.class;
            this.A07 = str2;
        }
        if (zaaVar != null && (stringToIntConverter = zaaVar.A01) == null) {
            throw AbstractC166987dD.A14("There was no converter wrapped in this ConverterWrapper.");
        }
        this.A04 = stringToIntConverter;
    }

    public FastJsonResponse$Field(Class cls, String str, int i, int i2, int i3, boolean z, boolean z2) {
        String canonicalName;
        this.A0A = 1;
        this.A01 = i;
        this.A08 = z;
        this.A02 = i2;
        this.A09 = z2;
        this.A06 = str;
        this.A03 = i3;
        this.A05 = cls;
        if (cls == null) {
            canonicalName = null;
        } else {
            canonicalName = cls.getCanonicalName();
        }
        this.A07 = canonicalName;
        this.A04 = null;
    }
}
