package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC167007dF;
import X.AbstractC37301Gc2;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.AnonymousClass001;
import X.C3U5;
import X.C63474SlF;
import X.SSI;
import X.SSJ;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class BrowserPublicKeyCredentialCreationOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(98);
    public final Uri A00;
    public final PublicKeyCredentialCreationOptions A01;
    public final byte[] A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialCreationOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) obj;
        if (!SSI.A01(this.A01, browserPublicKeyCredentialCreationOptions.A01)) {
            return false;
        }
        return SSI.A00(this.A00, browserPublicKeyCredentialCreationOptions.A00);
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A01, this.A00);
    }

    public final String toString() {
        byte[] bArr = this.A02;
        return AnonymousClass001.A15("BrowserPublicKeyCredentialCreationOptions{\n publicKeyCredentialCreationOptions=", String.valueOf(this.A01), ", \n origin=", String.valueOf(this.A00), ", \n clientDataHash=", SSJ.A00(bArr), "}");
    }

    public BrowserPublicKeyCredentialCreationOptions(Uri uri, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, byte[] bArr) {
        C3U5.A02(publicKeyCredentialCreationOptions);
        this.A01 = publicKeyCredentialCreationOptions;
        C3U5.A02(uri);
        C3U5.A08(AbstractC167007dF.A1W(uri.getScheme()), "origin scheme must be non-empty");
        C3U5.A08(uri.getAuthority() != null, "origin authority must be non-empty");
        this.A00 = uri;
        boolean z = true;
        if (bArr != null && bArr.length != 32) {
            z = false;
        }
        C3U5.A08(z, "clientDataHash must be 32 bytes long");
        this.A02 = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        boolean A1U = AbstractC58322PtE.A1U(parcel, this.A01, i);
        AbstractC128825rw.A0A(parcel, this.A00, 3, i, A1U);
        AbstractC128825rw.A0F(parcel, this.A02, 4, A1U);
        AbstractC128825rw.A06(parcel, A04);
    }
}
