package com.instagram.creatormessaging.intf;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class ChannelCreationFlowExtraArgs extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(86);
    public final CategorySelectionScreenArgs A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChannelCreationFlowExtraArgs) {
                ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs = (ChannelCreationFlowExtraArgs) obj;
                if (!C14360o3.A0K(this.A00, channelCreationFlowExtraArgs.A00) || !C14360o3.A0K(this.A01, channelCreationFlowExtraArgs.A01) || !C14360o3.A0K(this.A02, channelCreationFlowExtraArgs.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        CategorySelectionScreenArgs categorySelectionScreenArgs = this.A00;
        if (categorySelectionScreenArgs == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            categorySelectionScreenArgs.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public ChannelCreationFlowExtraArgs(CategorySelectionScreenArgs categorySelectionScreenArgs, String str, String str2) {
        this.A00 = categorySelectionScreenArgs;
        this.A01 = str;
        this.A02 = str2;
    }

    public ChannelCreationFlowExtraArgs() {
        this(null, null, null);
    }
}
