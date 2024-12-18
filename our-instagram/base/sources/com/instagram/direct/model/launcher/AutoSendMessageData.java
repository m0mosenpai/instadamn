package com.instagram.direct.model.launcher;

import X.C0T6;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class AutoSendMessageData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(24);
    public final String A00;
    public final String A01;
    public final String A02;

    public AutoSendMessageData(String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AutoSendMessageData) {
                AutoSendMessageData autoSendMessageData = (AutoSendMessageData) obj;
                if (!C14360o3.A0K(this.A02, autoSendMessageData.A02) || !C14360o3.A0K(this.A01, autoSendMessageData.A01) || !C14360o3.A0K(this.A00, autoSendMessageData.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A02.hashCode() * 31;
        String str = this.A01;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A00;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
