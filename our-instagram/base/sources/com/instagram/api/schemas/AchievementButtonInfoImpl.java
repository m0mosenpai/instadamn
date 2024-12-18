package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25226BEj;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class AchievementButtonInfoImpl extends C0T6 implements Parcelable, AchievementButtonInfo {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(28);
    public final AchievementButtonAction A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AchievementButtonInfoImpl) {
                AchievementButtonInfoImpl achievementButtonInfoImpl = (AchievementButtonInfoImpl) obj;
                if (this.A00 != achievementButtonInfoImpl.A00 || !C14360o3.A0K(this.A01, achievementButtonInfoImpl.A01) || !C14360o3.A0K(this.A02, achievementButtonInfoImpl.A02)) {
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
        parcel.writeString(this.A02);
    }

    @Override // com.instagram.api.schemas.AchievementButtonInfo
    public final String Aj7() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.AchievementButtonInfo
    public final String Aw9() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0G(this.A00)));
    }

    public AchievementButtonInfoImpl(AchievementButtonAction achievementButtonAction, String str, String str2) {
        AbstractC167027dH.A13(achievementButtonAction, str, str2);
        this.A00 = achievementButtonAction;
        this.A01 = str;
        this.A02 = str2;
    }
}
