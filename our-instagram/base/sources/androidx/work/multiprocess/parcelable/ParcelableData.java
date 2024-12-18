package androidx.work.multiprocess.parcelable;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31172DnG;
import X.AbstractC31175DnJ;
import X.AbstractC37304Gc5;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.C48532Kv;
import X.MSV;
import X.MSW;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public class ParcelableData implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(69);
    public final C48532Kv A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte byteValue;
        int i2;
        Iterator A0s = AbstractC167017dG.A0s(parcel, Collections.unmodifiableMap(this.A00.A00));
        while (A0s.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A0s);
            String A17 = AbstractC31172DnG.A17(A1K);
            Object value = A1K.getValue();
            if (value == null) {
                byteValue = 0;
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class) {
                    parcel.writeByte((byte) 1);
                    i2 = AbstractC166987dD.A1a(value);
                } else if (cls == Byte.class) {
                    parcel.writeByte((byte) 2);
                    byteValue = ((Number) value).byteValue();
                } else if (cls == Integer.class) {
                    parcel.writeByte((byte) 3);
                    i2 = AbstractC166987dD.A0H(value);
                } else {
                    if (cls == Long.class) {
                        parcel.writeByte((byte) 4);
                        AbstractC58318PtA.A1G(parcel, (Number) value);
                    } else if (cls == Float.class) {
                        parcel.writeByte((byte) 5);
                        parcel.writeFloat(AbstractC166987dD.A09(value));
                    } else if (cls == Double.class) {
                        parcel.writeByte((byte) 6);
                        parcel.writeDouble(MSW.A00(value));
                    } else if (cls == String.class) {
                        parcel.writeByte((byte) 7);
                        parcel.writeString((String) value);
                    } else if (cls == Boolean[].class) {
                        parcel.writeByte((byte) 8);
                        Boolean[] boolArr = (Boolean[]) value;
                        int length = boolArr.length;
                        boolean[] zArr = new boolean[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            zArr[i3] = boolArr[i3].booleanValue();
                        }
                        parcel.writeBooleanArray(zArr);
                    } else if (cls == Byte[].class) {
                        parcel.writeByte((byte) 9);
                        Byte[] bArr = (Byte[]) value;
                        int length2 = bArr.length;
                        byte[] bArr2 = new byte[length2];
                        for (int i4 = 0; i4 < length2; i4++) {
                            bArr2[i4] = bArr[i4].byteValue();
                        }
                        parcel.writeByteArray(bArr2);
                    } else if (cls == Integer[].class) {
                        parcel.writeByte((byte) 10);
                        Integer[] numArr = (Integer[]) value;
                        int length3 = numArr.length;
                        int[] iArr = new int[length3];
                        for (int i5 = 0; i5 < length3; i5++) {
                            iArr[i5] = MSW.A07(numArr, i5);
                        }
                        parcel.writeIntArray(iArr);
                    } else if (cls == Long[].class) {
                        parcel.writeByte((byte) 11);
                        Long[] lArr = (Long[]) value;
                        int length4 = lArr.length;
                        long[] jArr = new long[length4];
                        for (int i6 = 0; i6 < length4; i6++) {
                            jArr[i6] = lArr[i6].longValue();
                        }
                        parcel.writeLongArray(jArr);
                    } else if (cls == Float[].class) {
                        parcel.writeByte((byte) 12);
                        Float[] fArr = (Float[]) value;
                        int length5 = fArr.length;
                        float[] fArr2 = new float[length5];
                        for (int i7 = 0; i7 < length5; i7++) {
                            fArr2[i7] = fArr[i7].floatValue();
                        }
                        parcel.writeFloatArray(fArr2);
                    } else if (cls == Double[].class) {
                        parcel.writeByte(DalvikInternals.IOPRIO_CLASS_SHIFT);
                        Double[] dArr = (Double[]) value;
                        int length6 = dArr.length;
                        double[] dArr2 = new double[length6];
                        for (int i8 = 0; i8 < length6; i8++) {
                            dArr2[i8] = dArr[i8].doubleValue();
                        }
                        parcel.writeDoubleArray(dArr2);
                    } else if (cls == String[].class) {
                        parcel.writeByte((byte) 14);
                        parcel.writeStringArray((String[]) value);
                    } else {
                        throw AbstractC167007dF.A0c("Unsupported value type ", cls.getName());
                    }
                    parcel.writeString(A17);
                }
                parcel.writeInt(i2);
                parcel.writeString(A17);
            }
            parcel.writeByte(byteValue);
            parcel.writeString(A17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.2Kv] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Double] */
    public ParcelableData(Parcel parcel) {
        ?? valueOf;
        HashMap A1G = AbstractC166987dD.A1G();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            byte readByte = parcel.readByte();
            switch (readByte) {
                case 0:
                    valueOf = 0;
                    break;
                case 1:
                    valueOf = Boolean.valueOf(AbstractC58320PtC.A1T(parcel));
                    break;
                case 2:
                    valueOf = Byte.valueOf(parcel.readByte());
                    break;
                case 3:
                    valueOf = AbstractC37304Gc5.A0U(parcel);
                    break;
                case 4:
                    valueOf = AbstractC58322PtE.A0j(parcel);
                    break;
                case 5:
                    valueOf = Float.valueOf(parcel.readFloat());
                    break;
                case 6:
                    valueOf = Double.valueOf(parcel.readDouble());
                    break;
                case 7:
                    valueOf = parcel.readString();
                    break;
                case 8:
                    boolean[] createBooleanArray = parcel.createBooleanArray();
                    C48532Kv c48532Kv = C48532Kv.A01;
                    int length = createBooleanArray.length;
                    valueOf = new Boolean[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        valueOf[i2] = Boolean.valueOf(createBooleanArray[i2]);
                    }
                    break;
                case 9:
                    byte[] createByteArray = parcel.createByteArray();
                    C48532Kv c48532Kv2 = C48532Kv.A01;
                    int length2 = createByteArray.length;
                    valueOf = new Byte[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        valueOf[i3] = Byte.valueOf(createByteArray[i3]);
                    }
                    break;
                case 10:
                    int[] createIntArray = parcel.createIntArray();
                    C48532Kv c48532Kv3 = C48532Kv.A01;
                    int length3 = createIntArray.length;
                    valueOf = new Integer[length3];
                    for (int i4 = 0; i4 < length3; i4++) {
                        valueOf[i4] = Integer.valueOf(createIntArray[i4]);
                    }
                    break;
                case 11:
                    long[] createLongArray = parcel.createLongArray();
                    C48532Kv c48532Kv4 = C48532Kv.A01;
                    int length4 = createLongArray.length;
                    valueOf = new Long[length4];
                    for (int i5 = 0; i5 < length4; i5++) {
                        valueOf[i5] = Long.valueOf(createLongArray[i5]);
                    }
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    float[] createFloatArray = parcel.createFloatArray();
                    C48532Kv c48532Kv5 = C48532Kv.A01;
                    int length5 = createFloatArray.length;
                    valueOf = new Float[length5];
                    for (int i6 = 0; i6 < length5; i6++) {
                        valueOf[i6] = Float.valueOf(createFloatArray[i6]);
                    }
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    double[] createDoubleArray = parcel.createDoubleArray();
                    C48532Kv c48532Kv6 = C48532Kv.A01;
                    int length6 = createDoubleArray.length;
                    valueOf = new Double[length6];
                    for (int i7 = 0; i7 < length6; i7++) {
                        valueOf[i7] = Double.valueOf(createDoubleArray[i7]);
                    }
                    break;
                case 14:
                    valueOf = parcel.createStringArray();
                    break;
                default:
                    throw AbstractC31175DnJ.A0U(MSV.A00(873), readByte);
            }
            A1G.put(parcel.readString(), valueOf);
        }
        ?? obj = new Object();
        obj.A00 = AbstractC58318PtA.A10(A1G);
        this.A00 = obj;
    }

    public ParcelableData(C48532Kv c48532Kv) {
        this.A00 = c48532Kv;
    }
}
