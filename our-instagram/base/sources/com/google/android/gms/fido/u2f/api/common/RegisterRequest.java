package com.google.android.gms.fido.u2f.api.common;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63471SlC;
import X.RjZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

@Deprecated
/* loaded from: classes10.dex */
public class RegisterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(13);
    public final int A00;
    public final String A01;
    public final byte[] A02;
    public final ProtocolVersion A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RegisterRequest) {
                RegisterRequest registerRequest = (RegisterRequest) obj;
                if (Arrays.equals(this.A02, registerRequest.A02) && this.A03 == registerRequest.A03) {
                    String str = this.A01;
                    String str2 = registerRequest.A01;
                    if (str == null) {
                        if (str2 != null) {
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0I = AbstractC166987dD.A0I(this.A03, (Arrays.hashCode(this.A02) + 31) * 31);
        return (A0I * 31) + AbstractC167017dG.A0O(this.A01);
    }

    public RegisterRequest(String str, String str2, byte[] bArr, int i) {
        this.A00 = i;
        try {
            this.A03 = ProtocolVersion.A00(str);
            this.A02 = bArr;
            this.A01 = str2;
        } catch (RjZ e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        AbstractC128825rw.A0B(parcel, this.A03.toString());
        AbstractC128825rw.A0F(parcel, this.A02, 3, false);
        AbstractC58322PtE.A1F(parcel, this.A01, A04, false);
    }
}
