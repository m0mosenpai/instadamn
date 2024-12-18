package com.instagram.model.direct;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class DirectPendingLayeredXma extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(63);
    public final ExtendedImageUrl A00;
    public final ExtendedImageUrl A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectPendingLayeredXma) {
                DirectPendingLayeredXma directPendingLayeredXma = (DirectPendingLayeredXma) obj;
                if (!C14360o3.A0K(this.A04, directPendingLayeredXma.A04) || !C14360o3.A0K(this.A03, directPendingLayeredXma.A03) || !C14360o3.A0K(this.A02, directPendingLayeredXma.A02) || this.A05 != directPendingLayeredXma.A05 || !C14360o3.A0K(this.A01, directPendingLayeredXma.A01) || !C14360o3.A0K(this.A00, directPendingLayeredXma.A00) || this.A06 != directPendingLayeredXma.A06) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A06 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A06, (((AbstractC167007dF.A0D(this.A05, ((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00)) * 31);
    }

    public DirectPendingLayeredXma(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, User user, String str, String str2, boolean z, boolean z2) {
        this.A04 = str;
        this.A03 = str2;
        this.A02 = user;
        this.A05 = z;
        this.A01 = extendedImageUrl;
        this.A00 = extendedImageUrl2;
        this.A06 = z2;
    }
}
