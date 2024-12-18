package com.instagram.creation.genai.attribution.bottomsheet;

import X.AbstractC111324zv;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class CreationGenAIAttributionBottomSheetParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNM.A00(68);
    public final Integer A00;
    public final String A01;
    public final String A02;

    public CreationGenAIAttributionBottomSheetParams(String str, Integer num, String str2) {
        C14360o3.A0B(str, 2);
        this.A00 = num;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        switch (this.A00.intValue()) {
            case 1:
                str = "IMAGINE";
                break;
            case 2:
                str = AbstractC111324zv.A00(1480);
                break;
            case 3:
                str = "MEMU_IN_FEED";
                break;
            default:
                str = "IMAGINE_ME";
                break;
        }
        parcel.writeString(str);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
