package com.google.android.gms.common;

import X.AbstractC128825rw;
import X.C206149Aw;
import X.C62715SNe;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C206149Aw(36);
    public final String A00;

    @Deprecated
    public final int A01;
    public final long A02;

    public final long A00() {
        long j = this.A02;
        return j == -1 ? this.A01 : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.A00;
            String str2 = feature.A00;
            if (str == null ? str2 == null : str.equals(str2)) {
                if (A00() == feature.A00()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, Long.valueOf(A00())});
    }

    public final String toString() {
        C62715SNe c62715SNe = new C62715SNe(this);
        c62715SNe.A00(this.A00, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        c62715SNe.A00(Long.valueOf(A00()), "version");
        return c62715SNe.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A01 = AbstractC128825rw.A01(parcel, 20293);
        AbstractC128825rw.A0C(parcel, this.A00, 1, false);
        AbstractC128825rw.A07(parcel, 2, this.A01);
        AbstractC128825rw.A08(parcel, 3, A00());
        AbstractC128825rw.A06(parcel, A01);
    }

    public Feature(String str, long j) {
        this.A00 = str;
        this.A02 = j;
        this.A01 = -1;
    }

    public Feature(String str, int i, long j) {
        this.A00 = str;
        this.A01 = i;
        this.A02 = j;
    }
}
