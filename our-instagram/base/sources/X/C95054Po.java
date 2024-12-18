package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4Po, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95054Po {
    public static final Map A04 = new HashMap();
    public final byte A00;
    public final String A01;
    public final Map A02;
    public final short A03;

    public C95054Po(String str, byte b, short s) {
        Map map = A04;
        this.A01 = str;
        this.A00 = b;
        this.A03 = s;
        this.A02 = map;
    }

    public final String toString() {
        return String.format("<TField name:'%s' type:%d field-id:%d metadata='%s'>", this.A01, Byte.valueOf(this.A00), Short.valueOf(this.A03), this.A02);
    }

    public C95054Po() {
        this("", (byte) 0, (short) 0);
    }
}
