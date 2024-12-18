package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.base.activity.parcel.OpaqueParcelable;

/* renamed from: X.0B1, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0B1 {
    public static final Object A01(Parcelable.Creator creator, Parcelable parcelable, Class cls) {
        OpaqueParcelable opaqueParcelable;
        C14360o3.A0B(creator, 2);
        if (parcelable == null) {
            return null;
        }
        if (cls.isInstance(parcelable)) {
            return cls.cast(parcelable);
        }
        try {
            if (parcelable instanceof OpaqueParcelable) {
                opaqueParcelable = (OpaqueParcelable) parcelable;
            } else {
                opaqueParcelable = null;
            }
            if (opaqueParcelable == null) {
                return null;
            }
            Parcel obtain = Parcel.obtain();
            C14360o3.A07(obtain);
            try {
                byte[] bArr = opaqueParcelable.A00;
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                return creator.createFromParcel(obtain);
            } finally {
                obtain.recycle();
            }
        } catch (Exception e) {
            C0K8.A0G("ActivityParcelableHacks", "Failed to restore, ignoring", e);
            return null;
        }
    }

    public static final OpaqueParcelable A00(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        return new OpaqueParcelable(parcelable);
    }
}
