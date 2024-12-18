package androidx.media3.extractor.metadata.id3;

import X.AbstractC31177DnL;
import X.AbstractC58321PtD;
import X.AnonymousClass001;
import X.JQ0;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.Util;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = Py5.A00(33);
    public final int A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ApicFrame apicFrame = (ApicFrame) obj;
            if (this.A00 != apicFrame.A00 || !Util.A0F(this.A02, apicFrame.A02) || !Util.A0F(this.A01, apicFrame.A01) || !Arrays.equals(this.A03, apicFrame.A03)) {
                return false;
            }
        }
        return true;
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = parcel.createByteArray();
    }

    public final int hashCode() {
        return AbstractC58321PtD.A0E(this.A03, (((JQ0.A01(this.A00) + AbstractC31177DnL.A04(this.A02)) * 31) + AbstractC58321PtD.A0D(this.A01)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return AnonymousClass001.A11(super.A00, ": mimeType=", this.A02, ", description=", this.A01);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A03);
    }

    public ApicFrame(String str, String str2, byte[] bArr, int i) {
        super("APIC");
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = bArr;
    }
}
