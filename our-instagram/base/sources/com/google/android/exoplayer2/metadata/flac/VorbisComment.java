package com.google.android.exoplayer2.metadata.flac;

import X.AbstractC25226BEj;
import X.AbstractC50523MSb;
import X.AnonymousClass001;
import X.C4B6;
import X.C4W7;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.android.exoplayer2.metadata.Metadata;

@Deprecated
/* loaded from: classes10.dex */
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(56);
    public final String A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (!this.A00.equals(vorbisComment.A00) || !this.A01.equals(vorbisComment.A01)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] CHv() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ C4B6 CHw() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void E4k(C4W7 c4w7) {
        String str = this.A00;
        switch (str.hashCode()) {
            case 62359119:
                if (!str.equals("ALBUM")) {
                    return;
                }
                c4w7.A05 = this.A01;
                return;
            case 79833656:
                if (!str.equals("TITLE")) {
                    return;
                }
                c4w7.A0F = this.A01;
                return;
            case 428414940:
                if (!str.equals("DESCRIPTION")) {
                    return;
                }
                c4w7.A0A = this.A01;
                return;
            case 1746739798:
                if (!str.equals("ALBUMARTIST")) {
                    return;
                }
                c4w7.A04 = this.A01;
                return;
            case 1939198791:
                if (!str.equals("ARTIST")) {
                    return;
                }
                c4w7.A06 = this.A01;
                return;
            default:
                return;
        }
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC50523MSb.A02(this.A00));
    }

    public final String toString() {
        return AnonymousClass001.A0u("VC: ", this.A00, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, this.A01);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public VorbisComment(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
