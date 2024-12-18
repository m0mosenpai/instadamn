package com.instagram.creatormessaging.intf;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.FanClubCategoryType;

/* loaded from: classes6.dex */
public final class CategorySelectionScreenArgs extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(85);
    public final FanClubCategoryType A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CategorySelectionScreenArgs) {
                CategorySelectionScreenArgs categorySelectionScreenArgs = (CategorySelectionScreenArgs) obj;
                if (this.A00 != categorySelectionScreenArgs.A00 || !C14360o3.A0K(this.A01, categorySelectionScreenArgs.A01)) {
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
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public CategorySelectionScreenArgs(FanClubCategoryType fanClubCategoryType, String str) {
        AbstractC167017dG.A1P(fanClubCategoryType, str);
        this.A00 = fanClubCategoryType;
        this.A01 = str;
    }
}
