package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC37301Gc2;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AnonymousClass001;
import X.C3U5;
import X.C63474SlF;
import X.RjS;
import X.RjU;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(75);
    public final COSEAlgorithmIdentifier A00;
    public final PublicKeyCredentialType A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        if (!this.A01.equals(publicKeyCredentialParameters.A01)) {
            return false;
        }
        return AbstractC58320PtC.A1X(this.A00, publicKeyCredentialParameters.A00);
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A01, this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A11("PublicKeyCredentialParameters{\n type=", String.valueOf(this.A01), ", \n algorithm=", String.valueOf(this.A00), "\n }");
    }

    public PublicKeyCredentialParameters(String str, int i) {
        C3U5.A02(str);
        try {
            this.A01 = PublicKeyCredentialType.A00(str);
            C3U5.A02(Integer.valueOf(i));
            try {
                this.A00 = COSEAlgorithmIdentifier.A00(i);
            } catch (RjS e) {
                throw new IllegalArgumentException(e);
            }
        } catch (RjU e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0B(parcel, this.A01.toString());
        int Aap = this.A00.A00.Aap();
        if (Integer.valueOf(Aap) != null) {
            parcel.writeInt(262147);
            parcel.writeInt(Aap);
        }
        AbstractC128825rw.A06(parcel, A04);
    }
}
