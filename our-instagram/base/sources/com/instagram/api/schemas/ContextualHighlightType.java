package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ContextualHighlightType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ContextualHighlightType[] A03;
    public static final ContextualHighlightType A04;
    public static final ContextualHighlightType A05;
    public static final ContextualHighlightType A06;
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
        ContextualHighlightType contextualHighlightType = new ContextualHighlightType("UNRECOGNIZED", 0, "ContextualHighlightType_unspecified");
        A06 = contextualHighlightType;
        ContextualHighlightType contextualHighlightType2 = new ContextualHighlightType("EFFECT", 1, "effect");
        A04 = contextualHighlightType2;
        ContextualHighlightType contextualHighlightType3 = new ContextualHighlightType("MASHUP", 2, "mashup");
        A05 = contextualHighlightType3;
        ContextualHighlightType[] contextualHighlightTypeArr = {contextualHighlightType, contextualHighlightType2, contextualHighlightType3, new ContextualHighlightType("TEMPLATE", 3, "template")};
        A03 = contextualHighlightTypeArr;
        A02 = AbstractC12190kN.A00(contextualHighlightTypeArr);
        ContextualHighlightType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ContextualHighlightType contextualHighlightType4 : values) {
            linkedHashMap.put(contextualHighlightType4.A00, contextualHighlightType4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(79);
    }

    public static ContextualHighlightType valueOf(String str) {
        return (ContextualHighlightType) Enum.valueOf(ContextualHighlightType.class, str);
    }

    public static ContextualHighlightType[] values() {
        return (ContextualHighlightType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ContextualHighlightType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
