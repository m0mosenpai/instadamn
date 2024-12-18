package X;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.BackStackState;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo;
import androidx.fragment.app.FragmentTabHost$SavedState;
import com.facebook.base.activity.parcel.OpaqueParcelable;

/* renamed from: X.0pJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15030pJ implements Parcelable.Creator {
    public final int A00;

    public C15030pJ(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.View$BaseSavedState, androidx.fragment.app.FragmentTabHost$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.fragment.app.FragmentManager$LaunchedFragmentInfo, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(parcel, 0);
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                C14360o3.A0A(readParcelable);
                return new IntentSenderRequest((Intent) parcel.readParcelable(Intent.class.getClassLoader()), (IntentSender) readParcelable, parcel.readInt(), parcel.readInt());
            case 1:
                return new BackStackState(parcel);
            case 2:
                ?? obj = new Object();
                obj.A01 = parcel.readString();
                obj.A00 = parcel.readInt();
                return obj;
            case 3:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.A00 = parcel.readString();
                return baseSavedState;
            default:
                C14360o3.A0B(parcel, 0);
                return new OpaqueParcelable(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new IntentSenderRequest[i];
            case 1:
                return new BackStackState[i];
            case 2:
                return new FragmentManager$LaunchedFragmentInfo[i];
            case 3:
                return new FragmentTabHost$SavedState[i];
            default:
                return new OpaqueParcelable[i];
        }
    }
}
