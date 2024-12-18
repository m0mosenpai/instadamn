package com.instagram.direct.messagethread.interaction.longpressaction;

import X.AbstractC166987dD;
import X.C0T6;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class LongPressActionLabelSpan extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(18);
    public final int A00;
    public final String A01;

    public LongPressActionLabelSpan(String str, int i) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LongPressActionLabelSpan) {
                LongPressActionLabelSpan longPressActionLabelSpan = (LongPressActionLabelSpan) obj;
                if (!C14360o3.A0K(this.A01, longPressActionLabelSpan.A01) || this.A00 != longPressActionLabelSpan.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + this.A00;
    }
}
