package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class TextPostAppPostUnavailableReason implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TextPostAppPostUnavailableReason[] A03;
    public static final TextPostAppPostUnavailableReason A04;
    public static final TextPostAppPostUnavailableReason A05;
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
        TextPostAppPostUnavailableReason textPostAppPostUnavailableReason = new TextPostAppPostUnavailableReason("UNRECOGNIZED", 0, "TextPostAppPostUnavailableReason_unspecified");
        A05 = textPostAppPostUnavailableReason;
        TextPostAppPostUnavailableReason textPostAppPostUnavailableReason2 = new TextPostAppPostUnavailableReason("HIDDEN", 1, "hidden");
        A04 = textPostAppPostUnavailableReason2;
        TextPostAppPostUnavailableReason[] textPostAppPostUnavailableReasonArr = {textPostAppPostUnavailableReason, textPostAppPostUnavailableReason2, new TextPostAppPostUnavailableReason("UNKNOWN", 2, "unknown")};
        A03 = textPostAppPostUnavailableReasonArr;
        A02 = AbstractC12190kN.A00(textPostAppPostUnavailableReasonArr);
        TextPostAppPostUnavailableReason[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (TextPostAppPostUnavailableReason textPostAppPostUnavailableReason3 : values) {
            linkedHashMap.put(textPostAppPostUnavailableReason3.A00, textPostAppPostUnavailableReason3);
        }
        A01 = linkedHashMap;
        CREATOR = new C41857IgB(60);
    }

    public static TextPostAppPostUnavailableReason valueOf(String str) {
        return (TextPostAppPostUnavailableReason) Enum.valueOf(TextPostAppPostUnavailableReason.class, str);
    }

    public static TextPostAppPostUnavailableReason[] values() {
        return (TextPostAppPostUnavailableReason[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TextPostAppPostUnavailableReason(String str, int i, String str2) {
        this.A00 = str2;
    }
}
