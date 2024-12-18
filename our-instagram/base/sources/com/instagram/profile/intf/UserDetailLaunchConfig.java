package com.instagram.profile.intf;

import X.AbstractC31179DnN;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.discovery.filters.intf.FilterConfig;
import com.instagram.fanclub.intf.UserPayFanclubUpsellParams;
import com.instagram.fx.igxfb.IgxfbNetEgoCTABannerParams;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class UserDetailLaunchConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(22);
    public final UserPayFanclubUpsellParams A00;
    public final IgxfbNetEgoCTABannerParams A01;
    public final AutoLaunchReelParams A02;
    public final UserDetailEntryInfo A03;
    public final SourceModelInfoParams A04;
    public final Boolean A05;
    public final Long A06;
    public final Long A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final FilterConfig A0j;
    public final String A0k;
    public final String A0l;
    public final String A0m;
    public final String A0n;
    public final ArrayList A0o;
    public final boolean A0p;
    public final boolean A0q;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0O);
        AutoLaunchReelParams autoLaunchReelParams = this.A02;
        if (autoLaunchReelParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autoLaunchReelParams.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0i ? 1 : 0);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0l);
        parcel.writeStringList(this.A0o);
        parcel.writeParcelable(this.A0j, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeInt(this.A0X ? 1 : 0);
        UserDetailEntryInfo userDetailEntryInfo = this.A03;
        if (userDetailEntryInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userDetailEntryInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeString(this.A0L);
        parcel.writeInt(this.A0a ? 1 : 0);
        parcel.writeInt(this.A0Z ? 1 : 0);
        parcel.writeInt(this.A0Y ? 1 : 0);
        parcel.writeString(this.A0k);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A0c ? 1 : 0);
        parcel.writeString(this.A0m);
        parcel.writeString(this.A0n);
        parcel.writeInt(this.A0p ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A0f ? 1 : 0);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0N);
        AbstractC31179DnN.A0q(parcel, this.A07);
        AbstractC31179DnN.A0q(parcel, this.A06);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeInt(this.A0q ? 1 : 0);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeInt(this.A0g ? 1 : 0);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0b ? 1 : 0);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0J);
        parcel.writeInt(this.A0e ? 1 : 0);
        parcel.writeInt(this.A0d ? 1 : 0);
        parcel.writeString(this.A0F);
        parcel.writeInt(this.A0h ? 1 : 0);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
        AbstractC31179DnN.A0p(parcel, this.A05);
        parcel.writeInt(this.A0W ? 1 : 0);
    }

    public UserDetailLaunchConfig(FilterConfig filterConfig, UserPayFanclubUpsellParams userPayFanclubUpsellParams, IgxfbNetEgoCTABannerParams igxfbNetEgoCTABannerParams, AutoLaunchReelParams autoLaunchReelParams, UserDetailEntryInfo userDetailEntryInfo, SourceModelInfoParams sourceModelInfoParams, Boolean bool, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20) {
        this.A0Q = str;
        this.A0A = str2;
        this.A0C = str3;
        this.A0P = str4;
        this.A0O = str5;
        this.A02 = autoLaunchReelParams;
        this.A0i = z;
        this.A0G = str6;
        this.A0D = str7;
        this.A0E = str8;
        this.A0I = str9;
        this.A0l = str10;
        this.A0o = arrayList;
        this.A0j = filterConfig;
        this.A04 = sourceModelInfoParams;
        this.A0U = z2;
        this.A0X = z3;
        this.A03 = userDetailEntryInfo;
        this.A0T = z4;
        this.A0L = str11;
        this.A0a = z5;
        this.A0Z = z6;
        this.A0Y = z7;
        this.A0k = str12;
        this.A0K = str13;
        this.A08 = str14;
        this.A0c = z8;
        this.A0m = str15;
        this.A0n = str16;
        this.A0p = z9;
        this.A00 = userPayFanclubUpsellParams;
        this.A0f = z10;
        this.A0M = str17;
        this.A0N = str18;
        this.A07 = l;
        this.A06 = l2;
        this.A0R = z11;
        this.A0q = z12;
        this.A0V = z13;
        this.A0g = z14;
        this.A0B = str19;
        this.A0b = z15;
        this.A09 = str20;
        this.A0J = str21;
        this.A0e = z16;
        this.A0d = z17;
        this.A0F = str22;
        this.A0h = z18;
        this.A0H = str23;
        this.A0S = z19;
        this.A01 = igxfbNetEgoCTABannerParams;
        this.A05 = bool;
        this.A0W = z20;
    }
}
