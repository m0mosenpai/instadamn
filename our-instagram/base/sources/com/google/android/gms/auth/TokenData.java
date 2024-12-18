package com.google.android.gms.auth;

import X.AbstractC128825rw;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.C3U5;
import X.C63474SlF;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(29);
    public final int A00;
    public final String A01;
    public final Long A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.A01, tokenData.A01) || !SSI.A01(this.A02, tokenData.A02) || this.A05 != tokenData.A05 || this.A06 != tokenData.A06 || !SSI.A01(this.A04, tokenData.A04)) {
            return false;
        }
        return SSI.A00(this.A03, tokenData.A03);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, Boolean.valueOf(this.A05), Boolean.valueOf(this.A06), this.A04, this.A03});
    }

    public TokenData(Long l, String str, String str2, List list, int i, boolean z, boolean z2) {
        this.A00 = i;
        C3U5.A04(str);
        this.A01 = str;
        this.A02 = l;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = list;
        this.A03 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        AbstractC128825rw.A0B(parcel, this.A01);
        Long l = this.A02;
        if (l != null) {
            parcel.writeInt(524291);
            AbstractC58318PtA.A1G(parcel, l);
        }
        AbstractC128825rw.A09(parcel, 4, this.A05);
        AbstractC128825rw.A09(parcel, 5, this.A06);
        AbstractC128825rw.A0D(parcel, this.A04, 6);
        AbstractC128825rw.A0C(parcel, this.A03, 7, false);
        AbstractC128825rw.A06(parcel, A04);
    }
}
