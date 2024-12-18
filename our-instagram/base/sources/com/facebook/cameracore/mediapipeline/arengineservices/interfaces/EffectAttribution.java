package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class EffectAttribution implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(66);
    public final License[] mLicenses;

    /* loaded from: classes10.dex */
    public class AttributedAsset implements Parcelable {
        public static final Parcelable.Creator CREATOR = C63475SlG.A02(67);
        public final String mAssetIdentifier;
        public final String mAssetURL;
        public final String mAuthor;
        public final String mNotes;
        public final String mTitle;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mAssetIdentifier);
            parcel.writeString(this.mTitle);
            parcel.writeString(this.mAuthor);
            parcel.writeString(this.mAssetURL);
            parcel.writeString(this.mNotes);
        }

        public AttributedAsset(Parcel parcel) {
            this.mAssetIdentifier = parcel.readString();
            this.mTitle = parcel.readString();
            this.mAuthor = parcel.readString();
            this.mAssetURL = parcel.readString();
            this.mNotes = parcel.readString();
        }

        public AttributedAsset(String str, String str2, String str3, String str4, String str5) {
            this.mAssetIdentifier = str;
            this.mTitle = str2;
            this.mAuthor = str3;
            this.mAssetURL = str4;
            this.mNotes = str5;
        }
    }

    /* loaded from: classes10.dex */
    public class License implements Parcelable {
        public static final Parcelable.Creator CREATOR = C63475SlG.A02(68);
        public final AttributedAsset[] mAttributedAssets;
        public final String mIdentifier;
        public final String mName;
        public final String mUrl;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mIdentifier);
            parcel.writeString(this.mName);
            parcel.writeString(this.mUrl);
            parcel.writeTypedArray(this.mAttributedAssets, i);
        }

        public License(Parcel parcel) {
            this.mIdentifier = parcel.readString();
            this.mName = parcel.readString();
            this.mUrl = parcel.readString();
            this.mAttributedAssets = (AttributedAsset[]) parcel.createTypedArray(AttributedAsset.CREATOR);
        }

        public License(String str, String str2, String str3, AttributedAsset[] attributedAssetArr) {
            this.mIdentifier = str;
            this.mName = str2;
            this.mUrl = str3;
            this.mAttributedAssets = attributedAssetArr;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.mLicenses, i);
    }

    public EffectAttribution(Parcel parcel) {
        this.mLicenses = (License[]) parcel.createTypedArray(License.CREATOR);
    }

    public EffectAttribution(License[] licenseArr) {
        this.mLicenses = licenseArr;
    }
}
