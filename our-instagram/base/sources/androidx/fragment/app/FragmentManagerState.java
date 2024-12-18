package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.BackStackRecordState;
import androidx.fragment.app.BackStackState;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo;
import androidx.fragment.app.FragmentManagerState;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.06U
        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.fragment.app.FragmentManagerState, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.A01 = null;
            obj.A04 = new ArrayList();
            obj.A05 = new ArrayList();
            obj.A02 = parcel.createStringArrayList();
            obj.A03 = parcel.createStringArrayList();
            obj.A07 = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
            obj.A00 = parcel.readInt();
            obj.A01 = parcel.readString();
            obj.A04 = parcel.createStringArrayList();
            obj.A05 = parcel.createTypedArrayList(BackStackState.CREATOR);
            obj.A06 = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    };
    public int A00;
    public ArrayList A02;
    public ArrayList A03;
    public ArrayList A06;
    public BackStackRecordState[] A07;
    public String A01 = null;
    public ArrayList A04 = new ArrayList();
    public ArrayList A05 = new ArrayList();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.A02);
        parcel.writeStringList(this.A03);
        parcel.writeTypedArray(this.A07, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeStringList(this.A04);
        parcel.writeTypedList(this.A05);
        parcel.writeTypedList(this.A06);
    }
}
