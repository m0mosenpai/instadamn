package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC62368S8s;
import X.AbstractC64537TIt;
import X.AnonymousClass001;
import X.C3U5;
import X.C63474SlF;
import X.RM5;
import X.RMJ;
import X.RjU;
import X.SSI;
import X.SSJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes10.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public static final RM5 A03 = RM5.A02(new Object[]{AbstractC62368S8s.A00, AbstractC62368S8s.A01}, 2);
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(74);
    public final PublicKeyCredentialType A00;
    public final AbstractC64537TIt A01;
    public final List A02;

    public PublicKeyCredentialDescriptor(String str, List list, byte[] bArr) {
        RMJ A01 = AbstractC64537TIt.A01(bArr, bArr.length);
        C3U5.A02(str);
        try {
            this.A00 = PublicKeyCredentialType.A00(str);
            C3U5.A02(A01);
            this.A01 = A01;
            this.A02 = list;
        } catch (RjU e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PublicKeyCredentialDescriptor) {
            PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
            if (this.A00.equals(publicKeyCredentialDescriptor.A00) && SSI.A01(this.A01, publicKeyCredentialDescriptor.A01)) {
                List list = this.A02;
                List list2 = publicKeyCredentialDescriptor.A02;
                if (list != null ? !(list2 == null || !list.containsAll(list2) || !list2.containsAll(list)) : list2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC58319PtB.A06(this.A00, this.A01, this.A02);
    }

    public final String toString() {
        return AnonymousClass001.A15("PublicKeyCredentialDescriptor{\n type=", String.valueOf(this.A00), ", \n id=", SSJ.A00(this.A01.A03()), ", \n transports=", String.valueOf(this.A02), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0B(parcel, this.A00.toString());
        AbstractC128825rw.A0F(parcel, this.A01.A03(), 3, false);
        AbstractC128825rw.A0E(parcel, this.A02, 4, false);
        AbstractC128825rw.A06(parcel, A04);
    }
}
