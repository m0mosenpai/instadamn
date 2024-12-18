package com.instagram.ui.slidecardpageadapter;

import X.C55344OhA;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* loaded from: classes11.dex */
public class SlideCardViewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(14);
    public int A00;
    public int A01;
    public SpannableString A02;
    public View.OnClickListener A03;
    public View.OnClickListener A04;
    public ImageUrl A05;
    public ImageUrl A06;
    public CharSequence A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public List A0C;

    /* loaded from: classes9.dex */
    public class SlideCardSectionViewModel implements Parcelable {
        public static final Parcelable.Creator CREATOR = C55344OhA.A00(15);
        public int A00;
        public int A01;
        public int A02;
        public int A03;
        public Uri A04;
        public Uri A05;
        public String A06;
        public String A07;
        public String A08;
        public boolean A09;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.A03);
            parcel.writeString(this.A08);
            parcel.writeString(this.A07);
            parcel.writeInt(this.A01);
            parcel.writeParcelable(this.A05, i);
            parcel.writeInt(this.A02);
            parcel.writeInt(this.A09 ? 1 : 0);
            parcel.writeInt(this.A00);
            parcel.writeString(this.A06);
            parcel.writeParcelable(this.A04, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.instagram.ui.slidecardpageadapter.SlideCardViewModel, java.lang.Object] */
    public static SlideCardViewModel A00(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, CharSequence charSequence, String str, String str2, String str3, int i) {
        ?? obj = new Object();
        obj.A00 = 0;
        obj.A01 = i;
        obj.A06 = null;
        obj.A05 = null;
        obj.A0B = str;
        obj.A0A = null;
        obj.A08 = str2;
        obj.A09 = str3;
        obj.A07 = charSequence;
        obj.A02 = null;
        obj.A03 = onClickListener;
        obj.A04 = onClickListener2;
        return obj;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.A0C);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        TextUtils.writeToParcel(this.A07, parcel, i);
        TextUtils.writeToParcel(this.A02, parcel, i);
    }
}
