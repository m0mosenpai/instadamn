package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class AudienceValidationResponseStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AudienceValidationResponseStatus[] A03;
    public static final AudienceValidationResponseStatus A04;
    public static final AudienceValidationResponseStatus A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AudienceValidationResponseStatus audienceValidationResponseStatus = new AudienceValidationResponseStatus("UNRECOGNIZED", 0, "AudienceValidationResponseStatus_unspecified");
        A05 = audienceValidationResponseStatus;
        AudienceValidationResponseStatus audienceValidationResponseStatus2 = new AudienceValidationResponseStatus("ERROR", 1, "ERROR");
        A04 = audienceValidationResponseStatus2;
        AudienceValidationResponseStatus[] audienceValidationResponseStatusArr = {audienceValidationResponseStatus, audienceValidationResponseStatus2, new AudienceValidationResponseStatus("WARNING", 2, "WARNING")};
        A03 = audienceValidationResponseStatusArr;
        A02 = AbstractC12190kN.A00(audienceValidationResponseStatusArr);
        AudienceValidationResponseStatus[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (AudienceValidationResponseStatus audienceValidationResponseStatus3 : values) {
            A18.put(audienceValidationResponseStatus3.A00, audienceValidationResponseStatus3);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(59);
    }

    public static AudienceValidationResponseStatus valueOf(String str) {
        return (AudienceValidationResponseStatus) Enum.valueOf(AudienceValidationResponseStatus.class, str);
    }

    public static AudienceValidationResponseStatus[] values() {
        return (AudienceValidationResponseStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AudienceValidationResponseStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
