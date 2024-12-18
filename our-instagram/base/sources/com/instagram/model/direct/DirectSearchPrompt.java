package com.instagram.model.direct;

import X.C14360o3;
import X.C55343Oh9;
import X.EnumC50680MYy;
import android.os.Parcel;
import com.facebook.common.stringformat.StringFormatUtil;

/* loaded from: classes6.dex */
public final class DirectSearchPrompt implements DirectSearchResult {
    public static final C55343Oh9 CREATOR = new C55343Oh9(67);
    public EnumC50680MYy A00;
    public String A01;
    public String A02;
    public String A03;

    public DirectSearchPrompt(EnumC50680MYy enumC50680MYy, String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str3, 4);
        this.A03 = str;
        this.A00 = enumC50680MYy;
        this.A02 = str2;
        this.A01 = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.model.direct.DirectSearchResult
    public final String AEL() {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("| promptText: %s | promptType: %s | promptId: %s | promptEmoji: %s |", "DirectSearchPrompt", this.A03, this.A00, this.A02, this.A01);
        C14360o3.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }
}
