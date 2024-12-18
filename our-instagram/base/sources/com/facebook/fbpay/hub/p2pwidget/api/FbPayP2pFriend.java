package com.facebook.fbpay.hub.p2pwidget.api;

import X.AbstractC25235BEs;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63475SlG;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class FbPayP2pFriend implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(91);
    public final Uri A00;
    public final Uri A01;
    public final Uri A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayP2pFriend) {
                FbPayP2pFriend fbPayP2pFriend = (FbPayP2pFriend) obj;
                if (!C14360o3.A0K(this.A03, fbPayP2pFriend.A03) || !C14360o3.A0K(this.A04, fbPayP2pFriend.A04) || !C14360o3.A0K(this.A05, fbPayP2pFriend.A05) || !C14360o3.A0K(this.A00, fbPayP2pFriend.A00) || !C14360o3.A0K(this.A01, fbPayP2pFriend.A01) || !C14360o3.A0K(this.A02, fbPayP2pFriend.A02) || !C14360o3.A0K(this.A06, fbPayP2pFriend.A06) || !C14360o3.A0K(this.A07, fbPayP2pFriend.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((AbstractC63311ShH.A02(this.A03) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25235BEs.A06(this.A05)) * 31) + AbstractC25235BEs.A06(this.A00)) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A06)) * 31) + AbstractC25235BEs.A06(this.A07);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58322PtE.A1E(parcel, this.A03, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A04, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A05, 0, 1);
        AbstractC58323PtF.A1A(parcel, this.A00, i);
        AbstractC58323PtF.A1A(parcel, this.A01, i);
        AbstractC58323PtF.A1A(parcel, this.A02, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
    }

    public FbPayP2pFriend(Parcel parcel) {
        ClassLoader A0g = AbstractC58319PtB.A0g(this);
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Uri) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (Uri) parcel.readParcelable(A0g);
        }
        this.A02 = parcel.readInt() != 0 ? (Uri) parcel.readParcelable(A0g) : null;
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
    }
}
