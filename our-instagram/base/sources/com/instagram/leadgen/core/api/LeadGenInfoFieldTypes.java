package com.instagram.leadgen.core.api;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC37302Gc3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class LeadGenInfoFieldTypes implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ LeadGenInfoFieldTypes[] A03;
    public static final LeadGenInfoFieldTypes A04;
    public static final LeadGenInfoFieldTypes A05;
    public static final LeadGenInfoFieldTypes A06;
    public static final LeadGenInfoFieldTypes A07;
    public static final LeadGenInfoFieldTypes A08;
    public static final LeadGenInfoFieldTypes A09;
    public static final LeadGenInfoFieldTypes A0A;
    public static final LeadGenInfoFieldTypes A0B;
    public static final LeadGenInfoFieldTypes A0C;
    public static final LeadGenInfoFieldTypes A0D;
    public static final LeadGenInfoFieldTypes A0E;
    public static final LeadGenInfoFieldTypes A0F;
    public static final LeadGenInfoFieldTypes A0G;
    public static final LeadGenInfoFieldTypes A0H;
    public static final LeadGenInfoFieldTypes A0I;
    public static final LeadGenInfoFieldTypes A0J;
    public static final LeadGenInfoFieldTypes A0K;
    public static final LeadGenInfoFieldTypes A0L;
    public static final LeadGenInfoFieldTypes A0M;
    public static final LeadGenInfoFieldTypes A0N;
    public static final LeadGenInfoFieldTypes A0O;
    public static final LeadGenInfoFieldTypes A0P;
    public static final LeadGenInfoFieldTypes A0Q;
    public static final LeadGenInfoFieldTypes A0R;
    public static final LeadGenInfoFieldTypes A0S;
    public static final LeadGenInfoFieldTypes A0T;
    public static final LeadGenInfoFieldTypes A0U;
    public static final LeadGenInfoFieldTypes A0V;
    public static final LeadGenInfoFieldTypes A0W;
    public static final LeadGenInfoFieldTypes A0X;
    public static final LeadGenInfoFieldTypes A0Y;
    public static final LeadGenInfoFieldTypes A0Z;
    public static final LeadGenInfoFieldTypes A0a;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        LeadGenInfoFieldTypes leadGenInfoFieldTypes = new LeadGenInfoFieldTypes("UNRECOGNIZED", 0, "LeadGenInfoFieldTypes_unspecified");
        A0X = leadGenInfoFieldTypes;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes2 = new LeadGenInfoFieldTypes("CUSTOM", 1, "CUSTOM");
        A07 = leadGenInfoFieldTypes2;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes3 = new LeadGenInfoFieldTypes("CITY", 2, "CITY");
        A04 = leadGenInfoFieldTypes3;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes4 = new LeadGenInfoFieldTypes("COMPANY_NAME", 3, "COMPANY_NAME");
        A05 = leadGenInfoFieldTypes4;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes5 = new LeadGenInfoFieldTypes("COUNTRY", 4, "COUNTRY");
        A06 = leadGenInfoFieldTypes5;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes6 = new LeadGenInfoFieldTypes("DOB", 5, "DOB");
        A09 = leadGenInfoFieldTypes6;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes7 = new LeadGenInfoFieldTypes(PaymentDetailChangeTypes$Companion.EMAIL, 6, PaymentDetailChangeTypes$Companion.EMAIL);
        A0A = leadGenInfoFieldTypes7;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes8 = new LeadGenInfoFieldTypes("GENDER", 7, "GENDER");
        A0E = leadGenInfoFieldTypes8;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes9 = new LeadGenInfoFieldTypes("FIRST_NAME", 8, "FIRST_NAME");
        A0B = leadGenInfoFieldTypes9;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes10 = new LeadGenInfoFieldTypes("FULL_ADDRESS", 9, "FULL_ADDRESS");
        A0C = leadGenInfoFieldTypes10;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes11 = new LeadGenInfoFieldTypes("FULL_NAME", 10, "FULL_NAME");
        A0D = leadGenInfoFieldTypes11;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes12 = new LeadGenInfoFieldTypes("JOB_TITLE", 11, "JOB_TITLE");
        A0L = leadGenInfoFieldTypes12;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes13 = new LeadGenInfoFieldTypes("LAST_NAME", 12, "LAST_NAME");
        A0M = leadGenInfoFieldTypes13;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes14 = new LeadGenInfoFieldTypes("MARITIAL_STATUS", 13, "MARITIAL_STATUS");
        A0N = leadGenInfoFieldTypes14;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes15 = new LeadGenInfoFieldTypes("PHONE", 14, "PHONE");
        A0P = leadGenInfoFieldTypes15;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes16 = new LeadGenInfoFieldTypes("POST_CODE", 15, "POST_CODE");
        A0Q = leadGenInfoFieldTypes16;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes17 = new LeadGenInfoFieldTypes("PROVINCE", 16, "PROVINCE");
        A0R = leadGenInfoFieldTypes17;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes18 = new LeadGenInfoFieldTypes("RELATIONSHIP_STATUS", 17, "RELATIONSHIP_STATUS");
        A0S = leadGenInfoFieldTypes18;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes19 = new LeadGenInfoFieldTypes("STATE", 18, "STATE");
        A0T = leadGenInfoFieldTypes19;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes20 = new LeadGenInfoFieldTypes("STREET_ADDRESS", 19, "STREET_ADDRESS");
        A0W = leadGenInfoFieldTypes20;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes21 = new LeadGenInfoFieldTypes("ZIP", 20, "ZIP");
        A0a = leadGenInfoFieldTypes21;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes22 = new LeadGenInfoFieldTypes("WORK_EMAIL", 21, "WORK_EMAIL");
        A0Y = leadGenInfoFieldTypes22;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes23 = new LeadGenInfoFieldTypes("MILITARY_STATUS", 22, "MILITARY_STATUS");
        A0O = leadGenInfoFieldTypes23;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes24 = new LeadGenInfoFieldTypes("WORK_PHONE_NUMBER", 23, "WORK_PHONE_NUMBER");
        A0Z = leadGenInfoFieldTypes24;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes25 = new LeadGenInfoFieldTypes("STORE_LOOKUP", 24, "STORE_LOOKUP");
        A0U = leadGenInfoFieldTypes25;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes26 = new LeadGenInfoFieldTypes("STORE_LOOKUP_WITH_TYPEAHEAD", 25, "STORE_LOOKUP_WITH_TYPEAHEAD");
        A0V = leadGenInfoFieldTypes26;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes27 = new LeadGenInfoFieldTypes("DATE_TIME", 26, "DATE_TIME");
        A08 = leadGenInfoFieldTypes27;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes28 = new LeadGenInfoFieldTypes("ID_CPF", 27, "ID_CPF");
        A0I = leadGenInfoFieldTypes28;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes29 = new LeadGenInfoFieldTypes("ID_AR_DNI", 28, "ID_AR_DNI");
        A0F = leadGenInfoFieldTypes29;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes30 = new LeadGenInfoFieldTypes("ID_CL_RUT", 29, "ID_CL_RUT");
        A0G = leadGenInfoFieldTypes30;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes31 = new LeadGenInfoFieldTypes("ID_CO_CC", 30, "ID_CO_CC");
        A0H = leadGenInfoFieldTypes31;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes32 = new LeadGenInfoFieldTypes("ID_EC_CI", 31, "ID_EC_CI");
        A0J = leadGenInfoFieldTypes32;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes33 = new LeadGenInfoFieldTypes("ID_PE_DNI", 32, "ID_PE_DNI");
        A0K = leadGenInfoFieldTypes33;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes34 = new LeadGenInfoFieldTypes("ID_MX_RFC", 33, "ID_MX_RFC");
        LeadGenInfoFieldTypes[] leadGenInfoFieldTypesArr = new LeadGenInfoFieldTypes[34];
        System.arraycopy(new LeadGenInfoFieldTypes[]{leadGenInfoFieldTypes, leadGenInfoFieldTypes2, leadGenInfoFieldTypes3, leadGenInfoFieldTypes4, leadGenInfoFieldTypes5, leadGenInfoFieldTypes6, leadGenInfoFieldTypes7, leadGenInfoFieldTypes8, leadGenInfoFieldTypes9, leadGenInfoFieldTypes10, leadGenInfoFieldTypes11, leadGenInfoFieldTypes12, leadGenInfoFieldTypes13, leadGenInfoFieldTypes14, leadGenInfoFieldTypes15, leadGenInfoFieldTypes16, leadGenInfoFieldTypes17, leadGenInfoFieldTypes18, leadGenInfoFieldTypes19, leadGenInfoFieldTypes20, leadGenInfoFieldTypes21, leadGenInfoFieldTypes22, leadGenInfoFieldTypes23, leadGenInfoFieldTypes24, leadGenInfoFieldTypes25, leadGenInfoFieldTypes26, leadGenInfoFieldTypes27}, 0, leadGenInfoFieldTypesArr, 0, 27);
        System.arraycopy(new LeadGenInfoFieldTypes[]{leadGenInfoFieldTypes28, leadGenInfoFieldTypes29, leadGenInfoFieldTypes30, leadGenInfoFieldTypes31, leadGenInfoFieldTypes32, leadGenInfoFieldTypes33, leadGenInfoFieldTypes34}, 0, leadGenInfoFieldTypesArr, 27, 7);
        A03 = leadGenInfoFieldTypesArr;
        A02 = AbstractC12190kN.A00(leadGenInfoFieldTypesArr);
        LeadGenInfoFieldTypes[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC37302Gc3.A01(values.length));
        for (LeadGenInfoFieldTypes leadGenInfoFieldTypes35 : values) {
            linkedHashMap.put(leadGenInfoFieldTypes35.A00, leadGenInfoFieldTypes35);
        }
        A01 = linkedHashMap;
        CREATOR = new C55343Oh9(13);
    }

    public static LeadGenInfoFieldTypes valueOf(String str) {
        return (LeadGenInfoFieldTypes) Enum.valueOf(LeadGenInfoFieldTypes.class, str);
    }

    public static LeadGenInfoFieldTypes[] values() {
        return (LeadGenInfoFieldTypes[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public LeadGenInfoFieldTypes(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
