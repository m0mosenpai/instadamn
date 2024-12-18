package X;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferOverflowException;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0OD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0OD {
    public static final Map A01 = new HashMap();
    public static final List A00 = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.0Mq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static synchronized C0Mq A00(File file) {
        C07920bC c07920bC;
        ?? r2;
        synchronized (C0OD.class) {
            Map map = A01;
            if (map.get(file.getName()) != null) {
                return (C0Mq) map.get(file.getName());
            }
            C0Mq c0Mq = C04770Mv.A03;
            File file2 = new File(file, "mapped_map.txt");
            try {
                c07920bC = new C07920bC(file2, 4096);
                c07920bC.mlockBuffer();
            } catch (IOException e) {
                C0K8.A0H("lacrima", "Failed to initialize mlocked file, using fallback", e);
                C0PC.A00().DEh("InitMLockedFile", e, null);
                file2.delete();
                try {
                    c07920bC = new C07920bC(file2, 4096);
                } catch (IOException e2) {
                    C0K8.A0H("lacrima", "Failed to initialize mapped file", e2);
                    C0PC.A00().DEh("InitSimpleMappedFile", e2, null);
                    Object obj = new Object();
                    C0K8.A0P("lacrima", "Cannot create mapped file: %s", file2.getName());
                    C0PC.A00().DEh("CreateGlobalProperties ", null, null);
                    r2 = obj;
                }
            }
            final C04800My c04800My = new C04800My(c07920bC);
            r2 = new C0Mq(c04800My) { // from class: X.0SB
                public final C04800My A00;
                public final Map A02 = new ConcurrentHashMap();
                public final Map A01 = new ConcurrentHashMap();

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v14, types: [X.0Mw, java.io.InputStream] */
                @Override // X.C0Mq
                public final HashMap A00() {
                    HashMap hashMap;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.putAll(this.A02);
                    C04800My c04800My2 = this.A00;
                    synchronized (c04800My2.A02) {
                        Properties properties = new Properties();
                        try {
                            MappedByteBuffer mappedByteBuffer = c04800My2.A01.A00;
                            mappedByteBuffer.position(0);
                            ?? inputStream = new InputStream();
                            inputStream.A00 = mappedByteBuffer;
                            properties.load((InputStream) inputStream);
                        } catch (IOException e3) {
                            C0PC.A00().DEh("MappedMapParseAll", e3, null);
                            C0K8.A0I("lacrima", "Cannot parse mmapped values", e3);
                        }
                        HashMap hashMap3 = new HashMap();
                        for (EnumC04790Mx enumC04790Mx : EnumC04790Mx.values()) {
                            hashMap3.put(enumC04790Mx.A01, enumC04790Mx.name());
                        }
                        hashMap = new HashMap();
                        for (Map.Entry entry : properties.entrySet()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("");
                            sb.append(hashMap3.get(entry.getKey()));
                            String obj2 = sb.toString();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("");
                            sb2.append(entry.getValue());
                            hashMap.put(obj2, sb2.toString());
                        }
                    }
                    hashMap2.putAll(hashMap);
                    return hashMap2;
                }

                @Override // X.C0Mq
                public final void A01(C0LE c0le, C0M6 c0m6) {
                    String A0g = AnonymousClass001.A0g(c0m6.A00, "cadm_", c0le.A00);
                    C04800My c04800My2 = this.A00;
                    if (c04800My2.A01(A0g)) {
                        EnumC04790Mx valueOf = EnumC04790Mx.valueOf(A0g);
                        synchronized (c04800My2.A02) {
                            Integer num = (Integer) c04800My2.A04.get(valueOf.A01);
                            if (num != null) {
                                MappedByteBuffer mappedByteBuffer = c04800My2.A01.A00;
                                mappedByteBuffer.position(num.intValue());
                                mappedByteBuffer.put("#\n".getBytes(C04800My.A06));
                            }
                        }
                        return;
                    }
                    this.A02.remove(A0g);
                    this.A01.remove(A0g);
                }

                @Override // X.C0Mq
                public final void A02(C0LE c0le, C0M6 c0m6, String str) {
                    MappedByteBuffer mappedByteBuffer;
                    int i;
                    Map map2;
                    String str2;
                    String str3;
                    String str4;
                    Object[] objArr;
                    String A0g = AnonymousClass001.A0g(c0m6.A00, "cadm_", c0le.A00);
                    C04800My c04800My2 = this.A00;
                    if (c04800My2.A01(A0g)) {
                        EnumC04790Mx valueOf = EnumC04790Mx.valueOf(A0g);
                        synchronized (c04800My2.A02) {
                            try {
                                mappedByteBuffer = c04800My2.A01.A00;
                                i = valueOf.A00;
                                map2 = c04800My2.A04;
                                str2 = valueOf.A01;
                            } catch (BufferOverflowException e3) {
                                C0PC.A00().DEh("MappedMapPut", e3, null);
                                C0K8.A0M("lacrima", "Cannot save mmapped value: %s", e3, valueOf);
                            }
                            if (map2.get(str2) == null) {
                                int length = str2.length();
                                int length2 = str.length();
                                int i2 = length + length2 + 4;
                                int i3 = c04800My2.A00;
                                if (i2 > 4096 - i3) {
                                    str3 = "lacrima";
                                    str4 = "Cannot save mmapped value: %s";
                                    objArr = new Object[]{valueOf};
                                } else {
                                    map2.put(str2, Integer.valueOf(i3));
                                    c04800My2.A03.put(str2, Integer.valueOf(i));
                                    if (length2 > i) {
                                        str = str.substring(0, i);
                                    }
                                    C04800My.A00(valueOf, str, mappedByteBuffer, c04800My2.A00);
                                    c04800My2.A00 = mappedByteBuffer.position();
                                    mappedByteBuffer.put("#".getBytes(C04800My.A06));
                                }
                            } else {
                                Integer num = (Integer) map2.get(str2);
                                AbstractC05810Sj.A00(num);
                                int intValue = num.intValue();
                                Integer num2 = (Integer) c04800My2.A03.get(str2);
                                AbstractC05810Sj.A00(num2);
                                int intValue2 = num2.intValue();
                                if (str.length() > intValue2) {
                                    str = str.substring(0, intValue2);
                                }
                                if (str2.length() + str.length() + 4 > 4096 - intValue) {
                                    str3 = "lacrima";
                                    str4 = "Cannot save mmapped value: %s";
                                    objArr = new Object[]{valueOf};
                                } else {
                                    C04800My.A00(valueOf, str, mappedByteBuffer, intValue);
                                }
                            }
                            C0K8.A0P(str3, str4, objArr);
                        }
                        return;
                    }
                    this.A02.put(A0g, str);
                }

                {
                    this.A00 = c04800My;
                }
            };
            map.put(file.getName(), r2);
            return r2;
        }
    }
}
