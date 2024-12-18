package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AbstractC64537TIt;
import X.AnonymousClass001;
import X.C3U5;
import X.C63474SlF;
import X.RMJ;
import X.SSI;
import X.SSJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(79);
    public final AbstractC64537TIt A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        if (!SSI.A01(this.A00, publicKeyCredentialUserEntity.A00) || !SSI.A01(this.A01, publicKeyCredentialUserEntity.A01) || !SSI.A01(this.A02, publicKeyCredentialUserEntity.A02)) {
            return false;
        }
        return SSI.A00(this.A03, publicKeyCredentialUserEntity.A03);
    }

    public final int hashCode() {
        return AbstractC58321PtD.A0C(this.A00, this.A01, this.A02, this.A03);
    }

    public final String toString() {
        return AnonymousClass001.A18("PublicKeyCredentialUserEntity{\n id=", SSJ.A00(this.A00.A03()), ", \n name='", this.A01, "', \n icon='", this.A02, "', \n displayName='", this.A03, "'}");
    }

    public PublicKeyCredentialUserEntity(String str, byte[] bArr, String str2, String str3) {
        RMJ A0f = AbstractC58321PtD.A0f(bArr);
        C3U5.A02(A0f);
        this.A00 = A0f;
        C3U5.A02(str);
        this.A01 = str;
        this.A02 = str2;
        C3U5.A02(str3);
        this.A03 = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        boolean A1R = AbstractC58319PtB.A1R(parcel, this.A00.A03());
        AbstractC128825rw.A0C(parcel, this.A01, 3, A1R);
        AbstractC128825rw.A0C(parcel, this.A02, 4, A1R);
        AbstractC128825rw.A0C(parcel, this.A03, 5, A1R);
        AbstractC128825rw.A06(parcel, A04);
    }
}
