package com.instagram.api.schemas;

import X.AbstractC65737TtC;
import X.C0T6;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes2.dex */
public final class OriginalSoundConsumptionInfo extends C0T6 implements OriginalSoundConsumptionInfoIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206159Ax(75);
    public final MusicMuteAudioReason A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public OriginalSoundConsumptionInfo(MusicMuteAudioReason musicMuteAudioReason, String str, String str2, boolean z, boolean z2) {
        C14360o3.A0B(str2, 4);
        this.A01 = str;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = str2;
        this.A00 = musicMuteAudioReason;
    }

    @Override // com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf
    public final OriginalSoundConsumptionInfo Exh() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OriginalSoundConsumptionInfo) {
                OriginalSoundConsumptionInfo originalSoundConsumptionInfo = (OriginalSoundConsumptionInfo) obj;
                if (!C14360o3.A0K(this.A01, originalSoundConsumptionInfo.A01) || this.A03 != originalSoundConsumptionInfo.A03 || this.A04 != originalSoundConsumptionInfo.A04 || !C14360o3.A0K(this.A02, originalSoundConsumptionInfo.A02) || this.A00 != originalSoundConsumptionInfo.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf
    public final String AyY() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf
    public final MusicMuteAudioReason BvC() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTOriginalSoundConsumptionInfo", AbstractC65737TtC.A00(this));
    }

    @Override // com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf
    public final String getShouldMuteAudioReason() {
        return this.A02;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A01;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        int i3 = 1237;
        if (this.A03) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A04) {
            i5 = 1231;
        }
        int hashCode2 = (((i4 + i5) * 31) + this.A02.hashCode()) * 31;
        MusicMuteAudioReason musicMuteAudioReason = this.A00;
        if (musicMuteAudioReason != null) {
            i = musicMuteAudioReason.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf
    public final boolean isBookmarked() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf
    public final boolean isTrendingInClips() {
        return this.A04;
    }
}
