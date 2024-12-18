package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class XDTCreatorInspirationHubType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ XDTCreatorInspirationHubType[] A03;
    public static final XDTCreatorInspirationHubType A04;
    public static final XDTCreatorInspirationHubType A05;
    public static final XDTCreatorInspirationHubType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        XDTCreatorInspirationHubType xDTCreatorInspirationHubType = new XDTCreatorInspirationHubType("UNRECOGNIZED", 0, "XDTCreatorInspirationHubType_unspecified");
        A06 = xDTCreatorInspirationHubType;
        XDTCreatorInspirationHubType xDTCreatorInspirationHubType2 = new XDTCreatorInspirationHubType("ACCOUNTS", 1, "accounts");
        A04 = xDTCreatorInspirationHubType2;
        XDTCreatorInspirationHubType xDTCreatorInspirationHubType3 = new XDTCreatorInspirationHubType("AUDIOS", 2, "audios");
        A05 = xDTCreatorInspirationHubType3;
        XDTCreatorInspirationHubType[] xDTCreatorInspirationHubTypeArr = {xDTCreatorInspirationHubType, xDTCreatorInspirationHubType2, xDTCreatorInspirationHubType3, new XDTCreatorInspirationHubType("CLIPS", 3, "clips")};
        A03 = xDTCreatorInspirationHubTypeArr;
        A02 = AbstractC12190kN.A00(xDTCreatorInspirationHubTypeArr);
        XDTCreatorInspirationHubType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (XDTCreatorInspirationHubType xDTCreatorInspirationHubType4 : values) {
            A18.put(xDTCreatorInspirationHubType4.A00, xDTCreatorInspirationHubType4);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(88);
    }

    public static XDTCreatorInspirationHubType valueOf(String str) {
        return (XDTCreatorInspirationHubType) Enum.valueOf(XDTCreatorInspirationHubType.class, str);
    }

    public static XDTCreatorInspirationHubType[] values() {
        return (XDTCreatorInspirationHubType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public XDTCreatorInspirationHubType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
