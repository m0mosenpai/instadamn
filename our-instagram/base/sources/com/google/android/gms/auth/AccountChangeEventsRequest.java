package com.google.android.gms.auth;

import X.AbstractC128825rw;
import X.AbstractC58322PtE;
import X.C63474SlF;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(27);
    public int A00;
    public Account A01;

    @Deprecated
    public String A02;
    public final int A03;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = AbstractC58322PtE.A06(parcel, this.A03);
        AbstractC128825rw.A07(parcel, 2, this.A00);
        AbstractC128825rw.A0C(parcel, this.A02, 3, false);
        AbstractC128825rw.A0A(parcel, this.A01, 4, i, false);
        AbstractC128825rw.A06(parcel, A06);
    }

    public AccountChangeEventsRequest(Account account, String str, int i, int i2) {
        this.A03 = i;
        this.A00 = i2;
        this.A02 = str;
        if (account == null && !TextUtils.isEmpty(str)) {
            this.A01 = new Account(str, "com.google");
        } else {
            this.A01 = account;
        }
    }

    public AccountChangeEventsRequest() {
        this.A03 = 1;
    }
}
