package com.instagram.mediakit.analytics;

import X.AbstractC12190kN;
import X.AbstractC166997dE;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class MediaKitEntryPoint implements Parcelable {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ MediaKitEntryPoint[] A02;
    public static final MediaKitEntryPoint A03;
    public static final MediaKitEntryPoint A04;
    public static final MediaKitEntryPoint A05;
    public static final MediaKitEntryPoint A06;
    public static final MediaKitEntryPoint A07;
    public static final MediaKitEntryPoint A08;
    public static final MediaKitEntryPoint A09;
    public static final MediaKitEntryPoint A0A;
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
        MediaKitEntryPoint mediaKitEntryPoint = new MediaKitEntryPoint("BRANDED_CONTENT_SETTINGS", 0, "bc_settings");
        A03 = mediaKitEntryPoint;
        MediaKitEntryPoint mediaKitEntryPoint2 = new MediaKitEntryPoint("DEV_OPTIONS", 1, "dev_options");
        A04 = mediaKitEntryPoint2;
        MediaKitEntryPoint mediaKitEntryPoint3 = new MediaKitEntryPoint("DIRECT_XMA", 2, "direct_xma");
        A05 = mediaKitEntryPoint3;
        MediaKitEntryPoint mediaKitEntryPoint4 = new MediaKitEntryPoint("EXTERNAL_LINK", 3, "external_link");
        A06 = mediaKitEntryPoint4;
        MediaKitEntryPoint mediaKitEntryPoint5 = new MediaKitEntryPoint("PRO_DASH_TIP", 4, "pro_dash_tip");
        A08 = mediaKitEntryPoint5;
        MediaKitEntryPoint mediaKitEntryPoint6 = new MediaKitEntryPoint("PROFILE", 5, "profile");
        A07 = mediaKitEntryPoint6;
        MediaKitEntryPoint mediaKitEntryPoint7 = new MediaKitEntryPoint("QP", 6, "qp");
        A09 = mediaKitEntryPoint7;
        MediaKitEntryPoint mediaKitEntryPoint8 = new MediaKitEntryPoint("UNKNOWN", 7, "unknown");
        A0A = mediaKitEntryPoint8;
        MediaKitEntryPoint[] mediaKitEntryPointArr = {mediaKitEntryPoint, mediaKitEntryPoint2, mediaKitEntryPoint3, mediaKitEntryPoint4, mediaKitEntryPoint5, mediaKitEntryPoint6, mediaKitEntryPoint7, mediaKitEntryPoint8};
        A02 = mediaKitEntryPointArr;
        A01 = AbstractC12190kN.A00(mediaKitEntryPointArr);
        CREATOR = new C55343Oh9(40);
    }

    public static MediaKitEntryPoint valueOf(String str) {
        return (MediaKitEntryPoint) Enum.valueOf(MediaKitEntryPoint.class, str);
    }

    public static MediaKitEntryPoint[] values() {
        return (MediaKitEntryPoint[]) A02.clone();
    }

    public MediaKitEntryPoint(String str, int i, String str2) {
        this.A00 = str2;
    }
}
