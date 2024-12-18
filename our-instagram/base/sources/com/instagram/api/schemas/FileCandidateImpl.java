package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.AbstractC39927HnI;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class FileCandidateImpl extends C0T6 implements Parcelable, FileCandidate {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(84);
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    @Override // com.instagram.api.schemas.FileCandidate
    public final FileCandidateImpl Ete() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FileCandidateImpl) {
                FileCandidateImpl fileCandidateImpl = (FileCandidateImpl) obj;
                if (!C14360o3.A0K(this.A01, fileCandidateImpl.A01) || !C14360o3.A0K(this.A02, fileCandidateImpl.A02) || !C14360o3.A0K(this.A03, fileCandidateImpl.A03) || !C14360o3.A0K(this.A04, fileCandidateImpl.A04) || !C14360o3.A0K(this.A00, fileCandidateImpl.A00) || !C14360o3.A0K(this.A05, fileCandidateImpl.A05) || !C14360o3.A0K(this.A06, fileCandidateImpl.A06)) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        AbstractC167027dH.A0n(parcel, this.A00);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
    }

    @Override // com.instagram.api.schemas.FileCandidate
    public final String B4U() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.FileCandidate
    public final String B6C() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.FileCandidate
    public final String B6G() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.FileCandidate
    public final String Bdq() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.FileCandidate
    public final Long Bdr() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.FileCandidate
    public final String Bds() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.FileCandidate
    public final String C93() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.FileCandidate
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTFileCandidate", AbstractC39927HnI.A00(this));
    }

    public final int hashCode() {
        return (((((((((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A06);
    }

    public FileCandidateImpl(Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = l;
        this.A05 = str5;
        this.A06 = str6;
    }
}
