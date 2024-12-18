package com.google.android.gms.auth.api.credentials;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C3U5;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* loaded from: classes10.dex */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(95);
    public final int A00;
    public final CredentialPickerConfig A01;
    public final CredentialPickerConfig A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final String[] A07;
    public final boolean A08;

    public CredentialRequest(CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, String str, String str2, String[] strArr, int i, boolean z, boolean z2, boolean z3) {
        CredentialPickerConfig credentialPickerConfig3 = credentialPickerConfig2;
        CredentialPickerConfig credentialPickerConfig4 = credentialPickerConfig;
        this.A00 = i;
        this.A05 = z;
        C3U5.A02(strArr);
        this.A07 = strArr;
        this.A01 = credentialPickerConfig == null ? new CredentialPickerConfig(2, 1, false, true, false) : credentialPickerConfig4;
        this.A02 = credentialPickerConfig2 == null ? new CredentialPickerConfig(2, 1, false, true, false) : credentialPickerConfig3;
        if (i < 3) {
            this.A06 = true;
        } else {
            this.A06 = z2;
            this.A03 = str;
            this.A04 = str2;
        }
        this.A08 = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A09(parcel, 1, this.A05);
        AbstractC128825rw.A0H(parcel, this.A07, 2);
        AbstractC128825rw.A0A(parcel, this.A01, 3, i, false);
        AbstractC128825rw.A0A(parcel, this.A02, 4, i, false);
        AbstractC128825rw.A09(parcel, 5, this.A06);
        AbstractC128825rw.A0C(parcel, this.A03, 6, false);
        AbstractC128825rw.A0C(parcel, this.A04, 7, false);
        AbstractC128825rw.A09(parcel, 8, this.A08);
        AbstractC58319PtB.A1C(parcel, this.A00, A04);
    }
}
