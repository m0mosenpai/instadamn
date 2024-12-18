package com.instagram.business.promote.model;

import X.AbstractC12190kN;
import X.C69508Vpg;
import X.C70220WId;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class PromoteAdsManagerActionType implements Parcelable {
    public static final C69508Vpg A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ PromoteAdsManagerActionType[] A02;
    public static final PromoteAdsManagerActionType A03;
    public static final PromoteAdsManagerActionType A04;
    public static final PromoteAdsManagerActionType A05;
    public static final PromoteAdsManagerActionType A06;
    public static final PromoteAdsManagerActionType A07;
    public static final PromoteAdsManagerActionType A08;
    public static final PromoteAdsManagerActionType A09;
    public static final PromoteAdsManagerActionType A0A;
    public static final PromoteAdsManagerActionType A0B;
    public static final PromoteAdsManagerActionType A0C;
    public static final PromoteAdsManagerActionType A0D;
    public static final PromoteAdsManagerActionType A0E;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.Vpg, java.lang.Object] */
    static {
        PromoteAdsManagerActionType promoteAdsManagerActionType = new PromoteAdsManagerActionType("APPEAL", 0);
        A03 = promoteAdsManagerActionType;
        PromoteAdsManagerActionType promoteAdsManagerActionType2 = new PromoteAdsManagerActionType("EDIT", 1);
        A05 = promoteAdsManagerActionType2;
        PromoteAdsManagerActionType promoteAdsManagerActionType3 = new PromoteAdsManagerActionType("LEARN_MORE", 2);
        A06 = promoteAdsManagerActionType3;
        PromoteAdsManagerActionType promoteAdsManagerActionType4 = new PromoteAdsManagerActionType("LEARN_MORE_FOR_NOT_DELIVERING_PROMOTION", 3);
        A07 = promoteAdsManagerActionType4;
        PromoteAdsManagerActionType promoteAdsManagerActionType5 = new PromoteAdsManagerActionType("PAUSE", 4);
        A08 = promoteAdsManagerActionType5;
        PromoteAdsManagerActionType promoteAdsManagerActionType6 = new PromoteAdsManagerActionType("PAY_NOW", 5);
        A09 = promoteAdsManagerActionType6;
        PromoteAdsManagerActionType promoteAdsManagerActionType7 = new PromoteAdsManagerActionType("PROMOTE_AGAIN", 6);
        A0A = promoteAdsManagerActionType7;
        PromoteAdsManagerActionType promoteAdsManagerActionType8 = new PromoteAdsManagerActionType("RESUME", 7);
        A0B = promoteAdsManagerActionType8;
        PromoteAdsManagerActionType promoteAdsManagerActionType9 = new PromoteAdsManagerActionType("REVIEW", 8);
        A0C = promoteAdsManagerActionType9;
        PromoteAdsManagerActionType promoteAdsManagerActionType10 = new PromoteAdsManagerActionType("VIEW_APPEAL", 9);
        A0E = promoteAdsManagerActionType10;
        PromoteAdsManagerActionType promoteAdsManagerActionType11 = new PromoteAdsManagerActionType("DRAFT", 10);
        A04 = promoteAdsManagerActionType11;
        PromoteAdsManagerActionType promoteAdsManagerActionType12 = new PromoteAdsManagerActionType("SPEND_LIMIT_REACHED", 11);
        A0D = promoteAdsManagerActionType12;
        PromoteAdsManagerActionType[] promoteAdsManagerActionTypeArr = {promoteAdsManagerActionType, promoteAdsManagerActionType2, promoteAdsManagerActionType3, promoteAdsManagerActionType4, promoteAdsManagerActionType5, promoteAdsManagerActionType6, promoteAdsManagerActionType7, promoteAdsManagerActionType8, promoteAdsManagerActionType9, promoteAdsManagerActionType10, promoteAdsManagerActionType11, promoteAdsManagerActionType12};
        A02 = promoteAdsManagerActionTypeArr;
        A01 = AbstractC12190kN.A00(promoteAdsManagerActionTypeArr);
        A00 = new Object();
        CREATOR = new C70220WId(59);
    }

    public static PromoteAdsManagerActionType valueOf(String str) {
        return (PromoteAdsManagerActionType) Enum.valueOf(PromoteAdsManagerActionType.class, str);
    }

    public static PromoteAdsManagerActionType[] values() {
        return (PromoteAdsManagerActionType[]) A02.clone();
    }

    public PromoteAdsManagerActionType(String str, int i) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
