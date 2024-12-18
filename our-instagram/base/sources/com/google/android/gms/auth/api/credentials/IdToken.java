package com.google.android.gms.auth.api.credentials;

import X.AbstractC128825rw;
import X.AbstractC31171DnF;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C3U5;
import X.C63470SlB;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* loaded from: classes10.dex */
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(97);
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdToken) {
                IdToken idToken = (IdToken) obj;
                if (!SSI.A01(this.A00, idToken.A00) || !SSI.A01(this.A01, idToken.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public IdToken(String str, String str2) {
        C3U5.A08(AbstractC31171DnF.A1X(str), "account type string cannot be null or empty");
        C3U5.A08(AbstractC31171DnF.A1X(str2), "id token string cannot be null or empty");
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC58322PtE.A1D(parcel, this.A00);
        AbstractC128825rw.A0B(parcel, this.A01);
        AbstractC128825rw.A06(parcel, A04);
    }
}
