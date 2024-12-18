package com.instagram.model.coupon;

import X.AbstractC12190kN;
import X.C55343Oh9;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class PromoteAdsCouponUseCase implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ PromoteAdsCouponUseCase[] A01;
    public static final PromoteAdsCouponUseCase A02;
    public static final PromoteAdsCouponUseCase A03;
    public static final PromoteAdsCouponUseCase A04;
    public static final PromoteAdsCouponUseCase A05;
    public static final PromoteAdsCouponUseCase A06;
    public static final C55343Oh9 CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        PromoteAdsCouponUseCase promoteAdsCouponUseCase = new PromoteAdsCouponUseCase("ACQUISITION", 0);
        A02 = promoteAdsCouponUseCase;
        PromoteAdsCouponUseCase promoteAdsCouponUseCase2 = new PromoteAdsCouponUseCase("DEPRECATED", 1);
        A03 = promoteAdsCouponUseCase2;
        PromoteAdsCouponUseCase promoteAdsCouponUseCase3 = new PromoteAdsCouponUseCase("DOGFOODING", 2);
        A04 = promoteAdsCouponUseCase3;
        PromoteAdsCouponUseCase promoteAdsCouponUseCase4 = new PromoteAdsCouponUseCase("GENERAL", 3);
        A05 = promoteAdsCouponUseCase4;
        PromoteAdsCouponUseCase promoteAdsCouponUseCase5 = new PromoteAdsCouponUseCase("RESURRECTION", 4);
        A06 = promoteAdsCouponUseCase5;
        PromoteAdsCouponUseCase[] promoteAdsCouponUseCaseArr = {promoteAdsCouponUseCase, promoteAdsCouponUseCase2, promoteAdsCouponUseCase3, promoteAdsCouponUseCase4, promoteAdsCouponUseCase5, new PromoteAdsCouponUseCase("RETENTION", 5)};
        A01 = promoteAdsCouponUseCaseArr;
        A00 = AbstractC12190kN.A00(promoteAdsCouponUseCaseArr);
        CREATOR = C55343Oh9.A00(57);
    }

    public static PromoteAdsCouponUseCase valueOf(String str) {
        return (PromoteAdsCouponUseCase) Enum.valueOf(PromoteAdsCouponUseCase.class, str);
    }

    public static PromoteAdsCouponUseCase[] values() {
        return (PromoteAdsCouponUseCase[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name();
    }

    public PromoteAdsCouponUseCase(String str, int i) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
