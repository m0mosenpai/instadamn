package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2Kx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48552Kx {
    public Map A00 = new HashMap();

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.2Kv] */
    public final C48532Kv A00() {
        Map map = this.A00;
        ?? obj = new Object();
        obj.A00 = new HashMap(map);
        C48532Kv.A01(obj);
        return obj;
    }

    public final void A01(Object key, String value) {
        if (key == null) {
            this.A00.put(value, null);
            return;
        }
        Class<?> cls = key.getClass();
        if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
            if (cls == boolean[].class) {
                Map map = this.A00;
                boolean[] zArr = (boolean[]) key;
                C48532Kv c48532Kv = C48532Kv.A01;
                int length = zArr.length;
                Boolean[] boolArr = new Boolean[length];
                for (int i = 0; i < length; i++) {
                    boolArr[i] = Boolean.valueOf(zArr[i]);
                }
                map.put(value, boolArr);
                return;
            }
            if (cls == byte[].class) {
                Map map2 = this.A00;
                byte[] bArr = (byte[]) key;
                C48532Kv c48532Kv2 = C48532Kv.A01;
                int length2 = bArr.length;
                Byte[] bArr2 = new Byte[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    bArr2[i2] = Byte.valueOf(bArr[i2]);
                }
                map2.put(value, bArr2);
                return;
            }
            if (cls == int[].class) {
                Map map3 = this.A00;
                int[] iArr = (int[]) key;
                C48532Kv c48532Kv3 = C48532Kv.A01;
                int length3 = iArr.length;
                Integer[] numArr = new Integer[length3];
                for (int i3 = 0; i3 < length3; i3++) {
                    numArr[i3] = Integer.valueOf(iArr[i3]);
                }
                map3.put(value, numArr);
                return;
            }
            if (cls == long[].class) {
                Map map4 = this.A00;
                long[] jArr = (long[]) key;
                C48532Kv c48532Kv4 = C48532Kv.A01;
                int length4 = jArr.length;
                Long[] lArr = new Long[length4];
                for (int i4 = 0; i4 < length4; i4++) {
                    lArr[i4] = Long.valueOf(jArr[i4]);
                }
                map4.put(value, lArr);
                return;
            }
            if (cls == float[].class) {
                Map map5 = this.A00;
                float[] fArr = (float[]) key;
                C48532Kv c48532Kv5 = C48532Kv.A01;
                int length5 = fArr.length;
                Float[] fArr2 = new Float[length5];
                for (int i5 = 0; i5 < length5; i5++) {
                    fArr2[i5] = Float.valueOf(fArr[i5]);
                }
                map5.put(value, fArr2);
                return;
            }
            if (cls == double[].class) {
                Map map6 = this.A00;
                double[] dArr = (double[]) key;
                C48532Kv c48532Kv6 = C48532Kv.A01;
                int length6 = dArr.length;
                Double[] dArr2 = new Double[length6];
                for (int i6 = 0; i6 < length6; i6++) {
                    dArr2[i6] = Double.valueOf(dArr[i6]);
                }
                map6.put(value, dArr2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Key ");
            sb.append(value);
            sb.append(" has invalid type ");
            sb.append(cls);
            throw new IllegalArgumentException(sb.toString());
        }
        this.A00.put(value, key);
    }

    public final void A02(Map values) {
        for (Map.Entry entry : values.entrySet()) {
            A01(entry.getValue(), (String) entry.getKey());
        }
    }
}
