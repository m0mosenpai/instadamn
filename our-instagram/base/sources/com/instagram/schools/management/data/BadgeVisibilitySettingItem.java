package com.instagram.schools.management.data;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import X.EnumC53288NhQ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class BadgeVisibilitySettingItem extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(52);
    public final EnumC53288NhQ A00;
    public final String A01;
    public final boolean A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BadgeVisibilitySettingItem) {
                BadgeVisibilitySettingItem badgeVisibilitySettingItem = (BadgeVisibilitySettingItem) obj;
                if (this.A00 != badgeVisibilitySettingItem.A00 || !C14360o3.A0K(this.A01, badgeVisibilitySettingItem.A01) || this.A02 != badgeVisibilitySettingItem.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0G(this.A00)));
    }

    public BadgeVisibilitySettingItem(EnumC53288NhQ enumC53288NhQ, String str, boolean z) {
        AbstractC167017dG.A1P(enumC53288NhQ, str);
        this.A00 = enumC53288NhQ;
        this.A01 = str;
        this.A02 = z;
    }
}
