package androidx.media3.extractor.metadata.flac;

import X.AbstractC166997dE;
import X.AbstractC50482Ts;
import X.AbstractC58321PtD;
import X.AnonymousClass001;
import X.JQ0;
import X.Py5;
import X.WEI;
import X.WFa;
import X.Y15;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = Py5.A00(29);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PictureFrame pictureFrame = (PictureFrame) obj;
            if (this.A03 != pictureFrame.A03 || !this.A06.equals(pictureFrame.A06) || !this.A05.equals(pictureFrame.A05) || this.A04 != pictureFrame.A04 || this.A02 != pictureFrame.A02 || this.A01 != pictureFrame.A01 || this.A00 != pictureFrame.A00 || !Arrays.equals(this.A07, pictureFrame.A07)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void E4j(Y15 y15) {
        y15.A00(this.A07, this.A03);
    }

    public final int hashCode() {
        return AbstractC58321PtD.A0E(this.A07, (((((((AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A06, JQ0.A01(this.A03))) + this.A04) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31);
    }

    public final String toString() {
        return AnonymousClass001.A0u("Picture: mimeType=", this.A06, ", description=", this.A05);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A07);
    }

    public PictureFrame(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A07 = parcel.createByteArray();
    }

    public static PictureFrame A00(WFa wFa) {
        int A01 = wFa.A01();
        String A02 = WEI.A02(wFa.A0I(AbstractC50482Ts.A01, wFa.A01()));
        String A0I = wFa.A0I(AbstractC50482Ts.A05, wFa.A01());
        int A012 = wFa.A01();
        int A013 = wFa.A01();
        int A014 = wFa.A01();
        int A015 = wFa.A01();
        int A016 = wFa.A01();
        byte[] bArr = new byte[A016];
        wFa.A0R(bArr, 0, A016);
        return new PictureFrame(A02, A0I, bArr, A01, A012, A013, A014, A015);
    }

    public PictureFrame(String str, String str2, byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        this.A03 = i;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A07 = bArr;
    }
}
