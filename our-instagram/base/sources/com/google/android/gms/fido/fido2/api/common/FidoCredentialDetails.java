package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.AbstractC64537TIt;
import X.C63471SlC;
import X.RMJ;
import X.SSI;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes10.dex */
public class FidoCredentialDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(6);
    public final long A00;
    public final AbstractC64537TIt A01;
    public final AbstractC64537TIt A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final Account A07;
    public final boolean A08;

    public FidoCredentialDetails(Account account, String str, String str2, byte[] bArr, byte[] bArr2, long j, boolean z, boolean z2, boolean z3) {
        RMJ A01;
        if (bArr == null) {
            A01 = null;
        } else {
            A01 = AbstractC64537TIt.A01(bArr, bArr.length);
        }
        RMJ A012 = AbstractC64537TIt.A01(bArr2, bArr2.length);
        this.A03 = str;
        this.A04 = str2;
        this.A01 = A01;
        this.A02 = A012;
        this.A05 = z;
        this.A06 = z2;
        this.A00 = j;
        this.A07 = account;
        this.A08 = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
        if (!SSI.A01(this.A03, fidoCredentialDetails.A03) || !SSI.A01(this.A04, fidoCredentialDetails.A04) || !SSI.A01(this.A01, fidoCredentialDetails.A01) || !SSI.A01(this.A02, fidoCredentialDetails.A02) || this.A05 != fidoCredentialDetails.A05 || this.A06 != fidoCredentialDetails.A06 || this.A08 != fidoCredentialDetails.A08 || this.A00 != fidoCredentialDetails.A00) {
            return false;
        }
        return SSI.A00(this.A07, fidoCredentialDetails.A07);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A04, this.A01, this.A02, Boolean.valueOf(this.A05), Boolean.valueOf(this.A06), Boolean.valueOf(this.A08), Long.valueOf(this.A00), this.A07});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        boolean A1Q = AbstractC58319PtB.A1Q(parcel, this.A03);
        AbstractC128825rw.A0B(parcel, this.A04);
        AbstractC128825rw.A0F(parcel, AbstractC58322PtE.A1Z(this.A01), 3, A1Q);
        AbstractC128825rw.A0F(parcel, this.A02.A03(), 4, A1Q);
        AbstractC128825rw.A09(parcel, 5, this.A05);
        AbstractC128825rw.A09(parcel, 6, this.A06);
        AbstractC128825rw.A08(parcel, 7, this.A00);
        AbstractC128825rw.A0A(parcel, this.A07, 8, i, A1Q);
        AbstractC128825rw.A09(parcel, 9, this.A08);
        AbstractC128825rw.A06(parcel, A04);
    }
}
