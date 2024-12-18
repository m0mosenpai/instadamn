package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class MediaGenAIDetectionMethod implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MediaGenAIDetectionMethod[] A03;
    public static final MediaGenAIDetectionMethod A04;
    public static final MediaGenAIDetectionMethod A05;
    public static final MediaGenAIDetectionMethod A06;
    public static final MediaGenAIDetectionMethod A07;
    public static final MediaGenAIDetectionMethod A08;
    public static final MediaGenAIDetectionMethod A09;
    public static final MediaGenAIDetectionMethod A0A;
    public static final MediaGenAIDetectionMethod A0B;
    public static final MediaGenAIDetectionMethod A0C;
    public static final MediaGenAIDetectionMethod A0D;
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
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = new MediaGenAIDetectionMethod("UNRECOGNIZED", 0, "MediaGenAIDetectionMethod_unspecified");
        A0D = mediaGenAIDetectionMethod;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod2 = new MediaGenAIDetectionMethod("C2PA_METADATA", 1, "C2PA_METADATA");
        A04 = mediaGenAIDetectionMethod2;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod3 = new MediaGenAIDetectionMethod("C2PA_METADATA_EDITED", 2, "C2PA_METADATA_EDITED");
        A05 = mediaGenAIDetectionMethod3;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod4 = new MediaGenAIDetectionMethod("IPTC_METADATA", 3, "IPTC_METADATA");
        A06 = mediaGenAIDetectionMethod4;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod5 = new MediaGenAIDetectionMethod("IPTC_METADATA_EDITED", 4, "IPTC_METADATA_EDITED");
        A07 = mediaGenAIDetectionMethod5;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod6 = new MediaGenAIDetectionMethod("MANUAL_OVERRIDE_LABEL_OFF", 5, "MANUAL_OVERRIDE_LABEL_OFF");
        A08 = mediaGenAIDetectionMethod6;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod7 = new MediaGenAIDetectionMethod("MANUAL_OVERRIDE_LABEL_ON", 6, "MANUAL_OVERRIDE_LABEL_ON");
        A09 = mediaGenAIDetectionMethod7;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod8 = new MediaGenAIDetectionMethod("META_INVISIBLE_WATERMARK", 7, "META_INVISIBLE_WATERMARK");
        A0A = mediaGenAIDetectionMethod8;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod9 = new MediaGenAIDetectionMethod(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 8, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        A0B = mediaGenAIDetectionMethod9;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod10 = new MediaGenAIDetectionMethod("SELF_DISCLOSURE_FLOW", 9, "SELF_DISCLOSURE_FLOW");
        A0C = mediaGenAIDetectionMethod10;
        MediaGenAIDetectionMethod[] mediaGenAIDetectionMethodArr = {mediaGenAIDetectionMethod, mediaGenAIDetectionMethod2, mediaGenAIDetectionMethod3, mediaGenAIDetectionMethod4, mediaGenAIDetectionMethod5, mediaGenAIDetectionMethod6, mediaGenAIDetectionMethod7, mediaGenAIDetectionMethod8, mediaGenAIDetectionMethod9, mediaGenAIDetectionMethod10};
        A03 = mediaGenAIDetectionMethodArr;
        A02 = AbstractC12190kN.A00(mediaGenAIDetectionMethodArr);
        MediaGenAIDetectionMethod[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (MediaGenAIDetectionMethod mediaGenAIDetectionMethod11 : values) {
            linkedHashMap.put(mediaGenAIDetectionMethod11.A00, mediaGenAIDetectionMethod11);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(41);
    }

    public static MediaGenAIDetectionMethod valueOf(String str) {
        return (MediaGenAIDetectionMethod) Enum.valueOf(MediaGenAIDetectionMethod.class, str);
    }

    public static MediaGenAIDetectionMethod[] values() {
        return (MediaGenAIDetectionMethod[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MediaGenAIDetectionMethod(String str, int i, String str2) {
        this.A00 = str2;
    }
}
