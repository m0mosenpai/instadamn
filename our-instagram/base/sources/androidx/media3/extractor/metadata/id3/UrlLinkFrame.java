package androidx.media3.extractor.metadata.id3;

import X.AbstractC31177DnL;
import X.AbstractC50523MSb;
import X.AbstractC58321PtD;
import X.AnonymousClass001;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.Util;

/* loaded from: classes10.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = Py5.A00(43);
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
            if (!super.A00.equals(((Id3Frame) urlLinkFrame).A00) || !Util.A0F(this.A00, urlLinkFrame.A00) || !Util.A0F(this.A01, urlLinkFrame.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC50523MSb.A02(super.A00) + AbstractC31177DnL.A04(this.A00)) * 31) + AbstractC58321PtD.A0D(this.A01);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return AnonymousClass001.A0g(super.A00, ": url=", this.A01);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public UrlLinkFrame(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.A00 = str2;
        this.A01 = str3;
    }
}
