package com.instagram.direct.inbox.notes.models;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25231BEo;
import X.C0T6;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class NoteAudienceItem extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(8);
    public final NoteAudience A00;
    public final int A01;
    public final String A02;
    public final List A03;

    public NoteAudienceItem(NoteAudience noteAudience, String str, List list, int i) {
        C14360o3.A0B(noteAudience, 1);
        this.A00 = noteAudience;
        this.A02 = str;
        this.A01 = i;
        this.A03 = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NoteAudienceItem) {
                NoteAudienceItem noteAudienceItem = (NoteAudienceItem) obj;
                if (this.A00 != noteAudienceItem.A00 || !C14360o3.A0K(this.A02, noteAudienceItem.A02) || this.A01 != noteAudienceItem.A01 || !C14360o3.A0K(this.A03, noteAudienceItem.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A00.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, list);
        while (A0u.hasNext()) {
            parcel.writeParcelable((Parcelable) A0u.next(), i);
        }
    }

    public final int hashCode() {
        return ((((AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A02)) * 31) + this.A01) * 31) + AbstractC166997dE.A0I(this.A03);
    }
}
