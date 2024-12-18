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
public final class ErrorHandlingResponseType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ ErrorHandlingResponseType[] A01;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ErrorHandlingResponseType[] errorHandlingResponseTypeArr = {new ErrorHandlingResponseType()};
        A01 = errorHandlingResponseTypeArr;
        A00 = AbstractC12190kN.A00(errorHandlingResponseTypeArr);
        CREATOR = new C70220WId(51);
    }

    public static ErrorHandlingResponseType valueOf(String str) {
        return (ErrorHandlingResponseType) Enum.valueOf(ErrorHandlingResponseType.class, str);
    }

    public static ErrorHandlingResponseType[] values() {
        return (ErrorHandlingResponseType[]) A01.clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
