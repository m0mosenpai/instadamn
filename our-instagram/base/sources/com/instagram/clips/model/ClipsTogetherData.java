package com.instagram.clips.model;

import X.AnonymousClass001;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class ClipsTogetherData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(3);
    public final String A00;
    public final boolean A01;

    public ClipsTogetherData(String str, boolean z) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsTogetherData) {
                ClipsTogetherData clipsTogetherData = (ClipsTogetherData) obj;
                if (!C14360o3.A0K(this.A00, clipsTogetherData.A00) || this.A01 != clipsTogetherData.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0m("ClipsTogetherData(threadId=", this.A00, ", isInitiator=", ')', this.A01);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return hashCode + i;
    }
}
