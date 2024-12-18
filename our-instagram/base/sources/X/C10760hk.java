package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0hk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10760hk {
    public static final byte[] A02 = new byte[100];
    public static final char[] A03 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final InterfaceC04650Mh A00;
    public final Map A01;

    public static void A01(File file, String str, String str2, Properties properties) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            properties.store(fileOutputStream, AnonymousClass001.A0R(str2, str));
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x01ef: IF  (r9 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:60:0x01f9 (LINE:495), block:B:57:0x01ef */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.io.File[]] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.String] */
    public final void A02(File file, String str, Properties properties) {
        ?? th;
        RandomAccessFile randomAccessFile;
        long filePointer;
        String str2 = str;
        try {
            if ("perf".equals(str2)) {
                try {
                    Map map = this.A01;
                    C07920bC c07920bC = (C07920bC) map.get(file.getPath());
                    if (c07920bC == null) {
                        c07920bC = this.A00.ALA(file, 4096);
                        AbstractC05810Sj.A00(c07920bC);
                        map.put(file.getPath(), c07920bC);
                    }
                    MappedByteBuffer mappedByteBuffer = c07920bC.A00;
                    mappedByteBuffer.clear();
                    for (Map.Entry entry : properties.entrySet()) {
                        String obj = entry.getKey().toString();
                        String obj2 = entry.getValue().toString();
                        mappedByteBuffer.put(A00(obj, true).getBytes("Ascii"));
                        mappedByteBuffer.put(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR.getBytes("Ascii"));
                        mappedByteBuffer.put(A00(obj2, false).getBytes("Ascii"));
                        mappedByteBuffer.put("\n".getBytes("Ascii"));
                    }
                    th = "#";
                    mappedByteBuffer.put("#".getBytes("Ascii"));
                    return;
                } catch (Throwable th2) {
                    th = 0;
                    th = 0;
                    C0PC.A00().DEh("MappedPropStore", th2, null);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    if (str == null) {
                        str2 = "";
                    }
                    try {
                        properties.store(fileOutputStream, AnonymousClass001.A0R("fallover ", str2));
                        fileOutputStream.close();
                        return;
                    } catch (Throwable th3) {
                        fileOutputStream.close();
                        throw th3;
                    }
                }
            }
            File file2 = new File(AnonymousClass001.A0R(file.getPath(), "_tmp"));
            if (str != null) {
                C04610Md A00 = C04610Md.A00(str2);
                synchronized (A00.A03) {
                    C02R.A03(A00.A02, AnonymousClass001.A0R("Did you call FixedLengthFiles.init()? - pool: ", A00.A04));
                    boolean z = false;
                    if (!A00.A02.getPath().equals(file2.getParent())) {
                        z = true;
                    }
                    C02R.A06(z, "Destination file cannot be in the pool directory");
                    th = A00.A02.listFiles();
                    try {
                        if (th != 0 && th.length > 0 && th[0].renameTo(file2)) {
                            try {
                                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                                randomAccessFile2.write("# ".getBytes("Ascii"));
                                randomAccessFile2.write(str2.getBytes("Ascii"));
                                randomAccessFile2.write("\n".getBytes("Ascii"));
                                Iterator it = properties.entrySet().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Map.Entry entry2 = (Map.Entry) it.next();
                                        String obj3 = entry2.getKey().toString();
                                        String obj4 = entry2.getValue().toString();
                                        byte[] bytes = A00(obj3, true).getBytes("Ascii");
                                        byte[] bytes2 = A00(obj4, false).getBytes("Ascii");
                                        if (randomAccessFile2.getFilePointer() + bytes.length + bytes2.length + 25 > randomAccessFile2.length()) {
                                            randomAccessFile2.write("trimmed_report=true\n#".getBytes("Ascii"));
                                            randomAccessFile2.close();
                                            A01(file2, str2, " store (too large) ", properties);
                                            break;
                                        } else {
                                            randomAccessFile2.write(bytes);
                                            randomAccessFile2.write(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR.getBytes("Ascii"));
                                            randomAccessFile2.write(bytes2);
                                            randomAccessFile2.write("\n".getBytes("Ascii"));
                                        }
                                    } else {
                                        byte[] bytes3 = "# ".getBytes("Ascii");
                                        do {
                                            randomAccessFile2.write(bytes3);
                                            filePointer = randomAccessFile2.getFilePointer();
                                            bytes3 = A02;
                                        } while (filePointer + 100 < randomAccessFile2.length());
                                        while (randomAccessFile2.getFilePointer() + 100 < randomAccessFile2.length()) {
                                            randomAccessFile2.writeByte(0);
                                        }
                                        randomAccessFile2.close();
                                    }
                                }
                                randomAccessFile2.close();
                            } catch (FileNotFoundException e) {
                                C0PC.A00().DEh("FixedLenFilesReserve", e, null);
                                C0K8.A0H("lacrima", "Cannot reserve file", e);
                            }
                        }
                        A01(file2, str2, " store (reserve)", properties);
                    } finally {
                        th = th;
                        if (randomAccessFile != null) {
                        }
                    }
                }
            } else {
                A01(file2, "", "no pool", properties);
            }
            if (!file2.renameTo(file)) {
                throw new IOException(AnonymousClass001.A0R("Could not rename file: ", file.getName()));
            }
            return;
        } catch (Throwable th4) {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th4);
        }
        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th4);
        throw th;
    }

    public C10760hk(InterfaceC04650Mh interfaceC04650Mh) {
        this.A01 = new ConcurrentHashMap();
        this.A00 = interfaceC04650Mh;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x001c, code lost:
    
        if (r2 < r4) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A00(java.lang.String r7, boolean r8) {
        /*
            int r4 = r7.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r2 = 0
            r1 = 32
            if (r8 != 0) goto L1c
            if (r4 <= 0) goto L85
            char r0 = r7.charAt(r2)
            if (r0 != r1) goto L1e
            java.lang.String r0 = "\\ "
            r3.append(r0)
            r2 = 1
        L1c:
            if (r2 >= r4) goto L85
        L1e:
            char r5 = r7.charAt(r2)
            switch(r5) {
                case 9: goto L79;
                case 10: goto L7c;
                case 11: goto L25;
                case 12: goto L7f;
                case 13: goto L76;
                default: goto L25;
            }
        L25:
            r6 = 92
            if (r8 == 0) goto L2b
            if (r5 == r1) goto L72
        L2b:
            if (r5 == r6) goto L72
            r0 = 35
            if (r5 == r0) goto L72
            r0 = 33
            if (r5 == r0) goto L72
            r0 = 58
            if (r5 == r0) goto L72
            r0 = 61
            if (r5 == r0) goto L72
            if (r5 < r1) goto L49
            r0 = 126(0x7e, float:1.77E-43)
            if (r5 > r0) goto L49
        L43:
            r3.append(r5)
        L46:
            int r2 = r2 + 1
            goto L1c
        L49:
            java.lang.String r0 = "\\u"
            r3.append(r0)
            char[] r6 = X.C10760hk.A03
            int r0 = r5 >>> 12
            r0 = r0 & 15
            char r0 = r6[r0]
            r3.append(r0)
            int r0 = r5 >>> 8
            r0 = r0 & 15
            char r0 = r6[r0]
            r3.append(r0)
            int r0 = r5 >>> 4
            r0 = r0 & 15
            char r0 = r6[r0]
            r3.append(r0)
            int r0 = r5 >>> 0
            r0 = r0 & 15
            char r5 = r6[r0]
            goto L43
        L72:
            r3.append(r6)
            goto L43
        L76:
            java.lang.String r0 = "\\r"
            goto L81
        L79:
            java.lang.String r0 = "\\t"
            goto L81
        L7c:
            java.lang.String r0 = "\\n"
            goto L81
        L7f:
            java.lang.String r0 = "\\f"
        L81:
            r3.append(r0)
            goto L46
        L85:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10760hk.A00(java.lang.String, boolean):java.lang.String");
    }

    public C10760hk() {
    }
}
