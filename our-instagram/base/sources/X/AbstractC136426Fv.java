package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeParcelable;

/* renamed from: X.6Fv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC136426Fv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C14360o3.A0B(parcel, 0);
        TreeJNI A00 = TreeParcelable.A00(parcel);
        if (A00 != null) {
            return A00;
        }
        throw new RuntimeException("Unable to read parcel");
    }
}
