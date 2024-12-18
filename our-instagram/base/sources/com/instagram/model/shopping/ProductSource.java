package com.instagram.model.shopping;

import X.AbstractC166997dE;
import X.AbstractC31177DnL;
import X.C41856IgA;
import X.EnumC39617HeR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ProductSource implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(16);
    public EnumC39617HeR A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public ProductSource(EnumC39617HeR enumC39617HeR, String str) {
        this.A01 = str;
        this.A00 = enumC39617HeR;
        this.A04 = null;
        this.A03 = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r1.equals(r0) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L56
            r2 = 0
            if (r5 == 0) goto L1e
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L1e
            com.instagram.model.shopping.ProductSource r5 = (com.instagram.model.shopping.ProductSource) r5
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 == 0) goto L1f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L22
        L1e:
            return r2
        L1f:
            if (r0 == 0) goto L22
            return r2
        L22:
            X.HeR r1 = r4.A00
            X.HeR r0 = r5.A00
            if (r1 != r0) goto L1e
            java.lang.String r1 = r4.A04
            java.lang.String r0 = r5.A04
            if (r1 == 0) goto L35
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L38
            return r2
        L35:
            if (r0 == 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.A03
            java.lang.String r0 = r5.A03
            if (r1 == 0) goto L45
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L48
            return r2
        L45:
            if (r0 == 0) goto L48
            return r2
        L48:
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            if (r1 == 0) goto L53
            boolean r3 = r1.equals(r0)
            return r3
        L53:
            if (r0 == 0) goto L56
            r3 = 0
        L56:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.shopping.ProductSource.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (((AbstractC166997dE.A0J(this.A00, AbstractC31177DnL.A04(this.A01) * 31) + AbstractC31177DnL.A04(this.A04)) * 31) + AbstractC31177DnL.A04(this.A03)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A0J + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00.toString());
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public ProductSource() {
    }
}
