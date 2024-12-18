package com.instagram.model.direct;

import X.AbstractC43592JPx;
import X.C14360o3;
import X.C55343Oh9;
import X.EnumC53305Nhh;
import android.os.Parcel;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

/* loaded from: classes9.dex */
public final class DirectSearchMetaAIResponse implements DirectSearchResult {
    public static final C55343Oh9 CREATOR = C55343Oh9.A00(66);
    public EnumC53305Nhh A00;
    public List A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeTypedList(this.A01);
        parcel.writeString(this.A00.toString());
    }

    @Override // com.instagram.model.direct.DirectSearchResult
    public final String AEL() {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("| promptListSize: %s | showKeyboardSendKey: %s |", "DirectSearchMetaAIResponse", AbstractC43592JPx.A0s(this.A01), this.A00.toString());
        C14360o3.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }
}
