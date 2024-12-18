package X;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5MW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5MW extends JsonReader {
    public static final Reader A04 = new C61053ReS();
    public static final Object A05 = new Object();
    public int A00;
    public Object[] A01;
    public String[] A02;
    public int[] A03;

    @Override // com.google.gson.stream.JsonReader
    public final String A0H() {
        return A01(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public final String A0I() {
        return A01(true);
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A01 = new Object[]{A05};
        this.A00 = 1;
    }

    public C5MW(JsonElement jsonElement) {
        super(A04);
        this.A01 = new Object[32];
        this.A00 = 0;
        this.A02 = new String[32];
        this.A03 = new int[32];
        A03(this, jsonElement);
    }

    private Object A00() {
        Object[] objArr = this.A01;
        int i = this.A00 - 1;
        this.A00 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    private String A01(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.A00;
            if (i < i2) {
                Object[] objArr = this.A01;
                Object obj = objArr[i];
                if (obj instanceof JsonArray) {
                    i++;
                    if (i < i2 && (objArr[i] instanceof Iterator)) {
                        int i3 = this.A03[i];
                        if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                            i3--;
                        }
                        sb.append('[');
                        sb.append(i3);
                        sb.append(']');
                    }
                } else if ((obj instanceof JsonObject) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                    sb.append('.');
                    String str = this.A02[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    public static void A03(C5MW c5mw, Object obj) {
        int i = c5mw.A00;
        Object[] objArr = c5mw.A01;
        if (i == objArr.length) {
            int i2 = i * 2;
            c5mw.A01 = Arrays.copyOf(objArr, i2);
            c5mw.A03 = Arrays.copyOf(c5mw.A03, i2);
            c5mw.A02 = (String[]) Arrays.copyOf(c5mw.A02, i2);
        }
        Object[] objArr2 = c5mw.A01;
        int i3 = c5mw.A00;
        c5mw.A00 = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public final Integer A0G() {
        int i = this.A00;
        if (i == 0) {
            return C05F.A1I;
        }
        Object[] objArr = this.A01;
        Object obj = objArr[i - 1];
        if (obj instanceof Iterator) {
            boolean z = objArr[i - 2] instanceof JsonObject;
            Iterator it = (Iterator) obj;
            if (it.hasNext()) {
                if (z) {
                    return C05F.A0Y;
                }
                A03(this, it.next());
                return A0G();
            }
            if (z) {
                return C05F.A0N;
            }
            return C05F.A01;
        }
        if (obj instanceof JsonObject) {
            return C05F.A0C;
        }
        if (obj instanceof JsonArray) {
            return C05F.A00;
        }
        if (obj instanceof JsonPrimitive) {
            Object obj2 = ((JsonPrimitive) obj).value;
            if (obj2 instanceof String) {
                return C05F.A0j;
            }
            if (obj2 instanceof Boolean) {
                return C05F.A15;
            }
            if (obj2 instanceof Number) {
                return C05F.A0u;
            }
            throw new AssertionError();
        }
        if (obj instanceof RVZ) {
            return C05F.A1F;
        }
        if (obj == A05) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new IOException(AnonymousClass001.A0g("Custom JsonElement subclass ", obj.getClass().getName(), AbstractC43591JPw.A00(55)));
    }

    @Override // com.google.gson.stream.JsonReader
    public final String A0J() {
        A02(this, C05F.A0Y);
        Map.Entry entry = (Map.Entry) ((Iterator) this.A01[this.A00 - 1]).next();
        String str = (String) entry.getKey();
        this.A02[this.A00 - 1] = str;
        A03(this, entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void A0M() {
        A02(this, C05F.A00);
        A03(this, ((JsonArray) this.A01[this.A00 - 1]).iterator());
        this.A03[this.A00 - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void A0N() {
        A02(this, C05F.A0C);
        A03(this, ((JsonObject) this.A01[this.A00 - 1]).entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader
    public final void A0O() {
        A02(this, C05F.A01);
        A00();
        A00();
        int i = this.A00;
        if (i > 0) {
            int[] iArr = this.A03;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final void A0P() {
        A02(this, C05F.A0N);
        this.A02[this.A00 - 1] = null;
        A00();
        A00();
        int i = this.A00;
        if (i > 0) {
            int[] iArr = this.A03;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final void A0Q() {
        A02(this, C05F.A1F);
        A00();
        int i = this.A00;
        if (i > 0) {
            int[] iArr = this.A03;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean A0T() {
        A02(this, C05F.A15);
        boolean asBoolean = ((JsonElement) A00()).getAsBoolean();
        int i = this.A00;
        if (i > 0) {
            int[] iArr = this.A03;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asBoolean;
    }

    public static void A02(C5MW c5mw, Integer num) {
        if (c5mw.A0G() == num) {
        } else {
            throw new IllegalStateException(AnonymousClass001.A11("Expected ", SSW.A01(num), " but was ", SSW.A00(c5mw.A0G()), AnonymousClass001.A0R(" at path ", c5mw.A01(false))));
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final double A0C() {
        Integer A0G = A0G();
        if (A0G != C05F.A0u && A0G != C05F.A0j) {
            throw new IllegalStateException(AnonymousClass001.A11("Expected ", "NUMBER", " but was ", SSW.A00(A0G), AnonymousClass001.A0R(" at path ", A01(false))));
        }
        double asDouble = ((JsonElement) this.A01[this.A00 - 1]).getAsDouble();
        if (this.A07 || (!Double.isNaN(asDouble) && !Double.isInfinite(asDouble))) {
            A00();
            int i = this.A00;
            if (i > 0) {
                int[] iArr = this.A03;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return asDouble;
        }
        throw new IOException(AnonymousClass001.A0M("JSON forbids NaN and infinities: ", asDouble));
    }

    @Override // com.google.gson.stream.JsonReader
    public final int A0D() {
        Integer A0G = A0G();
        if (A0G != C05F.A0u && A0G != C05F.A0j) {
            throw new IllegalStateException(AnonymousClass001.A11("Expected ", "NUMBER", " but was ", SSW.A00(A0G), AnonymousClass001.A0R(" at path ", A01(false))));
        }
        int asInt = ((JsonElement) this.A01[this.A00 - 1]).getAsInt();
        A00();
        int i = this.A00;
        if (i > 0) {
            int[] iArr = this.A03;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asInt;
    }

    @Override // com.google.gson.stream.JsonReader
    public final long A0F() {
        Integer A0G = A0G();
        if (A0G != C05F.A0u && A0G != C05F.A0j) {
            throw new IllegalStateException(AnonymousClass001.A11("Expected ", "NUMBER", " but was ", SSW.A00(A0G), AnonymousClass001.A0R(" at path ", A01(false))));
        }
        long asLong = ((JsonElement) this.A01[this.A00 - 1]).getAsLong();
        A00();
        int i = this.A00;
        if (i > 0) {
            int[] iArr = this.A03;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asLong;
    }

    @Override // com.google.gson.stream.JsonReader
    public final String A0K() {
        Integer A0G = A0G();
        if (A0G != C05F.A0j && A0G != C05F.A0u) {
            throw new IllegalStateException(AnonymousClass001.A11("Expected ", "STRING", " but was ", SSW.A00(A0G), AnonymousClass001.A0R(" at path ", A01(false))));
        }
        String asString = ((JsonElement) A00()).getAsString();
        int i = this.A00;
        if (i > 0) {
            int[] iArr = this.A03;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asString;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void A0R() {
        int intValue = A0G().intValue();
        if (intValue != 4) {
            if (intValue != 1) {
                if (intValue != 3) {
                    if (intValue != 9) {
                        A00();
                        int i = this.A00;
                        if (i > 0) {
                            int[] iArr = this.A03;
                            int i2 = i - 1;
                            iArr[i2] = iArr[i2] + 1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                A0P();
                return;
            }
            A0O();
            return;
        }
        A02(this, C05F.A0Y);
        Map.Entry entry = (Map.Entry) ((Iterator) this.A01[this.A00 - 1]).next();
        entry.getKey();
        this.A02[this.A00 - 1] = "<skipped>";
        A03(this, entry.getValue());
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean A0S() {
        Integer A0G = A0G();
        if (A0G != C05F.A0N && A0G != C05F.A01 && A0G != C05F.A1I) {
            return true;
        }
        return false;
    }

    @Override // com.google.gson.stream.JsonReader
    public final String toString() {
        return AnonymousClass001.A0R(getClass().getSimpleName(), AnonymousClass001.A0R(" at path ", A01(false)));
    }
}
