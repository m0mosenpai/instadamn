package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class IGLiveNotificationPreference implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGLiveNotificationPreference[] A03;
    public static final IGLiveNotificationPreference A04;
    public static final IGLiveNotificationPreference A05;
    public static final IGLiveNotificationPreference A06;
    public static final IGLiveNotificationPreference A07;
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
        IGLiveNotificationPreference iGLiveNotificationPreference = new IGLiveNotificationPreference("UNRECOGNIZED", 0, "IGLiveNotificationPreference_unspecified");
        A07 = iGLiveNotificationPreference;
        IGLiveNotificationPreference iGLiveNotificationPreference2 = new IGLiveNotificationPreference("ALL", 1, "all");
        A04 = iGLiveNotificationPreference2;
        IGLiveNotificationPreference iGLiveNotificationPreference3 = new IGLiveNotificationPreference("DEFAULT", 2, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A05 = iGLiveNotificationPreference3;
        IGLiveNotificationPreference iGLiveNotificationPreference4 = new IGLiveNotificationPreference(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 3, NetInfoModule.CONNECTION_TYPE_NONE);
        A06 = iGLiveNotificationPreference4;
        IGLiveNotificationPreference[] iGLiveNotificationPreferenceArr = {iGLiveNotificationPreference, iGLiveNotificationPreference2, iGLiveNotificationPreference3, iGLiveNotificationPreference4};
        A03 = iGLiveNotificationPreferenceArr;
        A02 = AbstractC12190kN.A00(iGLiveNotificationPreferenceArr);
        IGLiveNotificationPreference[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGLiveNotificationPreference iGLiveNotificationPreference5 : values) {
            linkedHashMap.put(iGLiveNotificationPreference5.A00, iGLiveNotificationPreference5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(20);
    }

    public static IGLiveNotificationPreference valueOf(String str) {
        return (IGLiveNotificationPreference) Enum.valueOf(IGLiveNotificationPreference.class, str);
    }

    public static IGLiveNotificationPreference[] values() {
        return (IGLiveNotificationPreference[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGLiveNotificationPreference(String str, int i, String str2) {
        this.A00 = str2;
    }
}
