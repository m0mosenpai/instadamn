package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;

/* renamed from: X.Rr0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61636Rr0 {
    public static final Bundle A00(C09530e4... c09530e4Arr) {
        Bundle bundle = new Bundle(c09530e4Arr.length);
        for (C09530e4 c09530e4 : c09530e4Arr) {
            String str = (String) c09530e4.A00;
            Object obj = c09530e4.A01;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, AbstractC166987dD.A1a(obj));
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, MSW.A00(obj));
            } else if (obj instanceof Float) {
                bundle.putFloat(str, AbstractC166987dD.A09(obj));
            } else if (obj instanceof Integer) {
                bundle.putInt(str, AbstractC166987dD.A0H(obj));
            } else if (obj instanceof Long) {
                bundle.putLong(str, AbstractC166987dD.A0N(obj));
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                C14360o3.A0A(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw AbstractC166987dD.A12(AnonymousClass001.A0v("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, '\"'));
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else {
                if (!(obj instanceof Serializable)) {
                    if (obj instanceof IBinder) {
                        bundle.putBinder(str, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        bundle.putSize(str, (Size) obj);
                    } else if (obj instanceof SizeF) {
                        bundle.putSizeF(str, (SizeF) obj);
                    } else {
                        throw AbstractC166987dD.A12(AnonymousClass001.A0v(MSV.A00(795), AbstractC58319PtB.A0u(obj), " for key \"", str, '\"'));
                    }
                }
                bundle.putSerializable(str, (Serializable) obj);
            }
        }
        return bundle;
    }
}
