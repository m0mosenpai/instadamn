package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class CommentRestrictStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CommentRestrictStatus[] A03;
    public static final CommentRestrictStatus A04;
    public static final CommentRestrictStatus A05;
    public static final CommentRestrictStatus A06;
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
        CommentRestrictStatus commentRestrictStatus = new CommentRestrictStatus("UNRECOGNIZED", 0, "CommentRestrictStatus_unspecified");
        A06 = commentRestrictStatus;
        CommentRestrictStatus commentRestrictStatus2 = new CommentRestrictStatus("NORMAL", 1, "0");
        A04 = commentRestrictStatus2;
        CommentRestrictStatus commentRestrictStatus3 = new CommentRestrictStatus("PENDING", 2, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A05 = commentRestrictStatus3;
        CommentRestrictStatus[] commentRestrictStatusArr = {commentRestrictStatus, commentRestrictStatus2, commentRestrictStatus3};
        A03 = commentRestrictStatusArr;
        A02 = AbstractC12190kN.A00(commentRestrictStatusArr);
        CommentRestrictStatus[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (CommentRestrictStatus commentRestrictStatus4 : values) {
            linkedHashMap.put(commentRestrictStatus4.A00, commentRestrictStatus4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(75);
    }

    public static CommentRestrictStatus valueOf(String str) {
        return (CommentRestrictStatus) Enum.valueOf(CommentRestrictStatus.class, str);
    }

    public static CommentRestrictStatus[] values() {
        return (CommentRestrictStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CommentRestrictStatus(String str, int i, String str2) {
        this.A00 = str2;
    }
}
