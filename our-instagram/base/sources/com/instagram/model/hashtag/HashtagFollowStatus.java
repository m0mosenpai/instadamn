package com.instagram.model.hashtag;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class HashtagFollowStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ HashtagFollowStatus[] A03;
    public static final HashtagFollowStatus A04;
    public static final HashtagFollowStatus A05;
    public static final HashtagFollowStatus A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        HashtagFollowStatus hashtagFollowStatus = new HashtagFollowStatus("UNRECOGNIZED", 0, "HashtagFollowStatus_unspecified");
        A06 = hashtagFollowStatus;
        HashtagFollowStatus hashtagFollowStatus2 = new HashtagFollowStatus("NOT_FOLLOWING", 1, "not_following");
        A05 = hashtagFollowStatus2;
        HashtagFollowStatus hashtagFollowStatus3 = new HashtagFollowStatus("FOLLOWING", 2, "following");
        A04 = hashtagFollowStatus3;
        HashtagFollowStatus[] hashtagFollowStatusArr = {hashtagFollowStatus, hashtagFollowStatus2, hashtagFollowStatus3, new HashtagFollowStatus("UNKNOWN", 3, "unknown")};
        A03 = hashtagFollowStatusArr;
        A02 = AbstractC12190kN.A00(hashtagFollowStatusArr);
        HashtagFollowStatus[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (HashtagFollowStatus hashtagFollowStatus4 : values) {
            A18.put(hashtagFollowStatus4.A00, hashtagFollowStatus4);
        }
        A01 = A18;
        CREATOR = C55343Oh9.A00(84);
    }

    public static HashtagFollowStatus valueOf(String str) {
        return (HashtagFollowStatus) Enum.valueOf(HashtagFollowStatus.class, str);
    }

    public static HashtagFollowStatus[] values() {
        return (HashtagFollowStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public HashtagFollowStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
