package com.instagram.ui.emoji;

import X.C14360o3;
import android.os.Parcel;
import com.facebook.ui.emoji.model.Emoji;

/* loaded from: classes4.dex */
public final class EmojiSkinTone$createVariations$baseEmoji$1 extends Emoji {
    public final /* synthetic */ String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public EmojiSkinTone$createVariations$baseEmoji$1(String str) {
        this.A00 = str;
    }
}
