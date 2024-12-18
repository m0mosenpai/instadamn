package com.facebookpay.form.cell.label.paymentmethod;

import X.AbstractC167007dF;
import X.AbstractC25231BEo;
import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.label.LabelCellParams;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class PaymentMethodLabelCellParams extends LabelCellParams {
    public static final Parcelable.Creator CREATOR = new C70221WIe(77);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final List A05;

    @Override // com.facebookpay.form.cell.label.LabelCellParams, com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A05);
        while (A0u.hasNext()) {
            parcel.writeInt(AbstractC167007dF.A0B(A0u));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PaymentMethodLabelCellParams(java.util.List r3, int r4, int r5, int r6, int r7, int r8) {
        /*
            r2 = this;
            X.Uuv r1 = new X.Uuv
            r1.<init>(r4)
            r1.A03 = r5
            r1.A02 = r8
            r0 = 1
            r1.A07 = r0
            r2.<init>(r1)
            r2.A01 = r4
            r2.A03 = r5
            r2.A04 = r6
            r2.A00 = r7
            r2.A02 = r8
            r2.A05 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellParams.<init>(java.util.List, int, int, int, int, int):void");
    }
}
