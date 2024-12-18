package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: X.SXg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62924SXg {
    public final String A00;

    public static final C62924SXg A00(File file) {
        String str;
        Charset charset;
        InterfaceC60722pw interfaceC60722pw;
        ArrayDeque arrayDeque;
        FileInputStream fileInputStream;
        long size;
        try {
            File A0w = MSW.A0w(file, "mobilelab_test_info");
            if (A0w.exists() && A0w.canRead()) {
                try {
                    charset = AbstractC50482Ts.A05;
                    charset.getClass();
                    interfaceC60722pw = AbstractC60692pt.A00;
                    arrayDeque = new ArrayDeque(4);
                    try {
                        fileInputStream = new FileInputStream(A0w);
                        arrayDeque.addFirst(fileInputStream);
                        size = fileInputStream.getChannel().size();
                        C18C.A05(size, "expectedSize (%s) must be non-negative", MSY.A1R((size > 0L ? 1 : (size == 0L ? 0 : -1))));
                    } catch (Throwable th) {
                        try {
                            Object obj = AbstractC63327Shb.A00;
                            if (!IOException.class.isInstance(th)) {
                                if (!(th instanceof RuntimeException) && !(th instanceof Error)) {
                                    throw AbstractC58318PtA.A0f(th);
                                }
                                throw th;
                            }
                            throw ((Throwable) IOException.class.cast(th));
                        } catch (Throwable th2) {
                            AbstractC60692pt.A00(interfaceC60722pw, th, arrayDeque);
                            throw th2;
                        }
                    }
                } catch (IOException e) {
                    C0K8.A0G("MobileLabTestInfo", "Failed to read mobile lab test info.", e);
                    str = "{}";
                }
                if (size <= 2147483639) {
                    int i = (int) size;
                    byte[] bArr = new byte[i];
                    int i2 = i;
                    while (true) {
                        if (i2 > 0) {
                            int i3 = i - i2;
                            int read = fileInputStream.read(bArr, i3, i2);
                            if (read == -1) {
                                bArr = Arrays.copyOf(bArr, i3);
                                break;
                            }
                            i2 -= read;
                        } else {
                            int read2 = fileInputStream.read();
                            if (read2 != -1) {
                                ArrayDeque arrayDeque2 = new ArrayDeque(22);
                                arrayDeque2.add(bArr);
                                arrayDeque2.add(new byte[]{(byte) read2});
                                bArr = AbstractC37701p7.A01(fileInputStream, arrayDeque2, i + 1);
                            }
                        }
                    }
                    AbstractC60692pt.A00(interfaceC60722pw, null, arrayDeque);
                    str = AbstractC58318PtA.A0m(charset, bArr);
                    return new C62924SXg(str);
                }
                throw new OutOfMemoryError(AnonymousClass001.A0A(size, " bytes is too large to fit in a byte array"));
            }
            C0K8.A0P("MobileLabTestInfo", "File %s does not exist or can not be read", A0w.getPath());
            return new C62924SXg(null);
        } catch (SecurityException e2) {
            C0K8.A0G("MobileLabTestInfo", "Failed to check file existance.", e2);
            return new C62924SXg(null);
        }
    }

    public final String A01() {
        return this.A00;
    }

    public C62924SXg(String str) {
        this.A00 = str;
    }
}
