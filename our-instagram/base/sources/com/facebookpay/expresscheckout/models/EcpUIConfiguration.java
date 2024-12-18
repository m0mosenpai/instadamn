package com.facebookpay.expresscheckout.models;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C70221WIe;
import X.JQ0;
import X.VEY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class EcpUIConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(51);
    public final AuthScreenStyle A00;
    public final VEY A01;
    public final VEY A02;
    public final VEY A03;
    public final VEY A04;
    public final VEY A05;
    public final VEY A06;
    public final VEY A07;
    public final EcpNuxLearnMoreScreenStyle A08;
    public final ItemDetails A09;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A04);
        AbstractC166997dE.A1I(parcel, this.A02);
        AbstractC166997dE.A1I(parcel, this.A05);
        AbstractC166997dE.A1I(parcel, this.A06);
        AbstractC166997dE.A1I(parcel, this.A01);
        AbstractC166997dE.A1I(parcel, this.A07);
        this.A09.writeToParcel(parcel, i);
        AuthScreenStyle authScreenStyle = this.A00;
        if (authScreenStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authScreenStyle.writeToParcel(parcel, i);
        }
        EcpNuxLearnMoreScreenStyle ecpNuxLearnMoreScreenStyle = this.A08;
        if (ecpNuxLearnMoreScreenStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ecpNuxLearnMoreScreenStyle.writeToParcel(parcel, i);
        }
        AbstractC166997dE.A1I(parcel, this.A03);
    }

    public EcpUIConfiguration(AuthScreenStyle authScreenStyle, VEY vey, VEY vey2, VEY vey3, VEY vey4, VEY vey5, VEY vey6, VEY vey7, EcpNuxLearnMoreScreenStyle ecpNuxLearnMoreScreenStyle, ItemDetails itemDetails) {
        JQ0.A1O(vey, vey2, vey3, vey4, vey5);
        AbstractC167017dG.A1U(vey6, itemDetails);
        C14360o3.A0B(vey7, 10);
        this.A04 = vey;
        this.A02 = vey2;
        this.A05 = vey3;
        this.A06 = vey4;
        this.A01 = vey5;
        this.A07 = vey6;
        this.A09 = itemDetails;
        this.A00 = authScreenStyle;
        this.A08 = ecpNuxLearnMoreScreenStyle;
        this.A03 = vey7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EcpUIConfiguration() {
        /*
            r11 = this;
            r1 = 0
            X.VEY r2 = X.VEY.A0D
            X.VEY r3 = X.VEY.A0B
            X.VEY r4 = X.VEY.A0E
            X.VEY r5 = X.VEY.A0F
            X.VEY r6 = X.VEY.A0A
            X.VEY r7 = X.VEY.A0c
            java.lang.Integer r0 = X.C05F.A00
            com.facebookpay.expresscheckout.models.ItemDetails r10 = new com.facebookpay.expresscheckout.models.ItemDetails
            r10.<init>(r0, r1)
            r0 = r11
            r8 = r2
            r9 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.models.EcpUIConfiguration.<init>():void");
    }
}
