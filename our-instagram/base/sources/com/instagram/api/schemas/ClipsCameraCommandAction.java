package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ClipsCameraCommandAction implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsCameraCommandAction[] A03;
    public static final ClipsCameraCommandAction A04;
    public static final ClipsCameraCommandAction A05;
    public static final ClipsCameraCommandAction A06;
    public static final ClipsCameraCommandAction A07;
    public static final ClipsCameraCommandAction A08;
    public static final ClipsCameraCommandAction A09;
    public static final ClipsCameraCommandAction A0A;
    public static final ClipsCameraCommandAction A0B;
    public static final ClipsCameraCommandAction A0C;
    public static final ClipsCameraCommandAction A0D;
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
        ClipsCameraCommandAction clipsCameraCommandAction = new ClipsCameraCommandAction("UNRECOGNIZED", 0, "ClipsCameraCommandAction_unspecified");
        A0B = clipsCameraCommandAction;
        ClipsCameraCommandAction clipsCameraCommandAction2 = new ClipsCameraCommandAction("COLLAB_EDUCATION", 1, "collab_education");
        A04 = clipsCameraCommandAction2;
        ClipsCameraCommandAction clipsCameraCommandAction3 = new ClipsCameraCommandAction("DEFAULT", 2, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A05 = clipsCameraCommandAction3;
        ClipsCameraCommandAction clipsCameraCommandAction4 = new ClipsCameraCommandAction("GALLERY_FIRST", 3, "gallery_first");
        A06 = clipsCameraCommandAction4;
        ClipsCameraCommandAction clipsCameraCommandAction5 = new ClipsCameraCommandAction("GREEN_SCREEN_CAMERA_TOOL_OPEN", 4, "green_screen_camera_tool_open");
        A07 = clipsCameraCommandAction5;
        ClipsCameraCommandAction clipsCameraCommandAction6 = new ClipsCameraCommandAction("META_GALLERY", 5, "meta_gallery");
        A08 = clipsCameraCommandAction6;
        ClipsCameraCommandAction clipsCameraCommandAction7 = new ClipsCameraCommandAction("MWA_TOP_CAPTURES", 6, "mwa_top_captures");
        A09 = clipsCameraCommandAction7;
        ClipsCameraCommandAction clipsCameraCommandAction8 = new ClipsCameraCommandAction("PRELOAD_STORY", 7, "preload_story");
        A0A = clipsCameraCommandAction8;
        ClipsCameraCommandAction clipsCameraCommandAction9 = new ClipsCameraCommandAction("USE_AUDIO", 8, "use_audio");
        A0C = clipsCameraCommandAction9;
        ClipsCameraCommandAction clipsCameraCommandAction10 = new ClipsCameraCommandAction("USE_AUDIO_TRIMMING", 9, "use_audio_trimming");
        A0D = clipsCameraCommandAction10;
        ClipsCameraCommandAction[] clipsCameraCommandActionArr = {clipsCameraCommandAction, clipsCameraCommandAction2, clipsCameraCommandAction3, clipsCameraCommandAction4, clipsCameraCommandAction5, clipsCameraCommandAction6, clipsCameraCommandAction7, clipsCameraCommandAction8, clipsCameraCommandAction9, clipsCameraCommandAction10, new ClipsCameraCommandAction("USE_TEMPLATE", 10, "use_template")};
        A03 = clipsCameraCommandActionArr;
        A02 = AbstractC12190kN.A00(clipsCameraCommandActionArr);
        ClipsCameraCommandAction[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ClipsCameraCommandAction clipsCameraCommandAction11 : values) {
            linkedHashMap.put(clipsCameraCommandAction11.A00, clipsCameraCommandAction11);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(62);
    }

    public static ClipsCameraCommandAction valueOf(String str) {
        return (ClipsCameraCommandAction) Enum.valueOf(ClipsCameraCommandAction.class, str);
    }

    public static ClipsCameraCommandAction[] values() {
        return (ClipsCameraCommandAction[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsCameraCommandAction(String str, int i, String str2) {
        this.A00 = str2;
    }
}
