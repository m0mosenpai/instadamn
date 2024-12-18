package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.6Fh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136286Fh {
    public int A00;
    public int A01;
    public int A02;
    public C136296Fi A03;
    public static final Object A09 = "length";
    public static final Object A0B = "true";
    public static final Object A08 = "false";
    public static final Object A0C = 0;
    public static final Object A0A = 1;
    public Object[] A05 = new Object[16];
    public int[] A04 = new int[16];
    public final Random A06 = new Random();
    public final Object A07 = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (r4 > 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        if (r4 < 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r9 != 1) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A08(int r9, java.lang.String r10) {
        /*
            r8 = this;
            r7 = 0
            int r0 = r8.A01
            int r1 = r0 + (-1)
            java.lang.Object[] r0 = r8.A05
            r4 = r0[r1]
            r5 = 1
            int r1 = r1 - r5
            r2 = r0[r1]
            boolean r0 = r2 instanceof java.lang.Long
            r6 = 2
            if (r0 == 0) goto L3b
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L3b
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            java.lang.Number r4 = (java.lang.Number) r4
            long r0 = r4.longValue()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L24:
            if (r9 == 0) goto L6e
            if (r9 == r5) goto L69
        L28:
            if (r9 == r6) goto L38
            if (r4 > 0) goto L2d
        L2c:
            r7 = 1
        L2d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r8.A05(r5, r0)
            A0C(r8)
            return
        L38:
            if (r4 >= 0) goto L2d
            goto L2c
        L3b:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L4c
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L4c
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r2.compareTo(r4)
            goto L24
        L4c:
            java.lang.Number r1 = A03(r2)
            java.lang.Number r0 = A03(r4)
            if (r1 == 0) goto L71
            if (r0 == 0) goto L71
            double r2 = r1.doubleValue()
            double r0 = r0.doubleValue()
            if (r9 == 0) goto L6c
            if (r9 == r5) goto L67
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            goto L28
        L67:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L69:
            if (r4 <= 0) goto L2d
            goto L2c
        L6c:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L6e:
            if (r4 < 0) goto L2d
            goto L2c
        L71:
            java.lang.String r0 = "Incompatible operand types of "
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r10)
            A0G(r2, r4, r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136286Fh.A08(int, java.lang.String):void");
    }

    public static int A01(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (AbstractC136306Fj.A01(obj)) {
            return 4;
        }
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof List) {
            return 6;
        }
        if (obj instanceof Map) {
            return 7;
        }
        if (!(obj instanceof C1344465q)) {
            return 5;
        }
        return 8;
    }

    public static Long A02(Object obj) {
        long doubleValue;
        Long l;
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            return l;
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                doubleValue = 1;
            } else {
                doubleValue = 0;
            }
        } else if (AbstractC136306Fj.A01(obj)) {
            doubleValue = (long) ((Number) obj).doubleValue();
        } else {
            return null;
        }
        return Long.valueOf(doubleValue);
    }

    public static Number A04(Object obj) {
        int doubleValue;
        double d;
        Number number;
        if ((obj instanceof Long) && (number = (Number) obj) != null) {
            doubleValue = number.intValue();
        } else {
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    d = 1.0d;
                } else {
                    d = 0.0d;
                }
                return C6DZ.A00(d);
            }
            if (AbstractC136306Fj.A01(obj)) {
                doubleValue = (int) ((Number) obj).doubleValue();
            } else {
                return null;
            }
        }
        d = doubleValue;
        return C6DZ.A00(d);
    }

    private void A05(int i, Object obj) {
        this.A05[(this.A01 - i) - 1] = obj;
    }

    private void A06(int i, String str) {
        double doubleValue;
        int longValue;
        int i2 = this.A01 - 1;
        Object[] objArr = this.A05;
        Object obj = objArr[i2];
        Object obj2 = objArr[i2 - 1];
        Number A03 = A03(obj2);
        Number A032 = A03(obj);
        if (A03 != null && A032 != null) {
            switch (i) {
                case 0:
                    doubleValue = A03.doubleValue() * A032.doubleValue();
                    break;
                case 1:
                    longValue = (int) ((A03.longValue() & 4294967295L) * (A032.longValue() & 4294967295L));
                    doubleValue = longValue;
                    break;
                case 2:
                    doubleValue = A03.doubleValue() / A032.doubleValue();
                    break;
                case 3:
                    doubleValue = A03.doubleValue() % A032.doubleValue();
                    break;
                case 4:
                    doubleValue = A03.doubleValue() - A032.doubleValue();
                    break;
                case 5:
                    doubleValue = A03.doubleValue() + A032.doubleValue();
                    break;
                case 6:
                    longValue = ((int) A03.doubleValue()) & ((int) A032.doubleValue());
                    doubleValue = longValue;
                    break;
                case 7:
                    longValue = ((int) A03.doubleValue()) | ((int) A032.doubleValue());
                    doubleValue = longValue;
                    break;
                case 8:
                    longValue = ((int) A03.doubleValue()) ^ ((int) A032.doubleValue());
                    doubleValue = longValue;
                    break;
                case 9:
                    longValue = ((int) A03.doubleValue()) << (((int) A032.doubleValue()) & 31);
                    doubleValue = longValue;
                    break;
                case 10:
                    longValue = ((int) A03.doubleValue()) >> (((int) A032.doubleValue()) & 31);
                    doubleValue = longValue;
                    break;
                default:
                    doubleValue = (((int) A03.doubleValue()) >>> (((int) A032.doubleValue()) & 31)) & 4294967295L;
                    break;
            }
            A05(1, C6DZ.A00(doubleValue));
            A0C(this);
            return;
        }
        A0G(obj2, obj, AnonymousClass001.A0R("Incompatible operand types of ", str));
        throw C00O.createAndThrow();
    }

    private void A07(int i, String str) {
        long longValue;
        String str2;
        int i2 = this.A01 - 1;
        Object[] objArr = this.A05;
        Object obj = objArr[i2];
        Object obj2 = objArr[i2 - 1];
        Long A02 = A02(obj2);
        Long A022 = A02(obj);
        if (A02 != null && A022 != null) {
            switch (i) {
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    longValue = A02.longValue() * A022.longValue();
                    A05(1, Long.valueOf(longValue));
                    A0C(this);
                    return;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    if (A022.longValue() == 0) {
                        str2 = "INT64_DIV division by zero";
                        break;
                    } else {
                        longValue = A02.longValue() / A022.longValue();
                        A05(1, Long.valueOf(longValue));
                        A0C(this);
                        return;
                    }
                case 14:
                    if (A022.longValue() == 0) {
                        str2 = "INT64_MOD division by zero";
                        break;
                    } else {
                        longValue = A02.longValue() % A022.longValue();
                        A05(1, Long.valueOf(longValue));
                        A0C(this);
                        return;
                    }
                case Process.SIGTERM /* 15 */:
                    longValue = A02.longValue() - A022.longValue();
                    A05(1, Long.valueOf(longValue));
                    A0C(this);
                    return;
                case 16:
                    longValue = A02.longValue() + A022.longValue();
                    A05(1, Long.valueOf(longValue));
                    A0C(this);
                    return;
                case 17:
                    longValue = A02.longValue() & A022.longValue();
                    A05(1, Long.valueOf(longValue));
                    A0C(this);
                    return;
                case 18:
                    longValue = A02.longValue() | A022.longValue();
                    A05(1, Long.valueOf(longValue));
                    A0C(this);
                    return;
                case Process.SIGSTOP /* 19 */:
                    longValue = A02.longValue() ^ A022.longValue();
                    A05(1, Long.valueOf(longValue));
                    A0C(this);
                    return;
                case 20:
                    longValue = A02.longValue() << ((int) (A022.longValue() & 63));
                    A05(1, Long.valueOf(longValue));
                    A0C(this);
                    return;
                case 21:
                    longValue = A02.longValue() >> ((int) (A022.longValue() & 63));
                    A05(1, Long.valueOf(longValue));
                    A0C(this);
                    return;
                default:
                    longValue = A02.longValue() >>> ((int) (A022.longValue() & 63));
                    A05(1, Long.valueOf(longValue));
                    A0C(this);
                    return;
            }
            throw new RuntimeException(AnonymousClass001.A0R("TypeError: ", str2));
        }
        A0G(obj2, obj, AnonymousClass001.A0R("Incompatible operand types of ", str));
        throw C00O.createAndThrow();
    }

    public static void A09(C136266Fe c136266Fe, StringBuilder sb, int i) {
        C136256Fd c136256Fd = c136266Fe.A00;
        C136246Fc c136246Fc = c136256Fd.A03;
        ByteBuffer byteBuffer = c136246Fc.A01;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(byteBuffer.order());
        int i2 = c136256Fd.A02;
        duplicate.position(i2);
        duplicate.limit(c136256Fd.A00 + i2);
        if ((duplicate.get(i) & 255) == 4) {
            String str = (String) c136246Fc.A02(duplicate.getShort(i + 1) & 65535);
            sb.append("  at extension function ");
            sb.append(str);
            sb.append('\n');
        }
        sb.append("  at offset ");
        sb.append(i - c136246Fc.A03[2].A02);
        sb.append("  (offset ");
        sb.append(i - i2);
        sb.append(" in function ");
        sb.append((String) c136246Fc.A02(c136256Fd.A01));
        sb.append(')');
        sb.append(" in script \"");
        sb.append(c136246Fc.A00);
        sb.append('\"');
        sb.append("\n");
    }

    public static void A0A(C136266Fe c136266Fe, StringBuilder sb, int i, boolean z) {
        Object obj;
        SOW Agb;
        if (z) {
            sb.append("\n");
        }
        C136246Fc c136246Fc = c136266Fe.A00.A03;
        int i2 = i - c136246Fc.A03[2].A02;
        Map map = c136246Fc.A02;
        if (map == null) {
            obj = null;
        } else {
            obj = map.get(Integer.valueOf(i2));
        }
        InterfaceC102974kY Byi = c136266Fe.Byi();
        if (Byi == null) {
            Agb = null;
        } else {
            Agb = Byi.Agb();
        }
        if (Agb != null) {
            sb.append(Agb.A01);
            sb.append(":");
            if (obj == null) {
                obj = "(unsymbolicated)";
            }
            sb.append(obj);
            return;
        }
        sb.append("(unsymbolicated)");
    }

    /* JADX WARN: Code restructure failed: missing block: B:1127:0x112a, code lost:
    
        if (r2 < r1) goto L764;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1128:0x112c, code lost:
    
        r1 = r1 - 1;
        r6.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1129:0x1131, code lost:
    
        if (r2 < r1) goto L1281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1132:0x1135, code lost:
    
        if ((r6 instanceof java.util.ArrayList) == false) goto L775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1133:0x1137, code lost:
    
        ((java.util.ArrayList) r6).trimToSize();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x06e3, code lost:
    
        A0H(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0462, code lost:
    
        if (r4 != null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0464, code lost:
    
        r0 = "null";
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0466, code lost:
    
        r1 = X.AnonymousClass001.A05(r3, "Type assertion failed. Expected ", ", got ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:?, code lost:
    
        throw new java.lang.RuntimeException(X.AnonymousClass001.A0R("TypeError: ", r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x046c, code lost:
    
        r0 = r4.getClass().getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:?, code lost:
    
        throw new java.lang.RuntimeException(X.AnonymousClass001.A0R("RangeError: ", r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0672, code lost:
    
        if (r1 == null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0822, code lost:
    
        if (r1 == null) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x13f0, code lost:
    
        r1 = "Substring length out of range";
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x13f3, code lost:
    
        r1 = "Substring offset out of range";
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x13f6, code lost:
    
        r1 = "SubstringCompare length out of range";
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x13f9, code lost:
    
        r1 = "SubstringCompare offset out of range";
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x13fc, code lost:
    
        r1 = "StringSearch length out of range";
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x13ff, code lost:
    
        r1 = "StringSearch offset out of range";
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x1414, code lost:
    
        r1 = "ArrayCopy dst index out of range";
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x1417, code lost:
    
        r1 = "ArrayCopy src index out of range";
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0228, code lost:
    
        if (r0 != 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:945:?, code lost:
    
        throw new X.C6W5(X.AnonymousClass001.A0R("InvalidBytecode: ", r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:994:?, code lost:
    
        throw new java.lang.RuntimeException(X.AnonymousClass001.A0R("RangeError: ", r5));
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:324:0x0614. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x005c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1066:0x144d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:978:0x144d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v92, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v97, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v49, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v53, types: [java.util.AbstractMap, java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0B(X.C136286Fh r28) {
        /*
            Method dump skipped, instructions count: 5578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136286Fh.A0B(X.6Fh):void");
    }

    public static void A0C(C136286Fh c136286Fh) {
        int i = c136286Fh.A01 - 1;
        c136286Fh.A01 = i;
        c136286Fh.A05[i] = null;
    }

    public static void A0D(C136286Fh c136286Fh, int i) {
        Object[] objArr = c136286Fh.A05;
        int length = objArr.length;
        int i2 = c136286Fh.A01;
        if (length - i2 < i) {
            int i3 = i2 + i;
            int i4 = 536870912;
            if (i3 > 536870912) {
                throw new IllegalStateException("MinScript stack overflow");
            }
            do {
                length <<= 1;
            } while (length < i3);
            if (length <= 536870912) {
                i4 = length;
            }
            Object[] objArr2 = new Object[i4];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            c136286Fh.A05 = objArr2;
            int[] iArr = new int[i4];
            System.arraycopy(c136286Fh.A04, 0, iArr, 0, c136286Fh.A01);
            c136286Fh.A04 = iArr;
        }
    }

    public static void A0E(C136286Fh c136286Fh, Object obj) {
        Object[] objArr = c136286Fh.A05;
        int i = c136286Fh.A01;
        objArr[i] = obj;
        c136286Fh.A01 = i + 1;
    }

    public static void A0G(Object obj, Object obj2, String str) {
        String name;
        String name2;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        if (obj2 == null) {
            name2 = "null";
        } else {
            name2 = obj2.getClass().getName();
        }
        throw new RuntimeException(AnonymousClass001.A13("TypeError: ", str, ". Got ", name, " and ", name2));
    }

    public static final void A0H(String str, Object obj) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        throw new RuntimeException(AnonymousClass001.A0u("TypeError: ", str, ". Got ", name));
    }

    public static boolean A0I(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        boolean z = false;
        if (obj == null) {
            z = true;
        }
        if (!z) {
            if (obj instanceof String) {
                return !((String) obj).isEmpty();
            }
            if (AbstractC136306Fj.A01(obj)) {
                double doubleValue = ((Number) obj).doubleValue();
                if (doubleValue != 0.0d && !Double.isNaN(doubleValue)) {
                    return true;
                }
            } else if (!(obj instanceof Long) || ((Number) obj).longValue() != 0) {
                return true;
            }
        }
        return false;
    }

    public final int A0J(Object obj, String str, int i) {
        int i2;
        int i3;
        if (obj instanceof Long) {
            long longValue = ((Number) obj).longValue();
            i2 = (int) longValue;
            i3 = (i2 > longValue ? 1 : (i2 == longValue ? 0 : -1));
        } else {
            if (AbstractC136306Fj.A01(obj)) {
                double doubleValue = ((Number) obj).doubleValue();
                i2 = (int) doubleValue;
                i3 = (i2 > doubleValue ? 1 : (i2 == doubleValue ? 0 : -1));
            }
            throw new RuntimeException(AnonymousClass001.A0R("TypeError: ", str));
        }
        if (i3 == 0 && i2 >= 0 && i2 <= i) {
            return i2;
        }
        throw new RuntimeException(AnonymousClass001.A0R("TypeError: ", str));
    }

    public final Object A0K(Object obj) {
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return "true";
            }
            return "false";
        }
        if (obj instanceof Long) {
            return Long.toString(((Number) obj).longValue());
        }
        if (AbstractC136306Fj.A01(obj)) {
            double doubleValue = ((Number) obj).doubleValue();
            int i = (int) doubleValue;
            if (i == doubleValue) {
                return Integer.toString(i);
            }
            String d = Double.toString(doubleValue);
            int indexOf = d.indexOf(69);
            if (indexOf < 0) {
                return d;
            }
            int length = d.length();
            int i2 = length + 1;
            char[] cArr = new char[i2];
            d.getChars(0, indexOf, cArr, 0);
            cArr[indexOf] = 'e';
            int i3 = indexOf + 1;
            if (d.charAt(i3) == '-') {
                d.getChars(i3, length, cArr, i3);
            } else {
                cArr[i3] = '+';
                d.getChars(i3, length, cArr, indexOf + 2);
                length = i2;
            }
            return new String(cArr, 0, length);
        }
        if (obj instanceof String) {
            return obj;
        }
        A0H("Value cannot be converted to string", obj);
        throw C00O.createAndThrow();
    }

    public final void A0L(int i) {
        int i2 = this.A01 - i;
        this.A01 = i2;
        Arrays.fill(this.A05, i2, i + i2, (Object) null);
    }

    public static double A00(Object obj) {
        Number number;
        if (AbstractC136306Fj.A01(obj) && (number = (Number) obj) != null) {
            return number.doubleValue();
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return 1.0d;
            }
            return 0.0d;
        }
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        return Double.NaN;
    }

    public static Number A03(Object obj) {
        Object obj2;
        Number number;
        if (AbstractC136306Fj.A01(obj) && (number = (Number) obj) != null) {
            return number;
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                obj2 = A0A;
            } else {
                obj2 = A0C;
            }
            if (AbstractC136306Fj.A01(obj2)) {
                return (Number) obj2;
            }
            return null;
        }
        if (obj instanceof Long) {
            return C6DZ.A00(((Number) obj).longValue());
        }
        return null;
    }

    public static void A0F(C136286Fh c136286Fh, Object obj, Object obj2, int i, int i2) {
        A0E(c136286Fh, obj);
        int[] iArr = c136286Fh.A04;
        int i3 = c136286Fh.A01;
        iArr[i3] = i;
        c136286Fh.A01 = i3 + 1;
        A0E(c136286Fh, obj2);
        int i4 = c136286Fh.A01;
        iArr[i4] = i2;
        int i5 = i4 + 1;
        c136286Fh.A01 = i5;
        iArr[i5] = c136286Fh.A00;
        int i6 = i5 + 1;
        c136286Fh.A01 = i6;
        c136286Fh.A00 = i6 - 1;
    }
}
