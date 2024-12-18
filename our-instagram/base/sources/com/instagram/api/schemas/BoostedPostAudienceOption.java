package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC37302Gc3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class BoostedPostAudienceOption implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ BoostedPostAudienceOption[] A03;
    public static final BoostedPostAudienceOption A04;
    public static final BoostedPostAudienceOption A05;
    public static final BoostedPostAudienceOption A06;
    public static final BoostedPostAudienceOption A07;
    public static final BoostedPostAudienceOption A08;
    public static final BoostedPostAudienceOption A09;
    public static final BoostedPostAudienceOption A0A;
    public static final BoostedPostAudienceOption A0B;
    public static final BoostedPostAudienceOption A0C;
    public static final BoostedPostAudienceOption A0D;
    public static final BoostedPostAudienceOption A0E;
    public static final BoostedPostAudienceOption A0F;
    public static final BoostedPostAudienceOption A0G;
    public static final BoostedPostAudienceOption A0H;
    public static final BoostedPostAudienceOption A0I;
    public static final BoostedPostAudienceOption A0J;
    public static final BoostedPostAudienceOption A0K;
    public static final BoostedPostAudienceOption A0L;
    public static final BoostedPostAudienceOption A0M;
    public static final BoostedPostAudienceOption A0N;
    public static final BoostedPostAudienceOption A0O;
    public static final BoostedPostAudienceOption A0P;
    public static final BoostedPostAudienceOption A0Q;
    public static final BoostedPostAudienceOption A0R;
    public static final BoostedPostAudienceOption A0S;
    public static final BoostedPostAudienceOption A0T;
    public static final BoostedPostAudienceOption A0U;
    public static final BoostedPostAudienceOption A0V;
    public static final BoostedPostAudienceOption A0W;
    public static final BoostedPostAudienceOption A0X;
    public static final BoostedPostAudienceOption A0Y;
    public static final BoostedPostAudienceOption A0Z;
    public static final BoostedPostAudienceOption A0a;
    public static final BoostedPostAudienceOption A0b;
    public static final BoostedPostAudienceOption A0c;
    public static final BoostedPostAudienceOption A0d;
    public static final BoostedPostAudienceOption A0e;
    public static final BoostedPostAudienceOption A0f;
    public static final BoostedPostAudienceOption A0g;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        BoostedPostAudienceOption boostedPostAudienceOption = new BoostedPostAudienceOption("UNRECOGNIZED", 0, "BoostedPostAudienceOption_unspecified");
        A0g = boostedPostAudienceOption;
        BoostedPostAudienceOption boostedPostAudienceOption2 = new BoostedPostAudienceOption("ANY_POST_OR_AD_ENGAGEMENT", 1, "ANY_POST_OR_AD_ENGAGEMENT");
        A04 = boostedPostAudienceOption2;
        BoostedPostAudienceOption boostedPostAudienceOption3 = new BoostedPostAudienceOption("ANY_POST_OR_AD_ENGAGEMENT_LAL", 2, "ANY_POST_OR_AD_ENGAGEMENT_LAL");
        A05 = boostedPostAudienceOption3;
        BoostedPostAudienceOption boostedPostAudienceOption4 = new BoostedPostAudienceOption("AUTO_LOOKALIKE", 3, "AUTO_LOOKALIKE");
        A06 = boostedPostAudienceOption4;
        BoostedPostAudienceOption boostedPostAudienceOption5 = new BoostedPostAudienceOption("AUTO_PAGE_LOOKALIKE", 4, "AUTO_PAGE_LOOKALIKE");
        A07 = boostedPostAudienceOption5;
        BoostedPostAudienceOption boostedPostAudienceOption6 = new BoostedPostAudienceOption("AUTO_TARGETING", 5, "AUTO_TARGETING");
        A08 = boostedPostAudienceOption6;
        BoostedPostAudienceOption boostedPostAudienceOption7 = new BoostedPostAudienceOption("COUNTRY_AND_INTEREST", 6, "COUNTRY_AND_INTEREST");
        A09 = boostedPostAudienceOption7;
        BoostedPostAudienceOption boostedPostAudienceOption8 = new BoostedPostAudienceOption("CREATE_NEW", 7, "CREATE_NEW");
        A0A = boostedPostAudienceOption8;
        BoostedPostAudienceOption boostedPostAudienceOption9 = new BoostedPostAudienceOption("CUSTOM_AUDIENCE", 8, "CUSTOM_AUDIENCE");
        A0B = boostedPostAudienceOption9;
        BoostedPostAudienceOption boostedPostAudienceOption10 = new BoostedPostAudienceOption("DISTRICT", 9, "DISTRICT");
        A0C = boostedPostAudienceOption10;
        BoostedPostAudienceOption boostedPostAudienceOption11 = new BoostedPostAudienceOption("DYNAMIC_TOFU_CUSTOM_AUDIENCE", 10, "DYNAMIC_TOFU_CUSTOM_AUDIENCE");
        A0D = boostedPostAudienceOption11;
        BoostedPostAudienceOption boostedPostAudienceOption12 = new BoostedPostAudienceOption("EVENT_CUSTOM_AUDIENCES", 11, "EVENT_CUSTOM_AUDIENCES");
        A0E = boostedPostAudienceOption12;
        BoostedPostAudienceOption boostedPostAudienceOption13 = new BoostedPostAudienceOption("EVENT_ENGAGEMENT", 12, "EVENT_ENGAGEMENT");
        A0F = boostedPostAudienceOption13;
        BoostedPostAudienceOption boostedPostAudienceOption14 = new BoostedPostAudienceOption("FANS", 13, "FANS");
        A0G = boostedPostAudienceOption14;
        BoostedPostAudienceOption boostedPostAudienceOption15 = new BoostedPostAudienceOption("GROUPER", 14, "GROUPER");
        A0H = boostedPostAudienceOption15;
        BoostedPostAudienceOption boostedPostAudienceOption16 = new BoostedPostAudienceOption("HEC_AUDIENCE", 15, "HEC_AUDIENCE");
        A0I = boostedPostAudienceOption16;
        BoostedPostAudienceOption boostedPostAudienceOption17 = new BoostedPostAudienceOption("IG_BOOST_UNIFIED_AUDIENCE", 16, "IG_BOOST_UNIFIED_AUDIENCE");
        A0J = boostedPostAudienceOption17;
        BoostedPostAudienceOption boostedPostAudienceOption18 = new BoostedPostAudienceOption("IG_PROMOTED_POST_AUTO", 17, "IG_PROMOTED_POST_AUTO");
        A0K = boostedPostAudienceOption18;
        BoostedPostAudienceOption boostedPostAudienceOption19 = new BoostedPostAudienceOption("IG_REACH_CHURNED", 18, "IG_REACH_CHURNED");
        A0L = boostedPostAudienceOption19;
        BoostedPostAudienceOption boostedPostAudienceOption20 = new BoostedPostAudienceOption("IG_REACH_LAL", 19, "IG_REACH_LAL");
        A0M = boostedPostAudienceOption20;
        BoostedPostAudienceOption boostedPostAudienceOption21 = new BoostedPostAudienceOption("INTEREST_BASED_AUDIENCE", 20, "INTEREST_BASED_AUDIENCE");
        A0N = boostedPostAudienceOption21;
        BoostedPostAudienceOption boostedPostAudienceOption22 = new BoostedPostAudienceOption("JOBS_DEFAULT_AUDIENCE", 21, "JOBS_DEFAULT_AUDIENCE");
        A0O = boostedPostAudienceOption22;
        BoostedPostAudienceOption boostedPostAudienceOption23 = new BoostedPostAudienceOption("JOBS_NATIONAL_AUDIENCE", 22, "JOBS_NATIONAL_AUDIENCE");
        A0P = boostedPostAudienceOption23;
        BoostedPostAudienceOption boostedPostAudienceOption24 = new BoostedPostAudienceOption("JOBS_REGIONAL_AUDIENCE", 23, "JOBS_REGIONAL_AUDIENCE");
        A0Q = boostedPostAudienceOption24;
        BoostedPostAudienceOption boostedPostAudienceOption25 = new BoostedPostAudienceOption("LOCAL", 24, "LOCAL");
        A0R = boostedPostAudienceOption25;
        BoostedPostAudienceOption boostedPostAudienceOption26 = new BoostedPostAudienceOption("LOCAL_AWARENESS", 25, "LOCAL_AWARENESS");
        A0S = boostedPostAudienceOption26;
        BoostedPostAudienceOption boostedPostAudienceOption27 = new BoostedPostAudienceOption("LOOKALIKE", 26, "LOOKALIKE");
        A0T = boostedPostAudienceOption27;
        BoostedPostAudienceOption boostedPostAudienceOption28 = new BoostedPostAudienceOption("MARKETPLACE_DEFAULT", 27, "MARKETPLACE_DEFAULT");
        A0U = boostedPostAudienceOption28;
        BoostedPostAudienceOption boostedPostAudienceOption29 = new BoostedPostAudienceOption("MARKETPLACE_NATIONWIDE_AUDIENCE", 28, "MARKETPLACE_NATIONWIDE_AUDIENCE");
        A0V = boostedPostAudienceOption29;
        BoostedPostAudienceOption boostedPostAudienceOption30 = new BoostedPostAudienceOption("MARKETPLACE_SAVED_AUDIENCE", 29, "MARKETPLACE_SAVED_AUDIENCE");
        A0W = boostedPostAudienceOption30;
        BoostedPostAudienceOption boostedPostAudienceOption31 = new BoostedPostAudienceOption("MULT_CUSTOM_AUDIENCES", 30, "MULT_CUSTOM_AUDIENCES");
        A0X = boostedPostAudienceOption31;
        BoostedPostAudienceOption boostedPostAudienceOption32 = new BoostedPostAudienceOption("NCPP", 31, "NCPP");
        A0Y = boostedPostAudienceOption32;
        BoostedPostAudienceOption boostedPostAudienceOption33 = new BoostedPostAudienceOption("PAGE_ENGAGEMENT", 32, "PAGE_ENGAGEMENT");
        A0Z = boostedPostAudienceOption33;
        BoostedPostAudienceOption boostedPostAudienceOption34 = new BoostedPostAudienceOption("PAGE_ENGAGEMENT_LAL", 33, "PAGE_ENGAGEMENT_LAL");
        A0a = boostedPostAudienceOption34;
        BoostedPostAudienceOption boostedPostAudienceOption35 = new BoostedPostAudienceOption("PAGE_MULTIPLE_EVENTS_CUSTOM_AUDIENCE", 34, "PAGE_MULTIPLE_EVENTS_CUSTOM_AUDIENCE");
        A0b = boostedPostAudienceOption35;
        BoostedPostAudienceOption boostedPostAudienceOption36 = new BoostedPostAudienceOption("PAGE_REACH_CHURNED", 35, "PAGE_REACH_CHURNED");
        A0c = boostedPostAudienceOption36;
        BoostedPostAudienceOption boostedPostAudienceOption37 = new BoostedPostAudienceOption("PAGE_REACH_LAL", 36, "PAGE_REACH_LAL");
        A0d = boostedPostAudienceOption37;
        BoostedPostAudienceOption boostedPostAudienceOption38 = new BoostedPostAudienceOption("SAVED_AUDIENCE", 37, "SAVED_AUDIENCE");
        A0e = boostedPostAudienceOption38;
        BoostedPostAudienceOption boostedPostAudienceOption39 = new BoostedPostAudienceOption("SHOPS_NEW_BUYER_AUDIENCE", 38, "SHOPS_NEW_BUYER_AUDIENCE");
        A0f = boostedPostAudienceOption39;
        BoostedPostAudienceOption boostedPostAudienceOption40 = new BoostedPostAudienceOption("SMART_AUDIENCE", 39, "SMART_AUDIENCE");
        BoostedPostAudienceOption[] boostedPostAudienceOptionArr = new BoostedPostAudienceOption[40];
        System.arraycopy(new BoostedPostAudienceOption[]{boostedPostAudienceOption, boostedPostAudienceOption2, boostedPostAudienceOption3, boostedPostAudienceOption4, boostedPostAudienceOption5, boostedPostAudienceOption6, boostedPostAudienceOption7, boostedPostAudienceOption8, boostedPostAudienceOption9, boostedPostAudienceOption10, boostedPostAudienceOption11, boostedPostAudienceOption12, boostedPostAudienceOption13, boostedPostAudienceOption14, boostedPostAudienceOption15, boostedPostAudienceOption16, boostedPostAudienceOption17, boostedPostAudienceOption18, boostedPostAudienceOption19, boostedPostAudienceOption20, boostedPostAudienceOption21, boostedPostAudienceOption22, boostedPostAudienceOption23, boostedPostAudienceOption24, boostedPostAudienceOption25, boostedPostAudienceOption26, boostedPostAudienceOption27}, 0, boostedPostAudienceOptionArr, 0, 27);
        System.arraycopy(new BoostedPostAudienceOption[]{boostedPostAudienceOption28, boostedPostAudienceOption29, boostedPostAudienceOption30, boostedPostAudienceOption31, boostedPostAudienceOption32, boostedPostAudienceOption33, boostedPostAudienceOption34, boostedPostAudienceOption35, boostedPostAudienceOption36, boostedPostAudienceOption37, boostedPostAudienceOption38, boostedPostAudienceOption39, boostedPostAudienceOption40}, 0, boostedPostAudienceOptionArr, 27, 13);
        A03 = boostedPostAudienceOptionArr;
        A02 = AbstractC12190kN.A00(boostedPostAudienceOptionArr);
        BoostedPostAudienceOption[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC37302Gc3.A01(values.length));
        for (BoostedPostAudienceOption boostedPostAudienceOption41 : values) {
            linkedHashMap.put(boostedPostAudienceOption41.A00, boostedPostAudienceOption41);
        }
        A01 = linkedHashMap;
        CREATOR = new C63469Sl9(76);
    }

    public static BoostedPostAudienceOption valueOf(String str) {
        return (BoostedPostAudienceOption) Enum.valueOf(BoostedPostAudienceOption.class, str);
    }

    public static BoostedPostAudienceOption[] values() {
        return (BoostedPostAudienceOption[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BoostedPostAudienceOption(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
