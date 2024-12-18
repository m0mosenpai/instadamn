package com.instagram.direct.messagethread.reactions.model;

import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import X.InterfaceC66482zP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;

/* loaded from: classes2.dex */
public final class ReactionViewModel extends C0T6 implements InterfaceC66482zP, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(77);
    public final int A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final MessagingUser A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public ReactionViewModel(ImageUrl imageUrl, ImageUrl imageUrl2, MessagingUser messagingUser, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str, 1);
        this.A05 = str;
        this.A06 = str2;
        this.A00 = i;
        this.A02 = imageUrl;
        this.A04 = str3;
        this.A08 = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A03 = messagingUser;
        this.A01 = imageUrl2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReactionViewModel) {
                ReactionViewModel reactionViewModel = (ReactionViewModel) obj;
                if (!C14360o3.A0K(this.A05, reactionViewModel.A05) || !C14360o3.A0K(this.A06, reactionViewModel.A06) || this.A00 != reactionViewModel.A00 || !C14360o3.A0K(this.A02, reactionViewModel.A02) || !C14360o3.A0K(this.A04, reactionViewModel.A04) || this.A08 != reactionViewModel.A08 || this.A07 != reactionViewModel.A07 || this.A09 != reactionViewModel.A09 || !C14360o3.A0K(this.A03, reactionViewModel.A03) || !C14360o3.A0K(this.A01, reactionViewModel.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A01, i);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.A05.hashCode() * 31;
        String str = this.A06;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (((hashCode5 + hashCode) * 31) + this.A00) * 31;
        ImageUrl imageUrl = this.A02;
        if (imageUrl == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = imageUrl.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.A04;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        int i5 = 1237;
        if (this.A08) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A07) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A09) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        MessagingUser messagingUser = this.A03;
        if (messagingUser == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = messagingUser.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        ImageUrl imageUrl2 = this.A01;
        if (imageUrl2 != null) {
            i = imageUrl2.hashCode();
        }
        return i11 + i;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
