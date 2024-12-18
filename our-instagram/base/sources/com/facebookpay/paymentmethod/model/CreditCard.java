package com.facebookpay.paymentmethod.model;

import X.AbstractC001900j;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25227BEk;
import X.AnonymousClass001;
import X.C14360o3;
import X.C2JS;
import X.C60500R1a;
import X.C63470SlB;
import X.EnumC39598He8;
import X.EnumC61212RhC;
import X.EnumC61219RhJ;
import X.EnumC72407Xcu;
import X.QRJ;
import X.QRK;
import X.QRL;
import X.UWg;
import X.XJm;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.dextricks.JITProfilePQR;

/* loaded from: classes10.dex */
public class CreditCard implements PaymentMethod {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(19);
    public XJm A00;
    public final UWg A01;
    public final QRL A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public CreditCard(QRL qrl, boolean z, boolean z2) {
        UWg uWg;
        C14360o3.A0B(qrl, 1);
        this.A02 = qrl;
        this.A05 = z;
        this.A04 = z2;
        C2JS optionalTreeField = qrl.getOptionalTreeField(13, "billing_address", QRJ.class, -213805893);
        if (optionalTreeField != null) {
            XJm xJm = (XJm) optionalTreeField.A01(C60500R1a.class, 1653097835);
            C14360o3.A07(xJm);
            this.A00 = xJm;
            String optionalStringField = qrl.getOptionalStringField(14, "card_holder_name");
            this.A03 = optionalStringField == null ? "" : optionalStringField;
            C2JS optionalTreeField2 = qrl.getOptionalTreeField(8, "fields_needing_verification(product_id:$payment_product_id)", QRK.class, -1386770929);
            if (optionalTreeField2 != null) {
                uWg = (UWg) optionalTreeField2.A01(UWg.class, 2109346557);
            } else {
                uWg = null;
            }
            this.A01 = uWg;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final EnumC61212RhC A00() {
        QRL qrl = this.A02;
        EnumC61212RhC enumC61212RhC = EnumC61212RhC.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        EnumC61212RhC enumC61212RhC2 = (EnumC61212RhC) qrl.getOptionalEnumField(11, "cc_type", enumC61212RhC);
        if (enumC61212RhC2 == null) {
            return enumC61212RhC;
        }
        return enumC61212RhC2;
    }

    public final EnumC61219RhJ A01() {
        EnumC39598He8 enumC39598He8 = (EnumC39598He8) this.A02.getOptionalEnumField(3, "card_association", EnumC39598He8.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        if (enumC39598He8 != null) {
            switch (enumC39598He8.ordinal()) {
                case 1:
                    return EnumC61219RhJ.A0B;
                case 4:
                    return EnumC61219RhJ.A0D;
                case 7:
                    return EnumC61219RhJ.A0H;
                case 9:
                    return EnumC61219RhJ.A0I;
                case 11:
                    return EnumC61219RhJ.A0J;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    return EnumC61219RhJ.A0M;
            }
        }
        return EnumC61219RhJ.A0L;
    }

    public final String A02() {
        String optionalStringField;
        QRL qrl = this.A02;
        String optionalStringField2 = qrl.getOptionalStringField(7, "expiry_month");
        if (optionalStringField2 != null && !AbstractC001900j.A0T(optionalStringField2) && (optionalStringField = qrl.getOptionalStringField(6, "expiry_year")) != null && !AbstractC001900j.A0T(optionalStringField)) {
            String optionalStringField3 = qrl.getOptionalStringField(7, "expiry_month");
            if (optionalStringField3 != null) {
                if (optionalStringField3.length() == 2) {
                    String optionalStringField4 = qrl.getOptionalStringField(6, "expiry_year");
                    if (optionalStringField4 != null) {
                        if (optionalStringField4.length() >= 4) {
                            String optionalStringField5 = qrl.getOptionalStringField(7, "expiry_month");
                            String optionalStringField6 = qrl.getOptionalStringField(6, "expiry_year");
                            if (optionalStringField6 != null) {
                                return AnonymousClass001.A0R(optionalStringField5, AbstractC25227BEk.A0w(optionalStringField6, 2, 4));
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        return "";
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                return "";
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        return "";
    }

    public final boolean A03() {
        if (this instanceof TokenizedCard) {
            return ((TokenizedCard) this).A04;
        }
        return this.A04;
    }

    public final boolean A04() {
        if (this instanceof TokenizedCard) {
            return ((TokenizedCard) this).A05;
        }
        return this.A05;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public final String AtA() {
        String A09 = this.A02.A09("credential_id");
        if (A09 == null) {
            return "";
        }
        return A09;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public final EnumC72407Xcu AtB() {
        EnumC72407Xcu enumC72407Xcu = (EnumC72407Xcu) this.A02.getOptionalEnumField(15, "credential_type", EnumC72407Xcu.A09);
        if (enumC72407Xcu == null) {
            return EnumC72407Xcu.A03;
        }
        return enumC72407Xcu;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public final String BEy() {
        String A0B = this.A02.A0B("card_association_image_url");
        if (A0B == null) {
            return "";
        }
        return A0B;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public final String getSubtitle() {
        String optionalStringField = this.A02.getOptionalStringField(9, "cc_subtitle");
        if (optionalStringField == null) {
            return "";
        }
        return optionalStringField;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public final String getTitle() {
        String optionalStringField = this.A02.getOptionalStringField(10, "cc_title");
        if (optionalStringField == null) {
            return "";
        }
        return optionalStringField;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        if (this instanceof TokenizedCard) {
            TokenizedCard tokenizedCard = (TokenizedCard) this;
            C14360o3.A0B(parcel, 0);
            parcel.writeValue(tokenizedCard.A00);
            parcel.writeValue(tokenizedCard.A01);
            parcel.writeInt(tokenizedCard.A05 ? 1 : 0);
            i2 = tokenizedCard.A04;
        } else {
            C14360o3.A0B(parcel, 0);
            parcel.writeValue(this.A02);
            parcel.writeInt(this.A05 ? 1 : 0);
            i2 = this.A04;
        }
        parcel.writeInt(i2);
    }
}
