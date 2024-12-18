package com.instagram.search.surface.serp.contextualfeed.intf;

import X.AbstractC37304Gc5;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.discovery.api.model.SectionPagination;
import com.instagram.model.keyword.Keyword;

/* loaded from: classes7.dex */
public final class KeywordSerpContextualFeedConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = C37324GcR.A00(57);
    public final SectionPagination A00;
    public final Keyword A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public KeywordSerpContextualFeedConfig(SectionPagination sectionPagination, Keyword keyword, String str, String str2, String str3) {
        this.A04 = str3;
        this.A00 = sectionPagination;
        this.A01 = keyword;
        this.A03 = str2;
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public KeywordSerpContextualFeedConfig(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A00 = (SectionPagination) AbstractC37304Gc5.A04(parcel, SectionPagination.class);
        this.A01 = (Keyword) AbstractC37304Gc5.A04(parcel, Keyword.class);
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
    }
}
