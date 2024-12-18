package com.instagram.settings2.core.view;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class SettingsScreenConfirmBottomSheetFragment$Item extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(62);
    public final Integer A00;
    public final String A01;

    public SettingsScreenConfirmBottomSheetFragment$Item(String str, Integer num) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SettingsScreenConfirmBottomSheetFragment$Item) {
                SettingsScreenConfirmBottomSheetFragment$Item settingsScreenConfirmBottomSheetFragment$Item = (SettingsScreenConfirmBottomSheetFragment$Item) obj;
                if (!C14360o3.A0K(this.A01, settingsScreenConfirmBottomSheetFragment$Item.A01) || !C14360o3.A0K(this.A00, settingsScreenConfirmBottomSheetFragment$Item.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int intValue;
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        Integer num = this.A00;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00);
    }
}
