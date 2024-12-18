package com.meta.payments.error;

import X.AbstractC12190kN;
import X.C55344OhA;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class ErrorCode implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ ErrorCode[] A01;
    public static final ErrorCode A02;
    public static final ErrorCode A03;
    public static final ErrorCode A04;
    public static final ErrorCode A05;
    public static final ErrorCode A06;
    public static final ErrorCode A07;
    public static final ErrorCode A08;
    public static final ErrorCode A09;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ErrorCode errorCode = new ErrorCode("ABORTED", 0);
        A02 = errorCode;
        ErrorCode errorCode2 = new ErrorCode("INTERNAL_ERROR", 1);
        A03 = errorCode2;
        ErrorCode errorCode3 = new ErrorCode("INVALID_REQUEST", 2);
        A04 = errorCode3;
        ErrorCode errorCode4 = new ErrorCode("PRODUCT_OWNED", 3);
        A05 = errorCode4;
        ErrorCode errorCode5 = new ErrorCode("PRODUCT_UNAVAILABLE", 4);
        A06 = errorCode5;
        ErrorCode errorCode6 = new ErrorCode("SDK_NOT_INITIALIZED", 5);
        A07 = errorCode6;
        ErrorCode errorCode7 = new ErrorCode("SERVICE_DISCONNECTED", 6);
        A08 = errorCode7;
        ErrorCode errorCode8 = new ErrorCode("SERVICE_TIMEOUT", 7);
        A09 = errorCode8;
        ErrorCode[] errorCodeArr = {errorCode, errorCode2, errorCode3, errorCode4, errorCode5, errorCode6, errorCode7, errorCode8, new ErrorCode("SERVICE_UNAVAILABLE", 8)};
        A01 = errorCodeArr;
        A00 = AbstractC12190kN.A00(errorCodeArr);
        CREATOR = C55344OhA.A00(62);
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) A01.clone();
    }

    public ErrorCode(String str, int i) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
