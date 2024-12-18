package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.AnonymousClass001;
import X.C3U5;
import X.C63474SlF;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(77);
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        if (!SSI.A01(this.A00, publicKeyCredentialRpEntity.A00) || !SSI.A01(this.A01, publicKeyCredentialRpEntity.A01)) {
            return false;
        }
        return SSI.A00(this.A02, publicKeyCredentialRpEntity.A02);
    }

    public final int hashCode() {
        return AbstractC58319PtB.A06(this.A00, this.A01, this.A02);
    }

    public final String toString() {
        return AnonymousClass001.A15("PublicKeyCredentialRpEntity{\n id='", this.A00, "', \n name='", this.A01, "', \n icon='", this.A02, "'}");
    }

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        C3U5.A02(str);
        this.A00 = str;
        C3U5.A02(str2);
        this.A01 = str2;
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0B(parcel, this.A00);
        AbstractC128825rw.A0C(parcel, this.A01, 3, false);
        AbstractC58322PtE.A1F(parcel, this.A02, A04, false);
    }
}
