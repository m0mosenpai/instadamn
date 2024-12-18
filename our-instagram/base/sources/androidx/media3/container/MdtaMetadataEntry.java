package androidx.media3.container;

import X.AbstractC38301qK;
import X.AbstractC43591JPw;
import X.AbstractC50482Ts;
import X.AbstractC50523MSb;
import X.AbstractC58318PtA;
import X.AbstractC58321PtD;
import X.AnonymousClass001;
import X.Py5;
import X.Y15;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = Py5.A00(20);
    public final int A00;
    public final int A01;
    public final String A02;
    public final byte[] A03;

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void E4j(Y15 y15) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
            if (!this.A02.equals(mdtaMetadataEntry.A02) || !Arrays.equals(this.A03, mdtaMetadataEntry.A03) || this.A00 != mdtaMetadataEntry.A00 || this.A01 != mdtaMetadataEntry.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC58321PtD.A0E(this.A03, AbstractC50523MSb.A02(this.A02)) * 31) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        String A0m;
        int i = this.A01;
        if (i != 1) {
            if (i != 23) {
                byte[] bArr = this.A03;
                if (i != 67) {
                    A0m = Util.A0B(bArr);
                } else {
                    A0m = String.valueOf(AbstractC38301qK.A03(bArr));
                }
            } else {
                A0m = String.valueOf(Float.intBitsToFloat(AbstractC38301qK.A03(this.A03)));
            }
        } else {
            A0m = AbstractC58318PtA.A0m(AbstractC50482Ts.A05, this.A03);
        }
        return AnonymousClass001.A0u("mdta: key=", this.A02, AbstractC43591JPw.A00(15), A0m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeByteArray(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public MdtaMetadataEntry(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.createByteArray();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public MdtaMetadataEntry(byte[] bArr, int i, int i2, String str) {
        this.A02 = str;
        this.A03 = bArr;
        this.A00 = i;
        this.A01 = i2;
    }
}
