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
public final class PromoteLaunchOrigin implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ PromoteLaunchOrigin[] A01;
    public static final PromoteLaunchOrigin A02;
    public static final PromoteLaunchOrigin A03;
    public static final PromoteLaunchOrigin A04;
    public static final PromoteLaunchOrigin A05;
    public static final PromoteLaunchOrigin A06;
    public static final PromoteLaunchOrigin A07;
    public static final PromoteLaunchOrigin A08;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        PromoteLaunchOrigin promoteLaunchOrigin = new PromoteLaunchOrigin("AB_TESTING_PICKER", 0);
        A02 = promoteLaunchOrigin;
        PromoteLaunchOrigin promoteLaunchOrigin2 = new PromoteLaunchOrigin("HEC_APPEAL", 1);
        A07 = promoteLaunchOrigin2;
        PromoteLaunchOrigin promoteLaunchOrigin3 = new PromoteLaunchOrigin("AD_PREVIEW", 2);
        A03 = promoteLaunchOrigin3;
        PromoteLaunchOrigin promoteLaunchOrigin4 = new PromoteLaunchOrigin("FEED_LIST", 3);
        A06 = promoteLaunchOrigin4;
        PromoteLaunchOrigin promoteLaunchOrigin5 = new PromoteLaunchOrigin("CAMPAIGN_CONTROLS_BUDGET_DURATION", 4);
        A04 = promoteLaunchOrigin5;
        PromoteLaunchOrigin promoteLaunchOrigin6 = new PromoteLaunchOrigin("MEDIA_PICKER", 5);
        A08 = promoteLaunchOrigin6;
        PromoteLaunchOrigin promoteLaunchOrigin7 = new PromoteLaunchOrigin("CLIENT_SPEC_OVERRIDE", 6);
        A05 = promoteLaunchOrigin7;
        PromoteLaunchOrigin[] promoteLaunchOriginArr = {promoteLaunchOrigin, promoteLaunchOrigin2, promoteLaunchOrigin3, promoteLaunchOrigin4, promoteLaunchOrigin5, promoteLaunchOrigin6, promoteLaunchOrigin7};
        A01 = promoteLaunchOriginArr;
        A00 = AbstractC12190kN.A00(promoteLaunchOriginArr);
        CREATOR = new C70220WId(77);
    }

    public static PromoteLaunchOrigin valueOf(String str) {
        return (PromoteLaunchOrigin) Enum.valueOf(PromoteLaunchOrigin.class, str);
    }

    public static PromoteLaunchOrigin[] values() {
        return (PromoteLaunchOrigin[]) A01.clone();
    }

    public PromoteLaunchOrigin(String str, int i) {
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
