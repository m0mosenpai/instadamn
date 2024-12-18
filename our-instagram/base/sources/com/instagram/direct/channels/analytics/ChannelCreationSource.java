package com.instagram.direct.channels.analytics;

import X.AbstractC12190kN;
import X.AbstractC166997dE;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ChannelCreationSource implements Parcelable {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ ChannelCreationSource[] A02;
    public static final ChannelCreationSource A03;
    public static final ChannelCreationSource A04;
    public static final ChannelCreationSource A05;
    public static final ChannelCreationSource A06;
    public static final ChannelCreationSource A07;
    public static final ChannelCreationSource A08;
    public static final ChannelCreationSource A09;
    public static final ChannelCreationSource A0A;
    public static final ChannelCreationSource A0B;
    public static final ChannelCreationSource A0C;
    public static final ChannelCreationSource A0D;
    public static final ChannelCreationSource A0E;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this);
    }

    static {
        ChannelCreationSource channelCreationSource = new ChannelCreationSource("ACTIVITY_FEED", 0, "activity_feed");
        A03 = channelCreationSource;
        ChannelCreationSource channelCreationSource2 = new ChannelCreationSource("EDIT_PROFILE", 1, "edit_profile");
        A04 = channelCreationSource2;
        ChannelCreationSource channelCreationSource3 = new ChannelCreationSource("MIMICRY_UPSELL", 2, "mimicry_upsell");
        A06 = channelCreationSource3;
        ChannelCreationSource channelCreationSource4 = new ChannelCreationSource("MIMICRY_UPSELL_COMPOSER", 3, "mimicry_upsell_composer_banner");
        A07 = channelCreationSource4;
        ChannelCreationSource channelCreationSource5 = new ChannelCreationSource("OMNIPICKER", 4, "omnipicker");
        A08 = channelCreationSource5;
        ChannelCreationSource channelCreationSource6 = new ChannelCreationSource("PROFESSIONAL_DASHBOARD_NEXT_STEP", 5, "pro_dash_next_steps");
        A09 = channelCreationSource6;
        ChannelCreationSource channelCreationSource7 = new ChannelCreationSource("PROFILE", 6, "profile");
        A0A = channelCreationSource7;
        ChannelCreationSource channelCreationSource8 = new ChannelCreationSource("QUICK_PROMOTION", 7, "quick_promotion");
        A0B = channelCreationSource8;
        ChannelCreationSource channelCreationSource9 = new ChannelCreationSource("SUBSCRIBER_LIST", 8, "subscriber_list");
        A0D = channelCreationSource9;
        ChannelCreationSource channelCreationSource10 = new ChannelCreationSource("MESSAGING_LED", 9, "messaging_led");
        A05 = channelCreationSource10;
        ChannelCreationSource channelCreationSource11 = new ChannelCreationSource("SUBSCRIPTION_SETTINGS", 10, "subscription_settings");
        A0E = channelCreationSource11;
        ChannelCreationSource channelCreationSource12 = new ChannelCreationSource("SCHOOLS", 11, "schools");
        A0C = channelCreationSource12;
        ChannelCreationSource[] channelCreationSourceArr = {channelCreationSource, channelCreationSource2, channelCreationSource3, channelCreationSource4, channelCreationSource5, channelCreationSource6, channelCreationSource7, channelCreationSource8, channelCreationSource9, channelCreationSource10, channelCreationSource11, channelCreationSource12};
        A02 = channelCreationSourceArr;
        A01 = AbstractC12190kN.A00(channelCreationSourceArr);
        CREATOR = new LNM(95);
    }

    public static ChannelCreationSource valueOf(String str) {
        return (ChannelCreationSource) Enum.valueOf(ChannelCreationSource.class, str);
    }

    public static ChannelCreationSource[] values() {
        return (ChannelCreationSource[]) A02.clone();
    }

    public ChannelCreationSource(String str, int i, String str2) {
        this.A00 = str2;
    }
}
