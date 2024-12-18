package com.google.android.gms.common.internal;

import X.AbstractC128825rw;
import X.AbstractC58322PtE;
import X.C63474SlF;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(39);
    public final int A00;
    public final int A01;
    public final Account A02;
    public final GoogleSignInAccount A03;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = AbstractC58322PtE.A06(parcel, this.A00);
        boolean A1U = AbstractC58322PtE.A1U(parcel, this.A02, i);
        AbstractC128825rw.A07(parcel, 3, this.A01);
        AbstractC128825rw.A0A(parcel, this.A03, 4, i, A1U);
        AbstractC128825rw.A06(parcel, A06);
    }

    public zat(Account account, GoogleSignInAccount googleSignInAccount, int i, int i2) {
        this.A00 = i;
        this.A02 = account;
        this.A01 = i2;
        this.A03 = googleSignInAccount;
    }
}
