package X;

import X.AbstractC167007dF;
import X.AbstractC58321PtD;
import X.AbstractC63023Sar;
import X.AbstractC910944l;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C16R;
import X.C910844k;
import X.EnumC912645f;
import X.SX7;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;
import com.fasterxml.jackson.databind.ser.std.ByteArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$TypedPrimitiveArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.HashMap;

/* renamed from: X.STi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62835STi {
    public static final HashMap A00;

    static {
        HashMap A1G = AbstractC166987dD.A1G();
        A00 = A1G;
        A1G.put(boolean[].class.getName(), new ArraySerializerBase() { // from class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$BooleanArraySerializer
            public static final AbstractC910944l A00 = C910844k.A0A.A0C(Boolean.class);

            @Override // com.fasterxml.jackson.databind.JsonSerializer
            public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
                boolean booleanValue;
                boolean[] zArr = (boolean[]) obj;
                int length = zArr.length;
                if (length == 1) {
                    Boolean bool = this.A01;
                    if (bool == null) {
                        booleanValue = AbstractC58321PtD.A1V(abstractC913345m);
                    } else {
                        booleanValue = bool.booleanValue();
                    }
                    if (booleanValue) {
                        anonymousClass182.A0y(zArr[0]);
                        return;
                    }
                }
                anonymousClass182.A0q(zArr, length);
                for (boolean z : zArr) {
                    anonymousClass182.A0y(z);
                }
                anonymousClass182.A0Z();
            }

            @Override // com.fasterxml.jackson.databind.JsonSerializer
            public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
                return AbstractC167007dF.A1N(((boolean[]) obj).length);
            }
        });
        A1G.put(byte[].class.getName(), new ByteArraySerializer());
        A1G.put(char[].class.getName(), new StdSerializer() { // from class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$CharArraySerializer
            @Override // com.fasterxml.jackson.databind.JsonSerializer
            public final /* bridge */ /* synthetic */ void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
                SX7 A002;
                char[] cArr = (char[]) obj;
                if (abstractC913345m.A05.A0C(EnumC912645f.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                    A002 = AbstractC63023Sar.A00(anonymousClass182, C16R.A0C, abstractC63023Sar, cArr);
                    int length = cArr.length;
                    for (int i = 0; i < length; i++) {
                        anonymousClass182.A10(cArr, i, 1);
                    }
                } else {
                    A002 = AbstractC63023Sar.A00(anonymousClass182, C16R.A0J, abstractC63023Sar, cArr);
                    anonymousClass182.A10(cArr, 0, cArr.length);
                }
                abstractC63023Sar.A03(anonymousClass182, A002);
            }

            @Override // com.fasterxml.jackson.databind.JsonSerializer
            public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
                char[] cArr = (char[]) obj;
                if (abstractC913345m.A05.A0C(EnumC912645f.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                    int length = cArr.length;
                    anonymousClass182.A0q(cArr, length);
                    for (int i = 0; i < length; i++) {
                        anonymousClass182.A10(cArr, i, 1);
                    }
                    anonymousClass182.A0Z();
                    return;
                }
                anonymousClass182.A10(cArr, 0, cArr.length);
            }

            @Override // com.fasterxml.jackson.databind.JsonSerializer
            public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
                return AbstractC167007dF.A1N(((char[]) obj).length);
            }
        });
        A1G.put(short[].class.getName(), new StdArraySerializers$TypedPrimitiveArraySerializer() { // from class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ShortArraySerializer
            public static final AbstractC910944l A00 = C910844k.A0A.A0C(Short.TYPE);

            @Override // com.fasterxml.jackson.databind.JsonSerializer
            public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
                boolean booleanValue;
                short[] sArr = (short[]) obj;
                int length = sArr.length;
                if (length == 1) {
                    Boolean bool = this.A01;
                    if (bool == null) {
                        booleanValue = AbstractC58321PtD.A1V(abstractC913345m);
                    } else {
                        booleanValue = bool.booleanValue();
                    }
                    if (booleanValue) {
                        anonymousClass182.A0h(sArr[0]);
                        return;
                    }
                }
                anonymousClass182.A0q(sArr, length);
                for (short s : sArr) {
                    anonymousClass182.A0h(s);
                }
                anonymousClass182.A0Z();
            }

            @Override // com.fasterxml.jackson.databind.JsonSerializer
            public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
                return AbstractC167007dF.A1N(((short[]) obj).length);
            }
        });
        A1G.put(int[].class.getName(), new ArraySerializerBase() { // from class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$IntArraySerializer
            public static final AbstractC910944l A00 = C910844k.A0A.A0C(Integer.TYPE);

            @Override // com.fasterxml.jackson.databind.JsonSerializer
            public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
                boolean booleanValue;
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                if (length == 1) {
                    Boolean bool = this.A01;
                    if (bool == null) {
                        booleanValue = AbstractC58321PtD.A1V(abstractC913345m);
                    } else {
                        booleanValue = bool.booleanValue();
                    }
                    if (booleanValue) {
                        anonymousClass182.A0h(iArr[0]);
                        return;
                    }
                }
                AnonymousClass182.A08(length, length);
                anonymousClass182.A0q(iArr, length);
                for (int i : iArr) {
                    anonymousClass182.A0h(i);
                }
                anonymousClass182.A0Z();
            }

            @Override // com.fasterxml.jackson.databind.JsonSerializer
            public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
                return AbstractC167007dF.A1N(((int[]) obj).length);
            }
        });
        A1G.put(long[].class.getName(), new StdArraySerializers$TypedPrimitiveArraySerializer() { // from class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$LongArraySerializer
            public static final AbstractC910944l A00 = C910844k.A0A.A0C(Long.TYPE);

            @Override // com.fasterxml.jackson.databind.JsonSerializer
            public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
                boolean booleanValue;
                long[] jArr = (long[]) obj;
                int length = jArr.length;
                if (length == 1) {
                    Boolean bool = this.A01;
                    if (bool == null) {
                        booleanValue = AbstractC58321PtD.A1V(abstractC913345m);
                    } else {
                        booleanValue = bool.booleanValue();
                    }
                    if (booleanValue) {
                        anonymousClass182.A0i(jArr[0]);
                        return;
                    }
                }
                AnonymousClass182.A08(length, length);
                anonymousClass182.A0q(jArr, length);
                for (long j : jArr) {
                    anonymousClass182.A0i(j);
                }
                anonymousClass182.A0Z();
            }

            @Override // com.fasterxml.jackson.databind.JsonSerializer
            public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
                return AbstractC167007dF.A1N(((long[]) obj).length);
            }
        });
        A1G.put(float[].class.getName(), new StdArraySerializers$TypedPrimitiveArraySerializer() { // from class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$FloatArraySerializer
            public static final AbstractC910944l A00 = C910844k.A0A.A0C(Float.TYPE);

            @Override // com.fasterxml.jackson.databind.JsonSerializer
            public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
                boolean booleanValue;
                float[] fArr = (float[]) obj;
                int length = fArr.length;
                if (length == 1) {
                    Boolean bool = this.A01;
                    if (bool == null) {
                        booleanValue = AbstractC58321PtD.A1V(abstractC913345m);
                    } else {
                        booleanValue = bool.booleanValue();
                    }
                    if (booleanValue) {
                        anonymousClass182.A0g(fArr[0]);
                        return;
                    }
                }
                anonymousClass182.A0q(fArr, length);
                for (float f : fArr) {
                    anonymousClass182.A0g(f);
                }
                anonymousClass182.A0Z();
            }

            @Override // com.fasterxml.jackson.databind.JsonSerializer
            public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
                return AbstractC167007dF.A1N(((float[]) obj).length);
            }
        });
        A1G.put(double[].class.getName(), new ArraySerializerBase() { // from class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$DoubleArraySerializer
            public static final AbstractC910944l A00 = C910844k.A0A.A0C(Double.TYPE);

            @Override // com.fasterxml.jackson.databind.JsonSerializer
            public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
                boolean booleanValue;
                double[] dArr = (double[]) obj;
                int length = dArr.length;
                if (length == 1) {
                    Boolean bool = this.A01;
                    if (bool == null) {
                        booleanValue = AbstractC58321PtD.A1V(abstractC913345m);
                    } else {
                        booleanValue = bool.booleanValue();
                    }
                    if (booleanValue) {
                        anonymousClass182.A0f(dArr[0]);
                        return;
                    }
                }
                AnonymousClass182.A08(length, length);
                anonymousClass182.A0q(dArr, length);
                for (double d : dArr) {
                    anonymousClass182.A0f(d);
                }
                anonymousClass182.A0Z();
            }

            @Override // com.fasterxml.jackson.databind.JsonSerializer
            public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
                return AbstractC167007dF.A1N(((double[]) obj).length);
            }
        });
    }
}
