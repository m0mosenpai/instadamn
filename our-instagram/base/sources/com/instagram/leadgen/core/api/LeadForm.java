package com.instagram.leadgen.core.api;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25231BEo;
import X.AbstractC25233BEq;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class LeadForm extends C0T6 implements Parcelable, LeadFormIntf {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(11);
    public final ImageUrl A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public LeadForm(ImageUrl imageUrl, Boolean bool, String str, String str2, String str3, List list) {
        AbstractC25233BEq.A0w(2, str, str2, list);
        this.A00 = imageUrl;
        this.A02 = str;
        this.A03 = str2;
        this.A05 = list;
        this.A01 = bool;
        this.A04 = str3;
    }

    @Override // com.instagram.leadgen.core.api.LeadFormIntf
    public final LeadForm F51() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadForm) {
                LeadForm leadForm = (LeadForm) obj;
                if (!C14360o3.A0K(this.A00, leadForm.A00) || !C14360o3.A0K(this.A02, leadForm.A02) || !C14360o3.A0K(this.A03, leadForm.A03) || !C14360o3.A0K(this.A05, leadForm.A05) || !C14360o3.A0K(this.A01, leadForm.A01) || !C14360o3.A0K(this.A04, leadForm.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A05);
        while (A0u.hasNext()) {
            ((LeadGenInfoFieldData) A0u.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(AbstractC37304Gc5.A1Y(parcel, this.A01) ? 1 : 0);
        parcel.writeString(this.A04);
    }

    @Override // com.instagram.leadgen.core.api.LeadFormIntf
    public final String B7u() {
        return this.A03;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC167017dG.A0M(this.A00) * 31))) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC25227BEk.A07(this.A04);
    }
}
