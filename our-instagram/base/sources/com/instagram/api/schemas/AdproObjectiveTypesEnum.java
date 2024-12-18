package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC37302Gc3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class AdproObjectiveTypesEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AdproObjectiveTypesEnum[] A03;
    public static final AdproObjectiveTypesEnum A04;
    public static final AdproObjectiveTypesEnum A05;
    public static final AdproObjectiveTypesEnum A06;
    public static final AdproObjectiveTypesEnum A07;
    public static final AdproObjectiveTypesEnum A08;
    public static final AdproObjectiveTypesEnum A09;
    public static final AdproObjectiveTypesEnum A0A;
    public static final AdproObjectiveTypesEnum A0B;
    public static final AdproObjectiveTypesEnum A0C;
    public static final AdproObjectiveTypesEnum A0D;
    public static final AdproObjectiveTypesEnum A0E;
    public static final AdproObjectiveTypesEnum A0F;
    public static final AdproObjectiveTypesEnum A0G;
    public static final AdproObjectiveTypesEnum A0H;
    public static final AdproObjectiveTypesEnum A0I;
    public static final AdproObjectiveTypesEnum A0J;
    public static final AdproObjectiveTypesEnum A0K;
    public static final AdproObjectiveTypesEnum A0L;
    public static final AdproObjectiveTypesEnum A0M;
    public static final AdproObjectiveTypesEnum A0N;
    public static final AdproObjectiveTypesEnum A0O;
    public static final AdproObjectiveTypesEnum A0P;
    public static final AdproObjectiveTypesEnum A0Q;
    public static final AdproObjectiveTypesEnum A0R;
    public static final AdproObjectiveTypesEnum A0S;
    public static final AdproObjectiveTypesEnum A0T;
    public static final AdproObjectiveTypesEnum A0U;
    public static final AdproObjectiveTypesEnum A0V;
    public static final AdproObjectiveTypesEnum A0W;
    public static final AdproObjectiveTypesEnum A0X;
    public static final AdproObjectiveTypesEnum A0Y;
    public static final AdproObjectiveTypesEnum A0Z;
    public static final AdproObjectiveTypesEnum A0a;
    public static final AdproObjectiveTypesEnum A0b;
    public static final AdproObjectiveTypesEnum A0c;
    public static final AdproObjectiveTypesEnum A0d;
    public static final AdproObjectiveTypesEnum A0e;
    public static final AdproObjectiveTypesEnum A0f;
    public static final AdproObjectiveTypesEnum A0g;
    public static final AdproObjectiveTypesEnum A0h;
    public static final AdproObjectiveTypesEnum A0i;
    public static final AdproObjectiveTypesEnum A0j;
    public static final AdproObjectiveTypesEnum A0k;
    public static final AdproObjectiveTypesEnum A0l;
    public static final AdproObjectiveTypesEnum A0m;
    public static final AdproObjectiveTypesEnum A0n;
    public static final AdproObjectiveTypesEnum A0o;
    public static final AdproObjectiveTypesEnum A0p;
    public static final AdproObjectiveTypesEnum A0q;
    public static final AdproObjectiveTypesEnum A0r;
    public static final AdproObjectiveTypesEnum A0s;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AdproObjectiveTypesEnum adproObjectiveTypesEnum = new AdproObjectiveTypesEnum("UNRECOGNIZED", 0, "AdproObjectiveTypesEnum_unspecified");
        A0o = adproObjectiveTypesEnum;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum2 = new AdproObjectiveTypesEnum("APP_INSTALLS", 1, "APP_INSTALLS");
        A04 = adproObjectiveTypesEnum2;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum3 = new AdproObjectiveTypesEnum("BRAND_AWARENESS", 2, "BRAND_AWARENESS");
        A05 = adproObjectiveTypesEnum3;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum4 = new AdproObjectiveTypesEnum("CANVAS_APP_ENGAGEMENT", 3, "CANVAS_APP_ENGAGEMENT");
        A06 = adproObjectiveTypesEnum4;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum5 = new AdproObjectiveTypesEnum("CANVAS_APP_INSTALLS", 4, "CANVAS_APP_INSTALLS");
        A07 = adproObjectiveTypesEnum5;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum6 = new AdproObjectiveTypesEnum("DEPRECATED_CLICKS", 5, "DEPRECATED_CLICKS");
        A08 = adproObjectiveTypesEnum6;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum7 = new AdproObjectiveTypesEnum("EVENT_RESPONSES", 6, "EVENT_RESPONSES");
        A09 = adproObjectiveTypesEnum7;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum8 = new AdproObjectiveTypesEnum("EXTERNAL", 7, "EXTERNAL");
        A0A = adproObjectiveTypesEnum8;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum9 = new AdproObjectiveTypesEnum("GROUP_JOINS", 8, "GROUP_JOINS");
        A0B = adproObjectiveTypesEnum9;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum10 = new AdproObjectiveTypesEnum("IMPRESSIONS", 9, "IMPRESSIONS");
        A0C = adproObjectiveTypesEnum10;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum11 = new AdproObjectiveTypesEnum("INCOMPATIBLE_CANVAS_APP_ENGAGEMENT", 10, "INCOMPATIBLE_CANVAS_APP_ENGAGEMENT");
        A0D = adproObjectiveTypesEnum11;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum12 = new AdproObjectiveTypesEnum("INCOMPATIBLE_CANVAS_APP_INSTALLS", 11, "INCOMPATIBLE_CANVAS_APP_INSTALLS");
        A0E = adproObjectiveTypesEnum12;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum13 = new AdproObjectiveTypesEnum("INCOMPATIBLE_EVENT_RESPONSES", 12, "INCOMPATIBLE_EVENT_RESPONSES");
        A0F = adproObjectiveTypesEnum13;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum14 = new AdproObjectiveTypesEnum("INCOMPATIBLE_MOBILE_APP_INSTALLS", 13, "INCOMPATIBLE_MOBILE_APP_INSTALLS");
        A0G = adproObjectiveTypesEnum14;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum15 = new AdproObjectiveTypesEnum("INCOMPATIBLE_OFFER_CLAIMS", 14, "INCOMPATIBLE_OFFER_CLAIMS");
        A0H = adproObjectiveTypesEnum15;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum16 = new AdproObjectiveTypesEnum("INCOMPATIBLE_PAGE_ENGAGEMENT", 15, "INCOMPATIBLE_PAGE_ENGAGEMENT");
        A0I = adproObjectiveTypesEnum16;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum17 = new AdproObjectiveTypesEnum("INCOMPATIBLE_PAGE_LIKES", 16, "INCOMPATIBLE_PAGE_LIKES");
        A0J = adproObjectiveTypesEnum17;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum18 = new AdproObjectiveTypesEnum("INCOMPATIBLE_POST_ENGAGEMENT", 17, "INCOMPATIBLE_POST_ENGAGEMENT");
        A0K = adproObjectiveTypesEnum18;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum19 = new AdproObjectiveTypesEnum("INCOMPATIBLE_WEBSITE_CLICKS", 18, "INCOMPATIBLE_WEBSITE_CLICKS");
        A0L = adproObjectiveTypesEnum19;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum20 = new AdproObjectiveTypesEnum("INCOMPATIBLE_WEBSITE_CONVERSIONS", 19, "INCOMPATIBLE_WEBSITE_CONVERSIONS");
        A0M = adproObjectiveTypesEnum20;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum21 = new AdproObjectiveTypesEnum("INSTAGRAM_BRAND_AWARENESS", 20, "INSTAGRAM_BRAND_AWARENESS");
        A0N = adproObjectiveTypesEnum21;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum22 = new AdproObjectiveTypesEnum("LEAD_GENERATION", 21, "LEAD_GENERATION");
        A0O = adproObjectiveTypesEnum22;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum23 = new AdproObjectiveTypesEnum("LINK_CLICKS", 22, "LINK_CLICKS");
        A0P = adproObjectiveTypesEnum23;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum24 = new AdproObjectiveTypesEnum("LOCAL_AWARENESS", 23, "LOCAL_AWARENESS");
        A0Q = adproObjectiveTypesEnum24;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum25 = new AdproObjectiveTypesEnum("LOCAL_IMPRESSIONS", 24, "LOCAL_IMPRESSIONS");
        A0R = adproObjectiveTypesEnum25;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum26 = new AdproObjectiveTypesEnum("MEDIA_DOWNLOADS", 25, "MEDIA_DOWNLOADS");
        A0S = adproObjectiveTypesEnum26;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum27 = new AdproObjectiveTypesEnum("MESSAGES", 26, "MESSAGES");
        A0T = adproObjectiveTypesEnum27;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum28 = new AdproObjectiveTypesEnum("MILLE", 27, "MILLE");
        A0U = adproObjectiveTypesEnum28;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum29 = new AdproObjectiveTypesEnum("MOBILE_APP_ENGAGEMENT", 28, "MOBILE_APP_ENGAGEMENT");
        A0V = adproObjectiveTypesEnum29;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum30 = new AdproObjectiveTypesEnum("MOBILE_APP_INSTALLS", 29, "MOBILE_APP_INSTALLS");
        A0W = adproObjectiveTypesEnum30;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum31 = new AdproObjectiveTypesEnum("MULTIPLE", 30, "MULTIPLE");
        A0X = adproObjectiveTypesEnum31;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum32 = new AdproObjectiveTypesEnum(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 31, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        A0Y = adproObjectiveTypesEnum32;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum33 = new AdproObjectiveTypesEnum("OFFER_CLAIMS", 32, "OFFER_CLAIMS");
        A0Z = adproObjectiveTypesEnum33;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum34 = new AdproObjectiveTypesEnum("OUTCOME_ACQUISITION", 33, "OUTCOME_ACQUISITION");
        A0a = adproObjectiveTypesEnum34;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum35 = new AdproObjectiveTypesEnum("OUTCOME_APP_PROMOTION", 34, "OUTCOME_APP_PROMOTION");
        A0b = adproObjectiveTypesEnum35;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum36 = new AdproObjectiveTypesEnum("OUTCOME_AWARENESS", 35, "OUTCOME_AWARENESS");
        A0c = adproObjectiveTypesEnum36;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum37 = new AdproObjectiveTypesEnum("OUTCOME_ENGAGEMENT", 36, "OUTCOME_ENGAGEMENT");
        A0d = adproObjectiveTypesEnum37;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum38 = new AdproObjectiveTypesEnum("OUTCOME_LEADS", 37, "OUTCOME_LEADS");
        A0e = adproObjectiveTypesEnum38;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum39 = new AdproObjectiveTypesEnum("OUTCOME_SALES", 38, "OUTCOME_SALES");
        A0f = adproObjectiveTypesEnum39;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum40 = new AdproObjectiveTypesEnum("OUTCOME_TRAFFIC", 39, "OUTCOME_TRAFFIC");
        A0g = adproObjectiveTypesEnum40;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum41 = new AdproObjectiveTypesEnum("PAGE_LIKES", 40, "PAGE_LIKES");
        A0h = adproObjectiveTypesEnum41;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum42 = new AdproObjectiveTypesEnum("POST_ENGAGEMENT", 41, "POST_ENGAGEMENT");
        A0i = adproObjectiveTypesEnum42;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum43 = new AdproObjectiveTypesEnum("PRODUCT_CATALOG_SALES", 42, "PRODUCT_CATALOG_SALES");
        A0j = adproObjectiveTypesEnum43;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum44 = new AdproObjectiveTypesEnum("PROFILE_FOLLOWERS", 43, "PROFILE_FOLLOWERS");
        A0k = adproObjectiveTypesEnum44;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum45 = new AdproObjectiveTypesEnum("REACH", 44, "REACH");
        A0l = adproObjectiveTypesEnum45;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum46 = new AdproObjectiveTypesEnum("RESEARCH_POLL", 45, "RESEARCH_POLL");
        A0m = adproObjectiveTypesEnum46;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum47 = new AdproObjectiveTypesEnum("STORE_VISITS", 46, "STORE_VISITS");
        A0n = adproObjectiveTypesEnum47;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum48 = new AdproObjectiveTypesEnum("VIDEO_VIEWS", 47, "VIDEO_VIEWS");
        A0p = adproObjectiveTypesEnum48;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum49 = new AdproObjectiveTypesEnum("WEBSITE_CONVERSIONS", 48, "WEBSITE_CONVERSIONS");
        A0q = adproObjectiveTypesEnum49;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum50 = new AdproObjectiveTypesEnum("WILDCARD_INTERNAL_ONLY", 49, "WILDCARD_INTERNAL_ONLY");
        A0r = adproObjectiveTypesEnum50;
        AdproObjectiveTypesEnum adproObjectiveTypesEnum51 = new AdproObjectiveTypesEnum("XPLATFORM_SALES", 50, "XPLATFORM_SALES");
        A0s = adproObjectiveTypesEnum51;
        AdproObjectiveTypesEnum[] adproObjectiveTypesEnumArr = new AdproObjectiveTypesEnum[51];
        System.arraycopy(new AdproObjectiveTypesEnum[]{adproObjectiveTypesEnum, adproObjectiveTypesEnum2, adproObjectiveTypesEnum3, adproObjectiveTypesEnum4, adproObjectiveTypesEnum5, adproObjectiveTypesEnum6, adproObjectiveTypesEnum7, adproObjectiveTypesEnum8, adproObjectiveTypesEnum9, adproObjectiveTypesEnum10, adproObjectiveTypesEnum11, adproObjectiveTypesEnum12, adproObjectiveTypesEnum13, adproObjectiveTypesEnum14, adproObjectiveTypesEnum15, adproObjectiveTypesEnum16, adproObjectiveTypesEnum17, adproObjectiveTypesEnum18, adproObjectiveTypesEnum19, adproObjectiveTypesEnum20, adproObjectiveTypesEnum21, adproObjectiveTypesEnum22, adproObjectiveTypesEnum23, adproObjectiveTypesEnum24, adproObjectiveTypesEnum25, adproObjectiveTypesEnum26, adproObjectiveTypesEnum27}, 0, adproObjectiveTypesEnumArr, 0, 27);
        System.arraycopy(new AdproObjectiveTypesEnum[]{adproObjectiveTypesEnum28, adproObjectiveTypesEnum29, adproObjectiveTypesEnum30, adproObjectiveTypesEnum31, adproObjectiveTypesEnum32, adproObjectiveTypesEnum33, adproObjectiveTypesEnum34, adproObjectiveTypesEnum35, adproObjectiveTypesEnum36, adproObjectiveTypesEnum37, adproObjectiveTypesEnum38, adproObjectiveTypesEnum39, adproObjectiveTypesEnum40, adproObjectiveTypesEnum41, adproObjectiveTypesEnum42, adproObjectiveTypesEnum43, adproObjectiveTypesEnum44, adproObjectiveTypesEnum45, adproObjectiveTypesEnum46, adproObjectiveTypesEnum47, adproObjectiveTypesEnum48, adproObjectiveTypesEnum49, adproObjectiveTypesEnum50, adproObjectiveTypesEnum51}, 0, adproObjectiveTypesEnumArr, 27, 24);
        A03 = adproObjectiveTypesEnumArr;
        A02 = AbstractC12190kN.A00(adproObjectiveTypesEnumArr);
        AdproObjectiveTypesEnum[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC37302Gc3.A01(values.length));
        for (AdproObjectiveTypesEnum adproObjectiveTypesEnum52 : values) {
            linkedHashMap.put(adproObjectiveTypesEnum52.A00, adproObjectiveTypesEnum52);
        }
        A01 = linkedHashMap;
        CREATOR = new C63469Sl9(37);
    }

    public static AdproObjectiveTypesEnum valueOf(String str) {
        return (AdproObjectiveTypesEnum) Enum.valueOf(AdproObjectiveTypesEnum.class, str);
    }

    public static AdproObjectiveTypesEnum[] values() {
        return (AdproObjectiveTypesEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AdproObjectiveTypesEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
