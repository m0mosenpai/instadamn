package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.appcompat.widget.SearchView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.stateful.ExtendableSavedState;

/* renamed from: X.Sl7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63467Sl7 implements Parcelable.ClassLoaderCreator, Parcelable.Creator {
    public final int A00;

    public C63467Sl7(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.customview.view.AbsSavedState, java.lang.Object, androidx.appcompat.widget.SearchView$SavedState] */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.A00) {
            case 0:
                ?? absSavedState = new AbsSavedState(parcel, classLoader);
                absSavedState.A00 = AbstractC166987dD.A1a(parcel.readValue(null));
                return absSavedState;
            case 1:
                SparseArray sparseArray = new SparseArray();
                int readInt = parcel.readInt();
                int[] iArr = new int[readInt];
                parcel.readIntArray(iArr);
                Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
                for (int i = 0; i < readInt; i++) {
                    sparseArray.put(iArr[i], readParcelableArray[i]);
                }
                return sparseArray;
            default:
                return new ExtendableSavedState(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new SearchView.SavedState[i];
            case 1:
                return new ParcelableSparseArray[i];
            default:
                return new ExtendableSavedState[i];
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.customview.view.AbsSavedState, java.lang.Object, androidx.appcompat.widget.SearchView$SavedState] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                ?? absSavedState = new AbsSavedState(parcel, null);
                absSavedState.A00 = AbstractC166987dD.A1a(parcel.readValue(null));
                return absSavedState;
            case 1:
                SparseArray sparseArray = new SparseArray();
                int readInt = parcel.readInt();
                int[] iArr = new int[readInt];
                parcel.readIntArray(iArr);
                Parcelable[] readParcelableArray = parcel.readParcelableArray(null);
                for (int i = 0; i < readInt; i++) {
                    sparseArray.put(iArr[i], readParcelableArray[i]);
                }
                return sparseArray;
            default:
                return new ExtendableSavedState(parcel, null);
        }
    }
}
