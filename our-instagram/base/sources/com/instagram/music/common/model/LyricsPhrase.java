package com.instagram.music.common.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class LyricsPhrase extends C0T6 implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(76);
    public int A00;
    public String A01;
    public List A02;

    public LyricsPhrase(List list, int i, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = i;
        this.A01 = str;
        this.A02 = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LyricsPhrase) {
                LyricsPhrase lyricsPhrase = (LyricsPhrase) obj;
                if (this.A00 != lyricsPhrase.A00 || !C14360o3.A0K(this.A01, lyricsPhrase.A01) || !C14360o3.A0K(this.A02, lyricsPhrase.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        List list = this.A02;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
        while (A0l.hasNext()) {
            ((WordOffset) A0l.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A01, this.A00 * 31) + AbstractC167017dG.A0M(this.A02);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C14360o3.A00(this.A00, AbstractC166987dD.A0H(obj));
    }

    public LyricsPhrase() {
        this(null, 0, "");
    }
}
