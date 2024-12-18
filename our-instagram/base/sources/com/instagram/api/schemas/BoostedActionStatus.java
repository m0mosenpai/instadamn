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
public final class BoostedActionStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ BoostedActionStatus[] A03;
    public static final BoostedActionStatus A04;
    public static final BoostedActionStatus A05;
    public static final BoostedActionStatus A06;
    public static final BoostedActionStatus A07;
    public static final BoostedActionStatus A08;
    public static final BoostedActionStatus A09;
    public static final BoostedActionStatus A0A;
    public static final BoostedActionStatus A0B;
    public static final BoostedActionStatus A0C;
    public static final BoostedActionStatus A0D;
    public static final BoostedActionStatus A0E;
    public static final BoostedActionStatus A0F;
    public static final BoostedActionStatus A0G;
    public static final BoostedActionStatus A0H;
    public static final BoostedActionStatus A0I;
    public static final BoostedActionStatus A0J;
    public static final BoostedActionStatus A0K;
    public static final BoostedActionStatus A0L;
    public static final BoostedActionStatus A0M;
    public static final BoostedActionStatus A0N;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        BoostedActionStatus boostedActionStatus = new BoostedActionStatus("UNRECOGNIZED", 0, "BoostedActionStatus_unspecified");
        A0N = boostedActionStatus;
        BoostedActionStatus boostedActionStatus2 = new BoostedActionStatus("ACTIVE", 1, "ACTIVE");
        A04 = boostedActionStatus2;
        BoostedActionStatus boostedActionStatus3 = new BoostedActionStatus("AUTHENTICATION_NEEDED", 2, "AUTHENTICATION_NEEDED");
        A05 = boostedActionStatus3;
        BoostedActionStatus boostedActionStatus4 = new BoostedActionStatus("CANCELED", 3, "CANCELED");
        A06 = boostedActionStatus4;
        BoostedActionStatus boostedActionStatus5 = new BoostedActionStatus("CONFIRMATION_REQUIRED", 4, "CONFIRMATION_REQUIRED");
        A07 = boostedActionStatus5;
        BoostedActionStatus boostedActionStatus6 = new BoostedActionStatus("CREATING", 5, "CREATING");
        A08 = boostedActionStatus6;
        BoostedActionStatus boostedActionStatus7 = new BoostedActionStatus("DRAFT", 6, "DRAFT");
        A09 = boostedActionStatus7;
        BoostedActionStatus boostedActionStatus8 = new BoostedActionStatus("ERROR", 7, "ERROR");
        A0A = boostedActionStatus8;
        BoostedActionStatus boostedActionStatus9 = new BoostedActionStatus("EXTENDABLE", 8, "EXTENDABLE");
        A0B = boostedActionStatus9;
        BoostedActionStatus boostedActionStatus10 = new BoostedActionStatus("FINISHED", 9, "FINISHED");
        A0C = boostedActionStatus10;
        BoostedActionStatus boostedActionStatus11 = new BoostedActionStatus("INACTIVE", 10, "INACTIVE");
        A0D = boostedActionStatus11;
        BoostedActionStatus boostedActionStatus12 = new BoostedActionStatus("LIMITED_DELIVERY", 11, "LIMITED_DELIVERY");
        A0E = boostedActionStatus12;
        BoostedActionStatus boostedActionStatus13 = new BoostedActionStatus("NOT_DELIVERING", 12, "NOT_DELIVERING");
        A0F = boostedActionStatus13;
        BoostedActionStatus boostedActionStatus14 = new BoostedActionStatus("NO_CTA", 13, "NO_CTA");
        A0G = boostedActionStatus14;
        BoostedActionStatus boostedActionStatus15 = new BoostedActionStatus("PAUSED", 14, "PAUSED");
        A0H = boostedActionStatus15;
        BoostedActionStatus boostedActionStatus16 = new BoostedActionStatus("PENDING", 15, "PENDING");
        A0I = boostedActionStatus16;
        BoostedActionStatus boostedActionStatus17 = new BoostedActionStatus("PENDING_FUNDING_SOURCE", 16, "PENDING_FUNDING_SOURCE");
        A0J = boostedActionStatus17;
        BoostedActionStatus boostedActionStatus18 = new BoostedActionStatus("REJECTED", 17, "REJECTED");
        A0K = boostedActionStatus18;
        BoostedActionStatus boostedActionStatus19 = new BoostedActionStatus("REVIEW_NEEDED", 18, "REVIEW_NEEDED");
        A0L = boostedActionStatus19;
        BoostedActionStatus boostedActionStatus20 = new BoostedActionStatus("SCHEDULED", 19, "SCHEDULED");
        A0M = boostedActionStatus20;
        BoostedActionStatus[] boostedActionStatusArr = {boostedActionStatus, boostedActionStatus2, boostedActionStatus3, boostedActionStatus4, boostedActionStatus5, boostedActionStatus6, boostedActionStatus7, boostedActionStatus8, boostedActionStatus9, boostedActionStatus10, boostedActionStatus11, boostedActionStatus12, boostedActionStatus13, boostedActionStatus14, boostedActionStatus15, boostedActionStatus16, boostedActionStatus17, boostedActionStatus18, boostedActionStatus19, boostedActionStatus20};
        A03 = boostedActionStatusArr;
        A02 = AbstractC12190kN.A00(boostedActionStatusArr);
        BoostedActionStatus[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC37302Gc3.A01(values.length));
        for (BoostedActionStatus boostedActionStatus21 : values) {
            linkedHashMap.put(boostedActionStatus21.A00, boostedActionStatus21);
        }
        A01 = linkedHashMap;
        CREATOR = new C63469Sl9(74);
    }

    public static BoostedActionStatus valueOf(String str) {
        return (BoostedActionStatus) Enum.valueOf(BoostedActionStatus.class, str);
    }

    public static BoostedActionStatus[] values() {
        return (BoostedActionStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BoostedActionStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
