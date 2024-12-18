package com.instagram.api.schemas;

import X.AbstractC40046HpY;
import X.C0T6;
import X.C14360o3;
import X.C1DY;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class LiveNoteResponseInfo extends C0T6 implements Parcelable, LiveNoteResponseInfoIntf {
    public static final Parcelable.Creator CREATOR = new C41858IgC(74);
    public final long A00;
    public final List A01;

    @Override // com.instagram.api.schemas.LiveNoteResponseInfoIntf
    public final LiveNoteResponseInfo Ew0(C1DY c1dy) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LiveNoteResponseInfo) {
                LiveNoteResponseInfo liveNoteResponseInfo = (LiveNoteResponseInfo) obj;
                if (!C14360o3.A0K(this.A01, liveNoteResponseInfo.A01) || this.A00 != liveNoteResponseInfo.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        List list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i);
            }
        }
        parcel.writeLong(this.A00);
    }

    @Override // com.instagram.api.schemas.LiveNoteResponseInfoIntf
    public final List C3T() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.LiveNoteResponseInfoIntf
    public final long C8b() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.LiveNoteResponseInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLiveNoteResponseInfo", AbstractC40046HpY.A00(this));
    }

    public final int hashCode() {
        int hashCode;
        List list = this.A01;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        long j = this.A00;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public LiveNoteResponseInfo(List list, long j) {
        this.A01 = list;
        this.A00 = j;
    }
}
