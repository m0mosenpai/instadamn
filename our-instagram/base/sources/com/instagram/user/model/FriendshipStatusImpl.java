package com.instagram.user.model;

import X.AbstractC39881tC;
import X.C0T6;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes.dex */
public final class FriendshipStatusImpl extends C0T6 implements FriendshipStatus, Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(69);
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Boolean A0C;
    public final Boolean A0D;
    public final Boolean A0E;
    public final Boolean A0F;
    public final Boolean A0G;
    public final Boolean A0H;
    public final Boolean A0I;
    public final Boolean A0J;
    public final Boolean A0K;
    public final Boolean A0L;
    public final Boolean A0M;
    public final Boolean A0N;
    public final Boolean A0O;
    public final Boolean A0P;
    public final Integer A0Q;

    @Override // com.instagram.user.model.FriendshipStatus
    public final FriendshipStatusImpl F7P() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FriendshipStatusImpl) {
                FriendshipStatusImpl friendshipStatusImpl = (FriendshipStatusImpl) obj;
                if (!C14360o3.A0K(this.A00, friendshipStatusImpl.A00) || !C14360o3.A0K(this.A01, friendshipStatusImpl.A01) || !C14360o3.A0K(this.A02, friendshipStatusImpl.A02) || !C14360o3.A0K(this.A03, friendshipStatusImpl.A03) || !C14360o3.A0K(this.A04, friendshipStatusImpl.A04) || !C14360o3.A0K(this.A05, friendshipStatusImpl.A05) || !C14360o3.A0K(this.A06, friendshipStatusImpl.A06) || !C14360o3.A0K(this.A07, friendshipStatusImpl.A07) || !C14360o3.A0K(this.A08, friendshipStatusImpl.A08) || !C14360o3.A0K(this.A09, friendshipStatusImpl.A09) || !C14360o3.A0K(this.A0A, friendshipStatusImpl.A0A) || !C14360o3.A0K(this.A0B, friendshipStatusImpl.A0B) || !C14360o3.A0K(this.A0C, friendshipStatusImpl.A0C) || !C14360o3.A0K(this.A0D, friendshipStatusImpl.A0D) || !C14360o3.A0K(this.A0E, friendshipStatusImpl.A0E) || !C14360o3.A0K(this.A0F, friendshipStatusImpl.A0F) || !C14360o3.A0K(this.A0G, friendshipStatusImpl.A0G) || !C14360o3.A0K(this.A0H, friendshipStatusImpl.A0H) || !C14360o3.A0K(this.A0I, friendshipStatusImpl.A0I) || !C14360o3.A0K(this.A0J, friendshipStatusImpl.A0J) || !C14360o3.A0K(this.A0K, friendshipStatusImpl.A0K) || !C14360o3.A0K(this.A0L, friendshipStatusImpl.A0L) || !C14360o3.A0K(this.A0M, friendshipStatusImpl.A0M) || !C14360o3.A0K(this.A0Q, friendshipStatusImpl.A0Q) || !C14360o3.A0K(this.A0N, friendshipStatusImpl.A0N) || !C14360o3.A0K(this.A0O, friendshipStatusImpl.A0O) || !C14360o3.A0K(this.A0P, friendshipStatusImpl.A0P)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A01;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A02;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A03;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.A04;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.A05;
        int hashCode6 = (hashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.A06;
        int hashCode7 = (hashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.A07;
        int hashCode8 = (hashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.A08;
        int hashCode9 = (hashCode8 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.A09;
        int hashCode10 = (hashCode9 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.A0A;
        int hashCode11 = (hashCode10 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.A0B;
        int hashCode12 = (hashCode11 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.A0C;
        int hashCode13 = (hashCode12 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.A0D;
        int hashCode14 = (hashCode13 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.A0E;
        int hashCode15 = (hashCode14 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.A0F;
        int hashCode16 = (hashCode15 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.A0G;
        int hashCode17 = (hashCode16 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.A0H;
        int hashCode18 = (hashCode17 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.A0I;
        int hashCode19 = (hashCode18 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.A0J;
        int hashCode20 = (hashCode19 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.A0K;
        int hashCode21 = (hashCode20 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.A0L;
        int hashCode22 = (hashCode21 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        Boolean bool23 = this.A0M;
        int hashCode23 = (hashCode22 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        Integer num = this.A0Q;
        int hashCode24 = (hashCode23 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool24 = this.A0N;
        int hashCode25 = (hashCode24 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        Boolean bool25 = this.A0O;
        int hashCode26 = (hashCode25 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
        Boolean bool26 = this.A0P;
        return hashCode26 + (bool26 != null ? bool26.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Boolean bool = this.A00;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.A01;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.A02;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.A03;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.A04;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.A05;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Boolean bool7 = this.A06;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        Boolean bool8 = this.A07;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool8.booleanValue() ? 1 : 0);
        }
        Boolean bool9 = this.A08;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool9.booleanValue() ? 1 : 0);
        }
        Boolean bool10 = this.A09;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool10.booleanValue() ? 1 : 0);
        }
        Boolean bool11 = this.A0A;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool11.booleanValue() ? 1 : 0);
        }
        Boolean bool12 = this.A0B;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool12.booleanValue() ? 1 : 0);
        }
        Boolean bool13 = this.A0C;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool13.booleanValue() ? 1 : 0);
        }
        Boolean bool14 = this.A0D;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool14.booleanValue() ? 1 : 0);
        }
        Boolean bool15 = this.A0E;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool15.booleanValue() ? 1 : 0);
        }
        Boolean bool16 = this.A0F;
        if (bool16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool16.booleanValue() ? 1 : 0);
        }
        Boolean bool17 = this.A0G;
        if (bool17 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool17.booleanValue() ? 1 : 0);
        }
        Boolean bool18 = this.A0H;
        if (bool18 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool18.booleanValue() ? 1 : 0);
        }
        Boolean bool19 = this.A0I;
        if (bool19 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool19.booleanValue() ? 1 : 0);
        }
        Boolean bool20 = this.A0J;
        if (bool20 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool20.booleanValue() ? 1 : 0);
        }
        Boolean bool21 = this.A0K;
        if (bool21 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool21.booleanValue() ? 1 : 0);
        }
        Boolean bool22 = this.A0L;
        if (bool22 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool22.booleanValue() ? 1 : 0);
        }
        Boolean bool23 = this.A0M;
        if (bool23 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool23.booleanValue() ? 1 : 0);
        }
        Integer num = this.A0Q;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool24 = this.A0N;
        if (bool24 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool24.booleanValue() ? 1 : 0);
        }
        Boolean bool25 = this.A0O;
        if (bool25 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool25.booleanValue() ? 1 : 0);
        }
        Boolean bool26 = this.A0P;
        if (bool26 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool26.booleanValue() ? 1 : 0);
        }
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean AgM() {
        return this.A00;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean B7Q() {
        return this.A01;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean B7V() {
        return this.A02;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean BHO() {
        return this.A03;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean BVx() {
        return this.A0L;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean BaD() {
        return this.A0M;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Integer Bkc() {
        return this.A0Q;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean Bvc() {
        return this.A0N;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean C3Q() {
        return this.A0O;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean C6a() {
        return this.A0P;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CQV() {
        return this.A04;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CQa() {
        return this.A05;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CQg() {
        return this.A06;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CTh() {
        return this.A07;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CUV() {
        return this.A08;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CUg() {
        return this.A09;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CVR() {
        return this.A0A;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CYZ() {
        return this.A0B;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CYa() {
        return this.A0C;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CZA() {
        return this.A0D;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CZB() {
        return this.A0E;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CZC() {
        return this.A0F;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CZD() {
        return this.A0G;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean Cb1() {
        return this.A0H;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean Cc1() {
        return this.A0I;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean Cex() {
        return this.A0J;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean Cfx() {
        return this.A0K;
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTRelationshipInfoDict", AbstractC39881tC.A01(this));
    }

    public FriendshipStatusImpl(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Integer num) {
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = bool3;
        this.A03 = bool4;
        this.A04 = bool5;
        this.A05 = bool6;
        this.A06 = bool7;
        this.A07 = bool8;
        this.A08 = bool9;
        this.A09 = bool10;
        this.A0A = bool11;
        this.A0B = bool12;
        this.A0C = bool13;
        this.A0D = bool14;
        this.A0E = bool15;
        this.A0F = bool16;
        this.A0G = bool17;
        this.A0H = bool18;
        this.A0I = bool19;
        this.A0J = bool20;
        this.A0K = bool21;
        this.A0L = bool22;
        this.A0M = bool23;
        this.A0Q = num;
        this.A0N = bool24;
        this.A0O = bool25;
        this.A0P = bool26;
    }
}
