package androidx.fragment.app;

import X.AbstractC016706m;
import X.C06l;
import X.C14240no;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.BackStackRecordState;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.05Y
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    };
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final CharSequence A04;
    public final CharSequence A05;
    public final String A06;
    public final ArrayList A07;
    public final ArrayList A08;
    public final ArrayList A09;
    public final boolean A0A;
    public final int[] A0B;
    public final int[] A0C;
    public final int[] A0D;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.A0D);
        parcel.writeStringList(this.A07);
        parcel.writeIntArray(this.A0C);
        parcel.writeIntArray(this.A0B);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        TextUtils.writeToParcel(this.A05, parcel, 0);
        parcel.writeInt(this.A00);
        TextUtils.writeToParcel(this.A04, parcel, 0);
        parcel.writeStringList(this.A08);
        parcel.writeStringList(this.A09);
        parcel.writeInt(this.A0A ? 1 : 0);
    }

    public BackStackRecordState(C14240no c14240no) {
        String str;
        ArrayList arrayList = c14240no.A0B;
        int size = arrayList.size();
        int[] iArr = new int[size * 6];
        this.A0D = iArr;
        if (c14240no.A0E) {
            ArrayList arrayList2 = new ArrayList(size);
            this.A07 = arrayList2;
            int[] iArr2 = new int[size];
            this.A0C = iArr2;
            int[] iArr3 = new int[size];
            this.A0B = iArr3;
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C06l c06l = (C06l) arrayList.get(i2);
                int i3 = i + 1;
                iArr[i] = c06l.A00;
                Fragment fragment = c06l.A05;
                if (fragment != null) {
                    str = fragment.mWho;
                } else {
                    str = null;
                }
                arrayList2.add(str);
                int i4 = i3 + 1;
                iArr[i3] = c06l.A08 ? 1 : 0;
                int i5 = i4 + 1;
                iArr[i4] = c06l.A01;
                int i6 = i5 + 1;
                iArr[i5] = c06l.A02;
                int i7 = i6 + 1;
                iArr[i6] = c06l.A03;
                i = i7 + 1;
                iArr[i7] = c06l.A04;
                iArr2[i2] = c06l.A07.ordinal();
                iArr3[i2] = c06l.A06.ordinal();
            }
            this.A03 = c14240no.A06;
            this.A06 = c14240no.A09;
            this.A02 = c14240no.A00;
            this.A01 = ((AbstractC016706m) c14240no).A01;
            this.A05 = c14240no.A08;
            this.A00 = ((AbstractC016706m) c14240no).A00;
            this.A04 = c14240no.A07;
            this.A08 = c14240no.A0C;
            this.A09 = c14240no.A0D;
            this.A0A = c14240no.A0G;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public BackStackRecordState(Parcel parcel) {
        this.A0D = parcel.createIntArray();
        this.A07 = parcel.createStringArrayList();
        this.A0C = parcel.createIntArray();
        this.A0B = parcel.createIntArray();
        this.A03 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.A05 = (CharSequence) creator.createFromParcel(parcel);
        this.A00 = parcel.readInt();
        this.A04 = (CharSequence) creator.createFromParcel(parcel);
        this.A08 = parcel.createStringArrayList();
        this.A09 = parcel.createStringArrayList();
        this.A0A = parcel.readInt() != 0;
    }
}
