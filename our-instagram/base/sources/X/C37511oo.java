package X;

/* renamed from: X.1oo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37511oo {
    public final void A00(InterfaceC37541or interfaceC37541or, Object[] objArr) {
        double floatValue;
        long longValue;
        int intValue;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    interfaceC37541or.ADj(i);
                } else if (obj instanceof byte[]) {
                    interfaceC37541or.ADc(i, (byte[]) obj);
                } else {
                    if (obj instanceof Float) {
                        floatValue = ((Number) obj).floatValue();
                    } else if (obj instanceof Double) {
                        floatValue = ((Number) obj).doubleValue();
                    } else {
                        if (obj instanceof Long) {
                            longValue = ((Number) obj).longValue();
                        } else {
                            if (obj instanceof Integer) {
                                intValue = ((Number) obj).intValue();
                            } else if (obj instanceof Short) {
                                intValue = ((Number) obj).shortValue();
                            } else if (obj instanceof Byte) {
                                intValue = ((Number) obj).byteValue();
                            } else if (obj instanceof String) {
                                interfaceC37541or.ADp(i, (String) obj);
                            } else if (obj instanceof Boolean) {
                                if (((Boolean) obj).booleanValue()) {
                                    longValue = 1;
                                } else {
                                    longValue = 0;
                                }
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Cannot bind ");
                                sb.append(obj);
                                sb.append(" at index ");
                                sb.append(i);
                                sb.append(" Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                                throw new IllegalArgumentException(sb.toString());
                            }
                            longValue = intValue;
                        }
                        interfaceC37541or.ADi(i, longValue);
                    }
                    interfaceC37541or.ADg(i, floatValue);
                }
            }
        }
    }
}
