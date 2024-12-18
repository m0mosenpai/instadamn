package com.spotify.sdk.android.auth;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31172DnG;
import X.AbstractC31179DnN;
import X.AbstractC43593JPy;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.C55344OhA;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public class AuthorizationRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(83);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String[] A05;
    public final Map A06;
    public final boolean A07;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Uri A00() {
        int length;
        Uri.Builder builder = new Uri.Builder();
        String str = "android-sdk";
        Uri.Builder appendQueryParameter = builder.scheme("https").authority("accounts.spotify.com").appendPath("authorize").appendQueryParameter("client_id", this.A01).appendQueryParameter("response_type", this.A03).appendQueryParameter("redirect_uri", this.A02).appendQueryParameter("show_dialog", String.valueOf(this.A07)).appendQueryParameter("utm_source", "spotify-sdk").appendQueryParameter("utm_medium", "android-sdk");
        String str2 = this.A00;
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        appendQueryParameter.appendQueryParameter("utm_campaign", str);
        String[] strArr = this.A05;
        if (strArr != null && (length = strArr.length) > 0) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            int i = 0;
            do {
                A1C.append(strArr[i]);
                A1C.append(" ");
                i++;
            } while (i < length);
            builder.appendQueryParameter("scope", A1C.toString().trim());
        }
        String str3 = this.A04;
        if (str3 != null) {
            builder.appendQueryParameter(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, str3);
        }
        Map map = this.A06;
        if (map.size() > 0) {
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                builder.appendQueryParameter(AbstractC31172DnG.A17(A1K), AbstractC58318PtA.A0p(A1K));
            }
        }
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeStringArray(this.A05);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A00);
        Bundle A0b = AbstractC166987dD.A0b();
        Iterator A15 = AbstractC166997dE.A15(this.A06);
        while (A15.hasNext()) {
            AbstractC31179DnN.A0o(A0b, A15);
        }
        parcel.writeBundle(A0b);
    }

    public AuthorizationRequest(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.createStringArray();
        this.A07 = AbstractC43593JPy.A1Y(parcel.readByte());
        this.A06 = AbstractC166987dD.A1G();
        this.A00 = parcel.readString();
        Bundle readBundle = parcel.readBundle(AbstractC58319PtB.A0g(this));
        Iterator A14 = AbstractC58319PtB.A14(readBundle);
        while (A14.hasNext()) {
            String A1B = AbstractC166987dD.A1B(A14);
            this.A06.put(A1B, readBundle.getString(A1B));
        }
    }

    public AuthorizationRequest(String str, String str2, String str3, Map map, String[] strArr) {
        this.A01 = str;
        this.A03 = IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE;
        this.A02 = str2;
        this.A04 = null;
        this.A05 = strArr;
        this.A07 = false;
        this.A06 = map;
        this.A00 = str3;
    }
}
