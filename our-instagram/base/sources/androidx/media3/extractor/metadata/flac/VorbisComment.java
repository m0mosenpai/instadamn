package androidx.media3.extractor.metadata.flac;

import X.AbstractC25226BEj;
import X.AbstractC50523MSb;
import X.AnonymousClass001;
import X.C4B2;
import X.Py5;
import X.Y15;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

@Deprecated
/* loaded from: classes10.dex */
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = Py5.A00(30);
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

    @Override // androidx.media3.common.Metadata.Entry
    public final void E4j(Y15 y15) {
        String str = this.A00;
        switch (str.hashCode()) {
            case 62359119:
                if (!str.equals("ALBUM")) {
                    return;
                }
                y15.A05 = this.A01;
                return;
            case 79833656:
                if (!str.equals("TITLE")) {
                    return;
                }
                y15.A0F = this.A01;
                return;
            case 428414940:
                if (!str.equals("DESCRIPTION")) {
                    return;
                }
                y15.A0A = this.A01;
                return;
            case 1746739798:
                if (!str.equals("ALBUMARTIST")) {
                    return;
                }
                y15.A04 = this.A01;
                return;
            case 1939198791:
                if (!str.equals("ARTIST")) {
                    return;
                }
                y15.A06 = this.A01;
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

    public VorbisComment(String str, String str2) {
        this.A00 = C4B2.A01(str);
        this.A01 = str2;
    }

    public VorbisComment(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
