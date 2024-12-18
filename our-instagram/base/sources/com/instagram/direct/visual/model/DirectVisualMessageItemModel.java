package com.instagram.direct.visual.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25236BEt;
import X.C14360o3;
import X.LNL;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

/* loaded from: classes8.dex */
public final class DirectVisualMessageItemModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(45);
    public final int A00;
    public final long A01;
    public final MediaFields A02;
    public final PrivacyMediaOverlayViewModel A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    /* loaded from: classes8.dex */
    public abstract class MediaFields implements Parcelable {

        /* loaded from: classes8.dex */
        public final class RemixMedia extends MediaFields {
            public static final Parcelable.Creator CREATOR = LNL.A00(46);
            public final Uri A00;
            public final Uri A01;
            public final String A02;
            public final String A03;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof RemixMedia) {
                        RemixMedia remixMedia = (RemixMedia) obj;
                        if (!C14360o3.A0K(this.A00, remixMedia.A00) || !C14360o3.A0K(this.A01, remixMedia.A01) || !C14360o3.A0K(this.A03, remixMedia.A03) || !C14360o3.A0K(this.A02, remixMedia.A02)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                C14360o3.A0B(parcel, 0);
                parcel.writeParcelable(this.A00, i);
                parcel.writeParcelable(this.A01, i);
                parcel.writeString(this.A03);
                parcel.writeString(this.A02);
            }

            public final int hashCode() {
                return ((AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A02);
            }

            public RemixMedia(Uri uri, Uri uri2, String str, String str2) {
                AbstractC167017dG.A1P(uri, uri2);
                this.A00 = uri;
                this.A01 = uri2;
                this.A03 = str;
                this.A02 = str2;
            }

            public final String toString() {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("RemixMedia(contentUri=");
                A1C.append(this.A00);
                A1C.append(", previewUri=");
                A1C.append(this.A01);
                A1C.append(", reshareMode=");
                A1C.append(this.A03);
                A1C.append(", originalMediaUrl=");
                return AbstractC25236BEt.A0Y(this.A02, A1C);
            }
        }

        /* loaded from: classes8.dex */
        public final class TamMedia extends MediaFields {
            public static final Parcelable.Creator CREATOR = LNL.A00(47);
            public final Uri A00;
            public final Uri A01;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof TamMedia) {
                        TamMedia tamMedia = (TamMedia) obj;
                        if (!C14360o3.A0K(this.A00, tamMedia.A00) || !C14360o3.A0K(this.A01, tamMedia.A01)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                C14360o3.A0B(parcel, 0);
                parcel.writeParcelable(this.A00, i);
                parcel.writeParcelable(this.A01, i);
            }

            public final int hashCode() {
                return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
            }

            public TamMedia(Uri uri, Uri uri2) {
                AbstractC167017dG.A1P(uri, uri2);
                this.A00 = uri;
                this.A01 = uri2;
            }

            public final String toString() {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("TamMedia(contentUri=");
                A1C.append(this.A00);
                A1C.append(", previewUri=");
                return AbstractC167017dG.A0o(this.A01, A1C);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A04);
    }

    public DirectVisualMessageItemModel(MediaFields mediaFields, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, String str, String str2, String str3, int i, long j, boolean z) {
        AbstractC167017dG.A1P(str, str2);
        C14360o3.A0B(mediaFields, 6);
        this.A05 = str;
        this.A06 = str2;
        this.A01 = j;
        this.A07 = z;
        this.A00 = i;
        this.A02 = mediaFields;
        this.A03 = privacyMediaOverlayViewModel;
        this.A04 = str3;
    }
}
