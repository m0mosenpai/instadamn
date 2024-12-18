package com.instagram.model.shopping;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C22P;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class ShoppingCameraSurveyMetadata extends C0T6 implements Parcelable {
    public static final C41856IgA CREATOR = new C41856IgA(19);
    public int A00;
    public long A01;
    public C22P A02;
    public User A03;
    public String A04;
    public String A05;
    public final HashSet A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCameraSurveyMetadata) {
                ShoppingCameraSurveyMetadata shoppingCameraSurveyMetadata = (ShoppingCameraSurveyMetadata) obj;
                if (!C14360o3.A0K(this.A04, shoppingCameraSurveyMetadata.A04) || !C14360o3.A0K(this.A03, shoppingCameraSurveyMetadata.A03) || !C14360o3.A0K(this.A05, shoppingCameraSurveyMetadata.A05) || this.A02 != shoppingCameraSurveyMetadata.A02 || this.A00 != shoppingCameraSurveyMetadata.A00 || this.A01 != shoppingCameraSurveyMetadata.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A05);
        parcel.writeSerializable(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }

    public final int hashCode() {
        int A0J = (AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0K(this.A05, (AbstractC166987dD.A0J(this.A04) + AbstractC167017dG.A0M(this.A03)) * 31)) + this.A00) * 31;
        long j = this.A01;
        return A0J + ((int) (j ^ (j >>> 32)));
    }

    public ShoppingCameraSurveyMetadata(C22P c22p, User user, String str, String str2, int i, long j) {
        AbstractC167017dG.A1Q(str, str2);
        this.A04 = str;
        this.A03 = user;
        this.A05 = str2;
        this.A02 = c22p;
        this.A00 = i;
        this.A01 = j;
        this.A06 = AbstractC166987dD.A1H();
    }
}
