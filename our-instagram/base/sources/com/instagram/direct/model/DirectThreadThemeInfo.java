package com.instagram.direct.model;

import X.AbstractC13950nL;
import X.AnonymousClass001;
import X.C05F;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class DirectThreadThemeInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(79);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Integer A09;
    public Integer A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public List A0p;
    public List A0q;
    public List A0r;
    public List A0s;
    public boolean A0t;
    public boolean A0u;

    public DirectThreadThemeInfo(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, List list, List list2, List list3, List list4, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this(num2, num, str36, str17, str40, str, str34, str15, str22, str11, str35, str16, str31, str12, str24, str4, str37, str18, str38, str19, str39, str20, str33, str14, str26, str6, str27, str7, str23, str3, str29, str9, str30, str10, str21, str32, str13, str28, str8, str2, str25, str5, list4, list2, list3, list, i, i7, i4, i6, i3, i2, i8, i5, 0, false, false);
    }

    public static final int[] A00(List list) {
        if (list == null) {
            return new int[0];
        }
        int[] iArr = new int[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            iArr[i] = AbstractC13950nL.A0C(AnonymousClass001.A0D((String) list.get(i), '#'), 0);
        }
        return iArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A0u ? 1 : 0);
        parcel.writeString(this.A0b);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0o);
        parcel.writeString(this.A0f);
        parcel.writeStringList(this.A0s);
        parcel.writeStringList(this.A0q);
        parcel.writeString(this.A0Z);
        parcel.writeString(this.A0K);
        Integer num = this.A0A;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            switch (num.intValue()) {
                case 1:
                    str = "DARK_MODE";
                    break;
                case 2:
                    str = "LIGHT_MODE";
                    break;
                default:
                    str = "DEFAULT";
                    break;
            }
            parcel.writeString(str);
        }
        parcel.writeString(this.A0l);
        parcel.writeString(this.A0i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0a);
        parcel.writeString(this.A0L);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0n);
        parcel.writeString(this.A0j);
        parcel.writeString(this.A0m);
        parcel.writeString(this.A0h);
        parcel.writeString(this.A0c);
        parcel.writeString(this.A0N);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A05);
        parcel.writeString(this.A0d);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0e);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0Y);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0S);
        parcel.writeString(this.A0D);
        parcel.writeStringList(this.A0r);
        parcel.writeStringList(this.A0p);
        parcel.writeString(this.A0T);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0V);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0W);
        parcel.writeString(this.A0H);
        Integer num2 = this.A09;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            if (1 - num2.intValue() != 0) {
                str2 = "COLOR";
            } else {
                str2 = "THEME";
            }
            parcel.writeString(str2);
        }
        parcel.writeInt(this.A04);
        parcel.writeString(this.A0k);
        parcel.writeString(this.A0X);
        parcel.writeString(this.A0I);
        parcel.writeInt(this.A0t ? 1 : 0);
        parcel.writeString(this.A0U);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0g);
        parcel.writeString(this.A0R);
        parcel.writeString(this.A0C);
    }

    public final int A01() {
        return AbstractC13950nL.A0C(AnonymousClass001.A0D(this.A0M, '#'), 0);
    }

    public final int A02() {
        return AbstractC13950nL.A0C(AnonymousClass001.A0D(this.A0b, '#'), 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectThreadThemeInfo)) {
            return false;
        }
        return C14360o3.A0K(this.A0o, ((DirectThreadThemeInfo) obj).A0o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0o});
    }

    public DirectThreadThemeInfo(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, List list, List list2, List list3, List list4, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, boolean z2) {
        C14360o3.A0B(str3, 4);
        this.A0u = z;
        this.A0b = str;
        this.A0M = str2;
        this.A0o = str3;
        this.A0f = str4;
        this.A0s = list;
        this.A0q = list2;
        this.A0Z = str5;
        this.A0K = str6;
        this.A0A = num;
        this.A0l = str7;
        this.A0i = str8;
        this.A00 = i;
        this.A0a = str9;
        this.A0L = str10;
        this.A06 = i2;
        this.A02 = i3;
        this.A07 = i4;
        this.A03 = i5;
        this.A0n = str11;
        this.A0j = str12;
        this.A0m = str13;
        this.A0h = str14;
        this.A0c = str15;
        this.A0N = str16;
        this.A01 = i6;
        this.A08 = i7;
        this.A05 = i8;
        this.A0d = str17;
        this.A0O = str18;
        this.A0e = str19;
        this.A0P = str20;
        this.A0Y = str21;
        this.A0J = str22;
        this.A0S = str23;
        this.A0D = str24;
        this.A0r = list3;
        this.A0p = list4;
        this.A0T = str25;
        this.A0E = str26;
        this.A0Q = str27;
        this.A0B = str28;
        this.A0V = str29;
        this.A0G = str30;
        this.A0W = str31;
        this.A0H = str32;
        this.A09 = num2;
        this.A04 = i9;
        this.A0k = str33;
        this.A0X = str34;
        this.A0I = str35;
        this.A0t = z2;
        this.A0U = str36;
        this.A0F = str37;
        this.A0g = str38;
        this.A0R = str39;
        this.A0C = str40;
    }

    public DirectThreadThemeInfo() {
        this(C05F.A00, null, null, null, "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false);
    }
}
