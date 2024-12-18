package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BonusPromoDialogAudienceType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ BonusPromoDialogAudienceType[] A03;
    public static final BonusPromoDialogAudienceType A04;
    public static final BonusPromoDialogAudienceType A05;
    public static final BonusPromoDialogAudienceType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        BonusPromoDialogAudienceType bonusPromoDialogAudienceType = new BonusPromoDialogAudienceType("UNRECOGNIZED", 0, "BonusPromoDialogAudienceType_unspecified");
        A06 = bonusPromoDialogAudienceType;
        BonusPromoDialogAudienceType bonusPromoDialogAudienceType2 = new BonusPromoDialogAudienceType("FIRST_TIME_ONBOARDER", 1, "first_time_onboarder");
        A04 = bonusPromoDialogAudienceType2;
        BonusPromoDialogAudienceType bonusPromoDialogAudienceType3 = new BonusPromoDialogAudienceType("RENEWAL", 2, "renewal");
        A05 = bonusPromoDialogAudienceType3;
        BonusPromoDialogAudienceType[] bonusPromoDialogAudienceTypeArr = {bonusPromoDialogAudienceType, bonusPromoDialogAudienceType2, bonusPromoDialogAudienceType3, new BonusPromoDialogAudienceType("RESURRECTION", 3, "resurrection")};
        A03 = bonusPromoDialogAudienceTypeArr;
        A02 = AbstractC12190kN.A00(bonusPromoDialogAudienceTypeArr);
        BonusPromoDialogAudienceType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (BonusPromoDialogAudienceType bonusPromoDialogAudienceType4 : values) {
            A18.put(bonusPromoDialogAudienceType4.A00, bonusPromoDialogAudienceType4);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(71);
    }

    public static BonusPromoDialogAudienceType valueOf(String str) {
        return (BonusPromoDialogAudienceType) Enum.valueOf(BonusPromoDialogAudienceType.class, str);
    }

    public static BonusPromoDialogAudienceType[] values() {
        return (BonusPromoDialogAudienceType[]) A03.clone();
    }

    public BonusPromoDialogAudienceType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
