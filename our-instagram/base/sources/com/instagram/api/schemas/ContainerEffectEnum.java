package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC37302Gc3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ContainerEffectEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ContainerEffectEnum[] A03;
    public static final ContainerEffectEnum A04;
    public static final ContainerEffectEnum A05;
    public static final ContainerEffectEnum A06;
    public static final ContainerEffectEnum A07;
    public static final ContainerEffectEnum A08;
    public static final ContainerEffectEnum A09;
    public static final ContainerEffectEnum A0A;
    public static final ContainerEffectEnum A0B;
    public static final ContainerEffectEnum A0C;
    public static final ContainerEffectEnum A0D;
    public static final ContainerEffectEnum A0E;
    public static final ContainerEffectEnum A0F;
    public static final ContainerEffectEnum A0G;
    public static final ContainerEffectEnum A0H;
    public static final ContainerEffectEnum A0I;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ContainerEffectEnum containerEffectEnum = new ContainerEffectEnum("UNRECOGNIZED", 0, "ContainerEffectEnum_unspecified");
        A0I = containerEffectEnum;
        ContainerEffectEnum containerEffectEnum2 = new ContainerEffectEnum("AR_DATA", 1, "AR_DATA");
        A04 = containerEffectEnum2;
        ContainerEffectEnum containerEffectEnum3 = new ContainerEffectEnum("BAG", 2, "BAG");
        A05 = containerEffectEnum3;
        ContainerEffectEnum containerEffectEnum4 = new ContainerEffectEnum("EXPERIMENTAL_BAG", 3, "EXPERIMENTAL_BAG");
        A06 = containerEffectEnum4;
        ContainerEffectEnum containerEffectEnum5 = new ContainerEffectEnum("EXPERIMENTAL_FURNITURE", 4, "EXPERIMENTAL_FURNITURE");
        A07 = containerEffectEnum5;
        ContainerEffectEnum containerEffectEnum6 = new ContainerEffectEnum("EXPERIMENTAL_GLASSES", 5, "EXPERIMENTAL_GLASSES");
        A08 = containerEffectEnum6;
        ContainerEffectEnum containerEffectEnum7 = new ContainerEffectEnum("EXPERIMENTAL_MAKEUP", 6, "EXPERIMENTAL_MAKEUP");
        A09 = containerEffectEnum7;
        ContainerEffectEnum containerEffectEnum8 = new ContainerEffectEnum("FURNITURE", 7, "FURNITURE");
        A0A = containerEffectEnum8;
        ContainerEffectEnum containerEffectEnum9 = new ContainerEffectEnum("GENERIC", 8, "GENERIC");
        A0B = containerEffectEnum9;
        ContainerEffectEnum containerEffectEnum10 = new ContainerEffectEnum("GLASSES", 9, "GLASSES");
        A0C = containerEffectEnum10;
        ContainerEffectEnum containerEffectEnum11 = new ContainerEffectEnum("MAKEUP", 10, "MAKEUP");
        A0D = containerEffectEnum11;
        ContainerEffectEnum containerEffectEnum12 = new ContainerEffectEnum(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 11, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        A0E = containerEffectEnum12;
        ContainerEffectEnum containerEffectEnum13 = new ContainerEffectEnum("STAGING_BAG", 12, "STAGING_BAG");
        A0F = containerEffectEnum13;
        ContainerEffectEnum containerEffectEnum14 = new ContainerEffectEnum("STAGING_FURNITURE", 13, "STAGING_FURNITURE");
        A0G = containerEffectEnum14;
        ContainerEffectEnum containerEffectEnum15 = new ContainerEffectEnum("STAGING_GLASSES", 14, "STAGING_GLASSES");
        A0H = containerEffectEnum15;
        ContainerEffectEnum[] containerEffectEnumArr = {containerEffectEnum, containerEffectEnum2, containerEffectEnum3, containerEffectEnum4, containerEffectEnum5, containerEffectEnum6, containerEffectEnum7, containerEffectEnum8, containerEffectEnum9, containerEffectEnum10, containerEffectEnum11, containerEffectEnum12, containerEffectEnum13, containerEffectEnum14, containerEffectEnum15, new ContainerEffectEnum("STAGING_MAKEUP", 15, "STAGING_MAKEUP")};
        A03 = containerEffectEnumArr;
        A02 = AbstractC12190kN.A00(containerEffectEnumArr);
        ContainerEffectEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC37302Gc3.A01(values.length));
        for (ContainerEffectEnum containerEffectEnum16 : values) {
            A18.put(containerEffectEnum16.A00, containerEffectEnum16);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(29);
    }

    public static ContainerEffectEnum valueOf(String str) {
        return (ContainerEffectEnum) Enum.valueOf(ContainerEffectEnum.class, str);
    }

    public static ContainerEffectEnum[] values() {
        return (ContainerEffectEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ContainerEffectEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
