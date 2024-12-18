package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.dextricks.Constants;
import java.util.List;

/* renamed from: X.5rw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC128825rw {
    public static void A05(Parcel parcel, int i) {
        A07(parcel, 1, i);
    }

    public static void A0B(Parcel parcel, String str) {
        A0C(parcel, str, 2, false);
    }

    public static void A0E(Parcel parcel, List list, int i, boolean z) {
        if (list == null) {
            if (z) {
                parcel.writeInt(i);
                return;
            }
            return;
        }
        int A01 = A01(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        A06(parcel, A01);
    }

    public static void A0G(Parcel parcel, Parcelable[] parcelableArr, int i, int i2) {
        if (parcelableArr != null) {
            int A01 = A01(parcel, i);
            parcel.writeInt(parcelableArr.length);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, i2);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            A06(parcel, A01);
        }
    }

    public static void A0I(Parcel parcel, byte[][] bArr, int i) {
        if (bArr != null) {
            int A01 = A01(parcel, i);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            A06(parcel, A01);
        }
    }

    public static int A00(Parcel parcel) {
        return A01(parcel, 20293);
    }

    public static int A01(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void A02(Bundle bundle, Parcel parcel, int i) {
        if (bundle != null) {
            int A01 = A01(parcel, i);
            parcel.writeBundle(bundle);
            A06(parcel, A01);
        }
    }

    public static void A03(IBinder iBinder, Parcel parcel, int i) {
        if (iBinder != null) {
            int A01 = A01(parcel, i);
            parcel.writeStrongBinder(iBinder);
            A06(parcel, A01);
        }
    }

    public static void A04(Parcel parcel, float f, int i) {
        parcel.writeInt(i | Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        parcel.writeFloat(f);
    }

    public static void A07(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        parcel.writeInt(i2);
    }

    public static void A08(Parcel parcel, int i, long j) {
        parcel.writeInt(i | Constants.LOAD_RESULT_WITH_VDEX_ODEX);
        parcel.writeLong(j);
    }

    public static void A09(Parcel parcel, int i, boolean z) {
        parcel.writeInt(i | Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void A0A(Parcel parcel, Parcelable parcelable, int i, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                parcel.writeInt(i);
            }
        } else {
            int A01 = A01(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            A06(parcel, A01);
        }
    }

    public static void A0C(Parcel parcel, String str, int i, boolean z) {
        if (str == null) {
            if (z) {
                parcel.writeInt(i);
            }
        } else {
            int A01 = A01(parcel, i);
            parcel.writeString(str);
            A06(parcel, A01);
        }
    }

    public static void A0D(Parcel parcel, List list, int i) {
        if (list != null) {
            int A01 = A01(parcel, i);
            parcel.writeStringList(list);
            A06(parcel, A01);
        }
    }

    public static void A0F(Parcel parcel, byte[] bArr, int i, boolean z) {
        if (bArr == null) {
            if (z) {
                parcel.writeInt(i);
            }
        } else {
            int A01 = A01(parcel, i);
            parcel.writeByteArray(bArr);
            A06(parcel, A01);
        }
    }

    public static void A0H(Parcel parcel, String[] strArr, int i) {
        if (strArr != null) {
            int A01 = A01(parcel, i);
            parcel.writeStringArray(strArr);
            A06(parcel, A01);
        }
    }

    public static void A06(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }
}
