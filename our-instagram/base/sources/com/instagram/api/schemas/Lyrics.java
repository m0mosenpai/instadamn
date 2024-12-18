package com.instagram.api.schemas;

import X.AbstractC40055Hph;
import X.C0T6;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class Lyrics extends C0T6 implements Parcelable, LyricsIntf {
    public static final Parcelable.Creator CREATOR = new C206159Ax(38);
    public final List A00;

    public Lyrics(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // com.instagram.api.schemas.LyricsIntf
    public final Lyrics EwA() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof Lyrics) && C14360o3.A0K(this.A00, ((Lyrics) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        List list = this.A00;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }

    @Override // com.instagram.api.schemas.LyricsIntf
    public final List Bd4() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.LyricsIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLyrics", AbstractC40055Hph.A00(this));
    }
}
