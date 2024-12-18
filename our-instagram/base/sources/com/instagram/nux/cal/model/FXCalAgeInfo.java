package com.instagram.nux.cal.model;

import X.C41856IgA;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class FXCalAgeInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(92);
    public int A00;
    public Boolean A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r0.booleanValue() == false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            java.lang.Boolean r0 = r3.A01
            if (r0 == 0) goto Lb
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 != 0) goto Lc
        Lb:
            r2 = 0
        Lc:
            java.lang.String r0 = r3.A06
            r4.writeString(r0)
            java.lang.String r0 = r3.A02
            r4.writeString(r0)
            java.lang.String r0 = r3.A04
            r4.writeString(r0)
            java.lang.String r0 = r3.A03
            r4.writeString(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L34
            r4.writeBoolean(r2)
        L29:
            java.lang.String r0 = r3.A05
            r4.writeString(r0)
            int r0 = r3.A00
            r4.writeInt(r0)
            return
        L34:
            r4.writeInt(r2)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.cal.model.FXCalAgeInfo.writeToParcel(android.os.Parcel, int):void");
    }

    public FXCalAgeInfo(Parcel parcel) {
        boolean z;
        this.A06 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        if (Build.VERSION.SDK_INT >= 29) {
            z = parcel.readBoolean();
        } else {
            z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
        }
        this.A01 = Boolean.valueOf(z);
        this.A05 = parcel.readString();
        this.A00 = parcel.readInt();
    }

    public FXCalAgeInfo() {
    }
}
