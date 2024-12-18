package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.AnonymousClass001;
import X.C3U5;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class FidoAppIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(5);
    public final String A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof FidoAppIdExtension)) {
            return false;
        }
        return this.A00.equals(((FidoAppIdExtension) obj).A00);
    }

    public final int hashCode() {
        return AbstractC58322PtE.A08(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0g("FidoAppIdExtension{appid='", this.A00, "'}");
    }

    public FidoAppIdExtension(String str) {
        C3U5.A02(str);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0B(parcel, this.A00);
        AbstractC128825rw.A06(parcel, A04);
    }
}
