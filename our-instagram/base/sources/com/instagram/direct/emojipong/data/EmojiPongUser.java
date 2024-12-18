package com.instagram.direct.emojipong.data;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class EmojiPongUser extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNM.A00(96);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmojiPongUser) {
                EmojiPongUser emojiPongUser = (EmojiPongUser) obj;
                if (!C14360o3.A0K(this.A03, emojiPongUser.A03) || !C14360o3.A0K(this.A04, emojiPongUser.A04) || !C14360o3.A0K(this.A01, emojiPongUser.A01) || !C14360o3.A0K(this.A02, emojiPongUser.A02) || this.A00 != emojiPongUser.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A03)) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02)) * 31) + this.A00;
    }

    public EmojiPongUser(String str, String str2, String str3, String str4, int i) {
        AbstractC167017dG.A1P(str, str2);
        this.A03 = str;
        this.A04 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A00 = i;
    }
}
