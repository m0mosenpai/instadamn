package com.facebook.login;

import X.AbstractC166987dD;
import X.AbstractC37304Gc5;
import X.AnonymousClass001;
import X.C05F;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessToken;

/* loaded from: classes10.dex */
public class LoginClient$Result implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(43);
    public final AccessToken A00;
    public final LoginClient$Request A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static LoginClient$Result A00(AccessToken accessToken, LoginClient$Request loginClient$Request) {
        return new LoginClient$Result(accessToken, loginClient$Request, C05F.A00, null, null);
    }

    public static LoginClient$Result A01(LoginClient$Request loginClient$Request, String str) {
        return new LoginClient$Result(null, loginClient$Request, C05F.A01, str, null);
    }

    public static LoginClient$Result A02(LoginClient$Request loginClient$Request, String str, String str2, String str3) {
        return new LoginClient$Result(null, loginClient$Request, C05F.A0C, AnonymousClass001.A0R(str, str2), str3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        switch (this.A02.intValue()) {
            case 1:
                str = "CANCEL";
                break;
            case 2:
                str = "ERROR";
                break;
            default:
                str = "SUCCESS";
                break;
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
    }

    public LoginClient$Result(Parcel parcel) {
        Integer num;
        String readString = parcel.readString();
        if (readString.equals("SUCCESS")) {
            num = C05F.A00;
        } else if (readString.equals("CANCEL")) {
            num = C05F.A01;
        } else if (readString.equals("ERROR")) {
            num = C05F.A0C;
        } else {
            throw AbstractC166987dD.A12(readString);
        }
        this.A02 = num;
        this.A00 = (AccessToken) AbstractC37304Gc5.A04(parcel, AccessToken.class);
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = (LoginClient$Request) AbstractC37304Gc5.A04(parcel, LoginClient$Request.class);
    }

    public LoginClient$Result(AccessToken accessToken, LoginClient$Request loginClient$Request, Integer num, String str, String str2) {
        this.A01 = loginClient$Request;
        this.A00 = accessToken;
        this.A04 = str;
        this.A02 = num;
        this.A03 = str2;
    }
}
