package com.instagram.direct.inbox;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.InterfaceC66482zP;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.direct.DirectSearchResult;

/* loaded from: classes6.dex */
public final class DirectInviteContactViewModel extends C0T6 implements InterfaceC66482zP, Parcelable, DirectSearchResult {
    public static final Parcelable.Creator CREATOR = new LNL(6);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final String A06;
    public final String A07;

    @Override // com.instagram.model.direct.DirectSearchResult
    public final String AEL() {
        return "Failed to show contact to invite";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectInviteContactViewModel) {
                DirectInviteContactViewModel directInviteContactViewModel = (DirectInviteContactViewModel) obj;
                if (this.A02 != directInviteContactViewModel.A02 || !C14360o3.A0K(this.A07, directInviteContactViewModel.A07) || !C14360o3.A0K(this.A06, directInviteContactViewModel.A06) || this.A01 != directInviteContactViewModel.A01 || this.A00 != directInviteContactViewModel.A00 || this.A03 != directInviteContactViewModel.A03 || this.A04 != directInviteContactViewModel.A04 || this.A05 != directInviteContactViewModel.A05) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A05);
    }

    public final int hashCode() {
        return (((((((((((((this.A02 * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC25227BEk.A07(this.A06)) * 31) + this.A01) * 31) + this.A00) * 31) + this.A03) * 31) + this.A04) * 31) + this.A05;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        DirectInviteContactViewModel directInviteContactViewModel = (DirectInviteContactViewModel) obj;
        C14360o3.A0B(directInviteContactViewModel, 0);
        return C14360o3.A0K(this.A06, directInviteContactViewModel.A06);
    }

    public DirectInviteContactViewModel(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6) {
        this.A02 = i;
        this.A07 = str;
        this.A06 = str2;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A05 = i6;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AbstractC167017dG.A0j();
    }
}
