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
/* loaded from: classes9.dex */
public final class BonusPromoDialogType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ BonusPromoDialogType[] A03;
    public static final BonusPromoDialogType A04;
    public static final BonusPromoDialogType A05;
    public static final BonusPromoDialogType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        BonusPromoDialogType bonusPromoDialogType = new BonusPromoDialogType("UNRECOGNIZED", 0, "BonusPromoDialogType_unspecified");
        A06 = bonusPromoDialogType;
        BonusPromoDialogType bonusPromoDialogType2 = new BonusPromoDialogType("SELF_PROFILE_REELS", 1, "self_profile_reels");
        A05 = bonusPromoDialogType2;
        BonusPromoDialogType bonusPromoDialogType3 = new BonusPromoDialogType("AFTER_REELS_CREATION", 2, "after_reels_creation");
        A04 = bonusPromoDialogType3;
        BonusPromoDialogType[] bonusPromoDialogTypeArr = {bonusPromoDialogType, bonusPromoDialogType2, bonusPromoDialogType3};
        A03 = bonusPromoDialogTypeArr;
        A02 = AbstractC12190kN.A00(bonusPromoDialogTypeArr);
        BonusPromoDialogType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (BonusPromoDialogType bonusPromoDialogType4 : values) {
            A18.put(bonusPromoDialogType4.A00, bonusPromoDialogType4);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(72);
    }

    public static BonusPromoDialogType valueOf(String str) {
        return (BonusPromoDialogType) Enum.valueOf(BonusPromoDialogType.class, str);
    }

    public static BonusPromoDialogType[] values() {
        return (BonusPromoDialogType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BonusPromoDialogType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
