package com.instagram.direct.model.mentions;

import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class MentionedEntity extends C0T6 implements Parcelable {
    public static final C206139Av CREATOR = new C206139Av(81);
    public String A03 = "";
    public int A01 = 0;
    public int A00 = 0;
    public int A02 = 0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MentionedEntity) {
                MentionedEntity mentionedEntity = (MentionedEntity) obj;
                if (!C14360o3.A0K(this.A03, mentionedEntity.A03) || this.A01 != mentionedEntity.A01 || this.A00 != mentionedEntity.A00 || this.A02 != mentionedEntity.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A03.hashCode() * 31) + this.A01) * 31) + this.A00) * 31) + this.A02;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
    }
}
