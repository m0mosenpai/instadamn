package com.instagram.leadgen.organic.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC25234BEr;
import X.AbstractC25236BEt;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class LeadGenConsumerFormData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(28);
    public LeadGenFormBaseQuestion A00;
    public final int A01;
    public final long A02;
    public final ImageUrl A03;
    public final ImageUrl A04;
    public final LeadGenPrivacyPolicy A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;
    public final boolean A0D;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenConsumerFormData) {
                LeadGenConsumerFormData leadGenConsumerFormData = (LeadGenConsumerFormData) obj;
                if (!C14360o3.A0K(this.A08, leadGenConsumerFormData.A08) || !C14360o3.A0K(this.A06, leadGenConsumerFormData.A06) || this.A02 != leadGenConsumerFormData.A02 || !C14360o3.A0K(this.A07, leadGenConsumerFormData.A07) || !C14360o3.A0K(this.A03, leadGenConsumerFormData.A03) || this.A01 != leadGenConsumerFormData.A01 || !C14360o3.A0K(this.A09, leadGenConsumerFormData.A09) || this.A0D != leadGenConsumerFormData.A0D || this.A0C != leadGenConsumerFormData.A0C || !C14360o3.A0K(this.A0A, leadGenConsumerFormData.A0A) || !C14360o3.A0K(this.A04, leadGenConsumerFormData.A04) || !C14360o3.A0K(this.A0B, leadGenConsumerFormData.A0B) || !C14360o3.A0K(this.A05, leadGenConsumerFormData.A05) || !C14360o3.A0K(this.A00, leadGenConsumerFormData.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A02);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A04, i);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A0B);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A0B, (((AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0D, AbstractC166997dE.A0K(this.A09, (AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0K(this.A07, AbstractC25236BEt.A01(this.A02, AbstractC166997dE.A0K(this.A06, AbstractC166987dD.A0J(this.A08))))) + this.A01) * 31))) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public LeadGenConsumerFormData(ImageUrl imageUrl, ImageUrl imageUrl2, LeadGenFormBaseQuestion leadGenFormBaseQuestion, LeadGenPrivacyPolicy leadGenPrivacyPolicy, String str, String str2, String str3, String str4, String str5, List list, int i, long j, boolean z, boolean z2) {
        AbstractC25234BEr.A1P(str, str2, str3);
        AbstractC167007dF.A1H(imageUrl, 5, str4);
        C14360o3.A0B(list, 12);
        this.A08 = str;
        this.A06 = str2;
        this.A02 = j;
        this.A07 = str3;
        this.A03 = imageUrl;
        this.A01 = i;
        this.A09 = str4;
        this.A0D = z;
        this.A0C = z2;
        this.A0A = str5;
        this.A04 = imageUrl2;
        this.A0B = list;
        this.A05 = leadGenPrivacyPolicy;
        this.A00 = leadGenFormBaseQuestion;
    }
}
