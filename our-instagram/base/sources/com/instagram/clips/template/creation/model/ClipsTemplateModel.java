package com.instagram.clips.template.creation.model;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC88493x6;
import X.C0T6;
import X.C110204xp;
import X.C14360o3;
import X.C22P;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public final class ClipsTemplateModel extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(8);
    public final C22P A00;
    public final C110204xp A01;
    public final User A02;
    public final String A03;
    public final String A04;

    public ClipsTemplateModel(C22P c22p, C110204xp c110204xp, User user, String str, String str2) {
        C14360o3.A0B(c22p, 4);
        this.A03 = str;
        this.A04 = str2;
        this.A01 = c110204xp;
        this.A00 = c22p;
        this.A02 = user;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsTemplateModel) {
                ClipsTemplateModel clipsTemplateModel = (ClipsTemplateModel) obj;
                if (!C14360o3.A0K(this.A03, clipsTemplateModel.A03) || !C14360o3.A0K(this.A04, clipsTemplateModel.A04) || !C14360o3.A0K(this.A01, clipsTemplateModel.A01) || this.A00 != clipsTemplateModel.A00 || !C14360o3.A0K(this.A02, clipsTemplateModel.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        C110204xp c110204xp = this.A01;
        C14360o3.A0B(c110204xp, 0);
        parcel.writeString(AbstractC88493x6.A00(c110204xp));
        C22P c22p = this.A00;
        C14360o3.A0B(c22p, 0);
        parcel.writeLong(c22p.A00);
        parcel.writeParcelable(this.A02, i);
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, ((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0O(this.A04)) * 31)) + AbstractC166997dE.A0I(this.A02);
    }
}
