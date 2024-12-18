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
public final class NoteStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ NoteStyle[] A03;
    public static final NoteStyle A04;
    public static final NoteStyle A05;
    public static final NoteStyle A06;
    public static final NoteStyle A07;
    public static final NoteStyle A08;
    public static final NoteStyle A09;
    public static final NoteStyle A0A;
    public static final NoteStyle A0B;
    public static final NoteStyle A0C;
    public static final NoteStyle A0D;
    public static final NoteStyle A0E;
    public static final NoteStyle A0F;
    public static final Parcelable.Creator CREATOR;
    public final int A00;

    public static NoteStyle valueOf(String str) {
        return (NoteStyle) Enum.valueOf(NoteStyle.class, str);
    }

    public static NoteStyle[] values() {
        return (NoteStyle[]) A03.clone();
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
        NoteStyle noteStyle = new NoteStyle("UNKNOWN", 0, -1);
        A0E = noteStyle;
        NoteStyle noteStyle2 = new NoteStyle("TEXT", 1, 0);
        A0D = noteStyle2;
        NoteStyle noteStyle3 = new NoteStyle("MUSIC", 2, 1);
        A0A = noteStyle3;
        NoteStyle noteStyle4 = new NoteStyle("AUDIO", 3, 3);
        A04 = noteStyle4;
        NoteStyle noteStyle5 = new NoteStyle("UNSUPPORTED", 4, 4);
        A0F = noteStyle5;
        NoteStyle noteStyle6 = new NoteStyle("LOCATION", 5, 5);
        A09 = noteStyle6;
        NoteStyle noteStyle7 = new NoteStyle("LIVE", 6, 6);
        A08 = noteStyle7;
        NoteStyle noteStyle8 = new NoteStyle("EMPTY", 7, 7);
        A05 = noteStyle8;
        NoteStyle noteStyle9 = new NoteStyle("PROMPT_QUESTION", 8, 8);
        A0C = noteStyle9;
        NoteStyle noteStyle10 = new NoteStyle("NOTE_CHAT", 9, 9);
        A0B = noteStyle10;
        NoteStyle noteStyle11 = new NoteStyle("LISTENING_NOW", 10, 10);
        A07 = noteStyle11;
        NoteStyle noteStyle12 = new NoteStyle("GIF", 11, 11);
        A06 = noteStyle12;
        NoteStyle[] noteStyleArr = {noteStyle, noteStyle2, noteStyle3, noteStyle4, noteStyle5, noteStyle6, noteStyle7, noteStyle8, noteStyle9, noteStyle10, noteStyle11, noteStyle12};
        A03 = noteStyleArr;
        A02 = AbstractC12190kN.A00(noteStyleArr);
        NoteStyle[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (NoteStyle noteStyle13 : values) {
            linkedHashMap.put(Integer.valueOf(noteStyle13.A00), noteStyle13);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(75);
    }

    public NoteStyle(String str, int i, int i2) {
        this.A00 = i2;
    }
}
