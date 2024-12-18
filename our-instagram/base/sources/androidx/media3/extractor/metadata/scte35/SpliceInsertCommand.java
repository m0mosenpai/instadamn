package androidx.media3.extractor.metadata.scte35;

import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC58323PtF;
import X.AnonymousClass001;
import X.Py5;
import X.SFJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = Py5.A00(49);
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        return AnonymousClass001.A0t("SCTE-35 SpliceInsertCommand { programSplicePts=", ", programSplicePlaybackPositionUs= ", " }", this.A05, this.A04);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        List list = this.A07;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            SFJ sfj = (SFJ) list.get(i2);
            parcel.writeInt(sfj.A00);
            parcel.writeLong(sfj.A02);
            parcel.writeLong(sfj.A01);
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = AbstractC167007dF.A1P(parcel.readByte(), 1);
        this.A09 = AbstractC58323PtF.A1X(parcel);
        this.A0A = AbstractC58323PtF.A1X(parcel);
        this.A0C = AbstractC58323PtF.A1X(parcel);
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList A17 = AbstractC25225BEi.A17(readInt);
        for (int i = 0; i < readInt; i++) {
            A17.add(new SFJ(parcel.readLong(), parcel.readLong(), parcel.readInt()));
        }
        this.A07 = Collections.unmodifiableList(A17);
        this.A08 = parcel.readByte() == 1;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }
}
