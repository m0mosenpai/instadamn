package com.facebook.graphql.modelutil.parcel;

import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphservice.interfaces.Tree;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* loaded from: classes10.dex */
public class TreeParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(96);
    public Tree A00;
    public final int A01;
    public final String A02;
    public final byte[] A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        try {
            String str = this.A02;
            int i2 = this.A01;
            byte[] bArr = this.A03;
            parcel.writeString(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
            parcel.writeString(str);
            parcel.writeInt(i2);
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public TreeParcelable(byte[] bArr, int i, String str) {
        this.A02 = str;
        this.A01 = i;
        this.A03 = bArr;
    }
}
