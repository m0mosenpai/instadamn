package com.instagram.shopping.model.productsource;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31171DnF;
import X.C193328hC;
import X.C37324GcR;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.ProductSource;

/* loaded from: classes7.dex */
public enum ProductSourceOverrideStatus implements Parcelable {
    NONE(-1, -1),
    BUSINESS_PARTNER(2131954113, 2131954112),
    ALREADY_TAGGED(2131954111, 2131954110);

    public static final Parcelable.Creator CREATOR = C37324GcR.A00(85);
    public final int A00;
    public final int A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void A00(Context context, ProductSource productSource) {
        String str;
        String str2 = "";
        if (productSource != null && ((str = productSource.A03) != null || (str = productSource.A04) != null || (str = productSource.A01) != null)) {
            str2 = str;
        }
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A05 = AbstractC166997dE.A0r(context.getResources(), str2, this.A01);
        A0I.A0r(AbstractC166997dE.A0r(context.getResources(), str2, this.A00));
        A0I.A07();
        A0I.A0s(true);
        AbstractC166987dD.A1W(A0I);
    }

    ProductSourceOverrideStatus(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
