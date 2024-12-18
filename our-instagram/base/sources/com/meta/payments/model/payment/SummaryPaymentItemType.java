package com.meta.payments.model.payment;

import X.AbstractC12190kN;
import X.C55344OhA;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.PriceTableAnnotation$Companion;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class SummaryPaymentItemType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ SummaryPaymentItemType[] A01;
    public static final SummaryPaymentItemType A02;
    public static final SummaryPaymentItemType A03;
    public static final SummaryPaymentItemType A04;
    public static final SummaryPaymentItemType A05;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        SummaryPaymentItemType summaryPaymentItemType = new SummaryPaymentItemType(PriceTableAnnotation$Companion.SUBTOTAL, 0);
        A05 = summaryPaymentItemType;
        SummaryPaymentItemType summaryPaymentItemType2 = new SummaryPaymentItemType(PriceTableAnnotation$Companion.ESTIMATED_TAX, 1);
        A02 = summaryPaymentItemType2;
        SummaryPaymentItemType summaryPaymentItemType3 = new SummaryPaymentItemType("SHIPPING", 2);
        A04 = summaryPaymentItemType3;
        SummaryPaymentItemType summaryPaymentItemType4 = new SummaryPaymentItemType(PriceTableAnnotation$Companion.OFFER, 3);
        A03 = summaryPaymentItemType4;
        SummaryPaymentItemType[] summaryPaymentItemTypeArr = {summaryPaymentItemType, summaryPaymentItemType2, summaryPaymentItemType3, summaryPaymentItemType4, new SummaryPaymentItemType(PriceTableAnnotation$Companion.FEE, 4)};
        A01 = summaryPaymentItemTypeArr;
        A00 = AbstractC12190kN.A00(summaryPaymentItemTypeArr);
        CREATOR = new C55344OhA(80);
    }

    public static SummaryPaymentItemType valueOf(String str) {
        return (SummaryPaymentItemType) Enum.valueOf(SummaryPaymentItemType.class, str);
    }

    public static SummaryPaymentItemType[] values() {
        return (SummaryPaymentItemType[]) A01.clone();
    }

    public SummaryPaymentItemType(String str, int i) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
