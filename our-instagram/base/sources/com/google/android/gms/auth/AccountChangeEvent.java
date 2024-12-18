package com.google.android.gms.auth;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC58322PtE;
import X.C3U5;
import X.C63474SlF;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes10.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(26);
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (obj instanceof AccountChangeEvent) {
            if (obj != this) {
                AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
                if (this.A00 != accountChangeEvent.A00 || this.A03 != accountChangeEvent.A03 || !SSI.A01(this.A04, accountChangeEvent.A04) || this.A01 != accountChangeEvent.A01 || this.A02 != accountChangeEvent.A02 || !SSI.A01(this.A05, accountChangeEvent.A05)) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Long.valueOf(this.A03), this.A04, Integer.valueOf(this.A01), Integer.valueOf(this.A02), this.A05});
    }

    public final String toString() {
        String str;
        int i = this.A01;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "RENAMED_TO";
                    }
                } else {
                    str = "RENAMED_FROM";
                }
            } else {
                str = "REMOVED";
            }
        } else {
            str = "ADDED";
        }
        String str2 = this.A04;
        String str3 = this.A05;
        int i2 = this.A02;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AccountChangeEvent {accountName = ");
        A1C.append(str2);
        A1C.append(", changeType = ");
        A1C.append(str);
        A1C.append(", changeData = ");
        A1C.append(str3);
        A1C.append(", eventIndex = ");
        A1C.append(i2);
        return AbstractC166997dE.A0x("}", A1C);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = AbstractC58322PtE.A06(parcel, this.A00);
        AbstractC128825rw.A08(parcel, 2, this.A03);
        AbstractC128825rw.A0C(parcel, this.A04, 3, false);
        AbstractC128825rw.A07(parcel, 4, this.A01);
        AbstractC128825rw.A07(parcel, 5, this.A02);
        AbstractC128825rw.A0C(parcel, this.A05, 6, false);
        AbstractC128825rw.A06(parcel, A06);
    }

    public AccountChangeEvent(String str, String str2, int i, int i2, int i3, long j) {
        this.A00 = i;
        this.A03 = j;
        C3U5.A02(str);
        this.A04 = str;
        this.A01 = i2;
        this.A02 = i3;
        this.A05 = str2;
    }
}
