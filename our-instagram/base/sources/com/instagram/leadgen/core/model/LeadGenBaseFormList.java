package com.instagram.leadgen.core.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.leadgen.core.api.LeadForm;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class LeadGenBaseFormList extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(15);
    public XIGIGBoostCallToAction A00;
    public LeadForm A01;
    public String A02;
    public String A03;
    public List A04;
    public boolean A05;

    public LeadGenBaseFormList() {
        this(null, null, null, "", AbstractC166987dD.A1E(), false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenBaseFormList) {
                LeadGenBaseFormList leadGenBaseFormList = (LeadGenBaseFormList) obj;
                if (this.A00 != leadGenBaseFormList.A00 || !C14360o3.A0K(this.A01, leadGenBaseFormList.A01) || !C14360o3.A0K(this.A04, leadGenBaseFormList.A04) || !C14360o3.A0K(this.A02, leadGenBaseFormList.A02) || this.A05 != leadGenBaseFormList.A05 || !C14360o3.A0K(this.A03, leadGenBaseFormList.A03)) {
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
        parcel.writeParcelable(this.A01, i);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A04);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
        parcel.writeString(this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, AbstractC167007dF.A0D(this.A05, (AbstractC166997dE.A0J(this.A04, ((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02)) * 31));
    }

    public LeadGenBaseFormList(XIGIGBoostCallToAction xIGIGBoostCallToAction, LeadForm leadForm, String str, String str2, List list, boolean z) {
        C14360o3.A0B(str2, 6);
        this.A00 = xIGIGBoostCallToAction;
        this.A01 = leadForm;
        this.A04 = list;
        this.A02 = str;
        this.A05 = z;
        this.A03 = str2;
    }
}
