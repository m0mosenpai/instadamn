package com.instagram.business.promote.model;

import X.AbstractC12190kN;
import X.C70220WId;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class AudiencePotentialReachRating implements Parcelable {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AudiencePotentialReachRating[] A03;
    public static final AudiencePotentialReachRating A04;
    public static final AudiencePotentialReachRating A05;
    public static final AudiencePotentialReachRating A06;
    public static final AudiencePotentialReachRating A07;
    public static final Parcelable.Creator CREATOR;
    public final int A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static AudiencePotentialReachRating valueOf(String str) {
        return (AudiencePotentialReachRating) Enum.valueOf(AudiencePotentialReachRating.class, str);
    }

    public static AudiencePotentialReachRating[] values() {
        return (AudiencePotentialReachRating[]) A03.clone();
    }

    static {
        AudiencePotentialReachRating audiencePotentialReachRating = new AudiencePotentialReachRating(0, 2131970382, "UNAVAILABLE", "UNAVAILABLE");
        A06 = audiencePotentialReachRating;
        AudiencePotentialReachRating audiencePotentialReachRating2 = new AudiencePotentialReachRating(1, 2131970380, "BAD_TOO_BROAD", "BAD_TOO_BROAD");
        A04 = audiencePotentialReachRating2;
        AudiencePotentialReachRating audiencePotentialReachRating3 = new AudiencePotentialReachRating(2, 2131970381, "BAD_TOO_SMALL", "BAD_TOO_SMALL");
        A05 = audiencePotentialReachRating3;
        AudiencePotentialReachRating audiencePotentialReachRating4 = new AudiencePotentialReachRating(3, 2131970380, "VAGUE", "VAGUE");
        A07 = audiencePotentialReachRating4;
        AudiencePotentialReachRating[] audiencePotentialReachRatingArr = {audiencePotentialReachRating, audiencePotentialReachRating2, audiencePotentialReachRating3, audiencePotentialReachRating4, new AudiencePotentialReachRating(4, 2131970376, "GOOD", "GOOD")};
        A03 = audiencePotentialReachRatingArr;
        A02 = AbstractC12190kN.A00(audiencePotentialReachRatingArr);
        CREATOR = new C70220WId(48);
    }

    public AudiencePotentialReachRating(int i, int i2, String str, String str2) {
        this.A01 = str2;
        this.A00 = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
