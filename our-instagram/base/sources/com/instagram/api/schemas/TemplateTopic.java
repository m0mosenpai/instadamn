package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC37302Gc3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class TemplateTopic implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TemplateTopic[] A03;
    public static final TemplateTopic A04;
    public static final TemplateTopic A05;
    public static final TemplateTopic A06;
    public static final TemplateTopic A07;
    public static final TemplateTopic A08;
    public static final TemplateTopic A09;
    public static final TemplateTopic A0A;
    public static final TemplateTopic A0B;
    public static final TemplateTopic A0C;
    public static final TemplateTopic A0D;
    public static final TemplateTopic A0E;
    public static final TemplateTopic A0F;
    public static final TemplateTopic A0G;
    public static final TemplateTopic A0H;
    public static final TemplateTopic A0I;
    public static final TemplateTopic A0J;
    public static final TemplateTopic A0K;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        TemplateTopic templateTopic = new TemplateTopic("UNRECOGNIZED", 0, "TemplateTopic_unspecified");
        A0K = templateTopic;
        TemplateTopic templateTopic2 = new TemplateTopic("ANIMALS", 1, "animals");
        A04 = templateTopic2;
        TemplateTopic templateTopic3 = new TemplateTopic("BEAUTY_STYLE_FASHION", 2, "beauty_style_fashion");
        A05 = templateTopic3;
        TemplateTopic templateTopic4 = new TemplateTopic("CAMPAIGN", 3, "campaign");
        A06 = templateTopic4;
        TemplateTopic templateTopic5 = new TemplateTopic("CELEBRITY", 4, "celebrity");
        A07 = templateTopic5;
        TemplateTopic templateTopic6 = new TemplateTopic("CREATOR_TEMPLATE", 5, "creator_template");
        A08 = templateTopic6;
        TemplateTopic templateTopic7 = new TemplateTopic("END_OF_YEAR", 6, "end_of_year");
        A09 = templateTopic7;
        TemplateTopic templateTopic8 = new TemplateTopic("ENGAGEMENT", 7, "engagement");
        A0A = templateTopic8;
        TemplateTopic templateTopic9 = new TemplateTopic("FOOD_DRINK", 8, "food_drink");
        A0B = templateTopic9;
        TemplateTopic templateTopic10 = new TemplateTopic("GENERIC", 9, "generic");
        A0C = templateTopic10;
        TemplateTopic templateTopic11 = new TemplateTopic("HOME_GARDEN", 10, "home_garden");
        A0D = templateTopic11;
        TemplateTopic templateTopic12 = new TemplateTopic("REVISIT_TEMPLATE", 11, "revisit_template");
        A0F = templateTopic12;
        TemplateTopic templateTopic13 = new TemplateTopic("SAVED_TEMPLATE", 12, "saved_template");
        A0G = templateTopic13;
        TemplateTopic templateTopic14 = new TemplateTopic("SMART_TEMPLATE", 13, "smart_template");
        A0H = templateTopic14;
        TemplateTopic templateTopic15 = new TemplateTopic("SOCIAL_GRAPH", 14, "social_graph");
        A0I = templateTopic15;
        TemplateTopic templateTopic16 = new TemplateTopic("SPORTS_FITNESS", 15, "sports_fitness");
        A0J = templateTopic16;
        TemplateTopic templateTopic17 = new TemplateTopic("INTERACTIVE", 16, "template_interactive");
        A0E = templateTopic17;
        TemplateTopic[] templateTopicArr = {templateTopic, templateTopic2, templateTopic3, templateTopic4, templateTopic5, templateTopic6, templateTopic7, templateTopic8, templateTopic9, templateTopic10, templateTopic11, templateTopic12, templateTopic13, templateTopic14, templateTopic15, templateTopic16, templateTopic17, new TemplateTopic("UNKNOWN", 17, "unknown")};
        A03 = templateTopicArr;
        A02 = AbstractC12190kN.A00(templateTopicArr);
        TemplateTopic[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC37302Gc3.A01(values.length));
        for (TemplateTopic templateTopic18 : values) {
            A18.put(templateTopic18.A00, templateTopic18);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(43);
    }

    public static TemplateTopic valueOf(String str) {
        return (TemplateTopic) Enum.valueOf(TemplateTopic.class, str);
    }

    public static TemplateTopic[] values() {
        return (TemplateTopic[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TemplateTopic(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
