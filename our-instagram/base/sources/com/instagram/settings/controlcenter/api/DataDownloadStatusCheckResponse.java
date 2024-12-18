package com.instagram.settings.controlcenter.api;

import X.C37324GcR;
import X.C40781ul;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class DataDownloadStatusCheckResponse extends C40781ul implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(58);
    public JobStatus A00;
    public String A01;
    public String A02;
    public String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* loaded from: classes6.dex */
    public enum JobStatus implements Parcelable {
        HAS_VALID_DOWNLOADABLE,
        JOB_IN_PROGRESS,
        NO_VALID_DOWNLOADABLE;

        public static final Parcelable.Creator CREATOR = new C37324GcR(59);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, 0);
    }
}
