package com.google.gson.stream;

import X.AbstractC111324zv;
import X.AbstractC47832Hr;
import X.AnonymousClass001;
import X.C177847vJ;
import X.RVZ;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class JsonWriter implements Closeable, Flushable {
    public static final String[] A0A;
    public int A00;
    public String A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public int[] A06;
    public String A07;
    public final Writer A08;
    public static final Pattern A09 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] A0B = new String[128];

    static {
        String[] strArr;
        int i = 0;
        do {
            strArr = A0B;
            strArr[i] = String.format("\\u%04x", Integer.valueOf(i));
            i++;
        } while (i <= 31);
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        A0A = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    private void A00() {
        int i;
        int i2 = this.A00;
        if (i2 != 0) {
            int[] iArr = this.A06;
            int i3 = i2 - 1;
            int i4 = iArr[i3];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 4) {
                        i = 7;
                        if (i4 != 6) {
                            if (i4 == 7) {
                                if (!this.A04) {
                                    throw new IllegalStateException("JSON must have only one top-level value.");
                                }
                            } else {
                                throw new IllegalStateException("Nesting problem.");
                            }
                        }
                    } else {
                        this.A08.append((CharSequence) this.A02);
                        i = 5;
                    }
                    this.A06[this.A00 - 1] = i;
                    return;
                }
                this.A08.append(',');
            } else {
                iArr[i3] = 2;
            }
            A01();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void A01() {
        if (this.A01 != null) {
            Writer writer = this.A08;
            writer.write(10);
            int i = this.A00;
            for (int i2 = 1; i2 < i; i2++) {
                writer.write(this.A01);
            }
        }
    }

    private void A02() {
        if (this.A07 != null) {
            int i = this.A00;
            if (i != 0) {
                int i2 = this.A06[i - 1];
                if (i2 == 5) {
                    this.A08.write(44);
                } else if (i2 != 3) {
                    throw new IllegalStateException("Nesting problem.");
                }
                A01();
                this.A06[this.A00 - 1] = 4;
                A05(this.A07);
                this.A07 = null;
                return;
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    private void A04(int i, int i2, char c) {
        int i3 = this.A00;
        if (i3 != 0) {
            int i4 = i3 - 1;
            int i5 = this.A06[i4];
            if (i5 != i2 && i5 != i) {
                throw new IllegalStateException("Nesting problem.");
            }
            String str = this.A07;
            if (str == null) {
                this.A00 = i4;
                if (i5 == i2) {
                    A01();
                }
                this.A08.write(c);
                return;
            }
            throw new IllegalStateException(AnonymousClass001.A0R("Dangling name: ", str));
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A05(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.A03
            if (r0 == 0) goto L3e
            java.lang.String[] r7 = com.google.gson.stream.JsonWriter.A0A
        L6:
            java.io.Writer r6 = r8.A08
            r5 = 34
            r6.write(r5)
            int r4 = r9.length()
            r3 = 0
            r2 = 0
        L13:
            if (r3 >= r4) goto L41
            char r1 = r9.charAt(r3)
            r0 = 128(0x80, float:1.8E-43)
            if (r1 >= r0) goto L24
            r1 = r7[r1]
            if (r1 != 0) goto L2a
        L21:
            int r3 = r3 + 1
            goto L13
        L24:
            r0 = 8232(0x2028, float:1.1535E-41)
            if (r1 != r0) goto L37
            java.lang.String r1 = "\\u2028"
        L2a:
            if (r2 >= r3) goto L31
            int r0 = r3 - r2
            r6.write(r9, r2, r0)
        L31:
            r6.write(r1)
            int r2 = r3 + 1
            goto L21
        L37:
            r0 = 8233(0x2029, float:1.1537E-41)
            if (r1 != r0) goto L21
            java.lang.String r1 = "\\u2029"
            goto L2a
        L3e:
            java.lang.String[] r7 = com.google.gson.stream.JsonWriter.A0B
            goto L6
        L41:
            if (r2 >= r4) goto L47
            int r4 = r4 - r2
            r6.write(r9, r2, r4)
        L47:
            r6.write(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonWriter.A05(java.lang.String):void");
    }

    public final void A06() {
        if (this instanceof C177847vJ) {
            C177847vJ c177847vJ = (C177847vJ) this;
            JsonArray jsonArray = new JsonArray();
            C177847vJ.A00(jsonArray, c177847vJ);
            c177847vJ.A02.add(jsonArray);
            return;
        }
        A02();
        A03(1, '[');
    }

    public final void A07() {
        if (this instanceof C177847vJ) {
            C177847vJ c177847vJ = (C177847vJ) this;
            JsonObject jsonObject = new JsonObject();
            C177847vJ.A00(jsonObject, c177847vJ);
            c177847vJ.A02.add(jsonObject);
            return;
        }
        A02();
        A03(3, '{');
    }

    public final void A08() {
        if (this instanceof C177847vJ) {
            C177847vJ c177847vJ = (C177847vJ) this;
            List list = c177847vJ.A02;
            if (!list.isEmpty() && c177847vJ.A01 == null) {
                if (list.get(list.size() - 1) instanceof JsonArray) {
                    list.remove(list.size() - 1);
                    return;
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        A04(1, 2, ']');
    }

    public final void A09() {
        if (this instanceof C177847vJ) {
            C177847vJ c177847vJ = (C177847vJ) this;
            List list = c177847vJ.A02;
            if (!list.isEmpty() && c177847vJ.A01 == null) {
                if (list.get(list.size() - 1) instanceof JsonObject) {
                    list.remove(list.size() - 1);
                    return;
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        A04(3, 5, '}');
    }

    public final void A0A() {
        if (this instanceof C177847vJ) {
            C177847vJ.A00(RVZ.A00, (C177847vJ) this);
            return;
        }
        if (this.A07 != null) {
            if (this.A05) {
                A02();
            } else {
                this.A07 = null;
                return;
            }
        }
        A00();
        this.A08.write("null");
    }

    public final void A0B(double d) {
        if (this instanceof C177847vJ) {
            C177847vJ c177847vJ = (C177847vJ) this;
            if (c177847vJ.A04 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
                C177847vJ.A00(new JsonPrimitive(Double.valueOf(d)), c177847vJ);
                return;
            }
            throw new IllegalArgumentException(AnonymousClass001.A0M(AbstractC111324zv.A00(649), d));
        }
        A02();
        if (this.A04 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            A00();
            this.A08.append((CharSequence) Double.toString(d));
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0M("Numeric values must be finite, but was ", d));
    }

    public final void A0C(long j) {
        if (this instanceof C177847vJ) {
            C177847vJ.A00(new JsonPrimitive(Long.valueOf(j)), (C177847vJ) this);
        } else {
            A02();
            A00();
            this.A08.write(Long.toString(j));
        }
    }

    public final void A0D(Boolean bool) {
        String str;
        if (this instanceof C177847vJ) {
            C177847vJ c177847vJ = (C177847vJ) this;
            if (bool == null) {
                c177847vJ.A0A();
                return;
            } else {
                C177847vJ.A00(new JsonPrimitive(bool), c177847vJ);
                return;
            }
        }
        if (bool == null) {
            A0A();
            return;
        }
        A02();
        A00();
        Writer writer = this.A08;
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
    }

    public final void A0E(Number number) {
        if (this instanceof C177847vJ) {
            C177847vJ c177847vJ = (C177847vJ) this;
            if (number == null) {
                c177847vJ.A0A();
                return;
            }
            if (!c177847vJ.A04) {
                double doubleValue = number.doubleValue();
                if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC111324zv.A00(649));
                    sb.append(number);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            C177847vJ.A00(new JsonPrimitive(number), c177847vJ);
            return;
        }
        if (number == null) {
            A0A();
            return;
        }
        A02();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !A09.matcher(obj).matches()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("String created by ");
                sb2.append(cls);
                sb2.append(" is not a valid JSON number: ");
                sb2.append(obj);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else if (!this.A04) {
            throw new IllegalArgumentException(AnonymousClass001.A0R("Numeric values must be finite, but was ", obj));
        }
        A00();
        this.A08.append((CharSequence) obj);
    }

    public final void A0F(String str) {
        if (this instanceof C177847vJ) {
            throw new UnsupportedOperationException();
        }
        if (str == null) {
            A0A();
            return;
        }
        A02();
        A00();
        this.A08.append((CharSequence) str);
    }

    public final void A0G(String str) {
        if (this instanceof C177847vJ) {
            C177847vJ c177847vJ = (C177847vJ) this;
            AbstractC47832Hr.A00(str, "name == null");
            List list = c177847vJ.A02;
            if (!list.isEmpty() && c177847vJ.A01 == null) {
                if (list.get(list.size() - 1) instanceof JsonObject) {
                    c177847vJ.A01 = str;
                    return;
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        AbstractC47832Hr.A00(str, "name == null");
        if (this.A07 == null) {
            if (this.A00 != 0) {
                this.A07 = str;
                return;
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new IllegalStateException();
    }

    public final void A0H(String str) {
        if (this instanceof C177847vJ) {
            C177847vJ c177847vJ = (C177847vJ) this;
            if (str == null) {
                c177847vJ.A0A();
                return;
            } else {
                C177847vJ.A00(new JsonPrimitive(str), c177847vJ);
                return;
            }
        }
        if (str == null) {
            A0A();
            return;
        }
        A02();
        A00();
        A05(str);
    }

    public final void A0I(boolean z) {
        String str;
        if (this instanceof C177847vJ) {
            C177847vJ.A00(new JsonPrimitive(Boolean.valueOf(z)), (C177847vJ) this);
            return;
        }
        A02();
        A00();
        Writer writer = this.A08;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this instanceof C177847vJ) {
            List list = ((C177847vJ) this).A02;
            if (list.isEmpty()) {
                list.add(C177847vJ.A03);
                return;
            }
            throw new IOException("Incomplete document");
        }
        this.A08.close();
        int i = this.A00;
        if (i <= 1 && (i != 1 || this.A06[0] == 7)) {
            this.A00 = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (!(this instanceof C177847vJ)) {
            if (this.A00 != 0) {
                this.A08.flush();
                return;
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public JsonWriter(Writer writer) {
        int[] iArr = new int[32];
        this.A06 = iArr;
        this.A00 = 0;
        this.A00 = 1;
        iArr[0] = 6;
        this.A02 = ":";
        this.A05 = true;
        AbstractC47832Hr.A00(writer, "out == null");
        this.A08 = writer;
    }

    private void A03(int i, char c) {
        A00();
        int i2 = this.A00;
        int[] iArr = this.A06;
        if (i2 == iArr.length) {
            iArr = Arrays.copyOf(iArr, i2 * 2);
            this.A06 = iArr;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr[i3] = i;
        this.A08.write(c);
    }
}
