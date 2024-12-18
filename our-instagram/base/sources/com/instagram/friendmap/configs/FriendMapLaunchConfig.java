package com.instagram.friendmap.configs;

import X.AbstractC001800i;
import X.AbstractC001900j;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C34977Fb4;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class FriendMapLaunchConfig implements Parcelable {
    public static final C34977Fb4 A0C = new Object();
    public static final Parcelable.Creator CREATOR = LNL.A00(83);
    public AggregatedBannerConfig A00;
    public String A01;
    public String A02;
    public String A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Integer A09;
    public final List A0A;
    public final boolean A0B;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        switch (this.A09.intValue()) {
            case 0:
                str = "INBOX_NOTES_TRAY";
                break;
            case 1:
                str = "PUSH_NOTIFICATION";
                break;
            case 2:
                str = "ACTIVITY_FEED";
                break;
            case 3:
                str = "DEEPLINK";
                break;
            case 4:
                str = "MAIN_FEED_ACTION_BAR";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        parcel.writeString(str);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeStringList(this.A04);
        parcel.writeInt(this.A08 ? 1 : 0);
        AggregatedBannerConfig aggregatedBannerConfig = this.A00;
        if (aggregatedBannerConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aggregatedBannerConfig.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    public FriendMapLaunchConfig(AggregatedBannerConfig aggregatedBannerConfig, Integer num, String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3) {
        List list2;
        List A0m;
        this.A09 = num;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = list;
        this.A08 = z;
        this.A00 = aggregatedBannerConfig;
        this.A07 = z2;
        this.A05 = z3;
        if (str2 != null && (A0m = AbstractC167007dF.A0m(str2, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0)) != null) {
            ArrayList A0q = AbstractC167017dG.A0q(A0m);
            Iterator it = A0m.iterator();
            while (it.hasNext()) {
                AbstractC166997dE.A1S(AbstractC001900j.A0B(AbstractC166987dD.A1B(it)), A0q);
            }
            list2 = AbstractC001800i.A0a(A0q);
        } else {
            list2 = null;
        }
        this.A0A = list2;
        this.A0B = !(list2 == null || list2.isEmpty());
    }
}
