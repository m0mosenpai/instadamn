package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentState;

/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.06b
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FragmentState[i];
        }
    };
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.A04);
        sb.append(" (");
        sb.append(this.A07);
        sb.append(")}:");
        if (this.A09) {
            sb.append(" fromLayout");
        }
        if (this.A0B) {
            sb.append(" dynamicContainer");
        }
        int i = this.A00;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.A05;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.A0D) {
            sb.append(" retainInstance");
        }
        if (this.A0C) {
            sb.append(" removing");
        }
        if (this.A08) {
            sb.append(" detached");
        }
        if (this.A0A) {
            sb.append(" hidden");
        }
        String str2 = this.A06;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.A03);
        }
        if (this.A0E) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A0E ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A07 = parcel.readString();
        this.A09 = parcel.readInt() != 0;
        this.A0B = parcel.readInt() != 0;
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A05 = parcel.readString();
        this.A0D = parcel.readInt() != 0;
        this.A0C = parcel.readInt() != 0;
        this.A08 = parcel.readInt() != 0;
        this.A0A = parcel.readInt() != 0;
        this.A02 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A03 = parcel.readInt();
        this.A0E = parcel.readInt() != 0;
    }

    public FragmentState(Fragment fragment) {
        this.A04 = fragment.getClass().getName();
        this.A07 = fragment.mWho;
        this.A09 = fragment.mFromLayout;
        this.A0B = fragment.mInDynamicContainer;
        this.A01 = fragment.mFragmentId;
        this.A00 = fragment.mContainerId;
        this.A05 = fragment.mTag;
        this.A0D = fragment.mRetainInstance;
        this.A0C = fragment.mRemoving;
        this.A08 = fragment.mDetached;
        this.A0A = fragment.mHidden;
        this.A02 = fragment.mMaxState.ordinal();
        this.A06 = fragment.mTargetWho;
        this.A03 = fragment.mTargetRequestCode;
        this.A0E = fragment.mUserVisibleHint;
    }
}
