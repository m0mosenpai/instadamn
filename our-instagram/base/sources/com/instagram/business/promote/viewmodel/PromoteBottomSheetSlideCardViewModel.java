package com.instagram.business.promote.viewmodel;

import X.C00O;
import X.C14360o3;
import X.C70220WId;
import X.VG4;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes11.dex */
public final class PromoteBottomSheetSlideCardViewModel implements Parcelable {
    public static final C70220WId CREATOR = new C70220WId(90);
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public VG4 A02;
    public CharSequence A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A07);
        TextUtils.writeToParcel(this.A03, parcel, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        VG4 vg4 = this.A02;
        if (vg4 != null) {
            parcel.writeString(vg4.toString());
            String str2 = this.A06;
            if (str2 != null) {
                parcel.writeString(str2);
                return;
            }
            str = "promoteComponentValue";
        } else {
            str = "promoteScreen";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public PromoteBottomSheetSlideCardViewModel(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, VG4 vg4, CharSequence charSequence, String str, String str2, String str3, String str4) {
        this.A07 = str;
        this.A03 = charSequence;
        this.A02 = vg4;
        this.A06 = str4;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = onClickListener;
        this.A01 = onClickListener2;
    }

    public PromoteBottomSheetSlideCardViewModel() {
    }
}
