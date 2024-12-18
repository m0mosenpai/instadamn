package com.google.android.gms.auth.api.credentials;

import X.AbstractC128825rw;
import X.AbstractC167007dF;
import X.AbstractC58319PtB;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* loaded from: classes10.dex */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(94);
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public CredentialPickerConfig(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        this.A02 = z;
        this.A03 = z2;
        if (i < 2) {
            this.A01 = true == z3 ? 3 : 1;
        } else {
            this.A01 = i2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A09(parcel, 1, this.A02);
        AbstractC128825rw.A09(parcel, 2, this.A03);
        int i2 = this.A01;
        AbstractC128825rw.A09(parcel, 3, AbstractC167007dF.A1P(i2, 3));
        AbstractC128825rw.A07(parcel, 4, i2);
        AbstractC58319PtB.A1C(parcel, this.A00, A04);
    }
}
