package com.instagram.ui.text;

import X.AEX;
import X.C14360o3;
import X.C8LG;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class TextColorScheme implements Parcelable {
    public static final TextColorScheme A08 = new TextColorScheme(new C8LG());
    public float A00;
    public int A01;
    public int A02;
    public GradientDrawable.Orientation A03;
    public TextColors A04;
    public Integer A05;
    public String A06;
    public List A07;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A01);
        parcel.writeList(this.A07);
        parcel.writeFloat(this.A00);
        GradientDrawable.Orientation orientation = this.A03;
        if (orientation != null) {
            parcel.writeString(orientation.name());
        }
        Integer num = this.A05;
        if (num != null) {
            str = AEX.A01(num);
        } else {
            str = null;
        }
        parcel.writeString(str);
        String str2 = this.A06;
        if (str2 == null) {
            str2 = "";
        }
        parcel.writeString(str2);
    }

    public final TextColorScheme A00(int... iArr) {
        C8LG c8lg = new C8LG();
        c8lg.A02 = this.A02;
        c8lg.A01 = this.A01;
        c8lg.A02(Arrays.copyOf(iArr, iArr.length));
        c8lg.A00 = this.A00;
        TextColors textColors = this.A04;
        if (textColors != null) {
            c8lg.A04 = new TextColors(textColors.A01, textColors.A00);
        }
        GradientDrawable.Orientation orientation = this.A03;
        if (orientation != null) {
            c8lg.A03 = orientation;
        }
        return new TextColorScheme(c8lg);
    }

    public final int[] A01() {
        List list = this.A07;
        if (list != null) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = ((Number) list.get(i)).intValue();
            }
            return iArr;
        }
        return new int[0];
    }

    public TextColorScheme(C8LG c8lg) {
        this.A02 = c8lg.A02;
        this.A04 = c8lg.A04;
        this.A01 = c8lg.A01;
        this.A07 = c8lg.A07;
        this.A05 = c8lg.A05;
        this.A00 = c8lg.A00;
        this.A03 = c8lg.A03;
        this.A06 = c8lg.A06;
    }

    public TextColorScheme() {
    }
}
