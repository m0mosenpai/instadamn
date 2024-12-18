package com.instagram.direct.appwidget;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class DirectThreadWidgetItem extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(90);
    public boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectThreadWidgetItem) {
                DirectThreadWidgetItem directThreadWidgetItem = (DirectThreadWidgetItem) obj;
                if (!C14360o3.A0K(this.A04, directThreadWidgetItem.A04) || !C14360o3.A0K(this.A05, directThreadWidgetItem.A05) || !C14360o3.A0K(this.A03, directThreadWidgetItem.A03) || !C14360o3.A0K(this.A01, directThreadWidgetItem.A01) || !C14360o3.A0K(this.A02, directThreadWidgetItem.A02) || this.A00 != directThreadWidgetItem.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public final int hashCode() {
        int A0K = (((AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A05, AbstractC167017dG.A0O(this.A04) * 31)) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02)) * 31;
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return A0K + i;
    }

    public DirectThreadWidgetItem(String str, String str2, String str3, String str4, String str5, boolean z) {
        AbstractC167017dG.A1R(str2, str3);
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A01 = str4;
        this.A02 = str5;
        this.A00 = z;
    }
}
