package X;

import java.io.Writer;
import java.util.ArrayList;

/* renamed from: X.0C2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0C2 {
    public static C0C2 A00;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0C2, java.lang.Object] */
    public static synchronized C0C2 A00() {
        C0C2 c0c2;
        synchronized (C0C2.class) {
            C0C2 c0c22 = A00;
            c0c2 = c0c22;
            if (c0c22 == null) {
                ?? obj = new Object();
                A00 = obj;
                c0c2 = obj;
            }
        }
        return c0c2;
    }

    private void A01(C0CW c0cw, Writer writer) {
        ArrayList arrayList = c0cw.A00;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                writer.write(44);
            }
            A03(writer, arrayList.get(i), null);
        }
    }

    private void A02(C0CA c0ca, Writer writer) {
        int i = c0ca.A00;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                writer.write(44);
            }
            String A0D = c0ca.A0D(i2);
            writer.write(34);
            int length = A0D.length();
            for (int i3 = 0; i3 < length; i3++) {
                AbstractC04030Jt.A00(writer, A0D.charAt(i3));
            }
            writer.write(34);
            writer.write(58);
            A03(writer, c0ca.A0C(i2), A0D);
        }
    }

    private void A03(Writer writer, Object obj, String str) {
        String str2;
        String str3;
        int byteValue;
        if (obj == null) {
            str3 = "null";
        } else {
            if (obj instanceof String) {
                String str4 = (String) obj;
                writer.write(34);
                int length = str4.length();
                for (int i = 0; i < length; i++) {
                    AbstractC04030Jt.A00(writer, str4.charAt(i));
                }
                writer.write(34);
                return;
            }
            if (obj instanceof Number) {
                Number number = (Number) obj;
                StringBuilder sb = ((C0Jv) C0Jv.A01.get()).A00;
                sb.delete(0, sb.length());
                if (number instanceof Float) {
                    sb.append(number.floatValue());
                } else if (number instanceof Double) {
                    sb.append(number.doubleValue());
                } else {
                    if (number instanceof Integer) {
                        byteValue = number.intValue();
                    } else if (number instanceof Long) {
                        sb.append(number.longValue());
                    } else if (number instanceof Short) {
                        byteValue = number.shortValue();
                    } else if (number instanceof Byte) {
                        byteValue = number.byteValue();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Type ");
                        sb2.append(number.getClass());
                        sb2.append(" not supported");
                        throw new UnsupportedOperationException(sb2.toString());
                    }
                    sb.append(byteValue);
                }
                int length2 = sb.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    writer.write(sb.charAt(i2));
                }
                return;
            }
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    str3 = "true";
                } else {
                    str3 = "false";
                }
            } else {
                if (obj instanceof AbstractC04050Jw) {
                    AbstractC04050Jw abstractC04050Jw = (AbstractC04050Jw) obj;
                    C0C2 c0c2 = this;
                    C0C2 c0c22 = abstractC04050Jw.A02;
                    if (c0c22 != null) {
                        c0c2 = c0c22;
                    }
                    Class<?> cls = c0c2.getClass();
                    if (cls.equals(C0C2.class)) {
                        C0C2 c0c23 = this;
                        AbstractC05810Sj.A01(writer, "Writer is null!");
                        C0C2 c0c24 = abstractC04050Jw.A02;
                        if (c0c24 != null) {
                            c0c23 = c0c24;
                        }
                        c0c23.A04(abstractC04050Jw, writer);
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unsupported encoder=");
                    sb3.append(cls);
                    sb3.append(", flags=");
                    sb3.append(0);
                    sb3.append(" combination");
                    throw new IllegalStateException(sb3.toString());
                }
                if (str != null) {
                    str2 = AnonymousClass001.A0g(" (found in key '", str, "')");
                } else {
                    str2 = "";
                }
                throw new IllegalArgumentException(AnonymousClass001.A0u("The type ", obj.getClass().toString(), " is not supported", str2));
            }
        }
        writer.write(str3);
    }

    public final void A04(AbstractC04050Jw abstractC04050Jw, Writer writer) {
        int i;
        if (abstractC04050Jw instanceof C0CA) {
            writer.write(123);
            A02((C0CA) abstractC04050Jw, writer);
            i = 125;
        } else {
            writer.write(91);
            A01((C0CW) abstractC04050Jw, writer);
            i = 93;
        }
        writer.write(i);
    }

    public final void A05(AbstractC04050Jw abstractC04050Jw, Writer writer) {
        if (abstractC04050Jw instanceof C0CA) {
            A02((C0CA) abstractC04050Jw, writer);
        } else {
            A01((C0CW) abstractC04050Jw, writer);
        }
    }
}
