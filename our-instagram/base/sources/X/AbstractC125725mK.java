package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.5mK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC125725mK {
    public static void A0D(Parcel parcel, int i) {
        A0F(parcel, i, 4);
    }

    public static boolean A0G(Parcel parcel, int i) {
        A0F(parcel, i, 4);
        if (parcel.readInt() == 0) {
            return false;
        }
        return true;
    }

    public static int A01(Parcel parcel, int i) {
        if ((i & (-65536)) != -65536) {
            return (char) (i >> 16);
        }
        return parcel.readInt();
    }

    public static void A0E(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new C64853TXd(parcel, sb.toString());
    }

    public static int A00(Parcel parcel) {
        int readInt = parcel.readInt();
        int A01 = A01(parcel, readInt);
        char c = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c == 20293) {
            int i = A01 + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            throw new C64853TXd(parcel, AnonymousClass001.A02(dataPosition, i, "Size read is invalid start=", " end="));
        }
        throw new C64853TXd(parcel, "Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))));
    }

    public static Bundle A02(Parcel parcel, int i) {
        int A01 = A01(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A01 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + A01);
        return readBundle;
    }

    public static IBinder A03(Parcel parcel, int i) {
        int A01 = A01(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A01 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + A01);
        return readStrongBinder;
    }

    public static Parcelable A04(Parcel parcel, Parcelable.Creator creator, int i) {
        int A01 = A01(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A01 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + A01);
        return parcelable;
    }

    public static Double A05(Parcel parcel, int i) {
        int A01 = A01(parcel, i);
        if (A01 == 0) {
            return null;
        }
        A0E(parcel, A01, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static Integer A06(Parcel parcel, int i) {
        int A01 = A01(parcel, i);
        if (A01 == 0) {
            return null;
        }
        A0E(parcel, A01, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static Long A07(Parcel parcel, int i) {
        int A01 = A01(parcel, i);
        if (A01 == 0) {
            return null;
        }
        A0E(parcel, A01, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static String A08(Parcel parcel, int i) {
        int A01 = A01(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A01 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + A01);
        return readString;
    }

    public static ArrayList A09(Parcel parcel, int i) {
        int A01 = A01(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A01 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + A01);
        return createStringArrayList;
    }

    public static ArrayList A0A(Parcel parcel, Parcelable.Creator creator, int i) {
        int A01 = A01(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A01 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + A01);
        return createTypedArrayList;
    }

    public static void A0B(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
        } else {
            throw new C64853TXd(parcel, AnonymousClass001.A0O(AbstractC58317Pt9.A00(603), i));
        }
    }

    public static void A0C(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + A01(parcel, i));
    }

    public static void A0F(Parcel parcel, int i, int i2) {
        int A01 = A01(parcel, i);
        if (A01 == i2) {
            return;
        }
        String hexString = Integer.toHexString(A01);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(A01);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new C64853TXd(parcel, sb.toString());
    }

    public static byte[] A0H(Parcel parcel, int i) {
        int A01 = A01(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A01 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + A01);
        return createByteArray;
    }

    public static int[] A0I(Parcel parcel, int i) {
        int A01 = A01(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A01 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + A01);
        return createIntArray;
    }

    public static Object[] A0J(Parcel parcel, Parcelable.Creator creator, int i) {
        int A01 = A01(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A01 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + A01);
        return createTypedArray;
    }

    public static String[] A0K(Parcel parcel, int i) {
        int A01 = A01(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A01 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + A01);
        return createStringArray;
    }

    public static byte[][] A0L(Parcel parcel, int i) {
        int A01 = A01(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A01 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + A01);
        return bArr;
    }
}
