package X;

import java.util.Arrays;

/* loaded from: classes10.dex */
public abstract class PxW {
    public static final SK0 A00;
    public static final SK0 A01;
    public static final Class A02;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.SK0] */
    static {
        Class<?> cls;
        SK0 sk0;
        Class<?> cls2;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        A02 = cls;
        try {
            cls2 = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            sk0 = (SK0) AbstractC58320PtC.A0s(cls2);
            A00 = sk0;
            A01 = new Object();
        }
        sk0 = null;
        A00 = sk0;
        A01 = new Object();
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [X.PxV, java.lang.Object] */
    public static void A00(Object obj, Object obj2) {
        AbstractC58533Px1 abstractC58533Px1 = (AbstractC58533Px1) obj;
        C58555PxV c58555PxV = abstractC58533Px1.unknownFields;
        C58555PxV c58555PxV2 = ((AbstractC58533Px1) obj2).unknownFields;
        C58555PxV c58555PxV3 = C58555PxV.A05;
        C58555PxV c58555PxV4 = c58555PxV;
        if (!c58555PxV3.equals(c58555PxV2)) {
            if (c58555PxV3.equals(c58555PxV)) {
                int i = c58555PxV.A00 + c58555PxV2.A00;
                int[] copyOf = Arrays.copyOf(c58555PxV.A03, i);
                System.arraycopy(c58555PxV2.A03, 0, copyOf, c58555PxV.A00, c58555PxV2.A00);
                Object[] copyOf2 = Arrays.copyOf(c58555PxV.A04, i);
                System.arraycopy(c58555PxV2.A04, 0, copyOf2, c58555PxV.A00, c58555PxV2.A00);
                ?? obj3 = new Object();
                obj3.A01 = -1;
                obj3.A00 = i;
                obj3.A03 = copyOf;
                obj3.A04 = copyOf2;
                obj3.A02 = true;
                c58555PxV4 = obj3;
            } else {
                c58555PxV4 = c58555PxV;
                if (!c58555PxV2.equals(c58555PxV3)) {
                    if (c58555PxV.A02) {
                        int i2 = c58555PxV.A00 + c58555PxV2.A00;
                        C58555PxV.A00(c58555PxV, i2);
                        System.arraycopy(c58555PxV2.A03, 0, c58555PxV.A03, c58555PxV.A00, c58555PxV2.A00);
                        System.arraycopy(c58555PxV2.A04, 0, c58555PxV.A04, c58555PxV.A00, c58555PxV2.A00);
                        c58555PxV.A00 = i2;
                        c58555PxV4 = c58555PxV;
                    } else {
                        throw AbstractC43592JPx.A11();
                    }
                }
            }
        }
        abstractC58533Px1.unknownFields = c58555PxV4;
    }
}
