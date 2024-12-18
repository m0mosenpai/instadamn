package com.facebookpay.form.cell.text.util;

import X.C14360o3;
import X.C70221WIe;
import X.EnumC61219RhJ;
import android.os.Parcel;

/* loaded from: classes11.dex */
public final class CvvTextFieldHandler implements TextFieldHandler {
    public static final C70221WIe CREATOR = new C70221WIe(90);
    public final EnumC61219RhJ A00;

    @Override // com.facebookpay.form.cell.text.util.TextFieldHandler
    public final boolean CL3(String str, String str2) {
        String str3;
        if (str != null && str2 != null && str2.length() > 0 && !str.equals(str2)) {
            if (this.A00 == EnumC61219RhJ.A0B) {
                str3 = "••••";
            } else {
                str3 = "•••";
            }
            if (!str2.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        EnumC61219RhJ enumC61219RhJ = this.A00;
        if (enumC61219RhJ != null) {
            str = enumC61219RhJ.name();
        } else {
            str = null;
        }
        parcel.writeString(str);
    }

    public CvvTextFieldHandler(EnumC61219RhJ enumC61219RhJ) {
        this.A00 = enumC61219RhJ;
    }
}
