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
public final class InstagramPromoteSuggestionReason implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ InstagramPromoteSuggestionReason[] A01;
    public static final InstagramPromoteSuggestionReason A02;
    public static final InstagramPromoteSuggestionReason A03;
    public static final InstagramPromoteSuggestionReason A04;
    public static final InstagramPromoteSuggestionReason A05;
    public static final InstagramPromoteSuggestionReason A06;
    public static final InstagramPromoteSuggestionReason A07;
    public static final InstagramPromoteSuggestionReason A08;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        InstagramPromoteSuggestionReason instagramPromoteSuggestionReason = new InstagramPromoteSuggestionReason("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A08 = instagramPromoteSuggestionReason;
        InstagramPromoteSuggestionReason instagramPromoteSuggestionReason2 = new InstagramPromoteSuggestionReason("MOST_COMMENTS", 1);
        A02 = instagramPromoteSuggestionReason2;
        InstagramPromoteSuggestionReason instagramPromoteSuggestionReason3 = new InstagramPromoteSuggestionReason("MOST_ENGAGEMENT", 2);
        A03 = instagramPromoteSuggestionReason3;
        InstagramPromoteSuggestionReason instagramPromoteSuggestionReason4 = new InstagramPromoteSuggestionReason("MOST_LIKES", 3);
        A04 = instagramPromoteSuggestionReason4;
        InstagramPromoteSuggestionReason instagramPromoteSuggestionReason5 = new InstagramPromoteSuggestionReason("MOST_LIKES_LAST_28D", 4);
        A05 = instagramPromoteSuggestionReason5;
        InstagramPromoteSuggestionReason instagramPromoteSuggestionReason6 = new InstagramPromoteSuggestionReason("MOST_REACH", 5);
        A06 = instagramPromoteSuggestionReason6;
        InstagramPromoteSuggestionReason instagramPromoteSuggestionReason7 = new InstagramPromoteSuggestionReason("MOST_RECENT", 6);
        A07 = instagramPromoteSuggestionReason7;
        InstagramPromoteSuggestionReason[] instagramPromoteSuggestionReasonArr = {instagramPromoteSuggestionReason, instagramPromoteSuggestionReason2, instagramPromoteSuggestionReason3, instagramPromoteSuggestionReason4, instagramPromoteSuggestionReason5, instagramPromoteSuggestionReason6, instagramPromoteSuggestionReason7};
        A01 = instagramPromoteSuggestionReasonArr;
        A00 = AbstractC12190kN.A00(instagramPromoteSuggestionReasonArr);
        CREATOR = new C70220WId(56);
    }

    public static InstagramPromoteSuggestionReason valueOf(String str) {
        return (InstagramPromoteSuggestionReason) Enum.valueOf(InstagramPromoteSuggestionReason.class, str);
    }

    public static InstagramPromoteSuggestionReason[] values() {
        return (InstagramPromoteSuggestionReason[]) A01.clone();
    }

    public InstagramPromoteSuggestionReason(String str, int i) {
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
