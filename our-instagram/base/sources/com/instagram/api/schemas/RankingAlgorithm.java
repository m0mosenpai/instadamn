package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class RankingAlgorithm implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ RankingAlgorithm[] A03;
    public static final RankingAlgorithm A04;
    public static final RankingAlgorithm A05;
    public static final RankingAlgorithm A06;
    public static final RankingAlgorithm A07;
    public static final RankingAlgorithm A08;
    public static final RankingAlgorithm A09;
    public static final RankingAlgorithm A0A;
    public static final RankingAlgorithm A0B;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        RankingAlgorithm rankingAlgorithm = new RankingAlgorithm("UNRECOGNIZED", 0, "RankingAlgorithm_unspecified");
        A0B = rankingAlgorithm;
        RankingAlgorithm rankingAlgorithm2 = new RankingAlgorithm("CLOSE_FRIENDING", 1, "close_friending_optimized");
        A04 = rankingAlgorithm2;
        RankingAlgorithm rankingAlgorithm3 = new RankingAlgorithm(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 2, NetInfoModule.CONNECTION_TYPE_NONE);
        A07 = rankingAlgorithm3;
        RankingAlgorithm rankingAlgorithm4 = new RankingAlgorithm("PRODUCERS_UNIT", 3, "sp_unit");
        A09 = rankingAlgorithm4;
        RankingAlgorithm rankingAlgorithm5 = new RankingAlgorithm("SU_DEFAULT", 4, "su_default");
        A0A = rankingAlgorithm5;
        RankingAlgorithm rankingAlgorithm6 = new RankingAlgorithm("FEED_IMPRESSION_OPT", 5, "su_feed_imp_optimized");
        A05 = rankingAlgorithm6;
        RankingAlgorithm rankingAlgorithm7 = new RankingAlgorithm("INVENTORY_OPT", 6, "su_inventory_optimized");
        A06 = rankingAlgorithm7;
        RankingAlgorithm rankingAlgorithm8 = new RankingAlgorithm("NOTIF", 7, "su_notification");
        A08 = rankingAlgorithm8;
        RankingAlgorithm[] rankingAlgorithmArr = {rankingAlgorithm, rankingAlgorithm2, rankingAlgorithm3, rankingAlgorithm4, rankingAlgorithm5, rankingAlgorithm6, rankingAlgorithm7, rankingAlgorithm8, new RankingAlgorithm("IMPRESSION_OPT_PRODUCER", 8, "su_sp_imp_optimized")};
        A03 = rankingAlgorithmArr;
        A02 = AbstractC12190kN.A00(rankingAlgorithmArr);
        RankingAlgorithm[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (RankingAlgorithm rankingAlgorithm9 : values) {
            A18.put(rankingAlgorithm9.A00, rankingAlgorithm9);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(86);
    }

    public static RankingAlgorithm valueOf(String str) {
        return (RankingAlgorithm) Enum.valueOf(RankingAlgorithm.class, str);
    }

    public static RankingAlgorithm[] values() {
        return (RankingAlgorithm[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public RankingAlgorithm(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
