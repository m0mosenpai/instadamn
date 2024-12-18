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
/* loaded from: classes.dex */
public final class IGUserThirdPartyDownloads implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGUserThirdPartyDownloads[] A03;
    public static final IGUserThirdPartyDownloads A04;
    public static final IGUserThirdPartyDownloads A05;
    public static final IGUserThirdPartyDownloads A06;
    public static final IGUserThirdPartyDownloads A07;
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
        IGUserThirdPartyDownloads iGUserThirdPartyDownloads = new IGUserThirdPartyDownloads("UNRECOGNIZED", 0, "IGUserThirdPartyDownloads_unspecified");
        A07 = iGUserThirdPartyDownloads;
        IGUserThirdPartyDownloads iGUserThirdPartyDownloads2 = new IGUserThirdPartyDownloads("DISABLED", 1, "2");
        A04 = iGUserThirdPartyDownloads2;
        IGUserThirdPartyDownloads iGUserThirdPartyDownloads3 = new IGUserThirdPartyDownloads("ENABLED", 2, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A05 = iGUserThirdPartyDownloads3;
        IGUserThirdPartyDownloads iGUserThirdPartyDownloads4 = new IGUserThirdPartyDownloads("NOT_SET", 3, "0");
        A06 = iGUserThirdPartyDownloads4;
        IGUserThirdPartyDownloads[] iGUserThirdPartyDownloadsArr = {iGUserThirdPartyDownloads, iGUserThirdPartyDownloads2, iGUserThirdPartyDownloads3, iGUserThirdPartyDownloads4};
        A03 = iGUserThirdPartyDownloadsArr;
        A02 = AbstractC12190kN.A00(iGUserThirdPartyDownloadsArr);
        IGUserThirdPartyDownloads[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGUserThirdPartyDownloads iGUserThirdPartyDownloads5 : values) {
            linkedHashMap.put(iGUserThirdPartyDownloads5.A00, iGUserThirdPartyDownloads5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(29);
    }

    public static IGUserThirdPartyDownloads valueOf(String str) {
        return (IGUserThirdPartyDownloads) Enum.valueOf(IGUserThirdPartyDownloads.class, str);
    }

    public static IGUserThirdPartyDownloads[] values() {
        return (IGUserThirdPartyDownloads[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGUserThirdPartyDownloads(String str, int i, String str2) {
        this.A00 = str2;
    }
}
