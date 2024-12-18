package androidx.media3.common;

import X.AbstractC111324zv;
import X.AbstractC25228BEl;
import X.AbstractC37304Gc5;
import X.AnonymousClass001;
import X.Py5;
import X.Y15;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(18);
    public final long A00;
    public final Entry[] A01;

    /* loaded from: classes12.dex */
    public interface Entry extends Parcelable {
        void E4j(Y15 y15);
    }

    public final Metadata A00(Entry... entryArr) {
        int length = entryArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.A00;
        Entry[] entryArr2 = this.A01;
        int length2 = entryArr2.length;
        Object[] copyOf = Arrays.copyOf(entryArr2, length2 + length);
        System.arraycopy(entryArr, 0, copyOf, length2, length);
        return new Metadata((Entry[]) copyOf, j);
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
            Metadata metadata = (Metadata) obj;
            if (!Arrays.equals(this.A01, metadata.A01) || this.A00 != metadata.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.A01) * 31) + AbstractC25228BEl.A03(this.A00);
    }

    public final String toString() {
        String A0Q;
        String arrays = Arrays.toString(this.A01);
        long j = this.A00;
        if (j == -9223372036854775807L) {
            A0Q = "";
        } else {
            A0Q = AnonymousClass001.A0Q(AbstractC111324zv.A00(3427), j);
        }
        return AnonymousClass001.A0g("entries=", arrays, A0Q);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Entry[] entryArr = this.A01;
        parcel.writeInt(entryArr.length);
        for (Entry entry : entryArr) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Metadata(Parcel parcel) {
        this.A01 = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.A01;
            if (i < entryArr.length) {
                entryArr[i] = AbstractC37304Gc5.A04(parcel, Entry.class);
                i++;
            } else {
                this.A00 = parcel.readLong();
                return;
            }
        }
    }

    public Metadata(Entry[] entryArr, long j) {
        this.A00 = j;
        this.A01 = entryArr;
    }

    public Metadata(Entry... entryArr) {
        this(entryArr, -9223372036854775807L);
    }

    public Metadata(List list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }
}
