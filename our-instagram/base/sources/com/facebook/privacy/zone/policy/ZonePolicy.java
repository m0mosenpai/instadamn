package com.facebook.privacy.zone.policy;

import X.AbstractC12190kN;
import X.C05F;
import X.C32071E6x;
import X.C63473SlE;
import X.EnumC61142Rfx;
import X.MSZ;
import X.STT;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class ZonePolicy implements Parcelable {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ZonePolicy[] A03;
    public static final ZonePolicy A04;
    public static final ZonePolicy A05;
    public static final ZonePolicy A06;
    public static final ZonePolicy A07;
    public static final ZonePolicy A08;
    public static final ZonePolicy A09;
    public static final ZonePolicy A0A;
    public static final ZonePolicy A0B;
    public static final ZonePolicy A0C;
    public static final ZonePolicy A0D;
    public static final ZonePolicy A0E;
    public static final ZonePolicy A0F;
    public static final ZonePolicy A0G;
    public static final ZonePolicy A0H;
    public static final ZonePolicy A0I;
    public static final Parcelable.Creator CREATOR;
    public final Integer A00;
    public final EnumC61142Rfx A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        EnumC61142Rfx enumC61142Rfx = EnumC61142Rfx.A02;
        Integer num = C05F.A01;
        ZonePolicy zonePolicy = new ZonePolicy(enumC61142Rfx, num, "ALLOW_ALL_POLICY", 0);
        A05 = zonePolicy;
        ZonePolicy zonePolicy2 = new ZonePolicy(EnumC61142Rfx.A09, num, "ACCESS_TOKEN_POLICY", 1);
        A04 = zonePolicy2;
        EnumC61142Rfx enumC61142Rfx2 = EnumC61142Rfx.A03;
        ZonePolicy zonePolicy3 = new ZonePolicy(enumC61142Rfx2, num, "DEFAULT_PURPOSES_OPERATIONAL_POLICY", 2);
        A06 = zonePolicy3;
        Integer num2 = C05F.A00;
        ZonePolicy zonePolicy4 = new ZonePolicy(enumC61142Rfx2, num2, "DEFAULT_PURPOSES_OPERATIONAL_STRICT_POLICY", 3);
        A07 = zonePolicy4;
        ZonePolicy zonePolicy5 = new ZonePolicy(EnumC61142Rfx.A0A, num, "FAMILY_DEVICE_ID_POLICY", 4);
        A08 = zonePolicy5;
        ZonePolicy zonePolicy6 = new ZonePolicy(EnumC61142Rfx.A04, num, "INFRASTRUCTURE_ANALYTICS_POLICY", 5);
        A09 = zonePolicy6;
        ZonePolicy zonePolicy7 = new ZonePolicy(EnumC61142Rfx.A06, num, "MESSAGING_ARMADILLO_METADATA", 6);
        A0B = zonePolicy7;
        EnumC61142Rfx enumC61142Rfx3 = EnumC61142Rfx.A0D;
        ZonePolicy zonePolicy8 = new ZonePolicy(enumC61142Rfx3, num, "MESSAGING_CONTENT_E2EE_POLICY", 7);
        A0D = zonePolicy8;
        EnumC61142Rfx enumC61142Rfx4 = EnumC61142Rfx.A0E;
        ZonePolicy zonePolicy9 = new ZonePolicy(enumC61142Rfx4, num, "MESSAGING_CONTENT_OPEN_POLICY", 8);
        A0F = zonePolicy9;
        ZonePolicy zonePolicy10 = new ZonePolicy(EnumC61142Rfx.A0C, num, "MESSAGING_CONTENT_DEBUGGING_POLICY", 9);
        A0C = zonePolicy10;
        ZonePolicy zonePolicy11 = new ZonePolicy(EnumC61142Rfx.A05, num, "MESSAGE_CONTENT_DATA_TYPE", 10);
        A0A = zonePolicy11;
        ZonePolicy zonePolicy12 = new ZonePolicy(enumC61142Rfx3, num2, "MESSAGING_CONTENT_E2EE_STRICT_POLICY", 11);
        A0E = zonePolicy12;
        ZonePolicy zonePolicy13 = new ZonePolicy(enumC61142Rfx4, num2, "MESSAGING_CONTENT_OPEN_STRICT_POLICY", 12);
        A0G = zonePolicy13;
        ZonePolicy zonePolicy14 = new ZonePolicy(EnumC61142Rfx.A08, num, "MESSAGING_TRAFFIC_METADATA", 13);
        A0H = zonePolicy14;
        ZonePolicy zonePolicy15 = new ZonePolicy(EnumC61142Rfx.A0F, num, "SENSITIVE_DATA_NO_ADS", 14);
        A0I = zonePolicy15;
        ZonePolicy[] zonePolicyArr = {zonePolicy, zonePolicy2, zonePolicy3, zonePolicy4, zonePolicy5, zonePolicy6, zonePolicy7, zonePolicy8, zonePolicy9, zonePolicy10, zonePolicy11, zonePolicy12, zonePolicy13, zonePolicy14, zonePolicy15, new ZonePolicy(EnumC61142Rfx.A07, num, "MESSAGING_CONTENT_POLICY", 15)};
        A03 = zonePolicyArr;
        A02 = AbstractC12190kN.A00(zonePolicyArr);
        CREATOR = C63473SlE.A01(51);
    }

    public static ZonePolicy valueOf(String str) {
        return (ZonePolicy) Enum.valueOf(ZonePolicy.class, str);
    }

    public static ZonePolicy[] values() {
        return (ZonePolicy[]) A03.clone();
    }

    public final String A00() {
        String str;
        C32071E6x c32071E6x = (C32071E6x) STT.A00.get(this.A01);
        if (c32071E6x == null || (str = c32071E6x.A01) == null) {
            return "";
        }
        return str;
    }

    public final String A01() {
        Integer num;
        C32071E6x c32071E6x = (C32071E6x) STT.A00.get(this.A01);
        if (c32071E6x != null) {
            num = Integer.valueOf(c32071E6x.A00);
        } else {
            num = null;
        }
        return String.valueOf(num);
    }

    public ZonePolicy(EnumC61142Rfx enumC61142Rfx, Integer num, String str, int i) {
        this.A01 = enumC61142Rfx;
        this.A00 = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
