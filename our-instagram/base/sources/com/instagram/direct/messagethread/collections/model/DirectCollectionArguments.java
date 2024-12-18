package com.instagram.direct.messagethread.collections.model;

import X.AbstractC001900j;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.C0T6;
import X.C14360o3;
import X.FUP;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class DirectCollectionArguments extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(16);
    public final ImageUrl A00;
    public final DirectThreadKey A01;
    public final Boolean A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final boolean A0B;

    public DirectCollectionArguments(ImageUrl imageUrl, DirectThreadKey directThreadKey, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z) {
        AbstractC167007dF.A1F(str, 2, num);
        C14360o3.A0B(list, 12);
        this.A00 = imageUrl;
        this.A07 = str;
        this.A0B = z;
        this.A03 = num;
        this.A05 = str2;
        this.A04 = str3;
        this.A08 = str4;
        this.A01 = directThreadKey;
        this.A09 = str5;
        this.A02 = bool;
        this.A06 = str6;
        this.A0A = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectCollectionArguments) {
                DirectCollectionArguments directCollectionArguments = (DirectCollectionArguments) obj;
                if (!C14360o3.A0K(this.A00, directCollectionArguments.A00) || !C14360o3.A0K(this.A07, directCollectionArguments.A07) || this.A0B != directCollectionArguments.A0B || this.A03 != directCollectionArguments.A03 || !C14360o3.A0K(this.A05, directCollectionArguments.A05) || !C14360o3.A0K(this.A04, directCollectionArguments.A04) || !C14360o3.A0K(this.A08, directCollectionArguments.A08) || !C14360o3.A0K(this.A01, directCollectionArguments.A01) || !C14360o3.A0K(this.A09, directCollectionArguments.A09) || !C14360o3.A0K(this.A02, directCollectionArguments.A02) || !C14360o3.A0K(this.A06, directCollectionArguments.A06) || !C14360o3.A0K(this.A0A, directCollectionArguments.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeString(FUP.A01(this.A03));
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A09);
        Boolean bool = this.A02;
        if (bool == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = bool.booleanValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.A06);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A0A);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
    }

    public final String A00() {
        int A04;
        String str = this.A05;
        if (str != null && (A04 = AbstractC001900j.A04(str, '_', 0)) != -1) {
            return AbstractC25227BEk.A0w(str, 0, A04);
        }
        return null;
    }

    public final int hashCode() {
        int A0D = AbstractC167007dF.A0D(this.A0B, AbstractC166997dE.A0K(this.A07, AbstractC167017dG.A0M(this.A00) * 31));
        Integer num = this.A03;
        return AbstractC166987dD.A0I(this.A0A, (((((((((((((AbstractC167017dG.A0L(num, FUP.A01(num), A0D) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC25227BEk.A07(this.A06)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DirectCollectionArguments(android.content.Context r14, X.C38321qM r15, java.lang.Integer r16, java.lang.String r17, boolean r18) {
        /*
            r13 = this;
            r0 = 2
            r5 = r17
            X.C14360o3.A0B(r5, r0)
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r15.A1q(r14)
            if (r1 != 0) goto L10
            com.instagram.common.typedurl.ImageUrl r1 = r15.A1S()
        L10:
            java.lang.String r6 = r15.getId()
            r2 = 0
            X.0sl r11 = X.C16930sl.A00
            r0 = r13
            r4 = r16
            r12 = r18
            r3 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r10 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.messagethread.collections.model.DirectCollectionArguments.<init>(android.content.Context, X.1qM, java.lang.Integer, java.lang.String, boolean):void");
    }
}
