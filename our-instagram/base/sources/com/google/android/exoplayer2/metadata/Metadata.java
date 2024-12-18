package com.google.android.exoplayer2.metadata;

import X.AnonymousClass001;
import X.C206149Aw;
import X.C4B6;
import X.C4W7;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206149Aw(28);
    public final long A00;
    public final Entry[] A01;

    /* loaded from: classes3.dex */
    public interface Entry extends Parcelable {
        byte[] CHv();

        C4B6 CHw();

        void E4k(C4W7 c4w7);
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

    public final Metadata A00(Metadata metadata) {
        if (metadata == null) {
            return this;
        }
        Entry[] entryArr = metadata.A01;
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

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.A01) * 31;
        long j = this.A00;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String A0Q;
        String arrays = Arrays.toString(this.A01);
        long j = this.A00;
        if (j == -9223372036854775807L) {
            A0Q = "";
        } else {
            A0Q = AnonymousClass001.A0Q(", presentationTimeUs=", j);
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
                entryArr[i] = parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                this.A00 = parcel.readLong();
                return;
            }
        }
    }

    public Metadata(List list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Entry... entryArr) {
        this(entryArr, -9223372036854775807L);
    }

    public Metadata(Entry[] entryArr, long j) {
        this.A00 = j;
        this.A01 = entryArr;
    }
}
