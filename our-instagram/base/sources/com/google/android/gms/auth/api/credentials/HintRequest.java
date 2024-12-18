package com.google.android.gms.auth.api.credentials;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C3U5;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* loaded from: classes10.dex */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(96);
    public final int A00;
    public final CredentialPickerConfig A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final String[] A06;
    public final boolean A07;

    public HintRequest(CredentialPickerConfig credentialPickerConfig, String str, String str2, String[] strArr, int i, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        C3U5.A02(credentialPickerConfig);
        this.A01 = credentialPickerConfig;
        this.A04 = z;
        this.A07 = z2;
        C3U5.A02(strArr);
        this.A06 = strArr;
        if (i < 2) {
            this.A05 = true;
            return;
        }
        this.A05 = z3;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0A(parcel, this.A01, 1, i, false);
        AbstractC128825rw.A09(parcel, 2, this.A04);
        AbstractC128825rw.A09(parcel, 3, this.A07);
        AbstractC128825rw.A0H(parcel, this.A06, 4);
        AbstractC128825rw.A09(parcel, 5, this.A05);
        AbstractC128825rw.A0C(parcel, this.A02, 6, false);
        AbstractC128825rw.A0C(parcel, this.A03, 7, false);
        AbstractC58319PtB.A1C(parcel, this.A00, A04);
    }
}
