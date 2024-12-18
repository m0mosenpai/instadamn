package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class PresenceAudience implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ PresenceAudience[] A03;
    public static final PresenceAudience A04;
    public static final PresenceAudience A05;
    public static final PresenceAudience A06;
    public static final PresenceAudience A07;
    public static final PresenceAudience A08;
    public static final PresenceAudience A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        PresenceAudience presenceAudience = new PresenceAudience("UNRECOGNIZED", 0, "PresenceAudience_unspecified");
        A09 = presenceAudience;
        PresenceAudience presenceAudience2 = new PresenceAudience("ALLOWLIST", 1, "ALLOWLIST");
        A04 = presenceAudience2;
        PresenceAudience presenceAudience3 = new PresenceAudience("BESTIES", 2, "BESTIES");
        A05 = presenceAudience3;
        PresenceAudience presenceAudience4 = new PresenceAudience("BLOCKLIST", 3, "BLOCKLIST");
        A06 = presenceAudience4;
        PresenceAudience presenceAudience5 = new PresenceAudience("INTERNAL", 4, "INTERNAL");
        A07 = presenceAudience5;
        PresenceAudience presenceAudience6 = new PresenceAudience("MUTUAL_FOLLOWS", 5, "MUTUAL_FOLLOWS");
        A08 = presenceAudience6;
        PresenceAudience[] presenceAudienceArr = {presenceAudience, presenceAudience2, presenceAudience3, presenceAudience4, presenceAudience5, presenceAudience6, new PresenceAudience("ONLY_OWNER", 6, "ONLY_OWNER")};
        A03 = presenceAudienceArr;
        A02 = AbstractC12190kN.A00(presenceAudienceArr);
        PresenceAudience[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (PresenceAudience presenceAudience7 : values) {
            A18.put(presenceAudience7.A00, presenceAudience7);
        }
        A01 = A18;
        CREATOR = new C41855Ig9(38);
    }

    public static PresenceAudience valueOf(String str) {
        return (PresenceAudience) Enum.valueOf(PresenceAudience.class, str);
    }

    public static PresenceAudience[] values() {
        return (PresenceAudience[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public PresenceAudience(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
