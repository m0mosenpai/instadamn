package com.google.android.gms.fido.fido2.api.common;

import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class PublicKeyCredentialType implements Parcelable {
    public static final /* synthetic */ PublicKeyCredentialType[] A00;
    public static final PublicKeyCredentialType A01;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    static {
        PublicKeyCredentialType publicKeyCredentialType = new PublicKeyCredentialType();
        A01 = publicKeyCredentialType;
        A00 = new PublicKeyCredentialType[]{publicKeyCredentialType};
        CREATOR = C63474SlF.A01(78);
    }

    public static PublicKeyCredentialType valueOf(String str) {
        return (PublicKeyCredentialType) Enum.valueOf(PublicKeyCredentialType.class, str);
    }

    public static PublicKeyCredentialType[] values() {
        return (PublicKeyCredentialType[]) A00.clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("public-key");
    }

    public static PublicKeyCredentialType A00(String str) {
        for (PublicKeyCredentialType publicKeyCredentialType : values()) {
            if (str.equals("public-key")) {
                return publicKeyCredentialType;
            }
        }
        throw new Exception(String.format("PublicKeyCredentialType %s not supported", str));
    }
}
