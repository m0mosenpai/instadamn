package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC33661EuB;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes6.dex */
public final class AudienceList extends C0T6 implements AudienceListIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(54);
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    @Override // com.instagram.api.schemas.AudienceListIntf
    public final AudienceList Er0() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudienceList) {
                AudienceList audienceList = (AudienceList) obj;
                if (this.A02 != audienceList.A02 || this.A03 != audienceList.A03 || this.A04 != audienceList.A04 || !C14360o3.A0K(this.A00, audienceList.A00) || !C14360o3.A0K(this.A01, audienceList.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.api.schemas.AudienceListIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAudienceList", AbstractC33661EuB.A00(this));
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166997dE.A0K(this.A00, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A03, AbstractC25225BEi.A08(this.A02)))));
    }

    public AudienceList(String str, String str2, boolean z, boolean z2, boolean z3) {
        AbstractC167017dG.A1S(str, str2);
        this.A02 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // com.instagram.api.schemas.AudienceListIntf
    public final String BNl() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.AudienceListIntf
    public final boolean CSR() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.AudienceListIntf
    public final boolean CXV() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.AudienceListIntf
    public final boolean CXW() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.AudienceListIntf
    public final String getName() {
        return this.A01;
    }
}
