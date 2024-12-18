package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class IgUserBioLinkTypeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IgUserBioLinkTypeEnum[] A03;
    public static final IgUserBioLinkTypeEnum A04;
    public static final IgUserBioLinkTypeEnum A05;
    public static final IgUserBioLinkTypeEnum A06;
    public static final IgUserBioLinkTypeEnum A07;
    public static final IgUserBioLinkTypeEnum A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    static {
        IgUserBioLinkTypeEnum igUserBioLinkTypeEnum = new IgUserBioLinkTypeEnum("UNRECOGNIZED", 0, "IgUserBioLinkTypeEnum_unspecified");
        A08 = igUserBioLinkTypeEnum;
        IgUserBioLinkTypeEnum igUserBioLinkTypeEnum2 = new IgUserBioLinkTypeEnum("EXTERNAL", 1, "external");
        A04 = igUserBioLinkTypeEnum2;
        IgUserBioLinkTypeEnum igUserBioLinkTypeEnum3 = new IgUserBioLinkTypeEnum("FACEBOOK", 2, "facebook");
        A05 = igUserBioLinkTypeEnum3;
        IgUserBioLinkTypeEnum igUserBioLinkTypeEnum4 = new IgUserBioLinkTypeEnum("FACEBOOK_GROUP", 3, "facebook_group");
        A06 = igUserBioLinkTypeEnum4;
        IgUserBioLinkTypeEnum igUserBioLinkTypeEnum5 = new IgUserBioLinkTypeEnum("FACEBOOK_PAGE", 4, "facebook_page");
        A07 = igUserBioLinkTypeEnum5;
        IgUserBioLinkTypeEnum[] igUserBioLinkTypeEnumArr = {igUserBioLinkTypeEnum, igUserBioLinkTypeEnum2, igUserBioLinkTypeEnum3, igUserBioLinkTypeEnum4, igUserBioLinkTypeEnum5, new IgUserBioLinkTypeEnum("WHATSAPP", 5, "whatsapp")};
        A03 = igUserBioLinkTypeEnumArr;
        A02 = AbstractC12190kN.A00(igUserBioLinkTypeEnumArr);
        IgUserBioLinkTypeEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IgUserBioLinkTypeEnum igUserBioLinkTypeEnum6 : values) {
            linkedHashMap.put(igUserBioLinkTypeEnum6.A00, igUserBioLinkTypeEnum6);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(31);
    }

    public static IgUserBioLinkTypeEnum valueOf(String str) {
        return (IgUserBioLinkTypeEnum) Enum.valueOf(IgUserBioLinkTypeEnum.class, str);
    }

    public static IgUserBioLinkTypeEnum[] values() {
        return (IgUserBioLinkTypeEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IgUserBioLinkTypeEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
