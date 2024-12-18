package com.instagram.user.userlist.intf;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;

/* loaded from: classes6.dex */
public final class SocialContextFollowListFragmentConfig extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(26);
    public int A00;
    public User A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final FollowListData A07;
    public final String A08;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SocialContextFollowListFragmentConfig) {
                SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig = (SocialContextFollowListFragmentConfig) obj;
                if (!C14360o3.A0K(this.A08, socialContextFollowListFragmentConfig.A08) || !C14360o3.A0K(this.A07, socialContextFollowListFragmentConfig.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A07, i);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A07, AbstractC166987dD.A0J(this.A08));
    }

    public SocialContextFollowListFragmentConfig(FollowListData followListData, String str) {
        AbstractC167017dG.A1P(str, followListData);
        this.A08 = str;
        this.A07 = followListData;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SocialContextFollowListFragmentConfig(displayedProfileUserId=");
        A1C.append(this.A08);
        A1C.append(", followListData=");
        return AbstractC167017dG.A0o(this.A07, A1C);
    }
}
