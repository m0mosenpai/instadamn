package com.instagram.api.schemas;

import X.AbstractC40126Hqt;
import X.C0T6;
import X.C14360o3;
import X.C1DY;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class OriginalAudioPartMetadata extends C0T6 implements OriginalAudioPartMetadataIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206159Ax(73);
    public final int A00;
    public final int A01;
    public final int A02;
    public final MusicCanonicalType A03;
    public final ImageUrl A04;
    public final User A05;
    public final Boolean A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final boolean A0B;
    public final boolean A0C;

    public OriginalAudioPartMetadata(MusicCanonicalType musicCanonicalType, ImageUrl imageUrl, User user, Boolean bool, String str, String str2, String str3, List list, int i, int i2, int i3, boolean z, boolean z2) {
        C14360o3.A0B(musicCanonicalType, 3);
        C14360o3.A0B(str, 4);
        C14360o3.A0B(str2, 5);
        C14360o3.A0B(str3, 11);
        C14360o3.A0B(imageUrl, 13);
        this.A0A = list;
        this.A00 = i;
        this.A03 = musicCanonicalType;
        this.A07 = str;
        this.A08 = str2;
        this.A01 = i2;
        this.A05 = user;
        this.A0B = z;
        this.A06 = bool;
        this.A0C = z2;
        this.A09 = str3;
        this.A02 = i3;
        this.A04 = imageUrl;
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final OriginalAudioPartMetadataIntf E9U(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final OriginalAudioPartMetadata Exg(C1DY c1dy) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OriginalAudioPartMetadata) {
                OriginalAudioPartMetadata originalAudioPartMetadata = (OriginalAudioPartMetadata) obj;
                if (!C14360o3.A0K(this.A0A, originalAudioPartMetadata.A0A) || this.A00 != originalAudioPartMetadata.A00 || this.A03 != originalAudioPartMetadata.A03 || !C14360o3.A0K(this.A07, originalAudioPartMetadata.A07) || !C14360o3.A0K(this.A08, originalAudioPartMetadata.A08) || this.A01 != originalAudioPartMetadata.A01 || !C14360o3.A0K(this.A05, originalAudioPartMetadata.A05) || this.A0B != originalAudioPartMetadata.A0B || !C14360o3.A0K(this.A06, originalAudioPartMetadata.A06) || this.A0C != originalAudioPartMetadata.A0C || !C14360o3.A0K(this.A09, originalAudioPartMetadata.A09) || this.A02 != originalAudioPartMetadata.A02 || !C14360o3.A0K(this.A04, originalAudioPartMetadata.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        List list = this.A0A;
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
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A01);
        parcel.writeParcelable(this.A05, i);
        parcel.writeInt(this.A0B ? 1 : 0);
        Boolean bool = this.A06;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A02);
        parcel.writeParcelable(this.A04, i);
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final List Ado() {
        return this.A0A;
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final int Ae3() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final MusicCanonicalType Ae6() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final User BFU() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final int BbS() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final ImageUrl C88() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final Boolean CT1() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTOriginalAudioPartMetadata", AbstractC40126Hqt.A00(this));
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final String getDisplayArtist() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final String getDisplayTitle() {
        return this.A08;
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final int getDurationInMs() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final String getMusicCanonicalId() {
        return this.A09;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        List list = this.A0A;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int hashCode3 = ((((((((((hashCode * 31) + this.A00) * 31) + this.A03.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A01) * 31;
        User user = this.A05;
        if (user == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = user.hashCode();
        }
        int i2 = (hashCode3 + hashCode2) * 31;
        int i3 = 1237;
        if (this.A0B) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        Boolean bool = this.A06;
        if (bool != null) {
            i = bool.hashCode();
        }
        int i5 = (i4 + i) * 31;
        int i6 = 1237;
        if (this.A0C) {
            i6 = 1231;
        }
        return ((((((i5 + i6) * 31) + this.A09.hashCode()) * 31) + this.A02) * 31) + this.A04.hashCode();
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final boolean isBookmarked() {
        return this.A0B;
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final boolean isExplicit() {
        return this.A0C;
    }
}
