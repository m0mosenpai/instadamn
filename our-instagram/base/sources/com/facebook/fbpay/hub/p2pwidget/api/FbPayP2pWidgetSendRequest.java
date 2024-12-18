package com.facebook.fbpay.hub.p2pwidget.api;

import X.AbstractC25235BEs;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C1LC;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public class FbPayP2pWidgetSendRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(92);
    public final ImmutableList A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayP2pWidgetSendRequest) {
                FbPayP2pWidgetSendRequest fbPayP2pWidgetSendRequest = (FbPayP2pWidgetSendRequest) obj;
                if (!C14360o3.A0K(this.A00, fbPayP2pWidgetSendRequest.A00) || !C14360o3.A0K(this.A01, fbPayP2pWidgetSendRequest.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC63311ShH.A02(this.A00) * 31) + AbstractC25235BEs.A06(this.A01);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C1LC A0d = AbstractC58322PtE.A0d(parcel, this.A00);
        while (A0d.hasNext()) {
            parcel.writeParcelable((FbPayP2pFriend) A0d.next(), i);
        }
        String str = this.A01;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FbPayP2pWidgetSendRequest(Parcel parcel) {
        String readString;
        ClassLoader A0g = AbstractC58319PtB.A0g(this);
        int readInt = parcel.readInt();
        FbPayP2pFriend[] fbPayP2pFriendArr = new FbPayP2pFriend[readInt];
        for (int i = 0; i < readInt; i++) {
            fbPayP2pFriendArr[i] = parcel.readParcelable(A0g);
        }
        this.A00 = ImmutableList.copyOf(fbPayP2pFriendArr);
        if (parcel.readInt() == 0) {
            readString = null;
        } else {
            readString = parcel.readString();
        }
        this.A01 = readString;
    }
}
