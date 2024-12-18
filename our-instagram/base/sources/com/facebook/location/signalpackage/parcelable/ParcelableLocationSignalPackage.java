package com.facebook.location.signalpackage.parcelable;

import X.AbstractC25235BEs;
import X.AbstractC31177DnL;
import X.AbstractC58318PtA;
import X.AbstractC58576Pxu;
import X.AbstractC63050SbV;
import X.C103804lz;
import X.C202078wn;
import X.C202098wp;
import X.C63282Sgh;
import X.C63473SlE;
import X.C64285T7u;
import X.C65047Tcc;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cellinfo.parcelable.ParcelableGeneralCellInfo;
import com.facebook.wifiscan.parcelable.ParcelableWifiScanResult;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes10.dex */
public class ParcelableLocationSignalPackage extends C202098wp implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(33);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r1.equals(r0) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.location.signalpackage.parcelable.ParcelableLocationSignalPackage.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [X.8wp, com.facebook.location.signalpackage.parcelable.ParcelableLocationSignalPackage] */
    public static ParcelableLocationSignalPackage A00(C202098wp c202098wp) {
        boolean isFromMockProvider;
        C103804lz c103804lz;
        ImmutableList A01;
        ImmutableList A012;
        ImmutableList A013;
        ImmutableList A03;
        if (c202098wp == null) {
            return null;
        }
        C103804lz c103804lz2 = c202098wp.A02;
        String str = c202098wp.A0E;
        Boolean bool = c202098wp.A05;
        C63282Sgh c63282Sgh = c202098wp.A03;
        C103804lz c103804lz3 = c202098wp.A01;
        List list = c202098wp.A0N;
        Boolean bool2 = c202098wp.A07;
        C202078wn c202078wn = c202098wp.A00;
        List list2 = c202098wp.A0J;
        List list3 = c202098wp.A0I;
        Boolean bool3 = c202098wp.A04;
        List list4 = c202098wp.A0H;
        Integer num = c202098wp.A0B;
        List list5 = c202098wp.A0L;
        String str2 = c202098wp.A0C;
        String str3 = c202098wp.A0D;
        String str4 = c202098wp.A0G;
        Boolean bool4 = c202098wp.A06;
        String str5 = c202098wp.A0F;
        Integer num2 = c202098wp.A09;
        Float f = c202098wp.A08;
        Integer num3 = c202098wp.A0A;
        List list6 = c202098wp.A0M;
        List list7 = c202098wp.A0K;
        if (c103804lz2 == null) {
            c103804lz = null;
        } else {
            Location location = c103804lz2.A00;
            Location location2 = new Location(location);
            Boolean bool5 = c103804lz2.A01;
            if (bool5 != null) {
                isFromMockProvider = bool5.booleanValue();
            } else {
                isFromMockProvider = location.isFromMockProvider();
            }
            c103804lz = new C103804lz(location2, Boolean.valueOf(isFromMockProvider));
        }
        ParcelableWifiScanResult A00 = ParcelableWifiScanResult.A00(c63282Sgh);
        if (list == null) {
            A01 = null;
        } else {
            A01 = AbstractC58576Pxu.A01(AbstractC58576Pxu.A00(list), 9);
        }
        ParcelableGeneralCellInfo A002 = ParcelableGeneralCellInfo.A00(c202078wn);
        if (list3 == null) {
            A012 = null;
        } else {
            A012 = AbstractC58576Pxu.A01(AbstractC58576Pxu.A00(list3), 2);
        }
        if (list4 == null) {
            A013 = null;
        } else {
            A013 = AbstractC58576Pxu.A01(AbstractC58576Pxu.A00(list4), 6);
        }
        if (list5 == null) {
            A03 = null;
        } else {
            A03 = AbstractC58576Pxu.A00(list5).A02(new C64285T7u(1, C65047Tcc.A00)).A03();
        }
        return new C202098wp(A002, c103804lz3, c103804lz, A00, bool3, bool, bool4, bool2, f, num2, num3, num, str2, str3, str, str5, str4, A013, A012, list2, list7, A03, list6, A01);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        int A06 = ((((((AbstractC25235BEs.A06(this.A02) * 31) + AbstractC31177DnL.A04(this.A0E)) * 31) + AbstractC25235BEs.A06(this.A05)) * 31) + AbstractC25235BEs.A06(this.A03)) * 31;
        List list = this.A0N;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int A062 = (((((A06 + i) * 31) + AbstractC25235BEs.A06(this.A07)) * 31) + AbstractC25235BEs.A06(this.A00)) * 31;
        List list2 = this.A0J;
        if (list2 != null) {
            i2 = list2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (A062 + i2) * 31;
        List list3 = this.A0I;
        if (list3 != null) {
            i3 = list3.hashCode();
        } else {
            i3 = 0;
        }
        int A063 = (((i7 + i3) * 31) + AbstractC25235BEs.A06(this.A04)) * 31;
        List list4 = this.A0H;
        if (list4 != null) {
            i4 = list4.hashCode();
        } else {
            i4 = 0;
        }
        int A064 = (((A063 + i4) * 31) + AbstractC25235BEs.A06(this.A0B)) * 31;
        List list5 = this.A0L;
        if (list5 != null) {
            i5 = list5.hashCode();
        } else {
            i5 = 0;
        }
        int A04 = (((((((((((((((A064 + i5) * 31) + AbstractC31177DnL.A04(this.A0C)) * 31) + AbstractC31177DnL.A04(this.A0D)) * 31) + AbstractC31177DnL.A04(this.A0G)) * 31) + AbstractC25235BEs.A06(this.A06)) * 31) + AbstractC31177DnL.A04(this.A0F)) * 31) + AbstractC25235BEs.A06(this.A09)) * 31) + AbstractC25235BEs.A06(this.A08)) * 31;
        Integer num = this.A0A;
        if (num != null) {
            i6 = num.hashCode();
        }
        return A04 + i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Float f;
        boolean isFromMockProvider;
        ImmutableList A01;
        ImmutableList A012;
        ImmutableList A013;
        ImmutableList A03;
        ImmutableList A014;
        C103804lz c103804lz = this.A02;
        if (c103804lz == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            Location location = c103804lz.A00;
            parcel.writeDouble(location.getLatitude());
            parcel.writeDouble(location.getLongitude());
            String provider = location.getProvider();
            if (provider == null) {
                provider = null;
            }
            parcel.writeString(provider);
            Long A032 = c103804lz.A03();
            if (A032 == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                AbstractC58318PtA.A1G(parcel, A032);
            }
            long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
            if (elapsedRealtimeNanos != 0 && Long.valueOf(elapsedRealtimeNanos) != null) {
                parcel.writeByte((byte) 1);
                parcel.writeLong(elapsedRealtimeNanos);
            } else {
                parcel.writeByte((byte) 0);
            }
            AbstractC63050SbV.A02(parcel, c103804lz.A01());
            Double A00 = c103804lz.A00();
            if (A00 == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                parcel.writeDouble(A00.doubleValue());
            }
            AbstractC63050SbV.A02(parcel, c103804lz.A02());
            if (location.hasSpeed()) {
                f = Float.valueOf(location.getSpeed());
            } else {
                f = null;
            }
            AbstractC63050SbV.A02(parcel, f);
            parcel.writeBundle(location.getExtras());
            Boolean bool = c103804lz.A01;
            if (bool != null) {
                isFromMockProvider = bool.booleanValue();
            } else {
                isFromMockProvider = location.isFromMockProvider();
            }
            AbstractC63050SbV.A01(parcel, Boolean.valueOf(isFromMockProvider));
        }
        parcel.writeString(this.A0E);
        AbstractC63050SbV.A01(parcel, this.A05);
        parcel.writeParcelable(ParcelableWifiScanResult.A00(this.A03), 0);
        List list = this.A0N;
        if (list == null) {
            A01 = null;
        } else {
            A01 = AbstractC58576Pxu.A01(AbstractC58576Pxu.A00(list), 9);
        }
        parcel.writeTypedList(A01);
        AbstractC63050SbV.A01(parcel, this.A07);
        parcel.writeParcelable(ParcelableGeneralCellInfo.A00(this.A00), 0);
        parcel.writeTypedList(this.A0J);
        List list2 = this.A0I;
        if (list2 == null) {
            A012 = null;
        } else {
            A012 = AbstractC58576Pxu.A01(AbstractC58576Pxu.A00(list2), 2);
        }
        parcel.writeTypedList(A012);
        AbstractC63050SbV.A01(parcel, this.A04);
        List list3 = this.A0H;
        if (list3 == null) {
            A013 = null;
        } else {
            A013 = AbstractC58576Pxu.A01(AbstractC58576Pxu.A00(list3), 6);
        }
        parcel.writeTypedList(A013);
        Integer num = this.A0B;
        if (num == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            AbstractC58318PtA.A1H(parcel, num);
        }
        List list4 = this.A0L;
        if (list4 == null) {
            A03 = null;
        } else {
            A03 = AbstractC58576Pxu.A00(list4).A02(new C64285T7u(1, C65047Tcc.A00)).A03();
        }
        parcel.writeTypedList(A03);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0G);
        AbstractC63050SbV.A01(parcel, this.A06);
        parcel.writeString(this.A0F);
        Integer num2 = this.A09;
        if (num2 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            AbstractC58318PtA.A1H(parcel, num2);
        }
        AbstractC63050SbV.A02(parcel, this.A08);
        Integer num3 = this.A0A;
        if (num3 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            AbstractC58318PtA.A1H(parcel, num3);
        }
        List list5 = this.A0M;
        if (list5 == null) {
            A014 = null;
        } else {
            A014 = AbstractC58576Pxu.A01(AbstractC58576Pxu.A00(list5), 4);
        }
        parcel.writeTypedList(A014);
    }
}
