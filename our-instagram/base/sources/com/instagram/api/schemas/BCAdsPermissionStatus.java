package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class BCAdsPermissionStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ BCAdsPermissionStatus[] A03;
    public static final BCAdsPermissionStatus A04;
    public static final BCAdsPermissionStatus A05;
    public static final BCAdsPermissionStatus A06;
    public static final BCAdsPermissionStatus A07;
    public static final BCAdsPermissionStatus A08;
    public static final BCAdsPermissionStatus A09;
    public static final BCAdsPermissionStatus A0A;
    public static final BCAdsPermissionStatus A0B;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        BCAdsPermissionStatus bCAdsPermissionStatus = new BCAdsPermissionStatus("UNRECOGNIZED", 0, "BCAdsPermissionStatus_unspecified");
        A0B = bCAdsPermissionStatus;
        BCAdsPermissionStatus bCAdsPermissionStatus2 = new BCAdsPermissionStatus("APPROVED", 1, "2");
        A04 = bCAdsPermissionStatus2;
        BCAdsPermissionStatus bCAdsPermissionStatus3 = new BCAdsPermissionStatus("APPROVED_V2", 2, "7");
        A05 = bCAdsPermissionStatus3;
        BCAdsPermissionStatus bCAdsPermissionStatus4 = new BCAdsPermissionStatus("CANCELED", 3, "6");
        A06 = bCAdsPermissionStatus4;
        BCAdsPermissionStatus bCAdsPermissionStatus5 = new BCAdsPermissionStatus("DEFAULT", 4, "0");
        A07 = bCAdsPermissionStatus5;
        BCAdsPermissionStatus bCAdsPermissionStatus6 = new BCAdsPermissionStatus("PENDING_APPROVAL", 5, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A08 = bCAdsPermissionStatus6;
        BCAdsPermissionStatus bCAdsPermissionStatus7 = new BCAdsPermissionStatus("REJECTED", 6, "3");
        A09 = bCAdsPermissionStatus7;
        BCAdsPermissionStatus bCAdsPermissionStatus8 = new BCAdsPermissionStatus("REVOKED", 7, "4");
        A0A = bCAdsPermissionStatus8;
        BCAdsPermissionStatus[] bCAdsPermissionStatusArr = {bCAdsPermissionStatus, bCAdsPermissionStatus2, bCAdsPermissionStatus3, bCAdsPermissionStatus4, bCAdsPermissionStatus5, bCAdsPermissionStatus6, bCAdsPermissionStatus7, bCAdsPermissionStatus8, new BCAdsPermissionStatus("SELF_REMOVED", 8, "5")};
        A03 = bCAdsPermissionStatusArr;
        A02 = AbstractC12190kN.A00(bCAdsPermissionStatusArr);
        BCAdsPermissionStatus[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (BCAdsPermissionStatus bCAdsPermissionStatus9 : values) {
            A18.put(bCAdsPermissionStatus9.A00, bCAdsPermissionStatus9);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(67);
    }

    public static BCAdsPermissionStatus valueOf(String str) {
        return (BCAdsPermissionStatus) Enum.valueOf(BCAdsPermissionStatus.class, str);
    }

    public static BCAdsPermissionStatus[] values() {
        return (BCAdsPermissionStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BCAdsPermissionStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
