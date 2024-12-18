package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ProfessionalClipsUpsellType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProfessionalClipsUpsellType[] A03;
    public static final ProfessionalClipsUpsellType A04;
    public static final ProfessionalClipsUpsellType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    static {
        ProfessionalClipsUpsellType professionalClipsUpsellType = new ProfessionalClipsUpsellType("UNRECOGNIZED", 0, "ProfessionalClipsUpsellType_unspecified");
        A05 = professionalClipsUpsellType;
        ProfessionalClipsUpsellType professionalClipsUpsellType2 = new ProfessionalClipsUpsellType("FOR_BUSINESSES_PILL", 1, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A04 = professionalClipsUpsellType2;
        ProfessionalClipsUpsellType[] professionalClipsUpsellTypeArr = {professionalClipsUpsellType, professionalClipsUpsellType2, new ProfessionalClipsUpsellType("NO_UPSELL", 2, "0")};
        A03 = professionalClipsUpsellTypeArr;
        A02 = AbstractC12190kN.A00(professionalClipsUpsellTypeArr);
        ProfessionalClipsUpsellType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ProfessionalClipsUpsellType professionalClipsUpsellType3 : values) {
            linkedHashMap.put(professionalClipsUpsellType3.A00, professionalClipsUpsellType3);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(86);
    }

    public static ProfessionalClipsUpsellType valueOf(String str) {
        return (ProfessionalClipsUpsellType) Enum.valueOf(ProfessionalClipsUpsellType.class, str);
    }

    public static ProfessionalClipsUpsellType[] values() {
        return (ProfessionalClipsUpsellType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProfessionalClipsUpsellType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
