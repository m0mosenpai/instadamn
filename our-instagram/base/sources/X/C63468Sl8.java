package X;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.resources.stringoverride.bloks.BloksStringOverrideFactory;
import java.util.HashMap;

/* renamed from: X.Sl8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63468Sl8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        HashMap A11 = AbstractC31174DnI.A11(parcel, 0);
        int i = Build.VERSION.SDK_INT;
        ClassLoader classLoader = HashMap.class.getClassLoader();
        if (i >= 33) {
            parcel.readMap(A11, classLoader, String.class, String.class);
        } else {
            parcel.readMap(A11, classLoader);
        }
        return new BloksStringOverrideFactory(A11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BloksStringOverrideFactory[i];
    }
}
