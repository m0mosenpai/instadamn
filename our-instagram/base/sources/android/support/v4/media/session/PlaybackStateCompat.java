package android.support.v4.media.session;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC43591JPw;
import X.AbstractC58318PtA;
import X.AbstractC61268Rke;
import X.MSY;
import X.Py5;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes10.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(8);
    public List A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final Bundle A09;
    public final CharSequence A0A;

    /* loaded from: classes10.dex */
    public final class CustomAction implements Parcelable {
        public static final Parcelable.Creator CREATOR = Py5.A00(9);
        public final int A00;
        public final Bundle A01;
        public final CharSequence A02;
        public final String A03;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A03);
            TextUtils.writeToParcel(this.A02, parcel, i);
            parcel.writeInt(this.A00);
            parcel.writeBundle(this.A01);
        }

        public CustomAction(Parcel parcel) {
            this.A03 = parcel.readString();
            this.A02 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.A00 = parcel.readInt();
            this.A01 = MSY.A08(parcel, AbstractC61268Rke.class);
        }

        public final String toString() {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Action:mName='");
            A1C.append((Object) this.A02);
            A1C.append(", mIcon=");
            A1C.append(this.A00);
            A1C.append(", mExtras=");
            return AbstractC166997dE.A0v(this.A01, A1C);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("PlaybackState {");
        A0s.append("state=");
        A0s.append(this.A03);
        A0s.append(AbstractC43591JPw.A00(58));
        A0s.append(this.A07);
        A0s.append(", buffered position=");
        A0s.append(this.A06);
        A0s.append(", speed=");
        A0s.append(this.A01);
        A0s.append(", updated=");
        A0s.append(this.A08);
        A0s.append(AbstractC43591JPw.A00(23));
        A0s.append(this.A04);
        A0s.append(", error code=");
        A0s.append(this.A02);
        A0s.append(", error message=");
        A0s.append(this.A0A);
        A0s.append(", custom actions=");
        A0s.append(this.A00);
        A0s.append(", active item id=");
        A0s.append(this.A05);
        return AbstractC166997dE.A0x("}", A0s);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeLong(this.A07);
        parcel.writeFloat(this.A01);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A06);
        parcel.writeLong(this.A04);
        TextUtils.writeToParcel(this.A0A, parcel, i);
        parcel.writeTypedList(this.A00);
        parcel.writeLong(this.A05);
        parcel.writeBundle(this.A09);
        parcel.writeInt(this.A02);
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A07 = parcel.readLong();
        this.A01 = parcel.readFloat();
        this.A08 = parcel.readLong();
        this.A06 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A0A = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A00 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.A05 = parcel.readLong();
        this.A09 = MSY.A08(parcel, AbstractC61268Rke.class);
        this.A02 = parcel.readInt();
    }
}
