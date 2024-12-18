package com.instagram.api.schemas;

import X.AbstractC40043HpV;
import X.C0T6;
import X.C14360o3;
import X.C1DY;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes3.dex */
public final class ListeningNowResponseInfo extends C0T6 implements Parcelable, ListeningNowResponseInfoIntf {
    public static final Parcelable.Creator CREATOR = new C41858IgC(72);
    public final ListeningNowState A00;
    public final MusicInfo A01;
    public final Boolean A02;
    public final Integer A03;

    public ListeningNowResponseInfo(ListeningNowState listeningNowState, MusicInfo musicInfo, Boolean bool, Integer num) {
        C14360o3.A0B(listeningNowState, 2);
        this.A02 = bool;
        this.A00 = listeningNowState;
        this.A01 = musicInfo;
        this.A03 = num;
    }

    @Override // com.instagram.api.schemas.ListeningNowResponseInfoIntf
    public final ListeningNowResponseInfo Evy(C1DY c1dy) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ListeningNowResponseInfo) {
                ListeningNowResponseInfo listeningNowResponseInfo = (ListeningNowResponseInfo) obj;
                if (!C14360o3.A0K(this.A02, listeningNowResponseInfo.A02) || this.A00 != listeningNowResponseInfo.A00 || !C14360o3.A0K(this.A01, listeningNowResponseInfo.A01) || !C14360o3.A0K(this.A03, listeningNowResponseInfo.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A02;
        int hashCode = (((bool == null ? 0 : bool.hashCode()) * 31) + this.A00.hashCode()) * 31;
        MusicInfo musicInfo = this.A01;
        int hashCode2 = (hashCode + (musicInfo == null ? 0 : musicInfo.hashCode())) * 31;
        Integer num = this.A03;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Boolean bool = this.A02;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        Integer num = this.A03;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    @Override // com.instagram.api.schemas.ListeningNowResponseInfoIntf
    public final ListeningNowState BNq() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ListeningNowResponseInfoIntf
    public final MusicInfo BVc() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.ListeningNowResponseInfoIntf
    public final Integer BY2() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.ListeningNowResponseInfoIntf
    public final Boolean Cdb() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.ListeningNowResponseInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTListeningNowResponseInfo", AbstractC40043HpV.A00(this));
    }
}
