package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class NoteActivationType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ NoteActivationType[] A03;
    public static final NoteActivationType A04;
    public static final NoteActivationType A05;
    public static final NoteActivationType A06;
    public static final NoteActivationType A07;
    public static final NoteActivationType A08;
    public static final NoteActivationType A09;
    public static final NoteActivationType A0A;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        NoteActivationType noteActivationType = new NoteActivationType("UNRECOGNIZED", 0, "NoteActivationType_unspecified");
        A08 = noteActivationType;
        NoteActivationType noteActivationType2 = new NoteActivationType("DEMURE_NOTES", 1, "demure_notes");
        A04 = noteActivationType2;
        NoteActivationType noteActivationType3 = new NoteActivationType("HALLOWEEN_NOTES", 2, "halloween_notes");
        A05 = noteActivationType3;
        NoteActivationType noteActivationType4 = new NoteActivationType("PARALYMPIC_NOTES", 3, "paralympic_notes");
        A06 = noteActivationType4;
        NoteActivationType noteActivationType5 = new NoteActivationType("SABRINA_NOTES", 4, "sabrina_notes");
        A07 = noteActivationType5;
        NoteActivationType noteActivationType6 = new NoteActivationType("UNSUPPORTED", 5, "unsupported");
        A09 = noteActivationType6;
        NoteActivationType noteActivationType7 = new NoteActivationType("WNBA_NOTES", 6, "wnba_notes");
        A0A = noteActivationType7;
        NoteActivationType[] noteActivationTypeArr = {noteActivationType, noteActivationType2, noteActivationType3, noteActivationType4, noteActivationType5, noteActivationType6, noteActivationType7};
        A03 = noteActivationTypeArr;
        A02 = AbstractC12190kN.A00(noteActivationTypeArr);
        NoteActivationType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (NoteActivationType noteActivationType8 : values) {
            A18.put(noteActivationType8.A00, noteActivationType8);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(14);
    }

    public static NoteActivationType valueOf(String str) {
        return (NoteActivationType) Enum.valueOf(NoteActivationType.class, str);
    }

    public static NoteActivationType[] values() {
        return (NoteActivationType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public NoteActivationType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
