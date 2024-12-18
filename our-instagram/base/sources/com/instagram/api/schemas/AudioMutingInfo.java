package com.instagram.api.schemas;

import X.AbstractC65728Tt3;
import X.C0T6;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes2.dex */
public final class AudioMutingInfo extends C0T6 implements Parcelable, AudioMutingInfoIntf {
    public static final Parcelable.Creator CREATOR = new C206149Aw(49);
    public final MusicMuteAudioReason A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public AudioMutingInfo(MusicMuteAudioReason musicMuteAudioReason, String str, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str, 4);
        this.A02 = z;
        this.A03 = z2;
        this.A00 = musicMuteAudioReason;
        this.A01 = str;
        this.A04 = z3;
    }

    @Override // com.instagram.api.schemas.AudioMutingInfoIntf
    public final AudioMutingInfo Er4() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioMutingInfo) {
                AudioMutingInfo audioMutingInfo = (AudioMutingInfo) obj;
                if (this.A02 != audioMutingInfo.A02 || this.A03 != audioMutingInfo.A03 || this.A00 != audioMutingInfo.A00 || !C14360o3.A0K(this.A01, audioMutingInfo.A01) || this.A04 != audioMutingInfo.A04) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    @Override // com.instagram.api.schemas.AudioMutingInfoIntf
    public final boolean AbC() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.AudioMutingInfoIntf
    public final boolean BVt() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.AudioMutingInfoIntf
    public final MusicMuteAudioReason BVu() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.AudioMutingInfoIntf
    public final String BVv() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.AudioMutingInfoIntf
    public final boolean Bwc() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.AudioMutingInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAudioMutingInfo", AbstractC65728Tt3.A00(this));
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A03) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        MusicMuteAudioReason musicMuteAudioReason = this.A00;
        if (musicMuteAudioReason == null) {
            hashCode = 0;
        } else {
            hashCode = musicMuteAudioReason.hashCode();
        }
        int hashCode2 = (((i4 + hashCode) * 31) + this.A01.hashCode()) * 31;
        int i5 = 1237;
        if (this.A04) {
            i5 = 1231;
        }
        return hashCode2 + i5;
    }
}
