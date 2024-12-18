package com.instagram.direct.inbox.notes.models;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class NoteCreationSource implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ NoteCreationSource[] A03;
    public static final NoteCreationSource A04;
    public static final NoteCreationSource A05;
    public static final NoteCreationSource A06;
    public static final Parcelable.Creator CREATOR;
    public final int A00;

    public static NoteCreationSource valueOf(String str) {
        return (NoteCreationSource) Enum.valueOf(NoteCreationSource.class, str);
    }

    public static NoteCreationSource[] values() {
        return (NoteCreationSource[]) A03.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        NoteCreationSource noteCreationSource = new NoteCreationSource("UNKNOWN", 0, 0);
        A06 = noteCreationSource;
        NoteCreationSource noteCreationSource2 = new NoteCreationSource("INBOX_TRAY", 1, 1);
        A04 = noteCreationSource2;
        NoteCreationSource noteCreationSource3 = new NoteCreationSource("PROFILE_HEADER", 2, 2);
        A05 = noteCreationSource3;
        NoteCreationSource[] noteCreationSourceArr = {noteCreationSource, noteCreationSource2, noteCreationSource3, new NoteCreationSource("PROFILE_WALL", 3, 3)};
        A03 = noteCreationSourceArr;
        A02 = AbstractC12190kN.A00(noteCreationSourceArr);
        NoteCreationSource[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (NoteCreationSource noteCreationSource4 : values) {
            AbstractC25227BEk.A1O(noteCreationSource4, A18, noteCreationSource4.A00);
        }
        A01 = A18;
        CREATOR = LNL.A00(9);
    }

    public NoteCreationSource(String str, int i, int i2) {
        this.A00 = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
