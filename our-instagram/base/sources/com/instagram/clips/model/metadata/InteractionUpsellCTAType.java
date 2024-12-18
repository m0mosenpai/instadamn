package com.instagram.clips.model.metadata;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class InteractionUpsellCTAType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ InteractionUpsellCTAType[] A03;
    public static final InteractionUpsellCTAType A04;
    public static final InteractionUpsellCTAType A05;
    public static final InteractionUpsellCTAType A06;
    public static final InteractionUpsellCTAType A07;
    public static final InteractionUpsellCTAType A08;
    public static final InteractionUpsellCTAType A09;
    public static final InteractionUpsellCTAType A0A;
    public static final InteractionUpsellCTAType A0B;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        InteractionUpsellCTAType interactionUpsellCTAType = new InteractionUpsellCTAType("UNRECOGNIZED", 0, "InteractionUpsellCTAType_unspecified");
        A0B = interactionUpsellCTAType;
        InteractionUpsellCTAType interactionUpsellCTAType2 = new InteractionUpsellCTAType("COMMENT_CONSUMPTION_UPSELL", 1, "3");
        A04 = interactionUpsellCTAType2;
        InteractionUpsellCTAType interactionUpsellCTAType3 = new InteractionUpsellCTAType("COMMENT_PRODUCTION_UPSELL", 2, "2");
        A05 = interactionUpsellCTAType3;
        InteractionUpsellCTAType interactionUpsellCTAType4 = new InteractionUpsellCTAType("FOLLOWU_UPSELL", 3, "5");
        A06 = interactionUpsellCTAType4;
        InteractionUpsellCTAType interactionUpsellCTAType5 = new InteractionUpsellCTAType("LIKE_UPSELL", 4, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A07 = interactionUpsellCTAType5;
        InteractionUpsellCTAType interactionUpsellCTAType6 = new InteractionUpsellCTAType("NO_UPSELL", 5, "0");
        A08 = interactionUpsellCTAType6;
        InteractionUpsellCTAType interactionUpsellCTAType7 = new InteractionUpsellCTAType("PROFILE_CLICK", 6, "6");
        A09 = interactionUpsellCTAType7;
        InteractionUpsellCTAType interactionUpsellCTAType8 = new InteractionUpsellCTAType("RESHARE_UPSELL", 7, "4");
        A0A = interactionUpsellCTAType8;
        InteractionUpsellCTAType[] interactionUpsellCTATypeArr = {interactionUpsellCTAType, interactionUpsellCTAType2, interactionUpsellCTAType3, interactionUpsellCTAType4, interactionUpsellCTAType5, interactionUpsellCTAType6, interactionUpsellCTAType7, interactionUpsellCTAType8, new InteractionUpsellCTAType("SAVE_UPSELL", 8, "7")};
        A03 = interactionUpsellCTATypeArr;
        A02 = AbstractC12190kN.A00(interactionUpsellCTATypeArr);
        InteractionUpsellCTAType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (InteractionUpsellCTAType interactionUpsellCTAType9 : values) {
            A18.put(interactionUpsellCTAType9.A00, interactionUpsellCTAType9);
        }
        A01 = A18;
        CREATOR = LNM.A00(7);
    }

    public static InteractionUpsellCTAType valueOf(String str) {
        return (InteractionUpsellCTAType) Enum.valueOf(InteractionUpsellCTAType.class, str);
    }

    public static InteractionUpsellCTAType[] values() {
        return (InteractionUpsellCTAType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public InteractionUpsellCTAType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
