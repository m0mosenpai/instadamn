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
public final class AdsManagerBoostingStatusErrorCode implements Parcelable {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ AdsManagerBoostingStatusErrorCode[] A02;
    public static final AdsManagerBoostingStatusErrorCode A03;
    public static final AdsManagerBoostingStatusErrorCode A04;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AdsManagerBoostingStatusErrorCode adsManagerBoostingStatusErrorCode = new AdsManagerBoostingStatusErrorCode("DEFAULT_DO_NOT_USE", 0, "default_do_not_use");
        A03 = adsManagerBoostingStatusErrorCode;
        AdsManagerBoostingStatusErrorCode adsManagerBoostingStatusErrorCode2 = new AdsManagerBoostingStatusErrorCode("SHOPPING_POST_TAGGED_PRODUCT_REJECTED", 1, "shopping_post_tagged_product_rejected");
        A04 = adsManagerBoostingStatusErrorCode2;
        AdsManagerBoostingStatusErrorCode[] adsManagerBoostingStatusErrorCodeArr = {adsManagerBoostingStatusErrorCode, adsManagerBoostingStatusErrorCode2};
        A02 = adsManagerBoostingStatusErrorCodeArr;
        A01 = AbstractC12190kN.A00(adsManagerBoostingStatusErrorCodeArr);
        CREATOR = new C70220WId(43);
    }

    public static AdsManagerBoostingStatusErrorCode valueOf(String str) {
        return (AdsManagerBoostingStatusErrorCode) Enum.valueOf(AdsManagerBoostingStatusErrorCode.class, str);
    }

    public static AdsManagerBoostingStatusErrorCode[] values() {
        return (AdsManagerBoostingStatusErrorCode[]) A02.clone();
    }

    public AdsManagerBoostingStatusErrorCode(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
