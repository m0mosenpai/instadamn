package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class PartnerTypes implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ PartnerTypes[] A03;
    public static final PartnerTypes A04;
    public static final PartnerTypes A05;
    public static final PartnerTypes A06;
    public static final PartnerTypes A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        PartnerTypes partnerTypes = new PartnerTypes("UNRECOGNIZED", 0, "PartnerTypes_unspecified");
        A07 = partnerTypes;
        PartnerTypes partnerTypes2 = new PartnerTypes("AMAZON", 1, "AMAZON");
        A04 = partnerTypes2;
        PartnerTypes partnerTypes3 = new PartnerTypes(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 2, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        A05 = partnerTypes3;
        PartnerTypes partnerTypes4 = new PartnerTypes("SHOPEE_TH", 3, "SHOPEE_TH");
        A06 = partnerTypes4;
        PartnerTypes[] partnerTypesArr = {partnerTypes, partnerTypes2, partnerTypes3, partnerTypes4, new PartnerTypes("WALMART", 4, "WALMART")};
        A03 = partnerTypesArr;
        A02 = AbstractC12190kN.A00(partnerTypesArr);
        PartnerTypes[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (PartnerTypes partnerTypes5 : values) {
            A18.put(partnerTypes5.A00, partnerTypes5);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(29);
    }

    public static PartnerTypes valueOf(String str) {
        return (PartnerTypes) Enum.valueOf(PartnerTypes.class, str);
    }

    public static PartnerTypes[] values() {
        return (PartnerTypes[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public PartnerTypes(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
