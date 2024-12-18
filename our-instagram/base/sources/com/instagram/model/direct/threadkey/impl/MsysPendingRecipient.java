package com.instagram.model.direct.threadkey.impl;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25233BEq;
import X.AbstractC25236BEt;
import X.AbstractC31181DnP;
import X.AnonymousClass172;
import X.C0T6;
import X.C14360o3;
import X.C150866ql;
import X.C55343Oh9;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.FollowStatus;

/* loaded from: classes9.dex */
public final class MsysPendingRecipient extends C0T6 implements Parcelable, AnonymousClass172 {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(76);
    public final int A00;
    public final long A01;
    public final ImageUrl A02;
    public final FollowStatus A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final long A0I;
    public final boolean A0J;

    @Override // X.AnonymousClass178
    public final boolean CS0(C150866ql c150866ql) {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MsysPendingRecipient) {
                MsysPendingRecipient msysPendingRecipient = (MsysPendingRecipient) obj;
                if (!C14360o3.A0K(this.A07, msysPendingRecipient.A07) || this.A0I != msysPendingRecipient.A0I || this.A00 != msysPendingRecipient.A00 || !C14360o3.A0K(this.A09, msysPendingRecipient.A09) || !C14360o3.A0K(this.A05, msysPendingRecipient.A05) || !C14360o3.A0K(this.A08, msysPendingRecipient.A08) || !C14360o3.A0K(this.A06, msysPendingRecipient.A06) || !C14360o3.A0K(this.A02, msysPendingRecipient.A02) || this.A03 != msysPendingRecipient.A03 || this.A0H != msysPendingRecipient.A0H || this.A0B != msysPendingRecipient.A0B || this.A0G != msysPendingRecipient.A0G || this.A0A != msysPendingRecipient.A0A || this.A0F != msysPendingRecipient.A0F || this.A0C != msysPendingRecipient.A0C || !C14360o3.A0K(this.A04, msysPendingRecipient.A04) || this.A0D != msysPendingRecipient.A0D || this.A0E != msysPendingRecipient.A0E) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeLong(this.A0I);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A09);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A04));
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
    }

    @Override // X.AnonymousClass176
    public final FollowStatus B7L() {
        return this.A03;
    }

    @Override // X.AnonymousClass172
    public final String B8y() {
        return this.A06;
    }

    @Override // X.C17G
    public final int BJ8() {
        return this.A00;
    }

    @Override // X.C17K
    public final Long BTC() {
        return Long.valueOf(this.A01);
    }

    @Override // X.AnonymousClass173
    public final ImageUrl Bhu() {
        return this.A02;
    }

    @Override // X.AnonymousClass175
    public final Integer Bkb() {
        return this.A04;
    }

    @Override // X.AnonymousClass174
    public final boolean CPk() {
        return this.A0J;
    }

    @Override // X.C17I
    public final boolean CQf() {
        return this.A0A;
    }

    @Override // X.C17A
    public final boolean CQw() {
        return this.A0B;
    }

    @Override // X.C17H
    public final boolean CYY() {
        return this.A0D;
    }

    @Override // X.C17J
    public final boolean CYb() {
        return this.A0E;
    }

    @Override // X.AnonymousClass177
    public final boolean Cey() {
        return this.A0G;
    }

    @Override // X.C17F
    public final String getFullName() {
        return this.A05;
    }

    @Override // X.C17D
    public final String getId() {
        return this.A07;
    }

    @Override // X.C17B
    public final String getShortName() {
        return this.A08;
    }

    @Override // X.C17E
    public final String getUsername() {
        return this.A09;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0E, AbstractC167007dF.A0D(this.A0D, (AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0H, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0K(this.A06, (((AbstractC166997dE.A0K(this.A09, (AbstractC25236BEt.A01(this.A0I, AbstractC166987dD.A0J(this.A07)) + this.A00) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31))))))))) + AbstractC166997dE.A0I(this.A04)) * 31));
    }

    @Override // X.AnonymousClass172
    public final boolean isConnected() {
        return this.A0C;
    }

    @Override // X.AnonymousClass172
    public final boolean isRestricted() {
        return this.A0F;
    }

    @Override // X.AnonymousClass172
    public final boolean isVerified() {
        return this.A0H;
    }

    public MsysPendingRecipient(ImageUrl imageUrl, FollowStatus followStatus, Integer num, String str, String str2, String str3, String str4, String str5, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        MSZ.A1O(str, str2);
        AbstractC25233BEq.A0y(7, str5, imageUrl, followStatus);
        this.A07 = str;
        this.A0I = j;
        this.A00 = i;
        this.A09 = str2;
        this.A05 = str3;
        this.A08 = str4;
        this.A06 = str5;
        this.A02 = imageUrl;
        this.A03 = followStatus;
        this.A0H = z;
        this.A0B = z2;
        this.A0G = z3;
        this.A0A = z4;
        this.A0F = z5;
        this.A0C = z6;
        this.A04 = num;
        this.A0D = z7;
        this.A0E = z8;
        this.A01 = j;
        this.A0J = AbstractC167007dF.A1P(i, 2);
    }
}
