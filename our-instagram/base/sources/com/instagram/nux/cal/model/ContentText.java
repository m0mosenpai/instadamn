package com.instagram.nux.cal.model;

import X.AbstractC31172DnG;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class ContentText implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(90);
    public Boolean A00;
    public Integer A01;
    public List A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        C14360o3.A0B(parcel, 0);
        Integer num = this.A01;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str2 = "PARAGRAPH";
                    break;
                case 2:
                    str2 = "BULLETED_LIST";
                    break;
                default:
                    str2 = "HEADER";
                    break;
            }
            Locale locale = Locale.getDefault();
            C14360o3.A07(locale);
            str = AbstractC31172DnG.A16(locale, str2);
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeStringList(this.A02);
        parcel.writeValue(this.A00);
    }
}
