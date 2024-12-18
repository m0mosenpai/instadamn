package com.instagram.leadgen.core.api;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class OrganicLeadGenCtaLabel implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ OrganicLeadGenCtaLabel[] A03;
    public static final OrganicLeadGenCtaLabel A04;
    public static final OrganicLeadGenCtaLabel A05;
    public static final OrganicLeadGenCtaLabel A06;
    public static final OrganicLeadGenCtaLabel A07;
    public static final OrganicLeadGenCtaLabel A08;
    public static final OrganicLeadGenCtaLabel A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        OrganicLeadGenCtaLabel organicLeadGenCtaLabel = new OrganicLeadGenCtaLabel("UNRECOGNIZED", 0, "OrganicLeadGenCtaLabel_unspecified");
        A09 = organicLeadGenCtaLabel;
        OrganicLeadGenCtaLabel organicLeadGenCtaLabel2 = new OrganicLeadGenCtaLabel(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 1, NetInfoModule.CONNECTION_TYPE_NONE);
        A07 = organicLeadGenCtaLabel2;
        OrganicLeadGenCtaLabel organicLeadGenCtaLabel3 = new OrganicLeadGenCtaLabel("GET_QUOTE", 2, "get_quote");
        A05 = organicLeadGenCtaLabel3;
        OrganicLeadGenCtaLabel organicLeadGenCtaLabel4 = new OrganicLeadGenCtaLabel("APPLY_NOW", 3, "apply_now");
        A04 = organicLeadGenCtaLabel4;
        OrganicLeadGenCtaLabel organicLeadGenCtaLabel5 = new OrganicLeadGenCtaLabel("LEARN_MORE", 4, "learn_more");
        A06 = organicLeadGenCtaLabel5;
        OrganicLeadGenCtaLabel organicLeadGenCtaLabel6 = new OrganicLeadGenCtaLabel("SIGN_UP", 5, "sign_up");
        A08 = organicLeadGenCtaLabel6;
        OrganicLeadGenCtaLabel[] organicLeadGenCtaLabelArr = {organicLeadGenCtaLabel, organicLeadGenCtaLabel2, organicLeadGenCtaLabel3, organicLeadGenCtaLabel4, organicLeadGenCtaLabel5, organicLeadGenCtaLabel6, new OrganicLeadGenCtaLabel("SUBSCRIBE", 6, "subscribe")};
        A03 = organicLeadGenCtaLabelArr;
        A02 = AbstractC12190kN.A00(organicLeadGenCtaLabelArr);
        OrganicLeadGenCtaLabel[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (OrganicLeadGenCtaLabel organicLeadGenCtaLabel7 : values) {
            A18.put(organicLeadGenCtaLabel7.A00, organicLeadGenCtaLabel7);
        }
        A01 = A18;
        CREATOR = C55343Oh9.A00(14);
    }

    public static OrganicLeadGenCtaLabel valueOf(String str) {
        return (OrganicLeadGenCtaLabel) Enum.valueOf(OrganicLeadGenCtaLabel.class, str);
    }

    public static OrganicLeadGenCtaLabel[] values() {
        return (OrganicLeadGenCtaLabel[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public OrganicLeadGenCtaLabel(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
