package androidx.media3.extractor.metadata.emsg;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31177DnL;
import X.C70116W4o;
import X.C70130W5r;
import X.MSV;
import X.Py5;
import X.Y15;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class EventMessage implements Metadata.Entry {
    public static final C70130W5r A06;
    public static final C70130W5r A07;
    public static final Parcelable.Creator CREATOR;
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final byte[] A05;

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
            EventMessage eventMessage = (EventMessage) obj;
            if (this.A01 != eventMessage.A01 || this.A02 != eventMessage.A02 || !Util.A0F(this.A03, eventMessage.A03) || !Util.A0F(this.A04, eventMessage.A04) || !Arrays.equals(this.A05, eventMessage.A05)) {
                return false;
            }
        }
        return true;
    }

    static {
        C70116W4o c70116W4o = new C70116W4o();
        c70116W4o.A00("application/id3");
        A06 = new C70130W5r(c70116W4o);
        C70116W4o c70116W4o2 = new C70116W4o();
        c70116W4o2.A00("application/x-scte35");
        A07 = new C70130W5r(c70116W4o2);
        CREATOR = new Py5(28);
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int i2 = 0;
            int A04 = (527 + AbstractC31177DnL.A04(this.A03)) * 31;
            String str = this.A04;
            if (str != null) {
                i2 = str.hashCode();
            }
            int A072 = AbstractC167007dF.A07(this.A02, AbstractC167007dF.A07(this.A01, (A04 + i2) * 31)) + Arrays.hashCode(this.A05);
            this.A00 = A072;
            return A072;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EMSG: scheme=");
        sb.append(this.A03);
        sb.append(", id=");
        sb.append(this.A02);
        sb.append(MSV.A00(131));
        sb.append(this.A01);
        sb.append(", value=");
        return AbstractC166997dE.A0x(this.A04, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeByteArray(this.A05);
    }

    public EventMessage(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A05 = parcel.createByteArray();
    }
}
