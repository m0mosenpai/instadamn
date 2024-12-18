package com.instagram.direct.inbox.notes.models;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NoteAudience implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ NoteAudience[] A03;
    public static final NoteAudience A04;
    public static final NoteAudience A05;
    public static final NoteAudience A06;
    public static final NoteAudience A07;
    public static final NoteAudience A08;
    public static final Parcelable.Creator CREATOR;
    public final int A00;

    public static NoteAudience valueOf(String str) {
        return (NoteAudience) Enum.valueOf(NoteAudience.class, str);
    }

    public static NoteAudience[] values() {
        return (NoteAudience[]) A03.clone();
    }

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
        NoteAudience noteAudience = new NoteAudience("UNKNOWN", 0, -1);
        A08 = noteAudience;
        NoteAudience noteAudience2 = new NoteAudience("MUTUAL_FOLLOWERS", 1, 0);
        A07 = noteAudience2;
        NoteAudience noteAudience3 = new NoteAudience("CLOSE_FRIENDS", 2, 1);
        A05 = noteAudience3;
        NoteAudience noteAudience4 = new NoteAudience("INTERNAL_ONLY", 3, 2);
        A06 = noteAudience4;
        NoteAudience noteAudience5 = new NoteAudience("ALL_FOLLOWERS", 4, 3);
        A04 = noteAudience5;
        NoteAudience[] noteAudienceArr = {noteAudience, noteAudience2, noteAudience3, noteAudience4, noteAudience5, new NoteAudience("PROFILE_WALL", 5, 5)};
        A03 = noteAudienceArr;
        A02 = AbstractC12190kN.A00(noteAudienceArr);
        NoteAudience[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (NoteAudience noteAudience6 : values) {
            linkedHashMap.put(Integer.valueOf(noteAudience6.A00), noteAudience6);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(74);
    }

    public NoteAudience(String str, int i, int i2) {
        this.A00 = i2;
    }
}
