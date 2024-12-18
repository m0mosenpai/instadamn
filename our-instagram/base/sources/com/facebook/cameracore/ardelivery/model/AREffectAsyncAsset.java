package com.facebook.cameracore.ardelivery.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public class AREffectAsyncAsset implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63475SlG(34);
    public final String mCacheKey;
    public final ARRequestAsset.CompressionMethod mCompressionMethod;
    public final String mId;
    public final boolean mIsLoggingDisabled;
    public final List mStringIdentifiers;
    public final String mUri;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AREffectAsyncAsset)) {
            return false;
        }
        AREffectAsyncAsset aREffectAsyncAsset = (AREffectAsyncAsset) obj;
        return this.mId.equals(aREffectAsyncAsset.mId) && this.mCacheKey.equals(aREffectAsyncAsset.mCacheKey) && this.mStringIdentifiers.equals(aREffectAsyncAsset.mStringIdentifiers) && this.mUri.equals(aREffectAsyncAsset.mUri) && this.mCompressionMethod == aREffectAsyncAsset.mCompressionMethod && this.mIsLoggingDisabled == aREffectAsyncAsset.mIsLoggingDisabled;
    }

    public String getCacheKey() {
        return this.mCacheKey;
    }

    public ARRequestAsset.CompressionMethod getCompressionMethod() {
        return this.mCompressionMethod;
    }

    public int getCompressionMethodForNative() {
        return ARRequestAsset.CompressionMethod.toXplatCompressionType(this.mCompressionMethod).A00;
    }

    public String[] getFileNamesForNative() {
        return (String[]) this.mStringIdentifiers.toArray(new String[0]);
    }

    public String getId() {
        return this.mId;
    }

    public ImmutableList getStringIdentifiers() {
        return ImmutableList.copyOf((Collection) this.mStringIdentifiers);
    }

    public String getUri() {
        return this.mUri;
    }

    public int hashCode() {
        return AbstractC166997dE.A0J(this.mCompressionMethod, AbstractC166997dE.A0K(this.mUri, (AbstractC166997dE.A0K(this.mCacheKey, AbstractC166987dD.A0J(this.mId)) + this.mStringIdentifiers.hashCode()) * 31)) + (this.mIsLoggingDisabled ? 1 : 0);
    }

    public boolean isLoggingDisabled() {
        return this.mIsLoggingDisabled;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mCacheKey);
        parcel.writeStringList(this.mStringIdentifiers);
        parcel.writeString(this.mUri);
        parcel.writeSerializable(this.mCompressionMethod);
        parcel.writeByte(this.mIsLoggingDisabled ? (byte) 1 : (byte) 0);
    }

    public AREffectAsyncAsset(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.mId = readString;
        String readString2 = parcel.readString();
        readString2.getClass();
        this.mCacheKey = readString2;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.mStringIdentifiers = A1E;
        parcel.readStringList(A1E);
        String readString3 = parcel.readString();
        readString3.getClass();
        this.mUri = readString3;
        Serializable readSerializable = parcel.readSerializable();
        readSerializable.getClass();
        this.mCompressionMethod = (ARRequestAsset.CompressionMethod) readSerializable;
        this.mIsLoggingDisabled = AbstractC167007dF.A1M(parcel.readByte());
    }

    public AREffectAsyncAsset(String str, String str2, List list, String str3, ARRequestAsset.CompressionMethod compressionMethod, boolean z) {
        if (str != null) {
            this.mId = str;
            if (str2 != null) {
                this.mCacheKey = str2;
                this.mStringIdentifiers = list;
                this.mUri = str3;
                this.mCompressionMethod = compressionMethod;
                this.mIsLoggingDisabled = z;
                return;
            }
            throw AbstractC166987dD.A15(String.valueOf("async asset cache key cannot be null"));
        }
        throw AbstractC166987dD.A15(String.valueOf("async asset id cannot be null"));
    }
}
