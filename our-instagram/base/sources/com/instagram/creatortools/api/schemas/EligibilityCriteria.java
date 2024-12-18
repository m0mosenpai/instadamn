package com.instagram.creatortools.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class EligibilityCriteria implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EligibilityCriteria[] A03;
    public static final EligibilityCriteria A04;
    public static final EligibilityCriteria A05;
    public static final EligibilityCriteria A06;
    public static final EligibilityCriteria A07;
    public static final EligibilityCriteria A08;
    public static final EligibilityCriteria A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        EligibilityCriteria eligibilityCriteria = new EligibilityCriteria("UNRECOGNIZED", 0, "EligibilityCriteria_unspecified");
        A09 = eligibilityCriteria;
        EligibilityCriteria eligibilityCriteria2 = new EligibilityCriteria("AGE_LIMIT", 1, "age_limit");
        A04 = eligibilityCriteria2;
        EligibilityCriteria eligibilityCriteria3 = new EligibilityCriteria("COUNTRY", 2, "country");
        A05 = eligibilityCriteria3;
        EligibilityCriteria eligibilityCriteria4 = new EligibilityCriteria("DEACTIVATION", 3, "deactivation");
        A06 = eligibilityCriteria4;
        EligibilityCriteria eligibilityCriteria5 = new EligibilityCriteria("FOLLOWER_COUNT", 4, "follower_count");
        A07 = eligibilityCriteria5;
        EligibilityCriteria eligibilityCriteria6 = new EligibilityCriteria("INVITE_ONLY", 5, "invite_only");
        A08 = eligibilityCriteria6;
        EligibilityCriteria[] eligibilityCriteriaArr = {eligibilityCriteria, eligibilityCriteria2, eligibilityCriteria3, eligibilityCriteria4, eligibilityCriteria5, eligibilityCriteria6, new EligibilityCriteria("MES_STATUS", 6, "mes_status")};
        A03 = eligibilityCriteriaArr;
        A02 = AbstractC12190kN.A00(eligibilityCriteriaArr);
        EligibilityCriteria[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EligibilityCriteria eligibilityCriteria7 : values) {
            A18.put(eligibilityCriteria7.A00, eligibilityCriteria7);
        }
        A01 = A18;
        CREATOR = new LNM(88);
    }

    public static EligibilityCriteria valueOf(String str) {
        return (EligibilityCriteria) Enum.valueOf(EligibilityCriteria.class, str);
    }

    public static EligibilityCriteria[] values() {
        return (EligibilityCriteria[]) A03.clone();
    }

    public EligibilityCriteria(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
