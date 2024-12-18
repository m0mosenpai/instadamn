package com.meta.payments.model.configuration;

import X.AbstractC12190kN;
import X.C55344OhA;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class AdditionalInfoKey implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AdditionalInfoKey[] A01;
    public static final AdditionalInfoKey A02;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AdditionalInfoKey additionalInfoKey = new AdditionalInfoKey("ALTERNATIVE_CHECKOUT", 0);
        A02 = additionalInfoKey;
        AdditionalInfoKey[] additionalInfoKeyArr = {additionalInfoKey, new AdditionalInfoKey("DEVELOPER_TERMS", 1)};
        A01 = additionalInfoKeyArr;
        A00 = AbstractC12190kN.A00(additionalInfoKeyArr);
        CREATOR = C55344OhA.A00(63);
    }

    public static AdditionalInfoKey valueOf(String str) {
        return (AdditionalInfoKey) Enum.valueOf(AdditionalInfoKey.class, str);
    }

    public static AdditionalInfoKey[] values() {
        return (AdditionalInfoKey[]) A01.clone();
    }

    public AdditionalInfoKey(String str, int i) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
