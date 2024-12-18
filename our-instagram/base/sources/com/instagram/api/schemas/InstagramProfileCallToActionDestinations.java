package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class InstagramProfileCallToActionDestinations implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ InstagramProfileCallToActionDestinations[] A03;
    public static final InstagramProfileCallToActionDestinations A04;
    public static final InstagramProfileCallToActionDestinations A05;
    public static final InstagramProfileCallToActionDestinations A06;
    public static final InstagramProfileCallToActionDestinations A07;
    public static final InstagramProfileCallToActionDestinations A08;
    public static final InstagramProfileCallToActionDestinations A09;
    public static final InstagramProfileCallToActionDestinations A0A;
    public static final InstagramProfileCallToActionDestinations A0B;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations = new InstagramProfileCallToActionDestinations("UNRECOGNIZED", 0, "InstagramProfileCallToActionDestinations_unspecified");
        A09 = instagramProfileCallToActionDestinations;
        InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations2 = new InstagramProfileCallToActionDestinations("DIRECT_MESSAGE", 1, "DIRECT_MESSAGE");
        A04 = instagramProfileCallToActionDestinations2;
        InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations3 = new InstagramProfileCallToActionDestinations(PaymentDetailChangeTypes$Companion.EMAIL, 2, PaymentDetailChangeTypes$Companion.EMAIL);
        A05 = instagramProfileCallToActionDestinations3;
        InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations4 = new InstagramProfileCallToActionDestinations("GEO_ADDRESS", 3, "GEO_ADDRESS");
        A06 = instagramProfileCallToActionDestinations4;
        InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations5 = new InstagramProfileCallToActionDestinations("PHONE_CALL", 4, "PHONE_CALL");
        A07 = instagramProfileCallToActionDestinations5;
        InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations6 = new InstagramProfileCallToActionDestinations("PHONE_TEXT", 5, "PHONE_TEXT");
        A08 = instagramProfileCallToActionDestinations6;
        InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations7 = new InstagramProfileCallToActionDestinations("WEBSITE", 6, "WEBSITE");
        A0A = instagramProfileCallToActionDestinations7;
        InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations8 = new InstagramProfileCallToActionDestinations("WHATSAPP_MESSAGE", 7, "WHATSAPP_MESSAGE");
        A0B = instagramProfileCallToActionDestinations8;
        InstagramProfileCallToActionDestinations[] instagramProfileCallToActionDestinationsArr = {instagramProfileCallToActionDestinations, instagramProfileCallToActionDestinations2, instagramProfileCallToActionDestinations3, instagramProfileCallToActionDestinations4, instagramProfileCallToActionDestinations5, instagramProfileCallToActionDestinations6, instagramProfileCallToActionDestinations7, instagramProfileCallToActionDestinations8};
        A03 = instagramProfileCallToActionDestinationsArr;
        A02 = AbstractC12190kN.A00(instagramProfileCallToActionDestinationsArr);
        InstagramProfileCallToActionDestinations[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations9 : values) {
            linkedHashMap.put(instagramProfileCallToActionDestinations9.A00, instagramProfileCallToActionDestinations9);
        }
        A01 = linkedHashMap;
        CREATOR = new C41858IgC(60);
    }

    public static InstagramProfileCallToActionDestinations valueOf(String str) {
        return (InstagramProfileCallToActionDestinations) Enum.valueOf(InstagramProfileCallToActionDestinations.class, str);
    }

    public static InstagramProfileCallToActionDestinations[] values() {
        return (InstagramProfileCallToActionDestinations[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public InstagramProfileCallToActionDestinations(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
