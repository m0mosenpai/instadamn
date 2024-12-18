package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class FeedAfterPartyPromoteEligibilityStatusEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ FeedAfterPartyPromoteEligibilityStatusEnum[] A03;
    public static final FeedAfterPartyPromoteEligibilityStatusEnum A04;
    public static final FeedAfterPartyPromoteEligibilityStatusEnum A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        FeedAfterPartyPromoteEligibilityStatusEnum feedAfterPartyPromoteEligibilityStatusEnum = new FeedAfterPartyPromoteEligibilityStatusEnum("UNRECOGNIZED", 0, "FeedAfterPartyPromoteEligibilityStatusEnum_unspecified");
        A05 = feedAfterPartyPromoteEligibilityStatusEnum;
        FeedAfterPartyPromoteEligibilityStatusEnum feedAfterPartyPromoteEligibilityStatusEnum2 = new FeedAfterPartyPromoteEligibilityStatusEnum("FEED_AFTER_PARTY_ELIGIBLE", 1, "eligible_for_feed_afterparty");
        A04 = feedAfterPartyPromoteEligibilityStatusEnum2;
        FeedAfterPartyPromoteEligibilityStatusEnum[] feedAfterPartyPromoteEligibilityStatusEnumArr = {feedAfterPartyPromoteEligibilityStatusEnum, feedAfterPartyPromoteEligibilityStatusEnum2, new FeedAfterPartyPromoteEligibilityStatusEnum("FEED_AFTER_PARTY_NOT_ELIGIBLE", 2, "not_eligible_for_feed_afterparty")};
        A03 = feedAfterPartyPromoteEligibilityStatusEnumArr;
        A02 = AbstractC12190kN.A00(feedAfterPartyPromoteEligibilityStatusEnumArr);
        FeedAfterPartyPromoteEligibilityStatusEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (FeedAfterPartyPromoteEligibilityStatusEnum feedAfterPartyPromoteEligibilityStatusEnum3 : values) {
            A18.put(feedAfterPartyPromoteEligibilityStatusEnum3.A00, feedAfterPartyPromoteEligibilityStatusEnum3);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(83);
    }

    public static FeedAfterPartyPromoteEligibilityStatusEnum valueOf(String str) {
        return (FeedAfterPartyPromoteEligibilityStatusEnum) Enum.valueOf(FeedAfterPartyPromoteEligibilityStatusEnum.class, str);
    }

    public static FeedAfterPartyPromoteEligibilityStatusEnum[] values() {
        return (FeedAfterPartyPromoteEligibilityStatusEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public FeedAfterPartyPromoteEligibilityStatusEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
