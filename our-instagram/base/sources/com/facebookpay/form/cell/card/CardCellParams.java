package com.facebookpay.form.cell.card;

import X.C14360o3;
import X.UvU;
import android.os.Parcel;
import com.facebookpay.form.cell.text.TextCellParams;
import java.util.List;

/* loaded from: classes11.dex */
public final class CardCellParams extends TextCellParams {
    public final int A00;
    public final List A01;
    public final boolean A02;

    @Override // com.facebookpay.form.cell.text.TextCellParams, com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeList(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public CardCellParams(UvU uvU) {
        super(uvU);
        this.A01 = uvU.A01;
        this.A00 = uvU.A00;
        this.A02 = uvU.A02;
    }
}
