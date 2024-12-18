package com.instagram.business.promote.model;

import X.AbstractC12190kN;
import X.C00O;
import X.C14360o3;
import X.C40781ul;
import X.C70220WId;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.model.coupon.PromoteAdsCouponUseCase;
import com.instagram.model.coupon.PromoteCouponCurrencyAmount;
import com.instagram.model.coupon.PromoteCouponType;
import kotlin.enums.EnumEntries;

/* loaded from: classes11.dex */
public final class PromoteEnrollCouponInfo extends C40781ul implements Parcelable {
    public static final C70220WId CREATOR = new C70220WId(70);
    public PromoteEnrollCouponStatus A00;
    public PromoteAdsCouponUseCase A01;
    public PromoteCouponCurrencyAmount A02;
    public PromoteCouponCurrencyAmount A03;
    public PromoteCouponCurrencyAmount A04;
    public PromoteCouponType A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes11.dex */
    public final class PromoteEnrollCouponStatus implements Parcelable {
        public static final /* synthetic */ EnumEntries A00;
        public static final /* synthetic */ PromoteEnrollCouponStatus[] A01;
        public static final PromoteEnrollCouponStatus A02;
        public static final PromoteEnrollCouponStatus A03;
        public static final PromoteEnrollCouponStatus A04;
        public static final PromoteEnrollCouponStatus A05;
        public static final PromoteEnrollCouponStatus A06;
        public static final PromoteEnrollCouponStatus A07;
        public static final PromoteEnrollCouponStatus A08;
        public static final PromoteEnrollCouponStatus A09;
        public static final C70220WId CREATOR;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        static {
            PromoteEnrollCouponStatus promoteEnrollCouponStatus = new PromoteEnrollCouponStatus(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
            A09 = promoteEnrollCouponStatus;
            PromoteEnrollCouponStatus promoteEnrollCouponStatus2 = new PromoteEnrollCouponStatus("ACTIVE_IMPRESSION", 1);
            A02 = promoteEnrollCouponStatus2;
            PromoteEnrollCouponStatus promoteEnrollCouponStatus3 = new PromoteEnrollCouponStatus("HAS_ENROLLED", 2);
            A06 = promoteEnrollCouponStatus3;
            PromoteEnrollCouponStatus promoteEnrollCouponStatus4 = new PromoteEnrollCouponStatus("HAS_PRE_OFFER", 3);
            A08 = promoteEnrollCouponStatus4;
            PromoteEnrollCouponStatus promoteEnrollCouponStatus5 = new PromoteEnrollCouponStatus("HAS_FAILED", 4);
            A07 = promoteEnrollCouponStatus5;
            PromoteEnrollCouponStatus promoteEnrollCouponStatus6 = new PromoteEnrollCouponStatus("CLAIM_FAILURE", 5);
            A03 = promoteEnrollCouponStatus6;
            PromoteEnrollCouponStatus promoteEnrollCouponStatus7 = new PromoteEnrollCouponStatus("CLAIM_FAILURE_COUPON_ALREADY_CLAIMED", 6);
            A04 = promoteEnrollCouponStatus7;
            PromoteEnrollCouponStatus promoteEnrollCouponStatus8 = new PromoteEnrollCouponStatus("HAS_CLAIMED", 7);
            A05 = promoteEnrollCouponStatus8;
            PromoteEnrollCouponStatus[] promoteEnrollCouponStatusArr = {promoteEnrollCouponStatus, promoteEnrollCouponStatus2, promoteEnrollCouponStatus3, promoteEnrollCouponStatus4, promoteEnrollCouponStatus5, promoteEnrollCouponStatus6, promoteEnrollCouponStatus7, promoteEnrollCouponStatus8};
            A01 = promoteEnrollCouponStatusArr;
            A00 = AbstractC12190kN.A00(promoteEnrollCouponStatusArr);
            CREATOR = new C70220WId(71);
        }

        public static PromoteEnrollCouponStatus valueOf(String str) {
            return (PromoteEnrollCouponStatus) Enum.valueOf(PromoteEnrollCouponStatus.class, str);
        }

        public static PromoteEnrollCouponStatus[] values() {
            return (PromoteEnrollCouponStatus[]) A01.clone();
        }

        public PromoteEnrollCouponStatus(String str, int i) {
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeParcelable(A00(), i);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
    }

    public final PromoteEnrollCouponStatus A00() {
        PromoteEnrollCouponStatus promoteEnrollCouponStatus = this.A00;
        if (promoteEnrollCouponStatus != null) {
            return promoteEnrollCouponStatus;
        }
        C14360o3.A0F("couponStatus");
        throw C00O.createAndThrow();
    }
}
