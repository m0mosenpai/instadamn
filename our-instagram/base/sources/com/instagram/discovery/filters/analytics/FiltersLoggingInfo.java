package com.instagram.discovery.filters.analytics;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC37304Gc5;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableMap;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public class FiltersLoggingInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(56);
    public String A00;
    public HashMap A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final String A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ImmutableMap A00() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        HashMap hashMap = this.A01;
        if (hashMap != null) {
            Iterator A14 = AbstractC166997dE.A14(hashMap);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                if (!"sort_by".equals(A1K.getKey())) {
                    builder.put(A1K.getKey(), A1K.getValue());
                }
            }
        }
        builder.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A00);
        return builder.buildOrThrow();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A04);
        parcel.writeSerializable(this.A01);
    }

    public FiltersLoggingInfo(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = (User) AbstractC37304Gc5.A04(parcel, User.class);
        this.A04 = parcel.readString();
        this.A01 = (HashMap) parcel.readSerializable();
    }
}
